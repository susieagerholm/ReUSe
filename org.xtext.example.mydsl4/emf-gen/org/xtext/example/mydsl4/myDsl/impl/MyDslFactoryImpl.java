/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl4.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyDslFactory init() {
		try {
			MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
			if (theMyDslFactory != null) {
				return theMyDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyDslPackage.ROBOT: return createRobot();
			case MyDslPackage.RE_USE_ABLE: return createReUseAble();
			case MyDslPackage.LINK: return createLink();
			case MyDslPackage.REUSE: return createReuse();
			case MyDslPackage.REF: return createRef();
			case MyDslPackage.RE_USABLE_REF: return createReUsableRef();
			case MyDslPackage.URDF_ATTR_SIGNED_NUMERIC: return createURDFAttrSignedNumeric();
			case MyDslPackage.URDF_ATTR_FLOAT: return createURDFAttrFloat();
			case MyDslPackage.URDF_ATTR_INT: return createURDFAttrINT();
			case MyDslPackage.URDF_ATTR_NUMERIC: return createURDFAttrNumeric();
			case MyDslPackage.URDF_ATTR_STRING: return createURDFAttrSTRING();
			case MyDslPackage.DOT_EXPRESSION: return createDotExpression();
			case MyDslPackage.INERTIAL: return createInertial();
			case MyDslPackage.VISUAL: return createVisual();
			case MyDslPackage.INERTIA: return createInertia();
			case MyDslPackage.MASS: return createMass();
			case MyDslPackage.ORIGIN: return createOrigin();
			case MyDslPackage.COLLISION: return createCollision();
			case MyDslPackage.GEOMETRY: return createGeometry();
			case MyDslPackage.BOX: return createBox();
			case MyDslPackage.CYLINDER: return createCylinder();
			case MyDslPackage.MESH: return createMesh();
			case MyDslPackage.SPHERE: return createSphere();
			case MyDslPackage.MATERIAL: return createMaterial();
			case MyDslPackage.TEXTURE: return createTexture();
			case MyDslPackage.COLOR: return createColor();
			case MyDslPackage.JOINT: return createJoint();
			case MyDslPackage.AXIS: return createAxis();
			case MyDslPackage.LIMIT: return createLimit();
			case MyDslPackage.CALIBRATION: return createCalibration();
			case MyDslPackage.DYNAMICS: return createDynamics();
			case MyDslPackage.SAFETY_CONTROLLER: return createSafetyController();
			case MyDslPackage.TOPOLOGY: return createTopology();
			case MyDslPackage.JOINT_REF: return createJointRef();
			case MyDslPackage.ASSIGN_NEW_VALUE: return createAssignNewValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyDslPackage.JOINT_TYPE:
				return createJointTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyDslPackage.JOINT_TYPE:
				return convertJointTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReUseAble createReUseAble() {
		ReUseAbleImpl reUseAble = new ReUseAbleImpl();
		return reUseAble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reuse createReuse() {
		ReuseImpl reuse = new ReuseImpl();
		return reuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ref createRef() {
		RefImpl ref = new RefImpl();
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReUsableRef createReUsableRef() {
		ReUsableRefImpl reUsableRef = new ReUsableRefImpl();
		return reUsableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric createURDFAttrSignedNumeric() {
		URDFAttrSignedNumericImpl urdfAttrSignedNumeric = new URDFAttrSignedNumericImpl();
		return urdfAttrSignedNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrFloat createURDFAttrFloat() {
		URDFAttrFloatImpl urdfAttrFloat = new URDFAttrFloatImpl();
		return urdfAttrFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrINT createURDFAttrINT() {
		URDFAttrINTImpl urdfAttrINT = new URDFAttrINTImpl();
		return urdfAttrINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrNumeric createURDFAttrNumeric() {
		URDFAttrNumericImpl urdfAttrNumeric = new URDFAttrNumericImpl();
		return urdfAttrNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSTRING createURDFAttrSTRING() {
		URDFAttrSTRINGImpl urdfAttrSTRING = new URDFAttrSTRINGImpl();
		return urdfAttrSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotExpression createDotExpression() {
		DotExpressionImpl dotExpression = new DotExpressionImpl();
		return dotExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial createInertial() {
		InertialImpl inertial = new InertialImpl();
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual createVisual() {
		VisualImpl visual = new VisualImpl();
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertia createInertia() {
		InertiaImpl inertia = new InertiaImpl();
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mass createMass() {
		MassImpl mass = new MassImpl();
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin createOrigin() {
		OriginImpl origin = new OriginImpl();
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision createCollision() {
		CollisionImpl collision = new CollisionImpl();
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder() {
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere() {
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture createTexture() {
		TextureImpl texture = new TextureImpl();
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJoint() {
		JointImpl joint = new JointImpl();
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calibration createCalibration() {
		CalibrationImpl calibration = new CalibrationImpl();
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics createDynamics() {
		DynamicsImpl dynamics = new DynamicsImpl();
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyController createSafetyController() {
		SafetyControllerImpl safetyController = new SafetyControllerImpl();
		return safetyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topology createTopology() {
		TopologyImpl topology = new TopologyImpl();
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointRef createJointRef() {
		JointRefImpl jointRef = new JointRefImpl();
		return jointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignNewValue createAssignNewValue() {
		AssignNewValueImpl assignNewValue = new AssignNewValueImpl();
		return assignNewValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointType createJointTypeFromString(EDataType eDataType, String initialValue) {
		JointType result = JointType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslPackage getMyDslPackage() {
		return (MyDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyDslPackage getPackage() {
		return MyDslPackage.eINSTANCE;
	}

} //MyDslFactoryImpl
