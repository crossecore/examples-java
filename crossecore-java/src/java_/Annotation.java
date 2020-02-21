package java_;
public interface Annotation 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<Annotation> allInstances_ = new com.crossecore.ocl.QuickSet<Annotation>(Annotation.class);
	
		
	public static com.crossecore.ocl.QuickSet<Annotation> allInstances(){
		
		com.crossecore.ocl.QuickSet<Annotation> result = new com.crossecore.ocl.QuickSet<Annotation>(Annotation.class);
		result.addAll(Annotation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Annotation> allInstances = new com.crossecore.ocl.QuickSet<Annotation>(Annotation.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	com.crossecore.ocl.OrderedSet<AnnotationMemberValuePair> getValues();
	
}
