package java_;
public interface CharacterLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<CharacterLiteral> allInstances = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
	/*
	public static Ocllib.QuickSet<CharacterLiteral> allInstances_ = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
	public static Ocllib.QuickSet<CharacterLiteral> allInstancesClosure = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
		
	public static Ocllib.QuickSet<CharacterLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(CharacterLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
