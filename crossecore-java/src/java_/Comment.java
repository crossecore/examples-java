package java_;
public interface Comment 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<Comment> allInstances_ = new com.crossecore.ocl.QuickSet<Comment>(Comment.class);
	
		
	public static com.crossecore.ocl.QuickSet<Comment> allInstances(){
		
		com.crossecore.ocl.QuickSet<Comment> result = new com.crossecore.ocl.QuickSet<Comment>(Comment.class);
		result.addAll(Comment.allInstances_);
		
		result.addAll(LineComment.allInstances_);
		result.addAll(Javadoc.allInstances_);
		result.addAll(BlockComment.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Comment> allInstances = new com.crossecore.ocl.QuickSet<Comment>(Comment.class);
	
	java.lang.String getContent();
	void setContent(java.lang.String value);
	boolean isEnclosedByParent();
	void setEnclosedByParent(boolean value);
	//public boolean isEnclosedByParent();
	boolean isPrefixOfParent();
	void setPrefixOfParent(boolean value);
	//public boolean isPrefixOfParent();
	
}
