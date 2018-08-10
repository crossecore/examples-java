package java_;
public interface MethodRef 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MethodRef> allInstances_ = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
	
		
	public static Ocllib.QuickSet<MethodRef> allInstances(){
		
		Ocllib.QuickSet<MethodRef> result = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
		result.addAll(MethodRef.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<MethodRef> allInstances = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	Ocllib.OrderedSet<MethodRefParameter> getParameters();
	
}
