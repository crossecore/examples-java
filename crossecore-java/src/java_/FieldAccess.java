package java_;
public interface FieldAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<FieldAccess> allInstances_ = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
	
		
	public static Ocllib.QuickSet<FieldAccess> allInstances(){
		
		Ocllib.QuickSet<FieldAccess> result = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
		result.addAll(FieldAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<FieldAccess> allInstances = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
