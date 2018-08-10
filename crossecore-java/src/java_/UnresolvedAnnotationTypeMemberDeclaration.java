package java_;
public interface UnresolvedAnnotationTypeMemberDeclaration 
 extends AnnotationTypeMemberDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> result = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
	
	
}
