package java_;
public interface WildCardType 
 extends Type
{
	
	public static Ocllib.QuickSet<WildCardType> allInstances_ = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
	
		
	public static Ocllib.QuickSet<WildCardType> allInstances(){
		
		Ocllib.QuickSet<WildCardType> result = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
		result.addAll(WildCardType.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<WildCardType> allInstances = new Ocllib.QuickSet<WildCardType>(WildCardType.class);
	
	boolean isUpperBound();
	void setUpperBound(boolean value);
	//public boolean isUpperBound();
	
	TypeAccess getBound();
	void setBound(TypeAccess value);
	
}
