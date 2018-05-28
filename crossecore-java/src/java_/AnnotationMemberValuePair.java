package java_;
public interface AnnotationMemberValuePair 
 extends NamedElement
{
	
	public static Ocllib.Set<AnnotationMemberValuePair> allInstances = new Ocllib.Set<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
	
	AnnotationTypeMemberDeclaration getMember();
	void setMember(AnnotationTypeMemberDeclaration value);
	
	Expression getValue();
	void setValue(Expression value);
	
}
