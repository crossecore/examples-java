package java_;
public interface VariableDeclarationExpression 
 extends Expression,AbstractVariablesContainer
{
	
	public static com.crossecore.ocl.QuickSet<VariableDeclarationExpression> allInstances_ = new com.crossecore.ocl.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<VariableDeclarationExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<VariableDeclarationExpression> result = new com.crossecore.ocl.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
		result.addAll(VariableDeclarationExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<VariableDeclarationExpression> allInstances = new com.crossecore.ocl.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	com.crossecore.ocl.OrderedSet<Annotation> getAnnotations();
	
}
