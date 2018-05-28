package java_;
public interface AnnotationTypeMemberDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.Set<AnnotationTypeMemberDeclaration> allInstances = new Ocllib.Set<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
	
	Expression getDefault();
	void setDefault(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.Set<AnnotationMemberValuePair> getUsages();
	
}
