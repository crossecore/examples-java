package java_;
public interface AnonymousClassDeclaration 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<AnonymousClassDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<AnonymousClassDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<AnonymousClassDeclaration> result = new com.crossecore.ocl.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
		result.addAll(AnonymousClassDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AnonymousClassDeclaration> allInstances = new com.crossecore.ocl.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
	com.crossecore.ocl.OrderedSet<BodyDeclaration> getBodyDeclarations();
	
	ClassInstanceCreation getClassInstanceCreation();
	void setClassInstanceCreation(ClassInstanceCreation value);
	
}
