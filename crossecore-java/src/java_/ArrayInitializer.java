package java_;
public interface ArrayInitializer 
 extends Expression
{
	
	public static Ocllib.Set<ArrayInitializer> allInstances = new Ocllib.Set<ArrayInitializer>(ArrayInitializer.class);
	
	Ocllib.OrderedSet<Expression> getExpressions();
	
}
