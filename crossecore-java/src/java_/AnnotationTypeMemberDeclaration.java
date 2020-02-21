package java_;
public interface AnnotationTypeMemberDeclaration 
 extends BodyDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration> result = new com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
		result.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration> allInstances = new com.crossecore.ocl.QuickSet<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class);
	
	
	Expression getDefault();
	void setDefault(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	com.crossecore.ocl.Set<AnnotationMemberValuePair> getUsages();
	
}
