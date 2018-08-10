package java_;
public interface NullLiteral 
 extends Expression
{
	
	public static Ocllib.QuickSet<NullLiteral> allInstances_ = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
	
		
	public static Ocllib.QuickSet<NullLiteral> allInstances(){
		
		Ocllib.QuickSet<NullLiteral> result = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
		result.addAll(NullLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<NullLiteral> allInstances = new Ocllib.QuickSet<NullLiteral>(NullLiteral.class);
	
	
}
