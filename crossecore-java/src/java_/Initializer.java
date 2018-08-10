package java_;
public interface Initializer 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<Initializer> allInstances_ = new Ocllib.QuickSet<Initializer>(Initializer.class);
	
		
	public static Ocllib.QuickSet<Initializer> allInstances(){
		
		Ocllib.QuickSet<Initializer> result = new Ocllib.QuickSet<Initializer>(Initializer.class);
		result.addAll(Initializer.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Initializer> allInstances = new Ocllib.QuickSet<Initializer>(Initializer.class);
	
	
	Block getBody();
	void setBody(Block value);
	
}
