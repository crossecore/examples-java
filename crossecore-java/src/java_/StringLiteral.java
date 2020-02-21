package java_;
public interface StringLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<StringLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<StringLiteral>(StringLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<StringLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<StringLiteral> result = new com.crossecore.ocl.QuickSet<StringLiteral>(StringLiteral.class);
		result.addAll(StringLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<StringLiteral> allInstances = new com.crossecore.ocl.QuickSet<StringLiteral>(StringLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
