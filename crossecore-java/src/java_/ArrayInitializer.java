package java_;
public interface ArrayInitializer 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayInitializer> allInstances = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
	/*
	public static Ocllib.QuickSet<ArrayInitializer> allInstances_ = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
	public static Ocllib.QuickSet<ArrayInitializer> allInstancesClosure = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
		
	public static Ocllib.QuickSet<ArrayInitializer> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ArrayInitializer.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<Expression> getExpressions();
	
}
