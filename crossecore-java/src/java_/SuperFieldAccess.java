package java_;
public interface SuperFieldAccess 
 extends AbstractTypeQualifiedExpression
{
	
	public static Ocllib.Set<SuperFieldAccess> allInstances = new Ocllib.Set<SuperFieldAccess>(SuperFieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
}
