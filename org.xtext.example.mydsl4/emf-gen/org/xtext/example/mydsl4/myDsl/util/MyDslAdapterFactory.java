/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl4.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyDslSwitch<Adapter> modelSwitch =
		new MyDslSwitch<Adapter>() {
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseReUseAble(ReUseAble object) {
				return createReUseAbleAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseReuse(Reuse object) {
				return createReuseAdapter();
			}
			@Override
			public Adapter caseRef(Ref object) {
				return createRefAdapter();
			}
			@Override
			public Adapter caseReUsableRef(ReUsableRef object) {
				return createReUsableRefAdapter();
			}
			@Override
			public Adapter caseURDFAttrSignedNumeric(URDFAttrSignedNumeric object) {
				return createURDFAttrSignedNumericAdapter();
			}
			@Override
			public Adapter caseURDFAttrFloat(URDFAttrFloat object) {
				return createURDFAttrFloatAdapter();
			}
			@Override
			public Adapter caseURDFAttrINT(URDFAttrINT object) {
				return createURDFAttrINTAdapter();
			}
			@Override
			public Adapter caseURDFAttrNumeric(URDFAttrNumeric object) {
				return createURDFAttrNumericAdapter();
			}
			@Override
			public Adapter caseURDFAttrSTRING(URDFAttrSTRING object) {
				return createURDFAttrSTRINGAdapter();
			}
			@Override
			public Adapter caseDotExpression(DotExpression object) {
				return createDotExpressionAdapter();
			}
			@Override
			public Adapter caseInertial(Inertial object) {
				return createInertialAdapter();
			}
			@Override
			public Adapter caseVisual(Visual object) {
				return createVisualAdapter();
			}
			@Override
			public Adapter caseInertia(Inertia object) {
				return createInertiaAdapter();
			}
			@Override
			public Adapter caseMass(Mass object) {
				return createMassAdapter();
			}
			@Override
			public Adapter caseOrigin(Origin object) {
				return createOriginAdapter();
			}
			@Override
			public Adapter caseCollision(Collision object) {
				return createCollisionAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseMesh(Mesh object) {
				return createMeshAdapter();
			}
			@Override
			public Adapter caseSphere(Sphere object) {
				return createSphereAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object) {
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseTexture(Texture object) {
				return createTextureAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter caseJoint(Joint object) {
				return createJointAdapter();
			}
			@Override
			public Adapter caseAxis(Axis object) {
				return createAxisAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseCalibration(Calibration object) {
				return createCalibrationAdapter();
			}
			@Override
			public Adapter caseDynamics(Dynamics object) {
				return createDynamicsAdapter();
			}
			@Override
			public Adapter caseSafetyController(SafetyController object) {
				return createSafetyControllerAdapter();
			}
			@Override
			public Adapter caseTopology(Topology object) {
				return createTopologyAdapter();
			}
			@Override
			public Adapter caseJointRef(JointRef object) {
				return createJointRefAdapter();
			}
			@Override
			public Adapter caseAssignNewValue(AssignNewValue object) {
				return createAssignNewValueAdapter();
			}
			@Override
			public Adapter caseAddTo(AddTo object) {
				return createAddToAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.ReUseAble <em>Re Use Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.ReUseAble
	 * @generated
	 */
	public Adapter createReUseAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Reuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Reuse
	 * @generated
	 */
	public Adapter createReuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Ref
	 * @generated
	 */
	public Adapter createRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.ReUsableRef <em>Re Usable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.ReUsableRef
	 * @generated
	 */
	public Adapter createReUsableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric <em>URDF Attr Signed Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric
	 * @generated
	 */
	public Adapter createURDFAttrSignedNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.URDFAttrFloat <em>URDF Attr Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.URDFAttrFloat
	 * @generated
	 */
	public Adapter createURDFAttrFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.URDFAttrINT <em>URDF Attr INT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.URDFAttrINT
	 * @generated
	 */
	public Adapter createURDFAttrINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.URDFAttrNumeric <em>URDF Attr Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.URDFAttrNumeric
	 * @generated
	 */
	public Adapter createURDFAttrNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.URDFAttrSTRING <em>URDF Attr STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.URDFAttrSTRING
	 * @generated
	 */
	public Adapter createURDFAttrSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.DotExpression <em>Dot Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.DotExpression
	 * @generated
	 */
	public Adapter createDotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Inertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Inertial
	 * @generated
	 */
	public Adapter createInertialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Visual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Visual
	 * @generated
	 */
	public Adapter createVisualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Inertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Inertia
	 * @generated
	 */
	public Adapter createInertiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Mass
	 * @generated
	 */
	public Adapter createMassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Origin
	 * @generated
	 */
	public Adapter createOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Collision
	 * @generated
	 */
	public Adapter createCollisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Sphere
	 * @generated
	 */
	public Adapter createSphereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Texture
	 * @generated
	 */
	public Adapter createTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Joint
	 * @generated
	 */
	public Adapter createJointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Axis
	 * @generated
	 */
	public Adapter createAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Calibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Calibration
	 * @generated
	 */
	public Adapter createCalibrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Dynamics
	 * @generated
	 */
	public Adapter createDynamicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.SafetyController <em>Safety Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.SafetyController
	 * @generated
	 */
	public Adapter createSafetyControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.Topology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.Topology
	 * @generated
	 */
	public Adapter createTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.JointRef <em>Joint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.JointRef
	 * @generated
	 */
	public Adapter createJointRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.AssignNewValue <em>Assign New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.AssignNewValue
	 * @generated
	 */
	public Adapter createAssignNewValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl4.myDsl.AddTo <em>Add To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.example.mydsl4.myDsl.AddTo
	 * @generated
	 */
	public Adapter createAddToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyDslAdapterFactory
