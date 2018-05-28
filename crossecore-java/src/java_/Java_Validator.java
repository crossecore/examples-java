	package java_;
	import org.eclipse.emf.ecore.util.EObjectValidator;
	import org.eclipse.emf.common.util.DiagnosticChain;
	import org.eclipse.emf.ecore.EClass;
	import java.util.Map;
	
	public class Java_Validator extends EObjectValidator {

		public static final Java_Validator INSTANCE = new Java_Validator();

		public static final String DIAGNOSTIC_SOURCE = "java_";
		
		

        protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
        {
            switch (classifierID)
            {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION:
					return validateAbstractMethodDeclaration((AbstractMethodDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION:
					return validateAbstractMethodInvocation((AbstractMethodInvocation)value, diagnostics, context);	
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION:
					return validateAbstractTypeDeclaration((AbstractTypeDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ABSTRACTTYPEQUALIFIEDEXPRESSION:
					return validateAbstractTypeQualifiedExpression((AbstractTypeQualifiedExpression)value, diagnostics, context);	
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER:
					return validateAbstractVariablesContainer((AbstractVariablesContainer)value, diagnostics, context);	
				case Java_PackageImpl.ANNOTATION:
					return validateAnnotation((Annotation)value, diagnostics, context);	
				case Java_PackageImpl.ARCHIVE:
					return validateArchive((Archive)value, diagnostics, context);	
				case Java_PackageImpl.ASSERTSTATEMENT:
					return validateAssertStatement((AssertStatement)value, diagnostics, context);	
				case Java_PackageImpl.ASTNODE:
					return validateASTNode((ASTNode)value, diagnostics, context);	
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR:
					return validateAnnotationMemberValuePair((AnnotationMemberValuePair)value, diagnostics, context);	
				case Java_PackageImpl.ANNOTATIONTYPEDECLARATION:
					return validateAnnotationTypeDeclaration((AnnotationTypeDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION:
					return validateAnnotationTypeMemberDeclaration((AnnotationTypeMemberDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION:
					return validateAnonymousClassDeclaration((AnonymousClassDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ARRAYACCESS:
					return validateArrayAccess((ArrayAccess)value, diagnostics, context);	
				case Java_PackageImpl.ARRAYCREATION:
					return validateArrayCreation((ArrayCreation)value, diagnostics, context);	
				case Java_PackageImpl.ARRAYINITIALIZER:
					return validateArrayInitializer((ArrayInitializer)value, diagnostics, context);	
				case Java_PackageImpl.ARRAYLENGTHACCESS:
					return validateArrayLengthAccess((ArrayLengthAccess)value, diagnostics, context);	
				case Java_PackageImpl.ARRAYTYPE:
					return validateArrayType((ArrayType)value, diagnostics, context);	
				case Java_PackageImpl.ASSIGNMENT:
					return validateAssignment((Assignment)value, diagnostics, context);	
				case Java_PackageImpl.BODYDECLARATION:
					return validateBodyDeclaration((BodyDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.BOOLEANLITERAL:
					return validateBooleanLiteral((BooleanLiteral)value, diagnostics, context);	
				case Java_PackageImpl.BLOCKCOMMENT:
					return validateBlockComment((BlockComment)value, diagnostics, context);	
				case Java_PackageImpl.BLOCK:
					return validateBlock((Block)value, diagnostics, context);	
				case Java_PackageImpl.BREAKSTATEMENT:
					return validateBreakStatement((BreakStatement)value, diagnostics, context);	
				case Java_PackageImpl.CASTEXPRESSION:
					return validateCastExpression((CastExpression)value, diagnostics, context);	
				case Java_PackageImpl.CATCHCLAUSE:
					return validateCatchClause((CatchClause)value, diagnostics, context);	
				case Java_PackageImpl.CHARACTERLITERAL:
					return validateCharacterLiteral((CharacterLiteral)value, diagnostics, context);	
				case Java_PackageImpl.CLASSFILE:
					return validateClassFile((ClassFile)value, diagnostics, context);	
				case Java_PackageImpl.CLASSINSTANCECREATION:
					return validateClassInstanceCreation((ClassInstanceCreation)value, diagnostics, context);	
				case Java_PackageImpl.CONSTRUCTORDECLARATION:
					return validateConstructorDeclaration((ConstructorDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.CONDITIONALEXPRESSION:
					return validateConditionalExpression((ConditionalExpression)value, diagnostics, context);	
				case Java_PackageImpl.CONSTRUCTORINVOCATION:
					return validateConstructorInvocation((ConstructorInvocation)value, diagnostics, context);	
				case Java_PackageImpl.CLASSDECLARATION:
					return validateClassDeclaration((ClassDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.COMMENT:
					return validateComment((Comment)value, diagnostics, context);	
				case Java_PackageImpl.COMPILATIONUNIT:
					return validateCompilationUnit((CompilationUnit)value, diagnostics, context);	
				case Java_PackageImpl.CONTINUESTATEMENT:
					return validateContinueStatement((ContinueStatement)value, diagnostics, context);	
				case Java_PackageImpl.DOSTATEMENT:
					return validateDoStatement((DoStatement)value, diagnostics, context);	
				case Java_PackageImpl.EMPTYSTATEMENT:
					return validateEmptyStatement((EmptyStatement)value, diagnostics, context);	
				case Java_PackageImpl.ENHANCEDFORSTATEMENT:
					return validateEnhancedForStatement((EnhancedForStatement)value, diagnostics, context);	
				case Java_PackageImpl.ENUMCONSTANTDECLARATION:
					return validateEnumConstantDeclaration((EnumConstantDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.ENUMDECLARATION:
					return validateEnumDeclaration((EnumDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.EXPRESSION:
					return validateExpression((Expression)value, diagnostics, context);	
				case Java_PackageImpl.EXPRESSIONSTATEMENT:
					return validateExpressionStatement((ExpressionStatement)value, diagnostics, context);	
				case Java_PackageImpl.FIELDACCESS:
					return validateFieldAccess((FieldAccess)value, diagnostics, context);	
				case Java_PackageImpl.FIELDDECLARATION:
					return validateFieldDeclaration((FieldDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.FORSTATEMENT:
					return validateForStatement((ForStatement)value, diagnostics, context);	
				case Java_PackageImpl.IFSTATEMENT:
					return validateIfStatement((IfStatement)value, diagnostics, context);	
				case Java_PackageImpl.IMPORTDECLARATION:
					return validateImportDeclaration((ImportDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.INFIXEXPRESSION:
					return validateInfixExpression((InfixExpression)value, diagnostics, context);	
				case Java_PackageImpl.INITIALIZER:
					return validateInitializer((Initializer)value, diagnostics, context);	
				case Java_PackageImpl.INSTANCEOFEXPRESSION:
					return validateInstanceofExpression((InstanceofExpression)value, diagnostics, context);	
				case Java_PackageImpl.INTERFACEDECLARATION:
					return validateInterfaceDeclaration((InterfaceDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.JAVADOC:
					return validateJavadoc((Javadoc)value, diagnostics, context);	
				case Java_PackageImpl.LABELEDSTATEMENT:
					return validateLabeledStatement((LabeledStatement)value, diagnostics, context);	
				case Java_PackageImpl.LINECOMMENT:
					return validateLineComment((LineComment)value, diagnostics, context);	
				case Java_PackageImpl.MANIFEST:
					return validateManifest((Manifest)value, diagnostics, context);	
				case Java_PackageImpl.MANIFESTATTRIBUTE:
					return validateManifestAttribute((ManifestAttribute)value, diagnostics, context);	
				case Java_PackageImpl.MANIFESTENTRY:
					return validateManifestEntry((ManifestEntry)value, diagnostics, context);	
				case Java_PackageImpl.MEMBERREF:
					return validateMemberRef((MemberRef)value, diagnostics, context);	
				case Java_PackageImpl.METHODDECLARATION:
					return validateMethodDeclaration((MethodDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.METHODINVOCATION:
					return validateMethodInvocation((MethodInvocation)value, diagnostics, context);	
				case Java_PackageImpl.METHODREF:
					return validateMethodRef((MethodRef)value, diagnostics, context);	
				case Java_PackageImpl.METHODREFPARAMETER:
					return validateMethodRefParameter((MethodRefParameter)value, diagnostics, context);	
				case Java_PackageImpl.MODEL:
					return validateModel((Model)value, diagnostics, context);	
				case Java_PackageImpl.MODIFIER:
					return validateModifier((Modifier)value, diagnostics, context);	
				case Java_PackageImpl.NAMEDELEMENT:
					return validateNamedElement((NamedElement)value, diagnostics, context);	
				case Java_PackageImpl.NAMESPACEACCESS:
					return validateNamespaceAccess((NamespaceAccess)value, diagnostics, context);	
				case Java_PackageImpl.NUMBERLITERAL:
					return validateNumberLiteral((NumberLiteral)value, diagnostics, context);	
				case Java_PackageImpl.NULLLITERAL:
					return validateNullLiteral((NullLiteral)value, diagnostics, context);	
				case Java_PackageImpl.PACKAGE:
					return validatePackage((Package)value, diagnostics, context);	
				case Java_PackageImpl.PACKAGEACCESS:
					return validatePackageAccess((PackageAccess)value, diagnostics, context);	
				case Java_PackageImpl.PARAMETERIZEDTYPE:
					return validateParameterizedType((ParameterizedType)value, diagnostics, context);	
				case Java_PackageImpl.PARENTHESIZEDEXPRESSION:
					return validateParenthesizedExpression((ParenthesizedExpression)value, diagnostics, context);	
				case Java_PackageImpl.POSTFIXEXPRESSION:
					return validatePostfixExpression((PostfixExpression)value, diagnostics, context);	
				case Java_PackageImpl.PREFIXEXPRESSION:
					return validatePrefixExpression((PrefixExpression)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPE:
					return validatePrimitiveType((PrimitiveType)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEBOOLEAN:
					return validatePrimitiveTypeBoolean((PrimitiveTypeBoolean)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEBYTE:
					return validatePrimitiveTypeByte((PrimitiveTypeByte)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPECHAR:
					return validatePrimitiveTypeChar((PrimitiveTypeChar)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEDOUBLE:
					return validatePrimitiveTypeDouble((PrimitiveTypeDouble)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPESHORT:
					return validatePrimitiveTypeShort((PrimitiveTypeShort)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEFLOAT:
					return validatePrimitiveTypeFloat((PrimitiveTypeFloat)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEINT:
					return validatePrimitiveTypeInt((PrimitiveTypeInt)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPELONG:
					return validatePrimitiveTypeLong((PrimitiveTypeLong)value, diagnostics, context);	
				case Java_PackageImpl.PRIMITIVETYPEVOID:
					return validatePrimitiveTypeVoid((PrimitiveTypeVoid)value, diagnostics, context);	
				case Java_PackageImpl.RETURNSTATEMENT:
					return validateReturnStatement((ReturnStatement)value, diagnostics, context);	
				case Java_PackageImpl.SINGLEVARIABLEACCESS:
					return validateSingleVariableAccess((SingleVariableAccess)value, diagnostics, context);	
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION:
					return validateSingleVariableDeclaration((SingleVariableDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.STATEMENT:
					return validateStatement((Statement)value, diagnostics, context);	
				case Java_PackageImpl.STRINGLITERAL:
					return validateStringLiteral((StringLiteral)value, diagnostics, context);	
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION:
					return validateSuperConstructorInvocation((SuperConstructorInvocation)value, diagnostics, context);	
				case Java_PackageImpl.SUPERFIELDACCESS:
					return validateSuperFieldAccess((SuperFieldAccess)value, diagnostics, context);	
				case Java_PackageImpl.SUPERMETHODINVOCATION:
					return validateSuperMethodInvocation((SuperMethodInvocation)value, diagnostics, context);	
				case Java_PackageImpl.SWITCHCASE:
					return validateSwitchCase((SwitchCase)value, diagnostics, context);	
				case Java_PackageImpl.SWITCHSTATEMENT:
					return validateSwitchStatement((SwitchStatement)value, diagnostics, context);	
				case Java_PackageImpl.SYNCHRONIZEDSTATEMENT:
					return validateSynchronizedStatement((SynchronizedStatement)value, diagnostics, context);	
				case Java_PackageImpl.TAGELEMENT:
					return validateTagElement((TagElement)value, diagnostics, context);	
				case Java_PackageImpl.TEXTELEMENT:
					return validateTextElement((TextElement)value, diagnostics, context);	
				case Java_PackageImpl.THISEXPRESSION:
					return validateThisExpression((ThisExpression)value, diagnostics, context);	
				case Java_PackageImpl.THROWSTATEMENT:
					return validateThrowStatement((ThrowStatement)value, diagnostics, context);	
				case Java_PackageImpl.TRYSTATEMENT:
					return validateTryStatement((TryStatement)value, diagnostics, context);	
				case Java_PackageImpl.TYPE:
					return validateType((Type)value, diagnostics, context);	
				case Java_PackageImpl.TYPEACCESS:
					return validateTypeAccess((TypeAccess)value, diagnostics, context);	
				case Java_PackageImpl.TYPEDECLARATION:
					return validateTypeDeclaration((TypeDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.TYPEDECLARATIONSTATEMENT:
					return validateTypeDeclarationStatement((TypeDeclarationStatement)value, diagnostics, context);	
				case Java_PackageImpl.TYPELITERAL:
					return validateTypeLiteral((TypeLiteral)value, diagnostics, context);	
				case Java_PackageImpl.TYPEPARAMETER:
					return validateTypeParameter((TypeParameter)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDITEM:
					return validateUnresolvedItem((UnresolvedItem)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDITEMACCESS:
					return validateUnresolvedItemAccess((UnresolvedItemAccess)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDANNOTATIONDECLARATION:
					return validateUnresolvedAnnotationDeclaration((UnresolvedAnnotationDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION:
					return validateUnresolvedAnnotationTypeMemberDeclaration((UnresolvedAnnotationTypeMemberDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDCLASSDECLARATION:
					return validateUnresolvedClassDeclaration((UnresolvedClassDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION:
					return validateUnresolvedEnumDeclaration((UnresolvedEnumDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDINTERFACEDECLARATION:
					return validateUnresolvedInterfaceDeclaration((UnresolvedInterfaceDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT:
					return validateUnresolvedLabeledStatement((UnresolvedLabeledStatement)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION:
					return validateUnresolvedMethodDeclaration((UnresolvedMethodDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION:
					return validateUnresolvedSingleVariableDeclaration((UnresolvedSingleVariableDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDTYPE:
					return validateUnresolvedType((UnresolvedType)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDTYPEDECLARATION:
					return validateUnresolvedTypeDeclaration((UnresolvedTypeDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT:
					return validateUnresolvedVariableDeclarationFragment((UnresolvedVariableDeclarationFragment)value, diagnostics, context);	
				case Java_PackageImpl.VARIABLEDECLARATION:
					return validateVariableDeclaration((VariableDeclaration)value, diagnostics, context);	
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION:
					return validateVariableDeclarationExpression((VariableDeclarationExpression)value, diagnostics, context);	
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT:
					return validateVariableDeclarationFragment((VariableDeclarationFragment)value, diagnostics, context);	
				case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT:
					return validateVariableDeclarationStatement((VariableDeclarationStatement)value, diagnostics, context);	
				case Java_PackageImpl.WILDCARDTYPE:
					return validateWildCardType((WildCardType)value, diagnostics, context);	
				case Java_PackageImpl.WHILESTATEMENT:
					return validateWhileStatement((WhileStatement)value, diagnostics, context);	
                

                default:
                    return true;
            }
        }
		
		public boolean validateAbstractMethodDeclaration(AbstractMethodDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAbstractMethodInvocation(AbstractMethodInvocation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAbstractTypeDeclaration(AbstractTypeDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAbstractVariablesContainer(AbstractVariablesContainer obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAnnotation(Annotation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArchive(Archive obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAssertStatement(AssertStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateASTNode(ASTNode obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAnnotationMemberValuePair(AnnotationMemberValuePair obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAnnotationTypeDeclaration(AnnotationTypeDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAnonymousClassDeclaration(AnonymousClassDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArrayAccess(ArrayAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArrayCreation(ArrayCreation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArrayInitializer(ArrayInitializer obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArrayLengthAccess(ArrayLengthAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateArrayType(ArrayType obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateAssignment(Assignment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBodyDeclaration(BodyDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBooleanLiteral(BooleanLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBlockComment(BlockComment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBlock(Block obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBreakStatement(BreakStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCastExpression(CastExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCatchClause(CatchClause obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCharacterLiteral(CharacterLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateClassFile(ClassFile obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateClassInstanceCreation(ClassInstanceCreation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateConstructorDeclaration(ConstructorDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateConditionalExpression(ConditionalExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateConstructorInvocation(ConstructorInvocation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateClassDeclaration(ClassDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateComment(Comment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCompilationUnit(CompilationUnit obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateContinueStatement(ContinueStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateDoStatement(DoStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateEmptyStatement(EmptyStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateEnhancedForStatement(EnhancedForStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateEnumConstantDeclaration(EnumConstantDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateEnumDeclaration(EnumDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateExpression(Expression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateExpressionStatement(ExpressionStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateFieldAccess(FieldAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateFieldDeclaration(FieldDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateForStatement(ForStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateIfStatement(IfStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateImportDeclaration(ImportDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateInfixExpression(InfixExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateInitializer(Initializer obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateInstanceofExpression(InstanceofExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateInterfaceDeclaration(InterfaceDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateJavadoc(Javadoc obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateLabeledStatement(LabeledStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateLineComment(LineComment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateManifest(Manifest obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateManifestAttribute(ManifestAttribute obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateManifestEntry(ManifestEntry obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateMemberRef(MemberRef obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateMethodDeclaration(MethodDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateMethodInvocation(MethodInvocation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateMethodRef(MethodRef obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateMethodRefParameter(MethodRefParameter obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateModel(Model obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateModifier(Modifier obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateNamedElement(NamedElement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateNamespaceAccess(NamespaceAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateNumberLiteral(NumberLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateNullLiteral(NullLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePackage(Package obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePackageAccess(PackageAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateParameterizedType(ParameterizedType obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateParenthesizedExpression(ParenthesizedExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePostfixExpression(PostfixExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrefixExpression(PrefixExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveType(PrimitiveType obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeBoolean(PrimitiveTypeBoolean obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeByte(PrimitiveTypeByte obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeChar(PrimitiveTypeChar obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeDouble(PrimitiveTypeDouble obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeShort(PrimitiveTypeShort obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeFloat(PrimitiveTypeFloat obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeInt(PrimitiveTypeInt obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeLong(PrimitiveTypeLong obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validatePrimitiveTypeVoid(PrimitiveTypeVoid obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateReturnStatement(ReturnStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSingleVariableAccess(SingleVariableAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSingleVariableDeclaration(SingleVariableDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateStatement(Statement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateStringLiteral(StringLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSuperConstructorInvocation(SuperConstructorInvocation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSuperFieldAccess(SuperFieldAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSuperMethodInvocation(SuperMethodInvocation obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSwitchCase(SwitchCase obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSwitchStatement(SwitchStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateSynchronizedStatement(SynchronizedStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTagElement(TagElement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTextElement(TextElement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateThisExpression(ThisExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateThrowStatement(ThrowStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTryStatement(TryStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateType(Type obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTypeAccess(TypeAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTypeDeclaration(TypeDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTypeDeclarationStatement(TypeDeclarationStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTypeLiteral(TypeLiteral obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateTypeParameter(TypeParameter obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedItem(UnresolvedItem obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedItemAccess(UnresolvedItemAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedClassDeclaration(UnresolvedClassDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedEnumDeclaration(UnresolvedEnumDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedLabeledStatement(UnresolvedLabeledStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedMethodDeclaration(UnresolvedMethodDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedType(UnresolvedType obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedTypeDeclaration(UnresolvedTypeDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateVariableDeclaration(VariableDeclaration obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateVariableDeclarationExpression(VariableDeclarationExpression obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateVariableDeclarationFragment(VariableDeclarationFragment obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateVariableDeclarationStatement(VariableDeclarationStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateWildCardType(WildCardType obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateWhileStatement(WhileStatement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
	}
