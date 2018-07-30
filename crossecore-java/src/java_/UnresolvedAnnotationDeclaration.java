package java_;
public interface UnresolvedAnnotationDeclaration 
 extends AnnotationTypeDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedAnnotationDeclaration>(UnresolvedAnnotationDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedAnnotationDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(AnnotationTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
