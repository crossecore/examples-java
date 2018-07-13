/**
 */
package java_.impl;

import java_.Annotation;
import java_.AnnotationMemberValuePair;
import java_.AnnotationTypeDeclaration;
import java_.AnnotationTypeMemberDeclaration;
import java_.AnonymousClassDeclaration;
import java_.Archive;
import java_.ArrayAccess;
import java_.ArrayCreation;
import java_.ArrayInitializer;
import java_.ArrayLengthAccess;
import java_.ArrayType;
import java_.AssertStatement;
import java_.Assignment;
import java_.AssignmentKind;
import java_.Block;
import java_.BlockComment;
import java_.BooleanLiteral;
import java_.BreakStatement;
import java_.CastExpression;
import java_.CatchClause;
import java_.CharacterLiteral;
import java_.ClassDeclaration;
import java_.ClassFile;
import java_.ClassInstanceCreation;
import java_.CompilationUnit;
import java_.ConditionalExpression;
import java_.ConstructorDeclaration;
import java_.ConstructorInvocation;
import java_.ContinueStatement;
import java_.DoStatement;
import java_.EmptyStatement;
import java_.EnhancedForStatement;
import java_.EnumConstantDeclaration;
import java_.EnumDeclaration;
import java_.ExpressionStatement;
import java_.FieldAccess;
import java_.FieldDeclaration;
import java_.ForStatement;
import java_.IfStatement;
import java_.ImportDeclaration;
import java_.InfixExpression;
import java_.InfixExpressionKind;
import java_.InheritanceKind;
import java_.Initializer;
import java_.InstanceofExpression;
import java_.InterfaceDeclaration;
import java_.Java_Factory;
import java_.Java_Package;
import java_.Javadoc;
import java_.LabeledStatement;
import java_.LineComment;
import java_.Manifest;
import java_.ManifestAttribute;
import java_.ManifestEntry;
import java_.MemberRef;
import java_.MethodDeclaration;
import java_.MethodInvocation;
import java_.MethodRef;
import java_.MethodRefParameter;
import java_.Model;
import java_.Modifier;
import java_.NullLiteral;
import java_.NumberLiteral;
import java_.PackageAccess;
import java_.ParameterizedType;
import java_.ParenthesizedExpression;
import java_.PostfixExpression;
import java_.PostfixExpressionKind;
import java_.PrefixExpression;
import java_.PrefixExpressionKind;
import java_.PrimitiveType;
import java_.PrimitiveTypeBoolean;
import java_.PrimitiveTypeByte;
import java_.PrimitiveTypeChar;
import java_.PrimitiveTypeDouble;
import java_.PrimitiveTypeFloat;
import java_.PrimitiveTypeInt;
import java_.PrimitiveTypeLong;
import java_.PrimitiveTypeShort;
import java_.PrimitiveTypeVoid;
import java_.ReturnStatement;
import java_.SingleVariableAccess;
import java_.SingleVariableDeclaration;
import java_.StringLiteral;
import java_.SuperConstructorInvocation;
import java_.SuperFieldAccess;
import java_.SuperMethodInvocation;
import java_.SwitchCase;
import java_.SwitchStatement;
import java_.SynchronizedStatement;
import java_.TagElement;
import java_.TextElement;
import java_.ThisExpression;
import java_.ThrowStatement;
import java_.TryStatement;
import java_.TypeAccess;
import java_.TypeDeclarationStatement;
import java_.TypeLiteral;
import java_.TypeParameter;
import java_.UnresolvedAnnotationDeclaration;
import java_.UnresolvedAnnotationTypeMemberDeclaration;
import java_.UnresolvedClassDeclaration;
import java_.UnresolvedEnumDeclaration;
import java_.UnresolvedInterfaceDeclaration;
import java_.UnresolvedItem;
import java_.UnresolvedItemAccess;
import java_.UnresolvedLabeledStatement;
import java_.UnresolvedMethodDeclaration;
import java_.UnresolvedSingleVariableDeclaration;
import java_.UnresolvedType;
import java_.UnresolvedTypeDeclaration;
import java_.UnresolvedVariableDeclarationFragment;
import java_.VariableDeclarationExpression;
import java_.VariableDeclarationFragment;
import java_.VariableDeclarationStatement;
import java_.VisibilityKind;
import java_.WhileStatement;
import java_.WildCardType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java_FactoryImpl extends EFactoryImpl implements Java_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java_Factory init() {
		try {
			Java_Factory theJava_Factory = (Java_Factory)EPackage.Registry.INSTANCE.getEFactory(Java_Package.eNS_URI);
			if (theJava_Factory != null) {
				return theJava_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Java_Package.ANNOTATION: return createAnnotation();
			case Java_Package.ARCHIVE: return createArchive();
			case Java_Package.ASSERT_STATEMENT: return createAssertStatement();
			case Java_Package.ANNOTATION_MEMBER_VALUE_PAIR: return createAnnotationMemberValuePair();
			case Java_Package.ANNOTATION_TYPE_DECLARATION: return createAnnotationTypeDeclaration();
			case Java_Package.ANNOTATION_TYPE_MEMBER_DECLARATION: return createAnnotationTypeMemberDeclaration();
			case Java_Package.ANONYMOUS_CLASS_DECLARATION: return createAnonymousClassDeclaration();
			case Java_Package.ARRAY_ACCESS: return createArrayAccess();
			case Java_Package.ARRAY_CREATION: return createArrayCreation();
			case Java_Package.ARRAY_INITIALIZER: return createArrayInitializer();
			case Java_Package.ARRAY_LENGTH_ACCESS: return createArrayLengthAccess();
			case Java_Package.ARRAY_TYPE: return createArrayType();
			case Java_Package.ASSIGNMENT: return createAssignment();
			case Java_Package.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Java_Package.BLOCK_COMMENT: return createBlockComment();
			case Java_Package.BLOCK: return createBlock();
			case Java_Package.BREAK_STATEMENT: return createBreakStatement();
			case Java_Package.CAST_EXPRESSION: return createCastExpression();
			case Java_Package.CATCH_CLAUSE: return createCatchClause();
			case Java_Package.CHARACTER_LITERAL: return createCharacterLiteral();
			case Java_Package.CLASS_FILE: return createClassFile();
			case Java_Package.CLASS_INSTANCE_CREATION: return createClassInstanceCreation();
			case Java_Package.CONSTRUCTOR_DECLARATION: return createConstructorDeclaration();
			case Java_Package.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case Java_Package.CONSTRUCTOR_INVOCATION: return createConstructorInvocation();
			case Java_Package.CLASS_DECLARATION: return createClassDeclaration();
			case Java_Package.COMPILATION_UNIT: return createCompilationUnit();
			case Java_Package.CONTINUE_STATEMENT: return createContinueStatement();
			case Java_Package.DO_STATEMENT: return createDoStatement();
			case Java_Package.EMPTY_STATEMENT: return createEmptyStatement();
			case Java_Package.ENHANCED_FOR_STATEMENT: return createEnhancedForStatement();
			case Java_Package.ENUM_CONSTANT_DECLARATION: return createEnumConstantDeclaration();
			case Java_Package.ENUM_DECLARATION: return createEnumDeclaration();
			case Java_Package.EXPRESSION_STATEMENT: return createExpressionStatement();
			case Java_Package.FIELD_ACCESS: return createFieldAccess();
			case Java_Package.FIELD_DECLARATION: return createFieldDeclaration();
			case Java_Package.FOR_STATEMENT: return createForStatement();
			case Java_Package.IF_STATEMENT: return createIfStatement();
			case Java_Package.IMPORT_DECLARATION: return createImportDeclaration();
			case Java_Package.INFIX_EXPRESSION: return createInfixExpression();
			case Java_Package.INITIALIZER: return createInitializer();
			case Java_Package.INSTANCEOF_EXPRESSION: return createInstanceofExpression();
			case Java_Package.INTERFACE_DECLARATION: return createInterfaceDeclaration();
			case Java_Package.JAVADOC: return createJavadoc();
			case Java_Package.LABELED_STATEMENT: return createLabeledStatement();
			case Java_Package.LINE_COMMENT: return createLineComment();
			case Java_Package.MANIFEST: return createManifest();
			case Java_Package.MANIFEST_ATTRIBUTE: return createManifestAttribute();
			case Java_Package.MANIFEST_ENTRY: return createManifestEntry();
			case Java_Package.MEMBER_REF: return createMemberRef();
			case Java_Package.METHOD_DECLARATION: return createMethodDeclaration();
			case Java_Package.METHOD_INVOCATION: return createMethodInvocation();
			case Java_Package.METHOD_REF: return createMethodRef();
			case Java_Package.METHOD_REF_PARAMETER: return createMethodRefParameter();
			case Java_Package.MODEL: return createModel();
			case Java_Package.MODIFIER: return createModifier();
			case Java_Package.NUMBER_LITERAL: return createNumberLiteral();
			case Java_Package.NULL_LITERAL: return createNullLiteral();
			case Java_Package.PACKAGE: return createPackage();
			case Java_Package.PACKAGE_ACCESS: return createPackageAccess();
			case Java_Package.PARAMETERIZED_TYPE: return createParameterizedType();
			case Java_Package.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
			case Java_Package.POSTFIX_EXPRESSION: return createPostfixExpression();
			case Java_Package.PREFIX_EXPRESSION: return createPrefixExpression();
			case Java_Package.PRIMITIVE_TYPE: return createPrimitiveType();
			case Java_Package.PRIMITIVE_TYPE_BOOLEAN: return createPrimitiveTypeBoolean();
			case Java_Package.PRIMITIVE_TYPE_BYTE: return createPrimitiveTypeByte();
			case Java_Package.PRIMITIVE_TYPE_CHAR: return createPrimitiveTypeChar();
			case Java_Package.PRIMITIVE_TYPE_DOUBLE: return createPrimitiveTypeDouble();
			case Java_Package.PRIMITIVE_TYPE_SHORT: return createPrimitiveTypeShort();
			case Java_Package.PRIMITIVE_TYPE_FLOAT: return createPrimitiveTypeFloat();
			case Java_Package.PRIMITIVE_TYPE_INT: return createPrimitiveTypeInt();
			case Java_Package.PRIMITIVE_TYPE_LONG: return createPrimitiveTypeLong();
			case Java_Package.PRIMITIVE_TYPE_VOID: return createPrimitiveTypeVoid();
			case Java_Package.RETURN_STATEMENT: return createReturnStatement();
			case Java_Package.SINGLE_VARIABLE_ACCESS: return createSingleVariableAccess();
			case Java_Package.SINGLE_VARIABLE_DECLARATION: return createSingleVariableDeclaration();
			case Java_Package.STRING_LITERAL: return createStringLiteral();
			case Java_Package.SUPER_CONSTRUCTOR_INVOCATION: return createSuperConstructorInvocation();
			case Java_Package.SUPER_FIELD_ACCESS: return createSuperFieldAccess();
			case Java_Package.SUPER_METHOD_INVOCATION: return createSuperMethodInvocation();
			case Java_Package.SWITCH_CASE: return createSwitchCase();
			case Java_Package.SWITCH_STATEMENT: return createSwitchStatement();
			case Java_Package.SYNCHRONIZED_STATEMENT: return createSynchronizedStatement();
			case Java_Package.TAG_ELEMENT: return createTagElement();
			case Java_Package.TEXT_ELEMENT: return createTextElement();
			case Java_Package.THIS_EXPRESSION: return createThisExpression();
			case Java_Package.THROW_STATEMENT: return createThrowStatement();
			case Java_Package.TRY_STATEMENT: return createTryStatement();
			case Java_Package.TYPE_ACCESS: return createTypeAccess();
			case Java_Package.TYPE_DECLARATION_STATEMENT: return createTypeDeclarationStatement();
			case Java_Package.TYPE_LITERAL: return createTypeLiteral();
			case Java_Package.TYPE_PARAMETER: return createTypeParameter();
			case Java_Package.UNRESOLVED_ITEM: return createUnresolvedItem();
			case Java_Package.UNRESOLVED_ITEM_ACCESS: return createUnresolvedItemAccess();
			case Java_Package.UNRESOLVED_ANNOTATION_DECLARATION: return createUnresolvedAnnotationDeclaration();
			case Java_Package.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION: return createUnresolvedAnnotationTypeMemberDeclaration();
			case Java_Package.UNRESOLVED_CLASS_DECLARATION: return createUnresolvedClassDeclaration();
			case Java_Package.UNRESOLVED_ENUM_DECLARATION: return createUnresolvedEnumDeclaration();
			case Java_Package.UNRESOLVED_INTERFACE_DECLARATION: return createUnresolvedInterfaceDeclaration();
			case Java_Package.UNRESOLVED_LABELED_STATEMENT: return createUnresolvedLabeledStatement();
			case Java_Package.UNRESOLVED_METHOD_DECLARATION: return createUnresolvedMethodDeclaration();
			case Java_Package.UNRESOLVED_SINGLE_VARIABLE_DECLARATION: return createUnresolvedSingleVariableDeclaration();
			case Java_Package.UNRESOLVED_TYPE: return createUnresolvedType();
			case Java_Package.UNRESOLVED_TYPE_DECLARATION: return createUnresolvedTypeDeclaration();
			case Java_Package.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT: return createUnresolvedVariableDeclarationFragment();
			case Java_Package.VARIABLE_DECLARATION_EXPRESSION: return createVariableDeclarationExpression();
			case Java_Package.VARIABLE_DECLARATION_FRAGMENT: return createVariableDeclarationFragment();
			case Java_Package.VARIABLE_DECLARATION_STATEMENT: return createVariableDeclarationStatement();
			case Java_Package.WILD_CARD_TYPE: return createWildCardType();
			case Java_Package.WHILE_STATEMENT: return createWhileStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Java_Package.ASSIGNMENT_KIND:
				return createAssignmentKindFromString(eDataType, initialValue);
			case Java_Package.INFIX_EXPRESSION_KIND:
				return createInfixExpressionKindFromString(eDataType, initialValue);
			case Java_Package.INHERITANCE_KIND:
				return createInheritanceKindFromString(eDataType, initialValue);
			case Java_Package.POSTFIX_EXPRESSION_KIND:
				return createPostfixExpressionKindFromString(eDataType, initialValue);
			case Java_Package.PREFIX_EXPRESSION_KIND:
				return createPrefixExpressionKindFromString(eDataType, initialValue);
			case Java_Package.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Java_Package.ASSIGNMENT_KIND:
				return convertAssignmentKindToString(eDataType, instanceValue);
			case Java_Package.INFIX_EXPRESSION_KIND:
				return convertInfixExpressionKindToString(eDataType, instanceValue);
			case Java_Package.INHERITANCE_KIND:
				return convertInheritanceKindToString(eDataType, instanceValue);
			case Java_Package.POSTFIX_EXPRESSION_KIND:
				return convertPostfixExpressionKindToString(eDataType, instanceValue);
			case Java_Package.PREFIX_EXPRESSION_KIND:
				return convertPrefixExpressionKindToString(eDataType, instanceValue);
			case Java_Package.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePair createAnnotationMemberValuePair() {
		AnnotationMemberValuePairImpl annotationMemberValuePair = new AnnotationMemberValuePairImpl();
		return annotationMemberValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeDeclaration createAnnotationTypeDeclaration() {
		AnnotationTypeDeclarationImpl annotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		return annotationTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration() {
		AnnotationTypeMemberDeclarationImpl annotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		return annotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		AnonymousClassDeclarationImpl anonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayCreation createArrayCreation() {
		ArrayCreationImpl arrayCreation = new ArrayCreationImpl();
		return arrayCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayLengthAccess createArrayLengthAccess() {
		ArrayLengthAccessImpl arrayLengthAccess = new ArrayLengthAccessImpl();
		return arrayLengthAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockComment createBlockComment() {
		BlockCommentImpl blockComment = new BlockCommentImpl();
		return blockComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause createCatchClause() {
		CatchClauseImpl catchClause = new CatchClauseImpl();
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassFile createClassFile() {
		ClassFileImpl classFile = new ClassFileImpl();
		return classFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInstanceCreation createClassInstanceCreation() {
		ClassInstanceCreationImpl classInstanceCreation = new ClassInstanceCreationImpl();
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorDeclaration createConstructorDeclaration() {
		ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
		return constructorDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorInvocation createConstructorInvocation() {
		ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
		return constructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedForStatement createEnhancedForStatement() {
		EnhancedForStatementImpl enhancedForStatement = new EnhancedForStatementImpl();
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstantDeclaration createEnumConstantDeclaration() {
		EnumConstantDeclarationImpl enumConstantDeclaration = new EnumConstantDeclarationImpl();
		return enumConstantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclaration createFieldDeclaration() {
		FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDeclaration createImportDeclaration() {
		ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
		return importDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpression createInfixExpression() {
		InfixExpressionImpl infixExpression = new InfixExpressionImpl();
		return infixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initializer createInitializer() {
		InitializerImpl initializer = new InitializerImpl();
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceofExpression createInstanceofExpression() {
		InstanceofExpressionImpl instanceofExpression = new InstanceofExpressionImpl();
		return instanceofExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Javadoc createJavadoc() {
		JavadocImpl javadoc = new JavadocImpl();
		return javadoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineComment createLineComment() {
		LineCommentImpl lineComment = new LineCommentImpl();
		return lineComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest createManifest() {
		ManifestImpl manifest = new ManifestImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestAttribute createManifestAttribute() {
		ManifestAttributeImpl manifestAttribute = new ManifestAttributeImpl();
		return manifestAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestEntry createManifestEntry() {
		ManifestEntryImpl manifestEntry = new ManifestEntryImpl();
		return manifestEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberRef createMemberRef() {
		MemberRefImpl memberRef = new MemberRefImpl();
		return memberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration createMethodDeclaration() {
		MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodRef createMethodRef() {
		MethodRefImpl methodRef = new MethodRefImpl();
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodRefParameter createMethodRefParameter() {
		MethodRefParameterImpl methodRefParameter = new MethodRefParameterImpl();
		return methodRefParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java_.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAccess createPackageAccess() {
		PackageAccessImpl packageAccess = new PackageAccessImpl();
		return packageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType createParameterizedType() {
		ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
		return parameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedExpression createParenthesizedExpression() {
		ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
		return parenthesizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpression createPostfixExpression() {
		PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpression createPrefixExpression() {
		PrefixExpressionImpl prefixExpression = new PrefixExpressionImpl();
		return prefixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean() {
		PrimitiveTypeBooleanImpl primitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		return primitiveTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeByte createPrimitiveTypeByte() {
		PrimitiveTypeByteImpl primitiveTypeByte = new PrimitiveTypeByteImpl();
		return primitiveTypeByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeChar createPrimitiveTypeChar() {
		PrimitiveTypeCharImpl primitiveTypeChar = new PrimitiveTypeCharImpl();
		return primitiveTypeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeDouble createPrimitiveTypeDouble() {
		PrimitiveTypeDoubleImpl primitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		return primitiveTypeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeShort createPrimitiveTypeShort() {
		PrimitiveTypeShortImpl primitiveTypeShort = new PrimitiveTypeShortImpl();
		return primitiveTypeShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeFloat createPrimitiveTypeFloat() {
		PrimitiveTypeFloatImpl primitiveTypeFloat = new PrimitiveTypeFloatImpl();
		return primitiveTypeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeInt createPrimitiveTypeInt() {
		PrimitiveTypeIntImpl primitiveTypeInt = new PrimitiveTypeIntImpl();
		return primitiveTypeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeLong createPrimitiveTypeLong() {
		PrimitiveTypeLongImpl primitiveTypeLong = new PrimitiveTypeLongImpl();
		return primitiveTypeLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeVoid createPrimitiveTypeVoid() {
		PrimitiveTypeVoidImpl primitiveTypeVoid = new PrimitiveTypeVoidImpl();
		return primitiveTypeVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableAccess createSingleVariableAccess() {
		SingleVariableAccessImpl singleVariableAccess = new SingleVariableAccessImpl();
		return singleVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration createSingleVariableDeclaration() {
		SingleVariableDeclarationImpl singleVariableDeclaration = new SingleVariableDeclarationImpl();
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperConstructorInvocation createSuperConstructorInvocation() {
		SuperConstructorInvocationImpl superConstructorInvocation = new SuperConstructorInvocationImpl();
		return superConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperFieldAccess createSuperFieldAccess() {
		SuperFieldAccessImpl superFieldAccess = new SuperFieldAccessImpl();
		return superFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperMethodInvocation createSuperMethodInvocation() {
		SuperMethodInvocationImpl superMethodInvocation = new SuperMethodInvocationImpl();
		return superMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedStatement createSynchronizedStatement() {
		SynchronizedStatementImpl synchronizedStatement = new SynchronizedStatementImpl();
		return synchronizedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagElement createTagElement() {
		TagElementImpl tagElement = new TagElementImpl();
		return tagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess createTypeAccess() {
		TypeAccessImpl typeAccess = new TypeAccessImpl();
		return typeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclarationStatement createTypeDeclarationStatement() {
		TypeDeclarationStatementImpl typeDeclarationStatement = new TypeDeclarationStatementImpl();
		return typeDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLiteral createTypeLiteral() {
		TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItem createUnresolvedItem() {
		UnresolvedItemImpl unresolvedItem = new UnresolvedItemImpl();
		return unresolvedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItemAccess createUnresolvedItemAccess() {
		UnresolvedItemAccessImpl unresolvedItemAccess = new UnresolvedItemAccessImpl();
		return unresolvedItemAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration() {
		UnresolvedAnnotationDeclarationImpl unresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
		return unresolvedAnnotationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration() {
		UnresolvedAnnotationTypeMemberDeclarationImpl unresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
		return unresolvedAnnotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedClassDeclaration createUnresolvedClassDeclaration() {
		UnresolvedClassDeclarationImpl unresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
		return unresolvedClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration() {
		UnresolvedEnumDeclarationImpl unresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
		return unresolvedEnumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration() {
		UnresolvedInterfaceDeclarationImpl unresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
		return unresolvedInterfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedLabeledStatement createUnresolvedLabeledStatement() {
		UnresolvedLabeledStatementImpl unresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
		return unresolvedLabeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration() {
		UnresolvedMethodDeclarationImpl unresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		return unresolvedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration() {
		UnresolvedSingleVariableDeclarationImpl unresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
		return unresolvedSingleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedType createUnresolvedType() {
		UnresolvedTypeImpl unresolvedType = new UnresolvedTypeImpl();
		return unresolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration() {
		UnresolvedTypeDeclarationImpl unresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		return unresolvedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment() {
		UnresolvedVariableDeclarationFragmentImpl unresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
		return unresolvedVariableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression createVariableDeclarationExpression() {
		VariableDeclarationExpressionImpl variableDeclarationExpression = new VariableDeclarationExpressionImpl();
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragment createVariableDeclarationFragment() {
		VariableDeclarationFragmentImpl variableDeclarationFragment = new VariableDeclarationFragmentImpl();
		return variableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationStatement createVariableDeclarationStatement() {
		VariableDeclarationStatementImpl variableDeclarationStatement = new VariableDeclarationStatementImpl();
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCardType createWildCardType() {
		WildCardTypeImpl wildCardType = new WildCardTypeImpl();
		return wildCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
		AssignmentKind result = AssignmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionKind createInfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		InfixExpressionKind result = InfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
		InheritanceKind result = InheritanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpressionKind createPostfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PostfixExpressionKind result = PostfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpressionKind createPrefixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PrefixExpressionKind result = PrefixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_Package getJava_Package() {
		return (Java_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java_Package getPackage() {
		return Java_Package.eINSTANCE;
	}

} //Java_FactoryImpl
