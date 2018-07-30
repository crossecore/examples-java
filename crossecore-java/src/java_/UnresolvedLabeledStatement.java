package java_;
public interface UnresolvedLabeledStatement 
 extends LabeledStatement,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances_ = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstancesClosure = new Ocllib.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
		
	public static Ocllib.QuickSet<UnresolvedLabeledStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(LabeledStatement.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedLabeledStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
