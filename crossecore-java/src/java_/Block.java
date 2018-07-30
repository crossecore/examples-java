package java_;
public interface Block 
 extends Statement
{
	
	public static Ocllib.QuickSet<Block> allInstances = new Ocllib.QuickSet<Block>(Block.class);
	
	/*
	public static Ocllib.QuickSet<Block> allInstances_ = new Ocllib.QuickSet<Block>(Block.class);
	
	public static Ocllib.QuickSet<Block> allInstancesClosure = new Ocllib.QuickSet<Block>(Block.class);
		
	public static Ocllib.QuickSet<Block> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(Block.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<Statement> getStatements();
	
}
