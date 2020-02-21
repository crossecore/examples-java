package java_;
public interface ArrayCreation 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ArrayCreation> allInstances_ = new com.crossecore.ocl.QuickSet<ArrayCreation>(ArrayCreation.class);
	
		
	public static com.crossecore.ocl.QuickSet<ArrayCreation> allInstances(){
		
		com.crossecore.ocl.QuickSet<ArrayCreation> result = new com.crossecore.ocl.QuickSet<ArrayCreation>(ArrayCreation.class);
		result.addAll(ArrayCreation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ArrayCreation> allInstances = new com.crossecore.ocl.QuickSet<ArrayCreation>(ArrayCreation.class);
	
	com.crossecore.ocl.OrderedSet<Expression> getDimensions();
	
	ArrayInitializer getInitializer();
	void setInitializer(ArrayInitializer value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
