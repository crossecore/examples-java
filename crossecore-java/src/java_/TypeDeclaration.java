package java_;
public interface TypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.Set<TypeDeclaration> allInstances = new Ocllib.Set<TypeDeclaration>(TypeDeclaration.class);
	
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	
}
