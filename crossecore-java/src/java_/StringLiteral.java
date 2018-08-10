package java_;
public interface StringLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<StringLiteral> allInstances_ = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
	
		
	public static Ocllib.QuickSet<StringLiteral> allInstances(){
		
		Ocllib.QuickSet<StringLiteral> result = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
		result.addAll(StringLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<StringLiteral> allInstances = new Ocllib.QuickSet<StringLiteral>(StringLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
