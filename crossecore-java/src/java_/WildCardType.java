package java_;
public interface WildCardType 
 extends Type
{
	
	public static Ocllib.Set<WildCardType> allInstances = new Ocllib.Set<WildCardType>(WildCardType.class);
	
	boolean isUpperBound();
	void setUpperBound(boolean value);
	//public boolean isUpperBound();
	
	TypeAccess getBound();
	void setBound(TypeAccess value);
	
}
