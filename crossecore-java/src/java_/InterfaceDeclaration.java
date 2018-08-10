package java_;
public interface InterfaceDeclaration 
 extends TypeDeclaration
{
	
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstances_ = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
		
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstances(){
		
		Ocllib.QuickSet<InterfaceDeclaration> result = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
		result.addAll(InterfaceDeclaration.allInstances_);
		
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<InterfaceDeclaration> allInstances = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
	
}
