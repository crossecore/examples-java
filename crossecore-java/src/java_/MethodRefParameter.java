package java_;
public interface MethodRefParameter 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MethodRefParameter> allInstances_ = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
		
	public static Ocllib.QuickSet<MethodRefParameter> allInstances(){
		
		Ocllib.QuickSet<MethodRefParameter> result = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
		result.addAll(MethodRefParameter.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<MethodRefParameter> allInstances = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
