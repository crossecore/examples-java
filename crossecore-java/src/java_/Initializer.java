package java_;
public interface Initializer 
 extends BodyDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<Initializer> allInstances_ = new com.crossecore.ocl.QuickSet<Initializer>(Initializer.class);
	
		
	public static com.crossecore.ocl.QuickSet<Initializer> allInstances(){
		
		com.crossecore.ocl.QuickSet<Initializer> result = new com.crossecore.ocl.QuickSet<Initializer>(Initializer.class);
		result.addAll(Initializer.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Initializer> allInstances = new com.crossecore.ocl.QuickSet<Initializer>(Initializer.class);
	
	
	Block getBody();
	void setBody(Block value);
	
}
