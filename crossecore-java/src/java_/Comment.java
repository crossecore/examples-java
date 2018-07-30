package java_;
public interface Comment 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<Comment> allInstances = new Ocllib.QuickSet<Comment>(Comment.class);
	
	/*
	public static Ocllib.QuickSet<Comment> allInstances_ = new Ocllib.QuickSet<Comment>(Comment.class);
	
	public static Ocllib.QuickSet<Comment> allInstancesClosure = new Ocllib.QuickSet<Comment>(Comment.class);
		
	public static Ocllib.QuickSet<Comment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Comment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getContent();
	void setContent(java.lang.String value);
	boolean isEnclosedByParent();
	void setEnclosedByParent(boolean value);
	//public boolean isEnclosedByParent();
	boolean isPrefixOfParent();
	void setPrefixOfParent(boolean value);
	//public boolean isPrefixOfParent();
	
}
