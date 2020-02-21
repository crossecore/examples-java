package java_;
public interface FieldDeclaration 
 extends BodyDeclaration,AbstractVariablesContainer
{
	
	public static com.crossecore.ocl.QuickSet<FieldDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<FieldDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<FieldDeclaration> result = new com.crossecore.ocl.QuickSet<FieldDeclaration>(FieldDeclaration.class);
		result.addAll(FieldDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<FieldDeclaration> allInstances = new com.crossecore.ocl.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
	
}
