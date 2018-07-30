package java_;
public interface TypeDeclarationStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
	/*
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances_ = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
	
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstancesClosure = new Ocllib.QuickSet<TypeDeclarationStatement>(TypeDeclarationStatement.class);
		
	public static Ocllib.QuickSet<TypeDeclarationStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(TypeDeclarationStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AbstractTypeDeclaration getDeclaration();
	void setDeclaration(AbstractTypeDeclaration value);
	
}
