package java_;
public interface UnresolvedAnnotationDeclaration 
 extends AnnotationTypeDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
	
}
