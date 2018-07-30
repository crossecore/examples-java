package java_;
public interface ForStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ForStatement> allInstances = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
	
	/*
	public static Ocllib.QuickSet<ForStatement> allInstances_ = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
	
	public static Ocllib.QuickSet<ForStatement> allInstancesClosure = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
		
	public static Ocllib.QuickSet<ForStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(ForStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Expression> getUpdaters();
	Ocllib.OrderedSet<Expression> getInitializers();
	
	Statement getBody();
	void setBody(Statement value);
	
}
