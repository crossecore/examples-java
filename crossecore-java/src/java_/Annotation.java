package java_;
public interface Annotation 
 extends Expression
{
	
	public static Ocllib.QuickSet<Annotation> allInstances = new Ocllib.QuickSet<Annotation>(Annotation.class);
	
	/*
	public static Ocllib.QuickSet<Annotation> allInstances_ = new Ocllib.QuickSet<Annotation>(Annotation.class);
	
	public static Ocllib.QuickSet<Annotation> allInstancesClosure = new Ocllib.QuickSet<Annotation>(Annotation.class);
		
	public static Ocllib.QuickSet<Annotation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(Annotation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<AnnotationMemberValuePair> getValues();
	
}
