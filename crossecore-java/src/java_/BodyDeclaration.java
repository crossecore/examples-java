package java_;
public interface BodyDeclaration 
 extends NamedElement
{
	
	public static Ocllib.Set<BodyDeclaration> allInstances = new Ocllib.Set<BodyDeclaration>(BodyDeclaration.class);
	
	
	AbstractTypeDeclaration getAbstractTypeDeclaration();
	void setAbstractTypeDeclaration(AbstractTypeDeclaration value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
	AnonymousClassDeclaration getAnonymousClassDeclarationOwner();
	void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	
}
