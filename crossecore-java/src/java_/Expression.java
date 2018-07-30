package java_;
public interface Expression 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<Expression> allInstances = new Ocllib.QuickSet<Expression>(Expression.class);
	
	/*
	public static Ocllib.QuickSet<Expression> allInstances_ = new Ocllib.QuickSet<Expression>(Expression.class);
	
	public static Ocllib.QuickSet<Expression> allInstancesClosure = new Ocllib.QuickSet<Expression>(Expression.class);
		
	public static Ocllib.QuickSet<Expression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
