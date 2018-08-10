package java_;
public interface FieldDeclaration 
 extends BodyDeclaration,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<FieldDeclaration> allInstances_ = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
		
	public static Ocllib.QuickSet<FieldDeclaration> allInstances(){
		
		Ocllib.QuickSet<FieldDeclaration> result = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
		result.addAll(FieldDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<FieldDeclaration> allInstances = new Ocllib.QuickSet<FieldDeclaration>(FieldDeclaration.class);
	
	
}
