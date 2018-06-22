package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TagElementBase 
extends ASTNodeImpl implements TagElement
{
	protected static final java.lang.String TAGNAME_EDEFAULT = "";
	private java.lang.String _tagName = TAGNAME_EDEFAULT;
	public java.lang.String getTagName()
	{
		return _tagName;
	}
	public void setTagName(java.lang.String value){
		
		java.lang.String oldValue = _tagName;
		_tagName = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.TAGELEMENT_TAGNAME, oldValue, value));
		
	}
	
	
	
	private Ocllib.OrderedSet<ASTNode> _fragments;
	
	public Ocllib.OrderedSet<ASTNode> getFragments()
	{
		if(_fragments==null){
			_fragments = new Ocllib.OrderedSet<ASTNode>(ASTNode.class, this, Java_PackageImpl.TAGELEMENT_FRAGMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TAGELEMENT_FRAGMENTS);
		}
		return _fragments;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TAGELEMENT;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TAGELEMENT_TAGNAME:
				return getTagName();
			case Java_PackageImpl.TAGELEMENT_FRAGMENTS:
				return getFragments();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TAGELEMENT_TAGNAME:
				setTagName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.TAGELEMENT_FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((java.util.Collection<? extends ASTNode>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TAGELEMENT_TAGNAME:
				return TAGNAME_EDEFAULT == null ? _tagName != null : !TAGNAME_EDEFAULT.equals(_tagName);
			case Java_PackageImpl.TAGELEMENT_FRAGMENTS:
				return _fragments != null && !_fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
