package java_;
public interface Initializer 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<Initializer> allInstances = new Ocllib.QuickSet<Initializer>(Initializer.class);
	
	/*
	public static Ocllib.QuickSet<Initializer> allInstances_ = new Ocllib.QuickSet<Initializer>(Initializer.class);
	
	public static Ocllib.QuickSet<Initializer> allInstancesClosure = new Ocllib.QuickSet<Initializer>(Initializer.class);
		
	public static Ocllib.QuickSet<Initializer> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Initializer.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Block getBody();
	void setBody(Block value);
	
}
