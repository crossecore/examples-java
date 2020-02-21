package java_;
public interface Javadoc 
 extends Comment
{
	
	public static com.crossecore.ocl.QuickSet<Javadoc> allInstances_ = new com.crossecore.ocl.QuickSet<Javadoc>(Javadoc.class);
	
		
	public static com.crossecore.ocl.QuickSet<Javadoc> allInstances(){
		
		com.crossecore.ocl.QuickSet<Javadoc> result = new com.crossecore.ocl.QuickSet<Javadoc>(Javadoc.class);
		result.addAll(Javadoc.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Javadoc> allInstances = new com.crossecore.ocl.QuickSet<Javadoc>(Javadoc.class);
	
	com.crossecore.ocl.OrderedSet<TagElement> getTags();
	
}
