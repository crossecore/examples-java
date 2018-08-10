package java_;
public interface Block 
 extends Statement
{
	
	public static Ocllib.QuickSet<Block> allInstances_ = new Ocllib.QuickSet<Block>(Block.class);
	
		
	public static Ocllib.QuickSet<Block> allInstances(){
		
		Ocllib.QuickSet<Block> result = new Ocllib.QuickSet<Block>(Block.class);
		result.addAll(Block.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Block> allInstances = new Ocllib.QuickSet<Block>(Block.class);
	
	Ocllib.OrderedSet<Statement> getStatements();
	
}
