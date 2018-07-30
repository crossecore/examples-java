package java_;
public interface TypeAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.QuickSet<TypeAccess> allInstances = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
	
	/*
	public static Ocllib.QuickSet<TypeAccess> allInstances_ = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
	
	public static Ocllib.QuickSet<TypeAccess> allInstancesClosure = new Ocllib.QuickSet<TypeAccess>(TypeAccess.class);
		
	public static Ocllib.QuickSet<TypeAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(NamespaceAccess.allInstances_);
			allInstancesClosure.addAll(TypeAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Type getType();
	void setType(Type value);
	
	NamespaceAccess getQualifier();
	void setQualifier(NamespaceAccess value);
	
}
