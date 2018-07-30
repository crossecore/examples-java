package java_;
public interface BodyDeclaration 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<BodyDeclaration> allInstances = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<BodyDeclaration> allInstances_ = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
	
	public static Ocllib.QuickSet<BodyDeclaration> allInstancesClosure = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
		
	public static Ocllib.QuickSet<BodyDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AbstractTypeDeclaration getAbstractTypeDeclaration();
	void setAbstractTypeDeclaration(AbstractTypeDeclaration value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
	AnonymousClassDeclaration getAnonymousClassDeclarationOwner();
	void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	
}
