package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ASTNodeBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements ASTNode
{
	private com.crossecore.ocl.OrderedSet<Comment> _comments;
	
	public com.crossecore.ocl.OrderedSet<Comment> getComments()
	{
		if(_comments==null){
			_comments = new com.crossecore.ocl.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.ASTNODE__COMMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASTNODE__COMMENTS);
		}
		return _comments;
	
	}
	private CompilationUnit _originalCompilationUnit;
	public CompilationUnit getOriginalCompilationUnit()
	{
		
			return _originalCompilationUnit;
		
		
	}
	public void setOriginalCompilationUnit(CompilationUnit value){
		CompilationUnit oldvalue = _originalCompilationUnit;
		_originalCompilationUnit = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASTNODE__ORIGINAL_COMPILATION_UNIT , oldvalue, value));
		}
	}
	private ClassFile _originalClassFile;
	public ClassFile getOriginalClassFile()
	{
		
			return _originalClassFile;
		
		
	}
	public void setOriginalClassFile(ClassFile value){
		ClassFile oldvalue = _originalClassFile;
		_originalClassFile = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASTNODE__ORIGINAL_CLASS_FILE , oldvalue, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ASTNODE;
	}
	
	
	public NotificationChain basicSetOriginalCompilationUnit(CompilationUnit newobj, NotificationChain msgs) {
		CompilationUnit oldobj = _originalCompilationUnit;
		_originalCompilationUnit = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASTNODE__ORIGINAL_COMPILATION_UNIT, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetOriginalClassFile(ClassFile newobj, NotificationChain msgs) {
		ClassFile oldobj = _originalClassFile;
		_originalClassFile = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASTNODE__ORIGINAL_CLASS_FILE, oldobj, newobj);
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
			case Java_PackageImpl.ASTNODE__COMMENTS:
				return getComments();
			case Java_PackageImpl.ASTNODE__ORIGINAL_COMPILATION_UNIT:
				return getOriginalCompilationUnit();
			case Java_PackageImpl.ASTNODE__ORIGINAL_CLASS_FILE:
				return getOriginalClassFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ASTNODE__COMMENTS:
				getComments().clear();
				getComments().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.ASTNODE__ORIGINAL_COMPILATION_UNIT:
				setOriginalCompilationUnit((CompilationUnit) newValue);
				return;
			case Java_PackageImpl.ASTNODE__ORIGINAL_CLASS_FILE:
				setOriginalClassFile((ClassFile) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ASTNODE__COMMENTS:
				return _comments != null && !_comments.isEmpty();
			case Java_PackageImpl.ASTNODE__ORIGINAL_COMPILATION_UNIT:
				return getOriginalCompilationUnit() != null; //single, volatile
			case Java_PackageImpl.ASTNODE__ORIGINAL_CLASS_FILE:
				return getOriginalClassFile() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
