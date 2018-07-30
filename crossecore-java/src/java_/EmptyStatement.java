package java_;
public interface EmptyStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<EmptyStatement> allInstances = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
	
	/*
	public static Ocllib.QuickSet<EmptyStatement> allInstances_ = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
	
	public static Ocllib.QuickSet<EmptyStatement> allInstancesClosure = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
		
	public static Ocllib.QuickSet<EmptyStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(EmptyStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
