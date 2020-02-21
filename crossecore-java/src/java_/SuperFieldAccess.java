package java_;
public interface SuperFieldAccess 
 extends AbstractTypeQualifiedExpression
{
	
	public static com.crossecore.ocl.QuickSet<SuperFieldAccess> allInstances_ = new com.crossecore.ocl.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<SuperFieldAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<SuperFieldAccess> result = new com.crossecore.ocl.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
		result.addAll(SuperFieldAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SuperFieldAccess> allInstances = new com.crossecore.ocl.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
}
