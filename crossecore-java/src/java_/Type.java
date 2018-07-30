package java_;
public interface Type 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Type> allInstances = new Ocllib.QuickSet<Type>(Type.class);
	
	/*
	public static Ocllib.QuickSet<Type> allInstances_ = new Ocllib.QuickSet<Type>(Type.class);
	
	public static Ocllib.QuickSet<Type> allInstancesClosure = new Ocllib.QuickSet<Type>(Type.class);
		
	public static Ocllib.QuickSet<Type> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.Set<TypeAccess> getUsagesInTypeAccess();
	
}
