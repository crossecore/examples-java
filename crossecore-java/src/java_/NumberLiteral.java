package java_;
public interface NumberLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<NumberLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<NumberLiteral>(NumberLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<NumberLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<NumberLiteral> result = new com.crossecore.ocl.QuickSet<NumberLiteral>(NumberLiteral.class);
		result.addAll(NumberLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<NumberLiteral> allInstances = new com.crossecore.ocl.QuickSet<NumberLiteral>(NumberLiteral.class);
	
	java.lang.String getTokenValue();
	void setTokenValue(java.lang.String value);
	
}
