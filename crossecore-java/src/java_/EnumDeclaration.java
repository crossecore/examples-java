package java_;
public interface EnumDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<EnumDeclaration> allInstances_ = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
		
	public static Ocllib.QuickSet<EnumDeclaration> allInstances(){
		
		Ocllib.QuickSet<EnumDeclaration> result = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
		result.addAll(EnumDeclaration.allInstances_);
		
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<EnumDeclaration> allInstances = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
	Ocllib.OrderedSet<EnumConstantDeclaration> getEnumConstants();
	
}
