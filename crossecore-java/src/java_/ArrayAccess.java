package java_;
public interface ArrayAccess 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ArrayAccess> allInstances_ = new com.crossecore.ocl.QuickSet<ArrayAccess>(ArrayAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<ArrayAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<ArrayAccess> result = new com.crossecore.ocl.QuickSet<ArrayAccess>(ArrayAccess.class);
		result.addAll(ArrayAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ArrayAccess> allInstances = new com.crossecore.ocl.QuickSet<ArrayAccess>(ArrayAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
	Expression getIndex();
	void setIndex(Expression value);
	
}
