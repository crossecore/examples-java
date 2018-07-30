package java_;
public interface NullLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<NullLiteral> allInstances = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
	
	/*
	public static Ocllib.QuickSet<NullLiteral> allInstances_ = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
	
	public static Ocllib.QuickSet<NullLiteral> allInstancesClosure = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
		
	public static Ocllib.QuickSet<NullLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(NullLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
