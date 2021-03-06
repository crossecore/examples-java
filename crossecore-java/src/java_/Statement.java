package java_;
public interface Statement 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<Statement> allInstances_ = new com.crossecore.ocl.QuickSet<Statement>(Statement.class);
	
		
	public static com.crossecore.ocl.QuickSet<Statement> allInstances(){
		
		com.crossecore.ocl.QuickSet<Statement> result = new com.crossecore.ocl.QuickSet<Statement>(Statement.class);
		result.addAll(Statement.allInstances_);
		
		result.addAll(EmptyStatement.allInstances_);
		result.addAll(IfStatement.allInstances_);
		result.addAll(ContinueStatement.allInstances_);
		result.addAll(SynchronizedStatement.allInstances_);
		result.addAll(ReturnStatement.allInstances_);
		result.addAll(TypeDeclarationStatement.allInstances_);
		result.addAll(AssertStatement.allInstances_);
		result.addAll(Block.allInstances_);
		result.addAll(SuperConstructorInvocation.allInstances_);
		result.addAll(LabeledStatement.allInstances_);
		result.addAll(SwitchCase.allInstances_);
		result.addAll(BreakStatement.allInstances_);
		result.addAll(VariableDeclarationStatement.allInstances_);
		result.addAll(ForStatement.allInstances_);
		result.addAll(WhileStatement.allInstances_);
		result.addAll(ConstructorInvocation.allInstances_);
		result.addAll(TryStatement.allInstances_);
		result.addAll(SwitchStatement.allInstances_);
		result.addAll(ExpressionStatement.allInstances_);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		result.addAll(EnhancedForStatement.allInstances_);
		result.addAll(ThrowStatement.allInstances_);
		result.addAll(CatchClause.allInstances_);
		result.addAll(DoStatement.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Statement> allInstances = new com.crossecore.ocl.QuickSet<Statement>(Statement.class);
	
	
}
