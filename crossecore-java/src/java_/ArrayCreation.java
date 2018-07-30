package java_;
public interface ArrayCreation 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayCreation> allInstances = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
	
	/*
	public static Ocllib.QuickSet<ArrayCreation> allInstances_ = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
	
	public static Ocllib.QuickSet<ArrayCreation> allInstancesClosure = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
		
	public static Ocllib.QuickSet<ArrayCreation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ArrayCreation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<Expression> getDimensions();
	
	ArrayInitializer getInitializer();
	void setInitializer(ArrayInitializer value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
