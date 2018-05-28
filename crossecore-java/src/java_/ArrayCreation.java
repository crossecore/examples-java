package java_;
public interface ArrayCreation 
 extends Expression
{
	
	public static Ocllib.Set<ArrayCreation> allInstances = new Ocllib.Set<ArrayCreation>(ArrayCreation.class);
	
	Ocllib.OrderedSet<Expression> getDimensions();
	
	ArrayInitializer getInitializer();
	void setInitializer(ArrayInitializer value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
