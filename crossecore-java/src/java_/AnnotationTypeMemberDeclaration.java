package java_;
public interface AnnotationTypeMemberDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances_ = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
		
	public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances(){
		
		Ocllib.QuickSet<AnnotationTypeMemberDeclaration> result = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
		result.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AnnotationTypeMemberDeclaration> allInstances = new Ocllib.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
	
	Expression getDefault();
	void setDefault(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.Set<AnnotationMemberValuePair> getUsages();
	
}
