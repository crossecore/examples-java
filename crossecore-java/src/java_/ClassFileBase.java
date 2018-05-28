package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ClassFileBase 
extends NamedElementImpl implements ClassFile
{
	private java.lang.String _originalFilePath = "";
	public java.lang.String getOriginalFilePath()
	{
		return _originalFilePath;
	}
	public void setOriginalFilePath(java.lang.String value){
		
		java.lang.String oldValue = _originalFilePath;
		_originalFilePath = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH, oldValue, value));
		
	}
	
	private AbstractTypeDeclaration _type;
	public AbstractTypeDeclaration getType()
	{
		
			return _type;
		
		
	}
	public void setType(AbstractTypeDeclaration value){
		AbstractTypeDeclaration oldvalue = _type;
		_type = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_TYPE , oldvalue, value));
		}
	}
	private CompilationUnit _attachedSource;
	public CompilationUnit getAttachedSource()
	{
		
			return _attachedSource;
		
		
	}
	public void setAttachedSource(CompilationUnit value){
		CompilationUnit oldvalue = _attachedSource;
		_attachedSource = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE , oldvalue, value));
		}
	}
	private Package _package;
	public Package getPackage()
	{
		
			return _package;
		
		
	}
	public void setPackage(Package value){
		Package oldvalue = _package;
		_package = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_PACKAGE , oldvalue, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CLASSFILE;
	}
	
	
	public NotificationChain basicSetType(AbstractTypeDeclaration newobj, NotificationChain msgs) {
		AbstractTypeDeclaration oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_TYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
		Package oldobj = _package;
		_package = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_PACKAGE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetAttachedSource(CompilationUnit newobj, NotificationChain msgs) {
		CompilationUnit oldobj = _attachedSource;
		_attachedSource = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE, oldobj, newobj);
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
			case Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH:
				return getOriginalFilePath();
			case Java_PackageImpl.CLASSFILE_TYPE:
				return getType();
			case Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE:
				return getAttachedSource();
			case Java_PackageImpl.CLASSFILE_PACKAGE:
				return getPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH:
				setOriginalFilePath((java.lang.String) newValue);
				return;
			case Java_PackageImpl.CLASSFILE_TYPE:
				setType((AbstractTypeDeclaration) newValue);
				return;
			case Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE:
				setAttachedSource((CompilationUnit) newValue);
				return;
			case Java_PackageImpl.CLASSFILE_PACKAGE:
				setPackage((Package) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
