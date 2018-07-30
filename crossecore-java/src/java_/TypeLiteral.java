package java_;
public interface TypeLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<TypeLiteral> allInstances = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
	
	/*
	public static Ocllib.QuickSet<TypeLiteral> allInstances_ = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
	
	public static Ocllib.QuickSet<TypeLiteral> allInstancesClosure = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
		
	public static Ocllib.QuickSet<TypeLiteral> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(TypeLiteral.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
