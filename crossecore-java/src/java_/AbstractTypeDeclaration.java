package java_;
public interface AbstractTypeDeclaration 
 extends BodyDeclaration,Type
{
	
	public static com.crossecore.ocl.QuickSet<AbstractTypeDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<AbstractTypeDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<AbstractTypeDeclaration> result = new com.crossecore.ocl.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AbstractTypeDeclaration> allInstances = new com.crossecore.ocl.QuickSet<AbstractTypeDeclaration>(AbstractTypeDeclaration.class);
	
	com.crossecore.ocl.OrderedSet<BodyDeclaration> getBodyDeclarations();
	com.crossecore.ocl.OrderedSet<Comment> getCommentsBeforeBody();
	com.crossecore.ocl.OrderedSet<Comment> getCommentsAfterBody();
	
	Package getPackage();
	void setPackage(Package value);
	com.crossecore.ocl.OrderedSet<TypeAccess> getSuperInterfaces();
	
}
