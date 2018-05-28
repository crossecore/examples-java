package java_;
public interface Annotation 
 extends Expression
{
	
	public static Ocllib.Set<Annotation> allInstances = new Ocllib.Set<Annotation>(Annotation.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<AnnotationMemberValuePair> getValues();
	
}
