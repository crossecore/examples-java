package java_;
public interface UnresolvedAnnotationDeclaration 
 extends AnnotationTypeDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedAnnotationDeclaration> result = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
	
}
