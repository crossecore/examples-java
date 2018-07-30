package java_;
public interface LineComment 
 extends Comment
{
	
	public static Ocllib.QuickSet<LineComment> allInstances = new Ocllib.QuickSet<LineComment>(LineComment.class);
	
	/*
	public static Ocllib.QuickSet<LineComment> allInstances_ = new Ocllib.QuickSet<LineComment>(LineComment.class);
	
	public static Ocllib.QuickSet<LineComment> allInstancesClosure = new Ocllib.QuickSet<LineComment>(LineComment.class);
		
	public static Ocllib.QuickSet<LineComment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Comment.allInstances_);
			allInstancesClosure.addAll(LineComment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
