package java_;
public interface TypeDeclarationStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances_ = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
		
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances(){
		
		Ocllib.QuickSet<TypeDeclarationStatement> result = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
		result.addAll(TypeDeclarationStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
	
	AbstractTypeDeclaration getDeclaration();
	void setDeclaration(AbstractTypeDeclaration value);
	
}
