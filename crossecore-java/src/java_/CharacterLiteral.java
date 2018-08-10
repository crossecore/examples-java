package java_;
public interface CharacterLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<CharacterLiteral> allInstances_ = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
		
	public static Ocllib.QuickSet<CharacterLiteral> allInstances(){
		
		Ocllib.QuickSet<CharacterLiteral> result = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
		result.addAll(CharacterLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<CharacterLiteral> allInstances = new Ocllib.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
