package java_;
public interface Javadoc 
 extends Comment
{
	
	public static Ocllib.QuickSet<Javadoc> allInstances_ = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
	
		
	public static Ocllib.QuickSet<Javadoc> allInstances(){
		
		Ocllib.QuickSet<Javadoc> result = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
		result.addAll(Javadoc.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Javadoc> allInstances = new Ocllib.QuickSet<Javadoc>(Javadoc.class);
	
	Ocllib.OrderedSet<TagElement> getTags();
	
}
