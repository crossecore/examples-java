package java_;

import org.eclipse.emf.ecore.*;

public class Java_Switch<T> extends org.eclipse.emf.ecore.util.Switch<T> {

	protected static Java_Package modelPackage;
	
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}
	
	public Java_Switch()
	{
		if (modelPackage == null)
		{
			modelPackage = Java_PackageImpl.eINSTANCE;
		}
	}
	
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION: {
				AbstractMethodDeclaration obj = (AbstractMethodDeclaration) theEObject;
				T result = caseAbstractMethodDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ABSTRACTMETHODINVOCATION: {
				AbstractMethodInvocation obj = (AbstractMethodInvocation) theEObject;
				T result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION: {
				AbstractTypeDeclaration obj = (AbstractTypeDeclaration) theEObject;
				T result = caseAbstractTypeDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ABSTRACTTYPEQUALIFIEDEXPRESSION: {
				AbstractTypeQualifiedExpression obj = (AbstractTypeQualifiedExpression) theEObject;
				T result = caseAbstractTypeQualifiedExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER: {
				AbstractVariablesContainer obj = (AbstractVariablesContainer) theEObject;
				T result = caseAbstractVariablesContainer(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ANNOTATION: {
				Annotation obj = (Annotation) theEObject;
				T result = caseAnnotation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARCHIVE: {
				Archive obj = (Archive) theEObject;
				T result = caseArchive(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ASSERTSTATEMENT: {
				AssertStatement obj = (AssertStatement) theEObject;
				T result = caseAssertStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ASTNODE: {
				ASTNode obj = (ASTNode) theEObject;
				T result = caseASTNode(obj);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR: {
				AnnotationMemberValuePair obj = (AnnotationMemberValuePair) theEObject;
				T result = caseAnnotationMemberValuePair(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ANNOTATIONTYPEDECLARATION: {
				AnnotationTypeDeclaration obj = (AnnotationTypeDeclaration) theEObject;
				T result = caseAnnotationTypeDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION: {
				AnnotationTypeMemberDeclaration obj = (AnnotationTypeMemberDeclaration) theEObject;
				T result = caseAnnotationTypeMemberDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ANONYMOUSCLASSDECLARATION: {
				AnonymousClassDeclaration obj = (AnonymousClassDeclaration) theEObject;
				T result = caseAnonymousClassDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARRAYACCESS: {
				ArrayAccess obj = (ArrayAccess) theEObject;
				T result = caseArrayAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARRAYCREATION: {
				ArrayCreation obj = (ArrayCreation) theEObject;
				T result = caseArrayCreation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARRAYINITIALIZER: {
				ArrayInitializer obj = (ArrayInitializer) theEObject;
				T result = caseArrayInitializer(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARRAYLENGTHACCESS: {
				ArrayLengthAccess obj = (ArrayLengthAccess) theEObject;
				T result = caseArrayLengthAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ARRAYTYPE: {
				ArrayType obj = (ArrayType) theEObject;
				T result = caseArrayType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ASSIGNMENT: {
				Assignment obj = (Assignment) theEObject;
				T result = caseAssignment(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.BODYDECLARATION: {
				BodyDeclaration obj = (BodyDeclaration) theEObject;
				T result = caseBodyDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.BOOLEANLITERAL: {
				BooleanLiteral obj = (BooleanLiteral) theEObject;
				T result = caseBooleanLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.BLOCKCOMMENT: {
				BlockComment obj = (BlockComment) theEObject;
				T result = caseBlockComment(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseComment(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.BLOCK: {
				Block obj = (Block) theEObject;
				T result = caseBlock(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.BREAKSTATEMENT: {
				BreakStatement obj = (BreakStatement) theEObject;
				T result = caseBreakStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CASTEXPRESSION: {
				CastExpression obj = (CastExpression) theEObject;
				T result = caseCastExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CATCHCLAUSE: {
				CatchClause obj = (CatchClause) theEObject;
				T result = caseCatchClause(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CHARACTERLITERAL: {
				CharacterLiteral obj = (CharacterLiteral) theEObject;
				T result = caseCharacterLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CLASSFILE: {
				ClassFile obj = (ClassFile) theEObject;
				T result = caseClassFile(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CLASSINSTANCECREATION: {
				ClassInstanceCreation obj = (ClassInstanceCreation) theEObject;
				T result = caseClassInstanceCreation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CONSTRUCTORDECLARATION: {
				ConstructorDeclaration obj = (ConstructorDeclaration) theEObject;
				T result = caseConstructorDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseAbstractMethodDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CONDITIONALEXPRESSION: {
				ConditionalExpression obj = (ConditionalExpression) theEObject;
				T result = caseConditionalExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CONSTRUCTORINVOCATION: {
				ConstructorInvocation obj = (ConstructorInvocation) theEObject;
				T result = caseConstructorInvocation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				if (result == null) result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CLASSDECLARATION: {
				ClassDeclaration obj = (ClassDeclaration) theEObject;
				T result = caseClassDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseTypeDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.COMMENT: {
				Comment obj = (Comment) theEObject;
				T result = caseComment(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.COMPILATIONUNIT: {
				CompilationUnit obj = (CompilationUnit) theEObject;
				T result = caseCompilationUnit(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.CONTINUESTATEMENT: {
				ContinueStatement obj = (ContinueStatement) theEObject;
				T result = caseContinueStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.DOSTATEMENT: {
				DoStatement obj = (DoStatement) theEObject;
				T result = caseDoStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.EMPTYSTATEMENT: {
				EmptyStatement obj = (EmptyStatement) theEObject;
				T result = caseEmptyStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ENHANCEDFORSTATEMENT: {
				EnhancedForStatement obj = (EnhancedForStatement) theEObject;
				T result = caseEnhancedForStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ENUMCONSTANTDECLARATION: {
				EnumConstantDeclaration obj = (EnumConstantDeclaration) theEObject;
				T result = caseEnumConstantDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseVariableDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.ENUMDECLARATION: {
				EnumDeclaration obj = (EnumDeclaration) theEObject;
				T result = caseEnumDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.EXPRESSION: {
				Expression obj = (Expression) theEObject;
				T result = caseExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.EXPRESSIONSTATEMENT: {
				ExpressionStatement obj = (ExpressionStatement) theEObject;
				T result = caseExpressionStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.FIELDACCESS: {
				FieldAccess obj = (FieldAccess) theEObject;
				T result = caseFieldAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.FIELDDECLARATION: {
				FieldDeclaration obj = (FieldDeclaration) theEObject;
				T result = caseFieldDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseAbstractVariablesContainer(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.FORSTATEMENT: {
				ForStatement obj = (ForStatement) theEObject;
				T result = caseForStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.IFSTATEMENT: {
				IfStatement obj = (IfStatement) theEObject;
				T result = caseIfStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.IMPORTDECLARATION: {
				ImportDeclaration obj = (ImportDeclaration) theEObject;
				T result = caseImportDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.INFIXEXPRESSION: {
				InfixExpression obj = (InfixExpression) theEObject;
				T result = caseInfixExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.INITIALIZER: {
				Initializer obj = (Initializer) theEObject;
				T result = caseInitializer(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.INSTANCEOFEXPRESSION: {
				InstanceofExpression obj = (InstanceofExpression) theEObject;
				T result = caseInstanceofExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.INTERFACEDECLARATION: {
				InterfaceDeclaration obj = (InterfaceDeclaration) theEObject;
				T result = caseInterfaceDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseTypeDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.JAVADOC: {
				Javadoc obj = (Javadoc) theEObject;
				T result = caseJavadoc(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseComment(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.LABELEDSTATEMENT: {
				LabeledStatement obj = (LabeledStatement) theEObject;
				T result = caseLabeledStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.LINECOMMENT: {
				LineComment obj = (LineComment) theEObject;
				T result = caseLineComment(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseComment(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MANIFEST: {
				Manifest obj = (Manifest) theEObject;
				T result = caseManifest(obj);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MANIFESTATTRIBUTE: {
				ManifestAttribute obj = (ManifestAttribute) theEObject;
				T result = caseManifestAttribute(obj);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MANIFESTENTRY: {
				ManifestEntry obj = (ManifestEntry) theEObject;
				T result = caseManifestEntry(obj);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MEMBERREF: {
				MemberRef obj = (MemberRef) theEObject;
				T result = caseMemberRef(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.METHODDECLARATION: {
				MethodDeclaration obj = (MethodDeclaration) theEObject;
				T result = caseMethodDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseAbstractMethodDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.METHODINVOCATION: {
				MethodInvocation obj = (MethodInvocation) theEObject;
				T result = caseMethodInvocation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.METHODREF: {
				MethodRef obj = (MethodRef) theEObject;
				T result = caseMethodRef(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.METHODREFPARAMETER: {
				MethodRefParameter obj = (MethodRefParameter) theEObject;
				T result = caseMethodRefParameter(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MODEL: {
				Model obj = (Model) theEObject;
				T result = caseModel(obj);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.MODIFIER: {
				Modifier obj = (Modifier) theEObject;
				T result = caseModifier(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.NAMEDELEMENT: {
				NamedElement obj = (NamedElement) theEObject;
				T result = caseNamedElement(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.NAMESPACEACCESS: {
				NamespaceAccess obj = (NamespaceAccess) theEObject;
				T result = caseNamespaceAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.NUMBERLITERAL: {
				NumberLiteral obj = (NumberLiteral) theEObject;
				T result = caseNumberLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.NULLLITERAL: {
				NullLiteral obj = (NullLiteral) theEObject;
				T result = caseNullLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PACKAGE: {
				Package obj = (Package) theEObject;
				T result = casePackage(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PACKAGEACCESS: {
				PackageAccess obj = (PackageAccess) theEObject;
				T result = casePackageAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamespaceAccess(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PARAMETERIZEDTYPE: {
				ParameterizedType obj = (ParameterizedType) theEObject;
				T result = caseParameterizedType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PARENTHESIZEDEXPRESSION: {
				ParenthesizedExpression obj = (ParenthesizedExpression) theEObject;
				T result = caseParenthesizedExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.POSTFIXEXPRESSION: {
				PostfixExpression obj = (PostfixExpression) theEObject;
				T result = casePostfixExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PREFIXEXPRESSION: {
				PrefixExpression obj = (PrefixExpression) theEObject;
				T result = casePrefixExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPE: {
				PrimitiveType obj = (PrimitiveType) theEObject;
				T result = casePrimitiveType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEBOOLEAN: {
				PrimitiveTypeBoolean obj = (PrimitiveTypeBoolean) theEObject;
				T result = casePrimitiveTypeBoolean(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEBYTE: {
				PrimitiveTypeByte obj = (PrimitiveTypeByte) theEObject;
				T result = casePrimitiveTypeByte(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPECHAR: {
				PrimitiveTypeChar obj = (PrimitiveTypeChar) theEObject;
				T result = casePrimitiveTypeChar(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEDOUBLE: {
				PrimitiveTypeDouble obj = (PrimitiveTypeDouble) theEObject;
				T result = casePrimitiveTypeDouble(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPESHORT: {
				PrimitiveTypeShort obj = (PrimitiveTypeShort) theEObject;
				T result = casePrimitiveTypeShort(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEFLOAT: {
				PrimitiveTypeFloat obj = (PrimitiveTypeFloat) theEObject;
				T result = casePrimitiveTypeFloat(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEINT: {
				PrimitiveTypeInt obj = (PrimitiveTypeInt) theEObject;
				T result = casePrimitiveTypeInt(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPELONG: {
				PrimitiveTypeLong obj = (PrimitiveTypeLong) theEObject;
				T result = casePrimitiveTypeLong(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.PRIMITIVETYPEVOID: {
				PrimitiveTypeVoid obj = (PrimitiveTypeVoid) theEObject;
				T result = casePrimitiveTypeVoid(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = casePrimitiveType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.RETURNSTATEMENT: {
				ReturnStatement obj = (ReturnStatement) theEObject;
				T result = caseReturnStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SINGLEVARIABLEACCESS: {
				SingleVariableAccess obj = (SingleVariableAccess) theEObject;
				T result = caseSingleVariableAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SINGLEVARIABLEDECLARATION: {
				SingleVariableDeclaration obj = (SingleVariableDeclaration) theEObject;
				T result = caseSingleVariableDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseVariableDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.STATEMENT: {
				Statement obj = (Statement) theEObject;
				T result = caseStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.STRINGLITERAL: {
				StringLiteral obj = (StringLiteral) theEObject;
				T result = caseStringLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION: {
				SuperConstructorInvocation obj = (SuperConstructorInvocation) theEObject;
				T result = caseSuperConstructorInvocation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				if (result == null) result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SUPERFIELDACCESS: {
				SuperFieldAccess obj = (SuperFieldAccess) theEObject;
				T result = caseSuperFieldAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractTypeQualifiedExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SUPERMETHODINVOCATION: {
				SuperMethodInvocation obj = (SuperMethodInvocation) theEObject;
				T result = caseSuperMethodInvocation(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractTypeQualifiedExpression(obj);
				if (result == null) result = caseAbstractMethodInvocation(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SWITCHCASE: {
				SwitchCase obj = (SwitchCase) theEObject;
				T result = caseSwitchCase(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SWITCHSTATEMENT: {
				SwitchStatement obj = (SwitchStatement) theEObject;
				T result = caseSwitchStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.SYNCHRONIZEDSTATEMENT: {
				SynchronizedStatement obj = (SynchronizedStatement) theEObject;
				T result = caseSynchronizedStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TAGELEMENT: {
				TagElement obj = (TagElement) theEObject;
				T result = caseTagElement(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TEXTELEMENT: {
				TextElement obj = (TextElement) theEObject;
				T result = caseTextElement(obj);
				
				if (result == null) result = caseASTNode(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.THISEXPRESSION: {
				ThisExpression obj = (ThisExpression) theEObject;
				T result = caseThisExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractTypeQualifiedExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.THROWSTATEMENT: {
				ThrowStatement obj = (ThrowStatement) theEObject;
				T result = caseThrowStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TRYSTATEMENT: {
				TryStatement obj = (TryStatement) theEObject;
				T result = caseTryStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPE: {
				Type obj = (Type) theEObject;
				T result = caseType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPEACCESS: {
				TypeAccess obj = (TypeAccess) theEObject;
				T result = caseTypeAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseNamespaceAccess(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPEDECLARATION: {
				TypeDeclaration obj = (TypeDeclaration) theEObject;
				T result = caseTypeDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPEDECLARATIONSTATEMENT: {
				TypeDeclarationStatement obj = (TypeDeclarationStatement) theEObject;
				T result = caseTypeDeclarationStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPELITERAL: {
				TypeLiteral obj = (TypeLiteral) theEObject;
				T result = caseTypeLiteral(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.TYPEPARAMETER: {
				TypeParameter obj = (TypeParameter) theEObject;
				T result = caseTypeParameter(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDITEM: {
				UnresolvedItem obj = (UnresolvedItem) theEObject;
				T result = caseUnresolvedItem(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDITEMACCESS: {
				UnresolvedItemAccess obj = (UnresolvedItemAccess) theEObject;
				T result = caseUnresolvedItemAccess(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseNamespaceAccess(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDANNOTATIONDECLARATION: {
				UnresolvedAnnotationDeclaration obj = (UnresolvedAnnotationDeclaration) theEObject;
				T result = caseUnresolvedAnnotationDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseAnnotationTypeDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION: {
				UnresolvedAnnotationTypeMemberDeclaration obj = (UnresolvedAnnotationTypeMemberDeclaration) theEObject;
				T result = caseUnresolvedAnnotationTypeMemberDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseAnnotationTypeMemberDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDCLASSDECLARATION: {
				UnresolvedClassDeclaration obj = (UnresolvedClassDeclaration) theEObject;
				T result = caseUnresolvedClassDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseTypeDeclaration(obj);
				if (result == null) result = caseClassDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDENUMDECLARATION: {
				UnresolvedEnumDeclaration obj = (UnresolvedEnumDeclaration) theEObject;
				T result = caseUnresolvedEnumDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseEnumDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDINTERFACEDECLARATION: {
				UnresolvedInterfaceDeclaration obj = (UnresolvedInterfaceDeclaration) theEObject;
				T result = caseUnresolvedInterfaceDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseTypeDeclaration(obj);
				if (result == null) result = caseInterfaceDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT: {
				UnresolvedLabeledStatement obj = (UnresolvedLabeledStatement) theEObject;
				T result = caseUnresolvedLabeledStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseStatement(obj);
				if (result == null) result = caseLabeledStatement(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION: {
				UnresolvedMethodDeclaration obj = (UnresolvedMethodDeclaration) theEObject;
				T result = caseUnresolvedMethodDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseAbstractMethodDeclaration(obj);
				if (result == null) result = caseMethodDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION: {
				UnresolvedSingleVariableDeclaration obj = (UnresolvedSingleVariableDeclaration) theEObject;
				T result = caseUnresolvedSingleVariableDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseVariableDeclaration(obj);
				if (result == null) result = caseSingleVariableDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDTYPE: {
				UnresolvedType obj = (UnresolvedType) theEObject;
				T result = caseUnresolvedType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDTYPEDECLARATION: {
				UnresolvedTypeDeclaration obj = (UnresolvedTypeDeclaration) theEObject;
				T result = caseUnresolvedTypeDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseBodyDeclaration(obj);
				if (result == null) result = caseType(obj);
				if (result == null) result = caseAbstractTypeDeclaration(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT: {
				UnresolvedVariableDeclarationFragment obj = (UnresolvedVariableDeclarationFragment) theEObject;
				T result = caseUnresolvedVariableDeclarationFragment(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseVariableDeclaration(obj);
				if (result == null) result = caseVariableDeclarationFragment(obj);
				if (result == null) result = caseUnresolvedItem(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.VARIABLEDECLARATION: {
				VariableDeclaration obj = (VariableDeclaration) theEObject;
				T result = caseVariableDeclaration(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION: {
				VariableDeclarationExpression obj = (VariableDeclarationExpression) theEObject;
				T result = caseVariableDeclarationExpression(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseExpression(obj);
				if (result == null) result = caseAbstractVariablesContainer(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT: {
				VariableDeclarationFragment obj = (VariableDeclarationFragment) theEObject;
				T result = caseVariableDeclarationFragment(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseVariableDeclaration(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT: {
				VariableDeclarationStatement obj = (VariableDeclarationStatement) theEObject;
				T result = caseVariableDeclarationStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				if (result == null) result = caseAbstractVariablesContainer(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.WILDCARDTYPE: {
				WildCardType obj = (WildCardType) theEObject;
				T result = caseWildCardType(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseNamedElement(obj);
				if (result == null) result = caseType(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_PackageImpl.WHILESTATEMENT: {
				WhileStatement obj = (WhileStatement) theEObject;
				T result = caseWhileStatement(obj);
				
				if (result == null) result = caseASTNode(obj);
				if (result == null) result = caseStatement(obj);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}
	
	
	public T caseAbstractMethodDeclaration(AbstractMethodDeclaration theEObject) {
		return null;
	}
	public T caseAbstractMethodInvocation(AbstractMethodInvocation theEObject) {
		return null;
	}
	public T caseAbstractTypeDeclaration(AbstractTypeDeclaration theEObject) {
		return null;
	}
	public T caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression theEObject) {
		return null;
	}
	public T caseAbstractVariablesContainer(AbstractVariablesContainer theEObject) {
		return null;
	}
	public T caseAnnotation(Annotation theEObject) {
		return null;
	}
	public T caseArchive(Archive theEObject) {
		return null;
	}
	public T caseAssertStatement(AssertStatement theEObject) {
		return null;
	}
	public T caseASTNode(ASTNode theEObject) {
		return null;
	}
	public T caseAnnotationMemberValuePair(AnnotationMemberValuePair theEObject) {
		return null;
	}
	public T caseAnnotationTypeDeclaration(AnnotationTypeDeclaration theEObject) {
		return null;
	}
	public T caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration theEObject) {
		return null;
	}
	public T caseAnonymousClassDeclaration(AnonymousClassDeclaration theEObject) {
		return null;
	}
	public T caseArrayAccess(ArrayAccess theEObject) {
		return null;
	}
	public T caseArrayCreation(ArrayCreation theEObject) {
		return null;
	}
	public T caseArrayInitializer(ArrayInitializer theEObject) {
		return null;
	}
	public T caseArrayLengthAccess(ArrayLengthAccess theEObject) {
		return null;
	}
	public T caseArrayType(ArrayType theEObject) {
		return null;
	}
	public T caseAssignment(Assignment theEObject) {
		return null;
	}
	public T caseBodyDeclaration(BodyDeclaration theEObject) {
		return null;
	}
	public T caseBooleanLiteral(BooleanLiteral theEObject) {
		return null;
	}
	public T caseBlockComment(BlockComment theEObject) {
		return null;
	}
	public T caseBlock(Block theEObject) {
		return null;
	}
	public T caseBreakStatement(BreakStatement theEObject) {
		return null;
	}
	public T caseCastExpression(CastExpression theEObject) {
		return null;
	}
	public T caseCatchClause(CatchClause theEObject) {
		return null;
	}
	public T caseCharacterLiteral(CharacterLiteral theEObject) {
		return null;
	}
	public T caseClassFile(ClassFile theEObject) {
		return null;
	}
	public T caseClassInstanceCreation(ClassInstanceCreation theEObject) {
		return null;
	}
	public T caseConstructorDeclaration(ConstructorDeclaration theEObject) {
		return null;
	}
	public T caseConditionalExpression(ConditionalExpression theEObject) {
		return null;
	}
	public T caseConstructorInvocation(ConstructorInvocation theEObject) {
		return null;
	}
	public T caseClassDeclaration(ClassDeclaration theEObject) {
		return null;
	}
	public T caseComment(Comment theEObject) {
		return null;
	}
	public T caseCompilationUnit(CompilationUnit theEObject) {
		return null;
	}
	public T caseContinueStatement(ContinueStatement theEObject) {
		return null;
	}
	public T caseDoStatement(DoStatement theEObject) {
		return null;
	}
	public T caseEmptyStatement(EmptyStatement theEObject) {
		return null;
	}
	public T caseEnhancedForStatement(EnhancedForStatement theEObject) {
		return null;
	}
	public T caseEnumConstantDeclaration(EnumConstantDeclaration theEObject) {
		return null;
	}
	public T caseEnumDeclaration(EnumDeclaration theEObject) {
		return null;
	}
	public T caseExpression(Expression theEObject) {
		return null;
	}
	public T caseExpressionStatement(ExpressionStatement theEObject) {
		return null;
	}
	public T caseFieldAccess(FieldAccess theEObject) {
		return null;
	}
	public T caseFieldDeclaration(FieldDeclaration theEObject) {
		return null;
	}
	public T caseForStatement(ForStatement theEObject) {
		return null;
	}
	public T caseIfStatement(IfStatement theEObject) {
		return null;
	}
	public T caseImportDeclaration(ImportDeclaration theEObject) {
		return null;
	}
	public T caseInfixExpression(InfixExpression theEObject) {
		return null;
	}
	public T caseInitializer(Initializer theEObject) {
		return null;
	}
	public T caseInstanceofExpression(InstanceofExpression theEObject) {
		return null;
	}
	public T caseInterfaceDeclaration(InterfaceDeclaration theEObject) {
		return null;
	}
	public T caseJavadoc(Javadoc theEObject) {
		return null;
	}
	public T caseLabeledStatement(LabeledStatement theEObject) {
		return null;
	}
	public T caseLineComment(LineComment theEObject) {
		return null;
	}
	public T caseManifest(Manifest theEObject) {
		return null;
	}
	public T caseManifestAttribute(ManifestAttribute theEObject) {
		return null;
	}
	public T caseManifestEntry(ManifestEntry theEObject) {
		return null;
	}
	public T caseMemberRef(MemberRef theEObject) {
		return null;
	}
	public T caseMethodDeclaration(MethodDeclaration theEObject) {
		return null;
	}
	public T caseMethodInvocation(MethodInvocation theEObject) {
		return null;
	}
	public T caseMethodRef(MethodRef theEObject) {
		return null;
	}
	public T caseMethodRefParameter(MethodRefParameter theEObject) {
		return null;
	}
	public T caseModel(Model theEObject) {
		return null;
	}
	public T caseModifier(Modifier theEObject) {
		return null;
	}
	public T caseNamedElement(NamedElement theEObject) {
		return null;
	}
	public T caseNamespaceAccess(NamespaceAccess theEObject) {
		return null;
	}
	public T caseNumberLiteral(NumberLiteral theEObject) {
		return null;
	}
	public T caseNullLiteral(NullLiteral theEObject) {
		return null;
	}
	public T casePackage(Package theEObject) {
		return null;
	}
	public T casePackageAccess(PackageAccess theEObject) {
		return null;
	}
	public T caseParameterizedType(ParameterizedType theEObject) {
		return null;
	}
	public T caseParenthesizedExpression(ParenthesizedExpression theEObject) {
		return null;
	}
	public T casePostfixExpression(PostfixExpression theEObject) {
		return null;
	}
	public T casePrefixExpression(PrefixExpression theEObject) {
		return null;
	}
	public T casePrimitiveType(PrimitiveType theEObject) {
		return null;
	}
	public T casePrimitiveTypeBoolean(PrimitiveTypeBoolean theEObject) {
		return null;
	}
	public T casePrimitiveTypeByte(PrimitiveTypeByte theEObject) {
		return null;
	}
	public T casePrimitiveTypeChar(PrimitiveTypeChar theEObject) {
		return null;
	}
	public T casePrimitiveTypeDouble(PrimitiveTypeDouble theEObject) {
		return null;
	}
	public T casePrimitiveTypeShort(PrimitiveTypeShort theEObject) {
		return null;
	}
	public T casePrimitiveTypeFloat(PrimitiveTypeFloat theEObject) {
		return null;
	}
	public T casePrimitiveTypeInt(PrimitiveTypeInt theEObject) {
		return null;
	}
	public T casePrimitiveTypeLong(PrimitiveTypeLong theEObject) {
		return null;
	}
	public T casePrimitiveTypeVoid(PrimitiveTypeVoid theEObject) {
		return null;
	}
	public T caseReturnStatement(ReturnStatement theEObject) {
		return null;
	}
	public T caseSingleVariableAccess(SingleVariableAccess theEObject) {
		return null;
	}
	public T caseSingleVariableDeclaration(SingleVariableDeclaration theEObject) {
		return null;
	}
	public T caseStatement(Statement theEObject) {
		return null;
	}
	public T caseStringLiteral(StringLiteral theEObject) {
		return null;
	}
	public T caseSuperConstructorInvocation(SuperConstructorInvocation theEObject) {
		return null;
	}
	public T caseSuperFieldAccess(SuperFieldAccess theEObject) {
		return null;
	}
	public T caseSuperMethodInvocation(SuperMethodInvocation theEObject) {
		return null;
	}
	public T caseSwitchCase(SwitchCase theEObject) {
		return null;
	}
	public T caseSwitchStatement(SwitchStatement theEObject) {
		return null;
	}
	public T caseSynchronizedStatement(SynchronizedStatement theEObject) {
		return null;
	}
	public T caseTagElement(TagElement theEObject) {
		return null;
	}
	public T caseTextElement(TextElement theEObject) {
		return null;
	}
	public T caseThisExpression(ThisExpression theEObject) {
		return null;
	}
	public T caseThrowStatement(ThrowStatement theEObject) {
		return null;
	}
	public T caseTryStatement(TryStatement theEObject) {
		return null;
	}
	public T caseType(Type theEObject) {
		return null;
	}
	public T caseTypeAccess(TypeAccess theEObject) {
		return null;
	}
	public T caseTypeDeclaration(TypeDeclaration theEObject) {
		return null;
	}
	public T caseTypeDeclarationStatement(TypeDeclarationStatement theEObject) {
		return null;
	}
	public T caseTypeLiteral(TypeLiteral theEObject) {
		return null;
	}
	public T caseTypeParameter(TypeParameter theEObject) {
		return null;
	}
	public T caseUnresolvedItem(UnresolvedItem theEObject) {
		return null;
	}
	public T caseUnresolvedItemAccess(UnresolvedItemAccess theEObject) {
		return null;
	}
	public T caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedClassDeclaration(UnresolvedClassDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedLabeledStatement(UnresolvedLabeledStatement theEObject) {
		return null;
	}
	public T caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedType(UnresolvedType theEObject) {
		return null;
	}
	public T caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration theEObject) {
		return null;
	}
	public T caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment theEObject) {
		return null;
	}
	public T caseVariableDeclaration(VariableDeclaration theEObject) {
		return null;
	}
	public T caseVariableDeclarationExpression(VariableDeclarationExpression theEObject) {
		return null;
	}
	public T caseVariableDeclarationFragment(VariableDeclarationFragment theEObject) {
		return null;
	}
	public T caseVariableDeclarationStatement(VariableDeclarationStatement theEObject) {
		return null;
	}
	public T caseWildCardType(WildCardType theEObject) {
		return null;
	}
	public T caseWhileStatement(WhileStatement theEObject) {
		return null;
	}
	
}

