package java_;
public interface MethodRefParameter 
 extends ASTNode
{
	
	public static Ocllib.Set<MethodRefParameter> allInstances = new Ocllib.Set<MethodRefParameter>(MethodRefParameter.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
