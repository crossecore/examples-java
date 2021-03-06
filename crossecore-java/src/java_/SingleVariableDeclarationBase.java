package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SingleVariableDeclarationBase 
extends VariableDeclarationImpl implements SingleVariableDeclaration
{
	protected static final boolean VARARGS_EDEFAULT = false;
	private boolean _varargs = VARARGS_EDEFAULT;
	public boolean isVarargs()
	{
		return _varargs;
	}
	public void setVarargs(boolean value){
		
		boolean oldValue = _varargs;
		_varargs = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__VARARGS, oldValue, value));
		
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
				msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION, Modifier.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER__SINGLE_VARIABLE_DECLARATION, Modifier.class, msgs);
			}
			msgs = basicSetModifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER , value, value));
		}
	}
	private TypeAccess _type;
	public TypeAccess getType()
	{
		
			return _type;
		
		
	}
	public void setType(TypeAccess value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Annotation> _annotations;
	
	public com.crossecore.ocl.OrderedSet<Annotation> getAnnotations()
	{
		if(_annotations==null){
			_annotations = new com.crossecore.ocl.OrderedSet<Annotation>(Annotation.class, this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS);
		}
		return _annotations;
	
	}
	public AbstractMethodDeclaration getMethodDeclaration()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION) return null;
			return (AbstractMethodDeclaration)eInternalContainer();
		
		
	}
	public void setMethodDeclaration(AbstractMethodDeclaration value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS, AbstractMethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS, AbstractMethodDeclaration.class, msgs);
			}
			msgs = basicSetMethodDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION , value, value));
		}
	}
	public CatchClause getCatchClause()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE) return null;
			return (CatchClause)eInternalContainer();
		
		
	}
	public void setCatchClause(CatchClause value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.CATCH_CLAUSE__EXCEPTION, CatchClause.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.CATCH_CLAUSE__EXCEPTION, CatchClause.class, msgs);
			}
			msgs = basicSetCatchClause(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE , value, value));
		}
	}
	public EnhancedForStatement getEnhancedForStatement()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT) return null;
			return (EnhancedForStatement)eInternalContainer();
		
		
	}
	public void setEnhancedForStatement(EnhancedForStatement value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ENHANCED_FOR_STATEMENT__PARAMETER, EnhancedForStatement.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ENHANCED_FOR_STATEMENT__PARAMETER, EnhancedForStatement.class, msgs);
			}
			msgs = basicSetEnhancedForStatement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SINGLEVARIABLEDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				if (_modifier != null){
					msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER, Modifier.class, msgs);
				}
				return basicSetModifier((Modifier)otherEnd, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetCatchClause((CatchClause)otherEnd, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetMethodDeclaration((AbstractMethodDeclaration)otherEnd, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEnhancedForStatement((EnhancedForStatement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return basicSetModifier(null, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return basicSetCatchClause(null, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return basicSetMethodDeclaration(null, msgs);
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return basicSetEnhancedForStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
		Modifier oldobj = _modifier;
		_modifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetCatchClause(CatchClause newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, msgs);
			return msgs;
	}
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetMethodDeclaration(AbstractMethodDeclaration newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION, msgs);
			return msgs;
	}
	public NotificationChain basicSetEnhancedForStatement(EnhancedForStatement newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return isVarargs();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return getModifier();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return getMethodDeclaration();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return getCatchClause();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs((boolean) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				setModifier((Modifier) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((java.util.Collection<? extends Annotation>) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				setMethodDeclaration((AbstractMethodDeclaration) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				setCatchClause((CatchClause) newValue);
				return;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				setEnhancedForStatement((EnhancedForStatement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return _varargs != VARARGS_EDEFAULT;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return _modifier != null; //single != null;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				return _annotations != null && !_annotations.isEmpty();
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return getMethodDeclaration() != null; //single, volatile
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return getCatchClause() != null; //single, volatile
			case Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
