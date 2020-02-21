package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ModifierBase 
extends ASTNodeImpl implements Modifier
{
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.NONE;
	private VisibilityKind _visibility = VISIBILITY_EDEFAULT;
	public VisibilityKind getVisibility()
	{
		return _visibility;
	}
	public void setVisibility(VisibilityKind value){
		
		VisibilityKind oldValue = _visibility;
		_visibility = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__VISIBILITY, oldValue, value));
		
	}
	
	
	
	protected static final InheritanceKind INHERITANCE_EDEFAULT = InheritanceKind.NONE;
	private InheritanceKind _inheritance = INHERITANCE_EDEFAULT;
	public InheritanceKind getInheritance()
	{
		return _inheritance;
	}
	public void setInheritance(InheritanceKind value){
		
		InheritanceKind oldValue = _inheritance;
		_inheritance = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__INHERITANCE, oldValue, value));
		
	}
	
	
	
	protected static final boolean STATIC_EDEFAULT = false;
	private boolean _static = STATIC_EDEFAULT;
	public boolean isStatic()
	{
		return _static;
	}
	public void setStatic(boolean value){
		
		boolean oldValue = _static;
		_static = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__STATIC, oldValue, value));
		
	}
	
	
	
	protected static final boolean TRANSIENT_EDEFAULT = false;
	private boolean _transient = TRANSIENT_EDEFAULT;
	public boolean isTransient()
	{
		return _transient;
	}
	public void setTransient(boolean value){
		
		boolean oldValue = _transient;
		_transient = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__TRANSIENT, oldValue, value));
		
	}
	
	
	
	protected static final boolean VOLATILE_EDEFAULT = false;
	private boolean _volatile = VOLATILE_EDEFAULT;
	public boolean isVolatile()
	{
		return _volatile;
	}
	public void setVolatile(boolean value){
		
		boolean oldValue = _volatile;
		_volatile = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__VOLATILE, oldValue, value));
		
	}
	
	
	
	protected static final boolean NATIVE_EDEFAULT = false;
	private boolean _native = NATIVE_EDEFAULT;
	public boolean isNative()
	{
		return _native;
	}
	public void setNative(boolean value){
		
		boolean oldValue = _native;
		_native = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__NATIVE, oldValue, value));
		
	}
	
	
	
	protected static final boolean STRICTFP_EDEFAULT = false;
	private boolean _strictfp = STRICTFP_EDEFAULT;
	public boolean isStrictfp()
	{
		return _strictfp;
	}
	public void setStrictfp(boolean value){
		
		boolean oldValue = _strictfp;
		_strictfp = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__STRICTFP, oldValue, value));
		
	}
	
	
	
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;
	private boolean _synchronized = SYNCHRONIZED_EDEFAULT;
	public boolean isSynchronized()
	{
		return _synchronized;
	}
	public void setSynchronized(boolean value){
		
		boolean oldValue = _synchronized;
		_synchronized = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODIFIER__SYNCHRONIZED, oldValue, value));
		
	}
	
	
	
	public BodyDeclaration getBodyDeclaration()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.MODIFIER__BODY_DECLARATION) return null;
			return (BodyDeclaration)eInternalContainer();
		
		
	}
	public void setBodyDeclaration(BodyDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.BODY_DECLARATION__MODIFIER, BodyDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.BODY_DECLARATION__MODIFIER, BodyDeclaration.class, msgs);
			}
			msgs = basicSetBodyDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER__BODY_DECLARATION , value, value));
		}
	}
	public SingleVariableDeclaration getSingleVariableDeclaration()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION) return null;
			return (SingleVariableDeclaration)eInternalContainer();
		
		
	}
	public void setSingleVariableDeclaration(SingleVariableDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER, SingleVariableDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER, SingleVariableDeclaration.class, msgs);
			}
			msgs = basicSetSingleVariableDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION , value, value));
		}
	}
	public VariableDeclarationStatement getVariableDeclarationStatement()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT) return null;
			return (VariableDeclarationStatement)eInternalContainer();
		
		
	}
	public void setVariableDeclarationStatement(VariableDeclarationStatement value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.VARIABLE_DECLARATION_STATEMENT__MODIFIER, VariableDeclarationStatement.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLE_DECLARATION_STATEMENT__MODIFIER, VariableDeclarationStatement.class, msgs);
			}
			msgs = basicSetVariableDeclarationStatement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT , value, value));
		}
	}
	public VariableDeclarationExpression getVariableDeclarationExpression()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION) return null;
			return (VariableDeclarationExpression)eInternalContainer();
		
		
	}
	public void setVariableDeclarationExpression(VariableDeclarationExpression value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, VariableDeclarationExpression.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, VariableDeclarationExpression.class, msgs);
			}
			msgs = basicSetVariableDeclarationExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MODIFIER;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.MODIFIER__BODY_DECLARATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetBodyDeclaration((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetVariableDeclarationExpression((VariableDeclarationExpression)otherEnd, msgs);
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetVariableDeclarationStatement((VariableDeclarationStatement)otherEnd, msgs);
			case Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetSingleVariableDeclaration((SingleVariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.MODIFIER__BODY_DECLARATION:
				return basicSetBodyDeclaration(null, msgs);
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return basicSetVariableDeclarationExpression(null, msgs);
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return basicSetVariableDeclarationStatement(null, msgs);
			case Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return basicSetSingleVariableDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetBodyDeclaration(BodyDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER__BODY_DECLARATION, msgs);
			return msgs;
	}
	public NotificationChain basicSetVariableDeclarationExpression(VariableDeclarationExpression newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, msgs);
			return msgs;
	}
	public NotificationChain basicSetVariableDeclarationStatement(VariableDeclarationStatement newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT, msgs);
			return msgs;
	}
	public NotificationChain basicSetSingleVariableDeclaration(SingleVariableDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MODIFIER__VISIBILITY:
				return getVisibility();
			case Java_PackageImpl.MODIFIER__INHERITANCE:
				return getInheritance();
			case Java_PackageImpl.MODIFIER__STATIC:
				return isStatic();
			case Java_PackageImpl.MODIFIER__TRANSIENT:
				return isTransient();
			case Java_PackageImpl.MODIFIER__VOLATILE:
				return isVolatile();
			case Java_PackageImpl.MODIFIER__NATIVE:
				return isNative();
			case Java_PackageImpl.MODIFIER__STRICTFP:
				return isStrictfp();
			case Java_PackageImpl.MODIFIER__SYNCHRONIZED:
				return isSynchronized();
			case Java_PackageImpl.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration();
			case Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration();
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MODIFIER__VISIBILITY:
				setVisibility((VisibilityKind) newValue);
				return;
			case Java_PackageImpl.MODIFIER__INHERITANCE:
				setInheritance((InheritanceKind) newValue);
				return;
			case Java_PackageImpl.MODIFIER__STATIC:
				setStatic((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__TRANSIENT:
				setTransient((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__VOLATILE:
				setVolatile((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__NATIVE:
				setNative((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__STRICTFP:
				setStrictfp((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__SYNCHRONIZED:
				setSynchronized((boolean) newValue);
				return;
			case Java_PackageImpl.MODIFIER__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration) newValue);
				return;
			case Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration) newValue);
				return;
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement) newValue);
				return;
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MODIFIER__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? _visibility != null : !VISIBILITY_EDEFAULT.equals(_visibility);
			case Java_PackageImpl.MODIFIER__INHERITANCE:
				return INHERITANCE_EDEFAULT == null ? _inheritance != null : !INHERITANCE_EDEFAULT.equals(_inheritance);
			case Java_PackageImpl.MODIFIER__STATIC:
				return _static != STATIC_EDEFAULT;
			case Java_PackageImpl.MODIFIER__TRANSIENT:
				return _transient != TRANSIENT_EDEFAULT;
			case Java_PackageImpl.MODIFIER__VOLATILE:
				return _volatile != VOLATILE_EDEFAULT;
			case Java_PackageImpl.MODIFIER__NATIVE:
				return _native != NATIVE_EDEFAULT;
			case Java_PackageImpl.MODIFIER__STRICTFP:
				return _strictfp != STRICTFP_EDEFAULT;
			case Java_PackageImpl.MODIFIER__SYNCHRONIZED:
				return _synchronized != SYNCHRONIZED_EDEFAULT;
			case Java_PackageImpl.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration() != null; //single, volatile
			case Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration() != null; //single, volatile
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement() != null; //single, volatile
			case Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
