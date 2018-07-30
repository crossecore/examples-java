package java_;
public interface Javadoc 
 extends Comment
{
	
	public static Ocllib.QuickSet<Javadoc> allInstances = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
	
	/*
	public static Ocllib.QuickSet<Javadoc> allInstances_ = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
	
	public static Ocllib.QuickSet<Javadoc> allInstancesClosure = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
		
	public static Ocllib.QuickSet<Javadoc> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Comment.allInstances_);
			allInstancesClosure.addAll(Javadoc.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<TagElement> getTags();
	
}
