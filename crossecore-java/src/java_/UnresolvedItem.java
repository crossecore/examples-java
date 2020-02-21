package java_;
public interface UnresolvedItem 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedItem> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedItem> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedItem> result = new com.crossecore.ocl.QuickSet<UnresolvedItem>(UnresolvedItem.class);
		result.addAll(UnresolvedItem.allInstances_);
		
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(UnresolvedType.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedItem> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
	
}
