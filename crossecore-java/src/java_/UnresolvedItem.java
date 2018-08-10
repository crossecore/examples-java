package java_;
public interface UnresolvedItem 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<UnresolvedItem> allInstances_ = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
		
	public static Ocllib.QuickSet<UnresolvedItem> allInstances(){
		
		Ocllib.QuickSet<UnresolvedItem> result = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
		result.addAll(UnresolvedItem.allInstances_);
		
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(UnresolvedType.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedItem> allInstances = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
	
}
