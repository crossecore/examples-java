package java_;
public interface NumberLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<NumberLiteral> allInstances = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
	
	/*
	public static Ocllib.QuickSet<NumberLiteral> allInstances_ = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
	
	public static Ocllib.QuickSet<NumberLiteral> allInstancesClosure = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
		
	public static Ocllib.QuickSet<NumberLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(NumberLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getTokenValue();
	void setTokenValue(java.lang.String value);
	
}
