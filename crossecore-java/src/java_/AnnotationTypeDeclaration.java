package java_;
public interface AnnotationTypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances_ = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstancesClosure = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
		
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(AnnotationTypeDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
