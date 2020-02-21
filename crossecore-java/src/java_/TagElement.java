package java_;
public interface TagElement 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<TagElement> allInstances_ = new com.crossecore.ocl.QuickSet<TagElement>(TagElement.class);
	
		
	public static com.crossecore.ocl.QuickSet<TagElement> allInstances(){
		
		com.crossecore.ocl.QuickSet<TagElement> result = new com.crossecore.ocl.QuickSet<TagElement>(TagElement.class);
		result.addAll(TagElement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TagElement> allInstances = new com.crossecore.ocl.QuickSet<TagElement>(TagElement.class);
	
	java.lang.String getTagName();
	void setTagName(java.lang.String value);
	com.crossecore.ocl.OrderedSet<ASTNode> getFragments();
	
}
