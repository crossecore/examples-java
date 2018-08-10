package java_;
public interface AbstractTypeDeclaration 
 extends BodyDeclaration,Type
{
	
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances_ = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
		
	public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances(){
		
		Ocllib.QuickSet<AbstractTypeDeclaration> result = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AbstractTypeDeclaration> allInstances = new Ocllib.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	Ocllib.OrderedSet<Comment> getCommentsBeforeBody();
	Ocllib.OrderedSet<Comment> getCommentsAfterBody();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<TypeAccess> getSuperInterfaces();
	
}
