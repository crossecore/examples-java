package java_;
public interface LineComment 
 extends Comment
{
	
	public static com.crossecore.ocl.QuickSet<LineComment> allInstances_ = new com.crossecore.ocl.QuickSet<LineComment>(LineComment.class);
	
		
	public static com.crossecore.ocl.QuickSet<LineComment> allInstances(){
		
		com.crossecore.ocl.QuickSet<LineComment> result = new com.crossecore.ocl.QuickSet<LineComment>(LineComment.class);
		result.addAll(LineComment.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<LineComment> allInstances = new com.crossecore.ocl.QuickSet<LineComment>(LineComment.class);
	
	
}
