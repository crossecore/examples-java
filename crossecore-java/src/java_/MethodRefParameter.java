package java_;
public interface MethodRefParameter 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MethodRefParameter> allInstances = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
	/*
	public static Ocllib.QuickSet<MethodRefParameter> allInstances_ = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
	public static Ocllib.QuickSet<MethodRefParameter> allInstancesClosure = new Ocllib.QuickSet<MethodRefParameter>(MethodRefParameter.class);
		
	public static Ocllib.QuickSet<MethodRefParameter> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(MethodRefParameter.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
