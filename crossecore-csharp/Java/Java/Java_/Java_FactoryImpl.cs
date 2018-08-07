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
			return theAbstractMethodDeclaration;
		}
		public AbstractMethodInvocation createAbstractMethodInvocation(){
			var theAbstractMethodInvocation = new AbstractMethodInvocationImpl();
			return theAbstractMethodInvocation;
		}
		public AbstractTypeDeclaration createAbstractTypeDeclaration(){
			var theAbstractTypeDeclaration = new AbstractTypeDeclarationImpl();
			return theAbstractTypeDeclaration;
		}
		public AbstractTypeQualifiedExpression createAbstractTypeQualifiedExpression(){
			var theAbstractTypeQualifiedExpression = new AbstractTypeQualifiedExpressionImpl();
			return theAbstractTypeQualifiedExpression;
		}
		public AbstractVariablesContainer createAbstractVariablesContainer(){
			var theAbstractVariablesContainer = new AbstractVariablesContainerImpl();
			return theAbstractVariablesContainer;
		}
		public Annotation createAnnotation(){
			var theAnnotation = new AnnotationImpl();
			return theAnnotation;
		}
		public Archive createArchive(){
			var theArchive = new ArchiveImpl();
			return theArchive;
		}
		public AssertStatement createAssertStatement(){
			var theAssertStatement = new AssertStatementImpl();
			return theAssertStatement;
		}
		public ASTNode createASTNode(){
			var theASTNode = new ASTNodeImpl();
			return theASTNode;
		}
		public AnnotationMemberValuePair createAnnotationMemberValuePair(){
			var theAnnotationMemberValuePair = new AnnotationMemberValuePairImpl();
			return theAnnotationMemberValuePair;
		}
		public AnnotationTypeDeclaration createAnnotationTypeDeclaration(){
			var theAnnotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
			return theAnnotationTypeDeclaration;
		}
		public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration(){
			var theAnnotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
			return theAnnotationTypeMemberDeclaration;
		}
		public AnonymousClassDeclaration createAnonymousClassDeclaration(){
			var theAnonymousClassDeclaration = new AnonymousClassDeclarationImpl();
			return theAnonymousClassDeclaration;
		}
		public ArrayAccess createArrayAccess(){
			var theArrayAccess = new ArrayAccessImpl();
			return theArrayAccess;
		}
		public ArrayCreation createArrayCreation(){
			var theArrayCreation = new ArrayCreationImpl();
			return theArrayCreation;
		}
		public ArrayInitializer createArrayInitializer(){
			var theArrayInitializer = new ArrayInitializerImpl();
			return theArrayInitializer;
		}
		public ArrayLengthAccess createArrayLengthAccess(){
			var theArrayLengthAccess = new ArrayLengthAccessImpl();
			return theArrayLengthAccess;
		}
		public ArrayType createArrayType(){
			var theArrayType = new ArrayTypeImpl();
			return theArrayType;
		}
		public Assignment createAssignment(){
			var theAssignment = new AssignmentImpl();
			return theAssignment;
		}
		public BodyDeclaration createBodyDeclaration(){
			var theBodyDeclaration = new BodyDeclarationImpl();
			return theBodyDeclaration;
		}
		public BooleanLiteral createBooleanLiteral(){
			var theBooleanLiteral = new BooleanLiteralImpl();
			return theBooleanLiteral;
		}
		public BlockComment createBlockComment(){
			var theBlockComment = new BlockCommentImpl();
			return theBlockComment;
		}
		public Block createBlock(){
			var theBlock = new BlockImpl();
			return theBlock;
		}
		public BreakStatement createBreakStatement(){
			var theBreakStatement = new BreakStatementImpl();
			return theBreakStatement;
		}
		public CastExpression createCastExpression(){
			var theCastExpression = new CastExpressionImpl();
			return theCastExpression;
		}
		public CatchClause createCatchClause(){
			var theCatchClause = new CatchClauseImpl();
			return theCatchClause;
		}
		public CharacterLiteral createCharacterLiteral(){
			var theCharacterLiteral = new CharacterLiteralImpl();
			return theCharacterLiteral;
		}
		public ClassFile createClassFile(){
			var theClassFile = new ClassFileImpl();
			return theClassFile;
		}
		public ClassInstanceCreation createClassInstanceCreation(){
			var theClassInstanceCreation = new ClassInstanceCreationImpl();
			return theClassInstanceCreation;
		}
		public ConstructorDeclaration createConstructorDeclaration(){
			var theConstructorDeclaration = new ConstructorDeclarationImpl();
			return theConstructorDeclaration;
		}
		public ConditionalExpression createConditionalExpression(){
			var theConditionalExpression = new ConditionalExpressionImpl();
			return theConditionalExpression;
		}
		public ConstructorInvocation createConstructorInvocation(){
			var theConstructorInvocation = new ConstructorInvocationImpl();
			return theConstructorInvocation;
		}
		public ClassDeclaration createClassDeclaration(){
			var theClassDeclaration = new ClassDeclarationImpl();
			return theClassDeclaration;
		}
		public Comment createComment(){
			var theComment = new CommentImpl();
			return theComment;
		}
		public CompilationUnit createCompilationUnit(){
			var theCompilationUnit = new CompilationUnitImpl();
			return theCompilationUnit;
		}
		public ContinueStatement createContinueStatement(){
			var theContinueStatement = new ContinueStatementImpl();
			return theContinueStatement;
		}
		public DoStatement createDoStatement(){
			var theDoStatement = new DoStatementImpl();
			return theDoStatement;
		}
		public EmptyStatement createEmptyStatement(){
			var theEmptyStatement = new EmptyStatementImpl();
			return theEmptyStatement;
		}
		public EnhancedForStatement createEnhancedForStatement(){
			var theEnhancedForStatement = new EnhancedForStatementImpl();
			return theEnhancedForStatement;
		}
		public EnumConstantDeclaration createEnumConstantDeclaration(){
			var theEnumConstantDeclaration = new EnumConstantDeclarationImpl();
			return theEnumConstantDeclaration;
		}
		public EnumDeclaration createEnumDeclaration(){
			var theEnumDeclaration = new EnumDeclarationImpl();
			return theEnumDeclaration;
		}
		public Expression createExpression(){
			var theExpression = new ExpressionImpl();
			return theExpression;
		}
		public ExpressionStatement createExpressionStatement(){
			var theExpressionStatement = new ExpressionStatementImpl();
			return theExpressionStatement;
		}
		public FieldAccess createFieldAccess(){
			var theFieldAccess = new FieldAccessImpl();
			return theFieldAccess;
		}
		public FieldDeclaration createFieldDeclaration(){
			var theFieldDeclaration = new FieldDeclarationImpl();
			return theFieldDeclaration;
		}
		public ForStatement createForStatement(){
			var theForStatement = new ForStatementImpl();
			return theForStatement;
		}
		public IfStatement createIfStatement(){
			var theIfStatement = new IfStatementImpl();
			return theIfStatement;
		}
		public ImportDeclaration createImportDeclaration(){
			var theImportDeclaration = new ImportDeclarationImpl();
			return theImportDeclaration;
		}
		public InfixExpression createInfixExpression(){
			var theInfixExpression = new InfixExpressionImpl();
			return theInfixExpression;
		}
		public Initializer createInitializer(){
			var theInitializer = new InitializerImpl();
			return theInitializer;
		}
		public InstanceofExpression createInstanceofExpression(){
			var theInstanceofExpression = new InstanceofExpressionImpl();
			return theInstanceofExpression;
		}
		public InterfaceDeclaration createInterfaceDeclaration(){
			var theInterfaceDeclaration = new InterfaceDeclarationImpl();
			return theInterfaceDeclaration;
		}
		public Javadoc createJavadoc(){
			var theJavadoc = new JavadocImpl();
			return theJavadoc;
		}
		public LabeledStatement createLabeledStatement(){
			var theLabeledStatement = new LabeledStatementImpl();
			return theLabeledStatement;
		}
		public LineComment createLineComment(){
			var theLineComment = new LineCommentImpl();
			return theLineComment;
		}
		public Manifest createManifest(){
			var theManifest = new ManifestImpl();
			return theManifest;
		}
		public ManifestAttribute createManifestAttribute(){
			var theManifestAttribute = new ManifestAttributeImpl();
			return theManifestAttribute;
		}
		public ManifestEntry createManifestEntry(){
			var theManifestEntry = new ManifestEntryImpl();
			return theManifestEntry;
		}
		public MemberRef createMemberRef(){
			var theMemberRef = new MemberRefImpl();
			return theMemberRef;
		}
		public MethodDeclaration createMethodDeclaration(){
			var theMethodDeclaration = new MethodDeclarationImpl();
			return theMethodDeclaration;
		}
		public MethodInvocation createMethodInvocation(){
			var theMethodInvocation = new MethodInvocationImpl();
			return theMethodInvocation;
		}
		public MethodRef createMethodRef(){
			var theMethodRef = new MethodRefImpl();
			return theMethodRef;
		}
		public MethodRefParameter createMethodRefParameter(){
			var theMethodRefParameter = new MethodRefParameterImpl();
			return theMethodRefParameter;
		}
		public Model createModel(){
			var theModel = new ModelImpl();
			return theModel;
		}
		public Modifier createModifier(){
			var theModifier = new ModifierImpl();
			return theModifier;
		}
		public NamedElement createNamedElement(){
			var theNamedElement = new NamedElementImpl();
			return theNamedElement;
		}
		public NamespaceAccess createNamespaceAccess(){
			var theNamespaceAccess = new NamespaceAccessImpl();
			return theNamespaceAccess;
		}
		public NumberLiteral createNumberLiteral(){
			var theNumberLiteral = new NumberLiteralImpl();
			return theNumberLiteral;
		}
		public NullLiteral createNullLiteral(){
			var theNullLiteral = new NullLiteralImpl();
			return theNullLiteral;
		}
		public Package createPackage(){
			var thePackage = new PackageImpl();
			return thePackage;
		}
		public PackageAccess createPackageAccess(){
			var thePackageAccess = new PackageAccessImpl();
			return thePackageAccess;
		}
		public ParameterizedType createParameterizedType(){
			var theParameterizedType = new ParameterizedTypeImpl();
			return theParameterizedType;
		}
		public ParenthesizedExpression createParenthesizedExpression(){
			var theParenthesizedExpression = new ParenthesizedExpressionImpl();
			return theParenthesizedExpression;
		}
		public PostfixExpression createPostfixExpression(){
			var thePostfixExpression = new PostfixExpressionImpl();
			return thePostfixExpression;
		}
		public PrefixExpression createPrefixExpression(){
			var thePrefixExpression = new PrefixExpressionImpl();
			return thePrefixExpression;
		}
		public PrimitiveType createPrimitiveType(){
			var thePrimitiveType = new PrimitiveTypeImpl();
			return thePrimitiveType;
		}
		public PrimitiveTypeBoolean createPrimitiveTypeBoolean(){
			var thePrimitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
			return thePrimitiveTypeBoolean;
		}
		public PrimitiveTypeByte createPrimitiveTypeByte(){
			var thePrimitiveTypeByte = new PrimitiveTypeByteImpl();
			return thePrimitiveTypeByte;
		}
		public PrimitiveTypeChar createPrimitiveTypeChar(){
			var thePrimitiveTypeChar = new PrimitiveTypeCharImpl();
			return thePrimitiveTypeChar;
		}
		public PrimitiveTypeDouble createPrimitiveTypeDouble(){
			var thePrimitiveTypeDouble = new PrimitiveTypeDoubleImpl();
			return thePrimitiveTypeDouble;
		}
		public PrimitiveTypeShort createPrimitiveTypeShort(){
			var thePrimitiveTypeShort = new PrimitiveTypeShortImpl();
			return thePrimitiveTypeShort;
		}
		public PrimitiveTypeFloat createPrimitiveTypeFloat(){
			var thePrimitiveTypeFloat = new PrimitiveTypeFloatImpl();
			return thePrimitiveTypeFloat;
		}
		public PrimitiveTypeInt createPrimitiveTypeInt(){
			var thePrimitiveTypeInt = new PrimitiveTypeIntImpl();
			return thePrimitiveTypeInt;
		}
		public PrimitiveTypeLong createPrimitiveTypeLong(){
			var thePrimitiveTypeLong = new PrimitiveTypeLongImpl();
			return thePrimitiveTypeLong;
		}
		public PrimitiveTypeVoid createPrimitiveTypeVoid(){
			var thePrimitiveTypeVoid = new PrimitiveTypeVoidImpl();
			return thePrimitiveTypeVoid;
		}
		public ReturnStatement createReturnStatement(){
			var theReturnStatement = new ReturnStatementImpl();
			return theReturnStatement;
		}
		public SingleVariableAccess createSingleVariableAccess(){
			var theSingleVariableAccess = new SingleVariableAccessImpl();
			return theSingleVariableAccess;
		}
		public SingleVariableDeclaration createSingleVariableDeclaration(){
			var theSingleVariableDeclaration = new SingleVariableDeclarationImpl();
			return theSingleVariableDeclaration;
		}
		public Statement createStatement(){
			var theStatement = new StatementImpl();
			return theStatement;
		}
		public StringLiteral createStringLiteral(){
			var theStringLiteral = new StringLiteralImpl();
			return theStringLiteral;
		}
		public SuperConstructorInvocation createSuperConstructorInvocation(){
			var theSuperConstructorInvocation = new SuperConstructorInvocationImpl();
			return theSuperConstructorInvocation;
		}
		public SuperFieldAccess createSuperFieldAccess(){
			var theSuperFieldAccess = new SuperFieldAccessImpl();
			return theSuperFieldAccess;
		}
		public SuperMethodInvocation createSuperMethodInvocation(){
			var theSuperMethodInvocation = new SuperMethodInvocationImpl();
			return theSuperMethodInvocation;
		}
		public SwitchCase createSwitchCase(){
			var theSwitchCase = new SwitchCaseImpl();
			return theSwitchCase;
		}
		public SwitchStatement createSwitchStatement(){
			var theSwitchStatement = new SwitchStatementImpl();
			return theSwitchStatement;
		}
		public SynchronizedStatement createSynchronizedStatement(){
			var theSynchronizedStatement = new SynchronizedStatementImpl();
			return theSynchronizedStatement;
		}
		public TagElement createTagElement(){
			var theTagElement = new TagElementImpl();
			return theTagElement;
		}
		public TextElement createTextElement(){
			var theTextElement = new TextElementImpl();
			return theTextElement;
		}
		public ThisExpression createThisExpression(){
			var theThisExpression = new ThisExpressionImpl();
			return theThisExpression;
		}
		public ThrowStatement createThrowStatement(){
			var theThrowStatement = new ThrowStatementImpl();
			return theThrowStatement;
		}
		public TryStatement createTryStatement(){
			var theTryStatement = new TryStatementImpl();
			return theTryStatement;
		}
		public Type createType(){
			var theType = new TypeImpl();
			return theType;
		}
		public TypeAccess createTypeAccess(){
			var theTypeAccess = new TypeAccessImpl();
			return theTypeAccess;
		}
		public TypeDeclaration createTypeDeclaration(){
			var theTypeDeclaration = new TypeDeclarationImpl();
			return theTypeDeclaration;
		}
		public TypeDeclarationStatement createTypeDeclarationStatement(){
			var theTypeDeclarationStatement = new TypeDeclarationStatementImpl();
			return theTypeDeclarationStatement;
		}
		public TypeLiteral createTypeLiteral(){
			var theTypeLiteral = new TypeLiteralImpl();
			return theTypeLiteral;
		}
		public TypeParameter createTypeParameter(){
			var theTypeParameter = new TypeParameterImpl();
			return theTypeParameter;
		}
		public UnresolvedItem createUnresolvedItem(){
			var theUnresolvedItem = new UnresolvedItemImpl();
			return theUnresolvedItem;
		}
		public UnresolvedItemAccess createUnresolvedItemAccess(){
			var theUnresolvedItemAccess = new UnresolvedItemAccessImpl();
			return theUnresolvedItemAccess;
		}
		public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration(){
			var theUnresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
			return theUnresolvedAnnotationDeclaration;
		}
		public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration(){
			var theUnresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
			return theUnresolvedAnnotationTypeMemberDeclaration;
		}
		public UnresolvedClassDeclaration createUnresolvedClassDeclaration(){
			var theUnresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
			return theUnresolvedClassDeclaration;
		}
		public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration(){
			var theUnresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
			return theUnresolvedEnumDeclaration;
		}
		public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration(){
			var theUnresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
			return theUnresolvedInterfaceDeclaration;
		}
		public UnresolvedLabeledStatement createUnresolvedLabeledStatement(){
			var theUnresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
			return theUnresolvedLabeledStatement;
		}
		public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration(){
			var theUnresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
			return theUnresolvedMethodDeclaration;
		}
		public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration(){
			var theUnresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
			return theUnresolvedSingleVariableDeclaration;
		}
		public UnresolvedType createUnresolvedType(){
			var theUnresolvedType = new UnresolvedTypeImpl();
			return theUnresolvedType;
		}
		public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration(){
			var theUnresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
			return theUnresolvedTypeDeclaration;
		}
		public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment(){
			var theUnresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
			return theUnresolvedVariableDeclarationFragment;
		}
		public VariableDeclaration createVariableDeclaration(){
			var theVariableDeclaration = new VariableDeclarationImpl();
			return theVariableDeclaration;
		}
		public VariableDeclarationExpression createVariableDeclarationExpression(){
			var theVariableDeclarationExpression = new VariableDeclarationExpressionImpl();
			return theVariableDeclarationExpression;
		}
		public VariableDeclarationFragment createVariableDeclarationFragment(){
			var theVariableDeclarationFragment = new VariableDeclarationFragmentImpl();
			return theVariableDeclarationFragment;
		}
		public VariableDeclarationStatement createVariableDeclarationStatement(){
			var theVariableDeclarationStatement = new VariableDeclarationStatementImpl();
			return theVariableDeclarationStatement;
		}
		public WildCardType createWildCardType(){
			var theWildCardType = new WildCardTypeImpl();
			return theWildCardType;
		}
		public WhileStatement createWhileStatement(){
			var theWhileStatement = new WhileStatementImpl();
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
