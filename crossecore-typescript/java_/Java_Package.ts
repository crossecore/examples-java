import {EAttribute} from "ecore/EAttribute";
import {EEnum} from "ecore/EEnum";
import {EReference} from "ecore/EReference";
import {EClass} from "ecore/EClass";
import {EPackage} from "ecore/EPackage";
export interface Java_Package extends EPackage {
	getASTNode():EClass;
	getASTNode_Comments():EReference;
	getASTNode_OriginalCompilationUnit():EReference;
	getASTNode_OriginalClassFile():EReference;
	
	getNamedElement():EClass;
	getNamedElement_UsagesInImports():EReference;
	
	getNamedElement_Name():EAttribute;
	getNamedElement_Proxy():EAttribute;
	getBodyDeclaration():EClass;
	getBodyDeclaration_AbstractTypeDeclaration():EReference;
	getBodyDeclaration_Annotations():EReference;
	getBodyDeclaration_AnonymousClassDeclarationOwner():EReference;
	getBodyDeclaration_Modifier():EReference;
	
	getAbstractMethodDeclaration():EClass;
	getAbstractMethodDeclaration_Body():EReference;
	getAbstractMethodDeclaration_Parameters():EReference;
	getAbstractMethodDeclaration_ThrownExceptions():EReference;
	getAbstractMethodDeclaration_TypeParameters():EReference;
	getAbstractMethodDeclaration_UsagesInDocComments():EReference;
	getAbstractMethodDeclaration_Usages():EReference;
	
	getAbstractMethodInvocation():EClass;
	getAbstractMethodInvocation_Method():EReference;
	getAbstractMethodInvocation_Arguments():EReference;
	getAbstractMethodInvocation_TypeArguments():EReference;
	
	getType():EClass;
	getType_UsagesInTypeAccess():EReference;
	
	getAbstractTypeDeclaration():EClass;
	getAbstractTypeDeclaration_BodyDeclarations():EReference;
	getAbstractTypeDeclaration_CommentsBeforeBody():EReference;
	getAbstractTypeDeclaration_CommentsAfterBody():EReference;
	getAbstractTypeDeclaration_Package():EReference;
	getAbstractTypeDeclaration_SuperInterfaces():EReference;
	
	getExpression():EClass;
	
	getAbstractTypeQualifiedExpression():EClass;
	getAbstractTypeQualifiedExpression_Qualifier():EReference;
	
	getAbstractVariablesContainer():EClass;
	getAbstractVariablesContainer_Type():EReference;
	getAbstractVariablesContainer_Fragments():EReference;
	
	getAnnotation():EClass;
	getAnnotation_Type():EReference;
	getAnnotation_Values():EReference;
	
	getArchive():EClass;
	getArchive_ClassFiles():EReference;
	getArchive_Manifest():EReference;
	
	getArchive_OriginalFilePath():EAttribute;
	getStatement():EClass;
	
	getAssertStatement():EClass;
	getAssertStatement_Message():EReference;
	getAssertStatement_Expression():EReference;
	
	getAnnotationMemberValuePair():EClass;
	getAnnotationMemberValuePair_Member():EReference;
	getAnnotationMemberValuePair_Value():EReference;
	
	getAnnotationTypeDeclaration():EClass;
	
	getAnnotationTypeMemberDeclaration():EClass;
	getAnnotationTypeMemberDeclaration_Default():EReference;
	getAnnotationTypeMemberDeclaration_Type():EReference;
	getAnnotationTypeMemberDeclaration_Usages():EReference;
	
	getAnonymousClassDeclaration():EClass;
	getAnonymousClassDeclaration_BodyDeclarations():EReference;
	getAnonymousClassDeclaration_ClassInstanceCreation():EReference;
	
	getArrayAccess():EClass;
	getArrayAccess_Array():EReference;
	getArrayAccess_Index():EReference;
	
	getArrayCreation():EClass;
	getArrayCreation_Dimensions():EReference;
	getArrayCreation_Initializer():EReference;
	getArrayCreation_Type():EReference;
	
	getArrayInitializer():EClass;
	getArrayInitializer_Expressions():EReference;
	
	getArrayLengthAccess():EClass;
	getArrayLengthAccess_Array():EReference;
	
	getArrayType():EClass;
	getArrayType_ElementType():EReference;
	
	getArrayType_Dimensions():EAttribute;
	getAssignment():EClass;
	getAssignment_LeftHandSide():EReference;
	getAssignment_RightHandSide():EReference;
	
	getAssignment_Operator():EAttribute;
	getBooleanLiteral():EClass;
	
	getBooleanLiteral_Value():EAttribute;
	getComment():EClass;
	
	getComment_Content():EAttribute;
	getComment_EnclosedByParent():EAttribute;
	getComment_PrefixOfParent():EAttribute;
	getBlockComment():EClass;
	
	getBlock():EClass;
	getBlock_Statements():EReference;
	
	getBreakStatement():EClass;
	getBreakStatement_Label():EReference;
	
	getCastExpression():EClass;
	getCastExpression_Expression():EReference;
	getCastExpression_Type():EReference;
	
	getCatchClause():EClass;
	getCatchClause_Exception():EReference;
	getCatchClause_Body():EReference;
	
	getCharacterLiteral():EClass;
	
	getCharacterLiteral_EscapedValue():EAttribute;
	getClassFile():EClass;
	getClassFile_Type():EReference;
	getClassFile_AttachedSource():EReference;
	getClassFile_Package():EReference;
	
	getClassFile_OriginalFilePath():EAttribute;
	getClassInstanceCreation():EClass;
	getClassInstanceCreation_AnonymousClassDeclaration():EReference;
	getClassInstanceCreation_Expression():EReference;
	getClassInstanceCreation_Type():EReference;
	
	getConstructorDeclaration():EClass;
	
	getConditionalExpression():EClass;
	getConditionalExpression_ElseExpression():EReference;
	getConditionalExpression_Expression():EReference;
	getConditionalExpression_ThenExpression():EReference;
	
	getConstructorInvocation():EClass;
	
	getTypeDeclaration():EClass;
	getTypeDeclaration_TypeParameters():EReference;
	
	getClassDeclaration():EClass;
	getClassDeclaration_SuperClass():EReference;
	
	getCompilationUnit():EClass;
	getCompilationUnit_CommentList():EReference;
	getCompilationUnit_Imports():EReference;
	getCompilationUnit_Package():EReference;
	getCompilationUnit_Types():EReference;
	
	getCompilationUnit_OriginalFilePath():EAttribute;
	getContinueStatement():EClass;
	getContinueStatement_Label():EReference;
	
	getDoStatement():EClass;
	getDoStatement_Expression():EReference;
	getDoStatement_Body():EReference;
	
	getEmptyStatement():EClass;
	
	getEnhancedForStatement():EClass;
	getEnhancedForStatement_Body():EReference;
	getEnhancedForStatement_Expression():EReference;
	getEnhancedForStatement_Parameter():EReference;
	
	getVariableDeclaration():EClass;
	getVariableDeclaration_Initializer():EReference;
	getVariableDeclaration_UsageInVariableAccess():EReference;
	
	getVariableDeclaration_ExtraArrayDimensions():EAttribute;
	getEnumConstantDeclaration():EClass;
	getEnumConstantDeclaration_AnonymousClassDeclaration():EReference;
	getEnumConstantDeclaration_Arguments():EReference;
	
	getEnumDeclaration():EClass;
	getEnumDeclaration_EnumConstants():EReference;
	
	getExpressionStatement():EClass;
	getExpressionStatement_Expression():EReference;
	
	getFieldAccess():EClass;
	getFieldAccess_Field():EReference;
	getFieldAccess_Expression():EReference;
	
	getFieldDeclaration():EClass;
	
	getForStatement():EClass;
	getForStatement_Expression():EReference;
	getForStatement_Updaters():EReference;
	getForStatement_Initializers():EReference;
	getForStatement_Body():EReference;
	
	getIfStatement():EClass;
	getIfStatement_Expression():EReference;
	getIfStatement_ThenStatement():EReference;
	getIfStatement_ElseStatement():EReference;
	
	getImportDeclaration():EClass;
	getImportDeclaration_ImportedElement():EReference;
	
	getImportDeclaration_Static():EAttribute;
	getInfixExpression():EClass;
	getInfixExpression_RightOperand():EReference;
	getInfixExpression_LeftOperand():EReference;
	getInfixExpression_ExtendedOperands():EReference;
	
	getInfixExpression_Operator():EAttribute;
	getInitializer():EClass;
	getInitializer_Body():EReference;
	
	getInstanceofExpression():EClass;
	getInstanceofExpression_RightOperand():EReference;
	getInstanceofExpression_LeftOperand():EReference;
	
	getInterfaceDeclaration():EClass;
	
	getJavadoc():EClass;
	getJavadoc_Tags():EReference;
	
	getLabeledStatement():EClass;
	getLabeledStatement_Body():EReference;
	getLabeledStatement_UsagesInBreakStatements():EReference;
	getLabeledStatement_UsagesInContinueStatements():EReference;
	
	getLineComment():EClass;
	
	getManifest():EClass;
	getManifest_MainAttributes():EReference;
	getManifest_EntryAttributes():EReference;
	
	getManifestAttribute():EClass;
	
	getManifestAttribute_Key():EAttribute;
	getManifestAttribute_Value():EAttribute;
	getManifestEntry():EClass;
	getManifestEntry_Attributes():EReference;
	
	getManifestEntry_Name():EAttribute;
	getMemberRef():EClass;
	getMemberRef_Member():EReference;
	getMemberRef_Qualifier():EReference;
	
	getMethodDeclaration():EClass;
	getMethodDeclaration_ReturnType():EReference;
	getMethodDeclaration_RedefinedMethodDeclaration():EReference;
	getMethodDeclaration_Redefinitions():EReference;
	
	getMethodDeclaration_ExtraArrayDimensions():EAttribute;
	getMethodInvocation():EClass;
	getMethodInvocation_Expression():EReference;
	
	getMethodRef():EClass;
	getMethodRef_Method():EReference;
	getMethodRef_Qualifier():EReference;
	getMethodRef_Parameters():EReference;
	
	getMethodRefParameter():EClass;
	getMethodRefParameter_Type():EReference;
	
	getMethodRefParameter_Name():EAttribute;
	getMethodRefParameter_Varargs():EAttribute;
	getModel():EClass;
	getModel_OwnedElements():EReference;
	getModel_OrphanTypes():EReference;
	getModel_UnresolvedItems():EReference;
	getModel_CompilationUnits():EReference;
	getModel_ClassFiles():EReference;
	getModel_Archives():EReference;
	
	getModel_Name():EAttribute;
	getModifier():EClass;
	getModifier_BodyDeclaration():EReference;
	getModifier_SingleVariableDeclaration():EReference;
	getModifier_VariableDeclarationStatement():EReference;
	getModifier_VariableDeclarationExpression():EReference;
	
	getModifier_Visibility():EAttribute;
	getModifier_Inheritance():EAttribute;
	getModifier_Static():EAttribute;
	getModifier_Transient():EAttribute;
	getModifier_Volatile():EAttribute;
	getModifier_Native():EAttribute;
	getModifier_Strictfp():EAttribute;
	getModifier_Synchronized():EAttribute;
	getNamespaceAccess():EClass;
	
	getNumberLiteral():EClass;
	
	getNumberLiteral_TokenValue():EAttribute;
	getNullLiteral():EClass;
	
	getPackage():EClass;
	getPackage_OwnedElements():EReference;
	getPackage_Model():EReference;
	getPackage_OwnedPackages():EReference;
	getPackage_Package():EReference;
	getPackage_UsagesInPackageAccess():EReference;
	
	getPackageAccess():EClass;
	getPackageAccess_Package():EReference;
	getPackageAccess_Qualifier():EReference;
	
	getParameterizedType():EClass;
	getParameterizedType_Type():EReference;
	getParameterizedType_TypeArguments():EReference;
	
	getParenthesizedExpression():EClass;
	getParenthesizedExpression_Expression():EReference;
	
	getPostfixExpression():EClass;
	getPostfixExpression_Operand():EReference;
	
	getPostfixExpression_Operator():EAttribute;
	getPrefixExpression():EClass;
	getPrefixExpression_Operand():EReference;
	
	getPrefixExpression_Operator():EAttribute;
	getPrimitiveType():EClass;
	
	getPrimitiveTypeBoolean():EClass;
	
	getPrimitiveTypeByte():EClass;
	
	getPrimitiveTypeChar():EClass;
	
	getPrimitiveTypeDouble():EClass;
	
	getPrimitiveTypeShort():EClass;
	
	getPrimitiveTypeFloat():EClass;
	
	getPrimitiveTypeInt():EClass;
	
	getPrimitiveTypeLong():EClass;
	
	getPrimitiveTypeVoid():EClass;
	
	getReturnStatement():EClass;
	getReturnStatement_Expression():EReference;
	
	getSingleVariableAccess():EClass;
	getSingleVariableAccess_Variable():EReference;
	getSingleVariableAccess_Qualifier():EReference;
	
	getSingleVariableDeclaration():EClass;
	getSingleVariableDeclaration_Modifier():EReference;
	getSingleVariableDeclaration_Type():EReference;
	getSingleVariableDeclaration_Annotations():EReference;
	getSingleVariableDeclaration_MethodDeclaration():EReference;
	getSingleVariableDeclaration_CatchClause():EReference;
	getSingleVariableDeclaration_EnhancedForStatement():EReference;
	
	getSingleVariableDeclaration_Varargs():EAttribute;
	getStringLiteral():EClass;
	
	getStringLiteral_EscapedValue():EAttribute;
	getSuperConstructorInvocation():EClass;
	getSuperConstructorInvocation_Expression():EReference;
	
	getSuperFieldAccess():EClass;
	getSuperFieldAccess_Field():EReference;
	
	getSuperMethodInvocation():EClass;
	
	getSwitchCase():EClass;
	getSwitchCase_Expression():EReference;
	
	getSwitchCase_Default():EAttribute;
	getSwitchStatement():EClass;
	getSwitchStatement_Expression():EReference;
	getSwitchStatement_Statements():EReference;
	
	getSynchronizedStatement():EClass;
	getSynchronizedStatement_Body():EReference;
	getSynchronizedStatement_Expression():EReference;
	
	getTagElement():EClass;
	getTagElement_Fragments():EReference;
	
	getTagElement_TagName():EAttribute;
	getTextElement():EClass;
	
	getTextElement_Text():EAttribute;
	getThisExpression():EClass;
	
	getThrowStatement():EClass;
	getThrowStatement_Expression():EReference;
	
	getTryStatement():EClass;
	getTryStatement_Body():EReference;
	getTryStatement_Finally():EReference;
	getTryStatement_CatchClauses():EReference;
	
	getTypeAccess():EClass;
	getTypeAccess_Type():EReference;
	getTypeAccess_Qualifier():EReference;
	
	getTypeDeclarationStatement():EClass;
	getTypeDeclarationStatement_Declaration():EReference;
	
	getTypeLiteral():EClass;
	getTypeLiteral_Type():EReference;
	
	getTypeParameter():EClass;
	getTypeParameter_Bounds():EReference;
	
	getUnresolvedItem():EClass;
	
	getUnresolvedItemAccess():EClass;
	getUnresolvedItemAccess_Element():EReference;
	getUnresolvedItemAccess_Qualifier():EReference;
	
	getUnresolvedAnnotationDeclaration():EClass;
	
	getUnresolvedAnnotationTypeMemberDeclaration():EClass;
	
	getUnresolvedClassDeclaration():EClass;
	
	getUnresolvedEnumDeclaration():EClass;
	
	getUnresolvedInterfaceDeclaration():EClass;
	
	getUnresolvedLabeledStatement():EClass;
	
	getUnresolvedMethodDeclaration():EClass;
	
	getUnresolvedSingleVariableDeclaration():EClass;
	
	getUnresolvedType():EClass;
	
	getUnresolvedTypeDeclaration():EClass;
	
	getVariableDeclarationFragment():EClass;
	getVariableDeclarationFragment_VariablesContainer():EReference;
	
	getUnresolvedVariableDeclarationFragment():EClass;
	
	getVariableDeclarationExpression():EClass;
	getVariableDeclarationExpression_Modifier():EReference;
	getVariableDeclarationExpression_Annotations():EReference;
	
	getVariableDeclarationStatement():EClass;
	getVariableDeclarationStatement_Modifier():EReference;
	getVariableDeclarationStatement_Annotations():EReference;
	
	getVariableDeclarationStatement_ExtraArrayDimensions():EAttribute;
	getWildCardType():EClass;
	getWildCardType_Bound():EReference;
	
	getWildCardType_UpperBound():EAttribute;
	getWhileStatement():EClass;
	getWhileStatement_Expression():EReference;
	getWhileStatement_Body():EReference;
	
	getAssignmentKind():EEnum;
	getInfixExpressionKind():EEnum;
	getInheritanceKind():EEnum;
	getPostfixExpressionKind():EEnum;
	getPrefixExpressionKind():EEnum;
	getVisibilityKind():EEnum;
}
