/**
 */
package bpmn.provider;

import bpmn.util.BpmnAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnItemProviderAdapterFactory extends BpmnAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public BpmnItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Process} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.SubProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessItemProvider subProcessItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.SubProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubProcessAdapter() {
		if (subProcessItemProvider == null) {
			subProcessItemProvider = new SubProcessItemProvider(this);
		}

		return subProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Artifacts} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactsItemProvider artifactsItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Artifacts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactsAdapter() {
		if (artifactsItemProvider == null) {
			artifactsItemProvider = new ArtifactsItemProvider(this);
		}

		return artifactsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Pool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolItemProvider poolItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoolAdapter() {
		if (poolItemProvider == null) {
			poolItemProvider = new PoolItemProvider(this);
		}

		return poolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Parallel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelItemProvider parallelItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Parallel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelAdapter() {
		if (parallelItemProvider == null) {
			parallelItemProvider = new ParallelItemProvider(this);
		}

		return parallelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.OR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.OR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createORAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new ORItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.XOR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XORItemProvider xorItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.XOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXORAdapter() {
		if (xorItemProvider == null) {
			xorItemProvider = new XORItemProvider(this);
		}

		return xorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.DataObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectItemProvider dataObjectItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.DataObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataObjectAdapter() {
		if (dataObjectItemProvider == null) {
			dataObjectItemProvider = new DataObjectItemProvider(this);
		}

		return dataObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.TextAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationItemProvider textAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.TextAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAnnotationAdapter() {
		if (textAnnotationItemProvider == null) {
			textAnnotationItemProvider = new TextAnnotationItemProvider(this);
		}

		return textAnnotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Join} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinItemProvider joinItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinAdapter() {
		if (joinItemProvider == null) {
			joinItemProvider = new JoinItemProvider(this);
		}

		return joinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Split} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitItemProvider splitItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Split}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitAdapter() {
		if (splitItemProvider == null) {
			splitItemProvider = new SplitItemProvider(this);
		}

		return splitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.SequenceFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowItemProvider sequenceFlowItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.SequenceFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceFlowAdapter() {
		if (sequenceFlowItemProvider == null) {
			sequenceFlowItemProvider = new SequenceFlowItemProvider(this);
		}

		return sequenceFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.MessageFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowItemProvider messageFlowItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageFlowAdapter() {
		if (messageFlowItemProvider == null) {
			messageFlowItemProvider = new MessageFlowItemProvider(this);
		}

		return messageFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.DataAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssociationItemProvider dataAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.DataAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAssociationAdapter() {
		if (dataAssociationItemProvider == null) {
			dataAssociationItemProvider = new DataAssociationItemProvider(this);
		}

		return dataAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.DataStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreItemProvider dataStoreItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.DataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataStoreAdapter() {
		if (dataStoreItemProvider == null) {
			dataStoreItemProvider = new DataStoreItemProvider(this);
		}

		return dataStoreItemProvider;
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
		if (processItemProvider != null) processItemProvider.dispose();
		if (subProcessItemProvider != null) subProcessItemProvider.dispose();
		if (artifactsItemProvider != null) artifactsItemProvider.dispose();
		if (poolItemProvider != null) poolItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (parallelItemProvider != null) parallelItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (xorItemProvider != null) xorItemProvider.dispose();
		if (dataObjectItemProvider != null) dataObjectItemProvider.dispose();
		if (textAnnotationItemProvider != null) textAnnotationItemProvider.dispose();
		if (joinItemProvider != null) joinItemProvider.dispose();
		if (splitItemProvider != null) splitItemProvider.dispose();
		if (sequenceFlowItemProvider != null) sequenceFlowItemProvider.dispose();
		if (messageFlowItemProvider != null) messageFlowItemProvider.dispose();
		if (dataAssociationItemProvider != null) dataAssociationItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (dataStoreItemProvider != null) dataStoreItemProvider.dispose();
	}

}