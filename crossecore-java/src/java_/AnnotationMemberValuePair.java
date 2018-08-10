package java_;
public interface AnnotationMemberValuePair 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances_ = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
		
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances(){
		
		Ocllib.QuickSet<AnnotationMemberValuePair> result = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
		result.addAll(AnnotationMemberValuePair.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
	
	AnnotationTypeMemberDeclaration getMember();
	void setMember(AnnotationTypeMemberDeclaration value);
	
	Expression getValue();
	void setValue(Expression value);
	
}
