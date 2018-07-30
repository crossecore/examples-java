package java_;
public interface Statement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<Statement> allInstances = new Ocllib.QuickSet<Statement>(Statement.class);
	
	/*
	public static Ocllib.QuickSet<Statement> allInstances_ = new Ocllib.QuickSet<Statement>(Statement.class);
	
	public static Ocllib.QuickSet<Statement> allInstancesClosure = new Ocllib.QuickSet<Statement>(Statement.class);
		
	public static Ocllib.QuickSet<Statement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
