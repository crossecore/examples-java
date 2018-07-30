package java_;
public interface AnnotationTypeMemberDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances_ = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstancesClosure = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
		
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getDefault();
	void setDefault(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.Set<AnnotationMemberValuePair> getUsages();
	
}
