package java_;
public interface TagElement 
 extends ASTNode
{
	
	public static Ocllib.Set<TagElement> allInstances = new Ocllib.Set<TagElement>(TagElement.class);
	
	java.lang.String getTagName();
	void setTagName(java.lang.String value);
	Ocllib.OrderedSet<ASTNode> getFragments();
	
}
