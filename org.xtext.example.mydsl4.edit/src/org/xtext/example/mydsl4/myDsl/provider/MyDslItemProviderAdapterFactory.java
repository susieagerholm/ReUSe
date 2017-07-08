/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.xtext.example.mydsl4.myDsl.util.MyDslAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslItemProviderAdapterFactory extends MyDslAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Robot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotItemProvider robotItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotAdapter() {
		if (robotItemProvider == null) {
			robotItemProvider = new RobotItemProvider(this);
		}

		return robotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.ReUseAble} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReUseAbleItemProvider reUseAbleItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.ReUseAble}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReUseAbleAdapter() {
		if (reUseAbleItemProvider == null) {
			reUseAbleItemProvider = new ReUseAbleItemProvider(this);
		}

		return reUseAbleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Reuse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseItemProvider reuseItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Reuse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReuseAdapter() {
		if (reuseItemProvider == null) {
			reuseItemProvider = new ReuseItemProvider(this);
		}

		return reuseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Ref} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefItemProvider refItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Ref}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefAdapter() {
		if (refItemProvider == null) {
			refItemProvider = new RefItemProvider(this);
		}

		return refItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.ReUsableRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReUsableRefItemProvider reUsableRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.ReUsableRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReUsableRefAdapter() {
		if (reUsableRefItemProvider == null) {
			reUsableRefItemProvider = new ReUsableRefItemProvider(this);
		}

		return reUsableRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URDFAttrSignedNumericItemProvider urdfAttrSignedNumericItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURDFAttrSignedNumericAdapter() {
		if (urdfAttrSignedNumericItemProvider == null) {
			urdfAttrSignedNumericItemProvider = new URDFAttrSignedNumericItemProvider(this);
		}

		return urdfAttrSignedNumericItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.URDFAttrFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URDFAttrFloatItemProvider urdfAttrFloatItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.URDFAttrFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURDFAttrFloatAdapter() {
		if (urdfAttrFloatItemProvider == null) {
			urdfAttrFloatItemProvider = new URDFAttrFloatItemProvider(this);
		}

		return urdfAttrFloatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.URDFAttrINT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URDFAttrINTItemProvider urdfAttrINTItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.URDFAttrINT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURDFAttrINTAdapter() {
		if (urdfAttrINTItemProvider == null) {
			urdfAttrINTItemProvider = new URDFAttrINTItemProvider(this);
		}

		return urdfAttrINTItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.URDFAttrNumeric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URDFAttrNumericItemProvider urdfAttrNumericItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.URDFAttrNumeric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURDFAttrNumericAdapter() {
		if (urdfAttrNumericItemProvider == null) {
			urdfAttrNumericItemProvider = new URDFAttrNumericItemProvider(this);
		}

		return urdfAttrNumericItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.URDFAttrSTRING} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URDFAttrSTRINGItemProvider urdfAttrSTRINGItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.URDFAttrSTRING}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURDFAttrSTRINGAdapter() {
		if (urdfAttrSTRINGItemProvider == null) {
			urdfAttrSTRINGItemProvider = new URDFAttrSTRINGItemProvider(this);
		}

		return urdfAttrSTRINGItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.DotExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotExpressionItemProvider dotExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.DotExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDotExpressionAdapter() {
		if (dotExpressionItemProvider == null) {
			dotExpressionItemProvider = new DotExpressionItemProvider(this);
		}

		return dotExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Inertial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertialItemProvider inertialItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Inertial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInertialAdapter() {
		if (inertialItemProvider == null) {
			inertialItemProvider = new InertialItemProvider(this);
		}

		return inertialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Visual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualItemProvider visualItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Visual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualAdapter() {
		if (visualItemProvider == null) {
			visualItemProvider = new VisualItemProvider(this);
		}

		return visualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Inertia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertiaItemProvider inertiaItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Inertia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInertiaAdapter() {
		if (inertiaItemProvider == null) {
			inertiaItemProvider = new InertiaItemProvider(this);
		}

		return inertiaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Mass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassItemProvider massItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Mass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMassAdapter() {
		if (massItemProvider == null) {
			massItemProvider = new MassItemProvider(this);
		}

		return massItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Origin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginItemProvider originItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOriginAdapter() {
		if (originItemProvider == null) {
			originItemProvider = new OriginItemProvider(this);
		}

		return originItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Collision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionItemProvider collisionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Collision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollisionAdapter() {
		if (collisionItemProvider == null) {
			collisionItemProvider = new CollisionItemProvider(this);
		}

		return collisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Geometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryItemProvider geometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Geometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeometryAdapter() {
		if (geometryItemProvider == null) {
			geometryItemProvider = new GeometryItemProvider(this);
		}

		return geometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Box} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxItemProvider boxItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Box}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoxAdapter() {
		if (boxItemProvider == null) {
			boxItemProvider = new BoxItemProvider(this);
		}

		return boxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Cylinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylinderItemProvider cylinderItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Cylinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCylinderAdapter() {
		if (cylinderItemProvider == null) {
			cylinderItemProvider = new CylinderItemProvider(this);
		}

		return cylinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Mesh} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshItemProvider meshItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Mesh}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeshAdapter() {
		if (meshItemProvider == null) {
			meshItemProvider = new MeshItemProvider(this);
		}

		return meshItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Sphere} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphereItemProvider sphereItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Sphere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSphereAdapter() {
		if (sphereItemProvider == null) {
			sphereItemProvider = new SphereItemProvider(this);
		}

		return sphereItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Material} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialItemProvider materialItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaterialAdapter() {
		if (materialItemProvider == null) {
			materialItemProvider = new MaterialItemProvider(this);
		}

		return materialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Texture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureItemProvider textureItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Texture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextureAdapter() {
		if (textureItemProvider == null) {
			textureItemProvider = new TextureItemProvider(this);
		}

		return textureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Color} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorItemProvider colorItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorAdapter() {
		if (colorItemProvider == null) {
			colorItemProvider = new ColorItemProvider(this);
		}

		return colorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Joint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointItemProvider jointItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJointAdapter() {
		if (jointItemProvider == null) {
			jointItemProvider = new JointItemProvider(this);
		}

		return jointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Axis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisItemProvider axisItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAxisAdapter() {
		if (axisItemProvider == null) {
			axisItemProvider = new AxisItemProvider(this);
		}

		return axisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Limit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitItemProvider limitItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Limit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLimitAdapter() {
		if (limitItemProvider == null) {
			limitItemProvider = new LimitItemProvider(this);
		}

		return limitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Calibration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibrationItemProvider calibrationItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Calibration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalibrationAdapter() {
		if (calibrationItemProvider == null) {
			calibrationItemProvider = new CalibrationItemProvider(this);
		}

		return calibrationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Dynamics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsItemProvider dynamicsItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Dynamics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicsAdapter() {
		if (dynamicsItemProvider == null) {
			dynamicsItemProvider = new DynamicsItemProvider(this);
		}

		return dynamicsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.SafetyController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyControllerItemProvider safetyControllerItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.SafetyController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyControllerAdapter() {
		if (safetyControllerItemProvider == null) {
			safetyControllerItemProvider = new SafetyControllerItemProvider(this);
		}

		return safetyControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.Topology} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyItemProvider topologyItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.Topology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopologyAdapter() {
		if (topologyItemProvider == null) {
			topologyItemProvider = new TopologyItemProvider(this);
		}

		return topologyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.JointRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointRefItemProvider jointRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.JointRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJointRefAdapter() {
		if (jointRefItemProvider == null) {
			jointRefItemProvider = new JointRefItemProvider(this);
		}

		return jointRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.mydsl4.myDsl.AssignNewValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignNewValueItemProvider assignNewValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.mydsl4.myDsl.AssignNewValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignNewValueAdapter() {
		if (assignNewValueItemProvider == null) {
			assignNewValueItemProvider = new AssignNewValueItemProvider(this);
		}

		return assignNewValueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (robotItemProvider != null) robotItemProvider.dispose();
		if (reUseAbleItemProvider != null) reUseAbleItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (reuseItemProvider != null) reuseItemProvider.dispose();
		if (refItemProvider != null) refItemProvider.dispose();
		if (reUsableRefItemProvider != null) reUsableRefItemProvider.dispose();
		if (urdfAttrSignedNumericItemProvider != null) urdfAttrSignedNumericItemProvider.dispose();
		if (urdfAttrFloatItemProvider != null) urdfAttrFloatItemProvider.dispose();
		if (urdfAttrINTItemProvider != null) urdfAttrINTItemProvider.dispose();
		if (urdfAttrNumericItemProvider != null) urdfAttrNumericItemProvider.dispose();
		if (urdfAttrSTRINGItemProvider != null) urdfAttrSTRINGItemProvider.dispose();
		if (dotExpressionItemProvider != null) dotExpressionItemProvider.dispose();
		if (inertialItemProvider != null) inertialItemProvider.dispose();
		if (visualItemProvider != null) visualItemProvider.dispose();
		if (inertiaItemProvider != null) inertiaItemProvider.dispose();
		if (massItemProvider != null) massItemProvider.dispose();
		if (originItemProvider != null) originItemProvider.dispose();
		if (collisionItemProvider != null) collisionItemProvider.dispose();
		if (geometryItemProvider != null) geometryItemProvider.dispose();
		if (boxItemProvider != null) boxItemProvider.dispose();
		if (cylinderItemProvider != null) cylinderItemProvider.dispose();
		if (meshItemProvider != null) meshItemProvider.dispose();
		if (sphereItemProvider != null) sphereItemProvider.dispose();
		if (materialItemProvider != null) materialItemProvider.dispose();
		if (textureItemProvider != null) textureItemProvider.dispose();
		if (colorItemProvider != null) colorItemProvider.dispose();
		if (jointItemProvider != null) jointItemProvider.dispose();
		if (axisItemProvider != null) axisItemProvider.dispose();
		if (limitItemProvider != null) limitItemProvider.dispose();
		if (calibrationItemProvider != null) calibrationItemProvider.dispose();
		if (dynamicsItemProvider != null) dynamicsItemProvider.dispose();
		if (safetyControllerItemProvider != null) safetyControllerItemProvider.dispose();
		if (topologyItemProvider != null) topologyItemProvider.dispose();
		if (jointRefItemProvider != null) jointRefItemProvider.dispose();
		if (assignNewValueItemProvider != null) assignNewValueItemProvider.dispose();
	}

}