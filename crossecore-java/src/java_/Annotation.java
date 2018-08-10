package java_;
public interface Annotation 
 extends Expression
{
	
	public static Ocllib.QuickSet<Annotation> allInstances_ = new Ocllib.QuickSet<Annotation>(Annotation.class);
	
		
	public static Ocllib.QuickSet<Annotation> allInstances(){
		
		Ocllib.QuickSet<Annotation> result = new Ocllib.QuickSet<Annotation>(Annotation.class);
		result.addAll(Annotation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Annotation> allInstances = new Ocllib.QuickSet<Annotation>(Annotation.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<AnnotationMemberValuePair> getValues();
	
}
