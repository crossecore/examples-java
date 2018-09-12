/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
	 	using Ecore;
	 	using System;
namespace Java_{
	public class Java_FactoryImpl : EFactoryImpl, Java_Factory {
		
		public static Java_Factory eINSTANCE = Java_FactoryImpl.init();

        public static Java_Factory init()
        {
            return new Java_FactoryImpl();
        }
		
		public AbstractMethodDeclaration createAbstractMethodDeclaration(){
			var theAbstractMethodDeclaration = new AbstractMethodDeclarationImpl();
			AbstractMethodDeclarationImpl.allInstances_.Add(theAbstractMethodDeclaration);
			
			return theAbstractMethodDeclaration;
		}
		public AbstractMethodInvocation createAbstractMethodInvocation(){
			var theAbstractMethodInvocation = new AbstractMethodInvocationImpl();
			AbstractMethodInvocationImpl.allInstances_.Add(theAbstractMethodInvocation);
			
			return theAbstractMethodInvocation;
		}
		public AbstractTypeDeclaration createAbstractTypeDeclaration(){
			var theAbstractTypeDeclaration = new AbstractTypeDeclarationImpl();
			AbstractTypeDeclarationImpl.allInstances_.Add(theAbstractTypeDeclaration);
			
			return theAbstractTypeDeclaration;
		}
		public AbstractTypeQualifiedExpression createAbstractTypeQualifiedExpression(){
			var theAbstractTypeQualifiedExpression = new AbstractTypeQualifiedExpressionImpl();
			AbstractTypeQualifiedExpressionImpl.allInstances_.Add(theAbstractTypeQualifiedExpression);
			
			return theAbstractTypeQualifiedExpression;
		}
		public AbstractVariablesContainer createAbstractVariablesContainer(){
			var theAbstractVariablesContainer = new AbstractVariablesContainerImpl();
			AbstractVariablesContainerImpl.allInstances_.Add(theAbstractVariablesContainer);
			
			return theAbstractVariablesContainer;
		}
		public Annotation createAnnotation(){
			var theAnnotation = new AnnotationImpl();
			AnnotationImpl.allInstances_.Add(theAnnotation);
			
			return theAnnotation;
		}
		public Archive createArchive(){
			var theArchive = new ArchiveImpl();
			ArchiveImpl.allInstances_.Add(theArchive);
			
			return theArchive;
		}
		public AssertStatement createAssertStatement(){
			var theAssertStatement = new AssertStatementImpl();
			AssertStatementImpl.allInstances_.Add(theAssertStatement);
			
			return theAssertStatement;
		}
		public ASTNode createASTNode(){
			var theASTNode = new ASTNodeImpl();
			ASTNodeImpl.allInstances_.Add(theASTNode);
			
			return theASTNode;
		}
		public AnnotationMemberValuePair createAnnotationMemberValuePair(){
			var theAnnotationMemberValuePair = new AnnotationMemberValuePairImpl();
			AnnotationMemberValuePairImpl.allInstances_.Add(theAnnotationMemberValuePair);
			
			return theAnnotationMemberValuePair;
		}
		public AnnotationTypeDeclaration createAnnotationTypeDeclaration(){
			var theAnnotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
			AnnotationTypeDeclarationImpl.allInstances_.Add(theAnnotationTypeDeclaration);
			
			return theAnnotationTypeDeclaration;
		}
		public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration(){
			var theAnnotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
			AnnotationTypeMemberDeclarationImpl.allInstances_.Add(theAnnotationTypeMemberDeclaration);
			
			return theAnnotationTypeMemberDeclaration;
		}
		public AnonymousClassDeclaration createAnonymousClassDeclaration(){
			var theAnonymousClassDeclaration = new AnonymousClassDeclarationImpl();
			AnonymousClassDeclarationImpl.allInstances_.Add(theAnonymousClassDeclaration);
			
			return theAnonymousClassDeclaration;
		}
		public ArrayAccess createArrayAccess(){
			var theArrayAccess = new ArrayAccessImpl();
			ArrayAccessImpl.allInstances_.Add(theArrayAccess);
			
			return theArrayAccess;
		}
		public ArrayCreation createArrayCreation(){
			var theArrayCreation = new ArrayCreationImpl();
			ArrayCreationImpl.allInstances_.Add(theArrayCreation);
			
			return theArrayCreation;
		}
		public ArrayInitializer createArrayInitializer(){
			var theArrayInitializer = new ArrayInitializerImpl();
			ArrayInitializerImpl.allInstances_.Add(theArrayInitializer);
			
			return theArrayInitializer;
		}
		public ArrayLengthAccess createArrayLengthAccess(){
			var theArrayLengthAccess = new ArrayLengthAccessImpl();
			ArrayLengthAccessImpl.allInstances_.Add(theArrayLengthAccess);
			
			return theArrayLengthAccess;
		}
		public ArrayType createArrayType(){
			var theArrayType = new ArrayTypeImpl();
			ArrayTypeImpl.allInstances_.Add(theArrayType);
			
			return theArrayType;
		}
		public Assignment createAssignment(){
			var theAssignment = new AssignmentImpl();
			AssignmentImpl.allInstances_.Add(theAssignment);
			
			return theAssignment;
		}
		public BodyDeclaration createBodyDeclaration(){
			var theBodyDeclaration = new BodyDeclarationImpl();
			BodyDeclarationImpl.allInstances_.Add(theBodyDeclaration);
			
			return theBodyDeclaration;
		}
		public BooleanLiteral createBooleanLiteral(){
			var theBooleanLiteral = new BooleanLiteralImpl();
			BooleanLiteralImpl.allInstances_.Add(theBooleanLiteral);
			
			return theBooleanLiteral;
		}
		public BlockComment createBlockComment(){
			var theBlockComment = new BlockCommentImpl();
			BlockCommentImpl.allInstances_.Add(theBlockComment);
			
			return theBlockComment;
		}
		public Block createBlock(){
			var theBlock = new BlockImpl();
			BlockImpl.allInstances_.Add(theBlock);
			
			return theBlock;
		}
		public BreakStatement createBreakStatement(){
			var theBreakStatement = new BreakStatementImpl();
			BreakStatementImpl.allInstances_.Add(theBreakStatement);
			
			return theBreakStatement;
		}
		public CastExpression createCastExpression(){
			var theCastExpression = new CastExpressionImpl();
			CastExpressionImpl.allInstances_.Add(theCastExpression);
			
			return theCastExpression;
		}
		public CatchClause createCatchClause(){
			var theCatchClause = new CatchClauseImpl();
			CatchClauseImpl.allInstances_.Add(theCatchClause);
			
			return theCatchClause;
		}
		public CharacterLiteral createCharacterLiteral(){
			var theCharacterLiteral = new CharacterLiteralImpl();
			CharacterLiteralImpl.allInstances_.Add(theCharacterLiteral);
			
			return theCharacterLiteral;
		}
		public ClassFile createClassFile(){
			var theClassFile = new ClassFileImpl();
			ClassFileImpl.allInstances_.Add(theClassFile);
			
			return theClassFile;
		}
		public ClassInstanceCreation createClassInstanceCreation(){
			var theClassInstanceCreation = new ClassInstanceCreationImpl();
			ClassInstanceCreationImpl.allInstances_.Add(theClassInstanceCreation);
			
			return theClassInstanceCreation;
		}
		public ConstructorDeclaration createConstructorDeclaration(){
			var theConstructorDeclaration = new ConstructorDeclarationImpl();
			ConstructorDeclarationImpl.allInstances_.Add(theConstructorDeclaration);
			
			return theConstructorDeclaration;
		}
		public ConditionalExpression createConditionalExpression(){
			var theConditionalExpression = new ConditionalExpressionImpl();
			ConditionalExpressionImpl.allInstances_.Add(theConditionalExpression);
			
			return theConditionalExpression;
		}
		public ConstructorInvocation createConstructorInvocation(){
			var theConstructorInvocation = new ConstructorInvocationImpl();
			ConstructorInvocationImpl.allInstances_.Add(theConstructorInvocation);
			
			return theConstructorInvocation;
		}
		public ClassDeclaration createClassDeclaration(){
			var theClassDeclaration = new ClassDeclarationImpl();
			ClassDeclarationImpl.allInstances_.Add(theClassDeclaration);
			
			return theClassDeclaration;
		}
		public Comment createComment(){
			var theComment = new CommentImpl();
			CommentImpl.allInstances_.Add(theComment);
			
			return theComment;
		}
		public CompilationUnit createCompilationUnit(){
			var theCompilationUnit = new CompilationUnitImpl();
			CompilationUnitImpl.allInstances_.Add(theCompilationUnit);
			
			return theCompilationUnit;
		}
		public ContinueStatement createContinueStatement(){
			var theContinueStatement = new ContinueStatementImpl();
			ContinueStatementImpl.allInstances_.Add(theContinueStatement);
			
			return theContinueStatement;
		}
		public DoStatement createDoStatement(){
			var theDoStatement = new DoStatementImpl();
			DoStatementImpl.allInstances_.Add(theDoStatement);
			
			return theDoStatement;
		}
		public EmptyStatement createEmptyStatement(){
			var theEmptyStatement = new EmptyStatementImpl();
			EmptyStatementImpl.allInstances_.Add(theEmptyStatement);
			
			return theEmptyStatement;
		}
		public EnhancedForStatement createEnhancedForStatement(){
			var theEnhancedForStatement = new EnhancedForStatementImpl();
			EnhancedForStatementImpl.allInstances_.Add(theEnhancedForStatement);
			
			return theEnhancedForStatement;
		}
		public EnumConstantDeclaration createEnumConstantDeclaration(){
			var theEnumConstantDeclaration = new EnumConstantDeclarationImpl();
			EnumConstantDeclarationImpl.allInstances_.Add(theEnumConstantDeclaration);
			
			return theEnumConstantDeclaration;
		}
		public EnumDeclaration createEnumDeclaration(){
			var theEnumDeclaration = new EnumDeclarationImpl();
			EnumDeclarationImpl.allInstances_.Add(theEnumDeclaration);
			
			return theEnumDeclaration;
		}
		public Expression createExpression(){
			var theExpression = new ExpressionImpl();
			ExpressionImpl.allInstances_.Add(theExpression);
			
			return theExpression;
		}
		public ExpressionStatement createExpressionStatement(){
			var theExpressionStatement = new ExpressionStatementImpl();
			ExpressionStatementImpl.allInstances_.Add(theExpressionStatement);
			
			return theExpressionStatement;
		}
		public FieldAccess createFieldAccess(){
			var theFieldAccess = new FieldAccessImpl();
			FieldAccessImpl.allInstances_.Add(theFieldAccess);
			
			return theFieldAccess;
		}
		public FieldDeclaration createFieldDeclaration(){
			var theFieldDeclaration = new FieldDeclarationImpl();
			FieldDeclarationImpl.allInstances_.Add(theFieldDeclaration);
			
			return theFieldDeclaration;
		}
		public ForStatement createForStatement(){
			var theForStatement = new ForStatementImpl();
			ForStatementImpl.allInstances_.Add(theForStatement);
			
			return theForStatement;
		}
		public IfStatement createIfStatement(){
			var theIfStatement = new IfStatementImpl();
			IfStatementImpl.allInstances_.Add(theIfStatement);
			
			return theIfStatement;
		}
		public ImportDeclaration createImportDeclaration(){
			var theImportDeclaration = new ImportDeclarationImpl();
			ImportDeclarationImpl.allInstances_.Add(theImportDeclaration);
			
			return theImportDeclaration;
		}
		public InfixExpression createInfixExpression(){
			var theInfixExpression = new InfixExpressionImpl();
			InfixExpressionImpl.allInstances_.Add(theInfixExpression);
			
			return theInfixExpression;
		}
		public Initializer createInitializer(){
			var theInitializer = new InitializerImpl();
			InitializerImpl.allInstances_.Add(theInitializer);
			
			return theInitializer;
		}
		public InstanceofExpression createInstanceofExpression(){
			var theInstanceofExpression = new InstanceofExpressionImpl();
			InstanceofExpressionImpl.allInstances_.Add(theInstanceofExpression);
			
			return theInstanceofExpression;
		}
		public InterfaceDeclaration createInterfaceDeclaration(){
			var theInterfaceDeclaration = new InterfaceDeclarationImpl();
			InterfaceDeclarationImpl.allInstances_.Add(theInterfaceDeclaration);
			
			return theInterfaceDeclaration;
		}
		public Javadoc createJavadoc(){
			var theJavadoc = new JavadocImpl();
			JavadocImpl.allInstances_.Add(theJavadoc);
			
			return theJavadoc;
		}
		public LabeledStatement createLabeledStatement(){
			var theLabeledStatement = new LabeledStatementImpl();
			LabeledStatementImpl.allInstances_.Add(theLabeledStatement);
			
			return theLabeledStatement;
		}
		public LineComment createLineComment(){
			var theLineComment = new LineCommentImpl();
			LineCommentImpl.allInstances_.Add(theLineComment);
			
			return theLineComment;
		}
		public Manifest createManifest(){
			var theManifest = new ManifestImpl();
			ManifestImpl.allInstances_.Add(theManifest);
			
			return theManifest;
		}
		public ManifestAttribute createManifestAttribute(){
			var theManifestAttribute = new ManifestAttributeImpl();
			ManifestAttributeImpl.allInstances_.Add(theManifestAttribute);
			
			return theManifestAttribute;
		}
		public ManifestEntry createManifestEntry(){
			var theManifestEntry = new ManifestEntryImpl();
			ManifestEntryImpl.allInstances_.Add(theManifestEntry);
			
			return theManifestEntry;
		}
		public MemberRef createMemberRef(){
			var theMemberRef = new MemberRefImpl();
			MemberRefImpl.allInstances_.Add(theMemberRef);
			
			return theMemberRef;
		}
		public MethodDeclaration createMethodDeclaration(){
			var theMethodDeclaration = new MethodDeclarationImpl();
			MethodDeclarationImpl.allInstances_.Add(theMethodDeclaration);
			
			return theMethodDeclaration;
		}
		public MethodInvocation createMethodInvocation(){
			var theMethodInvocation = new MethodInvocationImpl();
			MethodInvocationImpl.allInstances_.Add(theMethodInvocation);
			
			return theMethodInvocation;
		}
		public MethodRef createMethodRef(){
			var theMethodRef = new MethodRefImpl();
			MethodRefImpl.allInstances_.Add(theMethodRef);
			
			return theMethodRef;
		}
		public MethodRefParameter createMethodRefParameter(){
			var theMethodRefParameter = new MethodRefParameterImpl();
			MethodRefParameterImpl.allInstances_.Add(theMethodRefParameter);
			
			return theMethodRefParameter;
		}
		public Model createModel(){
			var theModel = new ModelImpl();
			ModelImpl.allInstances_.Add(theModel);
			
			return theModel;
		}
		public Modifier createModifier(){
			var theModifier = new ModifierImpl();
			ModifierImpl.allInstances_.Add(theModifier);
			
			return theModifier;
		}
		public NamedElement createNamedElement(){
			var theNamedElement = new NamedElementImpl();
			NamedElementImpl.allInstances_.Add(theNamedElement);
			
			return theNamedElement;
		}
		public NamespaceAccess createNamespaceAccess(){
			var theNamespaceAccess = new NamespaceAccessImpl();
			NamespaceAccessImpl.allInstances_.Add(theNamespaceAccess);
			
			return theNamespaceAccess;
		}
		public NumberLiteral createNumberLiteral(){
			var theNumberLiteral = new NumberLiteralImpl();
			NumberLiteralImpl.allInstances_.Add(theNumberLiteral);
			
			return theNumberLiteral;
		}
		public NullLiteral createNullLiteral(){
			var theNullLiteral = new NullLiteralImpl();
			NullLiteralImpl.allInstances_.Add(theNullLiteral);
			
			return theNullLiteral;
		}
		public Package createPackage(){
			var thePackage = new PackageImpl();
			PackageImpl.allInstances_.Add(thePackage);
			
			return thePackage;
		}
		public PackageAccess createPackageAccess(){
			var thePackageAccess = new PackageAccessImpl();
			PackageAccessImpl.allInstances_.Add(thePackageAccess);
			
			return thePackageAccess;
		}
		public ParameterizedType createParameterizedType(){
			var theParameterizedType = new ParameterizedTypeImpl();
			ParameterizedTypeImpl.allInstances_.Add(theParameterizedType);
			
			return theParameterizedType;
		}
		public ParenthesizedExpression createParenthesizedExpression(){
			var theParenthesizedExpression = new ParenthesizedExpressionImpl();
			ParenthesizedExpressionImpl.allInstances_.Add(theParenthesizedExpression);
			
			return theParenthesizedExpression;
		}
		public PostfixExpression createPostfixExpression(){
			var thePostfixExpression = new PostfixExpressionImpl();
			PostfixExpressionImpl.allInstances_.Add(thePostfixExpression);
			
			return thePostfixExpression;
		}
		public PrefixExpression createPrefixExpression(){
			var thePrefixExpression = new PrefixExpressionImpl();
			PrefixExpressionImpl.allInstances_.Add(thePrefixExpression);
			
			return thePrefixExpression;
		}
		public PrimitiveType createPrimitiveType(){
			var thePrimitiveType = new PrimitiveTypeImpl();
			PrimitiveTypeImpl.allInstances_.Add(thePrimitiveType);
			
			return thePrimitiveType;
		}
		public PrimitiveTypeBoolean createPrimitiveTypeBoolean(){
			var thePrimitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
			PrimitiveTypeBooleanImpl.allInstances_.Add(thePrimitiveTypeBoolean);
			
			return thePrimitiveTypeBoolean;
		}
		public PrimitiveTypeByte createPrimitiveTypeByte(){
			var thePrimitiveTypeByte = new PrimitiveTypeByteImpl();
			PrimitiveTypeByteImpl.allInstances_.Add(thePrimitiveTypeByte);
			
			return thePrimitiveTypeByte;
		}
		public PrimitiveTypeChar createPrimitiveTypeChar(){
			var thePrimitiveTypeChar = new PrimitiveTypeCharImpl();
			PrimitiveTypeCharImpl.allInstances_.Add(thePrimitiveTypeChar);
			
			return thePrimitiveTypeChar;
		}
		public PrimitiveTypeDouble createPrimitiveTypeDouble(){
			var thePrimitiveTypeDouble = new PrimitiveTypeDoubleImpl();
			PrimitiveTypeDoubleImpl.allInstances_.Add(thePrimitiveTypeDouble);
			
			return thePrimitiveTypeDouble;
		}
		public PrimitiveTypeShort createPrimitiveTypeShort(){
			var thePrimitiveTypeShort = new PrimitiveTypeShortImpl();
			PrimitiveTypeShortImpl.allInstances_.Add(thePrimitiveTypeShort);
			
			return thePrimitiveTypeShort;
		}
		public PrimitiveTypeFloat createPrimitiveTypeFloat(){
			var thePrimitiveTypeFloat = new PrimitiveTypeFloatImpl();
			PrimitiveTypeFloatImpl.allInstances_.Add(thePrimitiveTypeFloat);
			
			return thePrimitiveTypeFloat;
		}
		public PrimitiveTypeInt createPrimitiveTypeInt(){
			var thePrimitiveTypeInt = new PrimitiveTypeIntImpl();
			PrimitiveTypeIntImpl.allInstances_.Add(thePrimitiveTypeInt);
			
			return thePrimitiveTypeInt;
		}
		public PrimitiveTypeLong createPrimitiveTypeLong(){
			var thePrimitiveTypeLong = new PrimitiveTypeLongImpl();
			PrimitiveTypeLongImpl.allInstances_.Add(thePrimitiveTypeLong);
			
			return thePrimitiveTypeLong;
		}
		public PrimitiveTypeVoid createPrimitiveTypeVoid(){
			var thePrimitiveTypeVoid = new PrimitiveTypeVoidImpl();
			PrimitiveTypeVoidImpl.allInstances_.Add(thePrimitiveTypeVoid);
			
			return thePrimitiveTypeVoid;
		}
		public ReturnStatement createReturnStatement(){
			var theReturnStatement = new ReturnStatementImpl();
			ReturnStatementImpl.allInstances_.Add(theReturnStatement);
			
			return theReturnStatement;
		}
		public SingleVariableAccess createSingleVariableAccess(){
			var theSingleVariableAccess = new SingleVariableAccessImpl();
			SingleVariableAccessImpl.allInstances_.Add(theSingleVariableAccess);
			
			return theSingleVariableAccess;
		}
		public SingleVariableDeclaration createSingleVariableDeclaration(){
			var theSingleVariableDeclaration = new SingleVariableDeclarationImpl();
			SingleVariableDeclarationImpl.allInstances_.Add(theSingleVariableDeclaration);
			
			return theSingleVariableDeclaration;
		}
		public Statement createStatement(){
			var theStatement = new StatementImpl();
			StatementImpl.allInstances_.Add(theStatement);
			
			return theStatement;
		}
		public StringLiteral createStringLiteral(){
			var theStringLiteral = new StringLiteralImpl();
			StringLiteralImpl.allInstances_.Add(theStringLiteral);
			
			return theStringLiteral;
		}
		public SuperConstructorInvocation createSuperConstructorInvocation(){
			var theSuperConstructorInvocation = new SuperConstructorInvocationImpl();
			SuperConstructorInvocationImpl.allInstances_.Add(theSuperConstructorInvocation);
			
			return theSuperConstructorInvocation;
		}
		public SuperFieldAccess createSuperFieldAccess(){
			var theSuperFieldAccess = new SuperFieldAccessImpl();
			SuperFieldAccessImpl.allInstances_.Add(theSuperFieldAccess);
			
			return theSuperFieldAccess;
		}
		public SuperMethodInvocation createSuperMethodInvocation(){
			var theSuperMethodInvocation = new SuperMethodInvocationImpl();
			SuperMethodInvocationImpl.allInstances_.Add(theSuperMethodInvocation);
			
			return theSuperMethodInvocation;
		}
		public SwitchCase createSwitchCase(){
			var theSwitchCase = new SwitchCaseImpl();
			SwitchCaseImpl.allInstances_.Add(theSwitchCase);
			
			return theSwitchCase;
		}
		public SwitchStatement createSwitchStatement(){
			var theSwitchStatement = new SwitchStatementImpl();
			SwitchStatementImpl.allInstances_.Add(theSwitchStatement);
			
			return theSwitchStatement;
		}
		public SynchronizedStatement createSynchronizedStatement(){
			var theSynchronizedStatement = new SynchronizedStatementImpl();
			SynchronizedStatementImpl.allInstances_.Add(theSynchronizedStatement);
			
			return theSynchronizedStatement;
		}
		public TagElement createTagElement(){
			var theTagElement = new TagElementImpl();
			TagElementImpl.allInstances_.Add(theTagElement);
			
			return theTagElement;
		}
		public TextElement createTextElement(){
			var theTextElement = new TextElementImpl();
			TextElementImpl.allInstances_.Add(theTextElement);
			
			return theTextElement;
		}
		public ThisExpression createThisExpression(){
			var theThisExpression = new ThisExpressionImpl();
			ThisExpressionImpl.allInstances_.Add(theThisExpression);
			
			return theThisExpression;
		}
		public ThrowStatement createThrowStatement(){
			var theThrowStatement = new ThrowStatementImpl();
			ThrowStatementImpl.allInstances_.Add(theThrowStatement);
			
			return theThrowStatement;
		}
		public TryStatement createTryStatement(){
			var theTryStatement = new TryStatementImpl();
			TryStatementImpl.allInstances_.Add(theTryStatement);
			
			return theTryStatement;
		}
		public Type createType(){
			var theType = new TypeImpl();
			TypeImpl.allInstances_.Add(theType);
			
			return theType;
		}
		public TypeAccess createTypeAccess(){
			var theTypeAccess = new TypeAccessImpl();
			TypeAccessImpl.allInstances_.Add(theTypeAccess);
			
			return theTypeAccess;
		}
		public TypeDeclaration createTypeDeclaration(){
			var theTypeDeclaration = new TypeDeclarationImpl();
			TypeDeclarationImpl.allInstances_.Add(theTypeDeclaration);
			
			return theTypeDeclaration;
		}
		public TypeDeclarationStatement createTypeDeclarationStatement(){
			var theTypeDeclarationStatement = new TypeDeclarationStatementImpl();
			TypeDeclarationStatementImpl.allInstances_.Add(theTypeDeclarationStatement);
			
			return theTypeDeclarationStatement;
		}
		public TypeLiteral createTypeLiteral(){
			var theTypeLiteral = new TypeLiteralImpl();
			TypeLiteralImpl.allInstances_.Add(theTypeLiteral);
			
			return theTypeLiteral;
		}
		public TypeParameter createTypeParameter(){
			var theTypeParameter = new TypeParameterImpl();
			TypeParameterImpl.allInstances_.Add(theTypeParameter);
			
			return theTypeParameter;
		}
		public UnresolvedItem createUnresolvedItem(){
			var theUnresolvedItem = new UnresolvedItemImpl();
			UnresolvedItemImpl.allInstances_.Add(theUnresolvedItem);
			
			return theUnresolvedItem;
		}
		public UnresolvedItemAccess createUnresolvedItemAccess(){
			var theUnresolvedItemAccess = new UnresolvedItemAccessImpl();
			UnresolvedItemAccessImpl.allInstances_.Add(theUnresolvedItemAccess);
			
			return theUnresolvedItemAccess;
		}
		public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration(){
			var theUnresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
			UnresolvedAnnotationDeclarationImpl.allInstances_.Add(theUnresolvedAnnotationDeclaration);
			
			return theUnresolvedAnnotationDeclaration;
		}
		public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration(){
			var theUnresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
			UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_.Add(theUnresolvedAnnotationTypeMemberDeclaration);
			
			return theUnresolvedAnnotationTypeMemberDeclaration;
		}
		public UnresolvedClassDeclaration createUnresolvedClassDeclaration(){
			var theUnresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
			UnresolvedClassDeclarationImpl.allInstances_.Add(theUnresolvedClassDeclaration);
			
			return theUnresolvedClassDeclaration;
		}
		public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration(){
			var theUnresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
			UnresolvedEnumDeclarationImpl.allInstances_.Add(theUnresolvedEnumDeclaration);
			
			return theUnresolvedEnumDeclaration;
		}
		public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration(){
			var theUnresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
			UnresolvedInterfaceDeclarationImpl.allInstances_.Add(theUnresolvedInterfaceDeclaration);
			
			return theUnresolvedInterfaceDeclaration;
		}
		public UnresolvedLabeledStatement createUnresolvedLabeledStatement(){
			var theUnresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
			UnresolvedLabeledStatementImpl.allInstances_.Add(theUnresolvedLabeledStatement);
			
			return theUnresolvedLabeledStatement;
		}
		public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration(){
			var theUnresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
			UnresolvedMethodDeclarationImpl.allInstances_.Add(theUnresolvedMethodDeclaration);
			
			return theUnresolvedMethodDeclaration;
		}
		public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration(){
			var theUnresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
			UnresolvedSingleVariableDeclarationImpl.allInstances_.Add(theUnresolvedSingleVariableDeclaration);
			
			return theUnresolvedSingleVariableDeclaration;
		}
		public UnresolvedType createUnresolvedType(){
			var theUnresolvedType = new UnresolvedTypeImpl();
			UnresolvedTypeImpl.allInstances_.Add(theUnresolvedType);
			
			return theUnresolvedType;
		}
		public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration(){
			var theUnresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
			UnresolvedTypeDeclarationImpl.allInstances_.Add(theUnresolvedTypeDeclaration);
			
			return theUnresolvedTypeDeclaration;
		}
		public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment(){
			var theUnresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
			UnresolvedVariableDeclarationFragmentImpl.allInstances_.Add(theUnresolvedVariableDeclarationFragment);
			
			return theUnresolvedVariableDeclarationFragment;
		}
		public VariableDeclaration createVariableDeclaration(){
			var theVariableDeclaration = new VariableDeclarationImpl();
			VariableDeclarationImpl.allInstances_.Add(theVariableDeclaration);
			
			return theVariableDeclaration;
		}
		public VariableDeclarationExpression createVariableDeclarationExpression(){
			var theVariableDeclarationExpression = new VariableDeclarationExpressionImpl();
			VariableDeclarationExpressionImpl.allInstances_.Add(theVariableDeclarationExpression);
			
			return theVariableDeclarationExpression;
		}
		public VariableDeclarationFragment createVariableDeclarationFragment(){
			var theVariableDeclarationFragment = new VariableDeclarationFragmentImpl();
			VariableDeclarationFragmentImpl.allInstances_.Add(theVariableDeclarationFragment);
			
			return theVariableDeclarationFragment;
		}
		public VariableDeclarationStatement createVariableDeclarationStatement(){
			var theVariableDeclarationStatement = new VariableDeclarationStatementImpl();
			VariableDeclarationStatementImpl.allInstances_.Add(theVariableDeclarationStatement);
			
			return theVariableDeclarationStatement;
		}
		public WildCardType createWildCardType(){
			var theWildCardType = new WildCardTypeImpl();
			WildCardTypeImpl.allInstances_.Add(theWildCardType);
			
			return theWildCardType;
		}
		public WhileStatement createWhileStatement(){
			var theWhileStatement = new WhileStatementImpl();
			WhileStatementImpl.allInstances_.Add(theWhileStatement);
			
			return theWhileStatement;
		}
		
		public override EObject create(EClass eClass) {
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
					throw new ArgumentException("The class '" + eClass.name + "' is not a valid classifier");
			}
		}
		
		/*
		public override object createFromString(EDataType eDataType, string initialValue) {
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
				throw new ArgumentException("The datatype '" + eDataType.name + "' is not a valid classifier");
			}
		}
		*/
		
		public override String convertToString(EDataType eDataType, object instanceValue) {
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
				throw new ArgumentException("The datatype '" + eDataType.name + "' is not a valid classifier");
			}
		}
		
		
		/*
		public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
			AssignmentKind result = AssignmentKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertAssignmentKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		/*
		public InfixExpressionKind createInfixExpressionKindFromString(EDataType eDataType, String initialValue) {
			InfixExpressionKind result = InfixExpressionKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertInfixExpressionKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		/*
		public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
			InheritanceKind result = InheritanceKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertInheritanceKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		/*
		public PostfixExpressionKind createPostfixExpressionKindFromString(EDataType eDataType, String initialValue) {
			PostfixExpressionKind result = PostfixExpressionKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertPostfixExpressionKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		/*
		public PrefixExpressionKind createPrefixExpressionKindFromString(EDataType eDataType, String initialValue) {
			PrefixExpressionKind result = PrefixExpressionKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertPrefixExpressionKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		/*
		public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
			VisibilityKind result = VisibilityKind.get(initialValue);
			if (result == null)
				throw new IllegalArgumentException(
						"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
			return result;
		}
		*/
		
		public String convertVisibilityKindToString(EDataType eDataType, object instanceValue) {
			return instanceValue == null ? null : instanceValue.ToString();
		}
		
		
		/*
		public Java_Package getJava_() {
			return (Java_Package) getEPackage();
		}
		*/

	
	}
}
