package org.xtext.example.mydsl4;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric;

public class MyQNP extends DefaultDeclarativeQualifiedNameProvider {
	
	public String qualifiedName(URDFAttrSignedNumeric a) {
		return a.eContainingFeature().getName();
	}
}
