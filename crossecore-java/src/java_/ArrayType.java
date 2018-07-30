package java_;
public interface ArrayType 
 extends Type
{
	
	public static Ocllib.QuickSet<ArrayType> allInstances = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
	
	/*
	public static Ocllib.QuickSet<ArrayType> allInstances_ = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
	
	public static Ocllib.QuickSet<ArrayType> allInstancesClosure = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
		
	public static Ocllib.QuickSet<ArrayType> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(ArrayType.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	int getDimensions();
	void setDimensions(int value);
	
	TypeAccess getElementType();
	void setElementType(TypeAccess value);
	
}
