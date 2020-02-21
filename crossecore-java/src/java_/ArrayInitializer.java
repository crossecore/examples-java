package java_;
public interface ArrayInitializer 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ArrayInitializer> allInstances_ = new com.crossecore.ocl.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
		
	public static com.crossecore.ocl.QuickSet<ArrayInitializer> allInstances(){
		
		com.crossecore.ocl.QuickSet<ArrayInitializer> result = new com.crossecore.ocl.QuickSet<ArrayInitializer>(ArrayInitializer.class);
		result.addAll(ArrayInitializer.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ArrayInitializer> allInstances = new com.crossecore.ocl.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
	com.crossecore.ocl.OrderedSet<Expression> getExpressions();
	
}
