package java_;
public interface Block 
 extends Statement
{
	
	public static Ocllib.Set<Block> allInstances = new Ocllib.Set<Block>(Block.class);
	
	Ocllib.OrderedSet<Statement> getStatements();
	
}
