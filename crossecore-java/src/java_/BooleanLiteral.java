package java_;
public interface BooleanLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<BooleanLiteral> allInstances_ = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
		
	public static Ocllib.QuickSet<BooleanLiteral> allInstances(){
		
		Ocllib.QuickSet<BooleanLiteral> result = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
		result.addAll(BooleanLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<BooleanLiteral> allInstances = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
	boolean isValue();
	void setValue(boolean value);
	//public boolean isValue();
	
}
