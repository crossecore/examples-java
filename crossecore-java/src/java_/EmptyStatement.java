package java_;
public interface EmptyStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<EmptyStatement> allInstances_ = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
	
		
	public static Ocllib.QuickSet<EmptyStatement> allInstances(){
		
		Ocllib.QuickSet<EmptyStatement> result = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
		result.addAll(EmptyStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<EmptyStatement> allInstances = new Ocllib.QuickSet<EmptyStatement>(EmptyStatement.class);
	
	
}
