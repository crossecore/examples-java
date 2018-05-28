package java_;
public interface ASTNode 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<ASTNode> allInstances = new Ocllib.Set<ASTNode>(ASTNode.class);
	
	Ocllib.OrderedSet<Comment> getComments();
	
	CompilationUnit getOriginalCompilationUnit();
	void setOriginalCompilationUnit(CompilationUnit value);
	
	ClassFile getOriginalClassFile();
	void setOriginalClassFile(ClassFile value);
	
}
