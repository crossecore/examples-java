package java_;
public interface NumberLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<NumberLiteral> allInstances_ = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
	
		
	public static Ocllib.QuickSet<NumberLiteral> allInstances(){
		
		Ocllib.QuickSet<NumberLiteral> result = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
		result.addAll(NumberLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<NumberLiteral> allInstances = new Ocllib.QuickSet<NumberLiteral>(NumberLiteral.class);
	
	java.lang.String getTokenValue();
	void setTokenValue(java.lang.String value);
	
}
