package java_;
public interface TypeLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<TypeLiteral> allInstances_ = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
	
		
	public static Ocllib.QuickSet<TypeLiteral> allInstances(){
		
		Ocllib.QuickSet<TypeLiteral> result = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
		result.addAll(TypeLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TypeLiteral> allInstances = new Ocllib.QuickSet<TypeLiteral>(TypeLiteral.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
