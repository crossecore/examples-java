package java_;
public interface FieldAccess 
 extends Expression
{
	
	public static Ocllib.Set<FieldAccess> allInstances = new Ocllib.Set<FieldAccess>(FieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
