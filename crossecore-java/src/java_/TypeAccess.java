package java_;
public interface TypeAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.QuickSet<TypeAccess> allInstances_ = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
	
		
	public static Ocllib.QuickSet<TypeAccess> allInstances(){
		
		Ocllib.QuickSet<TypeAccess> result = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
		result.addAll(TypeAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TypeAccess> allInstances = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
	
	
	Type getType();
	void setType(Type value);
	
	NamespaceAccess getQualifier();
	void setQualifier(NamespaceAccess value);
	
}
