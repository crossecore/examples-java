package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class JavadocBase 
extends CommentImpl implements Javadoc
{
	private Ocllib.OrderedSet<TagElement> _tags;
	
	public Ocllib.OrderedSet<TagElement> getTags()
	{
		if(_tags==null){
			_tags = new Ocllib.OrderedSet<TagElement>(TagElement.class, this, Java_PackageImpl.JAVADOC_TAGS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.JAVADOC_TAGS);
		}
		return _tags;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.JAVADOC;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.JAVADOC_TAGS:
				return getTags();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.JAVADOC_TAGS:
				getTags().clear();
				getTags().addAll((java.util.Collection<? extends TagElement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
