package java_;
public interface BlockComment 
 extends Comment
{
	
	public static Ocllib.QuickSet<BlockComment> allInstances_ = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
	
		
	public static Ocllib.QuickSet<BlockComment> allInstances(){
		
		Ocllib.QuickSet<BlockComment> result = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
		result.addAll(BlockComment.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<BlockComment> allInstances = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
	
	
}
