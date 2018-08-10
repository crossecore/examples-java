package java_;
public interface ArrayInitializer 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayInitializer> allInstances_ = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
		
	public static Ocllib.QuickSet<ArrayInitializer> allInstances(){
		
		Ocllib.QuickSet<ArrayInitializer> result = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
		result.addAll(ArrayInitializer.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ArrayInitializer> allInstances = new Ocllib.QuickSet<ArrayInitializer>(ArrayInitializer.class);
	
	Ocllib.OrderedSet<Expression> getExpressions();
	
}
