package java_;
public interface BodyDeclaration 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<BodyDeclaration> allInstances_ = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
	
		
	public static Ocllib.QuickSet<BodyDeclaration> allInstances(){
		
		Ocllib.QuickSet<BodyDeclaration> result = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
		result.addAll(BodyDeclaration.allInstances_);
		
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		result.addAll(Initializer.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(MethodDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(ConstructorDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(AbstractMethodDeclaration.allInstances_);
		result.addAll(FieldDeclaration.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		result.addAll(EnumConstantDeclaration.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<BodyDeclaration> allInstances = new Ocllib.QuickSet<BodyDeclaration>(BodyDeclaration.class);
	
	
	AbstractTypeDeclaration getAbstractTypeDeclaration();
	void setAbstractTypeDeclaration(AbstractTypeDeclaration value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
	AnonymousClassDeclaration getAnonymousClassDeclarationOwner();
	void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	
}
