package java_;
public interface Comment 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<Comment> allInstances_ = new Ocllib.QuickSet<Comment>(Comment.class);
	
		
	public static Ocllib.QuickSet<Comment> allInstances(){
		
		Ocllib.QuickSet<Comment> result = new Ocllib.QuickSet<Comment>(Comment.class);
		result.addAll(Comment.allInstances_);
		
		result.addAll(Javadoc.allInstances_);
		result.addAll(BlockComment.allInstances_);
		result.addAll(LineComment.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Comment> allInstances = new Ocllib.QuickSet<Comment>(Comment.class);
	
	java.lang.String getContent();
	void setContent(java.lang.String value);
	boolean isEnclosedByParent();
	void setEnclosedByParent(boolean value);
	//public boolean isEnclosedByParent();
	boolean isPrefixOfParent();
	void setPrefixOfParent(boolean value);
	//public boolean isPrefixOfParent();
	
}
