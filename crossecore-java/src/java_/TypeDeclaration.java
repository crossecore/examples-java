package java_;
public interface TypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<TypeDeclaration> allInstances_ = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
		
	public static Ocllib.QuickSet<TypeDeclaration> allInstances(){
		
		Ocllib.QuickSet<TypeDeclaration> result = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
		result.addAll(TypeDeclaration.allInstances_);
		
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TypeDeclaration> allInstances = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	
}
