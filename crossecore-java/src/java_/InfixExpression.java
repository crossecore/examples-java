package java_;
public interface InfixExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<InfixExpression> allInstances_ = new com.crossecore.ocl.QuickSet<InfixExpression>(InfixExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<InfixExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<InfixExpression> result = new com.crossecore.ocl.QuickSet<InfixExpression>(InfixExpression.class);
		result.addAll(InfixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<InfixExpression> allInstances = new com.crossecore.ocl.QuickSet<InfixExpression>(InfixExpression.class);
	
	InfixExpressionKind getOperator();
	void setOperator(InfixExpressionKind value);
	
	Expression getRightOperand();
	void setRightOperand(Expression value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	com.crossecore.ocl.OrderedSet<Expression> getExtendedOperands();
	
}
