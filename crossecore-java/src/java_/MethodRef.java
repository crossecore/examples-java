package java_;
public interface MethodRef 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MethodRef> allInstances = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
	
	/*
	public static Ocllib.QuickSet<MethodRef> allInstances_ = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
	
	public static Ocllib.QuickSet<MethodRef> allInstancesClosure = new Ocllib.QuickSet<MethodRef>(MethodRef.class);
		
	public static Ocllib.QuickSet<MethodRef> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(MethodRef.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	Ocllib.OrderedSet<MethodRefParameter> getParameters();
	
}
