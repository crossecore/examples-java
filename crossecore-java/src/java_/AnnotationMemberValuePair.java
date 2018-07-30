package java_;
public interface AnnotationMemberValuePair 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
	/*
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances_ = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstancesClosure = new Ocllib.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
		
	public static Ocllib.QuickSet<AnnotationMemberValuePair> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(AnnotationMemberValuePair.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AnnotationTypeMemberDeclaration getMember();
	void setMember(AnnotationTypeMemberDeclaration value);
	
	Expression getValue();
	void setValue(Expression value);
	
}
