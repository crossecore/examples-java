package java_;
public interface SuperFieldAccess 
 extends AbstractTypeQualifiedExpression
{
	
	public static Ocllib.QuickSet<SuperFieldAccess> allInstances_ = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
		
	public static Ocllib.QuickSet<SuperFieldAccess> allInstances(){
		
		Ocllib.QuickSet<SuperFieldAccess> result = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
		result.addAll(SuperFieldAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SuperFieldAccess> allInstances = new Ocllib.QuickSet<SuperFieldAccess>(SuperFieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
}
