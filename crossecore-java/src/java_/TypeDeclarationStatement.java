package java_;
public interface TypeDeclarationStatement 
 extends Statement
{
	
	public static Ocllib.Set<TypeDeclarationStatement> allInstances = new Ocllib.Set<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
	
	AbstractTypeDeclaration getDeclaration();
	void setDeclaration(AbstractTypeDeclaration value);
	
}
