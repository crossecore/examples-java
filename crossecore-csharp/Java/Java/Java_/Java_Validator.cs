/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
using Ecore;
	 	using System.Collections.Generic;
namespace Java_{
	public class Java_Validator : EObjectValidator {
	
        protected override bool validate(int classifierID, object value, DiagnosticChain diagnostics, Dictionary<object, object> context)
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
		
		public bool validateAbstractMethodDeclaration(AbstractMethodDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAbstractMethodInvocation(AbstractMethodInvocation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAbstractTypeDeclaration(AbstractTypeDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAbstractVariablesContainer(AbstractVariablesContainer obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAnnotation(Annotation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArchive(Archive obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAssertStatement(AssertStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateASTNode(ASTNode obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAnnotationMemberValuePair(AnnotationMemberValuePair obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAnnotationTypeDeclaration(AnnotationTypeDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAnonymousClassDeclaration(AnonymousClassDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArrayAccess(ArrayAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArrayCreation(ArrayCreation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArrayInitializer(ArrayInitializer obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArrayLengthAccess(ArrayLengthAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateArrayType(ArrayType obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateAssignment(Assignment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateBodyDeclaration(BodyDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateBooleanLiteral(BooleanLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateBlockComment(BlockComment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateBlock(Block obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateBreakStatement(BreakStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateCastExpression(CastExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateCatchClause(CatchClause obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateCharacterLiteral(CharacterLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateClassFile(ClassFile obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateClassInstanceCreation(ClassInstanceCreation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateConstructorDeclaration(ConstructorDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateConditionalExpression(ConditionalExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateConstructorInvocation(ConstructorInvocation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateClassDeclaration(ClassDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateComment(Comment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateCompilationUnit(CompilationUnit obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateContinueStatement(ContinueStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateDoStatement(DoStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateEmptyStatement(EmptyStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateEnhancedForStatement(EnhancedForStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateEnumConstantDeclaration(EnumConstantDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateEnumDeclaration(EnumDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateExpression(Expression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateExpressionStatement(ExpressionStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateFieldAccess(FieldAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateFieldDeclaration(FieldDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateForStatement(ForStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateIfStatement(IfStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateImportDeclaration(ImportDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateInfixExpression(InfixExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateInitializer(Initializer obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateInstanceofExpression(InstanceofExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateInterfaceDeclaration(InterfaceDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateJavadoc(Javadoc obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateLabeledStatement(LabeledStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateLineComment(LineComment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateManifest(Manifest obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateManifestAttribute(ManifestAttribute obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateManifestEntry(ManifestEntry obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateMemberRef(MemberRef obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateMethodDeclaration(MethodDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateMethodInvocation(MethodInvocation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateMethodRef(MethodRef obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateMethodRefParameter(MethodRefParameter obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateModel(Model obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateModifier(Modifier obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateNamedElement(NamedElement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateNamespaceAccess(NamespaceAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateNumberLiteral(NumberLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateNullLiteral(NullLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePackage(Package obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePackageAccess(PackageAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateParameterizedType(ParameterizedType obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateParenthesizedExpression(ParenthesizedExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePostfixExpression(PostfixExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrefixExpression(PrefixExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveType(PrimitiveType obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeBoolean(PrimitiveTypeBoolean obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeByte(PrimitiveTypeByte obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeChar(PrimitiveTypeChar obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeDouble(PrimitiveTypeDouble obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeShort(PrimitiveTypeShort obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeFloat(PrimitiveTypeFloat obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeInt(PrimitiveTypeInt obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeLong(PrimitiveTypeLong obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validatePrimitiveTypeVoid(PrimitiveTypeVoid obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateReturnStatement(ReturnStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSingleVariableAccess(SingleVariableAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSingleVariableDeclaration(SingleVariableDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateStatement(Statement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateStringLiteral(StringLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSuperConstructorInvocation(SuperConstructorInvocation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSuperFieldAccess(SuperFieldAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSuperMethodInvocation(SuperMethodInvocation obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSwitchCase(SwitchCase obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSwitchStatement(SwitchStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateSynchronizedStatement(SynchronizedStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTagElement(TagElement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTextElement(TextElement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateThisExpression(ThisExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateThrowStatement(ThrowStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTryStatement(TryStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateType(Type obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTypeAccess(TypeAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTypeDeclaration(TypeDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTypeDeclarationStatement(TypeDeclarationStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTypeLiteral(TypeLiteral obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateTypeParameter(TypeParameter obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedItem(UnresolvedItem obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedItemAccess(UnresolvedItemAccess obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedClassDeclaration(UnresolvedClassDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedEnumDeclaration(UnresolvedEnumDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedLabeledStatement(UnresolvedLabeledStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedMethodDeclaration(UnresolvedMethodDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedType(UnresolvedType obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedTypeDeclaration(UnresolvedTypeDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateVariableDeclaration(VariableDeclaration obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateVariableDeclarationExpression(VariableDeclarationExpression obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateVariableDeclarationFragment(VariableDeclarationFragment obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateVariableDeclarationStatement(VariableDeclarationStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateWildCardType(WildCardType obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
		public bool validateWhileStatement(WhileStatement obj, DiagnosticChain diagnostics, Dictionary<object, object> context)
			        {
			            if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
			            bool result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
			            //if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
			            if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
			            
			            return result;
			            
			        }
		
		
	}
}
