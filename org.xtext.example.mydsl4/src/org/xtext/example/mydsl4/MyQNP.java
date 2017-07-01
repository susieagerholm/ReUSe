package org.xtext.example.mydsl4;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric;

public class MyQNP extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(URDFAttrSignedNumeric a) {
		//return a.eContainmentFeature().getName();
		return QualifiedName.create(a.eContainmentFeature().getName());
	}
}
