package java_;
public interface TagElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<TagElement> allInstances = new Ocllib.QuickSet<TagElement>(TagElement.class);
	
	/*
	public static Ocllib.QuickSet<TagElement> allInstances_ = new Ocllib.QuickSet<TagElement>(TagElement.class);
	
	public static Ocllib.QuickSet<TagElement> allInstancesClosure = new Ocllib.QuickSet<TagElement>(TagElement.class);
		
	public static Ocllib.QuickSet<TagElement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(TagElement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getTagName();
	void setTagName(java.lang.String value);
	Ocllib.OrderedSet<ASTNode> getFragments();
	
}
