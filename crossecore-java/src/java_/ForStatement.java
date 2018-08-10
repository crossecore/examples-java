package java_;
public interface ForStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ForStatement> allInstances_ = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
	
		
	public static Ocllib.QuickSet<ForStatement> allInstances(){
		
		Ocllib.QuickSet<ForStatement> result = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
		result.addAll(ForStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ForStatement> allInstances = new Ocllib.QuickSet<ForStatement>(ForStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Expression> getUpdaters();
	Ocllib.OrderedSet<Expression> getInitializers();
	
	Statement getBody();
	void setBody(Statement value);
	
}
