package java_;
public interface FieldAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<FieldAccess> allInstances = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
	
	/*
	public static Ocllib.QuickSet<FieldAccess> allInstances_ = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
	
	public static Ocllib.QuickSet<FieldAccess> allInstancesClosure = new Ocllib.QuickSet<FieldAccess>(FieldAccess.class);
		
	public static Ocllib.QuickSet<FieldAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(FieldAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
