package java_;
public interface Initializer 
 extends BodyDeclaration
{
	
	public static Ocllib.Set<Initializer> allInstances = new Ocllib.Set<Initializer>(Initializer.class);
	
	
	Block getBody();
	void setBody(Block value);
	
}
