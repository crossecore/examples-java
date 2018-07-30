package java_;
public interface SuperFieldAccess 
 extends AbstractTypeQualifiedExpression
{
	
	public static Ocllib.QuickSet<SuperFieldAccess> allInstances = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
	/*
	public static Ocllib.QuickSet<SuperFieldAccess> allInstances_ = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
	public static Ocllib.QuickSet<SuperFieldAccess> allInstancesClosure = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
		
	public static Ocllib.QuickSet<SuperFieldAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractTypeQualifiedExpression.allInstances_);
			allInstancesClosure.addAll(SuperFieldAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
}
