package java_;
public interface UnresolvedType 
 extends Type,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedType> allInstances_ = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
	
		
	public static Ocllib.QuickSet<UnresolvedType> allInstances(){
		
		Ocllib.QuickSet<UnresolvedType> result = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
		result.addAll(UnresolvedType.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedType> allInstances = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
	
	
}
