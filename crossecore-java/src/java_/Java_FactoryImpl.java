package java_;
import org.eclipse.emf.ecore.*;
public class Java_FactoryImpl extends org.eclipse.emf.ecore.impl.EFactoryImpl implements Java_Factory {
	
	public static Java_Factory eINSTANCE = Java_FactoryImpl.init();
	public static Java_Factory init()
	{
		
		try {
			Java_Factory factory = (Java_Factory)EPackage.Registry.INSTANCE.getEFactory(Java_PackageImpl.eNS_URI);
			if (factory != null) {
				return factory;
			}
		}
		catch (Exception exception) {
			
		}
		return new Java_FactoryImpl();
	}
	
	public Annotation createAnnotation(){
		AnnotationImpl theAnnotation = new AnnotationImpl();
		
		ASTNode.allInstances.add(theAnnotation);
		Expression.allInstances.add(theAnnotation);
		Annotation.allInstances.add(theAnnotation);
		
		return theAnnotation;
	}
	public Archive createArchive(){
		ArchiveImpl theArchive = new ArchiveImpl();
		
		ASTNode.allInstances.add(theArchive);
		NamedElement.allInstances.add(theArchive);
		Archive.allInstances.add(theArchive);
		
		return theArchive;
	}
	public AssertStatement createAssertStatement(){
		AssertStatementImpl theAssertStatement = new AssertStatementImpl();
		
		ASTNode.allInstances.add(theAssertStatement);
		Statement.allInstances.add(theAssertStatement);
		AssertStatement.allInstances.add(theAssertStatement);
		
		return theAssertStatement;
	}
	public AnnotationMemberValuePair createAnnotationMemberValuePair(){
		AnnotationMemberValuePairImpl theAnnotationMemberValuePair = new AnnotationMemberValuePairImpl();
		
		ASTNode.allInstances.add(theAnnotationMemberValuePair);
		NamedElement.allInstances.add(theAnnotationMemberValuePair);
		AnnotationMemberValuePair.allInstances.add(theAnnotationMemberValuePair);
		
		return theAnnotationMemberValuePair;
	}
	public AnnotationTypeDeclaration createAnnotationTypeDeclaration(){
		AnnotationTypeDeclarationImpl theAnnotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		
		ASTNode.allInstances.add(theAnnotationTypeDeclaration);
		NamedElement.allInstances.add(theAnnotationTypeDeclaration);
		BodyDeclaration.allInstances.add(theAnnotationTypeDeclaration);
		Type.allInstances.add(theAnnotationTypeDeclaration);
		AbstractTypeDeclaration.allInstances.add(theAnnotationTypeDeclaration);
		AnnotationTypeDeclaration.allInstances.add(theAnnotationTypeDeclaration);
		
		return theAnnotationTypeDeclaration;
	}
	public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration(){
		AnnotationTypeMemberDeclarationImpl theAnnotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		
		ASTNode.allInstances.add(theAnnotationTypeMemberDeclaration);
		NamedElement.allInstances.add(theAnnotationTypeMemberDeclaration);
		BodyDeclaration.allInstances.add(theAnnotationTypeMemberDeclaration);
		AnnotationTypeMemberDeclaration.allInstances.add(theAnnotationTypeMemberDeclaration);
		
		return theAnnotationTypeMemberDeclaration;
	}
	public AnonymousClassDeclaration createAnonymousClassDeclaration(){
		AnonymousClassDeclarationImpl theAnonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		
		ASTNode.allInstances.add(theAnonymousClassDeclaration);
		AnonymousClassDeclaration.allInstances.add(theAnonymousClassDeclaration);
		
		return theAnonymousClassDeclaration;
	}
	public ArrayAccess createArrayAccess(){
		ArrayAccessImpl theArrayAccess = new ArrayAccessImpl();
		
		ASTNode.allInstances.add(theArrayAccess);
		Expression.allInstances.add(theArrayAccess);
		ArrayAccess.allInstances.add(theArrayAccess);
		
		return theArrayAccess;
	}
	public ArrayCreation createArrayCreation(){
		ArrayCreationImpl theArrayCreation = new ArrayCreationImpl();
		
		ASTNode.allInstances.add(theArrayCreation);
		Expression.allInstances.add(theArrayCreation);
		ArrayCreation.allInstances.add(theArrayCreation);
		
		return theArrayCreation;
	}
	public ArrayInitializer createArrayInitializer(){
		ArrayInitializerImpl theArrayInitializer = new ArrayInitializerImpl();
		
		ASTNode.allInstances.add(theArrayInitializer);
		Expression.allInstances.add(theArrayInitializer);
		ArrayInitializer.allInstances.add(theArrayInitializer);
		
		return theArrayInitializer;
	}
	public ArrayLengthAccess createArrayLengthAccess(){
		ArrayLengthAccessImpl theArrayLengthAccess = new ArrayLengthAccessImpl();
		
		ASTNode.allInstances.add(theArrayLengthAccess);
		Expression.allInstances.add(theArrayLengthAccess);
		ArrayLengthAccess.allInstances.add(theArrayLengthAccess);
		
		return theArrayLengthAccess;
	}
	public ArrayType createArrayType(){
		ArrayTypeImpl theArrayType = new ArrayTypeImpl();
		
		ASTNode.allInstances.add(theArrayType);
		NamedElement.allInstances.add(theArrayType);
		Type.allInstances.add(theArrayType);
		ArrayType.allInstances.add(theArrayType);
		
		return theArrayType;
	}
	public Assignment createAssignment(){
		AssignmentImpl theAssignment = new AssignmentImpl();
		
		ASTNode.allInstances.add(theAssignment);
		Expression.allInstances.add(theAssignment);
		Assignment.allInstances.add(theAssignment);
		
		return theAssignment;
	}
	public BooleanLiteral createBooleanLiteral(){
		BooleanLiteralImpl theBooleanLiteral = new BooleanLiteralImpl();
		
		ASTNode.allInstances.add(theBooleanLiteral);
		Expression.allInstances.add(theBooleanLiteral);
		BooleanLiteral.allInstances.add(theBooleanLiteral);
		
		return theBooleanLiteral;
	}
	public BlockComment createBlockComment(){
		BlockCommentImpl theBlockComment = new BlockCommentImpl();
		
		ASTNode.allInstances.add(theBlockComment);
		Comment.allInstances.add(theBlockComment);
		BlockComment.allInstances.add(theBlockComment);
		
		return theBlockComment;
	}
	public Block createBlock(){
		BlockImpl theBlock = new BlockImpl();
		
		ASTNode.allInstances.add(theBlock);
		Statement.allInstances.add(theBlock);
		Block.allInstances.add(theBlock);
		
		return theBlock;
	}
	public BreakStatement createBreakStatement(){
		BreakStatementImpl theBreakStatement = new BreakStatementImpl();
		
		ASTNode.allInstances.add(theBreakStatement);
		Statement.allInstances.add(theBreakStatement);
		BreakStatement.allInstances.add(theBreakStatement);
		
		return theBreakStatement;
	}
	public CastExpression createCastExpression(){
		CastExpressionImpl theCastExpression = new CastExpressionImpl();
		
		ASTNode.allInstances.add(theCastExpression);
		Expression.allInstances.add(theCastExpression);
		CastExpression.allInstances.add(theCastExpression);
		
		return theCastExpression;
	}
	public CatchClause createCatchClause(){
		CatchClauseImpl theCatchClause = new CatchClauseImpl();
		
		ASTNode.allInstances.add(theCatchClause);
		Statement.allInstances.add(theCatchClause);
		CatchClause.allInstances.add(theCatchClause);
		
		return theCatchClause;
	}
	public CharacterLiteral createCharacterLiteral(){
		CharacterLiteralImpl theCharacterLiteral = new CharacterLiteralImpl();
		
		ASTNode.allInstances.add(theCharacterLiteral);
		Expression.allInstances.add(theCharacterLiteral);
		CharacterLiteral.allInstances.add(theCharacterLiteral);
		
		return theCharacterLiteral;
	}
	public ClassFile createClassFile(){
		ClassFileImpl theClassFile = new ClassFileImpl();
		
		ASTNode.allInstances.add(theClassFile);
		NamedElement.allInstances.add(theClassFile);
		ClassFile.allInstances.add(theClassFile);
		
		return theClassFile;
	}
	public ClassInstanceCreation createClassInstanceCreation(){
		ClassInstanceCreationImpl theClassInstanceCreation = new ClassInstanceCreationImpl();
		
		ASTNode.allInstances.add(theClassInstanceCreation);
		Expression.allInstances.add(theClassInstanceCreation);
		AbstractMethodInvocation.allInstances.add(theClassInstanceCreation);
		ClassInstanceCreation.allInstances.add(theClassInstanceCreation);
		
		return theClassInstanceCreation;
	}
	public ConstructorDeclaration createConstructorDeclaration(){
		ConstructorDeclarationImpl theConstructorDeclaration = new ConstructorDeclarationImpl();
		
		ASTNode.allInstances.add(theConstructorDeclaration);
		NamedElement.allInstances.add(theConstructorDeclaration);
		BodyDeclaration.allInstances.add(theConstructorDeclaration);
		AbstractMethodDeclaration.allInstances.add(theConstructorDeclaration);
		ConstructorDeclaration.allInstances.add(theConstructorDeclaration);
		
		return theConstructorDeclaration;
	}
	public ConditionalExpression createConditionalExpression(){
		ConditionalExpressionImpl theConditionalExpression = new ConditionalExpressionImpl();
		
		ASTNode.allInstances.add(theConditionalExpression);
		Expression.allInstances.add(theConditionalExpression);
		ConditionalExpression.allInstances.add(theConditionalExpression);
		
		return theConditionalExpression;
	}
	public ConstructorInvocation createConstructorInvocation(){
		ConstructorInvocationImpl theConstructorInvocation = new ConstructorInvocationImpl();
		
		ASTNode.allInstances.add(theConstructorInvocation);
		Statement.allInstances.add(theConstructorInvocation);
		AbstractMethodInvocation.allInstances.add(theConstructorInvocation);
		ConstructorInvocation.allInstances.add(theConstructorInvocation);
		
		return theConstructorInvocation;
	}
	public ClassDeclaration createClassDeclaration(){
		ClassDeclarationImpl theClassDeclaration = new ClassDeclarationImpl();
		
		ASTNode.allInstances.add(theClassDeclaration);
		NamedElement.allInstances.add(theClassDeclaration);
		BodyDeclaration.allInstances.add(theClassDeclaration);
		Type.allInstances.add(theClassDeclaration);
		AbstractTypeDeclaration.allInstances.add(theClassDeclaration);
		TypeDeclaration.allInstances.add(theClassDeclaration);
		ClassDeclaration.allInstances.add(theClassDeclaration);
		
		return theClassDeclaration;
	}
	public CompilationUnit createCompilationUnit(){
		CompilationUnitImpl theCompilationUnit = new CompilationUnitImpl();
		
		ASTNode.allInstances.add(theCompilationUnit);
		NamedElement.allInstances.add(theCompilationUnit);
		CompilationUnit.allInstances.add(theCompilationUnit);
		
		return theCompilationUnit;
	}
	public ContinueStatement createContinueStatement(){
		ContinueStatementImpl theContinueStatement = new ContinueStatementImpl();
		
		ASTNode.allInstances.add(theContinueStatement);
		Statement.allInstances.add(theContinueStatement);
		ContinueStatement.allInstances.add(theContinueStatement);
		
		return theContinueStatement;
	}
	public DoStatement createDoStatement(){
		DoStatementImpl theDoStatement = new DoStatementImpl();
		
		ASTNode.allInstances.add(theDoStatement);
		Statement.allInstances.add(theDoStatement);
		DoStatement.allInstances.add(theDoStatement);
		
		return theDoStatement;
	}
	public EmptyStatement createEmptyStatement(){
		EmptyStatementImpl theEmptyStatement = new EmptyStatementImpl();
		
		ASTNode.allInstances.add(theEmptyStatement);
		Statement.allInstances.add(theEmptyStatement);
		EmptyStatement.allInstances.add(theEmptyStatement);
		
		return theEmptyStatement;
	}
	public EnhancedForStatement createEnhancedForStatement(){
		EnhancedForStatementImpl theEnhancedForStatement = new EnhancedForStatementImpl();
		
		ASTNode.allInstances.add(theEnhancedForStatement);
		Statement.allInstances.add(theEnhancedForStatement);
		EnhancedForStatement.allInstances.add(theEnhancedForStatement);
		
		return theEnhancedForStatement;
	}
	public EnumConstantDeclaration createEnumConstantDeclaration(){
		EnumConstantDeclarationImpl theEnumConstantDeclaration = new EnumConstantDeclarationImpl();
		
		ASTNode.allInstances.add(theEnumConstantDeclaration);
		NamedElement.allInstances.add(theEnumConstantDeclaration);
		BodyDeclaration.allInstances.add(theEnumConstantDeclaration);
		VariableDeclaration.allInstances.add(theEnumConstantDeclaration);
		EnumConstantDeclaration.allInstances.add(theEnumConstantDeclaration);
		
		return theEnumConstantDeclaration;
	}
	public EnumDeclaration createEnumDeclaration(){
		EnumDeclarationImpl theEnumDeclaration = new EnumDeclarationImpl();
		
		ASTNode.allInstances.add(theEnumDeclaration);
		NamedElement.allInstances.add(theEnumDeclaration);
		BodyDeclaration.allInstances.add(theEnumDeclaration);
		Type.allInstances.add(theEnumDeclaration);
		AbstractTypeDeclaration.allInstances.add(theEnumDeclaration);
		EnumDeclaration.allInstances.add(theEnumDeclaration);
		
		return theEnumDeclaration;
	}
	public ExpressionStatement createExpressionStatement(){
		ExpressionStatementImpl theExpressionStatement = new ExpressionStatementImpl();
		
		ASTNode.allInstances.add(theExpressionStatement);
		Statement.allInstances.add(theExpressionStatement);
		ExpressionStatement.allInstances.add(theExpressionStatement);
		
		return theExpressionStatement;
	}
	public FieldAccess createFieldAccess(){
		FieldAccessImpl theFieldAccess = new FieldAccessImpl();
		
		ASTNode.allInstances.add(theFieldAccess);
		Expression.allInstances.add(theFieldAccess);
		FieldAccess.allInstances.add(theFieldAccess);
		
		return theFieldAccess;
	}
	public FieldDeclaration createFieldDeclaration(){
		FieldDeclarationImpl theFieldDeclaration = new FieldDeclarationImpl();
		
		ASTNode.allInstances.add(theFieldDeclaration);
		NamedElement.allInstances.add(theFieldDeclaration);
		BodyDeclaration.allInstances.add(theFieldDeclaration);
		AbstractVariablesContainer.allInstances.add(theFieldDeclaration);
		FieldDeclaration.allInstances.add(theFieldDeclaration);
		
		return theFieldDeclaration;
	}
	public ForStatement createForStatement(){
		ForStatementImpl theForStatement = new ForStatementImpl();
		
		ASTNode.allInstances.add(theForStatement);
		Statement.allInstances.add(theForStatement);
		ForStatement.allInstances.add(theForStatement);
		
		return theForStatement;
	}
	public IfStatement createIfStatement(){
		IfStatementImpl theIfStatement = new IfStatementImpl();
		
		ASTNode.allInstances.add(theIfStatement);
		Statement.allInstances.add(theIfStatement);
		IfStatement.allInstances.add(theIfStatement);
		
		return theIfStatement;
	}
	public ImportDeclaration createImportDeclaration(){
		ImportDeclarationImpl theImportDeclaration = new ImportDeclarationImpl();
		
		ASTNode.allInstances.add(theImportDeclaration);
		ImportDeclaration.allInstances.add(theImportDeclaration);
		
		return theImportDeclaration;
	}
	public InfixExpression createInfixExpression(){
		InfixExpressionImpl theInfixExpression = new InfixExpressionImpl();
		
		ASTNode.allInstances.add(theInfixExpression);
		Expression.allInstances.add(theInfixExpression);
		InfixExpression.allInstances.add(theInfixExpression);
		
		return theInfixExpression;
	}
	public Initializer createInitializer(){
		InitializerImpl theInitializer = new InitializerImpl();
		
		ASTNode.allInstances.add(theInitializer);
		NamedElement.allInstances.add(theInitializer);
		BodyDeclaration.allInstances.add(theInitializer);
		Initializer.allInstances.add(theInitializer);
		
		return theInitializer;
	}
	public InstanceofExpression createInstanceofExpression(){
		InstanceofExpressionImpl theInstanceofExpression = new InstanceofExpressionImpl();
		
		ASTNode.allInstances.add(theInstanceofExpression);
		Expression.allInstances.add(theInstanceofExpression);
		InstanceofExpression.allInstances.add(theInstanceofExpression);
		
		return theInstanceofExpression;
	}
	public InterfaceDeclaration createInterfaceDeclaration(){
		InterfaceDeclarationImpl theInterfaceDeclaration = new InterfaceDeclarationImpl();
		
		ASTNode.allInstances.add(theInterfaceDeclaration);
		NamedElement.allInstances.add(theInterfaceDeclaration);
		BodyDeclaration.allInstances.add(theInterfaceDeclaration);
		Type.allInstances.add(theInterfaceDeclaration);
		AbstractTypeDeclaration.allInstances.add(theInterfaceDeclaration);
		TypeDeclaration.allInstances.add(theInterfaceDeclaration);
		InterfaceDeclaration.allInstances.add(theInterfaceDeclaration);
		
		return theInterfaceDeclaration;
	}
	public Javadoc createJavadoc(){
		JavadocImpl theJavadoc = new JavadocImpl();
		
		ASTNode.allInstances.add(theJavadoc);
		Comment.allInstances.add(theJavadoc);
		Javadoc.allInstances.add(theJavadoc);
		
		return theJavadoc;
	}
	public LabeledStatement createLabeledStatement(){
		LabeledStatementImpl theLabeledStatement = new LabeledStatementImpl();
		
		ASTNode.allInstances.add(theLabeledStatement);
		NamedElement.allInstances.add(theLabeledStatement);
		Statement.allInstances.add(theLabeledStatement);
		LabeledStatement.allInstances.add(theLabeledStatement);
		
		return theLabeledStatement;
	}
	public LineComment createLineComment(){
		LineCommentImpl theLineComment = new LineCommentImpl();
		
		ASTNode.allInstances.add(theLineComment);
		Comment.allInstances.add(theLineComment);
		LineComment.allInstances.add(theLineComment);
		
		return theLineComment;
	}
	public Manifest createManifest(){
		ManifestImpl theManifest = new ManifestImpl();
		
		Manifest.allInstances.add(theManifest);
		
		return theManifest;
	}
	public ManifestAttribute createManifestAttribute(){
		ManifestAttributeImpl theManifestAttribute = new ManifestAttributeImpl();
		
		ManifestAttribute.allInstances.add(theManifestAttribute);
		
		return theManifestAttribute;
	}
	public ManifestEntry createManifestEntry(){
		ManifestEntryImpl theManifestEntry = new ManifestEntryImpl();
		
		ManifestEntry.allInstances.add(theManifestEntry);
		
		return theManifestEntry;
	}
	public MemberRef createMemberRef(){
		MemberRefImpl theMemberRef = new MemberRefImpl();
		
		ASTNode.allInstances.add(theMemberRef);
		MemberRef.allInstances.add(theMemberRef);
		
		return theMemberRef;
	}
	public MethodDeclaration createMethodDeclaration(){
		MethodDeclarationImpl theMethodDeclaration = new MethodDeclarationImpl();
		
		ASTNode.allInstances.add(theMethodDeclaration);
		NamedElement.allInstances.add(theMethodDeclaration);
		BodyDeclaration.allInstances.add(theMethodDeclaration);
		AbstractMethodDeclaration.allInstances.add(theMethodDeclaration);
		MethodDeclaration.allInstances.add(theMethodDeclaration);
		
		return theMethodDeclaration;
	}
	public MethodInvocation createMethodInvocation(){
		MethodInvocationImpl theMethodInvocation = new MethodInvocationImpl();
		
		ASTNode.allInstances.add(theMethodInvocation);
		Expression.allInstances.add(theMethodInvocation);
		AbstractMethodInvocation.allInstances.add(theMethodInvocation);
		MethodInvocation.allInstances.add(theMethodInvocation);
		
		return theMethodInvocation;
	}
	public MethodRef createMethodRef(){
		MethodRefImpl theMethodRef = new MethodRefImpl();
		
		ASTNode.allInstances.add(theMethodRef);
		MethodRef.allInstances.add(theMethodRef);
		
		return theMethodRef;
	}
	public MethodRefParameter createMethodRefParameter(){
		MethodRefParameterImpl theMethodRefParameter = new MethodRefParameterImpl();
		
		ASTNode.allInstances.add(theMethodRefParameter);
		MethodRefParameter.allInstances.add(theMethodRefParameter);
		
		return theMethodRefParameter;
	}
	public Model createModel(){
		ModelImpl theModel = new ModelImpl();
		
		Model.allInstances.add(theModel);
		
		return theModel;
	}
	public Modifier createModifier(){
		ModifierImpl theModifier = new ModifierImpl();
		
		ASTNode.allInstances.add(theModifier);
		Modifier.allInstances.add(theModifier);
		
		return theModifier;
	}
	public NumberLiteral createNumberLiteral(){
		NumberLiteralImpl theNumberLiteral = new NumberLiteralImpl();
		
		ASTNode.allInstances.add(theNumberLiteral);
		Expression.allInstances.add(theNumberLiteral);
		NumberLiteral.allInstances.add(theNumberLiteral);
		
		return theNumberLiteral;
	}
	public NullLiteral createNullLiteral(){
		NullLiteralImpl theNullLiteral = new NullLiteralImpl();
		
		ASTNode.allInstances.add(theNullLiteral);
		Expression.allInstances.add(theNullLiteral);
		NullLiteral.allInstances.add(theNullLiteral);
		
		return theNullLiteral;
	}
	public Package createPackage(){
		PackageImpl thePackage = new PackageImpl();
		
		ASTNode.allInstances.add(thePackage);
		NamedElement.allInstances.add(thePackage);
		Package.allInstances.add(thePackage);
		
		return thePackage;
	}
	public PackageAccess createPackageAccess(){
		PackageAccessImpl thePackageAccess = new PackageAccessImpl();
		
		ASTNode.allInstances.add(thePackageAccess);
		NamespaceAccess.allInstances.add(thePackageAccess);
		PackageAccess.allInstances.add(thePackageAccess);
		
		return thePackageAccess;
	}
	public ParameterizedType createParameterizedType(){
		ParameterizedTypeImpl theParameterizedType = new ParameterizedTypeImpl();
		
		ASTNode.allInstances.add(theParameterizedType);
		NamedElement.allInstances.add(theParameterizedType);
		Type.allInstances.add(theParameterizedType);
		ParameterizedType.allInstances.add(theParameterizedType);
		
		return theParameterizedType;
	}
	public ParenthesizedExpression createParenthesizedExpression(){
		ParenthesizedExpressionImpl theParenthesizedExpression = new ParenthesizedExpressionImpl();
		
		ASTNode.allInstances.add(theParenthesizedExpression);
		Expression.allInstances.add(theParenthesizedExpression);
		ParenthesizedExpression.allInstances.add(theParenthesizedExpression);
		
		return theParenthesizedExpression;
	}
	public PostfixExpression createPostfixExpression(){
		PostfixExpressionImpl thePostfixExpression = new PostfixExpressionImpl();
		
		ASTNode.allInstances.add(thePostfixExpression);
		Expression.allInstances.add(thePostfixExpression);
		PostfixExpression.allInstances.add(thePostfixExpression);
		
		return thePostfixExpression;
	}
	public PrefixExpression createPrefixExpression(){
		PrefixExpressionImpl thePrefixExpression = new PrefixExpressionImpl();
		
		ASTNode.allInstances.add(thePrefixExpression);
		Expression.allInstances.add(thePrefixExpression);
		PrefixExpression.allInstances.add(thePrefixExpression);
		
		return thePrefixExpression;
	}
	public PrimitiveType createPrimitiveType(){
		PrimitiveTypeImpl thePrimitiveType = new PrimitiveTypeImpl();
		
		ASTNode.allInstances.add(thePrimitiveType);
		NamedElement.allInstances.add(thePrimitiveType);
		Type.allInstances.add(thePrimitiveType);
		PrimitiveType.allInstances.add(thePrimitiveType);
		
		return thePrimitiveType;
	}
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean(){
		PrimitiveTypeBooleanImpl thePrimitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeBoolean);
		NamedElement.allInstances.add(thePrimitiveTypeBoolean);
		Type.allInstances.add(thePrimitiveTypeBoolean);
		PrimitiveType.allInstances.add(thePrimitiveTypeBoolean);
		PrimitiveTypeBoolean.allInstances.add(thePrimitiveTypeBoolean);
		
		return thePrimitiveTypeBoolean;
	}
	public PrimitiveTypeByte createPrimitiveTypeByte(){
		PrimitiveTypeByteImpl thePrimitiveTypeByte = new PrimitiveTypeByteImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeByte);
		NamedElement.allInstances.add(thePrimitiveTypeByte);
		Type.allInstances.add(thePrimitiveTypeByte);
		PrimitiveType.allInstances.add(thePrimitiveTypeByte);
		PrimitiveTypeByte.allInstances.add(thePrimitiveTypeByte);
		
		return thePrimitiveTypeByte;
	}
	public PrimitiveTypeChar createPrimitiveTypeChar(){
		PrimitiveTypeCharImpl thePrimitiveTypeChar = new PrimitiveTypeCharImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeChar);
		NamedElement.allInstances.add(thePrimitiveTypeChar);
		Type.allInstances.add(thePrimitiveTypeChar);
		PrimitiveType.allInstances.add(thePrimitiveTypeChar);
		PrimitiveTypeChar.allInstances.add(thePrimitiveTypeChar);
		
		return thePrimitiveTypeChar;
	}
	public PrimitiveTypeDouble createPrimitiveTypeDouble(){
		PrimitiveTypeDoubleImpl thePrimitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeDouble);
		NamedElement.allInstances.add(thePrimitiveTypeDouble);
		Type.allInstances.add(thePrimitiveTypeDouble);
		PrimitiveType.allInstances.add(thePrimitiveTypeDouble);
		PrimitiveTypeDouble.allInstances.add(thePrimitiveTypeDouble);
		
		return thePrimitiveTypeDouble;
	}
	public PrimitiveTypeShort createPrimitiveTypeShort(){
		PrimitiveTypeShortImpl thePrimitiveTypeShort = new PrimitiveTypeShortImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeShort);
		NamedElement.allInstances.add(thePrimitiveTypeShort);
		Type.allInstances.add(thePrimitiveTypeShort);
		PrimitiveType.allInstances.add(thePrimitiveTypeShort);
		PrimitiveTypeShort.allInstances.add(thePrimitiveTypeShort);
		
		return thePrimitiveTypeShort;
	}
	public PrimitiveTypeFloat createPrimitiveTypeFloat(){
		PrimitiveTypeFloatImpl thePrimitiveTypeFloat = new PrimitiveTypeFloatImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeFloat);
		NamedElement.allInstances.add(thePrimitiveTypeFloat);
		Type.allInstances.add(thePrimitiveTypeFloat);
		PrimitiveType.allInstances.add(thePrimitiveTypeFloat);
		PrimitiveTypeFloat.allInstances.add(thePrimitiveTypeFloat);
		
		return thePrimitiveTypeFloat;
	}
	public PrimitiveTypeInt createPrimitiveTypeInt(){
		PrimitiveTypeIntImpl thePrimitiveTypeInt = new PrimitiveTypeIntImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeInt);
		NamedElement.allInstances.add(thePrimitiveTypeInt);
		Type.allInstances.add(thePrimitiveTypeInt);
		PrimitiveType.allInstances.add(thePrimitiveTypeInt);
		PrimitiveTypeInt.allInstances.add(thePrimitiveTypeInt);
		
		return thePrimitiveTypeInt;
	}
	public PrimitiveTypeLong createPrimitiveTypeLong(){
		PrimitiveTypeLongImpl thePrimitiveTypeLong = new PrimitiveTypeLongImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeLong);
		NamedElement.allInstances.add(thePrimitiveTypeLong);
		Type.allInstances.add(thePrimitiveTypeLong);
		PrimitiveType.allInstances.add(thePrimitiveTypeLong);
		PrimitiveTypeLong.allInstances.add(thePrimitiveTypeLong);
		
		return thePrimitiveTypeLong;
	}
	public PrimitiveTypeVoid createPrimitiveTypeVoid(){
		PrimitiveTypeVoidImpl thePrimitiveTypeVoid = new PrimitiveTypeVoidImpl();
		
		ASTNode.allInstances.add(thePrimitiveTypeVoid);
		NamedElement.allInstances.add(thePrimitiveTypeVoid);
		Type.allInstances.add(thePrimitiveTypeVoid);
		PrimitiveType.allInstances.add(thePrimitiveTypeVoid);
		PrimitiveTypeVoid.allInstances.add(thePrimitiveTypeVoid);
		
		return thePrimitiveTypeVoid;
	}
	public ReturnStatement createReturnStatement(){
		ReturnStatementImpl theReturnStatement = new ReturnStatementImpl();
		
		ASTNode.allInstances.add(theReturnStatement);
		Statement.allInstances.add(theReturnStatement);
		ReturnStatement.allInstances.add(theReturnStatement);
		
		return theReturnStatement;
	}
	public SingleVariableAccess createSingleVariableAccess(){
		SingleVariableAccessImpl theSingleVariableAccess = new SingleVariableAccessImpl();
		
		ASTNode.allInstances.add(theSingleVariableAccess);
		Expression.allInstances.add(theSingleVariableAccess);
		SingleVariableAccess.allInstances.add(theSingleVariableAccess);
		
		return theSingleVariableAccess;
	}
	public SingleVariableDeclaration createSingleVariableDeclaration(){
		SingleVariableDeclarationImpl theSingleVariableDeclaration = new SingleVariableDeclarationImpl();
		
		ASTNode.allInstances.add(theSingleVariableDeclaration);
		NamedElement.allInstances.add(theSingleVariableDeclaration);
		VariableDeclaration.allInstances.add(theSingleVariableDeclaration);
		SingleVariableDeclaration.allInstances.add(theSingleVariableDeclaration);
		
		return theSingleVariableDeclaration;
	}
	public StringLiteral createStringLiteral(){
		StringLiteralImpl theStringLiteral = new StringLiteralImpl();
		
		ASTNode.allInstances.add(theStringLiteral);
		Expression.allInstances.add(theStringLiteral);
		StringLiteral.allInstances.add(theStringLiteral);
		
		return theStringLiteral;
	}
	public SuperConstructorInvocation createSuperConstructorInvocation(){
		SuperConstructorInvocationImpl theSuperConstructorInvocation = new SuperConstructorInvocationImpl();
		
		ASTNode.allInstances.add(theSuperConstructorInvocation);
		Statement.allInstances.add(theSuperConstructorInvocation);
		AbstractMethodInvocation.allInstances.add(theSuperConstructorInvocation);
		SuperConstructorInvocation.allInstances.add(theSuperConstructorInvocation);
		
		return theSuperConstructorInvocation;
	}
	public SuperFieldAccess createSuperFieldAccess(){
		SuperFieldAccessImpl theSuperFieldAccess = new SuperFieldAccessImpl();
		
		ASTNode.allInstances.add(theSuperFieldAccess);
		Expression.allInstances.add(theSuperFieldAccess);
		AbstractTypeQualifiedExpression.allInstances.add(theSuperFieldAccess);
		SuperFieldAccess.allInstances.add(theSuperFieldAccess);
		
		return theSuperFieldAccess;
	}
	public SuperMethodInvocation createSuperMethodInvocation(){
		SuperMethodInvocationImpl theSuperMethodInvocation = new SuperMethodInvocationImpl();
		
		ASTNode.allInstances.add(theSuperMethodInvocation);
		Expression.allInstances.add(theSuperMethodInvocation);
		AbstractTypeQualifiedExpression.allInstances.add(theSuperMethodInvocation);
		AbstractMethodInvocation.allInstances.add(theSuperMethodInvocation);
		SuperMethodInvocation.allInstances.add(theSuperMethodInvocation);
		
		return theSuperMethodInvocation;
	}
	public SwitchCase createSwitchCase(){
		SwitchCaseImpl theSwitchCase = new SwitchCaseImpl();
		
		ASTNode.allInstances.add(theSwitchCase);
		Statement.allInstances.add(theSwitchCase);
		SwitchCase.allInstances.add(theSwitchCase);
		
		return theSwitchCase;
	}
	public SwitchStatement createSwitchStatement(){
		SwitchStatementImpl theSwitchStatement = new SwitchStatementImpl();
		
		ASTNode.allInstances.add(theSwitchStatement);
		Statement.allInstances.add(theSwitchStatement);
		SwitchStatement.allInstances.add(theSwitchStatement);
		
		return theSwitchStatement;
	}
	public SynchronizedStatement createSynchronizedStatement(){
		SynchronizedStatementImpl theSynchronizedStatement = new SynchronizedStatementImpl();
		
		ASTNode.allInstances.add(theSynchronizedStatement);
		Statement.allInstances.add(theSynchronizedStatement);
		SynchronizedStatement.allInstances.add(theSynchronizedStatement);
		
		return theSynchronizedStatement;
	}
	public TagElement createTagElement(){
		TagElementImpl theTagElement = new TagElementImpl();
		
		ASTNode.allInstances.add(theTagElement);
		TagElement.allInstances.add(theTagElement);
		
		return theTagElement;
	}
	public TextElement createTextElement(){
		TextElementImpl theTextElement = new TextElementImpl();
		
		ASTNode.allInstances.add(theTextElement);
		TextElement.allInstances.add(theTextElement);
		
		return theTextElement;
	}
	public ThisExpression createThisExpression(){
		ThisExpressionImpl theThisExpression = new ThisExpressionImpl();
		
		ASTNode.allInstances.add(theThisExpression);
		Expression.allInstances.add(theThisExpression);
		AbstractTypeQualifiedExpression.allInstances.add(theThisExpression);
		ThisExpression.allInstances.add(theThisExpression);
		
		return theThisExpression;
	}
	public ThrowStatement createThrowStatement(){
		ThrowStatementImpl theThrowStatement = new ThrowStatementImpl();
		
		ASTNode.allInstances.add(theThrowStatement);
		Statement.allInstances.add(theThrowStatement);
		ThrowStatement.allInstances.add(theThrowStatement);
		
		return theThrowStatement;
	}
	public TryStatement createTryStatement(){
		TryStatementImpl theTryStatement = new TryStatementImpl();
		
		ASTNode.allInstances.add(theTryStatement);
		Statement.allInstances.add(theTryStatement);
		TryStatement.allInstances.add(theTryStatement);
		
		return theTryStatement;
	}
	public TypeAccess createTypeAccess(){
		TypeAccessImpl theTypeAccess = new TypeAccessImpl();
		
		ASTNode.allInstances.add(theTypeAccess);
		Expression.allInstances.add(theTypeAccess);
		NamespaceAccess.allInstances.add(theTypeAccess);
		TypeAccess.allInstances.add(theTypeAccess);
		
		return theTypeAccess;
	}
	public TypeDeclarationStatement createTypeDeclarationStatement(){
		TypeDeclarationStatementImpl theTypeDeclarationStatement = new TypeDeclarationStatementImpl();
		
		ASTNode.allInstances.add(theTypeDeclarationStatement);
		Statement.allInstances.add(theTypeDeclarationStatement);
		TypeDeclarationStatement.allInstances.add(theTypeDeclarationStatement);
		
		return theTypeDeclarationStatement;
	}
	public TypeLiteral createTypeLiteral(){
		TypeLiteralImpl theTypeLiteral = new TypeLiteralImpl();
		
		ASTNode.allInstances.add(theTypeLiteral);
		Expression.allInstances.add(theTypeLiteral);
		TypeLiteral.allInstances.add(theTypeLiteral);
		
		return theTypeLiteral;
	}
	public TypeParameter createTypeParameter(){
		TypeParameterImpl theTypeParameter = new TypeParameterImpl();
		
		ASTNode.allInstances.add(theTypeParameter);
		NamedElement.allInstances.add(theTypeParameter);
		Type.allInstances.add(theTypeParameter);
		TypeParameter.allInstances.add(theTypeParameter);
		
		return theTypeParameter;
	}
	public UnresolvedItem createUnresolvedItem(){
		UnresolvedItemImpl theUnresolvedItem = new UnresolvedItemImpl();
		
		ASTNode.allInstances.add(theUnresolvedItem);
		NamedElement.allInstances.add(theUnresolvedItem);
		UnresolvedItem.allInstances.add(theUnresolvedItem);
		
		return theUnresolvedItem;
	}
	public UnresolvedItemAccess createUnresolvedItemAccess(){
		UnresolvedItemAccessImpl theUnresolvedItemAccess = new UnresolvedItemAccessImpl();
		
		ASTNode.allInstances.add(theUnresolvedItemAccess);
		Expression.allInstances.add(theUnresolvedItemAccess);
		NamespaceAccess.allInstances.add(theUnresolvedItemAccess);
		UnresolvedItemAccess.allInstances.add(theUnresolvedItemAccess);
		
		return theUnresolvedItemAccess;
	}
	public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration(){
		UnresolvedAnnotationDeclarationImpl theUnresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedAnnotationDeclaration);
		NamedElement.allInstances.add(theUnresolvedAnnotationDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedAnnotationDeclaration);
		Type.allInstances.add(theUnresolvedAnnotationDeclaration);
		AbstractTypeDeclaration.allInstances.add(theUnresolvedAnnotationDeclaration);
		AnnotationTypeDeclaration.allInstances.add(theUnresolvedAnnotationDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedAnnotationDeclaration);
		UnresolvedAnnotationDeclaration.allInstances.add(theUnresolvedAnnotationDeclaration);
		
		return theUnresolvedAnnotationDeclaration;
	}
	public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration(){
		UnresolvedAnnotationTypeMemberDeclarationImpl theUnresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		NamedElement.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		AnnotationTypeMemberDeclaration.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		UnresolvedAnnotationTypeMemberDeclaration.allInstances.add(theUnresolvedAnnotationTypeMemberDeclaration);
		
		return theUnresolvedAnnotationTypeMemberDeclaration;
	}
	public UnresolvedClassDeclaration createUnresolvedClassDeclaration(){
		UnresolvedClassDeclarationImpl theUnresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedClassDeclaration);
		NamedElement.allInstances.add(theUnresolvedClassDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedClassDeclaration);
		Type.allInstances.add(theUnresolvedClassDeclaration);
		AbstractTypeDeclaration.allInstances.add(theUnresolvedClassDeclaration);
		TypeDeclaration.allInstances.add(theUnresolvedClassDeclaration);
		ClassDeclaration.allInstances.add(theUnresolvedClassDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedClassDeclaration);
		UnresolvedClassDeclaration.allInstances.add(theUnresolvedClassDeclaration);
		
		return theUnresolvedClassDeclaration;
	}
	public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration(){
		UnresolvedEnumDeclarationImpl theUnresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedEnumDeclaration);
		NamedElement.allInstances.add(theUnresolvedEnumDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedEnumDeclaration);
		Type.allInstances.add(theUnresolvedEnumDeclaration);
		AbstractTypeDeclaration.allInstances.add(theUnresolvedEnumDeclaration);
		EnumDeclaration.allInstances.add(theUnresolvedEnumDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedEnumDeclaration);
		UnresolvedEnumDeclaration.allInstances.add(theUnresolvedEnumDeclaration);
		
		return theUnresolvedEnumDeclaration;
	}
	public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration(){
		UnresolvedInterfaceDeclarationImpl theUnresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedInterfaceDeclaration);
		NamedElement.allInstances.add(theUnresolvedInterfaceDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedInterfaceDeclaration);
		Type.allInstances.add(theUnresolvedInterfaceDeclaration);
		AbstractTypeDeclaration.allInstances.add(theUnresolvedInterfaceDeclaration);
		TypeDeclaration.allInstances.add(theUnresolvedInterfaceDeclaration);
		InterfaceDeclaration.allInstances.add(theUnresolvedInterfaceDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedInterfaceDeclaration);
		UnresolvedInterfaceDeclaration.allInstances.add(theUnresolvedInterfaceDeclaration);
		
		return theUnresolvedInterfaceDeclaration;
	}
	public UnresolvedLabeledStatement createUnresolvedLabeledStatement(){
		UnresolvedLabeledStatementImpl theUnresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
		
		ASTNode.allInstances.add(theUnresolvedLabeledStatement);
		NamedElement.allInstances.add(theUnresolvedLabeledStatement);
		Statement.allInstances.add(theUnresolvedLabeledStatement);
		LabeledStatement.allInstances.add(theUnresolvedLabeledStatement);
		UnresolvedItem.allInstances.add(theUnresolvedLabeledStatement);
		UnresolvedLabeledStatement.allInstances.add(theUnresolvedLabeledStatement);
		
		return theUnresolvedLabeledStatement;
	}
	public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration(){
		UnresolvedMethodDeclarationImpl theUnresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedMethodDeclaration);
		NamedElement.allInstances.add(theUnresolvedMethodDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedMethodDeclaration);
		AbstractMethodDeclaration.allInstances.add(theUnresolvedMethodDeclaration);
		MethodDeclaration.allInstances.add(theUnresolvedMethodDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedMethodDeclaration);
		UnresolvedMethodDeclaration.allInstances.add(theUnresolvedMethodDeclaration);
		
		return theUnresolvedMethodDeclaration;
	}
	public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration(){
		UnresolvedSingleVariableDeclarationImpl theUnresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedSingleVariableDeclaration);
		NamedElement.allInstances.add(theUnresolvedSingleVariableDeclaration);
		VariableDeclaration.allInstances.add(theUnresolvedSingleVariableDeclaration);
		SingleVariableDeclaration.allInstances.add(theUnresolvedSingleVariableDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedSingleVariableDeclaration);
		UnresolvedSingleVariableDeclaration.allInstances.add(theUnresolvedSingleVariableDeclaration);
		
		return theUnresolvedSingleVariableDeclaration;
	}
	public UnresolvedType createUnresolvedType(){
		UnresolvedTypeImpl theUnresolvedType = new UnresolvedTypeImpl();
		
		ASTNode.allInstances.add(theUnresolvedType);
		NamedElement.allInstances.add(theUnresolvedType);
		Type.allInstances.add(theUnresolvedType);
		UnresolvedItem.allInstances.add(theUnresolvedType);
		UnresolvedType.allInstances.add(theUnresolvedType);
		
		return theUnresolvedType;
	}
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration(){
		UnresolvedTypeDeclarationImpl theUnresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		
		ASTNode.allInstances.add(theUnresolvedTypeDeclaration);
		NamedElement.allInstances.add(theUnresolvedTypeDeclaration);
		BodyDeclaration.allInstances.add(theUnresolvedTypeDeclaration);
		Type.allInstances.add(theUnresolvedTypeDeclaration);
		AbstractTypeDeclaration.allInstances.add(theUnresolvedTypeDeclaration);
		UnresolvedItem.allInstances.add(theUnresolvedTypeDeclaration);
		UnresolvedTypeDeclaration.allInstances.add(theUnresolvedTypeDeclaration);
		
		return theUnresolvedTypeDeclaration;
	}
	public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment(){
		UnresolvedVariableDeclarationFragmentImpl theUnresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
		
		ASTNode.allInstances.add(theUnresolvedVariableDeclarationFragment);
		NamedElement.allInstances.add(theUnresolvedVariableDeclarationFragment);
		VariableDeclaration.allInstances.add(theUnresolvedVariableDeclarationFragment);
		VariableDeclarationFragment.allInstances.add(theUnresolvedVariableDeclarationFragment);
		UnresolvedItem.allInstances.add(theUnresolvedVariableDeclarationFragment);
		UnresolvedVariableDeclarationFragment.allInstances.add(theUnresolvedVariableDeclarationFragment);
		
		return theUnresolvedVariableDeclarationFragment;
	}
	public VariableDeclarationExpression createVariableDeclarationExpression(){
		VariableDeclarationExpressionImpl theVariableDeclarationExpression = new VariableDeclarationExpressionImpl();
		
		ASTNode.allInstances.add(theVariableDeclarationExpression);
		Expression.allInstances.add(theVariableDeclarationExpression);
		AbstractVariablesContainer.allInstances.add(theVariableDeclarationExpression);
		VariableDeclarationExpression.allInstances.add(theVariableDeclarationExpression);
		
		return theVariableDeclarationExpression;
	}
	public VariableDeclarationFragment createVariableDeclarationFragment(){
		VariableDeclarationFragmentImpl theVariableDeclarationFragment = new VariableDeclarationFragmentImpl();
		
		ASTNode.allInstances.add(theVariableDeclarationFragment);
		NamedElement.allInstances.add(theVariableDeclarationFragment);
		VariableDeclaration.allInstances.add(theVariableDeclarationFragment);
		VariableDeclarationFragment.allInstances.add(theVariableDeclarationFragment);
		
		return theVariableDeclarationFragment;
	}
	public VariableDeclarationStatement createVariableDeclarationStatement(){
		VariableDeclarationStatementImpl theVariableDeclarationStatement = new VariableDeclarationStatementImpl();
		
		ASTNode.allInstances.add(theVariableDeclarationStatement);
		Statement.allInstances.add(theVariableDeclarationStatement);
		AbstractVariablesContainer.allInstances.add(theVariableDeclarationStatement);
		VariableDeclarationStatement.allInstances.add(theVariableDeclarationStatement);
		
		return theVariableDeclarationStatement;
	}
	public WildCardType createWildCardType(){
		WildCardTypeImpl theWildCardType = new WildCardTypeImpl();
		
		ASTNode.allInstances.add(theWildCardType);
		NamedElement.allInstances.add(theWildCardType);
		Type.allInstances.add(theWildCardType);
		WildCardType.allInstances.add(theWildCardType);
		
		return theWildCardType;
	}
	public WhileStatement createWhileStatement(){
		WhileStatementImpl theWhileStatement = new WhileStatementImpl();
		
		ASTNode.allInstances.add(theWhileStatement);
		Statement.allInstances.add(theWhileStatement);
		WhileStatement.allInstances.add(theWhileStatement);
		
		return theWhileStatement;
	}
	
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Java_PackageImpl.ANNOTATION: return createAnnotation();
			case Java_PackageImpl.ARCHIVE: return createArchive();
			case Java_PackageImpl.ASSERTSTATEMENT: return createAssertStatement();
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR: return createAnnotationMemberValuePair();
			case Java_PackageImpl.ANNOTATIONTYPEDECLARATION: return createAnnotationTypeDeclaration();
			case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION: return createAnnotationTypeMemberDeclaration();
			case Java_PackageImpl.ANONYMOUSCLASSDECLARATION: return createAnonymousClassDeclaration();
			case Java_PackageImpl.ARRAYACCESS: return createArrayAccess();
			case Java_PackageImpl.ARRAYCREATION: return createArrayCreation();
			case Java_PackageImpl.ARRAYINITIALIZER: return createArrayInitializer();
			case Java_PackageImpl.ARRAYLENGTHACCESS: return createArrayLengthAccess();
			case Java_PackageImpl.ARRAYTYPE: return createArrayType();
			case Java_PackageImpl.ASSIGNMENT: return createAssignment();
			case Java_PackageImpl.BOOLEANLITERAL: return createBooleanLiteral();
			case Java_PackageImpl.BLOCKCOMMENT: return createBlockComment();
			case Java_PackageImpl.BLOCK: return createBlock();
			case Java_PackageImpl.BREAKSTATEMENT: return createBreakStatement();
			case Java_PackageImpl.CASTEXPRESSION: return createCastExpression();
			case Java_PackageImpl.CATCHCLAUSE: return createCatchClause();
			case Java_PackageImpl.CHARACTERLITERAL: return createCharacterLiteral();
			case Java_PackageImpl.CLASSFILE: return createClassFile();
			case Java_PackageImpl.CLASSINSTANCECREATION: return createClassInstanceCreation();
			case Java_PackageImpl.CONSTRUCTORDECLARATION: return createConstructorDeclaration();
			case Java_PackageImpl.CONDITIONALEXPRESSION: return createConditionalExpression();
			case Java_PackageImpl.CONSTRUCTORINVOCATION: return createConstructorInvocation();
			case Java_PackageImpl.CLASSDECLARATION: return createClassDeclaration();
			case Java_PackageImpl.COMPILATIONUNIT: return createCompilationUnit();
			case Java_PackageImpl.CONTINUESTATEMENT: return createContinueStatement();
			case Java_PackageImpl.DOSTATEMENT: return createDoStatement();
			case Java_PackageImpl.EMPTYSTATEMENT: return createEmptyStatement();
			case Java_PackageImpl.ENHANCEDFORSTATEMENT: return createEnhancedForStatement();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION: return createEnumConstantDeclaration();
			case Java_PackageImpl.ENUMDECLARATION: return createEnumDeclaration();
			case Java_PackageImpl.EXPRESSIONSTATEMENT: return createExpressionStatement();
			case Java_PackageImpl.FIELDACCESS: return createFieldAccess();
			case Java_PackageImpl.FIELDDECLARATION: return createFieldDeclaration();
			case Java_PackageImpl.FORSTATEMENT: return createForStatement();
			case Java_PackageImpl.IFSTATEMENT: return createIfStatement();
			case Java_PackageImpl.IMPORTDECLARATION: return createImportDeclaration();
			case Java_PackageImpl.INFIXEXPRESSION: return createInfixExpression();
			case Java_PackageImpl.INITIALIZER: return createInitializer();
			case Java_PackageImpl.INSTANCEOFEXPRESSION: return createInstanceofExpression();
			case Java_PackageImpl.INTERFACEDECLARATION: return createInterfaceDeclaration();
			case Java_PackageImpl.JAVADOC: return createJavadoc();
			case Java_PackageImpl.LABELEDSTATEMENT: return createLabeledStatement();
			case Java_PackageImpl.LINECOMMENT: return createLineComment();
			case Java_PackageImpl.MANIFEST: return createManifest();
			case Java_PackageImpl.MANIFESTATTRIBUTE: return createManifestAttribute();
			case Java_PackageImpl.MANIFESTENTRY: return createManifestEntry();
			case Java_PackageImpl.MEMBERREF: return createMemberRef();
			case Java_PackageImpl.METHODDECLARATION: return createMethodDeclaration();
			case Java_PackageImpl.METHODINVOCATION: return createMethodInvocation();
			case Java_PackageImpl.METHODREF: return createMethodRef();
			case Java_PackageImpl.METHODREFPARAMETER: return createMethodRefParameter();
			case Java_PackageImpl.MODEL: return createModel();
			case Java_PackageImpl.MODIFIER: return createModifier();
			case Java_PackageImpl.NUMBERLITERAL: return createNumberLiteral();
			case Java_PackageImpl.NULLLITERAL: return createNullLiteral();
			case Java_PackageImpl.PACKAGE: return createPackage();
			case Java_PackageImpl.PACKAGEACCESS: return createPackageAccess();
			case Java_PackageImpl.PARAMETERIZEDTYPE: return createParameterizedType();
			case Java_PackageImpl.PARENTHESIZEDEXPRESSION: return createParenthesizedExpression();
			case Java_PackageImpl.POSTFIXEXPRESSION: return createPostfixExpression();
			case Java_PackageImpl.PREFIXEXPRESSION: return createPrefixExpression();
			case Java_PackageImpl.PRIMITIVETYPE: return createPrimitiveType();
			case Java_PackageImpl.PRIMITIVETYPEBOOLEAN: return createPrimitiveTypeBoolean();
			case Java_PackageImpl.PRIMITIVETYPEBYTE: return createPrimitiveTypeByte();
			case Java_PackageImpl.PRIMITIVETYPECHAR: return createPrimitiveTypeChar();
			case Java_PackageImpl.PRIMITIVETYPEDOUBLE: return createPrimitiveTypeDouble();
			case Java_PackageImpl.PRIMITIVETYPESHORT: return createPrimitiveTypeShort();
			case Java_PackageImpl.PRIMITIVETYPEFLOAT: return createPrimitiveTypeFloat();
			case Java_PackageImpl.PRIMITIVETYPEINT: return createPrimitiveTypeInt();
			case Java_PackageImpl.PRIMITIVETYPELONG: return createPrimitiveTypeLong();
			case Java_PackageImpl.PRIMITIVETYPEVOID: return createPrimitiveTypeVoid();
			case Java_PackageImpl.RETURNSTATEMENT: return createReturnStatement();
			case Java_PackageImpl.SINGLEVARIABLEACCESS: return createSingleVariableAccess();
			case Java_PackageImpl.SINGLEVARIABLEDECLARATION: return createSingleVariableDeclaration();
			case Java_PackageImpl.STRINGLITERAL: return createStringLiteral();
			case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION: return createSuperConstructorInvocation();
			case Java_PackageImpl.SUPERFIELDACCESS: return createSuperFieldAccess();
			case Java_PackageImpl.SUPERMETHODINVOCATION: return createSuperMethodInvocation();
			case Java_PackageImpl.SWITCHCASE: return createSwitchCase();
			case Java_PackageImpl.SWITCHSTATEMENT: return createSwitchStatement();
			case Java_PackageImpl.SYNCHRONIZEDSTATEMENT: return createSynchronizedStatement();
			case Java_PackageImpl.TAGELEMENT: return createTagElement();
			case Java_PackageImpl.TEXTELEMENT: return createTextElement();
			case Java_PackageImpl.THISEXPRESSION: return createThisExpression();
			case Java_PackageImpl.THROWSTATEMENT: return createThrowStatement();
			case Java_PackageImpl.TRYSTATEMENT: return createTryStatement();
			case Java_PackageImpl.TYPEACCESS: return createTypeAccess();
			case Java_PackageImpl.TYPEDECLARATIONSTATEMENT: return createTypeDeclarationStatement();
			case Java_PackageImpl.TYPELITERAL: return createTypeLiteral();
			case Java_PackageImpl.TYPEPARAMETER: return createTypeParameter();
			case Java_PackageImpl.UNRESOLVEDITEM: return createUnresolvedItem();
			case Java_PackageImpl.UNRESOLVEDITEMACCESS: return createUnresolvedItemAccess();
			case Java_PackageImpl.UNRESOLVEDANNOTATIONDECLARATION: return createUnresolvedAnnotationDeclaration();
			case Java_PackageImpl.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION: return createUnresolvedAnnotationTypeMemberDeclaration();
			case Java_PackageImpl.UNRESOLVEDCLASSDECLARATION: return createUnresolvedClassDeclaration();
			case Java_PackageImpl.UNRESOLVEDENUMDECLARATION: return createUnresolvedEnumDeclaration();
			case Java_PackageImpl.UNRESOLVEDINTERFACEDECLARATION: return createUnresolvedInterfaceDeclaration();
			case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT: return createUnresolvedLabeledStatement();
			case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION: return createUnresolvedMethodDeclaration();
			case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION: return createUnresolvedSingleVariableDeclaration();
			case Java_PackageImpl.UNRESOLVEDTYPE: return createUnresolvedType();
			case Java_PackageImpl.UNRESOLVEDTYPEDECLARATION: return createUnresolvedTypeDeclaration();
			case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT: return createUnresolvedVariableDeclarationFragment();
			case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION: return createVariableDeclarationExpression();
			case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT: return createVariableDeclarationFragment();
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT: return createVariableDeclarationStatement();
			case Java_PackageImpl.WILDCARDTYPE: return createWildCardType();
			case Java_PackageImpl.WHILESTATEMENT: return createWhileStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Java_PackageImpl.ASSIGNMENTKIND:
			return createAssignmentKindFromString(eDataType, initialValue);
		case Java_PackageImpl.INFIXEXPRESSIONKIND:
			return createInfixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.INHERITANCEKIND:
			return createInheritanceKindFromString(eDataType, initialValue);
		case Java_PackageImpl.POSTFIXEXPRESSIONKIND:
			return createPostfixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.PREFIXEXPRESSIONKIND:
			return createPrefixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.VISIBILITYKIND:
			return createVisibilityKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}
	
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Java_PackageImpl.ASSIGNMENTKIND:
			return convertAssignmentKindToString(eDataType, instanceValue);
		case Java_PackageImpl.INFIXEXPRESSIONKIND:
			return convertInfixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.INHERITANCEKIND:
			return convertInheritanceKindToString(eDataType, instanceValue);
		case Java_PackageImpl.POSTFIXEXPRESSIONKIND:
			return convertPostfixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.PREFIXEXPRESSIONKIND:
			return convertPrefixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.VISIBILITYKIND:
			return convertVisibilityKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}
	
	public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
		AssignmentKind result = AssignmentKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public InfixExpressionKind createInfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		InfixExpressionKind result = InfixExpressionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertInfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
		InheritanceKind result = InheritanceKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertInheritanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public PostfixExpressionKind createPostfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PostfixExpressionKind result = PostfixExpressionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertPostfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public PrefixExpressionKind createPrefixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PrefixExpressionKind result = PrefixExpressionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertPrefixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}
	
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	
	public Java_Package getJava_() {
		return (Java_Package) getEPackage();
	}			
}
