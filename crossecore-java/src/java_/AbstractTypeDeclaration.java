package java_;
public interface AbstractTypeDeclaration 
 extends BodyDeclaration,Type
{
	
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances_ = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstancesClosure = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
		
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	Ocllib.OrderedSet<Comment> getCommentsBeforeBody();
	Ocllib.OrderedSet<Comment> getCommentsAfterBody();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<TypeAccess> getSuperInterfaces();
	
}
