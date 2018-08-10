package java_;
public interface TypeParameter 
 extends Type
{
	
	public static Ocllib.QuickSet<TypeParameter> allInstances_ = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
	
		
	public static Ocllib.QuickSet<TypeParameter> allInstances(){
		
		Ocllib.QuickSet<TypeParameter> result = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
		result.addAll(TypeParameter.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TypeParameter> allInstances = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
	
	Ocllib.OrderedSet<TypeAccess> getBounds();
	
}
