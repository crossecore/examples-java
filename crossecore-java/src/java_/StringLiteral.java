package java_;
public interface StringLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<StringLiteral> allInstances = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
	
	/*
	public static Ocllib.QuickSet<StringLiteral> allInstances_ = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
	
	public static Ocllib.QuickSet<StringLiteral> allInstancesClosure = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
		
	public static Ocllib.QuickSet<StringLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(StringLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
