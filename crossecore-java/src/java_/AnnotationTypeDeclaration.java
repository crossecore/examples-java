package java_;
public interface AnnotationTypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration> result = new com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration> allInstances = new com.crossecore.ocl.QuickSet<AnnotationTypeDeclaration>(AnnotationTypeDeclaration.class);
	
	
}
