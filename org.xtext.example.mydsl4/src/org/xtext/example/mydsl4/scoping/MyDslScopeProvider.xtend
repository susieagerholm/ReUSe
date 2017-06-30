/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.scoping

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl4.myDsl.DotExpression
import org.xtext.example.mydsl4.myDsl.Link
import org.xtext.example.mydsl4.myDsl.ReUsableRef
import org.xtext.example.mydsl4.myDsl.ReUseAble
import org.xtext.example.mydsl4.myDsl.Reuse
import org.xtext.example.mydsl4.myDsl.Robot

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractMyDslScopeProvider {
	override IScope getScope(EObject context, EReference reference) {
		//SOMEHOW THIS LINK SCOPING RULE IS NOT USED - EXIST VIA SUPER.GETSCOPE?? 
		if (context instanceof Link) {
			val robot = EcoreUtil2.getContainerOfType(context, Robot)
			return Scopes.scopeFor(robot.links.
				//EXCLUDE CURRENT LINK
				filter[x | !x.name.equals(context.name)].
				//REMEMBER ALSO TO EXCLUDE LINKS MADE FROM REUSE
				filter[y | y.reuse == null]
			)
		}
		
		if (context instanceof Reuse) {		
			//RETURN SCOPE FOR EDIT	
			val curr_link = EcoreUtil2.getContainerOfType(context, Link)
			var BasicEList<Link> list = new BasicEList<Link>()
			list.add(curr_link.link)
			return Scopes.scopeFor(list)
			//RETURN SCOPE FOR ADD??
	    }
	    
 		else if (context instanceof DotExpression) {
			val head = context.ref
			//SEEMS TO BE WORKING...
		 	switch (head) {
            	ReUsableRef : {
            		val ggg = head.reuseable.eContents
            		Scopes::scopeFor(head.reuseable.eContents) 
            	}	
            	DotExpression : {
                	val tail = head.tail
                	switch (tail) {
                    	ReUseAble : Scopes::scopeFor(tail.eContents) 
                    	default: IScope::NULLSCOPE
                	}
            	}
            	 
        	}   
        	
		}
		else
		//DELEGATE TO DEFAULT IMPL....
		super.getScope(context, reference)

	}
	
	//USING EGET TO GET RUNTIME VALUE OF REFERENCES??...
	def static EList<EObject> getAllMyEReferencesAsEObjects(EObject curr_object) {
		var myrefs = new BasicEList<EObject>()
		for(EReference ref : curr_object.eClass().getEAllReferences()) {
			//var mytype = ref.EReferenceType
			if(ref.containment) {
				if(ref.many) myrefs += (curr_object.eGet(ref) as EList<EObject>)
				else myrefs.add(curr_object.eGet(ref) as EObject)
			}
			
		}
		myrefs
	}
	
}
