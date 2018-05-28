package java_;
public interface Modifier 
 extends ASTNode
{
	
	public static Ocllib.Set<Modifier> allInstances = new Ocllib.Set<Modifier>(Modifier.class);
	
	VisibilityKind getVisibility();
	void setVisibility(VisibilityKind value);
	InheritanceKind getInheritance();
	void setInheritance(InheritanceKind value);
	boolean isStatic();
	void setStatic(boolean value);
	//public boolean isStatic();
	boolean isTransient();
	void setTransient(boolean value);
	//public boolean isTransient();
	boolean isVolatile();
	void setVolatile(boolean value);
	//public boolean isVolatile();
	boolean isNative();
	void setNative(boolean value);
	//public boolean isNative();
	boolean isStrictfp();
	void setStrictfp(boolean value);
	//public boolean isStrictfp();
	boolean isSynchronized();
	void setSynchronized(boolean value);
	//public boolean isSynchronized();
	
	BodyDeclaration getBodyDeclaration();
	void setBodyDeclaration(BodyDeclaration value);
	
	SingleVariableDeclaration getSingleVariableDeclaration();
	void setSingleVariableDeclaration(SingleVariableDeclaration value);
	
	VariableDeclarationStatement getVariableDeclarationStatement();
	void setVariableDeclarationStatement(VariableDeclarationStatement value);
	
	VariableDeclarationExpression getVariableDeclarationExpression();
	void setVariableDeclarationExpression(VariableDeclarationExpression value);
	
}
