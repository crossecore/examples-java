package java_;
public interface ASTNode 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<ASTNode> allInstances = new Ocllib.QuickSet<ASTNode>(ASTNode.class);
	
	/*
	public static Ocllib.QuickSet<ASTNode> allInstances_ = new Ocllib.QuickSet<ASTNode>(ASTNode.class);
	
	public static Ocllib.QuickSet<ASTNode> allInstancesClosure = new Ocllib.QuickSet<ASTNode>(ASTNode.class);
		
	public static Ocllib.QuickSet<ASTNode> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<Comment> getComments();
	
	CompilationUnit getOriginalCompilationUnit();
	void setOriginalCompilationUnit(CompilationUnit value);
	
	ClassFile getOriginalClassFile();
	void setOriginalClassFile(ClassFile value);
	
}
