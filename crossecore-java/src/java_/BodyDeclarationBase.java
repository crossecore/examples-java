package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class BodyDeclarationBase 
extends NamedElementImpl implements BodyDeclaration
{
	public AbstractTypeDeclaration getAbstractTypeDeclaration()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION) return null;
			return (AbstractTypeDeclaration)eInternalContainer();
		
		
	}
	public void setAbstractTypeDeclaration(AbstractTypeDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			}
			msgs = basicSetAbstractTypeDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Annotation> _annotations;
	
	public com.crossecore.ocl.OrderedSet<Annotation> getAnnotations()
	{
		if(_annotations==null){
			_annotations = new com.crossecore.ocl.OrderedSet<Annotation>(Annotation.class, this, Java_PackageImpl.BODY_DECLARATION__ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.BODY_DECLARATION__ANNOTATIONS);
		}
		return _annotations;
	
	}
	public AnonymousClassDeclaration getAnonymousClassDeclarationOwner()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER) return null;
			return (AnonymousClassDeclaration)eInternalContainer();
		
		
	}
	public void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
			}
			msgs = basicSetAnonymousClassDeclarationOwner(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER , value, value));
		}
	}
	private Modifier _modifier;
	public Modifier getModifier()
	{
		
			return _modifier;
		
		
	}
	public void setModifier(Modifier value){
		if (value != _modifier) {
			NotificationChain msgs = null;
			if (_modifier != null){
				msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER__BODY_DECLARATION, Modifier.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER__BODY_DECLARATION, Modifier.class, msgs);
			}
			msgs = basicSetModifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODY_DECLARATION__MODIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.BODYDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.BODY_DECLARATION__MODIFIER:
				if (_modifier != null){
					msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.BODY_DECLARATION__MODIFIER, Modifier.class, msgs);
				}
				return basicSetModifier((Modifier)otherEnd, msgs);
			case Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetAnonymousClassDeclarationOwner((AnonymousClassDeclaration)otherEnd, msgs);
			case Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetAbstractTypeDeclaration((AbstractTypeDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.BODY_DECLARATION__MODIFIER:
				return basicSetModifier(null, msgs);
			case Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return basicSetAnonymousClassDeclarationOwner(null, msgs);
			case Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return basicSetAbstractTypeDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
		Modifier oldobj = _modifier;
		_modifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.BODY_DECLARATION__MODIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetAnonymousClassDeclarationOwner(AnonymousClassDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, msgs);
			return msgs;
	}
	public NotificationChain basicSetAbstractTypeDeclaration(AbstractTypeDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration();
			case Java_PackageImpl.BODY_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner();
			case Java_PackageImpl.BODY_DECLARATION__MODIFIER:
				return getModifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration) newValue);
				return;
			case Java_PackageImpl.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((java.util.Collection<? extends Annotation>) newValue);
				return;
			case Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration) newValue);
				return;
			case Java_PackageImpl.BODY_DECLARATION__MODIFIER:
				setModifier((Modifier) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration() != null; //single, volatile
			case Java_PackageImpl.BODY_DECLARATION__ANNOTATIONS:
				return _annotations != null && !_annotations.isEmpty();
			case Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner() != null; //single, volatile
			case Java_PackageImpl.BODY_DECLARATION__MODIFIER:
				return _modifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
