package java_;
public interface ArrayType 
 extends Type
{
	
	public static Ocllib.Set<ArrayType> allInstances = new Ocllib.Set<ArrayType>(ArrayType.class);
	
	int getDimensions();
	void setDimensions(int value);
	
	TypeAccess getElementType();
	void setElementType(TypeAccess value);
	
}
