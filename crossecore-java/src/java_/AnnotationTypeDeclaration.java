package java_;
public interface AnnotationTypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances_ = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
		
	public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances(){
		
		Ocllib.QuickSet<AnnotationTypeDeclaration> result = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AnnotationTypeDeclaration> allInstances = new Ocllib.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
	
}
