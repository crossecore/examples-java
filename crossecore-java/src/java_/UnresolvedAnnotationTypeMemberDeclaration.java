package java_;
public interface UnresolvedAnnotationTypeMemberDeclaration 
 extends AnnotationTypeMemberDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration>(UnresolvedAnnotationTypeMemberDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedAnnotationTypeMemberDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AnnotationTypeMemberDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
