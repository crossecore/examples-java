package java_;
public interface EnumConstantDeclaration 
 extends BodyDeclaration,VariableDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<EnumConstantDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<EnumConstantDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<EnumConstantDeclaration> result = new com.crossecore.ocl.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
		result.addAll(EnumConstantDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<EnumConstantDeclaration> allInstances = new com.crossecore.ocl.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	com.crossecore.ocl.OrderedSet<Expression> getArguments();
	
}
