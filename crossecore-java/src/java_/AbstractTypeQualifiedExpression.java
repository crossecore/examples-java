package java_;
public interface AbstractTypeQualifiedExpression 
 extends Expression
{
	
	public static Ocllib.Set<AbstractTypeQualifiedExpression> allInstances = new Ocllib.Set<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
