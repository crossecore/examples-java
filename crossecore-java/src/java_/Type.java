package java_;
public interface Type 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Type> allInstances_ = new Ocllib.QuickSet<Type>(Type.class);
	
		
	public static Ocllib.QuickSet<Type> allInstances(){
		
		Ocllib.QuickSet<Type> result = new Ocllib.QuickSet<Type>(Type.class);
		result.addAll(Type.allInstances_);
		
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		result.addAll(PrimitiveType.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(PrimitiveTypeInt.allInstances_);
		result.addAll(UnresolvedType.allInstances_);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		result.addAll(PrimitiveTypeByte.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(PrimitiveTypeChar.allInstances_);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(ArrayType.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(TypeParameter.allInstances_);
		result.addAll(PrimitiveTypeShort.allInstances_);
		result.addAll(WildCardType.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(ParameterizedType.allInstances_);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		result.addAll(PrimitiveTypeLong.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Type> allInstances = new Ocllib.QuickSet<Type>(Type.class);
	
	Ocllib.Set<TypeAccess> getUsagesInTypeAccess();
	
}
