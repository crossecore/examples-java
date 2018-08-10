package java_;
public interface UnresolvedLabeledStatement 
 extends LabeledStatement,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances_ = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
		
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances(){
		
		Ocllib.QuickSet<UnresolvedLabeledStatement> result = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
	
}
