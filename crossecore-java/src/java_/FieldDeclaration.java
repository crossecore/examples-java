package java_;
public interface FieldDeclaration 
 extends BodyDeclaration,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<FieldDeclaration> allInstances = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<FieldDeclaration> allInstances_ = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
	public static Ocllib.QuickSet<FieldDeclaration> allInstancesClosure = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
		
	public static Ocllib.QuickSet<FieldDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AbstractVariablesContainer.allInstances_);
			allInstancesClosure.addAll(FieldDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
