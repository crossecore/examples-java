/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
	 	using Ecore;
namespace Java_{
	public class Java_Switch<T> : Switch<T> {
	
		protected static Java_Package modelPackage;
		
		protected override bool isSwitchFor(EPackage ePackage)
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
		
		protected override T doSwitch(int classifierID, EObject theEObject) {
			switch (classifierID) {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION: {
					var abstractmethoddeclaration = (AbstractMethodDeclaration) theEObject;
					var result = caseAbstractMethodDeclaration(abstractmethoddeclaration);
					
					if (result == null) result = caseASTNode(abstractmethoddeclaration);
					if (result == null) result = caseNamedElement(abstractmethoddeclaration);
					if (result == null) result = caseBodyDeclaration(abstractmethoddeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION: {
					var abstractmethodinvocation = (AbstractMethodInvocation) theEObject;
					var result = caseAbstractMethodInvocation(abstractmethodinvocation);
					
					if (result == null) result = caseASTNode(abstractmethodinvocation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION: {
					var abstracttypedeclaration = (AbstractTypeDeclaration) theEObject;
					var result = caseAbstractTypeDeclaration(abstracttypedeclaration);
					
					if (result == null) result = caseASTNode(abstracttypedeclaration);
					if (result == null) result = caseNamedElement(abstracttypedeclaration);
					if (result == null) result = caseBodyDeclaration(abstracttypedeclaration);
					if (result == null) result = caseType(abstracttypedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ABSTRACTTYPEQUALIFIEDEXPRESSION: {
					var abstracttypequalifiedexpression = (AbstractTypeQualifiedExpression) theEObject;
					var result = caseAbstractTypeQualifiedExpression(abstracttypequalifiedexpression);
					
					if (result == null) result = caseASTNode(abstracttypequalifiedexpression);
					if (result == null) result = caseExpression(abstracttypequalifiedexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER: {
					var abstractvariablescontainer = (AbstractVariablesContainer) theEObject;
					var result = caseAbstractVariablesContainer(abstractvariablescontainer);
					
					if (result == null) result = caseASTNode(abstractvariablescontainer);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ANNOTATION: {
					var annotation = (Annotation) theEObject;
					var result = caseAnnotation(annotation);
					
					if (result == null) result = caseASTNode(annotation);
					if (result == null) result = caseExpression(annotation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARCHIVE: {
					var archive = (Archive) theEObject;
					var result = caseArchive(archive);
					
					if (result == null) result = caseASTNode(archive);
					if (result == null) result = caseNamedElement(archive);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ASSERTSTATEMENT: {
					var assertstatement = (AssertStatement) theEObject;
					var result = caseAssertStatement(assertstatement);
					
					if (result == null) result = caseASTNode(assertstatement);
					if (result == null) result = caseStatement(assertstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ASTNODE: {
					var astnode = (ASTNode) theEObject;
					var result = caseASTNode(astnode);
					
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR: {
					var annotationmembervaluepair = (AnnotationMemberValuePair) theEObject;
					var result = caseAnnotationMemberValuePair(annotationmembervaluepair);
					
					if (result == null) result = caseASTNode(annotationmembervaluepair);
					if (result == null) result = caseNamedElement(annotationmembervaluepair);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ANNOTATIONTYPEDECLARATION: {
					var annotationtypedeclaration = (AnnotationTypeDeclaration) theEObject;
					var result = caseAnnotationTypeDeclaration(annotationtypedeclaration);
					
					if (result == null) result = caseASTNode(annotationtypedeclaration);
					if (result == null) result = caseNamedElement(annotationtypedeclaration);
					if (result == null) result = caseBodyDeclaration(annotationtypedeclaration);
					if (result == null) result = caseType(annotationtypedeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(annotationtypedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION: {
					var annotationtypememberdeclaration = (AnnotationTypeMemberDeclaration) theEObject;
					var result = caseAnnotationTypeMemberDeclaration(annotationtypememberdeclaration);
					
					if (result == null) result = caseASTNode(annotationtypememberdeclaration);
					if (result == null) result = caseNamedElement(annotationtypememberdeclaration);
					if (result == null) result = caseBodyDeclaration(annotationtypememberdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION: {
					var anonymousclassdeclaration = (AnonymousClassDeclaration) theEObject;
					var result = caseAnonymousClassDeclaration(anonymousclassdeclaration);
					
					if (result == null) result = caseASTNode(anonymousclassdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARRAYACCESS: {
					var arrayaccess = (ArrayAccess) theEObject;
					var result = caseArrayAccess(arrayaccess);
					
					if (result == null) result = caseASTNode(arrayaccess);
					if (result == null) result = caseExpression(arrayaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARRAYCREATION: {
					var arraycreation = (ArrayCreation) theEObject;
					var result = caseArrayCreation(arraycreation);
					
					if (result == null) result = caseASTNode(arraycreation);
					if (result == null) result = caseExpression(arraycreation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARRAYINITIALIZER: {
					var arrayinitializer = (ArrayInitializer) theEObject;
					var result = caseArrayInitializer(arrayinitializer);
					
					if (result == null) result = caseASTNode(arrayinitializer);
					if (result == null) result = caseExpression(arrayinitializer);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARRAYLENGTHACCESS: {
					var arraylengthaccess = (ArrayLengthAccess) theEObject;
					var result = caseArrayLengthAccess(arraylengthaccess);
					
					if (result == null) result = caseASTNode(arraylengthaccess);
					if (result == null) result = caseExpression(arraylengthaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ARRAYTYPE: {
					var arraytype = (ArrayType) theEObject;
					var result = caseArrayType(arraytype);
					
					if (result == null) result = caseASTNode(arraytype);
					if (result == null) result = caseNamedElement(arraytype);
					if (result == null) result = caseType(arraytype);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ASSIGNMENT: {
					var assignment = (Assignment) theEObject;
					var result = caseAssignment(assignment);
					
					if (result == null) result = caseASTNode(assignment);
					if (result == null) result = caseExpression(assignment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.BODYDECLARATION: {
					var bodydeclaration = (BodyDeclaration) theEObject;
					var result = caseBodyDeclaration(bodydeclaration);
					
					if (result == null) result = caseASTNode(bodydeclaration);
					if (result == null) result = caseNamedElement(bodydeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.BOOLEANLITERAL: {
					var booleanliteral = (BooleanLiteral) theEObject;
					var result = caseBooleanLiteral(booleanliteral);
					
					if (result == null) result = caseASTNode(booleanliteral);
					if (result == null) result = caseExpression(booleanliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.BLOCKCOMMENT: {
					var blockcomment = (BlockComment) theEObject;
					var result = caseBlockComment(blockcomment);
					
					if (result == null) result = caseASTNode(blockcomment);
					if (result == null) result = caseComment(blockcomment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.BLOCK: {
					var block = (Block) theEObject;
					var result = caseBlock(block);
					
					if (result == null) result = caseASTNode(block);
					if (result == null) result = caseStatement(block);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.BREAKSTATEMENT: {
					var breakstatement = (BreakStatement) theEObject;
					var result = caseBreakStatement(breakstatement);
					
					if (result == null) result = caseASTNode(breakstatement);
					if (result == null) result = caseStatement(breakstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CASTEXPRESSION: {
					var castexpression = (CastExpression) theEObject;
					var result = caseCastExpression(castexpression);
					
					if (result == null) result = caseASTNode(castexpression);
					if (result == null) result = caseExpression(castexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CATCHCLAUSE: {
					var catchclause = (CatchClause) theEObject;
					var result = caseCatchClause(catchclause);
					
					if (result == null) result = caseASTNode(catchclause);
					if (result == null) result = caseStatement(catchclause);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CHARACTERLITERAL: {
					var characterliteral = (CharacterLiteral) theEObject;
					var result = caseCharacterLiteral(characterliteral);
					
					if (result == null) result = caseASTNode(characterliteral);
					if (result == null) result = caseExpression(characterliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CLASSFILE: {
					var classfile = (ClassFile) theEObject;
					var result = caseClassFile(classfile);
					
					if (result == null) result = caseASTNode(classfile);
					if (result == null) result = caseNamedElement(classfile);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CLASSINSTANCECREATION: {
					var classinstancecreation = (ClassInstanceCreation) theEObject;
					var result = caseClassInstanceCreation(classinstancecreation);
					
					if (result == null) result = caseASTNode(classinstancecreation);
					if (result == null) result = caseExpression(classinstancecreation);
					if (result == null) result = caseAbstractMethodInvocation(classinstancecreation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CONSTRUCTORDECLARATION: {
					var constructordeclaration = (ConstructorDeclaration) theEObject;
					var result = caseConstructorDeclaration(constructordeclaration);
					
					if (result == null) result = caseASTNode(constructordeclaration);
					if (result == null) result = caseNamedElement(constructordeclaration);
					if (result == null) result = caseBodyDeclaration(constructordeclaration);
					if (result == null) result = caseAbstractMethodDeclaration(constructordeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CONDITIONALEXPRESSION: {
					var conditionalexpression = (ConditionalExpression) theEObject;
					var result = caseConditionalExpression(conditionalexpression);
					
					if (result == null) result = caseASTNode(conditionalexpression);
					if (result == null) result = caseExpression(conditionalexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CONSTRUCTORINVOCATION: {
					var constructorinvocation = (ConstructorInvocation) theEObject;
					var result = caseConstructorInvocation(constructorinvocation);
					
					if (result == null) result = caseASTNode(constructorinvocation);
					if (result == null) result = caseStatement(constructorinvocation);
					if (result == null) result = caseAbstractMethodInvocation(constructorinvocation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CLASSDECLARATION: {
					var classdeclaration = (ClassDeclaration) theEObject;
					var result = caseClassDeclaration(classdeclaration);
					
					if (result == null) result = caseASTNode(classdeclaration);
					if (result == null) result = caseNamedElement(classdeclaration);
					if (result == null) result = caseBodyDeclaration(classdeclaration);
					if (result == null) result = caseType(classdeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(classdeclaration);
					if (result == null) result = caseTypeDeclaration(classdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.COMMENT: {
					var comment = (Comment) theEObject;
					var result = caseComment(comment);
					
					if (result == null) result = caseASTNode(comment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.COMPILATIONUNIT: {
					var compilationunit = (CompilationUnit) theEObject;
					var result = caseCompilationUnit(compilationunit);
					
					if (result == null) result = caseASTNode(compilationunit);
					if (result == null) result = caseNamedElement(compilationunit);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.CONTINUESTATEMENT: {
					var continuestatement = (ContinueStatement) theEObject;
					var result = caseContinueStatement(continuestatement);
					
					if (result == null) result = caseASTNode(continuestatement);
					if (result == null) result = caseStatement(continuestatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.DOSTATEMENT: {
					var dostatement = (DoStatement) theEObject;
					var result = caseDoStatement(dostatement);
					
					if (result == null) result = caseASTNode(dostatement);
					if (result == null) result = caseStatement(dostatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.EMPTYSTATEMENT: {
					var emptystatement = (EmptyStatement) theEObject;
					var result = caseEmptyStatement(emptystatement);
					
					if (result == null) result = caseASTNode(emptystatement);
					if (result == null) result = caseStatement(emptystatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ENHANCEDFORSTATEMENT: {
					var enhancedforstatement = (EnhancedForStatement) theEObject;
					var result = caseEnhancedForStatement(enhancedforstatement);
					
					if (result == null) result = caseASTNode(enhancedforstatement);
					if (result == null) result = caseStatement(enhancedforstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ENUMCONSTANTDECLARATION: {
					var enumconstantdeclaration = (EnumConstantDeclaration) theEObject;
					var result = caseEnumConstantDeclaration(enumconstantdeclaration);
					
					if (result == null) result = caseASTNode(enumconstantdeclaration);
					if (result == null) result = caseNamedElement(enumconstantdeclaration);
					if (result == null) result = caseBodyDeclaration(enumconstantdeclaration);
					if (result == null) result = caseVariableDeclaration(enumconstantdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.ENUMDECLARATION: {
					var enumdeclaration = (EnumDeclaration) theEObject;
					var result = caseEnumDeclaration(enumdeclaration);
					
					if (result == null) result = caseASTNode(enumdeclaration);
					if (result == null) result = caseNamedElement(enumdeclaration);
					if (result == null) result = caseBodyDeclaration(enumdeclaration);
					if (result == null) result = caseType(enumdeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(enumdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.EXPRESSION: {
					var expression = (Expression) theEObject;
					var result = caseExpression(expression);
					
					if (result == null) result = caseASTNode(expression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.EXPRESSIONSTATEMENT: {
					var expressionstatement = (ExpressionStatement) theEObject;
					var result = caseExpressionStatement(expressionstatement);
					
					if (result == null) result = caseASTNode(expressionstatement);
					if (result == null) result = caseStatement(expressionstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.FIELDACCESS: {
					var fieldaccess = (FieldAccess) theEObject;
					var result = caseFieldAccess(fieldaccess);
					
					if (result == null) result = caseASTNode(fieldaccess);
					if (result == null) result = caseExpression(fieldaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.FIELDDECLARATION: {
					var fielddeclaration = (FieldDeclaration) theEObject;
					var result = caseFieldDeclaration(fielddeclaration);
					
					if (result == null) result = caseASTNode(fielddeclaration);
					if (result == null) result = caseNamedElement(fielddeclaration);
					if (result == null) result = caseBodyDeclaration(fielddeclaration);
					if (result == null) result = caseAbstractVariablesContainer(fielddeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.FORSTATEMENT: {
					var forstatement = (ForStatement) theEObject;
					var result = caseForStatement(forstatement);
					
					if (result == null) result = caseASTNode(forstatement);
					if (result == null) result = caseStatement(forstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.IFSTATEMENT: {
					var ifstatement = (IfStatement) theEObject;
					var result = caseIfStatement(ifstatement);
					
					if (result == null) result = caseASTNode(ifstatement);
					if (result == null) result = caseStatement(ifstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.IMPORTDECLARATION: {
					var importdeclaration = (ImportDeclaration) theEObject;
					var result = caseImportDeclaration(importdeclaration);
					
					if (result == null) result = caseASTNode(importdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.INFIXEXPRESSION: {
					var infixexpression = (InfixExpression) theEObject;
					var result = caseInfixExpression(infixexpression);
					
					if (result == null) result = caseASTNode(infixexpression);
					if (result == null) result = caseExpression(infixexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.INITIALIZER: {
					var initializer = (Initializer) theEObject;
					var result = caseInitializer(initializer);
					
					if (result == null) result = caseASTNode(initializer);
					if (result == null) result = caseNamedElement(initializer);
					if (result == null) result = caseBodyDeclaration(initializer);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.INSTANCEOFEXPRESSION: {
					var instanceofexpression = (InstanceofExpression) theEObject;
					var result = caseInstanceofExpression(instanceofexpression);
					
					if (result == null) result = caseASTNode(instanceofexpression);
					if (result == null) result = caseExpression(instanceofexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.INTERFACEDECLARATION: {
					var interfacedeclaration = (InterfaceDeclaration) theEObject;
					var result = caseInterfaceDeclaration(interfacedeclaration);
					
					if (result == null) result = caseASTNode(interfacedeclaration);
					if (result == null) result = caseNamedElement(interfacedeclaration);
					if (result == null) result = caseBodyDeclaration(interfacedeclaration);
					if (result == null) result = caseType(interfacedeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(interfacedeclaration);
					if (result == null) result = caseTypeDeclaration(interfacedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.JAVADOC: {
					var javadoc = (Javadoc) theEObject;
					var result = caseJavadoc(javadoc);
					
					if (result == null) result = caseASTNode(javadoc);
					if (result == null) result = caseComment(javadoc);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.LABELEDSTATEMENT: {
					var labeledstatement = (LabeledStatement) theEObject;
					var result = caseLabeledStatement(labeledstatement);
					
					if (result == null) result = caseASTNode(labeledstatement);
					if (result == null) result = caseNamedElement(labeledstatement);
					if (result == null) result = caseStatement(labeledstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.LINECOMMENT: {
					var linecomment = (LineComment) theEObject;
					var result = caseLineComment(linecomment);
					
					if (result == null) result = caseASTNode(linecomment);
					if (result == null) result = caseComment(linecomment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MANIFEST: {
					var manifest = (Manifest) theEObject;
					var result = caseManifest(manifest);
					
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MANIFESTATTRIBUTE: {
					var manifestattribute = (ManifestAttribute) theEObject;
					var result = caseManifestAttribute(manifestattribute);
					
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MANIFESTENTRY: {
					var manifestentry = (ManifestEntry) theEObject;
					var result = caseManifestEntry(manifestentry);
					
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MEMBERREF: {
					var memberref = (MemberRef) theEObject;
					var result = caseMemberRef(memberref);
					
					if (result == null) result = caseASTNode(memberref);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.METHODDECLARATION: {
					var methoddeclaration = (MethodDeclaration) theEObject;
					var result = caseMethodDeclaration(methoddeclaration);
					
					if (result == null) result = caseASTNode(methoddeclaration);
					if (result == null) result = caseNamedElement(methoddeclaration);
					if (result == null) result = caseBodyDeclaration(methoddeclaration);
					if (result == null) result = caseAbstractMethodDeclaration(methoddeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.METHODINVOCATION: {
					var methodinvocation = (MethodInvocation) theEObject;
					var result = caseMethodInvocation(methodinvocation);
					
					if (result == null) result = caseASTNode(methodinvocation);
					if (result == null) result = caseExpression(methodinvocation);
					if (result == null) result = caseAbstractMethodInvocation(methodinvocation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.METHODREF: {
					var methodref = (MethodRef) theEObject;
					var result = caseMethodRef(methodref);
					
					if (result == null) result = caseASTNode(methodref);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.METHODREFPARAMETER: {
					var methodrefparameter = (MethodRefParameter) theEObject;
					var result = caseMethodRefParameter(methodrefparameter);
					
					if (result == null) result = caseASTNode(methodrefparameter);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MODEL: {
					var model = (Model) theEObject;
					var result = caseModel(model);
					
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.MODIFIER: {
					var modifier = (Modifier) theEObject;
					var result = caseModifier(modifier);
					
					if (result == null) result = caseASTNode(modifier);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.NAMEDELEMENT: {
					var namedelement = (NamedElement) theEObject;
					var result = caseNamedElement(namedelement);
					
					if (result == null) result = caseASTNode(namedelement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.NAMESPACEACCESS: {
					var namespaceaccess = (NamespaceAccess) theEObject;
					var result = caseNamespaceAccess(namespaceaccess);
					
					if (result == null) result = caseASTNode(namespaceaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.NUMBERLITERAL: {
					var numberliteral = (NumberLiteral) theEObject;
					var result = caseNumberLiteral(numberliteral);
					
					if (result == null) result = caseASTNode(numberliteral);
					if (result == null) result = caseExpression(numberliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.NULLLITERAL: {
					var nullliteral = (NullLiteral) theEObject;
					var result = caseNullLiteral(nullliteral);
					
					if (result == null) result = caseASTNode(nullliteral);
					if (result == null) result = caseExpression(nullliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PACKAGE: {
					var package = (Package) theEObject;
					var result = casePackage(package);
					
					if (result == null) result = caseASTNode(package);
					if (result == null) result = caseNamedElement(package);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PACKAGEACCESS: {
					var packageaccess = (PackageAccess) theEObject;
					var result = casePackageAccess(packageaccess);
					
					if (result == null) result = caseASTNode(packageaccess);
					if (result == null) result = caseNamespaceAccess(packageaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PARAMETERIZEDTYPE: {
					var parameterizedtype = (ParameterizedType) theEObject;
					var result = caseParameterizedType(parameterizedtype);
					
					if (result == null) result = caseASTNode(parameterizedtype);
					if (result == null) result = caseNamedElement(parameterizedtype);
					if (result == null) result = caseType(parameterizedtype);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PARENTHESIZEDEXPRESSION: {
					var parenthesizedexpression = (ParenthesizedExpression) theEObject;
					var result = caseParenthesizedExpression(parenthesizedexpression);
					
					if (result == null) result = caseASTNode(parenthesizedexpression);
					if (result == null) result = caseExpression(parenthesizedexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.POSTFIXEXPRESSION: {
					var postfixexpression = (PostfixExpression) theEObject;
					var result = casePostfixExpression(postfixexpression);
					
					if (result == null) result = caseASTNode(postfixexpression);
					if (result == null) result = caseExpression(postfixexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PREFIXEXPRESSION: {
					var prefixexpression = (PrefixExpression) theEObject;
					var result = casePrefixExpression(prefixexpression);
					
					if (result == null) result = caseASTNode(prefixexpression);
					if (result == null) result = caseExpression(prefixexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPE: {
					var primitivetype = (PrimitiveType) theEObject;
					var result = casePrimitiveType(primitivetype);
					
					if (result == null) result = caseASTNode(primitivetype);
					if (result == null) result = caseNamedElement(primitivetype);
					if (result == null) result = caseType(primitivetype);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEBOOLEAN: {
					var primitivetypeboolean = (PrimitiveTypeBoolean) theEObject;
					var result = casePrimitiveTypeBoolean(primitivetypeboolean);
					
					if (result == null) result = caseASTNode(primitivetypeboolean);
					if (result == null) result = caseNamedElement(primitivetypeboolean);
					if (result == null) result = caseType(primitivetypeboolean);
					if (result == null) result = casePrimitiveType(primitivetypeboolean);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEBYTE: {
					var primitivetypebyte = (PrimitiveTypeByte) theEObject;
					var result = casePrimitiveTypeByte(primitivetypebyte);
					
					if (result == null) result = caseASTNode(primitivetypebyte);
					if (result == null) result = caseNamedElement(primitivetypebyte);
					if (result == null) result = caseType(primitivetypebyte);
					if (result == null) result = casePrimitiveType(primitivetypebyte);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPECHAR: {
					var primitivetypechar = (PrimitiveTypeChar) theEObject;
					var result = casePrimitiveTypeChar(primitivetypechar);
					
					if (result == null) result = caseASTNode(primitivetypechar);
					if (result == null) result = caseNamedElement(primitivetypechar);
					if (result == null) result = caseType(primitivetypechar);
					if (result == null) result = casePrimitiveType(primitivetypechar);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEDOUBLE: {
					var primitivetypedouble = (PrimitiveTypeDouble) theEObject;
					var result = casePrimitiveTypeDouble(primitivetypedouble);
					
					if (result == null) result = caseASTNode(primitivetypedouble);
					if (result == null) result = caseNamedElement(primitivetypedouble);
					if (result == null) result = caseType(primitivetypedouble);
					if (result == null) result = casePrimitiveType(primitivetypedouble);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPESHORT: {
					var primitivetypeshort = (PrimitiveTypeShort) theEObject;
					var result = casePrimitiveTypeShort(primitivetypeshort);
					
					if (result == null) result = caseASTNode(primitivetypeshort);
					if (result == null) result = caseNamedElement(primitivetypeshort);
					if (result == null) result = caseType(primitivetypeshort);
					if (result == null) result = casePrimitiveType(primitivetypeshort);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEFLOAT: {
					var primitivetypefloat = (PrimitiveTypeFloat) theEObject;
					var result = casePrimitiveTypeFloat(primitivetypefloat);
					
					if (result == null) result = caseASTNode(primitivetypefloat);
					if (result == null) result = caseNamedElement(primitivetypefloat);
					if (result == null) result = caseType(primitivetypefloat);
					if (result == null) result = casePrimitiveType(primitivetypefloat);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEINT: {
					var primitivetypeint = (PrimitiveTypeInt) theEObject;
					var result = casePrimitiveTypeInt(primitivetypeint);
					
					if (result == null) result = caseASTNode(primitivetypeint);
					if (result == null) result = caseNamedElement(primitivetypeint);
					if (result == null) result = caseType(primitivetypeint);
					if (result == null) result = casePrimitiveType(primitivetypeint);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPELONG: {
					var primitivetypelong = (PrimitiveTypeLong) theEObject;
					var result = casePrimitiveTypeLong(primitivetypelong);
					
					if (result == null) result = caseASTNode(primitivetypelong);
					if (result == null) result = caseNamedElement(primitivetypelong);
					if (result == null) result = caseType(primitivetypelong);
					if (result == null) result = casePrimitiveType(primitivetypelong);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.PRIMITIVETYPEVOID: {
					var primitivetypevoid = (PrimitiveTypeVoid) theEObject;
					var result = casePrimitiveTypeVoid(primitivetypevoid);
					
					if (result == null) result = caseASTNode(primitivetypevoid);
					if (result == null) result = caseNamedElement(primitivetypevoid);
					if (result == null) result = caseType(primitivetypevoid);
					if (result == null) result = casePrimitiveType(primitivetypevoid);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.RETURNSTATEMENT: {
					var returnstatement = (ReturnStatement) theEObject;
					var result = caseReturnStatement(returnstatement);
					
					if (result == null) result = caseASTNode(returnstatement);
					if (result == null) result = caseStatement(returnstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SINGLEVARIABLEACCESS: {
					var singlevariableaccess = (SingleVariableAccess) theEObject;
					var result = caseSingleVariableAccess(singlevariableaccess);
					
					if (result == null) result = caseASTNode(singlevariableaccess);
					if (result == null) result = caseExpression(singlevariableaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION: {
					var singlevariabledeclaration = (SingleVariableDeclaration) theEObject;
					var result = caseSingleVariableDeclaration(singlevariabledeclaration);
					
					if (result == null) result = caseASTNode(singlevariabledeclaration);
					if (result == null) result = caseNamedElement(singlevariabledeclaration);
					if (result == null) result = caseVariableDeclaration(singlevariabledeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.STATEMENT: {
					var statement = (Statement) theEObject;
					var result = caseStatement(statement);
					
					if (result == null) result = caseASTNode(statement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.STRINGLITERAL: {
					var stringliteral = (StringLiteral) theEObject;
					var result = caseStringLiteral(stringliteral);
					
					if (result == null) result = caseASTNode(stringliteral);
					if (result == null) result = caseExpression(stringliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION: {
					var superconstructorinvocation = (SuperConstructorInvocation) theEObject;
					var result = caseSuperConstructorInvocation(superconstructorinvocation);
					
					if (result == null) result = caseASTNode(superconstructorinvocation);
					if (result == null) result = caseStatement(superconstructorinvocation);
					if (result == null) result = caseAbstractMethodInvocation(superconstructorinvocation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SUPERFIELDACCESS: {
					var superfieldaccess = (SuperFieldAccess) theEObject;
					var result = caseSuperFieldAccess(superfieldaccess);
					
					if (result == null) result = caseASTNode(superfieldaccess);
					if (result == null) result = caseExpression(superfieldaccess);
					if (result == null) result = caseAbstractTypeQualifiedExpression(superfieldaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SUPERMETHODINVOCATION: {
					var supermethodinvocation = (SuperMethodInvocation) theEObject;
					var result = caseSuperMethodInvocation(supermethodinvocation);
					
					if (result == null) result = caseASTNode(supermethodinvocation);
					if (result == null) result = caseExpression(supermethodinvocation);
					if (result == null) result = caseAbstractTypeQualifiedExpression(supermethodinvocation);
					if (result == null) result = caseAbstractMethodInvocation(supermethodinvocation);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SWITCHCASE: {
					var switchcase = (SwitchCase) theEObject;
					var result = caseSwitchCase(switchcase);
					
					if (result == null) result = caseASTNode(switchcase);
					if (result == null) result = caseStatement(switchcase);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SWITCHSTATEMENT: {
					var switchstatement = (SwitchStatement) theEObject;
					var result = caseSwitchStatement(switchstatement);
					
					if (result == null) result = caseASTNode(switchstatement);
					if (result == null) result = caseStatement(switchstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.SYNCHRONIZEDSTATEMENT: {
					var synchronizedstatement = (SynchronizedStatement) theEObject;
					var result = caseSynchronizedStatement(synchronizedstatement);
					
					if (result == null) result = caseASTNode(synchronizedstatement);
					if (result == null) result = caseStatement(synchronizedstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TAGELEMENT: {
					var tagelement = (TagElement) theEObject;
					var result = caseTagElement(tagelement);
					
					if (result == null) result = caseASTNode(tagelement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TEXTELEMENT: {
					var textelement = (TextElement) theEObject;
					var result = caseTextElement(textelement);
					
					if (result == null) result = caseASTNode(textelement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.THISEXPRESSION: {
					var thisexpression = (ThisExpression) theEObject;
					var result = caseThisExpression(thisexpression);
					
					if (result == null) result = caseASTNode(thisexpression);
					if (result == null) result = caseExpression(thisexpression);
					if (result == null) result = caseAbstractTypeQualifiedExpression(thisexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.THROWSTATEMENT: {
					var throwstatement = (ThrowStatement) theEObject;
					var result = caseThrowStatement(throwstatement);
					
					if (result == null) result = caseASTNode(throwstatement);
					if (result == null) result = caseStatement(throwstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TRYSTATEMENT: {
					var trystatement = (TryStatement) theEObject;
					var result = caseTryStatement(trystatement);
					
					if (result == null) result = caseASTNode(trystatement);
					if (result == null) result = caseStatement(trystatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPE: {
					var type = (Type) theEObject;
					var result = caseType(type);
					
					if (result == null) result = caseASTNode(type);
					if (result == null) result = caseNamedElement(type);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPEACCESS: {
					var typeaccess = (TypeAccess) theEObject;
					var result = caseTypeAccess(typeaccess);
					
					if (result == null) result = caseASTNode(typeaccess);
					if (result == null) result = caseExpression(typeaccess);
					if (result == null) result = caseNamespaceAccess(typeaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPEDECLARATION: {
					var typedeclaration = (TypeDeclaration) theEObject;
					var result = caseTypeDeclaration(typedeclaration);
					
					if (result == null) result = caseASTNode(typedeclaration);
					if (result == null) result = caseNamedElement(typedeclaration);
					if (result == null) result = caseBodyDeclaration(typedeclaration);
					if (result == null) result = caseType(typedeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(typedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPEDECLARATIONSTATEMENT: {
					var typedeclarationstatement = (TypeDeclarationStatement) theEObject;
					var result = caseTypeDeclarationStatement(typedeclarationstatement);
					
					if (result == null) result = caseASTNode(typedeclarationstatement);
					if (result == null) result = caseStatement(typedeclarationstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPELITERAL: {
					var typeliteral = (TypeLiteral) theEObject;
					var result = caseTypeLiteral(typeliteral);
					
					if (result == null) result = caseASTNode(typeliteral);
					if (result == null) result = caseExpression(typeliteral);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.TYPEPARAMETER: {
					var typeparameter = (TypeParameter) theEObject;
					var result = caseTypeParameter(typeparameter);
					
					if (result == null) result = caseASTNode(typeparameter);
					if (result == null) result = caseNamedElement(typeparameter);
					if (result == null) result = caseType(typeparameter);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDITEM: {
					var unresolveditem = (UnresolvedItem) theEObject;
					var result = caseUnresolvedItem(unresolveditem);
					
					if (result == null) result = caseASTNode(unresolveditem);
					if (result == null) result = caseNamedElement(unresolveditem);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDITEMACCESS: {
					var unresolveditemaccess = (UnresolvedItemAccess) theEObject;
					var result = caseUnresolvedItemAccess(unresolveditemaccess);
					
					if (result == null) result = caseASTNode(unresolveditemaccess);
					if (result == null) result = caseExpression(unresolveditemaccess);
					if (result == null) result = caseNamespaceAccess(unresolveditemaccess);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDANNOTATIONDECLARATION: {
					var unresolvedannotationdeclaration = (UnresolvedAnnotationDeclaration) theEObject;
					var result = caseUnresolvedAnnotationDeclaration(unresolvedannotationdeclaration);
					
					if (result == null) result = caseASTNode(unresolvedannotationdeclaration);
					if (result == null) result = caseNamedElement(unresolvedannotationdeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedannotationdeclaration);
					if (result == null) result = caseType(unresolvedannotationdeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(unresolvedannotationdeclaration);
					if (result == null) result = caseAnnotationTypeDeclaration(unresolvedannotationdeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedannotationdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION: {
					var unresolvedannotationtypememberdeclaration = (UnresolvedAnnotationTypeMemberDeclaration) theEObject;
					var result = caseUnresolvedAnnotationTypeMemberDeclaration(unresolvedannotationtypememberdeclaration);
					
					if (result == null) result = caseASTNode(unresolvedannotationtypememberdeclaration);
					if (result == null) result = caseNamedElement(unresolvedannotationtypememberdeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedannotationtypememberdeclaration);
					if (result == null) result = caseAnnotationTypeMemberDeclaration(unresolvedannotationtypememberdeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedannotationtypememberdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDCLASSDECLARATION: {
					var unresolvedclassdeclaration = (UnresolvedClassDeclaration) theEObject;
					var result = caseUnresolvedClassDeclaration(unresolvedclassdeclaration);
					
					if (result == null) result = caseASTNode(unresolvedclassdeclaration);
					if (result == null) result = caseNamedElement(unresolvedclassdeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedclassdeclaration);
					if (result == null) result = caseType(unresolvedclassdeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(unresolvedclassdeclaration);
					if (result == null) result = caseTypeDeclaration(unresolvedclassdeclaration);
					if (result == null) result = caseClassDeclaration(unresolvedclassdeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedclassdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION: {
					var unresolvedenumdeclaration = (UnresolvedEnumDeclaration) theEObject;
					var result = caseUnresolvedEnumDeclaration(unresolvedenumdeclaration);
					
					if (result == null) result = caseASTNode(unresolvedenumdeclaration);
					if (result == null) result = caseNamedElement(unresolvedenumdeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedenumdeclaration);
					if (result == null) result = caseType(unresolvedenumdeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(unresolvedenumdeclaration);
					if (result == null) result = caseEnumDeclaration(unresolvedenumdeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedenumdeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDINTERFACEDECLARATION: {
					var unresolvedinterfacedeclaration = (UnresolvedInterfaceDeclaration) theEObject;
					var result = caseUnresolvedInterfaceDeclaration(unresolvedinterfacedeclaration);
					
					if (result == null) result = caseASTNode(unresolvedinterfacedeclaration);
					if (result == null) result = caseNamedElement(unresolvedinterfacedeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedinterfacedeclaration);
					if (result == null) result = caseType(unresolvedinterfacedeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(unresolvedinterfacedeclaration);
					if (result == null) result = caseTypeDeclaration(unresolvedinterfacedeclaration);
					if (result == null) result = caseInterfaceDeclaration(unresolvedinterfacedeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedinterfacedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT: {
					var unresolvedlabeledstatement = (UnresolvedLabeledStatement) theEObject;
					var result = caseUnresolvedLabeledStatement(unresolvedlabeledstatement);
					
					if (result == null) result = caseASTNode(unresolvedlabeledstatement);
					if (result == null) result = caseNamedElement(unresolvedlabeledstatement);
					if (result == null) result = caseStatement(unresolvedlabeledstatement);
					if (result == null) result = caseLabeledStatement(unresolvedlabeledstatement);
					if (result == null) result = caseUnresolvedItem(unresolvedlabeledstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION: {
					var unresolvedmethoddeclaration = (UnresolvedMethodDeclaration) theEObject;
					var result = caseUnresolvedMethodDeclaration(unresolvedmethoddeclaration);
					
					if (result == null) result = caseASTNode(unresolvedmethoddeclaration);
					if (result == null) result = caseNamedElement(unresolvedmethoddeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedmethoddeclaration);
					if (result == null) result = caseAbstractMethodDeclaration(unresolvedmethoddeclaration);
					if (result == null) result = caseMethodDeclaration(unresolvedmethoddeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedmethoddeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION: {
					var unresolvedsinglevariabledeclaration = (UnresolvedSingleVariableDeclaration) theEObject;
					var result = caseUnresolvedSingleVariableDeclaration(unresolvedsinglevariabledeclaration);
					
					if (result == null) result = caseASTNode(unresolvedsinglevariabledeclaration);
					if (result == null) result = caseNamedElement(unresolvedsinglevariabledeclaration);
					if (result == null) result = caseVariableDeclaration(unresolvedsinglevariabledeclaration);
					if (result == null) result = caseSingleVariableDeclaration(unresolvedsinglevariabledeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedsinglevariabledeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDTYPE: {
					var unresolvedtype = (UnresolvedType) theEObject;
					var result = caseUnresolvedType(unresolvedtype);
					
					if (result == null) result = caseASTNode(unresolvedtype);
					if (result == null) result = caseNamedElement(unresolvedtype);
					if (result == null) result = caseType(unresolvedtype);
					if (result == null) result = caseUnresolvedItem(unresolvedtype);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDTYPEDECLARATION: {
					var unresolvedtypedeclaration = (UnresolvedTypeDeclaration) theEObject;
					var result = caseUnresolvedTypeDeclaration(unresolvedtypedeclaration);
					
					if (result == null) result = caseASTNode(unresolvedtypedeclaration);
					if (result == null) result = caseNamedElement(unresolvedtypedeclaration);
					if (result == null) result = caseBodyDeclaration(unresolvedtypedeclaration);
					if (result == null) result = caseType(unresolvedtypedeclaration);
					if (result == null) result = caseAbstractTypeDeclaration(unresolvedtypedeclaration);
					if (result == null) result = caseUnresolvedItem(unresolvedtypedeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT: {
					var unresolvedvariabledeclarationfragment = (UnresolvedVariableDeclarationFragment) theEObject;
					var result = caseUnresolvedVariableDeclarationFragment(unresolvedvariabledeclarationfragment);
					
					if (result == null) result = caseASTNode(unresolvedvariabledeclarationfragment);
					if (result == null) result = caseNamedElement(unresolvedvariabledeclarationfragment);
					if (result == null) result = caseVariableDeclaration(unresolvedvariabledeclarationfragment);
					if (result == null) result = caseVariableDeclarationFragment(unresolvedvariabledeclarationfragment);
					if (result == null) result = caseUnresolvedItem(unresolvedvariabledeclarationfragment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.VARIABLEDECLARATION: {
					var variabledeclaration = (VariableDeclaration) theEObject;
					var result = caseVariableDeclaration(variabledeclaration);
					
					if (result == null) result = caseASTNode(variabledeclaration);
					if (result == null) result = caseNamedElement(variabledeclaration);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION: {
					var variabledeclarationexpression = (VariableDeclarationExpression) theEObject;
					var result = caseVariableDeclarationExpression(variabledeclarationexpression);
					
					if (result == null) result = caseASTNode(variabledeclarationexpression);
					if (result == null) result = caseExpression(variabledeclarationexpression);
					if (result == null) result = caseAbstractVariablesContainer(variabledeclarationexpression);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT: {
					var variabledeclarationfragment = (VariableDeclarationFragment) theEObject;
					var result = caseVariableDeclarationFragment(variabledeclarationfragment);
					
					if (result == null) result = caseASTNode(variabledeclarationfragment);
					if (result == null) result = caseNamedElement(variabledeclarationfragment);
					if (result == null) result = caseVariableDeclaration(variabledeclarationfragment);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT: {
					var variabledeclarationstatement = (VariableDeclarationStatement) theEObject;
					var result = caseVariableDeclarationStatement(variabledeclarationstatement);
					
					if (result == null) result = caseASTNode(variabledeclarationstatement);
					if (result == null) result = caseStatement(variabledeclarationstatement);
					if (result == null) result = caseAbstractVariablesContainer(variabledeclarationstatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.WILDCARDTYPE: {
					var wildcardtype = (WildCardType) theEObject;
					var result = caseWildCardType(wildcardtype);
					
					if (result == null) result = caseASTNode(wildcardtype);
					if (result == null) result = caseNamedElement(wildcardtype);
					if (result == null) result = caseType(wildcardtype);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				case Java_PackageImpl.WHILESTATEMENT: {
					var whilestatement = (WhileStatement) theEObject;
					var result = caseWhileStatement(whilestatement);
					
					if (result == null) result = caseASTNode(whilestatement);
					if (result == null) result = caseStatement(whilestatement);
					
					if (result == null) result = defaultCase(theEObject);
					return result;
				}
				default: return defaultCase(theEObject);
			}
		}
		
		
		public virtual T caseAbstractMethodDeclaration(AbstractMethodDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseAbstractMethodInvocation(AbstractMethodInvocation theEObject) {
			return default(T);
		}
		public virtual T caseAbstractTypeDeclaration(AbstractTypeDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression theEObject) {
			return default(T);
		}
		public virtual T caseAbstractVariablesContainer(AbstractVariablesContainer theEObject) {
			return default(T);
		}
		public virtual T caseAnnotation(Annotation theEObject) {
			return default(T);
		}
		public virtual T caseArchive(Archive theEObject) {
			return default(T);
		}
		public virtual T caseAssertStatement(AssertStatement theEObject) {
			return default(T);
		}
		public virtual T caseASTNode(ASTNode theEObject) {
			return default(T);
		}
		public virtual T caseAnnotationMemberValuePair(AnnotationMemberValuePair theEObject) {
			return default(T);
		}
		public virtual T caseAnnotationTypeDeclaration(AnnotationTypeDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseAnonymousClassDeclaration(AnonymousClassDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseArrayAccess(ArrayAccess theEObject) {
			return default(T);
		}
		public virtual T caseArrayCreation(ArrayCreation theEObject) {
			return default(T);
		}
		public virtual T caseArrayInitializer(ArrayInitializer theEObject) {
			return default(T);
		}
		public virtual T caseArrayLengthAccess(ArrayLengthAccess theEObject) {
			return default(T);
		}
		public virtual T caseArrayType(ArrayType theEObject) {
			return default(T);
		}
		public virtual T caseAssignment(Assignment theEObject) {
			return default(T);
		}
		public virtual T caseBodyDeclaration(BodyDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseBooleanLiteral(BooleanLiteral theEObject) {
			return default(T);
		}
		public virtual T caseBlockComment(BlockComment theEObject) {
			return default(T);
		}
		public virtual T caseBlock(Block theEObject) {
			return default(T);
		}
		public virtual T caseBreakStatement(BreakStatement theEObject) {
			return default(T);
		}
		public virtual T caseCastExpression(CastExpression theEObject) {
			return default(T);
		}
		public virtual T caseCatchClause(CatchClause theEObject) {
			return default(T);
		}
		public virtual T caseCharacterLiteral(CharacterLiteral theEObject) {
			return default(T);
		}
		public virtual T caseClassFile(ClassFile theEObject) {
			return default(T);
		}
		public virtual T caseClassInstanceCreation(ClassInstanceCreation theEObject) {
			return default(T);
		}
		public virtual T caseConstructorDeclaration(ConstructorDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseConditionalExpression(ConditionalExpression theEObject) {
			return default(T);
		}
		public virtual T caseConstructorInvocation(ConstructorInvocation theEObject) {
			return default(T);
		}
		public virtual T caseClassDeclaration(ClassDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseComment(Comment theEObject) {
			return default(T);
		}
		public virtual T caseCompilationUnit(CompilationUnit theEObject) {
			return default(T);
		}
		public virtual T caseContinueStatement(ContinueStatement theEObject) {
			return default(T);
		}
		public virtual T caseDoStatement(DoStatement theEObject) {
			return default(T);
		}
		public virtual T caseEmptyStatement(EmptyStatement theEObject) {
			return default(T);
		}
		public virtual T caseEnhancedForStatement(EnhancedForStatement theEObject) {
			return default(T);
		}
		public virtual T caseEnumConstantDeclaration(EnumConstantDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseEnumDeclaration(EnumDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseExpression(Expression theEObject) {
			return default(T);
		}
		public virtual T caseExpressionStatement(ExpressionStatement theEObject) {
			return default(T);
		}
		public virtual T caseFieldAccess(FieldAccess theEObject) {
			return default(T);
		}
		public virtual T caseFieldDeclaration(FieldDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseForStatement(ForStatement theEObject) {
			return default(T);
		}
		public virtual T caseIfStatement(IfStatement theEObject) {
			return default(T);
		}
		public virtual T caseImportDeclaration(ImportDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseInfixExpression(InfixExpression theEObject) {
			return default(T);
		}
		public virtual T caseInitializer(Initializer theEObject) {
			return default(T);
		}
		public virtual T caseInstanceofExpression(InstanceofExpression theEObject) {
			return default(T);
		}
		public virtual T caseInterfaceDeclaration(InterfaceDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseJavadoc(Javadoc theEObject) {
			return default(T);
		}
		public virtual T caseLabeledStatement(LabeledStatement theEObject) {
			return default(T);
		}
		public virtual T caseLineComment(LineComment theEObject) {
			return default(T);
		}
		public virtual T caseManifest(Manifest theEObject) {
			return default(T);
		}
		public virtual T caseManifestAttribute(ManifestAttribute theEObject) {
			return default(T);
		}
		public virtual T caseManifestEntry(ManifestEntry theEObject) {
			return default(T);
		}
		public virtual T caseMemberRef(MemberRef theEObject) {
			return default(T);
		}
		public virtual T caseMethodDeclaration(MethodDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseMethodInvocation(MethodInvocation theEObject) {
			return default(T);
		}
		public virtual T caseMethodRef(MethodRef theEObject) {
			return default(T);
		}
		public virtual T caseMethodRefParameter(MethodRefParameter theEObject) {
			return default(T);
		}
		public virtual T caseModel(Model theEObject) {
			return default(T);
		}
		public virtual T caseModifier(Modifier theEObject) {
			return default(T);
		}
		public virtual T caseNamedElement(NamedElement theEObject) {
			return default(T);
		}
		public virtual T caseNamespaceAccess(NamespaceAccess theEObject) {
			return default(T);
		}
		public virtual T caseNumberLiteral(NumberLiteral theEObject) {
			return default(T);
		}
		public virtual T caseNullLiteral(NullLiteral theEObject) {
			return default(T);
		}
		public virtual T casePackage(Package theEObject) {
			return default(T);
		}
		public virtual T casePackageAccess(PackageAccess theEObject) {
			return default(T);
		}
		public virtual T caseParameterizedType(ParameterizedType theEObject) {
			return default(T);
		}
		public virtual T caseParenthesizedExpression(ParenthesizedExpression theEObject) {
			return default(T);
		}
		public virtual T casePostfixExpression(PostfixExpression theEObject) {
			return default(T);
		}
		public virtual T casePrefixExpression(PrefixExpression theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveType(PrimitiveType theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeBoolean(PrimitiveTypeBoolean theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeByte(PrimitiveTypeByte theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeChar(PrimitiveTypeChar theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeDouble(PrimitiveTypeDouble theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeShort(PrimitiveTypeShort theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeFloat(PrimitiveTypeFloat theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeInt(PrimitiveTypeInt theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeLong(PrimitiveTypeLong theEObject) {
			return default(T);
		}
		public virtual T casePrimitiveTypeVoid(PrimitiveTypeVoid theEObject) {
			return default(T);
		}
		public virtual T caseReturnStatement(ReturnStatement theEObject) {
			return default(T);
		}
		public virtual T caseSingleVariableAccess(SingleVariableAccess theEObject) {
			return default(T);
		}
		public virtual T caseSingleVariableDeclaration(SingleVariableDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseStatement(Statement theEObject) {
			return default(T);
		}
		public virtual T caseStringLiteral(StringLiteral theEObject) {
			return default(T);
		}
		public virtual T caseSuperConstructorInvocation(SuperConstructorInvocation theEObject) {
			return default(T);
		}
		public virtual T caseSuperFieldAccess(SuperFieldAccess theEObject) {
			return default(T);
		}
		public virtual T caseSuperMethodInvocation(SuperMethodInvocation theEObject) {
			return default(T);
		}
		public virtual T caseSwitchCase(SwitchCase theEObject) {
			return default(T);
		}
		public virtual T caseSwitchStatement(SwitchStatement theEObject) {
			return default(T);
		}
		public virtual T caseSynchronizedStatement(SynchronizedStatement theEObject) {
			return default(T);
		}
		public virtual T caseTagElement(TagElement theEObject) {
			return default(T);
		}
		public virtual T caseTextElement(TextElement theEObject) {
			return default(T);
		}
		public virtual T caseThisExpression(ThisExpression theEObject) {
			return default(T);
		}
		public virtual T caseThrowStatement(ThrowStatement theEObject) {
			return default(T);
		}
		public virtual T caseTryStatement(TryStatement theEObject) {
			return default(T);
		}
		public virtual T caseType(Type theEObject) {
			return default(T);
		}
		public virtual T caseTypeAccess(TypeAccess theEObject) {
			return default(T);
		}
		public virtual T caseTypeDeclaration(TypeDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseTypeDeclarationStatement(TypeDeclarationStatement theEObject) {
			return default(T);
		}
		public virtual T caseTypeLiteral(TypeLiteral theEObject) {
			return default(T);
		}
		public virtual T caseTypeParameter(TypeParameter theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedItem(UnresolvedItem theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedItemAccess(UnresolvedItemAccess theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedClassDeclaration(UnresolvedClassDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedLabeledStatement(UnresolvedLabeledStatement theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedType(UnresolvedType theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment theEObject) {
			return default(T);
		}
		public virtual T caseVariableDeclaration(VariableDeclaration theEObject) {
			return default(T);
		}
		public virtual T caseVariableDeclarationExpression(VariableDeclarationExpression theEObject) {
			return default(T);
		}
		public virtual T caseVariableDeclarationFragment(VariableDeclarationFragment theEObject) {
			return default(T);
		}
		public virtual T caseVariableDeclarationStatement(VariableDeclarationStatement theEObject) {
			return default(T);
		}
		public virtual T caseWildCardType(WildCardType theEObject) {
			return default(T);
		}
		public virtual T caseWhileStatement(WhileStatement theEObject) {
			return default(T);
		}
		
	}
}
