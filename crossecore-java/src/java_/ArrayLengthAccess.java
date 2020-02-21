package java_;
public interface ArrayLengthAccess 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ArrayLengthAccess> allInstances_ = new com.crossecore.ocl.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<ArrayLengthAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<ArrayLengthAccess> result = new com.crossecore.ocl.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
		result.addAll(ArrayLengthAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ArrayLengthAccess> allInstances = new com.crossecore.ocl.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
}
