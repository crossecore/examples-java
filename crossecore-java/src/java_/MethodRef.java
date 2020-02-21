package java_;
public interface MethodRef 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<MethodRef> allInstances_ = new com.crossecore.ocl.QuickSet<MethodRef>(MethodRef.class);
	
		
	public static com.crossecore.ocl.QuickSet<MethodRef> allInstances(){
		
		com.crossecore.ocl.QuickSet<MethodRef> result = new com.crossecore.ocl.QuickSet<MethodRef>(MethodRef.class);
		result.addAll(MethodRef.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<MethodRef> allInstances = new com.crossecore.ocl.QuickSet<MethodRef>(MethodRef.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	com.crossecore.ocl.OrderedSet<MethodRefParameter> getParameters();
	
}
