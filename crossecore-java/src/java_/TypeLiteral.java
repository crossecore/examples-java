package java_;
public interface TypeLiteral 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<TypeLiteral> allInstances_ = new com.crossecore.ocl.QuickSet<TypeLiteral>(TypeLiteral.class);
	
		
	public static com.crossecore.ocl.QuickSet<TypeLiteral> allInstances(){
		
		com.crossecore.ocl.QuickSet<TypeLiteral> result = new com.crossecore.ocl.QuickSet<TypeLiteral>(TypeLiteral.class);
		result.addAll(TypeLiteral.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TypeLiteral> allInstances = new com.crossecore.ocl.QuickSet<TypeLiteral>(TypeLiteral.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
