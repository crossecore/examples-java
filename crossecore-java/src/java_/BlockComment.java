package java_;
public interface BlockComment 
 extends Comment
{
	
	public static com.crossecore.ocl.QuickSet<BlockComment> allInstances_ = new com.crossecore.ocl.QuickSet<BlockComment>(BlockComment.class);
	
		
	public static com.crossecore.ocl.QuickSet<BlockComment> allInstances(){
		
		com.crossecore.ocl.QuickSet<BlockComment> result = new com.crossecore.ocl.QuickSet<BlockComment>(BlockComment.class);
		result.addAll(BlockComment.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<BlockComment> allInstances = new com.crossecore.ocl.QuickSet<BlockComment>(BlockComment.class);
	
	
}
