package java_;
public interface NamedElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<NamedElement> allInstances_ = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
	
		
	public static Ocllib.QuickSet<NamedElement> allInstances(){
		
		Ocllib.QuickSet<NamedElement> result = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
		result.addAll(NamedElement.allInstances_);
		
		result.addAll(PrimitiveType.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(VariableDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(PrimitiveTypeChar.allInstances_);
		result.addAll(BodyDeclaration.allInstances_);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(CompilationUnit.allInstances_);
		result.addAll(UnresolvedItem.allInstances_);
		result.addAll(TypeParameter.allInstances_);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		result.addAll(PrimitiveTypeShort.allInstances_);
		result.addAll(AnnotationMemberValuePair.allInstances_);
		result.addAll(AbstractMethodDeclaration.allInstances_);
		result.addAll(WildCardType.allInstances_);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		result.addAll(PrimitiveTypeLong.allInstances_);
		result.addAll(SingleVariableDeclaration.allInstances_);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		result.addAll(Initializer.allInstances_);
		result.addAll(PrimitiveTypeInt.allInstances_);
		result.addAll(UnresolvedType.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		result.addAll(PrimitiveTypeByte.allInstances_);
		result.addAll(FieldDeclaration.allInstances_);
		result.addAll(Package.allInstances_);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		result.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(ClassFile.allInstances_);
		result.addAll(ArrayType.allInstances_);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		result.addAll(Type.allInstances_);
		result.addAll(MethodDeclaration.allInstances_);
		result.addAll(VariableDeclarationFragment.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(ConstructorDeclaration.allInstances_);
		result.addAll(Archive.allInstances_);
		result.addAll(LabeledStatement.allInstances_);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(ParameterizedType.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(EnumConstantDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<NamedElement> allInstances = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isProxy();
	void setProxy(boolean value);
	//public boolean isProxy();
	Ocllib.Set<ImportDeclaration> getUsagesInImports();
	
}
