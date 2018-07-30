package java_;
public interface WildCardType 
 extends Type
{
	
	public static Ocllib.QuickSet<WildCardType> allInstances = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
	
	/*
	public static Ocllib.QuickSet<WildCardType> allInstances_ = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
	
	public static Ocllib.QuickSet<WildCardType> allInstancesClosure = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
		
	public static Ocllib.QuickSet<WildCardType> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(WildCardType.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	boolean isUpperBound();
	void setUpperBound(boolean value);
	//public boolean isUpperBound();
	
	TypeAccess getBound();
	void setBound(TypeAccess value);
	
}
