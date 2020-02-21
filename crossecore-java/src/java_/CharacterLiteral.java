package java_;
public interface CharacterLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<CharacterLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<CharacterLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<CharacterLiteral> result = new com.crossecore.ocl.QuickSet<CharacterLiteral>(CharacterLiteral.class);
		result.addAll(CharacterLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<CharacterLiteral> allInstances = new com.crossecore.ocl.QuickSet<CharacterLiteral>(CharacterLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
