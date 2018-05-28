package java_;
public interface Comment 
 extends ASTNode
{
	
	public static Ocllib.Set<Comment> allInstances = new Ocllib.Set<Comment>(Comment.class);
	
	java.lang.String getContent();
	void setContent(java.lang.String value);
	boolean isEnclosedByParent();
	void setEnclosedByParent(boolean value);
	//public boolean isEnclosedByParent();
	boolean isPrefixOfParent();
	void setPrefixOfParent(boolean value);
	//public boolean isPrefixOfParent();
	
}
