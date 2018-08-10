package java_;
public interface ArrayCreation 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayCreation> allInstances_ = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
	
		
	public static Ocllib.QuickSet<ArrayCreation> allInstances(){
		
		Ocllib.QuickSet<ArrayCreation> result = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
		result.addAll(ArrayCreation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ArrayCreation> allInstances = new Ocllib.QuickSet<ArrayCreation>(ArrayCreation.class);
	
	Ocllib.OrderedSet<Expression> getDimensions();
	
	ArrayInitializer getInitializer();
	void setInitializer(ArrayInitializer value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
