package java_;
public interface EnumDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.Set<EnumDeclaration> allInstances = new Ocllib.Set<EnumDeclaration>(EnumDeclaration.class);
	
	Ocllib.OrderedSet<EnumConstantDeclaration> getEnumConstants();
	
}
