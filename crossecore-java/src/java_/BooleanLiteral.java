package java_;
public interface BooleanLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<BooleanLiteral> allInstances = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
	/*
	public static Ocllib.QuickSet<BooleanLiteral> allInstances_ = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
	
	public static Ocllib.QuickSet<BooleanLiteral> allInstancesClosure = new Ocllib.QuickSet<BooleanLiteral>(BooleanLiteral.class);
		
	public static Ocllib.QuickSet<BooleanLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(BooleanLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	boolean isValue();
	void setValue(boolean value);
	//public boolean isValue();
	
}
