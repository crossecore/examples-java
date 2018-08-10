package java_;
public interface TagElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<TagElement> allInstances_ = new Ocllib.QuickSet<TagElement>(TagElement.class);
	
		
	public static Ocllib.QuickSet<TagElement> allInstances(){
		
		Ocllib.QuickSet<TagElement> result = new Ocllib.QuickSet<TagElement>(TagElement.class);
		result.addAll(TagElement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TagElement> allInstances = new Ocllib.QuickSet<TagElement>(TagElement.class);
	
	java.lang.String getTagName();
	void setTagName(java.lang.String value);
	Ocllib.OrderedSet<ASTNode> getFragments();
	
}
