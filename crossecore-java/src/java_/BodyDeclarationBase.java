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
		
			if (eContainerFeatureID() != Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION) return null;
			return (AbstractTypeDeclaration)eInternalContainer();
		
		
	}
	public void setAbstractTypeDeclaration(AbstractTypeDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, AbstractTypeDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, AbstractTypeDeclaration.class, msgs);
			}
			msgs = basicSetAbstractTypeDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION , value, value));
		}
	}
	private Ocllib.OrderedSet<Annotation> _annotations;
	
	public Ocllib.OrderedSet<Annotation> getAnnotations()
	{
		if(_annotations==null){
			_annotations = new Ocllib.OrderedSet<Annotation>(Annotation.class, this, Java_PackageImpl.BODYDECLARATION_ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.BODYDECLARATION_ANNOTATIONS);
		}
		return _annotations;
	
	}
	public AnonymousClassDeclaration getAnonymousClassDeclarationOwner()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER) return null;
			return (AnonymousClassDeclaration)eInternalContainer();
		
		
	}
	public void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, AnonymousClassDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, AnonymousClassDeclaration.class, msgs);
			}
			msgs = basicSetAnonymousClassDeclarationOwner(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER , value, value));
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
				msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER_BODYDECLARATION, Modifier.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER_BODYDECLARATION, Modifier.class, msgs);
			}
			msgs = basicSetModifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_MODIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.BODYDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetAbstractTypeDeclaration((AbstractTypeDeclaration)otherEnd, msgs);
			case Java_PackageImpl.BODYDECLARATION_MODIFIER:
				if (_modifier != null){
					msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.BODYDECLARATION_MODIFIER, Modifier.class, msgs);
				}
				return basicSetModifier((Modifier)otherEnd, msgs);
			case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetAnonymousClassDeclarationOwner((AnonymousClassDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
				return basicSetAbstractTypeDeclaration(null, msgs);
			case Java_PackageImpl.BODYDECLARATION_MODIFIER:
				return basicSetModifier(null, msgs);
			case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
				return basicSetAnonymousClassDeclarationOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetAbstractTypeDeclaration(AbstractTypeDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION, msgs);
			return msgs;
	}
	public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
		Modifier oldobj = _modifier;
		_modifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.BODYDECLARATION_MODIFIER, oldobj, newobj);
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
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
				return getAbstractTypeDeclaration();
			case Java_PackageImpl.BODYDECLARATION_ANNOTATIONS:
				return getAnnotations();
			case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
				return getAnonymousClassDeclarationOwner();
			case Java_PackageImpl.BODYDECLARATION_MODIFIER:
				return getModifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration) newValue);
				return;
			case Java_PackageImpl.BODYDECLARATION_ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((java.util.Collection<? extends Annotation>) newValue);
				return;
			case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration) newValue);
				return;
			case Java_PackageImpl.BODYDECLARATION_MODIFIER:
				setModifier((Modifier) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
				return getAbstractTypeDeclaration() != null; //single, volatile
			case Java_PackageImpl.BODYDECLARATION_ANNOTATIONS:
				return _annotations != null && !_annotations.isEmpty();
			case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
				return getAnonymousClassDeclarationOwner() != null; //single, volatile
			case Java_PackageImpl.BODYDECLARATION_MODIFIER:
				return _modifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
