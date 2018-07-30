package java_;
public interface BlockComment 
 extends Comment
{
	
	public static Ocllib.QuickSet<BlockComment> allInstances = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
	
	/*
	public static Ocllib.QuickSet<BlockComment> allInstances_ = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
	
	public static Ocllib.QuickSet<BlockComment> allInstancesClosure = new Ocllib.QuickSet<BlockComment>(BlockComment.class);
		
	public static Ocllib.QuickSet<BlockComment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Comment.allInstances_);
			allInstancesClosure.addAll(BlockComment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
