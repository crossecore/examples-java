package java_;
public interface TypeAccess 
 extends Expression,NamespaceAccess
{
	
	public static com.crossecore.ocl.QuickSet<TypeAccess> allInstances_ = new com.crossecore.ocl.QuickSet<TypeAccess>(TypeAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<TypeAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<TypeAccess> result = new com.crossecore.ocl.QuickSet<TypeAccess>(TypeAccess.class);
		result.addAll(TypeAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TypeAccess> allInstances = new com.crossecore.ocl.QuickSet<TypeAccess>(TypeAccess.class);
	
	
	Type getType();
	void setType(Type value);
	
	NamespaceAccess getQualifier();
	void setQualifier(NamespaceAccess value);
	
}
