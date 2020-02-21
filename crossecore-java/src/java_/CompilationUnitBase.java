package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CompilationUnitBase 
extends NamedElementImpl implements CompilationUnit
{
	protected static final java.lang.String ORIGINALFILEPATH_EDEFAULT = "";
	private java.lang.String _originalFilePath = ORIGINALFILEPATH_EDEFAULT;
	public java.lang.String getOriginalFilePath()
	{
		return _originalFilePath;
	}
	public void setOriginalFilePath(java.lang.String value){
		
		java.lang.String oldValue = _originalFilePath;
		_originalFilePath = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.COMPILATION_UNIT__ORIGINAL_FILE_PATH, oldValue, value));
		
	}
	
	
	
	private com.crossecore.ocl.OrderedSet<Comment> _commentList;
	
	public com.crossecore.ocl.OrderedSet<Comment> getCommentList()
	{
		if(_commentList==null){
			_commentList = new com.crossecore.ocl.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.COMPILATION_UNIT__COMMENT_LIST, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATION_UNIT__COMMENT_LIST);
		}
		return _commentList;
	
	}
	private com.crossecore.ocl.OrderedSet<ImportDeclaration> _imports;
	
	public com.crossecore.ocl.OrderedSet<ImportDeclaration> getImports()
	{
		if(_imports==null){
			_imports = new com.crossecore.ocl.OrderedSet<ImportDeclaration>(ImportDeclaration.class, this, Java_PackageImpl.COMPILATION_UNIT__IMPORTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATION_UNIT__IMPORTS);
		}
		return _imports;
	
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
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.COMPILATION_UNIT__PACKAGE , oldvalue, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<AbstractTypeDeclaration> _types;
	
	public com.crossecore.ocl.OrderedSet<AbstractTypeDeclaration> getTypes()
	{
		if(_types==null){
			_types = new com.crossecore.ocl.OrderedSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_PackageImpl.COMPILATION_UNIT__TYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATION_UNIT__TYPES);
		}
		return _types;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.COMPILATIONUNIT;
	}
	
	
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
		Package oldobj = _package;
		_package = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.COMPILATION_UNIT__PACKAGE, oldobj, newobj);
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
			case Java_PackageImpl.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_PackageImpl.COMPILATION_UNIT__COMMENT_LIST:
				return getCommentList();
			case Java_PackageImpl.COMPILATION_UNIT__IMPORTS:
				return getImports();
			case Java_PackageImpl.COMPILATION_UNIT__PACKAGE:
				return getPackage();
			case Java_PackageImpl.COMPILATION_UNIT__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				setOriginalFilePath((java.lang.String) newValue);
				return;
			case Java_PackageImpl.COMPILATION_UNIT__COMMENT_LIST:
				getCommentList().clear();
				getCommentList().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((java.util.Collection<? extends ImportDeclaration>) newValue);
				return;
			case Java_PackageImpl.COMPILATION_UNIT__PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((java.util.Collection<? extends AbstractTypeDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
			case Java_PackageImpl.COMPILATION_UNIT__COMMENT_LIST:
				return getCommentList().isEmpty(); //many, volatile
			case Java_PackageImpl.COMPILATION_UNIT__IMPORTS:
				return _imports != null && !_imports.isEmpty();
			case Java_PackageImpl.COMPILATION_UNIT__PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.COMPILATION_UNIT__TYPES:
				return getTypes().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
