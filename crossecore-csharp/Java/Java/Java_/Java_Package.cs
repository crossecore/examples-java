/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
	 	using Ecore;
namespace Java_{
	public interface Java_Package : EPackage {
			
		EClass getASTNode();
		EReference getASTNode_Comments();
		EReference getASTNode_OriginalCompilationUnit();
		EReference getASTNode_OriginalClassFile();
		
		EClass getNamedElement();
		EReference getNamedElement_UsagesInImports();
		
		EAttribute getNamedElement_Name();
		EAttribute getNamedElement_Proxy();
		EClass getBodyDeclaration();
		EReference getBodyDeclaration_AbstractTypeDeclaration();
		EReference getBodyDeclaration_Annotations();
		EReference getBodyDeclaration_AnonymousClassDeclarationOwner();
		EReference getBodyDeclaration_Modifier();
		
		EClass getAbstractMethodDeclaration();
		EReference getAbstractMethodDeclaration_Body();
		EReference getAbstractMethodDeclaration_Parameters();
		EReference getAbstractMethodDeclaration_ThrownExceptions();
		EReference getAbstractMethodDeclaration_TypeParameters();
		EReference getAbstractMethodDeclaration_UsagesInDocComments();
		EReference getAbstractMethodDeclaration_Usages();
		
		EClass getAbstractMethodInvocation();
		EReference getAbstractMethodInvocation_Method();
		EReference getAbstractMethodInvocation_Arguments();
		EReference getAbstractMethodInvocation_TypeArguments();
		
		EClass getType();
		EReference getType_UsagesInTypeAccess();
		
		EClass getAbstractTypeDeclaration();
		EReference getAbstractTypeDeclaration_BodyDeclarations();
		EReference getAbstractTypeDeclaration_CommentsBeforeBody();
		EReference getAbstractTypeDeclaration_CommentsAfterBody();
		EReference getAbstractTypeDeclaration_Package();
		EReference getAbstractTypeDeclaration_SuperInterfaces();
		
		EClass getExpression();
		
		EClass getAbstractTypeQualifiedExpression();
		EReference getAbstractTypeQualifiedExpression_Qualifier();
		
		EClass getAbstractVariablesContainer();
		EReference getAbstractVariablesContainer_Type();
		EReference getAbstractVariablesContainer_Fragments();
		
		EClass getAnnotation();
		EReference getAnnotation_Type();
		EReference getAnnotation_Values();
		
		EClass getArchive();
		EReference getArchive_ClassFiles();
		EReference getArchive_Manifest();
		
		EAttribute getArchive_OriginalFilePath();
		EClass getStatement();
		
		EClass getAssertStatement();
		EReference getAssertStatement_Message();
		EReference getAssertStatement_Expression();
		
		EClass getAnnotationMemberValuePair();
		EReference getAnnotationMemberValuePair_Member();
		EReference getAnnotationMemberValuePair_Value();
		
		EClass getAnnotationTypeDeclaration();
		
		EClass getAnnotationTypeMemberDeclaration();
		EReference getAnnotationTypeMemberDeclaration_Default();
		EReference getAnnotationTypeMemberDeclaration_Type();
		EReference getAnnotationTypeMemberDeclaration_Usages();
		
		EClass getAnonymousClassDeclaration();
		EReference getAnonymousClassDeclaration_BodyDeclarations();
		EReference getAnonymousClassDeclaration_ClassInstanceCreation();
		
		EClass getArrayAccess();
		EReference getArrayAccess_Array();
		EReference getArrayAccess_Index();
		
		EClass getArrayCreation();
		EReference getArrayCreation_Dimensions();
		EReference getArrayCreation_Initializer();
		EReference getArrayCreation_Type();
		
		EClass getArrayInitializer();
		EReference getArrayInitializer_Expressions();
		
		EClass getArrayLengthAccess();
		EReference getArrayLengthAccess_Array();
		
		EClass getArrayType();
		EReference getArrayType_ElementType();
		
		EAttribute getArrayType_Dimensions();
		EClass getAssignment();
		EReference getAssignment_LeftHandSide();
		EReference getAssignment_RightHandSide();
		
		EAttribute getAssignment_Operator();
		EClass getBooleanLiteral();
		
		EAttribute getBooleanLiteral_Value();
		EClass getComment();
		
		EAttribute getComment_Content();
		EAttribute getComment_EnclosedByParent();
		EAttribute getComment_PrefixOfParent();
		EClass getBlockComment();
		
		EClass getBlock();
		EReference getBlock_Statements();
		
		EClass getBreakStatement();
		EReference getBreakStatement_Label();
		
		EClass getCastExpression();
		EReference getCastExpression_Expression();
		EReference getCastExpression_Type();
		
		EClass getCatchClause();
		EReference getCatchClause_Exception();
		EReference getCatchClause_Body();
		
		EClass getCharacterLiteral();
		
		EAttribute getCharacterLiteral_EscapedValue();
		EClass getClassFile();
		EReference getClassFile_Type();
		EReference getClassFile_AttachedSource();
		EReference getClassFile_Package();
		
		EAttribute getClassFile_OriginalFilePath();
		EClass getClassInstanceCreation();
		EReference getClassInstanceCreation_AnonymousClassDeclaration();
		EReference getClassInstanceCreation_Expression();
		EReference getClassInstanceCreation_Type();
		
		EClass getConstructorDeclaration();
		
		EClass getConditionalExpression();
		EReference getConditionalExpression_ElseExpression();
		EReference getConditionalExpression_Expression();
		EReference getConditionalExpression_ThenExpression();
		
		EClass getConstructorInvocation();
		
		EClass getTypeDeclaration();
		EReference getTypeDeclaration_TypeParameters();
		
		EClass getClassDeclaration();
		EReference getClassDeclaration_SuperClass();
		
		EClass getCompilationUnit();
		EReference getCompilationUnit_CommentList();
		EReference getCompilationUnit_Imports();
		EReference getCompilationUnit_Package();
		EReference getCompilationUnit_Types();
		
		EAttribute getCompilationUnit_OriginalFilePath();
		EClass getContinueStatement();
		EReference getContinueStatement_Label();
		
		EClass getDoStatement();
		EReference getDoStatement_Expression();
		EReference getDoStatement_Body();
		
		EClass getEmptyStatement();
		
		EClass getEnhancedForStatement();
		EReference getEnhancedForStatement_Body();
		EReference getEnhancedForStatement_Expression();
		EReference getEnhancedForStatement_Parameter();
		
		EClass getVariableDeclaration();
		EReference getVariableDeclaration_Initializer();
		EReference getVariableDeclaration_UsageInVariableAccess();
		
		EAttribute getVariableDeclaration_ExtraArrayDimensions();
		EClass getEnumConstantDeclaration();
		EReference getEnumConstantDeclaration_AnonymousClassDeclaration();
		EReference getEnumConstantDeclaration_Arguments();
		
		EClass getEnumDeclaration();
		EReference getEnumDeclaration_EnumConstants();
		
		EClass getExpressionStatement();
		EReference getExpressionStatement_Expression();
		
		EClass getFieldAccess();
		EReference getFieldAccess_Field();
		EReference getFieldAccess_Expression();
		
		EClass getFieldDeclaration();
		
		EClass getForStatement();
		EReference getForStatement_Expression();
		EReference getForStatement_Updaters();
		EReference getForStatement_Initializers();
		EReference getForStatement_Body();
		
		EClass getIfStatement();
		EReference getIfStatement_Expression();
		EReference getIfStatement_ThenStatement();
		EReference getIfStatement_ElseStatement();
		
		EClass getImportDeclaration();
		EReference getImportDeclaration_ImportedElement();
		
		EAttribute getImportDeclaration_Static();
		EClass getInfixExpression();
		EReference getInfixExpression_RightOperand();
		EReference getInfixExpression_LeftOperand();
		EReference getInfixExpression_ExtendedOperands();
		
		EAttribute getInfixExpression_Operator();
		EClass getInitializer();
		EReference getInitializer_Body();
		
		EClass getInstanceofExpression();
		EReference getInstanceofExpression_RightOperand();
		EReference getInstanceofExpression_LeftOperand();
		
		EClass getInterfaceDeclaration();
		
		EClass getJavadoc();
		EReference getJavadoc_Tags();
		
		EClass getLabeledStatement();
		EReference getLabeledStatement_Body();
		EReference getLabeledStatement_UsagesInBreakStatements();
		EReference getLabeledStatement_UsagesInContinueStatements();
		
		EClass getLineComment();
		
		EClass getManifest();
		EReference getManifest_MainAttributes();
		EReference getManifest_EntryAttributes();
		
		EClass getManifestAttribute();
		
		EAttribute getManifestAttribute_Key();
		EAttribute getManifestAttribute_Value();
		EClass getManifestEntry();
		EReference getManifestEntry_Attributes();
		
		EAttribute getManifestEntry_Name();
		EClass getMemberRef();
		EReference getMemberRef_Member();
		EReference getMemberRef_Qualifier();
		
		EClass getMethodDeclaration();
		EReference getMethodDeclaration_ReturnType();
		EReference getMethodDeclaration_RedefinedMethodDeclaration();
		EReference getMethodDeclaration_Redefinitions();
		
		EAttribute getMethodDeclaration_ExtraArrayDimensions();
		EClass getMethodInvocation();
		EReference getMethodInvocation_Expression();
		
		EClass getMethodRef();
		EReference getMethodRef_Method();
		EReference getMethodRef_Qualifier();
		EReference getMethodRef_Parameters();
		
		EClass getMethodRefParameter();
		EReference getMethodRefParameter_Type();
		
		EAttribute getMethodRefParameter_Name();
		EAttribute getMethodRefParameter_Varargs();
		EClass getModel();
		EReference getModel_OwnedElements();
		EReference getModel_OrphanTypes();
		EReference getModel_UnresolvedItems();
		EReference getModel_CompilationUnits();
		EReference getModel_ClassFiles();
		EReference getModel_Archives();
		
		EAttribute getModel_Name();
		EClass getModifier();
		EReference getModifier_BodyDeclaration();
		EReference getModifier_SingleVariableDeclaration();
		EReference getModifier_VariableDeclarationStatement();
		EReference getModifier_VariableDeclarationExpression();
		
		EAttribute getModifier_Visibility();
		EAttribute getModifier_Inheritance();
		EAttribute getModifier_Static();
		EAttribute getModifier_Transient();
		EAttribute getModifier_Volatile();
		EAttribute getModifier_Native();
		EAttribute getModifier_Strictfp();
		EAttribute getModifier_Synchronized();
		EClass getNamespaceAccess();
		
		EClass getNumberLiteral();
		
		EAttribute getNumberLiteral_TokenValue();
		EClass getNullLiteral();
		
		EClass getPackage();
		EReference getPackage_OwnedElements();
		EReference getPackage_Model();
		EReference getPackage_OwnedPackages();
		EReference getPackage_Package();
		EReference getPackage_UsagesInPackageAccess();
		
		EClass getPackageAccess();
		EReference getPackageAccess_Package();
		EReference getPackageAccess_Qualifier();
		
		EClass getParameterizedType();
		EReference getParameterizedType_Type();
		EReference getParameterizedType_TypeArguments();
		
		EClass getParenthesizedExpression();
		EReference getParenthesizedExpression_Expression();
		
		EClass getPostfixExpression();
		EReference getPostfixExpression_Operand();
		
		EAttribute getPostfixExpression_Operator();
		EClass getPrefixExpression();
		EReference getPrefixExpression_Operand();
		
		EAttribute getPrefixExpression_Operator();
		EClass getPrimitiveType();
		
		EClass getPrimitiveTypeBoolean();
		
		EClass getPrimitiveTypeByte();
		
		EClass getPrimitiveTypeChar();
		
		EClass getPrimitiveTypeDouble();
		
		EClass getPrimitiveTypeShort();
		
		EClass getPrimitiveTypeFloat();
		
		EClass getPrimitiveTypeInt();
		
		EClass getPrimitiveTypeLong();
		
		EClass getPrimitiveTypeVoid();
		
		EClass getReturnStatement();
		EReference getReturnStatement_Expression();
		
		EClass getSingleVariableAccess();
		EReference getSingleVariableAccess_Variable();
		EReference getSingleVariableAccess_Qualifier();
		
		EClass getSingleVariableDeclaration();
		EReference getSingleVariableDeclaration_Modifier();
		EReference getSingleVariableDeclaration_Type();
		EReference getSingleVariableDeclaration_Annotations();
		EReference getSingleVariableDeclaration_MethodDeclaration();
		EReference getSingleVariableDeclaration_CatchClause();
		EReference getSingleVariableDeclaration_EnhancedForStatement();
		
		EAttribute getSingleVariableDeclaration_Varargs();
		EClass getStringLiteral();
		
		EAttribute getStringLiteral_EscapedValue();
		EClass getSuperConstructorInvocation();
		EReference getSuperConstructorInvocation_Expression();
		
		EClass getSuperFieldAccess();
		EReference getSuperFieldAccess_Field();
		
		EClass getSuperMethodInvocation();
		
		EClass getSwitchCase();
		EReference getSwitchCase_Expression();
		
		EAttribute getSwitchCase_Default();
		EClass getSwitchStatement();
		EReference getSwitchStatement_Expression();
		EReference getSwitchStatement_Statements();
		
		EClass getSynchronizedStatement();
		EReference getSynchronizedStatement_Body();
		EReference getSynchronizedStatement_Expression();
		
		EClass getTagElement();
		EReference getTagElement_Fragments();
		
		EAttribute getTagElement_TagName();
		EClass getTextElement();
		
		EAttribute getTextElement_Text();
		EClass getThisExpression();
		
		EClass getThrowStatement();
		EReference getThrowStatement_Expression();
		
		EClass getTryStatement();
		EReference getTryStatement_Body();
		EReference getTryStatement_Finally();
		EReference getTryStatement_CatchClauses();
		
		EClass getTypeAccess();
		EReference getTypeAccess_Type();
		EReference getTypeAccess_Qualifier();
		
		EClass getTypeDeclarationStatement();
		EReference getTypeDeclarationStatement_Declaration();
		
		EClass getTypeLiteral();
		EReference getTypeLiteral_Type();
		
		EClass getTypeParameter();
		EReference getTypeParameter_Bounds();
		
		EClass getUnresolvedItem();
		
		EClass getUnresolvedItemAccess();
		EReference getUnresolvedItemAccess_Element();
		EReference getUnresolvedItemAccess_Qualifier();
		
		EClass getUnresolvedAnnotationDeclaration();
		
		EClass getUnresolvedAnnotationTypeMemberDeclaration();
		
		EClass getUnresolvedClassDeclaration();
		
		EClass getUnresolvedEnumDeclaration();
		
		EClass getUnresolvedInterfaceDeclaration();
		
		EClass getUnresolvedLabeledStatement();
		
		EClass getUnresolvedMethodDeclaration();
		
		EClass getUnresolvedSingleVariableDeclaration();
		
		EClass getUnresolvedType();
		
		EClass getUnresolvedTypeDeclaration();
		
		EClass getVariableDeclarationFragment();
		EReference getVariableDeclarationFragment_VariablesContainer();
		
		EClass getUnresolvedVariableDeclarationFragment();
		
		EClass getVariableDeclarationExpression();
		EReference getVariableDeclarationExpression_Modifier();
		EReference getVariableDeclarationExpression_Annotations();
		
		EClass getVariableDeclarationStatement();
		EReference getVariableDeclarationStatement_Modifier();
		EReference getVariableDeclarationStatement_Annotations();
		
		EAttribute getVariableDeclarationStatement_ExtraArrayDimensions();
		EClass getWildCardType();
		EReference getWildCardType_Bound();
		
		EAttribute getWildCardType_UpperBound();
		EClass getWhileStatement();
		EReference getWhileStatement_Expression();
		EReference getWhileStatement_Body();
		
		EEnum getAssignmentKind();
		EEnum getInfixExpressionKind();
		EEnum getInheritanceKind();
		EEnum getPostfixExpressionKind();
		EEnum getPrefixExpressionKind();
		EEnum getVisibilityKind();
			
	 
	}
}
