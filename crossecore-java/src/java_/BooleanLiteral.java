package java_;
public interface BooleanLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<BooleanLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<BooleanLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<BooleanLiteral> result = new com.crossecore.ocl.QuickSet<BooleanLiteral>(BooleanLiteral.class);
		result.addAll(BooleanLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<BooleanLiteral> allInstances = new com.crossecore.ocl.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
	boolean isValue();
	void setValue(boolean value);
	//public boolean isValue();
	
}
