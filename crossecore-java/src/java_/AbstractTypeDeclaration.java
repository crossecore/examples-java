package java_;
public interface AbstractTypeDeclaration 
 extends BodyDeclaration,Type
{
	
	public static Ocllib.Set<AbstractTypeDeclaration> allInstances = new Ocllib.Set<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	Ocllib.OrderedSet<Comment> getCommentsBeforeBody();
	Ocllib.OrderedSet<Comment> getCommentsAfterBody();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<TypeAccess> getSuperInterfaces();
	
}
