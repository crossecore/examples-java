package java_;
public interface TypeDeclarationStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<TypeDeclarationStatement> allInstances_ = new com.crossecore.ocl.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<TypeDeclarationStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<TypeDeclarationStatement> result = new com.crossecore.ocl.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
		result.addAll(TypeDeclarationStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TypeDeclarationStatement> allInstances = new com.crossecore.ocl.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
	
	AbstractTypeDeclaration getDeclaration();
	void setDeclaration(AbstractTypeDeclaration value);
	
}
