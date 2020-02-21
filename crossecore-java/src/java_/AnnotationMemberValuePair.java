package java_;
public interface AnnotationMemberValuePair 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<AnnotationMemberValuePair> allInstances_ = new com.crossecore.ocl.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
		
	public static com.crossecore.ocl.QuickSet<AnnotationMemberValuePair> allInstances(){
		
		com.crossecore.ocl.QuickSet<AnnotationMemberValuePair> result = new com.crossecore.ocl.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
		result.addAll(AnnotationMemberValuePair.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AnnotationMemberValuePair> allInstances = new com.crossecore.ocl.QuickSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class);
	
	
	AnnotationTypeMemberDeclaration getMember();
	void setMember(AnnotationTypeMemberDeclaration value);
	
	Expression getValue();
	void setValue(Expression value);
	
}
