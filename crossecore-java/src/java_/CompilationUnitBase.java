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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH, oldValue, value));
		
	}
	
	
	
	private Ocllib.OrderedSet<Comment> _commentList;
	
	public Ocllib.OrderedSet<Comment> getCommentList()
	{
		if(_commentList==null){
			_commentList = new Ocllib.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST);
		}
		return _commentList;
	
	}
	private Ocllib.OrderedSet<ImportDeclaration> _imports;
	
	public Ocllib.OrderedSet<ImportDeclaration> getImports()
	{
		if(_imports==null){
			_imports = new Ocllib.OrderedSet<ImportDeclaration>(ImportDeclaration.class, this, Java_PackageImpl.COMPILATIONUNIT_IMPORTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_IMPORTS);
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
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.COMPILATIONUNIT_PACKAGE , oldvalue, value));
		}
	}
	private Ocllib.OrderedSet<AbstractTypeDeclaration> _types;
	
	public Ocllib.OrderedSet<AbstractTypeDeclaration> getTypes()
	{
		if(_types==null){
			_types = new Ocllib.OrderedSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_PackageImpl.COMPILATIONUNIT_TYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_TYPES);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.COMPILATIONUNIT_PACKAGE, oldobj, newobj);
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
			case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
				return getOriginalFilePath();
			case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
				return getCommentList();
			case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
				return getImports();
			case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
				return getPackage();
			case Java_PackageImpl.COMPILATIONUNIT_TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
				setOriginalFilePath((java.lang.String) newValue);
				return;
			case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
				getCommentList().clear();
				getCommentList().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
				getImports().clear();
				getImports().addAll((java.util.Collection<? extends ImportDeclaration>) newValue);
				return;
			case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.COMPILATIONUNIT_TYPES:
				getTypes().clear();
				getTypes().addAll((java.util.Collection<? extends AbstractTypeDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
				return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
			case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
				return getCommentList().isEmpty(); //many, volatile
			case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
				return _imports != null && !_imports.isEmpty();
			case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.COMPILATIONUNIT_TYPES:
				return getTypes().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
