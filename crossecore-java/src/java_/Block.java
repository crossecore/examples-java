package java_;
public interface Block 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<Block> allInstances_ = new com.crossecore.ocl.QuickSet<Block>(Block.class);
	
		
	public static com.crossecore.ocl.QuickSet<Block> allInstances(){
		
		com.crossecore.ocl.QuickSet<Block> result = new com.crossecore.ocl.QuickSet<Block>(Block.class);
		result.addAll(Block.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Block> allInstances = new com.crossecore.ocl.QuickSet<Block>(Block.class);
	
	com.crossecore.ocl.OrderedSet<Statement> getStatements();
	
}
