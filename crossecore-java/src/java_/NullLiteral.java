package java_;
public interface NullLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<NullLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<NullLiteral>(NullLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<NullLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<NullLiteral> result = new com.crossecore.ocl.QuickSet<NullLiteral>(NullLiteral.class);
		result.addAll(NullLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<NullLiteral> allInstances = new com.crossecore.ocl.QuickSet<NullLiteral>(NullLiteral.class);
	
	
}
