package java_;
public interface ForStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<ForStatement> allInstances_ = new com.crossecore.ocl.QuickSet<ForStatement>(ForStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<ForStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<ForStatement> result = new com.crossecore.ocl.QuickSet<ForStatement>(ForStatement.class);
		result.addAll(ForStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ForStatement> allInstances = new com.crossecore.ocl.QuickSet<ForStatement>(ForStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	com.crossecore.ocl.OrderedSet<Expression> getUpdaters();
	com.crossecore.ocl.OrderedSet<Expression> getInitializers();
	
	Statement getBody();
	void setBody(Statement value);
	
}
