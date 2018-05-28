package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class VariableDeclarationStatementBase 
extends StatementImpl implements VariableDeclarationStatement
{
	private int _extraArrayDimensions = 0;
	public int getExtraArrayDimensions()
	{
		return _extraArrayDimensions;
	}
	public void setExtraArrayDimensions(int value){
		
		int oldValue = _extraArrayDimensions;
		_extraArrayDimensions = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS, oldValue, value));
		
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
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE , value, value));
		}
	}
	private Ocllib.OrderedSet<VariableDeclarationFragment> _fragments;
	
	public Ocllib.OrderedSet<VariableDeclarationFragment> getFragments()
	{
		if(_fragments==null){
			_fragments = new Ocllib.OrderedSet<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER);
		}
		return _fragments;
	
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
				msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT, VariableDeclarationStatement.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT, VariableDeclarationStatement.class, msgs);
			}
			msgs = basicSetModifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER , value, value));
		}
	}
	private Ocllib.OrderedSet<Annotation> _annotations;
	
	public Ocllib.OrderedSet<Annotation> getAnnotations()
	{
		if(_annotations==null){
			_annotations = new Ocllib.OrderedSet<Annotation>(Annotation.class, this, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS);
		}
		return _annotations;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.VARIABLEDECLARATIONSTATEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_FRAGMENTS:
				return getFragments().basicAdd((VariableDeclarationFragment)otherEnd, msgs);
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER:
				if (_modifier != null){
					msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER, Modifier.class, msgs);
				}
				return basicSetModifier((Modifier)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_FRAGMENTS:
				return getFragments().basicRemove((VariableDeclarationFragment)otherEnd, msgs);
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER:
				return basicSetModifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
		Modifier oldobj = _modifier;
		_modifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS:
				return getExtraArrayDimensions();
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER:
				return getModifier();
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS:
				return getAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS:
				setExtraArrayDimensions((int) newValue);
				return;
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER:
				setModifier((Modifier) newValue);
				return;
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((java.util.Collection<? extends Annotation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
