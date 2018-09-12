/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
	 	using Ecore;
namespace Java_{
	public class Java_PackageImpl : EPackageImpl, Java_Package{
			public const string eNAME = "java_";
			
			public const string eNS_URI = "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_";
			
			public const string eNS_PREFIX = "java_";
			
			public static Java_Package eINSTANCE = init();
			
			private Java_PackageImpl():base(eNS_URI, Java_FactoryImpl.eINSTANCE)
			{
				
			}
			
            public static Java_Package init()
            {
                // Obtain or create and register package
                var theJava_Package = new Java_PackageImpl();

                // Create package meta-data objects
                theJava_Package.createPackageContents();

                // Initialize created meta-data
                theJava_Package.initializePackageContents();

		        return theJava_Package;
	        }
	        
	        private bool isCreated = false;
            public void createPackageContents()
            {
                if (isCreated) return;
                isCreated = true;
				AbstractMethodDeclarationEClass = createEClass(ABSTRACTMETHODDECLARATION);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_BODY);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_PARAMETERS);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_TYPEPARAMETERS);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS);
				createEReference(AbstractMethodDeclarationEClass, ABSTRACTMETHODDECLARATION_USAGES);
				AbstractMethodInvocationEClass = createEClass(ABSTRACTMETHODINVOCATION);
				createEReference(AbstractMethodInvocationEClass, ABSTRACTMETHODINVOCATION_METHOD);
				createEReference(AbstractMethodInvocationEClass, ABSTRACTMETHODINVOCATION_ARGUMENTS);
				createEReference(AbstractMethodInvocationEClass, ABSTRACTMETHODINVOCATION_TYPEARGUMENTS);
				AbstractTypeDeclarationEClass = createEClass(ABSTRACTTYPEDECLARATION);
				createEReference(AbstractTypeDeclarationEClass, ABSTRACTTYPEDECLARATION_BODYDECLARATIONS);
				createEReference(AbstractTypeDeclarationEClass, ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY);
				createEReference(AbstractTypeDeclarationEClass, ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY);
				createEReference(AbstractTypeDeclarationEClass, ABSTRACTTYPEDECLARATION_PACKAGE);
				createEReference(AbstractTypeDeclarationEClass, ABSTRACTTYPEDECLARATION_SUPERINTERFACES);
				AbstractTypeQualifiedExpressionEClass = createEClass(ABSTRACTTYPEQUALIFIEDEXPRESSION);
				createEReference(AbstractTypeQualifiedExpressionEClass, ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER);
				AbstractVariablesContainerEClass = createEClass(ABSTRACTVARIABLESCONTAINER);
				createEReference(AbstractVariablesContainerEClass, ABSTRACTVARIABLESCONTAINER_TYPE);
				createEReference(AbstractVariablesContainerEClass, ABSTRACTVARIABLESCONTAINER_FRAGMENTS);
				AnnotationEClass = createEClass(ANNOTATION);
				createEReference(AnnotationEClass, ANNOTATION_TYPE);
				createEReference(AnnotationEClass, ANNOTATION_VALUES);
				ArchiveEClass = createEClass(ARCHIVE);
				createEAttribute(ArchiveEClass, ARCHIVE_ORIGINALFILEPATH);
				createEReference(ArchiveEClass, ARCHIVE_CLASSFILES);
				createEReference(ArchiveEClass, ARCHIVE_MANIFEST);
				AssertStatementEClass = createEClass(ASSERTSTATEMENT);
				createEReference(AssertStatementEClass, ASSERTSTATEMENT_MESSAGE);
				createEReference(AssertStatementEClass, ASSERTSTATEMENT_EXPRESSION);
				ASTNodeEClass = createEClass(ASTNODE);
				createEReference(ASTNodeEClass, ASTNODE_COMMENTS);
				createEReference(ASTNodeEClass, ASTNODE_ORIGINALCOMPILATIONUNIT);
				createEReference(ASTNodeEClass, ASTNODE_ORIGINALCLASSFILE);
				AnnotationMemberValuePairEClass = createEClass(ANNOTATIONMEMBERVALUEPAIR);
				createEReference(AnnotationMemberValuePairEClass, ANNOTATIONMEMBERVALUEPAIR_MEMBER);
				createEReference(AnnotationMemberValuePairEClass, ANNOTATIONMEMBERVALUEPAIR_VALUE);
				AnnotationTypeDeclarationEClass = createEClass(ANNOTATIONTYPEDECLARATION);
				AnnotationTypeMemberDeclarationEClass = createEClass(ANNOTATIONTYPEMEMBERDECLARATION);
				createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT);
				createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATIONTYPEMEMBERDECLARATION_TYPE);
				createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATIONTYPEMEMBERDECLARATION_USAGES);
				AnonymousClassDeclarationEClass = createEClass(ANONYMOUSCLASSDECLARATION);
				createEReference(AnonymousClassDeclarationEClass, ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS);
				createEReference(AnonymousClassDeclarationEClass, ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION);
				ArrayAccessEClass = createEClass(ARRAYACCESS);
				createEReference(ArrayAccessEClass, ARRAYACCESS_ARRAY);
				createEReference(ArrayAccessEClass, ARRAYACCESS_INDEX);
				ArrayCreationEClass = createEClass(ARRAYCREATION);
				createEReference(ArrayCreationEClass, ARRAYCREATION_DIMENSIONS);
				createEReference(ArrayCreationEClass, ARRAYCREATION_INITIALIZER);
				createEReference(ArrayCreationEClass, ARRAYCREATION_TYPE);
				ArrayInitializerEClass = createEClass(ARRAYINITIALIZER);
				createEReference(ArrayInitializerEClass, ARRAYINITIALIZER_EXPRESSIONS);
				ArrayLengthAccessEClass = createEClass(ARRAYLENGTHACCESS);
				createEReference(ArrayLengthAccessEClass, ARRAYLENGTHACCESS_ARRAY);
				ArrayTypeEClass = createEClass(ARRAYTYPE);
				createEAttribute(ArrayTypeEClass, ARRAYTYPE_DIMENSIONS);
				createEReference(ArrayTypeEClass, ARRAYTYPE_ELEMENTTYPE);
				AssignmentEClass = createEClass(ASSIGNMENT);
				createEReference(AssignmentEClass, ASSIGNMENT_LEFTHANDSIDE);
				createEAttribute(AssignmentEClass, ASSIGNMENT_OPERATOR);
				createEReference(AssignmentEClass, ASSIGNMENT_RIGHTHANDSIDE);
				BodyDeclarationEClass = createEClass(BODYDECLARATION);
				createEReference(BodyDeclarationEClass, BODYDECLARATION_ABSTRACTTYPEDECLARATION);
				createEReference(BodyDeclarationEClass, BODYDECLARATION_ANNOTATIONS);
				createEReference(BodyDeclarationEClass, BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER);
				createEReference(BodyDeclarationEClass, BODYDECLARATION_MODIFIER);
				BooleanLiteralEClass = createEClass(BOOLEANLITERAL);
				createEAttribute(BooleanLiteralEClass, BOOLEANLITERAL_VALUE);
				BlockCommentEClass = createEClass(BLOCKCOMMENT);
				BlockEClass = createEClass(BLOCK);
				createEReference(BlockEClass, BLOCK_STATEMENTS);
				BreakStatementEClass = createEClass(BREAKSTATEMENT);
				createEReference(BreakStatementEClass, BREAKSTATEMENT_LABEL);
				CastExpressionEClass = createEClass(CASTEXPRESSION);
				createEReference(CastExpressionEClass, CASTEXPRESSION_EXPRESSION);
				createEReference(CastExpressionEClass, CASTEXPRESSION_TYPE);
				CatchClauseEClass = createEClass(CATCHCLAUSE);
				createEReference(CatchClauseEClass, CATCHCLAUSE_EXCEPTION);
				createEReference(CatchClauseEClass, CATCHCLAUSE_BODY);
				CharacterLiteralEClass = createEClass(CHARACTERLITERAL);
				createEAttribute(CharacterLiteralEClass, CHARACTERLITERAL_ESCAPEDVALUE);
				ClassFileEClass = createEClass(CLASSFILE);
				createEAttribute(ClassFileEClass, CLASSFILE_ORIGINALFILEPATH);
				createEReference(ClassFileEClass, CLASSFILE_TYPE);
				createEReference(ClassFileEClass, CLASSFILE_ATTACHEDSOURCE);
				createEReference(ClassFileEClass, CLASSFILE_PACKAGE);
				ClassInstanceCreationEClass = createEClass(CLASSINSTANCECREATION);
				createEReference(ClassInstanceCreationEClass, CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION);
				createEReference(ClassInstanceCreationEClass, CLASSINSTANCECREATION_EXPRESSION);
				createEReference(ClassInstanceCreationEClass, CLASSINSTANCECREATION_TYPE);
				ConstructorDeclarationEClass = createEClass(CONSTRUCTORDECLARATION);
				ConditionalExpressionEClass = createEClass(CONDITIONALEXPRESSION);
				createEReference(ConditionalExpressionEClass, CONDITIONALEXPRESSION_ELSEEXPRESSION);
				createEReference(ConditionalExpressionEClass, CONDITIONALEXPRESSION_EXPRESSION);
				createEReference(ConditionalExpressionEClass, CONDITIONALEXPRESSION_THENEXPRESSION);
				ConstructorInvocationEClass = createEClass(CONSTRUCTORINVOCATION);
				ClassDeclarationEClass = createEClass(CLASSDECLARATION);
				createEReference(ClassDeclarationEClass, CLASSDECLARATION_SUPERCLASS);
				CommentEClass = createEClass(COMMENT);
				createEAttribute(CommentEClass, COMMENT_CONTENT);
				createEAttribute(CommentEClass, COMMENT_ENCLOSEDBYPARENT);
				createEAttribute(CommentEClass, COMMENT_PREFIXOFPARENT);
				CompilationUnitEClass = createEClass(COMPILATIONUNIT);
				createEAttribute(CompilationUnitEClass, COMPILATIONUNIT_ORIGINALFILEPATH);
				createEReference(CompilationUnitEClass, COMPILATIONUNIT_COMMENTLIST);
				createEReference(CompilationUnitEClass, COMPILATIONUNIT_IMPORTS);
				createEReference(CompilationUnitEClass, COMPILATIONUNIT_PACKAGE);
				createEReference(CompilationUnitEClass, COMPILATIONUNIT_TYPES);
				ContinueStatementEClass = createEClass(CONTINUESTATEMENT);
				createEReference(ContinueStatementEClass, CONTINUESTATEMENT_LABEL);
				DoStatementEClass = createEClass(DOSTATEMENT);
				createEReference(DoStatementEClass, DOSTATEMENT_EXPRESSION);
				createEReference(DoStatementEClass, DOSTATEMENT_BODY);
				EmptyStatementEClass = createEClass(EMPTYSTATEMENT);
				EnhancedForStatementEClass = createEClass(ENHANCEDFORSTATEMENT);
				createEReference(EnhancedForStatementEClass, ENHANCEDFORSTATEMENT_BODY);
				createEReference(EnhancedForStatementEClass, ENHANCEDFORSTATEMENT_EXPRESSION);
				createEReference(EnhancedForStatementEClass, ENHANCEDFORSTATEMENT_PARAMETER);
				EnumConstantDeclarationEClass = createEClass(ENUMCONSTANTDECLARATION);
				createEReference(EnumConstantDeclarationEClass, ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION);
				createEReference(EnumConstantDeclarationEClass, ENUMCONSTANTDECLARATION_ARGUMENTS);
				EnumDeclarationEClass = createEClass(ENUMDECLARATION);
				createEReference(EnumDeclarationEClass, ENUMDECLARATION_ENUMCONSTANTS);
				ExpressionEClass = createEClass(EXPRESSION);
				ExpressionStatementEClass = createEClass(EXPRESSIONSTATEMENT);
				createEReference(ExpressionStatementEClass, EXPRESSIONSTATEMENT_EXPRESSION);
				FieldAccessEClass = createEClass(FIELDACCESS);
				createEReference(FieldAccessEClass, FIELDACCESS_FIELD);
				createEReference(FieldAccessEClass, FIELDACCESS_EXPRESSION);
				FieldDeclarationEClass = createEClass(FIELDDECLARATION);
				ForStatementEClass = createEClass(FORSTATEMENT);
				createEReference(ForStatementEClass, FORSTATEMENT_EXPRESSION);
				createEReference(ForStatementEClass, FORSTATEMENT_UPDATERS);
				createEReference(ForStatementEClass, FORSTATEMENT_INITIALIZERS);
				createEReference(ForStatementEClass, FORSTATEMENT_BODY);
				IfStatementEClass = createEClass(IFSTATEMENT);
				createEReference(IfStatementEClass, IFSTATEMENT_EXPRESSION);
				createEReference(IfStatementEClass, IFSTATEMENT_THENSTATEMENT);
				createEReference(IfStatementEClass, IFSTATEMENT_ELSESTATEMENT);
				ImportDeclarationEClass = createEClass(IMPORTDECLARATION);
				createEAttribute(ImportDeclarationEClass, IMPORTDECLARATION_STATIC);
				createEReference(ImportDeclarationEClass, IMPORTDECLARATION_IMPORTEDELEMENT);
				InfixExpressionEClass = createEClass(INFIXEXPRESSION);
				createEAttribute(InfixExpressionEClass, INFIXEXPRESSION_OPERATOR);
				createEReference(InfixExpressionEClass, INFIXEXPRESSION_RIGHTOPERAND);
				createEReference(InfixExpressionEClass, INFIXEXPRESSION_LEFTOPERAND);
				createEReference(InfixExpressionEClass, INFIXEXPRESSION_EXTENDEDOPERANDS);
				InitializerEClass = createEClass(INITIALIZER);
				createEReference(InitializerEClass, INITIALIZER_BODY);
				InstanceofExpressionEClass = createEClass(INSTANCEOFEXPRESSION);
				createEReference(InstanceofExpressionEClass, INSTANCEOFEXPRESSION_RIGHTOPERAND);
				createEReference(InstanceofExpressionEClass, INSTANCEOFEXPRESSION_LEFTOPERAND);
				InterfaceDeclarationEClass = createEClass(INTERFACEDECLARATION);
				JavadocEClass = createEClass(JAVADOC);
				createEReference(JavadocEClass, JAVADOC_TAGS);
				LabeledStatementEClass = createEClass(LABELEDSTATEMENT);
				createEReference(LabeledStatementEClass, LABELEDSTATEMENT_BODY);
				createEReference(LabeledStatementEClass, LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS);
				createEReference(LabeledStatementEClass, LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS);
				LineCommentEClass = createEClass(LINECOMMENT);
				ManifestEClass = createEClass(MANIFEST);
				createEReference(ManifestEClass, MANIFEST_MAINATTRIBUTES);
				createEReference(ManifestEClass, MANIFEST_ENTRYATTRIBUTES);
				ManifestAttributeEClass = createEClass(MANIFESTATTRIBUTE);
				createEAttribute(ManifestAttributeEClass, MANIFESTATTRIBUTE_KEY);
				createEAttribute(ManifestAttributeEClass, MANIFESTATTRIBUTE_VALUE);
				ManifestEntryEClass = createEClass(MANIFESTENTRY);
				createEAttribute(ManifestEntryEClass, MANIFESTENTRY_NAME);
				createEReference(ManifestEntryEClass, MANIFESTENTRY_ATTRIBUTES);
				MemberRefEClass = createEClass(MEMBERREF);
				createEReference(MemberRefEClass, MEMBERREF_MEMBER);
				createEReference(MemberRefEClass, MEMBERREF_QUALIFIER);
				MethodDeclarationEClass = createEClass(METHODDECLARATION);
				createEAttribute(MethodDeclarationEClass, METHODDECLARATION_EXTRAARRAYDIMENSIONS);
				createEReference(MethodDeclarationEClass, METHODDECLARATION_RETURNTYPE);
				createEReference(MethodDeclarationEClass, METHODDECLARATION_REDEFINEDMETHODDECLARATION);
				createEReference(MethodDeclarationEClass, METHODDECLARATION_REDEFINITIONS);
				MethodInvocationEClass = createEClass(METHODINVOCATION);
				createEReference(MethodInvocationEClass, METHODINVOCATION_EXPRESSION);
				MethodRefEClass = createEClass(METHODREF);
				createEReference(MethodRefEClass, METHODREF_METHOD);
				createEReference(MethodRefEClass, METHODREF_QUALIFIER);
				createEReference(MethodRefEClass, METHODREF_PARAMETERS);
				MethodRefParameterEClass = createEClass(METHODREFPARAMETER);
				createEAttribute(MethodRefParameterEClass, METHODREFPARAMETER_NAME);
				createEAttribute(MethodRefParameterEClass, METHODREFPARAMETER_VARARGS);
				createEReference(MethodRefParameterEClass, METHODREFPARAMETER_TYPE);
				ModelEClass = createEClass(MODEL);
				createEAttribute(ModelEClass, MODEL_NAME);
				createEReference(ModelEClass, MODEL_OWNEDELEMENTS);
				createEReference(ModelEClass, MODEL_ORPHANTYPES);
				createEReference(ModelEClass, MODEL_UNRESOLVEDITEMS);
				createEReference(ModelEClass, MODEL_COMPILATIONUNITS);
				createEReference(ModelEClass, MODEL_CLASSFILES);
				createEReference(ModelEClass, MODEL_ARCHIVES);
				ModifierEClass = createEClass(MODIFIER);
				createEAttribute(ModifierEClass, MODIFIER_VISIBILITY);
				createEAttribute(ModifierEClass, MODIFIER_INHERITANCE);
				createEAttribute(ModifierEClass, MODIFIER_STATIC);
				createEAttribute(ModifierEClass, MODIFIER_TRANSIENT);
				createEAttribute(ModifierEClass, MODIFIER_VOLATILE);
				createEAttribute(ModifierEClass, MODIFIER_NATIVE);
				createEAttribute(ModifierEClass, MODIFIER_STRICTFP);
				createEAttribute(ModifierEClass, MODIFIER_SYNCHRONIZED);
				createEReference(ModifierEClass, MODIFIER_BODYDECLARATION);
				createEReference(ModifierEClass, MODIFIER_SINGLEVARIABLEDECLARATION);
				createEReference(ModifierEClass, MODIFIER_VARIABLEDECLARATIONSTATEMENT);
				createEReference(ModifierEClass, MODIFIER_VARIABLEDECLARATIONEXPRESSION);
				NamedElementEClass = createEClass(NAMEDELEMENT);
				createEAttribute(NamedElementEClass, NAMEDELEMENT_NAME);
				createEAttribute(NamedElementEClass, NAMEDELEMENT_PROXY);
				createEReference(NamedElementEClass, NAMEDELEMENT_USAGESINIMPORTS);
				NamespaceAccessEClass = createEClass(NAMESPACEACCESS);
				NumberLiteralEClass = createEClass(NUMBERLITERAL);
				createEAttribute(NumberLiteralEClass, NUMBERLITERAL_TOKENVALUE);
				NullLiteralEClass = createEClass(NULLLITERAL);
				PackageEClass = createEClass(PACKAGE);
				createEReference(PackageEClass, PACKAGE_OWNEDELEMENTS);
				createEReference(PackageEClass, PACKAGE_MODEL);
				createEReference(PackageEClass, PACKAGE_OWNEDPACKAGES);
				createEReference(PackageEClass, PACKAGE_PACKAGE);
				createEReference(PackageEClass, PACKAGE_USAGESINPACKAGEACCESS);
				PackageAccessEClass = createEClass(PACKAGEACCESS);
				createEReference(PackageAccessEClass, PACKAGEACCESS_PACKAGE);
				createEReference(PackageAccessEClass, PACKAGEACCESS_QUALIFIER);
				ParameterizedTypeEClass = createEClass(PARAMETERIZEDTYPE);
				createEReference(ParameterizedTypeEClass, PARAMETERIZEDTYPE_TYPE);
				createEReference(ParameterizedTypeEClass, PARAMETERIZEDTYPE_TYPEARGUMENTS);
				ParenthesizedExpressionEClass = createEClass(PARENTHESIZEDEXPRESSION);
				createEReference(ParenthesizedExpressionEClass, PARENTHESIZEDEXPRESSION_EXPRESSION);
				PostfixExpressionEClass = createEClass(POSTFIXEXPRESSION);
				createEAttribute(PostfixExpressionEClass, POSTFIXEXPRESSION_OPERATOR);
				createEReference(PostfixExpressionEClass, POSTFIXEXPRESSION_OPERAND);
				PrefixExpressionEClass = createEClass(PREFIXEXPRESSION);
				createEAttribute(PrefixExpressionEClass, PREFIXEXPRESSION_OPERATOR);
				createEReference(PrefixExpressionEClass, PREFIXEXPRESSION_OPERAND);
				PrimitiveTypeEClass = createEClass(PRIMITIVETYPE);
				PrimitiveTypeBooleanEClass = createEClass(PRIMITIVETYPEBOOLEAN);
				PrimitiveTypeByteEClass = createEClass(PRIMITIVETYPEBYTE);
				PrimitiveTypeCharEClass = createEClass(PRIMITIVETYPECHAR);
				PrimitiveTypeDoubleEClass = createEClass(PRIMITIVETYPEDOUBLE);
				PrimitiveTypeShortEClass = createEClass(PRIMITIVETYPESHORT);
				PrimitiveTypeFloatEClass = createEClass(PRIMITIVETYPEFLOAT);
				PrimitiveTypeIntEClass = createEClass(PRIMITIVETYPEINT);
				PrimitiveTypeLongEClass = createEClass(PRIMITIVETYPELONG);
				PrimitiveTypeVoidEClass = createEClass(PRIMITIVETYPEVOID);
				ReturnStatementEClass = createEClass(RETURNSTATEMENT);
				createEReference(ReturnStatementEClass, RETURNSTATEMENT_EXPRESSION);
				SingleVariableAccessEClass = createEClass(SINGLEVARIABLEACCESS);
				createEReference(SingleVariableAccessEClass, SINGLEVARIABLEACCESS_VARIABLE);
				createEReference(SingleVariableAccessEClass, SINGLEVARIABLEACCESS_QUALIFIER);
				SingleVariableDeclarationEClass = createEClass(SINGLEVARIABLEDECLARATION);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_MODIFIER);
				createEAttribute(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_VARARGS);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_TYPE);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_ANNOTATIONS);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_METHODDECLARATION);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_CATCHCLAUSE);
				createEReference(SingleVariableDeclarationEClass, SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT);
				StatementEClass = createEClass(STATEMENT);
				StringLiteralEClass = createEClass(STRINGLITERAL);
				createEAttribute(StringLiteralEClass, STRINGLITERAL_ESCAPEDVALUE);
				SuperConstructorInvocationEClass = createEClass(SUPERCONSTRUCTORINVOCATION);
				createEReference(SuperConstructorInvocationEClass, SUPERCONSTRUCTORINVOCATION_EXPRESSION);
				SuperFieldAccessEClass = createEClass(SUPERFIELDACCESS);
				createEReference(SuperFieldAccessEClass, SUPERFIELDACCESS_FIELD);
				SuperMethodInvocationEClass = createEClass(SUPERMETHODINVOCATION);
				SwitchCaseEClass = createEClass(SWITCHCASE);
				createEAttribute(SwitchCaseEClass, SWITCHCASE_DEFAULT);
				createEReference(SwitchCaseEClass, SWITCHCASE_EXPRESSION);
				SwitchStatementEClass = createEClass(SWITCHSTATEMENT);
				createEReference(SwitchStatementEClass, SWITCHSTATEMENT_EXPRESSION);
				createEReference(SwitchStatementEClass, SWITCHSTATEMENT_STATEMENTS);
				SynchronizedStatementEClass = createEClass(SYNCHRONIZEDSTATEMENT);
				createEReference(SynchronizedStatementEClass, SYNCHRONIZEDSTATEMENT_BODY);
				createEReference(SynchronizedStatementEClass, SYNCHRONIZEDSTATEMENT_EXPRESSION);
				TagElementEClass = createEClass(TAGELEMENT);
				createEAttribute(TagElementEClass, TAGELEMENT_TAGNAME);
				createEReference(TagElementEClass, TAGELEMENT_FRAGMENTS);
				TextElementEClass = createEClass(TEXTELEMENT);
				createEAttribute(TextElementEClass, TEXTELEMENT_TEXT);
				ThisExpressionEClass = createEClass(THISEXPRESSION);
				ThrowStatementEClass = createEClass(THROWSTATEMENT);
				createEReference(ThrowStatementEClass, THROWSTATEMENT_EXPRESSION);
				TryStatementEClass = createEClass(TRYSTATEMENT);
				createEReference(TryStatementEClass, TRYSTATEMENT_BODY);
				createEReference(TryStatementEClass, TRYSTATEMENT_FINALLY);
				createEReference(TryStatementEClass, TRYSTATEMENT_CATCHCLAUSES);
				TypeEClass = createEClass(TYPE);
				createEReference(TypeEClass, TYPE_USAGESINTYPEACCESS);
				TypeAccessEClass = createEClass(TYPEACCESS);
				createEReference(TypeAccessEClass, TYPEACCESS_TYPE);
				createEReference(TypeAccessEClass, TYPEACCESS_QUALIFIER);
				TypeDeclarationEClass = createEClass(TYPEDECLARATION);
				createEReference(TypeDeclarationEClass, TYPEDECLARATION_TYPEPARAMETERS);
				TypeDeclarationStatementEClass = createEClass(TYPEDECLARATIONSTATEMENT);
				createEReference(TypeDeclarationStatementEClass, TYPEDECLARATIONSTATEMENT_DECLARATION);
				TypeLiteralEClass = createEClass(TYPELITERAL);
				createEReference(TypeLiteralEClass, TYPELITERAL_TYPE);
				TypeParameterEClass = createEClass(TYPEPARAMETER);
				createEReference(TypeParameterEClass, TYPEPARAMETER_BOUNDS);
				UnresolvedItemEClass = createEClass(UNRESOLVEDITEM);
				UnresolvedItemAccessEClass = createEClass(UNRESOLVEDITEMACCESS);
				createEReference(UnresolvedItemAccessEClass, UNRESOLVEDITEMACCESS_ELEMENT);
				createEReference(UnresolvedItemAccessEClass, UNRESOLVEDITEMACCESS_QUALIFIER);
				UnresolvedAnnotationDeclarationEClass = createEClass(UNRESOLVEDANNOTATIONDECLARATION);
				UnresolvedAnnotationTypeMemberDeclarationEClass = createEClass(UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION);
				UnresolvedClassDeclarationEClass = createEClass(UNRESOLVEDCLASSDECLARATION);
				UnresolvedEnumDeclarationEClass = createEClass(UNRESOLVEDENUMDECLARATION);
				UnresolvedInterfaceDeclarationEClass = createEClass(UNRESOLVEDINTERFACEDECLARATION);
				UnresolvedLabeledStatementEClass = createEClass(UNRESOLVEDLABELEDSTATEMENT);
				UnresolvedMethodDeclarationEClass = createEClass(UNRESOLVEDMETHODDECLARATION);
				UnresolvedSingleVariableDeclarationEClass = createEClass(UNRESOLVEDSINGLEVARIABLEDECLARATION);
				UnresolvedTypeEClass = createEClass(UNRESOLVEDTYPE);
				UnresolvedTypeDeclarationEClass = createEClass(UNRESOLVEDTYPEDECLARATION);
				UnresolvedVariableDeclarationFragmentEClass = createEClass(UNRESOLVEDVARIABLEDECLARATIONFRAGMENT);
				VariableDeclarationEClass = createEClass(VARIABLEDECLARATION);
				createEAttribute(VariableDeclarationEClass, VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS);
				createEReference(VariableDeclarationEClass, VARIABLEDECLARATION_INITIALIZER);
				createEReference(VariableDeclarationEClass, VARIABLEDECLARATION_USAGEINVARIABLEACCESS);
				VariableDeclarationExpressionEClass = createEClass(VARIABLEDECLARATIONEXPRESSION);
				createEReference(VariableDeclarationExpressionEClass, VARIABLEDECLARATIONEXPRESSION_MODIFIER);
				createEReference(VariableDeclarationExpressionEClass, VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS);
				VariableDeclarationFragmentEClass = createEClass(VARIABLEDECLARATIONFRAGMENT);
				createEReference(VariableDeclarationFragmentEClass, VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER);
				VariableDeclarationStatementEClass = createEClass(VARIABLEDECLARATIONSTATEMENT);
				createEAttribute(VariableDeclarationStatementEClass, VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS);
				createEReference(VariableDeclarationStatementEClass, VARIABLEDECLARATIONSTATEMENT_MODIFIER);
				createEReference(VariableDeclarationStatementEClass, VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS);
				WildCardTypeEClass = createEClass(WILDCARDTYPE);
				createEAttribute(WildCardTypeEClass, WILDCARDTYPE_UPPERBOUND);
				createEReference(WildCardTypeEClass, WILDCARDTYPE_BOUND);
				WhileStatementEClass = createEClass(WHILESTATEMENT);
				createEReference(WhileStatementEClass, WHILESTATEMENT_EXPRESSION);
				createEReference(WhileStatementEClass, WHILESTATEMENT_BODY);
				
				AssignmentKindEEnum = createEEnum(ASSIGNMENTKIND);
				InfixExpressionKindEEnum = createEEnum(INFIXEXPRESSIONKIND);
				InheritanceKindEEnum = createEEnum(INHERITANCEKIND);
				PostfixExpressionKindEEnum = createEEnum(POSTFIXEXPRESSIONKIND);
				PrefixExpressionKindEEnum = createEEnum(PREFIXEXPRESSIONKIND);
				VisibilityKindEEnum = createEEnum(VISIBILITYKIND);
				
				
	        }
	        
	        private bool isInitialized = false;
	        public void initializePackageContents()
	        {
                if (isInitialized) return;
                isInitialized = true;
	            // Initialize package
	            name = eNAME;
	            nsPrefix = eNS_PREFIX;
	            nsURI = eNS_URI;
	
				
				AbstractMethodDeclarationEClass.eSuperTypes.add(getBodyDeclaration());
											
				
				AbstractMethodInvocationEClass.eSuperTypes.add(getASTNode());
											
				
				AbstractTypeDeclarationEClass.eSuperTypes.add(getBodyDeclaration());
											
				AbstractTypeDeclarationEClass.eSuperTypes.add(getType());
											
				
				AbstractTypeQualifiedExpressionEClass.eSuperTypes.add(getExpression());
											
				
				AbstractVariablesContainerEClass.eSuperTypes.add(getASTNode());
											
				
				AnnotationEClass.eSuperTypes.add(getExpression());
											
				
				ArchiveEClass.eSuperTypes.add(getNamedElement());
											
				
				AssertStatementEClass.eSuperTypes.add(getStatement());
											
				
				
				AnnotationMemberValuePairEClass.eSuperTypes.add(getNamedElement());
											
				
				AnnotationTypeDeclarationEClass.eSuperTypes.add(getAbstractTypeDeclaration());
											
				
				AnnotationTypeMemberDeclarationEClass.eSuperTypes.add(getBodyDeclaration());
											
				
				AnonymousClassDeclarationEClass.eSuperTypes.add(getASTNode());
											
				
				ArrayAccessEClass.eSuperTypes.add(getExpression());
											
				
				ArrayCreationEClass.eSuperTypes.add(getExpression());
											
				
				ArrayInitializerEClass.eSuperTypes.add(getExpression());
											
				
				ArrayLengthAccessEClass.eSuperTypes.add(getExpression());
											
				
				ArrayTypeEClass.eSuperTypes.add(getType());
											
				
				AssignmentEClass.eSuperTypes.add(getExpression());
											
				
				BodyDeclarationEClass.eSuperTypes.add(getNamedElement());
											
				
				BooleanLiteralEClass.eSuperTypes.add(getExpression());
											
				
				BlockCommentEClass.eSuperTypes.add(getComment());
											
				
				BlockEClass.eSuperTypes.add(getStatement());
											
				
				BreakStatementEClass.eSuperTypes.add(getStatement());
											
				
				CastExpressionEClass.eSuperTypes.add(getExpression());
											
				
				CatchClauseEClass.eSuperTypes.add(getStatement());
											
				
				CharacterLiteralEClass.eSuperTypes.add(getExpression());
											
				
				ClassFileEClass.eSuperTypes.add(getNamedElement());
											
				
				ClassInstanceCreationEClass.eSuperTypes.add(getExpression());
											
				ClassInstanceCreationEClass.eSuperTypes.add(getAbstractMethodInvocation());
											
				
				ConstructorDeclarationEClass.eSuperTypes.add(getAbstractMethodDeclaration());
											
				
				ConditionalExpressionEClass.eSuperTypes.add(getExpression());
											
				
				ConstructorInvocationEClass.eSuperTypes.add(getStatement());
											
				ConstructorInvocationEClass.eSuperTypes.add(getAbstractMethodInvocation());
											
				
				ClassDeclarationEClass.eSuperTypes.add(getTypeDeclaration());
											
				
				CommentEClass.eSuperTypes.add(getASTNode());
											
				
				CompilationUnitEClass.eSuperTypes.add(getNamedElement());
											
				
				ContinueStatementEClass.eSuperTypes.add(getStatement());
											
				
				DoStatementEClass.eSuperTypes.add(getStatement());
											
				
				EmptyStatementEClass.eSuperTypes.add(getStatement());
											
				
				EnhancedForStatementEClass.eSuperTypes.add(getStatement());
											
				
				EnumConstantDeclarationEClass.eSuperTypes.add(getBodyDeclaration());
											
				EnumConstantDeclarationEClass.eSuperTypes.add(getVariableDeclaration());
											
				
				EnumDeclarationEClass.eSuperTypes.add(getAbstractTypeDeclaration());
											
				
				ExpressionEClass.eSuperTypes.add(getASTNode());
											
				
				ExpressionStatementEClass.eSuperTypes.add(getStatement());
											
				
				FieldAccessEClass.eSuperTypes.add(getExpression());
											
				
				FieldDeclarationEClass.eSuperTypes.add(getBodyDeclaration());
											
				FieldDeclarationEClass.eSuperTypes.add(getAbstractVariablesContainer());
											
				
				ForStatementEClass.eSuperTypes.add(getStatement());
											
				
				IfStatementEClass.eSuperTypes.add(getStatement());
											
				
				ImportDeclarationEClass.eSuperTypes.add(getASTNode());
											
				
				InfixExpressionEClass.eSuperTypes.add(getExpression());
											
				
				InitializerEClass.eSuperTypes.add(getBodyDeclaration());
											
				
				InstanceofExpressionEClass.eSuperTypes.add(getExpression());
											
				
				InterfaceDeclarationEClass.eSuperTypes.add(getTypeDeclaration());
											
				
				JavadocEClass.eSuperTypes.add(getComment());
											
				
				LabeledStatementEClass.eSuperTypes.add(getNamedElement());
											
				LabeledStatementEClass.eSuperTypes.add(getStatement());
											
				
				LineCommentEClass.eSuperTypes.add(getComment());
											
				
				
				
				
				MemberRefEClass.eSuperTypes.add(getASTNode());
											
				
				MethodDeclarationEClass.eSuperTypes.add(getAbstractMethodDeclaration());
											
				
				MethodInvocationEClass.eSuperTypes.add(getExpression());
											
				MethodInvocationEClass.eSuperTypes.add(getAbstractMethodInvocation());
											
				
				MethodRefEClass.eSuperTypes.add(getASTNode());
											
				
				MethodRefParameterEClass.eSuperTypes.add(getASTNode());
											
				
				
				ModifierEClass.eSuperTypes.add(getASTNode());
											
				
				NamedElementEClass.eSuperTypes.add(getASTNode());
											
				
				NamespaceAccessEClass.eSuperTypes.add(getASTNode());
											
				
				NumberLiteralEClass.eSuperTypes.add(getExpression());
											
				
				NullLiteralEClass.eSuperTypes.add(getExpression());
											
				
				PackageEClass.eSuperTypes.add(getNamedElement());
											
				
				PackageAccessEClass.eSuperTypes.add(getNamespaceAccess());
											
				
				ParameterizedTypeEClass.eSuperTypes.add(getType());
											
				
				ParenthesizedExpressionEClass.eSuperTypes.add(getExpression());
											
				
				PostfixExpressionEClass.eSuperTypes.add(getExpression());
											
				
				PrefixExpressionEClass.eSuperTypes.add(getExpression());
											
				
				PrimitiveTypeEClass.eSuperTypes.add(getType());
											
				
				PrimitiveTypeBooleanEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeByteEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeCharEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeDoubleEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeShortEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeFloatEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeIntEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeLongEClass.eSuperTypes.add(getPrimitiveType());
											
				
				PrimitiveTypeVoidEClass.eSuperTypes.add(getPrimitiveType());
											
				
				ReturnStatementEClass.eSuperTypes.add(getStatement());
											
				
				SingleVariableAccessEClass.eSuperTypes.add(getExpression());
											
				
				SingleVariableDeclarationEClass.eSuperTypes.add(getVariableDeclaration());
											
				
				StatementEClass.eSuperTypes.add(getASTNode());
											
				
				StringLiteralEClass.eSuperTypes.add(getExpression());
											
				
				SuperConstructorInvocationEClass.eSuperTypes.add(getStatement());
											
				SuperConstructorInvocationEClass.eSuperTypes.add(getAbstractMethodInvocation());
											
				
				SuperFieldAccessEClass.eSuperTypes.add(getAbstractTypeQualifiedExpression());
											
				
				SuperMethodInvocationEClass.eSuperTypes.add(getAbstractTypeQualifiedExpression());
											
				SuperMethodInvocationEClass.eSuperTypes.add(getAbstractMethodInvocation());
											
				
				SwitchCaseEClass.eSuperTypes.add(getStatement());
											
				
				SwitchStatementEClass.eSuperTypes.add(getStatement());
											
				
				SynchronizedStatementEClass.eSuperTypes.add(getStatement());
											
				
				TagElementEClass.eSuperTypes.add(getASTNode());
											
				
				TextElementEClass.eSuperTypes.add(getASTNode());
											
				
				ThisExpressionEClass.eSuperTypes.add(getAbstractTypeQualifiedExpression());
											
				
				ThrowStatementEClass.eSuperTypes.add(getStatement());
											
				
				TryStatementEClass.eSuperTypes.add(getStatement());
											
				
				TypeEClass.eSuperTypes.add(getNamedElement());
											
				
				TypeAccessEClass.eSuperTypes.add(getExpression());
											
				TypeAccessEClass.eSuperTypes.add(getNamespaceAccess());
											
				
				TypeDeclarationEClass.eSuperTypes.add(getAbstractTypeDeclaration());
											
				
				TypeDeclarationStatementEClass.eSuperTypes.add(getStatement());
											
				
				TypeLiteralEClass.eSuperTypes.add(getExpression());
											
				
				TypeParameterEClass.eSuperTypes.add(getType());
											
				
				UnresolvedItemEClass.eSuperTypes.add(getNamedElement());
											
				
				UnresolvedItemAccessEClass.eSuperTypes.add(getExpression());
											
				UnresolvedItemAccessEClass.eSuperTypes.add(getNamespaceAccess());
											
				
				UnresolvedAnnotationDeclarationEClass.eSuperTypes.add(getAnnotationTypeDeclaration());
											
				UnresolvedAnnotationDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedAnnotationTypeMemberDeclarationEClass.eSuperTypes.add(getAnnotationTypeMemberDeclaration());
											
				UnresolvedAnnotationTypeMemberDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedClassDeclarationEClass.eSuperTypes.add(getClassDeclaration());
											
				UnresolvedClassDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedEnumDeclarationEClass.eSuperTypes.add(getEnumDeclaration());
											
				UnresolvedEnumDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedInterfaceDeclarationEClass.eSuperTypes.add(getInterfaceDeclaration());
											
				UnresolvedInterfaceDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedLabeledStatementEClass.eSuperTypes.add(getLabeledStatement());
											
				UnresolvedLabeledStatementEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedMethodDeclarationEClass.eSuperTypes.add(getMethodDeclaration());
											
				UnresolvedMethodDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedSingleVariableDeclarationEClass.eSuperTypes.add(getSingleVariableDeclaration());
											
				UnresolvedSingleVariableDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedTypeEClass.eSuperTypes.add(getType());
											
				UnresolvedTypeEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedTypeDeclarationEClass.eSuperTypes.add(getAbstractTypeDeclaration());
											
				UnresolvedTypeDeclarationEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				UnresolvedVariableDeclarationFragmentEClass.eSuperTypes.add(getVariableDeclarationFragment());
											
				UnresolvedVariableDeclarationFragmentEClass.eSuperTypes.add(getUnresolvedItem());
											
				
				VariableDeclarationEClass.eSuperTypes.add(getNamedElement());
											
				
				VariableDeclarationExpressionEClass.eSuperTypes.add(getExpression());
											
				VariableDeclarationExpressionEClass.eSuperTypes.add(getAbstractVariablesContainer());
											
				
				VariableDeclarationFragmentEClass.eSuperTypes.add(getVariableDeclaration());
											
				
				VariableDeclarationStatementEClass.eSuperTypes.add(getStatement());
											
				VariableDeclarationStatementEClass.eSuperTypes.add(getAbstractVariablesContainer());
											
				
				WildCardTypeEClass.eSuperTypes.add(getType());
											
				
				WhileStatementEClass.eSuperTypes.add(getStatement());
											
				
				initEClass(AbstractMethodDeclarationEClass, typeof(AbstractMethodDeclaration), "AbstractMethodDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAbstractMethodDeclaration_Body(), 
					this.getBlock(), 
					null, 
					"body", 
					null, 
					0, 
					1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAbstractMethodDeclaration_Parameters(), 
					this.getSingleVariableDeclaration(), 
					getSingleVariableDeclaration_MethodDeclaration(), 
					"parameters", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractMethodDeclaration_ThrownExceptions(), 
					this.getTypeAccess(), 
					null, 
					"thrownExceptions", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractMethodDeclaration_TypeParameters(), 
					this.getTypeParameter(), 
					null, 
					"typeParameters", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractMethodDeclaration_UsagesInDocComments(), 
					this.getMethodRef(), 
					getMethodRef_Method(), 
					"usagesInDocComments", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAbstractMethodDeclaration_Usages(), 
					this.getAbstractMethodInvocation(), 
					getAbstractMethodInvocation_Method(), 
					"usages", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AbstractMethodInvocationEClass, typeof(AbstractMethodInvocation), "AbstractMethodInvocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAbstractMethodInvocation_Method(), 
					this.getAbstractMethodDeclaration(), 
					getAbstractMethodDeclaration_Usages(), 
					"method", 
					null, 
					1, 
					1, 
					typeof(AbstractMethodInvocation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAbstractMethodInvocation_Arguments(), 
					this.getExpression(), 
					null, 
					"arguments", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodInvocation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractMethodInvocation_TypeArguments(), 
					this.getTypeAccess(), 
					null, 
					"typeArguments", 
					null, 
					0, 
					-1, 
					typeof(AbstractMethodInvocation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(AbstractTypeDeclarationEClass, typeof(AbstractTypeDeclaration), "AbstractTypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAbstractTypeDeclaration_BodyDeclarations(), 
					this.getBodyDeclaration(), 
					getBodyDeclaration_AbstractTypeDeclaration(), 
					"bodyDeclarations", 
					null, 
					0, 
					-1, 
					typeof(AbstractTypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractTypeDeclaration_CommentsBeforeBody(), 
					this.getComment(), 
					null, 
					"commentsBeforeBody", 
					null, 
					0, 
					-1, 
					typeof(AbstractTypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractTypeDeclaration_CommentsAfterBody(), 
					this.getComment(), 
					null, 
					"commentsAfterBody", 
					null, 
					0, 
					-1, 
					typeof(AbstractTypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAbstractTypeDeclaration_Package(), 
					this.getPackage(), 
					getPackage_OwnedElements(), 
					"package", 
					null, 
					0, 
					1, 
					typeof(AbstractTypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAbstractTypeDeclaration_SuperInterfaces(), 
					this.getTypeAccess(), 
					null, 
					"superInterfaces", 
					null, 
					0, 
					-1, 
					typeof(AbstractTypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(AbstractTypeQualifiedExpressionEClass, typeof(AbstractTypeQualifiedExpression), "AbstractTypeQualifiedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAbstractTypeQualifiedExpression_Qualifier(), 
					this.getTypeAccess(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(AbstractTypeQualifiedExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AbstractVariablesContainerEClass, typeof(AbstractVariablesContainer), "AbstractVariablesContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAbstractVariablesContainer_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					0, 
					1, 
					typeof(AbstractVariablesContainer), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAbstractVariablesContainer_Fragments(), 
					this.getVariableDeclarationFragment(), 
					getVariableDeclarationFragment_VariablesContainer(), 
					"fragments", 
					null, 
					0, 
					-1, 
					typeof(AbstractVariablesContainer), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(AnnotationEClass, typeof(Annotation), "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAnnotation_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(Annotation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAnnotation_Values(), 
					this.getAnnotationMemberValuePair(), 
					null, 
					"values", 
					null, 
					0, 
					-1, 
					typeof(Annotation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(ArchiveEClass, typeof(Archive), "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getArchive_OriginalFilePath(), 
					ecorePackage.getEString(), 
					"originalFilePath", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getArchive_ClassFiles(), 
					this.getClassFile(), 
					null, 
					"classFiles", 
					null, 
					0, 
					-1, 
					typeof(Archive), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getArchive_Manifest(), 
					this.getManifest(), 
					null, 
					"manifest", 
					null, 
					0, 
					1, 
					typeof(Archive), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AssertStatementEClass, typeof(AssertStatement), "AssertStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAssertStatement_Message(), 
					this.getExpression(), 
					null, 
					"message", 
					null, 
					0, 
					1, 
					typeof(AssertStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAssertStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(AssertStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ASTNodeEClass, typeof(ASTNode), "ASTNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getASTNode_Comments(), 
					this.getComment(), 
					null, 
					"comments", 
					null, 
					0, 
					-1, 
					typeof(ASTNode), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getASTNode_OriginalCompilationUnit(), 
					this.getCompilationUnit(), 
					null, 
					"originalCompilationUnit", 
					null, 
					0, 
					1, 
					typeof(ASTNode), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getASTNode_OriginalClassFile(), 
					this.getClassFile(), 
					null, 
					"originalClassFile", 
					null, 
					0, 
					1, 
					typeof(ASTNode), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AnnotationMemberValuePairEClass, typeof(AnnotationMemberValuePair), "AnnotationMemberValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAnnotationMemberValuePair_Member(), 
					this.getAnnotationTypeMemberDeclaration(), 
					getAnnotationTypeMemberDeclaration_Usages(), 
					"member", 
					null, 
					0, 
					1, 
					typeof(AnnotationMemberValuePair), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAnnotationMemberValuePair_Value(), 
					this.getExpression(), 
					null, 
					"value", 
					null, 
					1, 
					1, 
					typeof(AnnotationMemberValuePair), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AnnotationTypeDeclarationEClass, typeof(AnnotationTypeDeclaration), "AnnotationTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(AnnotationTypeMemberDeclarationEClass, typeof(AnnotationTypeMemberDeclaration), "AnnotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAnnotationTypeMemberDeclaration_Default(), 
					this.getExpression(), 
					null, 
					"default_", 
					null, 
					0, 
					1, 
					typeof(AnnotationTypeMemberDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAnnotationTypeMemberDeclaration_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(AnnotationTypeMemberDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAnnotationTypeMemberDeclaration_Usages(), 
					this.getAnnotationMemberValuePair(), 
					getAnnotationMemberValuePair_Member(), 
					"usages", 
					null, 
					0, 
					-1, 
					typeof(AnnotationTypeMemberDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AnonymousClassDeclarationEClass, typeof(AnonymousClassDeclaration), "AnonymousClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getAnonymousClassDeclaration_BodyDeclarations(), 
					this.getBodyDeclaration(), 
					getBodyDeclaration_AnonymousClassDeclarationOwner(), 
					"bodyDeclarations", 
					null, 
					0, 
					-1, 
					typeof(AnonymousClassDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getAnonymousClassDeclaration_ClassInstanceCreation(), 
					this.getClassInstanceCreation(), 
					getClassInstanceCreation_AnonymousClassDeclaration(), 
					"classInstanceCreation", 
					null, 
					0, 
					1, 
					typeof(AnonymousClassDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ArrayAccessEClass, typeof(ArrayAccess), "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getArrayAccess_Array(), 
					this.getExpression(), 
					null, 
					"array", 
					null, 
					1, 
					1, 
					typeof(ArrayAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getArrayAccess_Index(), 
					this.getExpression(), 
					null, 
					"index", 
					null, 
					1, 
					1, 
					typeof(ArrayAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ArrayCreationEClass, typeof(ArrayCreation), "ArrayCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getArrayCreation_Dimensions(), 
					this.getExpression(), 
					null, 
					"dimensions", 
					null, 
					0, 
					-1, 
					typeof(ArrayCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getArrayCreation_Initializer(), 
					this.getArrayInitializer(), 
					null, 
					"initializer", 
					null, 
					0, 
					1, 
					typeof(ArrayCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getArrayCreation_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(ArrayCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ArrayInitializerEClass, typeof(ArrayInitializer), "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getArrayInitializer_Expressions(), 
					this.getExpression(), 
					null, 
					"expressions", 
					null, 
					0, 
					-1, 
					typeof(ArrayInitializer), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(ArrayLengthAccessEClass, typeof(ArrayLengthAccess), "ArrayLengthAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getArrayLengthAccess_Array(), 
					this.getExpression(), 
					null, 
					"array", 
					null, 
					1, 
					1, 
					typeof(ArrayLengthAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ArrayTypeEClass, typeof(ArrayType), "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getArrayType_Dimensions(), 
					ecorePackage.getEInt(), 
					"dimensions", 
					"0", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getArrayType_ElementType(), 
					this.getTypeAccess(), 
					null, 
					"elementType", 
					null, 
					1, 
					1, 
					typeof(ArrayType), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(AssignmentEClass, typeof(Assignment), "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getAssignment_Operator(), 
					this.getAssignmentKind(), 
					"operator_", 
					"=", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getAssignment_LeftHandSide(), 
					this.getExpression(), 
					null, 
					"leftHandSide", 
					null, 
					1, 
					1, 
					typeof(Assignment), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getAssignment_RightHandSide(), 
					this.getExpression(), 
					null, 
					"rightHandSide", 
					null, 
					1, 
					1, 
					typeof(Assignment), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(BodyDeclarationEClass, typeof(BodyDeclaration), "BodyDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getBodyDeclaration_AbstractTypeDeclaration(), 
					this.getAbstractTypeDeclaration(), 
					getAbstractTypeDeclaration_BodyDeclarations(), 
					"abstractTypeDeclaration", 
					null, 
					0, 
					1, 
					typeof(BodyDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getBodyDeclaration_Annotations(), 
					this.getAnnotation(), 
					null, 
					"annotations", 
					null, 
					0, 
					-1, 
					typeof(BodyDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getBodyDeclaration_AnonymousClassDeclarationOwner(), 
					this.getAnonymousClassDeclaration(), 
					getAnonymousClassDeclaration_BodyDeclarations(), 
					"anonymousClassDeclarationOwner", 
					null, 
					0, 
					1, 
					typeof(BodyDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getBodyDeclaration_Modifier(), 
					this.getModifier(), 
					getModifier_BodyDeclaration(), 
					"modifier", 
					null, 
					0, 
					1, 
					typeof(BodyDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(BooleanLiteralEClass, typeof(BooleanLiteral), "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getBooleanLiteral_Value(), 
					ecorePackage.getEBoolean(), 
					"value", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(BlockCommentEClass, typeof(BlockComment), "BlockComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(BlockEClass, typeof(Block), "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getBlock_Statements(), 
					this.getStatement(), 
					null, 
					"statements", 
					null, 
					0, 
					-1, 
					typeof(Block), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(BreakStatementEClass, typeof(BreakStatement), "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getBreakStatement_Label(), 
					this.getLabeledStatement(), 
					getLabeledStatement_UsagesInBreakStatements(), 
					"label", 
					null, 
					0, 
					1, 
					typeof(BreakStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(CastExpressionEClass, typeof(CastExpression), "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getCastExpression_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(CastExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getCastExpression_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(CastExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(CatchClauseEClass, typeof(CatchClause), "CatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getCatchClause_Exception(), 
					this.getSingleVariableDeclaration(), 
					getSingleVariableDeclaration_CatchClause(), 
					"exception", 
					null, 
					1, 
					1, 
					typeof(CatchClause), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getCatchClause_Body(), 
					this.getBlock(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(CatchClause), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(CharacterLiteralEClass, typeof(CharacterLiteral), "CharacterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getCharacterLiteral_EscapedValue(), 
					ecorePackage.getEString(), 
					"escapedValue", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(ClassFileEClass, typeof(ClassFile), "ClassFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getClassFile_OriginalFilePath(), 
					ecorePackage.getEString(), 
					"originalFilePath", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getClassFile_Type(), 
					this.getAbstractTypeDeclaration(), 
					null, 
					"type", 
					null, 
					0, 
					1, 
					typeof(ClassFile), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getClassFile_AttachedSource(), 
					this.getCompilationUnit(), 
					null, 
					"attachedSource", 
					null, 
					0, 
					1, 
					typeof(ClassFile), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getClassFile_Package(), 
					this.getPackage(), 
					null, 
					"package", 
					null, 
					0, 
					1, 
					typeof(ClassFile), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ClassInstanceCreationEClass, typeof(ClassInstanceCreation), "ClassInstanceCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getClassInstanceCreation_AnonymousClassDeclaration(), 
					this.getAnonymousClassDeclaration(), 
					getAnonymousClassDeclaration_ClassInstanceCreation(), 
					"anonymousClassDeclaration", 
					null, 
					0, 
					1, 
					typeof(ClassInstanceCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getClassInstanceCreation_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(ClassInstanceCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getClassInstanceCreation_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(ClassInstanceCreation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ConstructorDeclarationEClass, typeof(ConstructorDeclaration), "ConstructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ConditionalExpressionEClass, typeof(ConditionalExpression), "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getConditionalExpression_ElseExpression(), 
					this.getExpression(), 
					null, 
					"elseExpression", 
					null, 
					1, 
					1, 
					typeof(ConditionalExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getConditionalExpression_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(ConditionalExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getConditionalExpression_ThenExpression(), 
					this.getExpression(), 
					null, 
					"thenExpression", 
					null, 
					1, 
					1, 
					typeof(ConditionalExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ConstructorInvocationEClass, typeof(ConstructorInvocation), "ConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ClassDeclarationEClass, typeof(ClassDeclaration), "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getClassDeclaration_SuperClass(), 
					this.getTypeAccess(), 
					null, 
					"superClass", 
					null, 
					0, 
					1, 
					typeof(ClassDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(CommentEClass, typeof(Comment), "Comment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getComment_Content(), 
					ecorePackage.getEString(), 
					"content", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getComment_EnclosedByParent(), 
					ecorePackage.getEBoolean(), 
					"enclosedByParent", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getComment_PrefixOfParent(), 
					ecorePackage.getEBoolean(), 
					"prefixOfParent", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(CompilationUnitEClass, typeof(CompilationUnit), "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getCompilationUnit_OriginalFilePath(), 
					ecorePackage.getEString(), 
					"originalFilePath", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getCompilationUnit_CommentList(), 
					this.getComment(), 
					null, 
					"commentList", 
					null, 
					0, 
					-1, 
					typeof(CompilationUnit), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getCompilationUnit_Imports(), 
					this.getImportDeclaration(), 
					null, 
					"imports", 
					null, 
					0, 
					-1, 
					typeof(CompilationUnit), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getCompilationUnit_Package(), 
					this.getPackage(), 
					null, 
					"package", 
					null, 
					0, 
					1, 
					typeof(CompilationUnit), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getCompilationUnit_Types(), 
					this.getAbstractTypeDeclaration(), 
					null, 
					"types", 
					null, 
					0, 
					-1, 
					typeof(CompilationUnit), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(ContinueStatementEClass, typeof(ContinueStatement), "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getContinueStatement_Label(), 
					this.getLabeledStatement(), 
					getLabeledStatement_UsagesInContinueStatements(), 
					"label", 
					null, 
					0, 
					1, 
					typeof(ContinueStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(DoStatementEClass, typeof(DoStatement), "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getDoStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(DoStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getDoStatement_Body(), 
					this.getStatement(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(DoStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(EmptyStatementEClass, typeof(EmptyStatement), "EmptyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(EnhancedForStatementEClass, typeof(EnhancedForStatement), "EnhancedForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getEnhancedForStatement_Body(), 
					this.getStatement(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(EnhancedForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getEnhancedForStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(EnhancedForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getEnhancedForStatement_Parameter(), 
					this.getSingleVariableDeclaration(), 
					getSingleVariableDeclaration_EnhancedForStatement(), 
					"parameter", 
					null, 
					1, 
					1, 
					typeof(EnhancedForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(EnumConstantDeclarationEClass, typeof(EnumConstantDeclaration), "EnumConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getEnumConstantDeclaration_AnonymousClassDeclaration(), 
					this.getAnonymousClassDeclaration(), 
					null, 
					"anonymousClassDeclaration", 
					null, 
					0, 
					1, 
					typeof(EnumConstantDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getEnumConstantDeclaration_Arguments(), 
					this.getExpression(), 
					null, 
					"arguments", 
					null, 
					0, 
					-1, 
					typeof(EnumConstantDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(EnumDeclarationEClass, typeof(EnumDeclaration), "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getEnumDeclaration_EnumConstants(), 
					this.getEnumConstantDeclaration(), 
					null, 
					"enumConstants", 
					null, 
					0, 
					-1, 
					typeof(EnumDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(ExpressionEClass, typeof(Expression), "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ExpressionStatementEClass, typeof(ExpressionStatement), "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getExpressionStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(ExpressionStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(FieldAccessEClass, typeof(FieldAccess), "FieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getFieldAccess_Field(), 
					this.getSingleVariableAccess(), 
					null, 
					"field", 
					null, 
					1, 
					1, 
					typeof(FieldAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getFieldAccess_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(FieldAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(FieldDeclarationEClass, typeof(FieldDeclaration), "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ForStatementEClass, typeof(ForStatement), "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getForStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(ForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getForStatement_Updaters(), 
					this.getExpression(), 
					null, 
					"updaters", 
					null, 
					0, 
					-1, 
					typeof(ForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getForStatement_Initializers(), 
					this.getExpression(), 
					null, 
					"initializers", 
					null, 
					0, 
					-1, 
					typeof(ForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getForStatement_Body(), 
					this.getStatement(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(ForStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(IfStatementEClass, typeof(IfStatement), "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getIfStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(IfStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getIfStatement_ThenStatement(), 
					this.getStatement(), 
					null, 
					"thenStatement", 
					null, 
					1, 
					1, 
					typeof(IfStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getIfStatement_ElseStatement(), 
					this.getStatement(), 
					null, 
					"elseStatement", 
					null, 
					0, 
					1, 
					typeof(IfStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ImportDeclarationEClass, typeof(ImportDeclaration), "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getImportDeclaration_Static(), 
					ecorePackage.getEBoolean(), 
					"static_", 
					"false", 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getImportDeclaration_ImportedElement(), 
					this.getNamedElement(), 
					getNamedElement_UsagesInImports(), 
					"importedElement", 
					null, 
					1, 
					1, 
					typeof(ImportDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(InfixExpressionEClass, typeof(InfixExpression), "InfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getInfixExpression_Operator(), 
					this.getInfixExpressionKind(), 
					"operator_", 
					"*", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getInfixExpression_RightOperand(), 
					this.getExpression(), 
					null, 
					"rightOperand", 
					null, 
					1, 
					1, 
					typeof(InfixExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getInfixExpression_LeftOperand(), 
					this.getExpression(), 
					null, 
					"leftOperand", 
					null, 
					1, 
					1, 
					typeof(InfixExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getInfixExpression_ExtendedOperands(), 
					this.getExpression(), 
					null, 
					"extendedOperands", 
					null, 
					0, 
					-1, 
					typeof(InfixExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(InitializerEClass, typeof(Initializer), "Initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getInitializer_Body(), 
					this.getBlock(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(Initializer), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(InstanceofExpressionEClass, typeof(InstanceofExpression), "InstanceofExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getInstanceofExpression_RightOperand(), 
					this.getTypeAccess(), 
					null, 
					"rightOperand", 
					null, 
					1, 
					1, 
					typeof(InstanceofExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getInstanceofExpression_LeftOperand(), 
					this.getExpression(), 
					null, 
					"leftOperand", 
					null, 
					1, 
					1, 
					typeof(InstanceofExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(InterfaceDeclarationEClass, typeof(InterfaceDeclaration), "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(JavadocEClass, typeof(Javadoc), "Javadoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getJavadoc_Tags(), 
					this.getTagElement(), 
					null, 
					"tags", 
					null, 
					0, 
					-1, 
					typeof(Javadoc), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(LabeledStatementEClass, typeof(LabeledStatement), "LabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getLabeledStatement_Body(), 
					this.getStatement(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(LabeledStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getLabeledStatement_UsagesInBreakStatements(), 
					this.getBreakStatement(), 
					getBreakStatement_Label(), 
					"usagesInBreakStatements", 
					null, 
					0, 
					-1, 
					typeof(LabeledStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getLabeledStatement_UsagesInContinueStatements(), 
					this.getContinueStatement(), 
					getContinueStatement_Label(), 
					"usagesInContinueStatements", 
					null, 
					0, 
					-1, 
					typeof(LabeledStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(LineCommentEClass, typeof(LineComment), "LineComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ManifestEClass, typeof(Manifest), "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getManifest_MainAttributes(), 
					this.getManifestAttribute(), 
					null, 
					"mainAttributes", 
					null, 
					0, 
					-1, 
					typeof(Manifest), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getManifest_EntryAttributes(), 
					this.getManifestEntry(), 
					null, 
					"entryAttributes", 
					null, 
					0, 
					-1, 
					typeof(Manifest), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ManifestAttributeEClass, typeof(ManifestAttribute), "ManifestAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getManifestAttribute_Key(), 
					ecorePackage.getEString(), 
					"key", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getManifestAttribute_Value(), 
					ecorePackage.getEString(), 
					"value", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(ManifestEntryEClass, typeof(ManifestEntry), "ManifestEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getManifestEntry_Name(), 
					ecorePackage.getEString(), 
					"name", 
					null, 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getManifestEntry_Attributes(), 
					this.getManifestAttribute(), 
					null, 
					"attributes", 
					null, 
					0, 
					-1, 
					typeof(ManifestEntry), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(MemberRefEClass, typeof(MemberRef), "MemberRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getMemberRef_Member(), 
					this.getNamedElement(), 
					null, 
					"member", 
					null, 
					1, 
					1, 
					typeof(MemberRef), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getMemberRef_Qualifier(), 
					this.getTypeAccess(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(MemberRef), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(MethodDeclarationEClass, typeof(MethodDeclaration), "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getMethodDeclaration_ExtraArrayDimensions(), 
					ecorePackage.getEInt(), 
					"extraArrayDimensions", 
					"0", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getMethodDeclaration_ReturnType(), 
					this.getTypeAccess(), 
					null, 
					"returnType", 
					null, 
					0, 
					1, 
					typeof(MethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getMethodDeclaration_RedefinedMethodDeclaration(), 
					this.getMethodDeclaration(), 
					getMethodDeclaration_Redefinitions(), 
					"redefinedMethodDeclaration", 
					null, 
					0, 
					1, 
					typeof(MethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getMethodDeclaration_Redefinitions(), 
					this.getMethodDeclaration(), 
					getMethodDeclaration_RedefinedMethodDeclaration(), 
					"redefinitions", 
					null, 
					0, 
					-1, 
					typeof(MethodDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(MethodInvocationEClass, typeof(MethodInvocation), "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getMethodInvocation_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(MethodInvocation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(MethodRefEClass, typeof(MethodRef), "MethodRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getMethodRef_Method(), 
					this.getAbstractMethodDeclaration(), 
					getAbstractMethodDeclaration_UsagesInDocComments(), 
					"method", 
					null, 
					1, 
					1, 
					typeof(MethodRef), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getMethodRef_Qualifier(), 
					this.getTypeAccess(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(MethodRef), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getMethodRef_Parameters(), 
					this.getMethodRefParameter(), 
					null, 
					"parameters", 
					null, 
					0, 
					-1, 
					typeof(MethodRef), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(MethodRefParameterEClass, typeof(MethodRefParameter), "MethodRefParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getMethodRefParameter_Name(), 
					ecorePackage.getEString(), 
					"name", 
					null, 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getMethodRefParameter_Varargs(), 
					ecorePackage.getEBoolean(), 
					"varargs", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getMethodRefParameter_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(MethodRefParameter), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ModelEClass, typeof(Model), "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getModel_Name(), 
					ecorePackage.getEString(), 
					"name", 
					null, 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getModel_OwnedElements(), 
					this.getPackage(), 
					getPackage_Model(), 
					"ownedElements", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModel_OrphanTypes(), 
					this.getType(), 
					null, 
					"orphanTypes", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModel_UnresolvedItems(), 
					this.getUnresolvedItem(), 
					null, 
					"unresolvedItems", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModel_CompilationUnits(), 
					this.getCompilationUnit(), 
					null, 
					"compilationUnits", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModel_ClassFiles(), 
					this.getClassFile(), 
					null, 
					"classFiles", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModel_Archives(), 
					this.getArchive(), 
					null, 
					"archives", 
					null, 
					0, 
					-1, 
					typeof(Model), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ModifierEClass, typeof(Modifier), "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getModifier_Visibility(), 
					this.getVisibilityKind(), 
					"visibility", 
					"none", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Inheritance(), 
					this.getInheritanceKind(), 
					"inheritance", 
					"none", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Static(), 
					ecorePackage.getEBoolean(), 
					"static_", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Transient(), 
					ecorePackage.getEBoolean(), 
					"transient", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Volatile(), 
					ecorePackage.getEBoolean(), 
					"volatile_", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Native(), 
					ecorePackage.getEBoolean(), 
					"native", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Strictfp(), 
					ecorePackage.getEBoolean(), 
					"strictfp", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getModifier_Synchronized(), 
					ecorePackage.getEBoolean(), 
					"synchronized", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getModifier_BodyDeclaration(), 
					this.getBodyDeclaration(), 
					getBodyDeclaration_Modifier(), 
					"bodyDeclaration", 
					null, 
					0, 
					1, 
					typeof(Modifier), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModifier_SingleVariableDeclaration(), 
					this.getSingleVariableDeclaration(), 
					getSingleVariableDeclaration_Modifier(), 
					"singleVariableDeclaration", 
					null, 
					0, 
					1, 
					typeof(Modifier), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModifier_VariableDeclarationStatement(), 
					this.getVariableDeclarationStatement(), 
					getVariableDeclarationStatement_Modifier(), 
					"variableDeclarationStatement", 
					null, 
					0, 
					1, 
					typeof(Modifier), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getModifier_VariableDeclarationExpression(), 
					this.getVariableDeclarationExpression(), 
					getVariableDeclarationExpression_Modifier(), 
					"variableDeclarationExpression", 
					null, 
					0, 
					1, 
					typeof(Modifier), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(NamedElementEClass, typeof(NamedElement), "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getNamedElement_Name(), 
					ecorePackage.getEString(), 
					"name", 
					null, 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEAttribute(getNamedElement_Proxy(), 
					ecorePackage.getEBoolean(), 
					"proxy", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getNamedElement_UsagesInImports(), 
					this.getImportDeclaration(), 
					getImportDeclaration_ImportedElement(), 
					"usagesInImports", 
					null, 
					0, 
					-1, 
					typeof(NamedElement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(NamespaceAccessEClass, typeof(NamespaceAccess), "NamespaceAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(NumberLiteralEClass, typeof(NumberLiteral), "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getNumberLiteral_TokenValue(), 
					ecorePackage.getEString(), 
					"tokenValue", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(NullLiteralEClass, typeof(NullLiteral), "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PackageEClass, typeof(Package), "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getPackage_OwnedElements(), 
					this.getAbstractTypeDeclaration(), 
					getAbstractTypeDeclaration_Package(), 
					"ownedElements", 
					null, 
					0, 
					-1, 
					typeof(Package), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getPackage_Model(), 
					this.getModel(), 
					getModel_OwnedElements(), 
					"model", 
					null, 
					0, 
					1, 
					typeof(Package), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getPackage_OwnedPackages(), 
					this.getPackage(), 
					getPackage_Package(), 
					"ownedPackages", 
					null, 
					0, 
					-1, 
					typeof(Package), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getPackage_Package(), 
					this.getPackage(), 
					getPackage_OwnedPackages(), 
					"package", 
					null, 
					0, 
					1, 
					typeof(Package), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getPackage_UsagesInPackageAccess(), 
					this.getPackageAccess(), 
					getPackageAccess_Package(), 
					"usagesInPackageAccess", 
					null, 
					0, 
					-1, 
					typeof(Package), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(PackageAccessEClass, typeof(PackageAccess), "PackageAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getPackageAccess_Package(), 
					this.getPackage(), 
					getPackage_UsagesInPackageAccess(), 
					"package", 
					null, 
					1, 
					1, 
					typeof(PackageAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getPackageAccess_Qualifier(), 
					this.getPackageAccess(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(PackageAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(ParameterizedTypeEClass, typeof(ParameterizedType), "ParameterizedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getParameterizedType_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(ParameterizedType), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getParameterizedType_TypeArguments(), 
					this.getTypeAccess(), 
					null, 
					"typeArguments", 
					null, 
					0, 
					-1, 
					typeof(ParameterizedType), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(ParenthesizedExpressionEClass, typeof(ParenthesizedExpression), "ParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getParenthesizedExpression_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(ParenthesizedExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(PostfixExpressionEClass, typeof(PostfixExpression), "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getPostfixExpression_Operator(), 
					this.getPostfixExpressionKind(), 
					"operator_", 
					"++", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getPostfixExpression_Operand(), 
					this.getExpression(), 
					null, 
					"operand", 
					null, 
					1, 
					1, 
					typeof(PostfixExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(PrefixExpressionEClass, typeof(PrefixExpression), "PrefixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getPrefixExpression_Operator(), 
					this.getPrefixExpressionKind(), 
					"operator_", 
					"++", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getPrefixExpression_Operand(), 
					this.getExpression(), 
					null, 
					"operand", 
					null, 
					1, 
					1, 
					typeof(PrefixExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(PrimitiveTypeEClass, typeof(PrimitiveType), "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeBooleanEClass, typeof(PrimitiveTypeBoolean), "PrimitiveTypeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeByteEClass, typeof(PrimitiveTypeByte), "PrimitiveTypeByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeCharEClass, typeof(PrimitiveTypeChar), "PrimitiveTypeChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeDoubleEClass, typeof(PrimitiveTypeDouble), "PrimitiveTypeDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeShortEClass, typeof(PrimitiveTypeShort), "PrimitiveTypeShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeFloatEClass, typeof(PrimitiveTypeFloat), "PrimitiveTypeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeIntEClass, typeof(PrimitiveTypeInt), "PrimitiveTypeInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeLongEClass, typeof(PrimitiveTypeLong), "PrimitiveTypeLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(PrimitiveTypeVoidEClass, typeof(PrimitiveTypeVoid), "PrimitiveTypeVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ReturnStatementEClass, typeof(ReturnStatement), "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getReturnStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(ReturnStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(SingleVariableAccessEClass, typeof(SingleVariableAccess), "SingleVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getSingleVariableAccess_Variable(), 
					this.getVariableDeclaration(), 
					getVariableDeclaration_UsageInVariableAccess(), 
					"variable", 
					null, 
					1, 
					1, 
					typeof(SingleVariableAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSingleVariableAccess_Qualifier(), 
					this.getExpression(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(SingleVariableAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(SingleVariableDeclarationEClass, typeof(SingleVariableDeclaration), "SingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getSingleVariableDeclaration_Varargs(), 
					ecorePackage.getEBoolean(), 
					"varargs", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getSingleVariableDeclaration_Modifier(), 
					this.getModifier(), 
					getModifier_SingleVariableDeclaration(), 
					"modifier", 
					null, 
					0, 
					1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSingleVariableDeclaration_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSingleVariableDeclaration_Annotations(), 
					this.getAnnotation(), 
					null, 
					"annotations", 
					null, 
					0, 
					-1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEReference(
					getSingleVariableDeclaration_MethodDeclaration(), 
					this.getAbstractMethodDeclaration(), 
					getAbstractMethodDeclaration_Parameters(), 
					"methodDeclaration", 
					null, 
					0, 
					1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSingleVariableDeclaration_CatchClause(), 
					this.getCatchClause(), 
					getCatchClause_Exception(), 
					"catchClause", 
					null, 
					0, 
					1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSingleVariableDeclaration_EnhancedForStatement(), 
					this.getEnhancedForStatement(), 
					getEnhancedForStatement_Parameter(), 
					"enhancedForStatement", 
					null, 
					0, 
					1, 
					typeof(SingleVariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(StatementEClass, typeof(Statement), "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(StringLiteralEClass, typeof(StringLiteral), "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getStringLiteral_EscapedValue(), 
					ecorePackage.getEString(), 
					"escapedValue", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(SuperConstructorInvocationEClass, typeof(SuperConstructorInvocation), "SuperConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getSuperConstructorInvocation_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(SuperConstructorInvocation), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(SuperFieldAccessEClass, typeof(SuperFieldAccess), "SuperFieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getSuperFieldAccess_Field(), 
					this.getSingleVariableAccess(), 
					null, 
					"field", 
					null, 
					1, 
					1, 
					typeof(SuperFieldAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(SuperMethodInvocationEClass, typeof(SuperMethodInvocation), "SuperMethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(SwitchCaseEClass, typeof(SwitchCase), "SwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getSwitchCase_Default(), 
					ecorePackage.getEBoolean(), 
					"default_", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getSwitchCase_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					0, 
					1, 
					typeof(SwitchCase), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(SwitchStatementEClass, typeof(SwitchStatement), "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getSwitchStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(SwitchStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSwitchStatement_Statements(), 
					this.getStatement(), 
					null, 
					"statements", 
					null, 
					0, 
					-1, 
					typeof(SwitchStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(SynchronizedStatementEClass, typeof(SynchronizedStatement), "SynchronizedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getSynchronizedStatement_Body(), 
					this.getBlock(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(SynchronizedStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getSynchronizedStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(SynchronizedStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TagElementEClass, typeof(TagElement), "TagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getTagElement_TagName(), 
					ecorePackage.getEString(), 
					"tagName", 
					null, 
					0, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getTagElement_Fragments(), 
					this.getASTNode(), 
					null, 
					"fragments", 
					null, 
					0, 
					-1, 
					typeof(TagElement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(TextElementEClass, typeof(TextElement), "TextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getTextElement_Text(), 
					ecorePackage.getEString(), 
					"text", 
					null, 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEClass(ThisExpressionEClass, typeof(ThisExpression), "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(ThrowStatementEClass, typeof(ThrowStatement), "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getThrowStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(ThrowStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TryStatementEClass, typeof(TryStatement), "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTryStatement_Body(), 
					this.getBlock(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(TryStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getTryStatement_Finally(), 
					this.getBlock(), 
					null, 
					"finally_", 
					null, 
					0, 
					1, 
					typeof(TryStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getTryStatement_CatchClauses(), 
					this.getCatchClause(), 
					null, 
					"catchClauses", 
					null, 
					0, 
					-1, 
					typeof(TryStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(TypeEClass, typeof(Type), "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getType_UsagesInTypeAccess(), 
					this.getTypeAccess(), 
					getTypeAccess_Type(), 
					"usagesInTypeAccess", 
					null, 
					0, 
					-1, 
					typeof(Type), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TypeAccessEClass, typeof(TypeAccess), "TypeAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTypeAccess_Type(), 
					this.getType(), 
					getType_UsagesInTypeAccess(), 
					"type", 
					null, 
					1, 
					1, 
					typeof(TypeAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getTypeAccess_Qualifier(), 
					this.getNamespaceAccess(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(TypeAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TypeDeclarationEClass, typeof(TypeDeclaration), "TypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTypeDeclaration_TypeParameters(), 
					this.getTypeParameter(), 
					null, 
					"typeParameters", 
					null, 
					0, 
					-1, 
					typeof(TypeDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(TypeDeclarationStatementEClass, typeof(TypeDeclarationStatement), "TypeDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTypeDeclarationStatement_Declaration(), 
					this.getAbstractTypeDeclaration(), 
					null, 
					"declaration", 
					null, 
					1, 
					1, 
					typeof(TypeDeclarationStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TypeLiteralEClass, typeof(TypeLiteral), "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTypeLiteral_Type(), 
					this.getTypeAccess(), 
					null, 
					"type", 
					null, 
					1, 
					1, 
					typeof(TypeLiteral), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(TypeParameterEClass, typeof(TypeParameter), "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getTypeParameter_Bounds(), 
					this.getTypeAccess(), 
					null, 
					"bounds", 
					null, 
					0, 
					-1, 
					typeof(TypeParameter), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(UnresolvedItemEClass, typeof(UnresolvedItem), "UnresolvedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedItemAccessEClass, typeof(UnresolvedItemAccess), "UnresolvedItemAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getUnresolvedItemAccess_Element(), 
					this.getUnresolvedItem(), 
					null, 
					"element", 
					null, 
					0, 
					1, 
					typeof(UnresolvedItemAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getUnresolvedItemAccess_Qualifier(), 
					this.getASTNode(), 
					null, 
					"qualifier", 
					null, 
					0, 
					1, 
					typeof(UnresolvedItemAccess), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(UnresolvedAnnotationDeclarationEClass, typeof(UnresolvedAnnotationDeclaration), "UnresolvedAnnotationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedAnnotationTypeMemberDeclarationEClass, typeof(UnresolvedAnnotationTypeMemberDeclaration), "UnresolvedAnnotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedClassDeclarationEClass, typeof(UnresolvedClassDeclaration), "UnresolvedClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedEnumDeclarationEClass, typeof(UnresolvedEnumDeclaration), "UnresolvedEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedInterfaceDeclarationEClass, typeof(UnresolvedInterfaceDeclaration), "UnresolvedInterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedLabeledStatementEClass, typeof(UnresolvedLabeledStatement), "UnresolvedLabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedMethodDeclarationEClass, typeof(UnresolvedMethodDeclaration), "UnresolvedMethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedSingleVariableDeclarationEClass, typeof(UnresolvedSingleVariableDeclaration), "UnresolvedSingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedTypeEClass, typeof(UnresolvedType), "UnresolvedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedTypeDeclarationEClass, typeof(UnresolvedTypeDeclaration), "UnresolvedTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(UnresolvedVariableDeclarationFragmentEClass, typeof(UnresolvedVariableDeclarationFragment), "UnresolvedVariableDeclarationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEClass(VariableDeclarationEClass, typeof(VariableDeclaration), "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getVariableDeclaration_ExtraArrayDimensions(), 
					ecorePackage.getEInt(), 
					"extraArrayDimensions", 
					"0", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getVariableDeclaration_Initializer(), 
					this.getExpression(), 
					null, 
					"initializer", 
					null, 
					0, 
					1, 
					typeof(VariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getVariableDeclaration_UsageInVariableAccess(), 
					this.getSingleVariableAccess(), 
					getSingleVariableAccess_Variable(), 
					"usageInVariableAccess", 
					null, 
					0, 
					-1, 
					typeof(VariableDeclaration), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(VariableDeclarationExpressionEClass, typeof(VariableDeclarationExpression), "VariableDeclarationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getVariableDeclarationExpression_Modifier(), 
					this.getModifier(), 
					getModifier_VariableDeclarationExpression(), 
					"modifier", 
					null, 
					0, 
					1, 
					typeof(VariableDeclarationExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getVariableDeclarationExpression_Annotations(), 
					this.getAnnotation(), 
					null, 
					"annotations", 
					null, 
					0, 
					-1, 
					typeof(VariableDeclarationExpression), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(VariableDeclarationFragmentEClass, typeof(VariableDeclarationFragment), "VariableDeclarationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getVariableDeclarationFragment_VariablesContainer(), 
					this.getAbstractVariablesContainer(), 
					getAbstractVariablesContainer_Fragments(), 
					"variablesContainer", 
					null, 
					0, 
					1, 
					typeof(VariableDeclarationFragment), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(VariableDeclarationStatementEClass, typeof(VariableDeclarationStatement), "VariableDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getVariableDeclarationStatement_ExtraArrayDimensions(), 
					ecorePackage.getEInt(), 
					"extraArrayDimensions", 
					"0", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getVariableDeclarationStatement_Modifier(), 
					this.getModifier(), 
					getModifier_VariableDeclarationStatement(), 
					"modifier", 
					null, 
					0, 
					1, 
					typeof(VariableDeclarationStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getVariableDeclarationStatement_Annotations(), 
					this.getAnnotation(), 
					null, 
					"annotations", 
					null, 
					0, 
					-1, 
					typeof(VariableDeclarationStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					IS_ORDERED);
				initEClass(WildCardTypeEClass, typeof(WildCardType), "WildCardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				initEAttribute(getWildCardType_UpperBound(), 
					ecorePackage.getEBoolean(), 
					"upperBound", 
					"false", 
					1, 
					1, 
					typeof(EAttribute), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					!IS_UNSETTABLE, 
					!IS_ID, 
					!IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				
				initEReference(
					getWildCardType_Bound(), 
					this.getTypeAccess(), 
					null, 
					"bound", 
					null, 
					0, 
					1, 
					typeof(WildCardType), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEClass(WhileStatementEClass, typeof(WhileStatement), "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
				
				
				initEReference(
					getWhileStatement_Expression(), 
					this.getExpression(), 
					null, 
					"expression", 
					null, 
					1, 
					1, 
					typeof(WhileStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
				initEReference(
					getWhileStatement_Body(), 
					this.getStatement(), 
					null, 
					"body", 
					null, 
					1, 
					1, 
					typeof(WhileStatement), 
					!IS_TRANSIENT, 
					!IS_VOLATILE, 
					IS_CHANGEABLE, 
					IS_COMPOSITE, 
					IS_RESOLVE_PROXIES, 
					!IS_UNSETTABLE, 
					IS_UNIQUE, 
					!IS_DERIVED, 
					!IS_ORDERED);
			initEEnum(AssignmentKindEEnum, typeof(AssignmentKind), "AssignmentKind");
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.PLUS_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.MINUS_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.TIMES_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.DIVIDE_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_AND_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_OR_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_XOR_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.REMAINDER_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.LEFT_SHIFT_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.RIGHT_SHIFT_SIGNED_ASSIGN);
			//addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.RIGHT_SHIFT_UNSIGNED_ASSIGN);
			initEEnum(InfixExpressionKindEEnum, typeof(InfixExpressionKind), "InfixExpressionKind");
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.TIMES);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.DIVIDE);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.REMAINDER);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.PLUS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.MINUS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LEFT_SHIFT);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.RIGHT_SHIFT_SIGNED);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.RIGHT_SHIFT_UNSIGNED);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LESS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.GREATER);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LESS_EQUALS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.GREATER_EQUALS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.EQUALS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.NOT_EQUALS);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.XOR);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.AND);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.OR);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.CONDITIONAL_AND);
			//addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.CONDITIONAL_OR);
			initEEnum(InheritanceKindEEnum, typeof(InheritanceKind), "InheritanceKind");
			//addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.NONE);
			//addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.ABSTRACT);
			//addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.FINAL);
			initEEnum(PostfixExpressionKindEEnum, typeof(PostfixExpressionKind), "PostfixExpressionKind");
			//addEEnumLiteral(PostfixExpressionKindEEnum, PostfixExpressionKind.INCREMENT);
			//addEEnumLiteral(PostfixExpressionKindEEnum, PostfixExpressionKind.DECREMENT);
			initEEnum(PrefixExpressionKindEEnum, typeof(PrefixExpressionKind), "PrefixExpressionKind");
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.INCREMENT);
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.DECREMENT);
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.PLUS);
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.MINUS);
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.COMPLEMENT);
			//addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.NOT);
			initEEnum(VisibilityKindEEnum, typeof(VisibilityKind), "VisibilityKind");
			//addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.NONE);
			//addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PUBLIC);
			//addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PRIVATE);
			//addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PROTECTED);
	        }
	        
			
			private EClass AbstractMethodDeclarationEClass = null;
			private EClass AbstractMethodInvocationEClass = null;
			private EClass AbstractTypeDeclarationEClass = null;
			private EClass AbstractTypeQualifiedExpressionEClass = null;
			private EClass AbstractVariablesContainerEClass = null;
			private EClass AnnotationEClass = null;
			private EClass ArchiveEClass = null;
			private EClass AssertStatementEClass = null;
			private EClass ASTNodeEClass = null;
			private EClass AnnotationMemberValuePairEClass = null;
			private EClass AnnotationTypeDeclarationEClass = null;
			private EClass AnnotationTypeMemberDeclarationEClass = null;
			private EClass AnonymousClassDeclarationEClass = null;
			private EClass ArrayAccessEClass = null;
			private EClass ArrayCreationEClass = null;
			private EClass ArrayInitializerEClass = null;
			private EClass ArrayLengthAccessEClass = null;
			private EClass ArrayTypeEClass = null;
			private EClass AssignmentEClass = null;
			private EClass BodyDeclarationEClass = null;
			private EClass BooleanLiteralEClass = null;
			private EClass BlockCommentEClass = null;
			private EClass BlockEClass = null;
			private EClass BreakStatementEClass = null;
			private EClass CastExpressionEClass = null;
			private EClass CatchClauseEClass = null;
			private EClass CharacterLiteralEClass = null;
			private EClass ClassFileEClass = null;
			private EClass ClassInstanceCreationEClass = null;
			private EClass ConstructorDeclarationEClass = null;
			private EClass ConditionalExpressionEClass = null;
			private EClass ConstructorInvocationEClass = null;
			private EClass ClassDeclarationEClass = null;
			private EClass CommentEClass = null;
			private EClass CompilationUnitEClass = null;
			private EClass ContinueStatementEClass = null;
			private EClass DoStatementEClass = null;
			private EClass EmptyStatementEClass = null;
			private EClass EnhancedForStatementEClass = null;
			private EClass EnumConstantDeclarationEClass = null;
			private EClass EnumDeclarationEClass = null;
			private EClass ExpressionEClass = null;
			private EClass ExpressionStatementEClass = null;
			private EClass FieldAccessEClass = null;
			private EClass FieldDeclarationEClass = null;
			private EClass ForStatementEClass = null;
			private EClass IfStatementEClass = null;
			private EClass ImportDeclarationEClass = null;
			private EClass InfixExpressionEClass = null;
			private EClass InitializerEClass = null;
			private EClass InstanceofExpressionEClass = null;
			private EClass InterfaceDeclarationEClass = null;
			private EClass JavadocEClass = null;
			private EClass LabeledStatementEClass = null;
			private EClass LineCommentEClass = null;
			private EClass ManifestEClass = null;
			private EClass ManifestAttributeEClass = null;
			private EClass ManifestEntryEClass = null;
			private EClass MemberRefEClass = null;
			private EClass MethodDeclarationEClass = null;
			private EClass MethodInvocationEClass = null;
			private EClass MethodRefEClass = null;
			private EClass MethodRefParameterEClass = null;
			private EClass ModelEClass = null;
			private EClass ModifierEClass = null;
			private EClass NamedElementEClass = null;
			private EClass NamespaceAccessEClass = null;
			private EClass NumberLiteralEClass = null;
			private EClass NullLiteralEClass = null;
			private EClass PackageEClass = null;
			private EClass PackageAccessEClass = null;
			private EClass ParameterizedTypeEClass = null;
			private EClass ParenthesizedExpressionEClass = null;
			private EClass PostfixExpressionEClass = null;
			private EClass PrefixExpressionEClass = null;
			private EClass PrimitiveTypeEClass = null;
			private EClass PrimitiveTypeBooleanEClass = null;
			private EClass PrimitiveTypeByteEClass = null;
			private EClass PrimitiveTypeCharEClass = null;
			private EClass PrimitiveTypeDoubleEClass = null;
			private EClass PrimitiveTypeShortEClass = null;
			private EClass PrimitiveTypeFloatEClass = null;
			private EClass PrimitiveTypeIntEClass = null;
			private EClass PrimitiveTypeLongEClass = null;
			private EClass PrimitiveTypeVoidEClass = null;
			private EClass ReturnStatementEClass = null;
			private EClass SingleVariableAccessEClass = null;
			private EClass SingleVariableDeclarationEClass = null;
			private EClass StatementEClass = null;
			private EClass StringLiteralEClass = null;
			private EClass SuperConstructorInvocationEClass = null;
			private EClass SuperFieldAccessEClass = null;
			private EClass SuperMethodInvocationEClass = null;
			private EClass SwitchCaseEClass = null;
			private EClass SwitchStatementEClass = null;
			private EClass SynchronizedStatementEClass = null;
			private EClass TagElementEClass = null;
			private EClass TextElementEClass = null;
			private EClass ThisExpressionEClass = null;
			private EClass ThrowStatementEClass = null;
			private EClass TryStatementEClass = null;
			private EClass TypeEClass = null;
			private EClass TypeAccessEClass = null;
			private EClass TypeDeclarationEClass = null;
			private EClass TypeDeclarationStatementEClass = null;
			private EClass TypeLiteralEClass = null;
			private EClass TypeParameterEClass = null;
			private EClass UnresolvedItemEClass = null;
			private EClass UnresolvedItemAccessEClass = null;
			private EClass UnresolvedAnnotationDeclarationEClass = null;
			private EClass UnresolvedAnnotationTypeMemberDeclarationEClass = null;
			private EClass UnresolvedClassDeclarationEClass = null;
			private EClass UnresolvedEnumDeclarationEClass = null;
			private EClass UnresolvedInterfaceDeclarationEClass = null;
			private EClass UnresolvedLabeledStatementEClass = null;
			private EClass UnresolvedMethodDeclarationEClass = null;
			private EClass UnresolvedSingleVariableDeclarationEClass = null;
			private EClass UnresolvedTypeEClass = null;
			private EClass UnresolvedTypeDeclarationEClass = null;
			private EClass UnresolvedVariableDeclarationFragmentEClass = null;
			private EClass VariableDeclarationEClass = null;
			private EClass VariableDeclarationExpressionEClass = null;
			private EClass VariableDeclarationFragmentEClass = null;
			private EClass VariableDeclarationStatementEClass = null;
			private EClass WildCardTypeEClass = null;
			private EClass WhileStatementEClass = null;
			
			
			private EEnum AssignmentKindEEnum = null;
			private EEnum InfixExpressionKindEEnum = null;
			private EEnum InheritanceKindEEnum = null;
			private EEnum PostfixExpressionKindEEnum = null;
			private EEnum PrefixExpressionKindEEnum = null;
			private EEnum VisibilityKindEEnum = null;
			
			private EDataType AssignmentKindEDataType = null;
			private EDataType InfixExpressionKindEDataType = null;
			private EDataType InheritanceKindEDataType = null;
			private EDataType PostfixExpressionKindEDataType = null;
			private EDataType PrefixExpressionKindEDataType = null;
			private EDataType VisibilityKindEDataType = null;
			
			
			public const int ASTNODE = 8;
			public const int ASTNODE_FEATURE_COUNT = 3;
			public const int ASTNODE_OPERATION_COUNT = 0;
			
			public const int ASTNODE_COMMENTS = 0;
			public const int ASTNODE_ORIGINALCOMPILATIONUNIT = 1;
			public const int ASTNODE_ORIGINALCLASSFILE = 2;
			
			public const int NAMEDELEMENT = 68;
			public const int NAMEDELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
			public const int NAMEDELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int NAMEDELEMENT_COMMENTS = 0;
			public const int NAMEDELEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int NAMEDELEMENT_ORIGINALCLASSFILE = 2;
			public const int NAMEDELEMENT_NAME = 3;
			public const int NAMEDELEMENT_PROXY = 4;
			public const int NAMEDELEMENT_USAGESINIMPORTS = 5;
			
			public const int BODYDECLARATION = 20;
			public const int BODYDECLARATION_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 4;
			public const int BODYDECLARATION_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int BODYDECLARATION_COMMENTS = 0;
			public const int BODYDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int BODYDECLARATION_ORIGINALCLASSFILE = 2;
			public const int BODYDECLARATION_NAME = 3;
			public const int BODYDECLARATION_PROXY = 4;
			public const int BODYDECLARATION_USAGESINIMPORTS = 5;
			public const int BODYDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int BODYDECLARATION_ANNOTATIONS = 7;
			public const int BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int BODYDECLARATION_MODIFIER = 9;
			
			public const int ABSTRACTMETHODDECLARATION = 0;
			public const int ABSTRACTMETHODDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 6;
			public const int ABSTRACTMETHODDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
			
			public const int ABSTRACTMETHODDECLARATION_COMMENTS = 0;
			public const int ABSTRACTMETHODDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ABSTRACTMETHODDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ABSTRACTMETHODDECLARATION_NAME = 3;
			public const int ABSTRACTMETHODDECLARATION_PROXY = 4;
			public const int ABSTRACTMETHODDECLARATION_USAGESINIMPORTS = 5;
			public const int ABSTRACTMETHODDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ABSTRACTMETHODDECLARATION_ANNOTATIONS = 7;
			public const int ABSTRACTMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ABSTRACTMETHODDECLARATION_MODIFIER = 9;
			public const int ABSTRACTMETHODDECLARATION_BODY = 10;
			public const int ABSTRACTMETHODDECLARATION_PARAMETERS = 11;
			public const int ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS = 12;
			public const int ABSTRACTMETHODDECLARATION_TYPEPARAMETERS = 13;
			public const int ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS = 14;
			public const int ABSTRACTMETHODDECLARATION_USAGES = 15;
			
			public const int ABSTRACTMETHODINVOCATION = 1;
			public const int ABSTRACTMETHODINVOCATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
			public const int ABSTRACTMETHODINVOCATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int ABSTRACTMETHODINVOCATION_COMMENTS = 0;
			public const int ABSTRACTMETHODINVOCATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ABSTRACTMETHODINVOCATION_ORIGINALCLASSFILE = 2;
			public const int ABSTRACTMETHODINVOCATION_METHOD = 3;
			public const int ABSTRACTMETHODINVOCATION_ARGUMENTS = 4;
			public const int ABSTRACTMETHODINVOCATION_TYPEARGUMENTS = 5;
			
			public const int TYPE = 106;
			public const int TYPE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 1;
			public const int TYPE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int TYPE_COMMENTS = 0;
			public const int TYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPE_ORIGINALCLASSFILE = 2;
			public const int TYPE_NAME = 3;
			public const int TYPE_PROXY = 4;
			public const int TYPE_USAGESINIMPORTS = 5;
			public const int TYPE_USAGESINTYPEACCESS = 6;
			
			public const int ABSTRACTTYPEDECLARATION = 2;
			public const int ABSTRACTTYPEDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + TYPE_FEATURE_COUNT + 5;
			public const int ABSTRACTTYPEDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + TYPE_OPERATION_COUNT + 0;
			
			public const int ABSTRACTTYPEDECLARATION_COMMENTS = 0;
			public const int ABSTRACTTYPEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ABSTRACTTYPEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ABSTRACTTYPEDECLARATION_NAME = 3;
			public const int ABSTRACTTYPEDECLARATION_PROXY = 4;
			public const int ABSTRACTTYPEDECLARATION_USAGESINIMPORTS = 5;
			public const int ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ABSTRACTTYPEDECLARATION_ANNOTATIONS = 7;
			public const int ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ABSTRACTTYPEDECLARATION_MODIFIER = 9;
			public const int ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int ABSTRACTTYPEDECLARATION_BODYDECLARATIONS = 11;
			public const int ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int ABSTRACTTYPEDECLARATION_PACKAGE = 14;
			public const int ABSTRACTTYPEDECLARATION_SUPERINTERFACES = 15;
			
			public const int EXPRESSION = 42;
			public const int EXPRESSION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
			public const int EXPRESSION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int EXPRESSION_COMMENTS = 0;
			public const int EXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int EXPRESSION_ORIGINALCLASSFILE = 2;
			
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION = 3;
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_COMMENTS = 0;
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER = 3;
			
			public const int ABSTRACTVARIABLESCONTAINER = 4;
			public const int ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
			public const int ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int ABSTRACTVARIABLESCONTAINER_COMMENTS = 0;
			public const int ABSTRACTVARIABLESCONTAINER_ORIGINALCOMPILATIONUNIT = 1;
			public const int ABSTRACTVARIABLESCONTAINER_ORIGINALCLASSFILE = 2;
			public const int ABSTRACTVARIABLESCONTAINER_TYPE = 3;
			public const int ABSTRACTVARIABLESCONTAINER_FRAGMENTS = 4;
			
			public const int ANNOTATION = 5;
			public const int ANNOTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int ANNOTATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ANNOTATION_COMMENTS = 0;
			public const int ANNOTATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ANNOTATION_ORIGINALCLASSFILE = 2;
			public const int ANNOTATION_TYPE = 3;
			public const int ANNOTATION_VALUES = 4;
			
			public const int ARCHIVE = 6;
			public const int ARCHIVE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 3;
			public const int ARCHIVE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int ARCHIVE_COMMENTS = 0;
			public const int ARCHIVE_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARCHIVE_ORIGINALCLASSFILE = 2;
			public const int ARCHIVE_NAME = 3;
			public const int ARCHIVE_PROXY = 4;
			public const int ARCHIVE_USAGESINIMPORTS = 5;
			public const int ARCHIVE_ORIGINALFILEPATH = 6;
			public const int ARCHIVE_CLASSFILES = 7;
			public const int ARCHIVE_MANIFEST = 8;
			
			public const int STATEMENT = 93;
			public const int STATEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
			public const int STATEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int STATEMENT_COMMENTS = 0;
			public const int STATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int STATEMENT_ORIGINALCLASSFILE = 2;
			
			public const int ASSERTSTATEMENT = 7;
			public const int ASSERTSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int ASSERTSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int ASSERTSTATEMENT_COMMENTS = 0;
			public const int ASSERTSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int ASSERTSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int ASSERTSTATEMENT_MESSAGE = 3;
			public const int ASSERTSTATEMENT_EXPRESSION = 4;
			
			public const int ANNOTATIONMEMBERVALUEPAIR = 9;
			public const int ANNOTATIONMEMBERVALUEPAIR_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 2;
			public const int ANNOTATIONMEMBERVALUEPAIR_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int ANNOTATIONMEMBERVALUEPAIR_COMMENTS = 0;
			public const int ANNOTATIONMEMBERVALUEPAIR_ORIGINALCOMPILATIONUNIT = 1;
			public const int ANNOTATIONMEMBERVALUEPAIR_ORIGINALCLASSFILE = 2;
			public const int ANNOTATIONMEMBERVALUEPAIR_NAME = 3;
			public const int ANNOTATIONMEMBERVALUEPAIR_PROXY = 4;
			public const int ANNOTATIONMEMBERVALUEPAIR_USAGESINIMPORTS = 5;
			public const int ANNOTATIONMEMBERVALUEPAIR_MEMBER = 6;
			public const int ANNOTATIONMEMBERVALUEPAIR_VALUE = 7;
			
			public const int ANNOTATIONTYPEDECLARATION = 10;
			public const int ANNOTATIONTYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 0;
			public const int ANNOTATIONTYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
			
			public const int ANNOTATIONTYPEDECLARATION_COMMENTS = 0;
			public const int ANNOTATIONTYPEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ANNOTATIONTYPEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ANNOTATIONTYPEDECLARATION_NAME = 3;
			public const int ANNOTATIONTYPEDECLARATION_PROXY = 4;
			public const int ANNOTATIONTYPEDECLARATION_USAGESINIMPORTS = 5;
			public const int ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ANNOTATIONTYPEDECLARATION_ANNOTATIONS = 7;
			public const int ANNOTATIONTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ANNOTATIONTYPEDECLARATION_MODIFIER = 9;
			public const int ANNOTATIONTYPEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int ANNOTATIONTYPEDECLARATION_BODYDECLARATIONS = 11;
			public const int ANNOTATIONTYPEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int ANNOTATIONTYPEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int ANNOTATIONTYPEDECLARATION_PACKAGE = 14;
			public const int ANNOTATIONTYPEDECLARATION_SUPERINTERFACES = 15;
			
			public const int ANNOTATIONTYPEMEMBERDECLARATION = 11;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 3;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
			
			public const int ANNOTATIONTYPEMEMBERDECLARATION_COMMENTS = 0;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_NAME = 3;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_PROXY = 4;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS = 5;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS = 7;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_MODIFIER = 9;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT = 10;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_TYPE = 11;
			public const int ANNOTATIONTYPEMEMBERDECLARATION_USAGES = 12;
			
			public const int ANONYMOUSCLASSDECLARATION = 12;
			public const int ANONYMOUSCLASSDECLARATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
			public const int ANONYMOUSCLASSDECLARATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int ANONYMOUSCLASSDECLARATION_COMMENTS = 0;
			public const int ANONYMOUSCLASSDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ANONYMOUSCLASSDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS = 3;
			public const int ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION = 4;
			
			public const int ARRAYACCESS = 13;
			public const int ARRAYACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int ARRAYACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ARRAYACCESS_COMMENTS = 0;
			public const int ARRAYACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARRAYACCESS_ORIGINALCLASSFILE = 2;
			public const int ARRAYACCESS_ARRAY = 3;
			public const int ARRAYACCESS_INDEX = 4;
			
			public const int ARRAYCREATION = 14;
			public const int ARRAYCREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
			public const int ARRAYCREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ARRAYCREATION_COMMENTS = 0;
			public const int ARRAYCREATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARRAYCREATION_ORIGINALCLASSFILE = 2;
			public const int ARRAYCREATION_DIMENSIONS = 3;
			public const int ARRAYCREATION_INITIALIZER = 4;
			public const int ARRAYCREATION_TYPE = 5;
			
			public const int ARRAYINITIALIZER = 15;
			public const int ARRAYINITIALIZER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int ARRAYINITIALIZER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ARRAYINITIALIZER_COMMENTS = 0;
			public const int ARRAYINITIALIZER_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARRAYINITIALIZER_ORIGINALCLASSFILE = 2;
			public const int ARRAYINITIALIZER_EXPRESSIONS = 3;
			
			public const int ARRAYLENGTHACCESS = 16;
			public const int ARRAYLENGTHACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int ARRAYLENGTHACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ARRAYLENGTHACCESS_COMMENTS = 0;
			public const int ARRAYLENGTHACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARRAYLENGTHACCESS_ORIGINALCLASSFILE = 2;
			public const int ARRAYLENGTHACCESS_ARRAY = 3;
			
			public const int ARRAYTYPE = 17;
			public const int ARRAYTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
			public const int ARRAYTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
			
			public const int ARRAYTYPE_COMMENTS = 0;
			public const int ARRAYTYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int ARRAYTYPE_ORIGINALCLASSFILE = 2;
			public const int ARRAYTYPE_NAME = 3;
			public const int ARRAYTYPE_PROXY = 4;
			public const int ARRAYTYPE_USAGESINIMPORTS = 5;
			public const int ARRAYTYPE_USAGESINTYPEACCESS = 6;
			public const int ARRAYTYPE_DIMENSIONS = 7;
			public const int ARRAYTYPE_ELEMENTTYPE = 8;
			
			public const int ASSIGNMENT = 18;
			public const int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
			public const int ASSIGNMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int ASSIGNMENT_COMMENTS = 0;
			public const int ASSIGNMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int ASSIGNMENT_ORIGINALCLASSFILE = 2;
			public const int ASSIGNMENT_LEFTHANDSIDE = 3;
			public const int ASSIGNMENT_OPERATOR = 4;
			public const int ASSIGNMENT_RIGHTHANDSIDE = 5;
			
			public const int BOOLEANLITERAL = 21;
			public const int BOOLEANLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int BOOLEANLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int BOOLEANLITERAL_COMMENTS = 0;
			public const int BOOLEANLITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int BOOLEANLITERAL_ORIGINALCLASSFILE = 2;
			public const int BOOLEANLITERAL_VALUE = 3;
			
			public const int COMMENT = 34;
			public const int COMMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
			public const int COMMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int COMMENT_COMMENTS = 0;
			public const int COMMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int COMMENT_ORIGINALCLASSFILE = 2;
			public const int COMMENT_CONTENT = 3;
			public const int COMMENT_ENCLOSEDBYPARENT = 4;
			public const int COMMENT_PREFIXOFPARENT = 5;
			
			public const int BLOCKCOMMENT = 22;
			public const int BLOCKCOMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;
			public const int BLOCKCOMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
			
			public const int BLOCKCOMMENT_COMMENTS = 0;
			public const int BLOCKCOMMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int BLOCKCOMMENT_ORIGINALCLASSFILE = 2;
			public const int BLOCKCOMMENT_CONTENT = 3;
			public const int BLOCKCOMMENT_ENCLOSEDBYPARENT = 4;
			public const int BLOCKCOMMENT_PREFIXOFPARENT = 5;
			
			public const int BLOCK = 23;
			public const int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int BLOCK_COMMENTS = 0;
			public const int BLOCK_ORIGINALCOMPILATIONUNIT = 1;
			public const int BLOCK_ORIGINALCLASSFILE = 2;
			public const int BLOCK_STATEMENTS = 3;
			
			public const int BREAKSTATEMENT = 24;
			public const int BREAKSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int BREAKSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int BREAKSTATEMENT_COMMENTS = 0;
			public const int BREAKSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int BREAKSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int BREAKSTATEMENT_LABEL = 3;
			
			public const int CASTEXPRESSION = 25;
			public const int CASTEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int CASTEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int CASTEXPRESSION_COMMENTS = 0;
			public const int CASTEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CASTEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int CASTEXPRESSION_EXPRESSION = 3;
			public const int CASTEXPRESSION_TYPE = 4;
			
			public const int CATCHCLAUSE = 26;
			public const int CATCHCLAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int CATCHCLAUSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int CATCHCLAUSE_COMMENTS = 0;
			public const int CATCHCLAUSE_ORIGINALCOMPILATIONUNIT = 1;
			public const int CATCHCLAUSE_ORIGINALCLASSFILE = 2;
			public const int CATCHCLAUSE_EXCEPTION = 3;
			public const int CATCHCLAUSE_BODY = 4;
			
			public const int CHARACTERLITERAL = 27;
			public const int CHARACTERLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int CHARACTERLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int CHARACTERLITERAL_COMMENTS = 0;
			public const int CHARACTERLITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int CHARACTERLITERAL_ORIGINALCLASSFILE = 2;
			public const int CHARACTERLITERAL_ESCAPEDVALUE = 3;
			
			public const int CLASSFILE = 28;
			public const int CLASSFILE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 4;
			public const int CLASSFILE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int CLASSFILE_COMMENTS = 0;
			public const int CLASSFILE_ORIGINALCOMPILATIONUNIT = 1;
			public const int CLASSFILE_ORIGINALCLASSFILE = 2;
			public const int CLASSFILE_NAME = 3;
			public const int CLASSFILE_PROXY = 4;
			public const int CLASSFILE_USAGESINIMPORTS = 5;
			public const int CLASSFILE_ORIGINALFILEPATH = 6;
			public const int CLASSFILE_TYPE = 7;
			public const int CLASSFILE_ATTACHEDSOURCE = 8;
			public const int CLASSFILE_PACKAGE = 9;
			
			public const int CLASSINSTANCECREATION = 29;
			public const int CLASSINSTANCECREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 3;
			public const int CLASSINSTANCECREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
			
			public const int CLASSINSTANCECREATION_COMMENTS = 0;
			public const int CLASSINSTANCECREATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CLASSINSTANCECREATION_ORIGINALCLASSFILE = 2;
			public const int CLASSINSTANCECREATION_METHOD = 3;
			public const int CLASSINSTANCECREATION_ARGUMENTS = 4;
			public const int CLASSINSTANCECREATION_TYPEARGUMENTS = 5;
			public const int CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION = 6;
			public const int CLASSINSTANCECREATION_EXPRESSION = 7;
			public const int CLASSINSTANCECREATION_TYPE = 8;
			
			public const int CONSTRUCTORDECLARATION = 30;
			public const int CONSTRUCTORDECLARATION_FEATURE_COUNT = ABSTRACTMETHODDECLARATION_FEATURE_COUNT + 0;
			public const int CONSTRUCTORDECLARATION_OPERATION_COUNT = ABSTRACTMETHODDECLARATION_OPERATION_COUNT + 0;
			
			public const int CONSTRUCTORDECLARATION_COMMENTS = 0;
			public const int CONSTRUCTORDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CONSTRUCTORDECLARATION_ORIGINALCLASSFILE = 2;
			public const int CONSTRUCTORDECLARATION_NAME = 3;
			public const int CONSTRUCTORDECLARATION_PROXY = 4;
			public const int CONSTRUCTORDECLARATION_USAGESINIMPORTS = 5;
			public const int CONSTRUCTORDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int CONSTRUCTORDECLARATION_ANNOTATIONS = 7;
			public const int CONSTRUCTORDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int CONSTRUCTORDECLARATION_MODIFIER = 9;
			public const int CONSTRUCTORDECLARATION_BODY = 10;
			public const int CONSTRUCTORDECLARATION_PARAMETERS = 11;
			public const int CONSTRUCTORDECLARATION_THROWNEXCEPTIONS = 12;
			public const int CONSTRUCTORDECLARATION_TYPEPARAMETERS = 13;
			public const int CONSTRUCTORDECLARATION_USAGESINDOCCOMMENTS = 14;
			public const int CONSTRUCTORDECLARATION_USAGES = 15;
			
			public const int CONDITIONALEXPRESSION = 31;
			public const int CONDITIONALEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
			public const int CONDITIONALEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int CONDITIONALEXPRESSION_COMMENTS = 0;
			public const int CONDITIONALEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CONDITIONALEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int CONDITIONALEXPRESSION_ELSEEXPRESSION = 3;
			public const int CONDITIONALEXPRESSION_EXPRESSION = 4;
			public const int CONDITIONALEXPRESSION_THENEXPRESSION = 5;
			
			public const int CONSTRUCTORINVOCATION = 32;
			public const int CONSTRUCTORINVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 0;
			public const int CONSTRUCTORINVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
			
			public const int CONSTRUCTORINVOCATION_COMMENTS = 0;
			public const int CONSTRUCTORINVOCATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CONSTRUCTORINVOCATION_ORIGINALCLASSFILE = 2;
			public const int CONSTRUCTORINVOCATION_METHOD = 3;
			public const int CONSTRUCTORINVOCATION_ARGUMENTS = 4;
			public const int CONSTRUCTORINVOCATION_TYPEARGUMENTS = 5;
			
			public const int TYPEDECLARATION = 108;
			public const int TYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 1;
			public const int TYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
			
			public const int TYPEDECLARATION_COMMENTS = 0;
			public const int TYPEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int TYPEDECLARATION_NAME = 3;
			public const int TYPEDECLARATION_PROXY = 4;
			public const int TYPEDECLARATION_USAGESINIMPORTS = 5;
			public const int TYPEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int TYPEDECLARATION_ANNOTATIONS = 7;
			public const int TYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int TYPEDECLARATION_MODIFIER = 9;
			public const int TYPEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int TYPEDECLARATION_BODYDECLARATIONS = 11;
			public const int TYPEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int TYPEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int TYPEDECLARATION_PACKAGE = 14;
			public const int TYPEDECLARATION_SUPERINTERFACES = 15;
			public const int TYPEDECLARATION_TYPEPARAMETERS = 16;
			
			public const int CLASSDECLARATION = 33;
			public const int CLASSDECLARATION_FEATURE_COUNT = TYPEDECLARATION_FEATURE_COUNT + 1;
			public const int CLASSDECLARATION_OPERATION_COUNT = TYPEDECLARATION_OPERATION_COUNT + 0;
			
			public const int CLASSDECLARATION_COMMENTS = 0;
			public const int CLASSDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int CLASSDECLARATION_ORIGINALCLASSFILE = 2;
			public const int CLASSDECLARATION_NAME = 3;
			public const int CLASSDECLARATION_PROXY = 4;
			public const int CLASSDECLARATION_USAGESINIMPORTS = 5;
			public const int CLASSDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int CLASSDECLARATION_ANNOTATIONS = 7;
			public const int CLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int CLASSDECLARATION_MODIFIER = 9;
			public const int CLASSDECLARATION_USAGESINTYPEACCESS = 10;
			public const int CLASSDECLARATION_BODYDECLARATIONS = 11;
			public const int CLASSDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int CLASSDECLARATION_COMMENTSAFTERBODY = 13;
			public const int CLASSDECLARATION_PACKAGE = 14;
			public const int CLASSDECLARATION_SUPERINTERFACES = 15;
			public const int CLASSDECLARATION_TYPEPARAMETERS = 16;
			public const int CLASSDECLARATION_SUPERCLASS = 17;
			
			public const int COMPILATIONUNIT = 35;
			public const int COMPILATIONUNIT_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 5;
			public const int COMPILATIONUNIT_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int COMPILATIONUNIT_COMMENTS = 0;
			public const int COMPILATIONUNIT_ORIGINALCOMPILATIONUNIT = 1;
			public const int COMPILATIONUNIT_ORIGINALCLASSFILE = 2;
			public const int COMPILATIONUNIT_NAME = 3;
			public const int COMPILATIONUNIT_PROXY = 4;
			public const int COMPILATIONUNIT_USAGESINIMPORTS = 5;
			public const int COMPILATIONUNIT_ORIGINALFILEPATH = 6;
			public const int COMPILATIONUNIT_COMMENTLIST = 7;
			public const int COMPILATIONUNIT_IMPORTS = 8;
			public const int COMPILATIONUNIT_PACKAGE = 9;
			public const int COMPILATIONUNIT_TYPES = 10;
			
			public const int CONTINUESTATEMENT = 36;
			public const int CONTINUESTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int CONTINUESTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int CONTINUESTATEMENT_COMMENTS = 0;
			public const int CONTINUESTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int CONTINUESTATEMENT_ORIGINALCLASSFILE = 2;
			public const int CONTINUESTATEMENT_LABEL = 3;
			
			public const int DOSTATEMENT = 37;
			public const int DOSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int DOSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int DOSTATEMENT_COMMENTS = 0;
			public const int DOSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int DOSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int DOSTATEMENT_EXPRESSION = 3;
			public const int DOSTATEMENT_BODY = 4;
			
			public const int EMPTYSTATEMENT = 38;
			public const int EMPTYSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;
			public const int EMPTYSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int EMPTYSTATEMENT_COMMENTS = 0;
			public const int EMPTYSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int EMPTYSTATEMENT_ORIGINALCLASSFILE = 2;
			
			public const int ENHANCEDFORSTATEMENT = 39;
			public const int ENHANCEDFORSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
			public const int ENHANCEDFORSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int ENHANCEDFORSTATEMENT_COMMENTS = 0;
			public const int ENHANCEDFORSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int ENHANCEDFORSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int ENHANCEDFORSTATEMENT_BODY = 3;
			public const int ENHANCEDFORSTATEMENT_EXPRESSION = 4;
			public const int ENHANCEDFORSTATEMENT_PARAMETER = 5;
			
			public const int VARIABLEDECLARATION = 125;
			public const int VARIABLEDECLARATION_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 3;
			public const int VARIABLEDECLARATION_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int VARIABLEDECLARATION_COMMENTS = 0;
			public const int VARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int VARIABLEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int VARIABLEDECLARATION_NAME = 3;
			public const int VARIABLEDECLARATION_PROXY = 4;
			public const int VARIABLEDECLARATION_USAGESINIMPORTS = 5;
			public const int VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS = 6;
			public const int VARIABLEDECLARATION_INITIALIZER = 7;
			public const int VARIABLEDECLARATION_USAGEINVARIABLEACCESS = 8;
			
			public const int ENUMCONSTANTDECLARATION = 40;
			public const int ENUMCONSTANTDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + VARIABLEDECLARATION_FEATURE_COUNT + 2;
			public const int ENUMCONSTANTDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + VARIABLEDECLARATION_OPERATION_COUNT + 0;
			
			public const int ENUMCONSTANTDECLARATION_COMMENTS = 0;
			public const int ENUMCONSTANTDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ENUMCONSTANTDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ENUMCONSTANTDECLARATION_NAME = 3;
			public const int ENUMCONSTANTDECLARATION_PROXY = 4;
			public const int ENUMCONSTANTDECLARATION_USAGESINIMPORTS = 5;
			public const int ENUMCONSTANTDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ENUMCONSTANTDECLARATION_ANNOTATIONS = 7;
			public const int ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ENUMCONSTANTDECLARATION_MODIFIER = 9;
			public const int ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS = 10;
			public const int ENUMCONSTANTDECLARATION_INITIALIZER = 11;
			public const int ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS = 12;
			public const int ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION = 13;
			public const int ENUMCONSTANTDECLARATION_ARGUMENTS = 14;
			
			public const int ENUMDECLARATION = 41;
			public const int ENUMDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 1;
			public const int ENUMDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
			
			public const int ENUMDECLARATION_COMMENTS = 0;
			public const int ENUMDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int ENUMDECLARATION_ORIGINALCLASSFILE = 2;
			public const int ENUMDECLARATION_NAME = 3;
			public const int ENUMDECLARATION_PROXY = 4;
			public const int ENUMDECLARATION_USAGESINIMPORTS = 5;
			public const int ENUMDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int ENUMDECLARATION_ANNOTATIONS = 7;
			public const int ENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int ENUMDECLARATION_MODIFIER = 9;
			public const int ENUMDECLARATION_USAGESINTYPEACCESS = 10;
			public const int ENUMDECLARATION_BODYDECLARATIONS = 11;
			public const int ENUMDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int ENUMDECLARATION_COMMENTSAFTERBODY = 13;
			public const int ENUMDECLARATION_PACKAGE = 14;
			public const int ENUMDECLARATION_SUPERINTERFACES = 15;
			public const int ENUMDECLARATION_ENUMCONSTANTS = 16;
			
			public const int EXPRESSIONSTATEMENT = 43;
			public const int EXPRESSIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int EXPRESSIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int EXPRESSIONSTATEMENT_COMMENTS = 0;
			public const int EXPRESSIONSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int EXPRESSIONSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int EXPRESSIONSTATEMENT_EXPRESSION = 3;
			
			public const int FIELDACCESS = 44;
			public const int FIELDACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int FIELDACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int FIELDACCESS_COMMENTS = 0;
			public const int FIELDACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int FIELDACCESS_ORIGINALCLASSFILE = 2;
			public const int FIELDACCESS_FIELD = 3;
			public const int FIELDACCESS_EXPRESSION = 4;
			
			public const int FIELDDECLARATION = 45;
			public const int FIELDDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 0;
			public const int FIELDDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
			
			public const int FIELDDECLARATION_COMMENTS = 0;
			public const int FIELDDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int FIELDDECLARATION_ORIGINALCLASSFILE = 2;
			public const int FIELDDECLARATION_NAME = 3;
			public const int FIELDDECLARATION_PROXY = 4;
			public const int FIELDDECLARATION_USAGESINIMPORTS = 5;
			public const int FIELDDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int FIELDDECLARATION_ANNOTATIONS = 7;
			public const int FIELDDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int FIELDDECLARATION_MODIFIER = 9;
			public const int FIELDDECLARATION_TYPE = 10;
			public const int FIELDDECLARATION_FRAGMENTS = 11;
			
			public const int FORSTATEMENT = 46;
			public const int FORSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;
			public const int FORSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int FORSTATEMENT_COMMENTS = 0;
			public const int FORSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int FORSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int FORSTATEMENT_EXPRESSION = 3;
			public const int FORSTATEMENT_UPDATERS = 4;
			public const int FORSTATEMENT_INITIALIZERS = 5;
			public const int FORSTATEMENT_BODY = 6;
			
			public const int IFSTATEMENT = 47;
			public const int IFSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
			public const int IFSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int IFSTATEMENT_COMMENTS = 0;
			public const int IFSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int IFSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int IFSTATEMENT_EXPRESSION = 3;
			public const int IFSTATEMENT_THENSTATEMENT = 4;
			public const int IFSTATEMENT_ELSESTATEMENT = 5;
			
			public const int IMPORTDECLARATION = 48;
			public const int IMPORTDECLARATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
			public const int IMPORTDECLARATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int IMPORTDECLARATION_COMMENTS = 0;
			public const int IMPORTDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int IMPORTDECLARATION_ORIGINALCLASSFILE = 2;
			public const int IMPORTDECLARATION_STATIC = 3;
			public const int IMPORTDECLARATION_IMPORTEDELEMENT = 4;
			
			public const int INFIXEXPRESSION = 49;
			public const int INFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;
			public const int INFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int INFIXEXPRESSION_COMMENTS = 0;
			public const int INFIXEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int INFIXEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int INFIXEXPRESSION_OPERATOR = 3;
			public const int INFIXEXPRESSION_RIGHTOPERAND = 4;
			public const int INFIXEXPRESSION_LEFTOPERAND = 5;
			public const int INFIXEXPRESSION_EXTENDEDOPERANDS = 6;
			
			public const int INITIALIZER = 52;
			public const int INITIALIZER_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 1;
			public const int INITIALIZER_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
			
			public const int INITIALIZER_COMMENTS = 0;
			public const int INITIALIZER_ORIGINALCOMPILATIONUNIT = 1;
			public const int INITIALIZER_ORIGINALCLASSFILE = 2;
			public const int INITIALIZER_NAME = 3;
			public const int INITIALIZER_PROXY = 4;
			public const int INITIALIZER_USAGESINIMPORTS = 5;
			public const int INITIALIZER_ABSTRACTTYPEDECLARATION = 6;
			public const int INITIALIZER_ANNOTATIONS = 7;
			public const int INITIALIZER_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int INITIALIZER_MODIFIER = 9;
			public const int INITIALIZER_BODY = 10;
			
			public const int INSTANCEOFEXPRESSION = 53;
			public const int INSTANCEOFEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int INSTANCEOFEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int INSTANCEOFEXPRESSION_COMMENTS = 0;
			public const int INSTANCEOFEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int INSTANCEOFEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int INSTANCEOFEXPRESSION_RIGHTOPERAND = 3;
			public const int INSTANCEOFEXPRESSION_LEFTOPERAND = 4;
			
			public const int INTERFACEDECLARATION = 54;
			public const int INTERFACEDECLARATION_FEATURE_COUNT = TYPEDECLARATION_FEATURE_COUNT + 0;
			public const int INTERFACEDECLARATION_OPERATION_COUNT = TYPEDECLARATION_OPERATION_COUNT + 0;
			
			public const int INTERFACEDECLARATION_COMMENTS = 0;
			public const int INTERFACEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int INTERFACEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int INTERFACEDECLARATION_NAME = 3;
			public const int INTERFACEDECLARATION_PROXY = 4;
			public const int INTERFACEDECLARATION_USAGESINIMPORTS = 5;
			public const int INTERFACEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int INTERFACEDECLARATION_ANNOTATIONS = 7;
			public const int INTERFACEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int INTERFACEDECLARATION_MODIFIER = 9;
			public const int INTERFACEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int INTERFACEDECLARATION_BODYDECLARATIONS = 11;
			public const int INTERFACEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int INTERFACEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int INTERFACEDECLARATION_PACKAGE = 14;
			public const int INTERFACEDECLARATION_SUPERINTERFACES = 15;
			public const int INTERFACEDECLARATION_TYPEPARAMETERS = 16;
			
			public const int JAVADOC = 55;
			public const int JAVADOC_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 1;
			public const int JAVADOC_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
			
			public const int JAVADOC_COMMENTS = 0;
			public const int JAVADOC_ORIGINALCOMPILATIONUNIT = 1;
			public const int JAVADOC_ORIGINALCLASSFILE = 2;
			public const int JAVADOC_CONTENT = 3;
			public const int JAVADOC_ENCLOSEDBYPARENT = 4;
			public const int JAVADOC_PREFIXOFPARENT = 5;
			public const int JAVADOC_TAGS = 6;
			
			public const int LABELEDSTATEMENT = 56;
			public const int LABELEDSTATEMENT_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + STATEMENT_FEATURE_COUNT + 3;
			public const int LABELEDSTATEMENT_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + STATEMENT_OPERATION_COUNT + 0;
			
			public const int LABELEDSTATEMENT_COMMENTS = 0;
			public const int LABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int LABELEDSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int LABELEDSTATEMENT_NAME = 3;
			public const int LABELEDSTATEMENT_PROXY = 4;
			public const int LABELEDSTATEMENT_USAGESINIMPORTS = 5;
			public const int LABELEDSTATEMENT_BODY = 6;
			public const int LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS = 7;
			public const int LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS = 8;
			
			public const int LINECOMMENT = 57;
			public const int LINECOMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;
			public const int LINECOMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
			
			public const int LINECOMMENT_COMMENTS = 0;
			public const int LINECOMMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int LINECOMMENT_ORIGINALCLASSFILE = 2;
			public const int LINECOMMENT_CONTENT = 3;
			public const int LINECOMMENT_ENCLOSEDBYPARENT = 4;
			public const int LINECOMMENT_PREFIXOFPARENT = 5;
			
			public const int MANIFEST = 58;
			public const int MANIFEST_FEATURE_COUNT = 2;
			public const int MANIFEST_OPERATION_COUNT = 0;
			
			public const int MANIFEST_MAINATTRIBUTES = 0;
			public const int MANIFEST_ENTRYATTRIBUTES = 1;
			
			public const int MANIFESTATTRIBUTE = 59;
			public const int MANIFESTATTRIBUTE_FEATURE_COUNT = 2;
			public const int MANIFESTATTRIBUTE_OPERATION_COUNT = 0;
			
			public const int MANIFESTATTRIBUTE_KEY = 0;
			public const int MANIFESTATTRIBUTE_VALUE = 1;
			
			public const int MANIFESTENTRY = 60;
			public const int MANIFESTENTRY_FEATURE_COUNT = 2;
			public const int MANIFESTENTRY_OPERATION_COUNT = 0;
			
			public const int MANIFESTENTRY_NAME = 0;
			public const int MANIFESTENTRY_ATTRIBUTES = 1;
			
			public const int MEMBERREF = 61;
			public const int MEMBERREF_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
			public const int MEMBERREF_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int MEMBERREF_COMMENTS = 0;
			public const int MEMBERREF_ORIGINALCOMPILATIONUNIT = 1;
			public const int MEMBERREF_ORIGINALCLASSFILE = 2;
			public const int MEMBERREF_MEMBER = 3;
			public const int MEMBERREF_QUALIFIER = 4;
			
			public const int METHODDECLARATION = 62;
			public const int METHODDECLARATION_FEATURE_COUNT = ABSTRACTMETHODDECLARATION_FEATURE_COUNT + 4;
			public const int METHODDECLARATION_OPERATION_COUNT = ABSTRACTMETHODDECLARATION_OPERATION_COUNT + 0;
			
			public const int METHODDECLARATION_COMMENTS = 0;
			public const int METHODDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int METHODDECLARATION_ORIGINALCLASSFILE = 2;
			public const int METHODDECLARATION_NAME = 3;
			public const int METHODDECLARATION_PROXY = 4;
			public const int METHODDECLARATION_USAGESINIMPORTS = 5;
			public const int METHODDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int METHODDECLARATION_ANNOTATIONS = 7;
			public const int METHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int METHODDECLARATION_MODIFIER = 9;
			public const int METHODDECLARATION_BODY = 10;
			public const int METHODDECLARATION_PARAMETERS = 11;
			public const int METHODDECLARATION_THROWNEXCEPTIONS = 12;
			public const int METHODDECLARATION_TYPEPARAMETERS = 13;
			public const int METHODDECLARATION_USAGESINDOCCOMMENTS = 14;
			public const int METHODDECLARATION_USAGES = 15;
			public const int METHODDECLARATION_EXTRAARRAYDIMENSIONS = 16;
			public const int METHODDECLARATION_RETURNTYPE = 17;
			public const int METHODDECLARATION_REDEFINEDMETHODDECLARATION = 18;
			public const int METHODDECLARATION_REDEFINITIONS = 19;
			
			public const int METHODINVOCATION = 63;
			public const int METHODINVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 1;
			public const int METHODINVOCATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
			
			public const int METHODINVOCATION_COMMENTS = 0;
			public const int METHODINVOCATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int METHODINVOCATION_ORIGINALCLASSFILE = 2;
			public const int METHODINVOCATION_METHOD = 3;
			public const int METHODINVOCATION_ARGUMENTS = 4;
			public const int METHODINVOCATION_TYPEARGUMENTS = 5;
			public const int METHODINVOCATION_EXPRESSION = 6;
			
			public const int METHODREF = 64;
			public const int METHODREF_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
			public const int METHODREF_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int METHODREF_COMMENTS = 0;
			public const int METHODREF_ORIGINALCOMPILATIONUNIT = 1;
			public const int METHODREF_ORIGINALCLASSFILE = 2;
			public const int METHODREF_METHOD = 3;
			public const int METHODREF_QUALIFIER = 4;
			public const int METHODREF_PARAMETERS = 5;
			
			public const int METHODREFPARAMETER = 65;
			public const int METHODREFPARAMETER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
			public const int METHODREFPARAMETER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int METHODREFPARAMETER_COMMENTS = 0;
			public const int METHODREFPARAMETER_ORIGINALCOMPILATIONUNIT = 1;
			public const int METHODREFPARAMETER_ORIGINALCLASSFILE = 2;
			public const int METHODREFPARAMETER_NAME = 3;
			public const int METHODREFPARAMETER_VARARGS = 4;
			public const int METHODREFPARAMETER_TYPE = 5;
			
			public const int MODEL = 66;
			public const int MODEL_FEATURE_COUNT = 7;
			public const int MODEL_OPERATION_COUNT = 0;
			
			public const int MODEL_NAME = 0;
			public const int MODEL_OWNEDELEMENTS = 1;
			public const int MODEL_ORPHANTYPES = 2;
			public const int MODEL_UNRESOLVEDITEMS = 3;
			public const int MODEL_COMPILATIONUNITS = 4;
			public const int MODEL_CLASSFILES = 5;
			public const int MODEL_ARCHIVES = 6;
			
			public const int MODIFIER = 67;
			public const int MODIFIER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 12;
			public const int MODIFIER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int MODIFIER_COMMENTS = 0;
			public const int MODIFIER_ORIGINALCOMPILATIONUNIT = 1;
			public const int MODIFIER_ORIGINALCLASSFILE = 2;
			public const int MODIFIER_VISIBILITY = 3;
			public const int MODIFIER_INHERITANCE = 4;
			public const int MODIFIER_STATIC = 5;
			public const int MODIFIER_TRANSIENT = 6;
			public const int MODIFIER_VOLATILE = 7;
			public const int MODIFIER_NATIVE = 8;
			public const int MODIFIER_STRICTFP = 9;
			public const int MODIFIER_SYNCHRONIZED = 10;
			public const int MODIFIER_BODYDECLARATION = 11;
			public const int MODIFIER_SINGLEVARIABLEDECLARATION = 12;
			public const int MODIFIER_VARIABLEDECLARATIONSTATEMENT = 13;
			public const int MODIFIER_VARIABLEDECLARATIONEXPRESSION = 14;
			
			public const int NAMESPACEACCESS = 69;
			public const int NAMESPACEACCESS_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
			public const int NAMESPACEACCESS_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int NAMESPACEACCESS_COMMENTS = 0;
			public const int NAMESPACEACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int NAMESPACEACCESS_ORIGINALCLASSFILE = 2;
			
			public const int NUMBERLITERAL = 70;
			public const int NUMBERLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int NUMBERLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int NUMBERLITERAL_COMMENTS = 0;
			public const int NUMBERLITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int NUMBERLITERAL_ORIGINALCLASSFILE = 2;
			public const int NUMBERLITERAL_TOKENVALUE = 3;
			
			public const int NULLLITERAL = 71;
			public const int NULLLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;
			public const int NULLLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int NULLLITERAL_COMMENTS = 0;
			public const int NULLLITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int NULLLITERAL_ORIGINALCLASSFILE = 2;
			
			public const int PACKAGE = 72;
			public const int PACKAGE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 5;
			public const int PACKAGE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int PACKAGE_COMMENTS = 0;
			public const int PACKAGE_ORIGINALCOMPILATIONUNIT = 1;
			public const int PACKAGE_ORIGINALCLASSFILE = 2;
			public const int PACKAGE_NAME = 3;
			public const int PACKAGE_PROXY = 4;
			public const int PACKAGE_USAGESINIMPORTS = 5;
			public const int PACKAGE_OWNEDELEMENTS = 6;
			public const int PACKAGE_MODEL = 7;
			public const int PACKAGE_OWNEDPACKAGES = 8;
			public const int PACKAGE_PACKAGE = 9;
			public const int PACKAGE_USAGESINPACKAGEACCESS = 10;
			
			public const int PACKAGEACCESS = 73;
			public const int PACKAGEACCESS_FEATURE_COUNT = NAMESPACEACCESS_FEATURE_COUNT + 2;
			public const int PACKAGEACCESS_OPERATION_COUNT = NAMESPACEACCESS_OPERATION_COUNT + 0;
			
			public const int PACKAGEACCESS_COMMENTS = 0;
			public const int PACKAGEACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int PACKAGEACCESS_ORIGINALCLASSFILE = 2;
			public const int PACKAGEACCESS_PACKAGE = 3;
			public const int PACKAGEACCESS_QUALIFIER = 4;
			
			public const int PARAMETERIZEDTYPE = 74;
			public const int PARAMETERIZEDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
			public const int PARAMETERIZEDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
			
			public const int PARAMETERIZEDTYPE_COMMENTS = 0;
			public const int PARAMETERIZEDTYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int PARAMETERIZEDTYPE_ORIGINALCLASSFILE = 2;
			public const int PARAMETERIZEDTYPE_NAME = 3;
			public const int PARAMETERIZEDTYPE_PROXY = 4;
			public const int PARAMETERIZEDTYPE_USAGESINIMPORTS = 5;
			public const int PARAMETERIZEDTYPE_USAGESINTYPEACCESS = 6;
			public const int PARAMETERIZEDTYPE_TYPE = 7;
			public const int PARAMETERIZEDTYPE_TYPEARGUMENTS = 8;
			
			public const int PARENTHESIZEDEXPRESSION = 75;
			public const int PARENTHESIZEDEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int PARENTHESIZEDEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int PARENTHESIZEDEXPRESSION_COMMENTS = 0;
			public const int PARENTHESIZEDEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int PARENTHESIZEDEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int PARENTHESIZEDEXPRESSION_EXPRESSION = 3;
			
			public const int POSTFIXEXPRESSION = 76;
			public const int POSTFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int POSTFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int POSTFIXEXPRESSION_COMMENTS = 0;
			public const int POSTFIXEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int POSTFIXEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int POSTFIXEXPRESSION_OPERATOR = 3;
			public const int POSTFIXEXPRESSION_OPERAND = 4;
			
			public const int PREFIXEXPRESSION = 78;
			public const int PREFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int PREFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int PREFIXEXPRESSION_COMMENTS = 0;
			public const int PREFIXEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int PREFIXEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int PREFIXEXPRESSION_OPERATOR = 3;
			public const int PREFIXEXPRESSION_OPERAND = 4;
			
			public const int PRIMITIVETYPE = 80;
			public const int PRIMITIVETYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPE_COMMENTS = 0;
			public const int PRIMITIVETYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPE_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPE_NAME = 3;
			public const int PRIMITIVETYPE_PROXY = 4;
			public const int PRIMITIVETYPE_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPE_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEBOOLEAN = 81;
			public const int PRIMITIVETYPEBOOLEAN_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEBOOLEAN_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEBOOLEAN_COMMENTS = 0;
			public const int PRIMITIVETYPEBOOLEAN_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEBOOLEAN_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEBOOLEAN_NAME = 3;
			public const int PRIMITIVETYPEBOOLEAN_PROXY = 4;
			public const int PRIMITIVETYPEBOOLEAN_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEBOOLEAN_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEBYTE = 82;
			public const int PRIMITIVETYPEBYTE_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEBYTE_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEBYTE_COMMENTS = 0;
			public const int PRIMITIVETYPEBYTE_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEBYTE_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEBYTE_NAME = 3;
			public const int PRIMITIVETYPEBYTE_PROXY = 4;
			public const int PRIMITIVETYPEBYTE_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEBYTE_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPECHAR = 83;
			public const int PRIMITIVETYPECHAR_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPECHAR_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPECHAR_COMMENTS = 0;
			public const int PRIMITIVETYPECHAR_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPECHAR_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPECHAR_NAME = 3;
			public const int PRIMITIVETYPECHAR_PROXY = 4;
			public const int PRIMITIVETYPECHAR_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPECHAR_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEDOUBLE = 84;
			public const int PRIMITIVETYPEDOUBLE_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEDOUBLE_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEDOUBLE_COMMENTS = 0;
			public const int PRIMITIVETYPEDOUBLE_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEDOUBLE_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEDOUBLE_NAME = 3;
			public const int PRIMITIVETYPEDOUBLE_PROXY = 4;
			public const int PRIMITIVETYPEDOUBLE_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEDOUBLE_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPESHORT = 85;
			public const int PRIMITIVETYPESHORT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPESHORT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPESHORT_COMMENTS = 0;
			public const int PRIMITIVETYPESHORT_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPESHORT_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPESHORT_NAME = 3;
			public const int PRIMITIVETYPESHORT_PROXY = 4;
			public const int PRIMITIVETYPESHORT_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPESHORT_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEFLOAT = 86;
			public const int PRIMITIVETYPEFLOAT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEFLOAT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEFLOAT_COMMENTS = 0;
			public const int PRIMITIVETYPEFLOAT_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEFLOAT_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEFLOAT_NAME = 3;
			public const int PRIMITIVETYPEFLOAT_PROXY = 4;
			public const int PRIMITIVETYPEFLOAT_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEFLOAT_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEINT = 87;
			public const int PRIMITIVETYPEINT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEINT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEINT_COMMENTS = 0;
			public const int PRIMITIVETYPEINT_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEINT_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEINT_NAME = 3;
			public const int PRIMITIVETYPEINT_PROXY = 4;
			public const int PRIMITIVETYPEINT_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEINT_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPELONG = 88;
			public const int PRIMITIVETYPELONG_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPELONG_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPELONG_COMMENTS = 0;
			public const int PRIMITIVETYPELONG_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPELONG_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPELONG_NAME = 3;
			public const int PRIMITIVETYPELONG_PROXY = 4;
			public const int PRIMITIVETYPELONG_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPELONG_USAGESINTYPEACCESS = 6;
			
			public const int PRIMITIVETYPEVOID = 89;
			public const int PRIMITIVETYPEVOID_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
			public const int PRIMITIVETYPEVOID_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
			
			public const int PRIMITIVETYPEVOID_COMMENTS = 0;
			public const int PRIMITIVETYPEVOID_ORIGINALCOMPILATIONUNIT = 1;
			public const int PRIMITIVETYPEVOID_ORIGINALCLASSFILE = 2;
			public const int PRIMITIVETYPEVOID_NAME = 3;
			public const int PRIMITIVETYPEVOID_PROXY = 4;
			public const int PRIMITIVETYPEVOID_USAGESINIMPORTS = 5;
			public const int PRIMITIVETYPEVOID_USAGESINTYPEACCESS = 6;
			
			public const int RETURNSTATEMENT = 90;
			public const int RETURNSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int RETURNSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int RETURNSTATEMENT_COMMENTS = 0;
			public const int RETURNSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int RETURNSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int RETURNSTATEMENT_EXPRESSION = 3;
			
			public const int SINGLEVARIABLEACCESS = 91;
			public const int SINGLEVARIABLEACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
			public const int SINGLEVARIABLEACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int SINGLEVARIABLEACCESS_COMMENTS = 0;
			public const int SINGLEVARIABLEACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int SINGLEVARIABLEACCESS_ORIGINALCLASSFILE = 2;
			public const int SINGLEVARIABLEACCESS_VARIABLE = 3;
			public const int SINGLEVARIABLEACCESS_QUALIFIER = 4;
			
			public const int SINGLEVARIABLEDECLARATION = 92;
			public const int SINGLEVARIABLEDECLARATION_FEATURE_COUNT = VARIABLEDECLARATION_FEATURE_COUNT + 7;
			public const int SINGLEVARIABLEDECLARATION_OPERATION_COUNT = VARIABLEDECLARATION_OPERATION_COUNT + 0;
			
			public const int SINGLEVARIABLEDECLARATION_COMMENTS = 0;
			public const int SINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int SINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int SINGLEVARIABLEDECLARATION_NAME = 3;
			public const int SINGLEVARIABLEDECLARATION_PROXY = 4;
			public const int SINGLEVARIABLEDECLARATION_USAGESINIMPORTS = 5;
			public const int SINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS = 6;
			public const int SINGLEVARIABLEDECLARATION_INITIALIZER = 7;
			public const int SINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS = 8;
			public const int SINGLEVARIABLEDECLARATION_MODIFIER = 9;
			public const int SINGLEVARIABLEDECLARATION_VARARGS = 10;
			public const int SINGLEVARIABLEDECLARATION_TYPE = 11;
			public const int SINGLEVARIABLEDECLARATION_ANNOTATIONS = 12;
			public const int SINGLEVARIABLEDECLARATION_METHODDECLARATION = 13;
			public const int SINGLEVARIABLEDECLARATION_CATCHCLAUSE = 14;
			public const int SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT = 15;
			
			public const int STRINGLITERAL = 94;
			public const int STRINGLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int STRINGLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int STRINGLITERAL_COMMENTS = 0;
			public const int STRINGLITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int STRINGLITERAL_ORIGINALCLASSFILE = 2;
			public const int STRINGLITERAL_ESCAPEDVALUE = 3;
			
			public const int SUPERCONSTRUCTORINVOCATION = 95;
			public const int SUPERCONSTRUCTORINVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 1;
			public const int SUPERCONSTRUCTORINVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
			
			public const int SUPERCONSTRUCTORINVOCATION_COMMENTS = 0;
			public const int SUPERCONSTRUCTORINVOCATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int SUPERCONSTRUCTORINVOCATION_ORIGINALCLASSFILE = 2;
			public const int SUPERCONSTRUCTORINVOCATION_METHOD = 3;
			public const int SUPERCONSTRUCTORINVOCATION_ARGUMENTS = 4;
			public const int SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS = 5;
			public const int SUPERCONSTRUCTORINVOCATION_EXPRESSION = 6;
			
			public const int SUPERFIELDACCESS = 96;
			public const int SUPERFIELDACCESS_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + 1;
			public const int SUPERFIELDACCESS_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + 0;
			
			public const int SUPERFIELDACCESS_COMMENTS = 0;
			public const int SUPERFIELDACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int SUPERFIELDACCESS_ORIGINALCLASSFILE = 2;
			public const int SUPERFIELDACCESS_QUALIFIER = 3;
			public const int SUPERFIELDACCESS_FIELD = 4;
			
			public const int SUPERMETHODINVOCATION = 97;
			public const int SUPERMETHODINVOCATION_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 0;
			public const int SUPERMETHODINVOCATION_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
			
			public const int SUPERMETHODINVOCATION_COMMENTS = 0;
			public const int SUPERMETHODINVOCATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int SUPERMETHODINVOCATION_ORIGINALCLASSFILE = 2;
			public const int SUPERMETHODINVOCATION_QUALIFIER = 3;
			public const int SUPERMETHODINVOCATION_METHOD = 4;
			public const int SUPERMETHODINVOCATION_ARGUMENTS = 5;
			public const int SUPERMETHODINVOCATION_TYPEARGUMENTS = 6;
			
			public const int SWITCHCASE = 98;
			public const int SWITCHCASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int SWITCHCASE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int SWITCHCASE_COMMENTS = 0;
			public const int SWITCHCASE_ORIGINALCOMPILATIONUNIT = 1;
			public const int SWITCHCASE_ORIGINALCLASSFILE = 2;
			public const int SWITCHCASE_DEFAULT = 3;
			public const int SWITCHCASE_EXPRESSION = 4;
			
			public const int SWITCHSTATEMENT = 99;
			public const int SWITCHSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int SWITCHSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int SWITCHSTATEMENT_COMMENTS = 0;
			public const int SWITCHSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int SWITCHSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int SWITCHSTATEMENT_EXPRESSION = 3;
			public const int SWITCHSTATEMENT_STATEMENTS = 4;
			
			public const int SYNCHRONIZEDSTATEMENT = 100;
			public const int SYNCHRONIZEDSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int SYNCHRONIZEDSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int SYNCHRONIZEDSTATEMENT_COMMENTS = 0;
			public const int SYNCHRONIZEDSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int SYNCHRONIZEDSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int SYNCHRONIZEDSTATEMENT_BODY = 3;
			public const int SYNCHRONIZEDSTATEMENT_EXPRESSION = 4;
			
			public const int TAGELEMENT = 101;
			public const int TAGELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
			public const int TAGELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int TAGELEMENT_COMMENTS = 0;
			public const int TAGELEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int TAGELEMENT_ORIGINALCLASSFILE = 2;
			public const int TAGELEMENT_TAGNAME = 3;
			public const int TAGELEMENT_FRAGMENTS = 4;
			
			public const int TEXTELEMENT = 102;
			public const int TEXTELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 1;
			public const int TEXTELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
			
			public const int TEXTELEMENT_COMMENTS = 0;
			public const int TEXTELEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int TEXTELEMENT_ORIGINALCLASSFILE = 2;
			public const int TEXTELEMENT_TEXT = 3;
			
			public const int THISEXPRESSION = 103;
			public const int THISEXPRESSION_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + 0;
			public const int THISEXPRESSION_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + 0;
			
			public const int THISEXPRESSION_COMMENTS = 0;
			public const int THISEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int THISEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int THISEXPRESSION_QUALIFIER = 3;
			
			public const int THROWSTATEMENT = 104;
			public const int THROWSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int THROWSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int THROWSTATEMENT_COMMENTS = 0;
			public const int THROWSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int THROWSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int THROWSTATEMENT_EXPRESSION = 3;
			
			public const int TRYSTATEMENT = 105;
			public const int TRYSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
			public const int TRYSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int TRYSTATEMENT_COMMENTS = 0;
			public const int TRYSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int TRYSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int TRYSTATEMENT_BODY = 3;
			public const int TRYSTATEMENT_FINALLY = 4;
			public const int TRYSTATEMENT_CATCHCLAUSES = 5;
			
			public const int TYPEACCESS = 107;
			public const int TYPEACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + NAMESPACEACCESS_FEATURE_COUNT + 2;
			public const int TYPEACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + NAMESPACEACCESS_OPERATION_COUNT + 0;
			
			public const int TYPEACCESS_COMMENTS = 0;
			public const int TYPEACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPEACCESS_ORIGINALCLASSFILE = 2;
			public const int TYPEACCESS_TYPE = 3;
			public const int TYPEACCESS_QUALIFIER = 4;
			
			public const int TYPEDECLARATIONSTATEMENT = 109;
			public const int TYPEDECLARATIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
			public const int TYPEDECLARATIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int TYPEDECLARATIONSTATEMENT_COMMENTS = 0;
			public const int TYPEDECLARATIONSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPEDECLARATIONSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int TYPEDECLARATIONSTATEMENT_DECLARATION = 3;
			
			public const int TYPELITERAL = 110;
			public const int TYPELITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
			public const int TYPELITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
			
			public const int TYPELITERAL_COMMENTS = 0;
			public const int TYPELITERAL_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPELITERAL_ORIGINALCLASSFILE = 2;
			public const int TYPELITERAL_TYPE = 3;
			
			public const int TYPEPARAMETER = 111;
			public const int TYPEPARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;
			public const int TYPEPARAMETER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
			
			public const int TYPEPARAMETER_COMMENTS = 0;
			public const int TYPEPARAMETER_ORIGINALCOMPILATIONUNIT = 1;
			public const int TYPEPARAMETER_ORIGINALCLASSFILE = 2;
			public const int TYPEPARAMETER_NAME = 3;
			public const int TYPEPARAMETER_PROXY = 4;
			public const int TYPEPARAMETER_USAGESINIMPORTS = 5;
			public const int TYPEPARAMETER_USAGESINTYPEACCESS = 6;
			public const int TYPEPARAMETER_BOUNDS = 7;
			
			public const int UNRESOLVEDITEM = 112;
			public const int UNRESOLVEDITEM_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 0;
			public const int UNRESOLVEDITEM_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDITEM_COMMENTS = 0;
			public const int UNRESOLVEDITEM_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDITEM_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDITEM_NAME = 3;
			public const int UNRESOLVEDITEM_PROXY = 4;
			public const int UNRESOLVEDITEM_USAGESINIMPORTS = 5;
			
			public const int UNRESOLVEDITEMACCESS = 113;
			public const int UNRESOLVEDITEMACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + NAMESPACEACCESS_FEATURE_COUNT + 2;
			public const int UNRESOLVEDITEMACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + NAMESPACEACCESS_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDITEMACCESS_COMMENTS = 0;
			public const int UNRESOLVEDITEMACCESS_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDITEMACCESS_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDITEMACCESS_ELEMENT = 3;
			public const int UNRESOLVEDITEMACCESS_QUALIFIER = 4;
			
			public const int UNRESOLVEDANNOTATIONDECLARATION = 114;
			public const int UNRESOLVEDANNOTATIONDECLARATION_FEATURE_COUNT = ANNOTATIONTYPEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDANNOTATIONDECLARATION_OPERATION_COUNT = ANNOTATIONTYPEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDANNOTATIONDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDANNOTATIONDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDANNOTATIONDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDANNOTATIONDECLARATION_NAME = 3;
			public const int UNRESOLVEDANNOTATIONDECLARATION_PROXY = 4;
			public const int UNRESOLVEDANNOTATIONDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDANNOTATIONDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDANNOTATIONDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDANNOTATIONDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDANNOTATIONDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDANNOTATIONDECLARATION_USAGESINTYPEACCESS = 10;
			public const int UNRESOLVEDANNOTATIONDECLARATION_BODYDECLARATIONS = 11;
			public const int UNRESOLVEDANNOTATIONDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int UNRESOLVEDANNOTATIONDECLARATION_COMMENTSAFTERBODY = 13;
			public const int UNRESOLVEDANNOTATIONDECLARATION_PACKAGE = 14;
			public const int UNRESOLVEDANNOTATIONDECLARATION_SUPERINTERFACES = 15;
			
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION = 115;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT = ANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT = ANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_NAME = 3;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_PROXY = 4;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_DEFAULT = 10;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_TYPE = 11;
			public const int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_USAGES = 12;
			
			public const int UNRESOLVEDCLASSDECLARATION = 116;
			public const int UNRESOLVEDCLASSDECLARATION_FEATURE_COUNT = CLASSDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDCLASSDECLARATION_OPERATION_COUNT = CLASSDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDCLASSDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDCLASSDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDCLASSDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDCLASSDECLARATION_NAME = 3;
			public const int UNRESOLVEDCLASSDECLARATION_PROXY = 4;
			public const int UNRESOLVEDCLASSDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDCLASSDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDCLASSDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDCLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDCLASSDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDCLASSDECLARATION_USAGESINTYPEACCESS = 10;
			public const int UNRESOLVEDCLASSDECLARATION_BODYDECLARATIONS = 11;
			public const int UNRESOLVEDCLASSDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int UNRESOLVEDCLASSDECLARATION_COMMENTSAFTERBODY = 13;
			public const int UNRESOLVEDCLASSDECLARATION_PACKAGE = 14;
			public const int UNRESOLVEDCLASSDECLARATION_SUPERINTERFACES = 15;
			public const int UNRESOLVEDCLASSDECLARATION_TYPEPARAMETERS = 16;
			public const int UNRESOLVEDCLASSDECLARATION_SUPERCLASS = 17;
			
			public const int UNRESOLVEDENUMDECLARATION = 117;
			public const int UNRESOLVEDENUMDECLARATION_FEATURE_COUNT = ENUMDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDENUMDECLARATION_OPERATION_COUNT = ENUMDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDENUMDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDENUMDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDENUMDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDENUMDECLARATION_NAME = 3;
			public const int UNRESOLVEDENUMDECLARATION_PROXY = 4;
			public const int UNRESOLVEDENUMDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDENUMDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDENUMDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDENUMDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDENUMDECLARATION_USAGESINTYPEACCESS = 10;
			public const int UNRESOLVEDENUMDECLARATION_BODYDECLARATIONS = 11;
			public const int UNRESOLVEDENUMDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int UNRESOLVEDENUMDECLARATION_COMMENTSAFTERBODY = 13;
			public const int UNRESOLVEDENUMDECLARATION_PACKAGE = 14;
			public const int UNRESOLVEDENUMDECLARATION_SUPERINTERFACES = 15;
			public const int UNRESOLVEDENUMDECLARATION_ENUMCONSTANTS = 16;
			
			public const int UNRESOLVEDINTERFACEDECLARATION = 118;
			public const int UNRESOLVEDINTERFACEDECLARATION_FEATURE_COUNT = INTERFACEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDINTERFACEDECLARATION_OPERATION_COUNT = INTERFACEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDINTERFACEDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDINTERFACEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDINTERFACEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDINTERFACEDECLARATION_NAME = 3;
			public const int UNRESOLVEDINTERFACEDECLARATION_PROXY = 4;
			public const int UNRESOLVEDINTERFACEDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDINTERFACEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDINTERFACEDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDINTERFACEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDINTERFACEDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDINTERFACEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int UNRESOLVEDINTERFACEDECLARATION_BODYDECLARATIONS = 11;
			public const int UNRESOLVEDINTERFACEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int UNRESOLVEDINTERFACEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int UNRESOLVEDINTERFACEDECLARATION_PACKAGE = 14;
			public const int UNRESOLVEDINTERFACEDECLARATION_SUPERINTERFACES = 15;
			public const int UNRESOLVEDINTERFACEDECLARATION_TYPEPARAMETERS = 16;
			
			public const int UNRESOLVEDLABELEDSTATEMENT = 119;
			public const int UNRESOLVEDLABELEDSTATEMENT_FEATURE_COUNT = LABELEDSTATEMENT_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDLABELEDSTATEMENT_OPERATION_COUNT = LABELEDSTATEMENT_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDLABELEDSTATEMENT_COMMENTS = 0;
			public const int UNRESOLVEDLABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDLABELEDSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDLABELEDSTATEMENT_NAME = 3;
			public const int UNRESOLVEDLABELEDSTATEMENT_PROXY = 4;
			public const int UNRESOLVEDLABELEDSTATEMENT_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDLABELEDSTATEMENT_BODY = 6;
			public const int UNRESOLVEDLABELEDSTATEMENT_USAGESINBREAKSTATEMENTS = 7;
			public const int UNRESOLVEDLABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS = 8;
			
			public const int UNRESOLVEDMETHODDECLARATION = 120;
			public const int UNRESOLVEDMETHODDECLARATION_FEATURE_COUNT = METHODDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDMETHODDECLARATION_OPERATION_COUNT = METHODDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDMETHODDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDMETHODDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDMETHODDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDMETHODDECLARATION_NAME = 3;
			public const int UNRESOLVEDMETHODDECLARATION_PROXY = 4;
			public const int UNRESOLVEDMETHODDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDMETHODDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDMETHODDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDMETHODDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDMETHODDECLARATION_BODY = 10;
			public const int UNRESOLVEDMETHODDECLARATION_PARAMETERS = 11;
			public const int UNRESOLVEDMETHODDECLARATION_THROWNEXCEPTIONS = 12;
			public const int UNRESOLVEDMETHODDECLARATION_TYPEPARAMETERS = 13;
			public const int UNRESOLVEDMETHODDECLARATION_USAGESINDOCCOMMENTS = 14;
			public const int UNRESOLVEDMETHODDECLARATION_USAGES = 15;
			public const int UNRESOLVEDMETHODDECLARATION_EXTRAARRAYDIMENSIONS = 16;
			public const int UNRESOLVEDMETHODDECLARATION_RETURNTYPE = 17;
			public const int UNRESOLVEDMETHODDECLARATION_REDEFINEDMETHODDECLARATION = 18;
			public const int UNRESOLVEDMETHODDECLARATION_REDEFINITIONS = 19;
			
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION = 121;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_FEATURE_COUNT = SINGLEVARIABLEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_OPERATION_COUNT = SINGLEVARIABLEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_NAME = 3;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_PROXY = 4;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS = 6;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_INITIALIZER = 7;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS = 8;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_VARARGS = 10;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_TYPE = 11;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_ANNOTATIONS = 12;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_METHODDECLARATION = 13;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_CATCHCLAUSE = 14;
			public const int UNRESOLVEDSINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT = 15;
			
			public const int UNRESOLVEDTYPE = 122;
			public const int UNRESOLVEDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDTYPE_COMMENTS = 0;
			public const int UNRESOLVEDTYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDTYPE_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDTYPE_NAME = 3;
			public const int UNRESOLVEDTYPE_PROXY = 4;
			public const int UNRESOLVEDTYPE_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDTYPE_USAGESINTYPEACCESS = 6;
			
			public const int UNRESOLVEDTYPEDECLARATION = 123;
			public const int UNRESOLVEDTYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDTYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDTYPEDECLARATION_COMMENTS = 0;
			public const int UNRESOLVEDTYPEDECLARATION_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDTYPEDECLARATION_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDTYPEDECLARATION_NAME = 3;
			public const int UNRESOLVEDTYPEDECLARATION_PROXY = 4;
			public const int UNRESOLVEDTYPEDECLARATION_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDTYPEDECLARATION_ABSTRACTTYPEDECLARATION = 6;
			public const int UNRESOLVEDTYPEDECLARATION_ANNOTATIONS = 7;
			public const int UNRESOLVEDTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = 8;
			public const int UNRESOLVEDTYPEDECLARATION_MODIFIER = 9;
			public const int UNRESOLVEDTYPEDECLARATION_USAGESINTYPEACCESS = 10;
			public const int UNRESOLVEDTYPEDECLARATION_BODYDECLARATIONS = 11;
			public const int UNRESOLVEDTYPEDECLARATION_COMMENTSBEFOREBODY = 12;
			public const int UNRESOLVEDTYPEDECLARATION_COMMENTSAFTERBODY = 13;
			public const int UNRESOLVEDTYPEDECLARATION_PACKAGE = 14;
			public const int UNRESOLVEDTYPEDECLARATION_SUPERINTERFACES = 15;
			
			public const int VARIABLEDECLARATIONFRAGMENT = 127;
			public const int VARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT = VARIABLEDECLARATION_FEATURE_COUNT + 1;
			public const int VARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT = VARIABLEDECLARATION_OPERATION_COUNT + 0;
			
			public const int VARIABLEDECLARATIONFRAGMENT_COMMENTS = 0;
			public const int VARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int VARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE = 2;
			public const int VARIABLEDECLARATIONFRAGMENT_NAME = 3;
			public const int VARIABLEDECLARATIONFRAGMENT_PROXY = 4;
			public const int VARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS = 5;
			public const int VARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS = 6;
			public const int VARIABLEDECLARATIONFRAGMENT_INITIALIZER = 7;
			public const int VARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS = 8;
			public const int VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER = 9;
			
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT = 124;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT = VARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT = VARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
			
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_COMMENTS = 0;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE = 2;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_NAME = 3;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_PROXY = 4;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS = 5;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS = 6;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_INITIALIZER = 7;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS = 8;
			public const int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER = 9;
			
			public const int VARIABLEDECLARATIONEXPRESSION = 126;
			public const int VARIABLEDECLARATIONEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 2;
			public const int VARIABLEDECLARATIONEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
			
			public const int VARIABLEDECLARATIONEXPRESSION_COMMENTS = 0;
			public const int VARIABLEDECLARATIONEXPRESSION_ORIGINALCOMPILATIONUNIT = 1;
			public const int VARIABLEDECLARATIONEXPRESSION_ORIGINALCLASSFILE = 2;
			public const int VARIABLEDECLARATIONEXPRESSION_TYPE = 3;
			public const int VARIABLEDECLARATIONEXPRESSION_FRAGMENTS = 4;
			public const int VARIABLEDECLARATIONEXPRESSION_MODIFIER = 5;
			public const int VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS = 6;
			
			public const int VARIABLEDECLARATIONSTATEMENT = 128;
			public const int VARIABLEDECLARATIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 3;
			public const int VARIABLEDECLARATIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
			
			public const int VARIABLEDECLARATIONSTATEMENT_COMMENTS = 0;
			public const int VARIABLEDECLARATIONSTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int VARIABLEDECLARATIONSTATEMENT_ORIGINALCLASSFILE = 2;
			public const int VARIABLEDECLARATIONSTATEMENT_TYPE = 3;
			public const int VARIABLEDECLARATIONSTATEMENT_FRAGMENTS = 4;
			public const int VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS = 5;
			public const int VARIABLEDECLARATIONSTATEMENT_MODIFIER = 6;
			public const int VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS = 7;
			
			public const int WILDCARDTYPE = 130;
			public const int WILDCARDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
			public const int WILDCARDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
			
			public const int WILDCARDTYPE_COMMENTS = 0;
			public const int WILDCARDTYPE_ORIGINALCOMPILATIONUNIT = 1;
			public const int WILDCARDTYPE_ORIGINALCLASSFILE = 2;
			public const int WILDCARDTYPE_NAME = 3;
			public const int WILDCARDTYPE_PROXY = 4;
			public const int WILDCARDTYPE_USAGESINIMPORTS = 5;
			public const int WILDCARDTYPE_USAGESINTYPEACCESS = 6;
			public const int WILDCARDTYPE_UPPERBOUND = 7;
			public const int WILDCARDTYPE_BOUND = 8;
			
			public const int WHILESTATEMENT = 131;
			public const int WHILESTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
			public const int WHILESTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
			
			public const int WHILESTATEMENT_COMMENTS = 0;
			public const int WHILESTATEMENT_ORIGINALCOMPILATIONUNIT = 1;
			public const int WHILESTATEMENT_ORIGINALCLASSFILE = 2;
			public const int WHILESTATEMENT_EXPRESSION = 3;
			public const int WHILESTATEMENT_BODY = 4;
			
			public const int ASSIGNMENTKIND = 19;
			public const int INFIXEXPRESSIONKIND = 50;
			public const int INHERITANCEKIND = 51;
			public const int POSTFIXEXPRESSIONKIND = 77;
			public const int PREFIXEXPRESSIONKIND = 79;
			public const int VISIBILITYKIND = 129;
			
			
			public EClass getASTNode(){return ASTNodeEClass;}
			
			public EReference getASTNode_Comments(){return (EReference)ASTNodeEClass.eStructuralFeatures.at(0);}
			public EReference getASTNode_OriginalCompilationUnit(){return (EReference)ASTNodeEClass.eStructuralFeatures.at(1);}
			public EReference getASTNode_OriginalClassFile(){return (EReference)ASTNodeEClass.eStructuralFeatures.at(2);}
			public EClass getNamedElement(){return NamedElementEClass;}
			
			public EAttribute getNamedElement_Name(){return (EAttribute)NamedElementEClass.eStructuralFeatures.at(0);}
			public EAttribute getNamedElement_Proxy(){return (EAttribute)NamedElementEClass.eStructuralFeatures.at(1);}
			public EReference getNamedElement_UsagesInImports(){return (EReference)NamedElementEClass.eStructuralFeatures.at(2);}
			public EClass getBodyDeclaration(){return BodyDeclarationEClass;}
			
			public EReference getBodyDeclaration_AbstractTypeDeclaration(){return (EReference)BodyDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getBodyDeclaration_Annotations(){return (EReference)BodyDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getBodyDeclaration_AnonymousClassDeclarationOwner(){return (EReference)BodyDeclarationEClass.eStructuralFeatures.at(2);}
			public EReference getBodyDeclaration_Modifier(){return (EReference)BodyDeclarationEClass.eStructuralFeatures.at(3);}
			public EClass getAbstractMethodDeclaration(){return AbstractMethodDeclarationEClass;}
			
			public EReference getAbstractMethodDeclaration_Body(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getAbstractMethodDeclaration_Parameters(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getAbstractMethodDeclaration_ThrownExceptions(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(2);}
			public EReference getAbstractMethodDeclaration_TypeParameters(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(3);}
			public EReference getAbstractMethodDeclaration_UsagesInDocComments(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(4);}
			public EReference getAbstractMethodDeclaration_Usages(){return (EReference)AbstractMethodDeclarationEClass.eStructuralFeatures.at(5);}
			public EClass getAbstractMethodInvocation(){return AbstractMethodInvocationEClass;}
			
			public EReference getAbstractMethodInvocation_Method(){return (EReference)AbstractMethodInvocationEClass.eStructuralFeatures.at(0);}
			public EReference getAbstractMethodInvocation_Arguments(){return (EReference)AbstractMethodInvocationEClass.eStructuralFeatures.at(1);}
			public EReference getAbstractMethodInvocation_TypeArguments(){return (EReference)AbstractMethodInvocationEClass.eStructuralFeatures.at(2);}
			public EClass getType(){return TypeEClass;}
			
			public EReference getType_UsagesInTypeAccess(){return (EReference)TypeEClass.eStructuralFeatures.at(0);}
			public EClass getAbstractTypeDeclaration(){return AbstractTypeDeclarationEClass;}
			
			public EReference getAbstractTypeDeclaration_BodyDeclarations(){return (EReference)AbstractTypeDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getAbstractTypeDeclaration_CommentsBeforeBody(){return (EReference)AbstractTypeDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getAbstractTypeDeclaration_CommentsAfterBody(){return (EReference)AbstractTypeDeclarationEClass.eStructuralFeatures.at(2);}
			public EReference getAbstractTypeDeclaration_Package(){return (EReference)AbstractTypeDeclarationEClass.eStructuralFeatures.at(3);}
			public EReference getAbstractTypeDeclaration_SuperInterfaces(){return (EReference)AbstractTypeDeclarationEClass.eStructuralFeatures.at(4);}
			public EClass getExpression(){return ExpressionEClass;}
			
			public EClass getAbstractTypeQualifiedExpression(){return AbstractTypeQualifiedExpressionEClass;}
			
			public EReference getAbstractTypeQualifiedExpression_Qualifier(){return (EReference)AbstractTypeQualifiedExpressionEClass.eStructuralFeatures.at(0);}
			public EClass getAbstractVariablesContainer(){return AbstractVariablesContainerEClass;}
			
			public EReference getAbstractVariablesContainer_Type(){return (EReference)AbstractVariablesContainerEClass.eStructuralFeatures.at(0);}
			public EReference getAbstractVariablesContainer_Fragments(){return (EReference)AbstractVariablesContainerEClass.eStructuralFeatures.at(1);}
			public EClass getAnnotation(){return AnnotationEClass;}
			
			public EReference getAnnotation_Type(){return (EReference)AnnotationEClass.eStructuralFeatures.at(0);}
			public EReference getAnnotation_Values(){return (EReference)AnnotationEClass.eStructuralFeatures.at(1);}
			public EClass getArchive(){return ArchiveEClass;}
			
			public EAttribute getArchive_OriginalFilePath(){return (EAttribute)ArchiveEClass.eStructuralFeatures.at(0);}
			public EReference getArchive_ClassFiles(){return (EReference)ArchiveEClass.eStructuralFeatures.at(1);}
			public EReference getArchive_Manifest(){return (EReference)ArchiveEClass.eStructuralFeatures.at(2);}
			public EClass getStatement(){return StatementEClass;}
			
			public EClass getAssertStatement(){return AssertStatementEClass;}
			
			public EReference getAssertStatement_Message(){return (EReference)AssertStatementEClass.eStructuralFeatures.at(0);}
			public EReference getAssertStatement_Expression(){return (EReference)AssertStatementEClass.eStructuralFeatures.at(1);}
			public EClass getAnnotationMemberValuePair(){return AnnotationMemberValuePairEClass;}
			
			public EReference getAnnotationMemberValuePair_Member(){return (EReference)AnnotationMemberValuePairEClass.eStructuralFeatures.at(0);}
			public EReference getAnnotationMemberValuePair_Value(){return (EReference)AnnotationMemberValuePairEClass.eStructuralFeatures.at(1);}
			public EClass getAnnotationTypeDeclaration(){return AnnotationTypeDeclarationEClass;}
			
			public EClass getAnnotationTypeMemberDeclaration(){return AnnotationTypeMemberDeclarationEClass;}
			
			public EReference getAnnotationTypeMemberDeclaration_Default(){return (EReference)AnnotationTypeMemberDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getAnnotationTypeMemberDeclaration_Type(){return (EReference)AnnotationTypeMemberDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getAnnotationTypeMemberDeclaration_Usages(){return (EReference)AnnotationTypeMemberDeclarationEClass.eStructuralFeatures.at(2);}
			public EClass getAnonymousClassDeclaration(){return AnonymousClassDeclarationEClass;}
			
			public EReference getAnonymousClassDeclaration_BodyDeclarations(){return (EReference)AnonymousClassDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getAnonymousClassDeclaration_ClassInstanceCreation(){return (EReference)AnonymousClassDeclarationEClass.eStructuralFeatures.at(1);}
			public EClass getArrayAccess(){return ArrayAccessEClass;}
			
			public EReference getArrayAccess_Array(){return (EReference)ArrayAccessEClass.eStructuralFeatures.at(0);}
			public EReference getArrayAccess_Index(){return (EReference)ArrayAccessEClass.eStructuralFeatures.at(1);}
			public EClass getArrayCreation(){return ArrayCreationEClass;}
			
			public EReference getArrayCreation_Dimensions(){return (EReference)ArrayCreationEClass.eStructuralFeatures.at(0);}
			public EReference getArrayCreation_Initializer(){return (EReference)ArrayCreationEClass.eStructuralFeatures.at(1);}
			public EReference getArrayCreation_Type(){return (EReference)ArrayCreationEClass.eStructuralFeatures.at(2);}
			public EClass getArrayInitializer(){return ArrayInitializerEClass;}
			
			public EReference getArrayInitializer_Expressions(){return (EReference)ArrayInitializerEClass.eStructuralFeatures.at(0);}
			public EClass getArrayLengthAccess(){return ArrayLengthAccessEClass;}
			
			public EReference getArrayLengthAccess_Array(){return (EReference)ArrayLengthAccessEClass.eStructuralFeatures.at(0);}
			public EClass getArrayType(){return ArrayTypeEClass;}
			
			public EAttribute getArrayType_Dimensions(){return (EAttribute)ArrayTypeEClass.eStructuralFeatures.at(0);}
			public EReference getArrayType_ElementType(){return (EReference)ArrayTypeEClass.eStructuralFeatures.at(1);}
			public EClass getAssignment(){return AssignmentEClass;}
			
			public EReference getAssignment_LeftHandSide(){return (EReference)AssignmentEClass.eStructuralFeatures.at(0);}
			public EAttribute getAssignment_Operator(){return (EAttribute)AssignmentEClass.eStructuralFeatures.at(1);}
			public EReference getAssignment_RightHandSide(){return (EReference)AssignmentEClass.eStructuralFeatures.at(2);}
			public EClass getBooleanLiteral(){return BooleanLiteralEClass;}
			
			public EAttribute getBooleanLiteral_Value(){return (EAttribute)BooleanLiteralEClass.eStructuralFeatures.at(0);}
			public EClass getComment(){return CommentEClass;}
			
			public EAttribute getComment_Content(){return (EAttribute)CommentEClass.eStructuralFeatures.at(0);}
			public EAttribute getComment_EnclosedByParent(){return (EAttribute)CommentEClass.eStructuralFeatures.at(1);}
			public EAttribute getComment_PrefixOfParent(){return (EAttribute)CommentEClass.eStructuralFeatures.at(2);}
			public EClass getBlockComment(){return BlockCommentEClass;}
			
			public EClass getBlock(){return BlockEClass;}
			
			public EReference getBlock_Statements(){return (EReference)BlockEClass.eStructuralFeatures.at(0);}
			public EClass getBreakStatement(){return BreakStatementEClass;}
			
			public EReference getBreakStatement_Label(){return (EReference)BreakStatementEClass.eStructuralFeatures.at(0);}
			public EClass getCastExpression(){return CastExpressionEClass;}
			
			public EReference getCastExpression_Expression(){return (EReference)CastExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getCastExpression_Type(){return (EReference)CastExpressionEClass.eStructuralFeatures.at(1);}
			public EClass getCatchClause(){return CatchClauseEClass;}
			
			public EReference getCatchClause_Exception(){return (EReference)CatchClauseEClass.eStructuralFeatures.at(0);}
			public EReference getCatchClause_Body(){return (EReference)CatchClauseEClass.eStructuralFeatures.at(1);}
			public EClass getCharacterLiteral(){return CharacterLiteralEClass;}
			
			public EAttribute getCharacterLiteral_EscapedValue(){return (EAttribute)CharacterLiteralEClass.eStructuralFeatures.at(0);}
			public EClass getClassFile(){return ClassFileEClass;}
			
			public EAttribute getClassFile_OriginalFilePath(){return (EAttribute)ClassFileEClass.eStructuralFeatures.at(0);}
			public EReference getClassFile_Type(){return (EReference)ClassFileEClass.eStructuralFeatures.at(1);}
			public EReference getClassFile_AttachedSource(){return (EReference)ClassFileEClass.eStructuralFeatures.at(2);}
			public EReference getClassFile_Package(){return (EReference)ClassFileEClass.eStructuralFeatures.at(3);}
			public EClass getClassInstanceCreation(){return ClassInstanceCreationEClass;}
			
			public EReference getClassInstanceCreation_AnonymousClassDeclaration(){return (EReference)ClassInstanceCreationEClass.eStructuralFeatures.at(0);}
			public EReference getClassInstanceCreation_Expression(){return (EReference)ClassInstanceCreationEClass.eStructuralFeatures.at(1);}
			public EReference getClassInstanceCreation_Type(){return (EReference)ClassInstanceCreationEClass.eStructuralFeatures.at(2);}
			public EClass getConstructorDeclaration(){return ConstructorDeclarationEClass;}
			
			public EClass getConditionalExpression(){return ConditionalExpressionEClass;}
			
			public EReference getConditionalExpression_ElseExpression(){return (EReference)ConditionalExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getConditionalExpression_Expression(){return (EReference)ConditionalExpressionEClass.eStructuralFeatures.at(1);}
			public EReference getConditionalExpression_ThenExpression(){return (EReference)ConditionalExpressionEClass.eStructuralFeatures.at(2);}
			public EClass getConstructorInvocation(){return ConstructorInvocationEClass;}
			
			public EClass getTypeDeclaration(){return TypeDeclarationEClass;}
			
			public EReference getTypeDeclaration_TypeParameters(){return (EReference)TypeDeclarationEClass.eStructuralFeatures.at(0);}
			public EClass getClassDeclaration(){return ClassDeclarationEClass;}
			
			public EReference getClassDeclaration_SuperClass(){return (EReference)ClassDeclarationEClass.eStructuralFeatures.at(0);}
			public EClass getCompilationUnit(){return CompilationUnitEClass;}
			
			public EAttribute getCompilationUnit_OriginalFilePath(){return (EAttribute)CompilationUnitEClass.eStructuralFeatures.at(0);}
			public EReference getCompilationUnit_CommentList(){return (EReference)CompilationUnitEClass.eStructuralFeatures.at(1);}
			public EReference getCompilationUnit_Imports(){return (EReference)CompilationUnitEClass.eStructuralFeatures.at(2);}
			public EReference getCompilationUnit_Package(){return (EReference)CompilationUnitEClass.eStructuralFeatures.at(3);}
			public EReference getCompilationUnit_Types(){return (EReference)CompilationUnitEClass.eStructuralFeatures.at(4);}
			public EClass getContinueStatement(){return ContinueStatementEClass;}
			
			public EReference getContinueStatement_Label(){return (EReference)ContinueStatementEClass.eStructuralFeatures.at(0);}
			public EClass getDoStatement(){return DoStatementEClass;}
			
			public EReference getDoStatement_Expression(){return (EReference)DoStatementEClass.eStructuralFeatures.at(0);}
			public EReference getDoStatement_Body(){return (EReference)DoStatementEClass.eStructuralFeatures.at(1);}
			public EClass getEmptyStatement(){return EmptyStatementEClass;}
			
			public EClass getEnhancedForStatement(){return EnhancedForStatementEClass;}
			
			public EReference getEnhancedForStatement_Body(){return (EReference)EnhancedForStatementEClass.eStructuralFeatures.at(0);}
			public EReference getEnhancedForStatement_Expression(){return (EReference)EnhancedForStatementEClass.eStructuralFeatures.at(1);}
			public EReference getEnhancedForStatement_Parameter(){return (EReference)EnhancedForStatementEClass.eStructuralFeatures.at(2);}
			public EClass getVariableDeclaration(){return VariableDeclarationEClass;}
			
			public EAttribute getVariableDeclaration_ExtraArrayDimensions(){return (EAttribute)VariableDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getVariableDeclaration_Initializer(){return (EReference)VariableDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getVariableDeclaration_UsageInVariableAccess(){return (EReference)VariableDeclarationEClass.eStructuralFeatures.at(2);}
			public EClass getEnumConstantDeclaration(){return EnumConstantDeclarationEClass;}
			
			public EReference getEnumConstantDeclaration_AnonymousClassDeclaration(){return (EReference)EnumConstantDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getEnumConstantDeclaration_Arguments(){return (EReference)EnumConstantDeclarationEClass.eStructuralFeatures.at(1);}
			public EClass getEnumDeclaration(){return EnumDeclarationEClass;}
			
			public EReference getEnumDeclaration_EnumConstants(){return (EReference)EnumDeclarationEClass.eStructuralFeatures.at(0);}
			public EClass getExpressionStatement(){return ExpressionStatementEClass;}
			
			public EReference getExpressionStatement_Expression(){return (EReference)ExpressionStatementEClass.eStructuralFeatures.at(0);}
			public EClass getFieldAccess(){return FieldAccessEClass;}
			
			public EReference getFieldAccess_Field(){return (EReference)FieldAccessEClass.eStructuralFeatures.at(0);}
			public EReference getFieldAccess_Expression(){return (EReference)FieldAccessEClass.eStructuralFeatures.at(1);}
			public EClass getFieldDeclaration(){return FieldDeclarationEClass;}
			
			public EClass getForStatement(){return ForStatementEClass;}
			
			public EReference getForStatement_Expression(){return (EReference)ForStatementEClass.eStructuralFeatures.at(0);}
			public EReference getForStatement_Updaters(){return (EReference)ForStatementEClass.eStructuralFeatures.at(1);}
			public EReference getForStatement_Initializers(){return (EReference)ForStatementEClass.eStructuralFeatures.at(2);}
			public EReference getForStatement_Body(){return (EReference)ForStatementEClass.eStructuralFeatures.at(3);}
			public EClass getIfStatement(){return IfStatementEClass;}
			
			public EReference getIfStatement_Expression(){return (EReference)IfStatementEClass.eStructuralFeatures.at(0);}
			public EReference getIfStatement_ThenStatement(){return (EReference)IfStatementEClass.eStructuralFeatures.at(1);}
			public EReference getIfStatement_ElseStatement(){return (EReference)IfStatementEClass.eStructuralFeatures.at(2);}
			public EClass getImportDeclaration(){return ImportDeclarationEClass;}
			
			public EAttribute getImportDeclaration_Static(){return (EAttribute)ImportDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getImportDeclaration_ImportedElement(){return (EReference)ImportDeclarationEClass.eStructuralFeatures.at(1);}
			public EClass getInfixExpression(){return InfixExpressionEClass;}
			
			public EAttribute getInfixExpression_Operator(){return (EAttribute)InfixExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getInfixExpression_RightOperand(){return (EReference)InfixExpressionEClass.eStructuralFeatures.at(1);}
			public EReference getInfixExpression_LeftOperand(){return (EReference)InfixExpressionEClass.eStructuralFeatures.at(2);}
			public EReference getInfixExpression_ExtendedOperands(){return (EReference)InfixExpressionEClass.eStructuralFeatures.at(3);}
			public EClass getInitializer(){return InitializerEClass;}
			
			public EReference getInitializer_Body(){return (EReference)InitializerEClass.eStructuralFeatures.at(0);}
			public EClass getInstanceofExpression(){return InstanceofExpressionEClass;}
			
			public EReference getInstanceofExpression_RightOperand(){return (EReference)InstanceofExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getInstanceofExpression_LeftOperand(){return (EReference)InstanceofExpressionEClass.eStructuralFeatures.at(1);}
			public EClass getInterfaceDeclaration(){return InterfaceDeclarationEClass;}
			
			public EClass getJavadoc(){return JavadocEClass;}
			
			public EReference getJavadoc_Tags(){return (EReference)JavadocEClass.eStructuralFeatures.at(0);}
			public EClass getLabeledStatement(){return LabeledStatementEClass;}
			
			public EReference getLabeledStatement_Body(){return (EReference)LabeledStatementEClass.eStructuralFeatures.at(0);}
			public EReference getLabeledStatement_UsagesInBreakStatements(){return (EReference)LabeledStatementEClass.eStructuralFeatures.at(1);}
			public EReference getLabeledStatement_UsagesInContinueStatements(){return (EReference)LabeledStatementEClass.eStructuralFeatures.at(2);}
			public EClass getLineComment(){return LineCommentEClass;}
			
			public EClass getManifest(){return ManifestEClass;}
			
			public EReference getManifest_MainAttributes(){return (EReference)ManifestEClass.eStructuralFeatures.at(0);}
			public EReference getManifest_EntryAttributes(){return (EReference)ManifestEClass.eStructuralFeatures.at(1);}
			public EClass getManifestAttribute(){return ManifestAttributeEClass;}
			
			public EAttribute getManifestAttribute_Key(){return (EAttribute)ManifestAttributeEClass.eStructuralFeatures.at(0);}
			public EAttribute getManifestAttribute_Value(){return (EAttribute)ManifestAttributeEClass.eStructuralFeatures.at(1);}
			public EClass getManifestEntry(){return ManifestEntryEClass;}
			
			public EAttribute getManifestEntry_Name(){return (EAttribute)ManifestEntryEClass.eStructuralFeatures.at(0);}
			public EReference getManifestEntry_Attributes(){return (EReference)ManifestEntryEClass.eStructuralFeatures.at(1);}
			public EClass getMemberRef(){return MemberRefEClass;}
			
			public EReference getMemberRef_Member(){return (EReference)MemberRefEClass.eStructuralFeatures.at(0);}
			public EReference getMemberRef_Qualifier(){return (EReference)MemberRefEClass.eStructuralFeatures.at(1);}
			public EClass getMethodDeclaration(){return MethodDeclarationEClass;}
			
			public EAttribute getMethodDeclaration_ExtraArrayDimensions(){return (EAttribute)MethodDeclarationEClass.eStructuralFeatures.at(0);}
			public EReference getMethodDeclaration_ReturnType(){return (EReference)MethodDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getMethodDeclaration_RedefinedMethodDeclaration(){return (EReference)MethodDeclarationEClass.eStructuralFeatures.at(2);}
			public EReference getMethodDeclaration_Redefinitions(){return (EReference)MethodDeclarationEClass.eStructuralFeatures.at(3);}
			public EClass getMethodInvocation(){return MethodInvocationEClass;}
			
			public EReference getMethodInvocation_Expression(){return (EReference)MethodInvocationEClass.eStructuralFeatures.at(0);}
			public EClass getMethodRef(){return MethodRefEClass;}
			
			public EReference getMethodRef_Method(){return (EReference)MethodRefEClass.eStructuralFeatures.at(0);}
			public EReference getMethodRef_Qualifier(){return (EReference)MethodRefEClass.eStructuralFeatures.at(1);}
			public EReference getMethodRef_Parameters(){return (EReference)MethodRefEClass.eStructuralFeatures.at(2);}
			public EClass getMethodRefParameter(){return MethodRefParameterEClass;}
			
			public EAttribute getMethodRefParameter_Name(){return (EAttribute)MethodRefParameterEClass.eStructuralFeatures.at(0);}
			public EAttribute getMethodRefParameter_Varargs(){return (EAttribute)MethodRefParameterEClass.eStructuralFeatures.at(1);}
			public EReference getMethodRefParameter_Type(){return (EReference)MethodRefParameterEClass.eStructuralFeatures.at(2);}
			public EClass getModel(){return ModelEClass;}
			
			public EAttribute getModel_Name(){return (EAttribute)ModelEClass.eStructuralFeatures.at(0);}
			public EReference getModel_OwnedElements(){return (EReference)ModelEClass.eStructuralFeatures.at(1);}
			public EReference getModel_OrphanTypes(){return (EReference)ModelEClass.eStructuralFeatures.at(2);}
			public EReference getModel_UnresolvedItems(){return (EReference)ModelEClass.eStructuralFeatures.at(3);}
			public EReference getModel_CompilationUnits(){return (EReference)ModelEClass.eStructuralFeatures.at(4);}
			public EReference getModel_ClassFiles(){return (EReference)ModelEClass.eStructuralFeatures.at(5);}
			public EReference getModel_Archives(){return (EReference)ModelEClass.eStructuralFeatures.at(6);}
			public EClass getModifier(){return ModifierEClass;}
			
			public EAttribute getModifier_Visibility(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(0);}
			public EAttribute getModifier_Inheritance(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(1);}
			public EAttribute getModifier_Static(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(2);}
			public EAttribute getModifier_Transient(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(3);}
			public EAttribute getModifier_Volatile(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(4);}
			public EAttribute getModifier_Native(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(5);}
			public EAttribute getModifier_Strictfp(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(6);}
			public EAttribute getModifier_Synchronized(){return (EAttribute)ModifierEClass.eStructuralFeatures.at(7);}
			public EReference getModifier_BodyDeclaration(){return (EReference)ModifierEClass.eStructuralFeatures.at(8);}
			public EReference getModifier_SingleVariableDeclaration(){return (EReference)ModifierEClass.eStructuralFeatures.at(9);}
			public EReference getModifier_VariableDeclarationStatement(){return (EReference)ModifierEClass.eStructuralFeatures.at(10);}
			public EReference getModifier_VariableDeclarationExpression(){return (EReference)ModifierEClass.eStructuralFeatures.at(11);}
			public EClass getNamespaceAccess(){return NamespaceAccessEClass;}
			
			public EClass getNumberLiteral(){return NumberLiteralEClass;}
			
			public EAttribute getNumberLiteral_TokenValue(){return (EAttribute)NumberLiteralEClass.eStructuralFeatures.at(0);}
			public EClass getNullLiteral(){return NullLiteralEClass;}
			
			public EClass getPackage(){return PackageEClass;}
			
			public EReference getPackage_OwnedElements(){return (EReference)PackageEClass.eStructuralFeatures.at(0);}
			public EReference getPackage_Model(){return (EReference)PackageEClass.eStructuralFeatures.at(1);}
			public EReference getPackage_OwnedPackages(){return (EReference)PackageEClass.eStructuralFeatures.at(2);}
			public EReference getPackage_Package(){return (EReference)PackageEClass.eStructuralFeatures.at(3);}
			public EReference getPackage_UsagesInPackageAccess(){return (EReference)PackageEClass.eStructuralFeatures.at(4);}
			public EClass getPackageAccess(){return PackageAccessEClass;}
			
			public EReference getPackageAccess_Package(){return (EReference)PackageAccessEClass.eStructuralFeatures.at(0);}
			public EReference getPackageAccess_Qualifier(){return (EReference)PackageAccessEClass.eStructuralFeatures.at(1);}
			public EClass getParameterizedType(){return ParameterizedTypeEClass;}
			
			public EReference getParameterizedType_Type(){return (EReference)ParameterizedTypeEClass.eStructuralFeatures.at(0);}
			public EReference getParameterizedType_TypeArguments(){return (EReference)ParameterizedTypeEClass.eStructuralFeatures.at(1);}
			public EClass getParenthesizedExpression(){return ParenthesizedExpressionEClass;}
			
			public EReference getParenthesizedExpression_Expression(){return (EReference)ParenthesizedExpressionEClass.eStructuralFeatures.at(0);}
			public EClass getPostfixExpression(){return PostfixExpressionEClass;}
			
			public EAttribute getPostfixExpression_Operator(){return (EAttribute)PostfixExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getPostfixExpression_Operand(){return (EReference)PostfixExpressionEClass.eStructuralFeatures.at(1);}
			public EClass getPrefixExpression(){return PrefixExpressionEClass;}
			
			public EAttribute getPrefixExpression_Operator(){return (EAttribute)PrefixExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getPrefixExpression_Operand(){return (EReference)PrefixExpressionEClass.eStructuralFeatures.at(1);}
			public EClass getPrimitiveType(){return PrimitiveTypeEClass;}
			
			public EClass getPrimitiveTypeBoolean(){return PrimitiveTypeBooleanEClass;}
			
			public EClass getPrimitiveTypeByte(){return PrimitiveTypeByteEClass;}
			
			public EClass getPrimitiveTypeChar(){return PrimitiveTypeCharEClass;}
			
			public EClass getPrimitiveTypeDouble(){return PrimitiveTypeDoubleEClass;}
			
			public EClass getPrimitiveTypeShort(){return PrimitiveTypeShortEClass;}
			
			public EClass getPrimitiveTypeFloat(){return PrimitiveTypeFloatEClass;}
			
			public EClass getPrimitiveTypeInt(){return PrimitiveTypeIntEClass;}
			
			public EClass getPrimitiveTypeLong(){return PrimitiveTypeLongEClass;}
			
			public EClass getPrimitiveTypeVoid(){return PrimitiveTypeVoidEClass;}
			
			public EClass getReturnStatement(){return ReturnStatementEClass;}
			
			public EReference getReturnStatement_Expression(){return (EReference)ReturnStatementEClass.eStructuralFeatures.at(0);}
			public EClass getSingleVariableAccess(){return SingleVariableAccessEClass;}
			
			public EReference getSingleVariableAccess_Variable(){return (EReference)SingleVariableAccessEClass.eStructuralFeatures.at(0);}
			public EReference getSingleVariableAccess_Qualifier(){return (EReference)SingleVariableAccessEClass.eStructuralFeatures.at(1);}
			public EClass getSingleVariableDeclaration(){return SingleVariableDeclarationEClass;}
			
			public EReference getSingleVariableDeclaration_Modifier(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(0);}
			public EAttribute getSingleVariableDeclaration_Varargs(){return (EAttribute)SingleVariableDeclarationEClass.eStructuralFeatures.at(1);}
			public EReference getSingleVariableDeclaration_Type(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(2);}
			public EReference getSingleVariableDeclaration_Annotations(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(3);}
			public EReference getSingleVariableDeclaration_MethodDeclaration(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(4);}
			public EReference getSingleVariableDeclaration_CatchClause(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(5);}
			public EReference getSingleVariableDeclaration_EnhancedForStatement(){return (EReference)SingleVariableDeclarationEClass.eStructuralFeatures.at(6);}
			public EClass getStringLiteral(){return StringLiteralEClass;}
			
			public EAttribute getStringLiteral_EscapedValue(){return (EAttribute)StringLiteralEClass.eStructuralFeatures.at(0);}
			public EClass getSuperConstructorInvocation(){return SuperConstructorInvocationEClass;}
			
			public EReference getSuperConstructorInvocation_Expression(){return (EReference)SuperConstructorInvocationEClass.eStructuralFeatures.at(0);}
			public EClass getSuperFieldAccess(){return SuperFieldAccessEClass;}
			
			public EReference getSuperFieldAccess_Field(){return (EReference)SuperFieldAccessEClass.eStructuralFeatures.at(0);}
			public EClass getSuperMethodInvocation(){return SuperMethodInvocationEClass;}
			
			public EClass getSwitchCase(){return SwitchCaseEClass;}
			
			public EAttribute getSwitchCase_Default(){return (EAttribute)SwitchCaseEClass.eStructuralFeatures.at(0);}
			public EReference getSwitchCase_Expression(){return (EReference)SwitchCaseEClass.eStructuralFeatures.at(1);}
			public EClass getSwitchStatement(){return SwitchStatementEClass;}
			
			public EReference getSwitchStatement_Expression(){return (EReference)SwitchStatementEClass.eStructuralFeatures.at(0);}
			public EReference getSwitchStatement_Statements(){return (EReference)SwitchStatementEClass.eStructuralFeatures.at(1);}
			public EClass getSynchronizedStatement(){return SynchronizedStatementEClass;}
			
			public EReference getSynchronizedStatement_Body(){return (EReference)SynchronizedStatementEClass.eStructuralFeatures.at(0);}
			public EReference getSynchronizedStatement_Expression(){return (EReference)SynchronizedStatementEClass.eStructuralFeatures.at(1);}
			public EClass getTagElement(){return TagElementEClass;}
			
			public EAttribute getTagElement_TagName(){return (EAttribute)TagElementEClass.eStructuralFeatures.at(0);}
			public EReference getTagElement_Fragments(){return (EReference)TagElementEClass.eStructuralFeatures.at(1);}
			public EClass getTextElement(){return TextElementEClass;}
			
			public EAttribute getTextElement_Text(){return (EAttribute)TextElementEClass.eStructuralFeatures.at(0);}
			public EClass getThisExpression(){return ThisExpressionEClass;}
			
			public EClass getThrowStatement(){return ThrowStatementEClass;}
			
			public EReference getThrowStatement_Expression(){return (EReference)ThrowStatementEClass.eStructuralFeatures.at(0);}
			public EClass getTryStatement(){return TryStatementEClass;}
			
			public EReference getTryStatement_Body(){return (EReference)TryStatementEClass.eStructuralFeatures.at(0);}
			public EReference getTryStatement_Finally(){return (EReference)TryStatementEClass.eStructuralFeatures.at(1);}
			public EReference getTryStatement_CatchClauses(){return (EReference)TryStatementEClass.eStructuralFeatures.at(2);}
			public EClass getTypeAccess(){return TypeAccessEClass;}
			
			public EReference getTypeAccess_Type(){return (EReference)TypeAccessEClass.eStructuralFeatures.at(0);}
			public EReference getTypeAccess_Qualifier(){return (EReference)TypeAccessEClass.eStructuralFeatures.at(1);}
			public EClass getTypeDeclarationStatement(){return TypeDeclarationStatementEClass;}
			
			public EReference getTypeDeclarationStatement_Declaration(){return (EReference)TypeDeclarationStatementEClass.eStructuralFeatures.at(0);}
			public EClass getTypeLiteral(){return TypeLiteralEClass;}
			
			public EReference getTypeLiteral_Type(){return (EReference)TypeLiteralEClass.eStructuralFeatures.at(0);}
			public EClass getTypeParameter(){return TypeParameterEClass;}
			
			public EReference getTypeParameter_Bounds(){return (EReference)TypeParameterEClass.eStructuralFeatures.at(0);}
			public EClass getUnresolvedItem(){return UnresolvedItemEClass;}
			
			public EClass getUnresolvedItemAccess(){return UnresolvedItemAccessEClass;}
			
			public EReference getUnresolvedItemAccess_Element(){return (EReference)UnresolvedItemAccessEClass.eStructuralFeatures.at(0);}
			public EReference getUnresolvedItemAccess_Qualifier(){return (EReference)UnresolvedItemAccessEClass.eStructuralFeatures.at(1);}
			public EClass getUnresolvedAnnotationDeclaration(){return UnresolvedAnnotationDeclarationEClass;}
			
			public EClass getUnresolvedAnnotationTypeMemberDeclaration(){return UnresolvedAnnotationTypeMemberDeclarationEClass;}
			
			public EClass getUnresolvedClassDeclaration(){return UnresolvedClassDeclarationEClass;}
			
			public EClass getUnresolvedEnumDeclaration(){return UnresolvedEnumDeclarationEClass;}
			
			public EClass getUnresolvedInterfaceDeclaration(){return UnresolvedInterfaceDeclarationEClass;}
			
			public EClass getUnresolvedLabeledStatement(){return UnresolvedLabeledStatementEClass;}
			
			public EClass getUnresolvedMethodDeclaration(){return UnresolvedMethodDeclarationEClass;}
			
			public EClass getUnresolvedSingleVariableDeclaration(){return UnresolvedSingleVariableDeclarationEClass;}
			
			public EClass getUnresolvedType(){return UnresolvedTypeEClass;}
			
			public EClass getUnresolvedTypeDeclaration(){return UnresolvedTypeDeclarationEClass;}
			
			public EClass getVariableDeclarationFragment(){return VariableDeclarationFragmentEClass;}
			
			public EReference getVariableDeclarationFragment_VariablesContainer(){return (EReference)VariableDeclarationFragmentEClass.eStructuralFeatures.at(0);}
			public EClass getUnresolvedVariableDeclarationFragment(){return UnresolvedVariableDeclarationFragmentEClass;}
			
			public EClass getVariableDeclarationExpression(){return VariableDeclarationExpressionEClass;}
			
			public EReference getVariableDeclarationExpression_Modifier(){return (EReference)VariableDeclarationExpressionEClass.eStructuralFeatures.at(0);}
			public EReference getVariableDeclarationExpression_Annotations(){return (EReference)VariableDeclarationExpressionEClass.eStructuralFeatures.at(1);}
			public EClass getVariableDeclarationStatement(){return VariableDeclarationStatementEClass;}
			
			public EAttribute getVariableDeclarationStatement_ExtraArrayDimensions(){return (EAttribute)VariableDeclarationStatementEClass.eStructuralFeatures.at(0);}
			public EReference getVariableDeclarationStatement_Modifier(){return (EReference)VariableDeclarationStatementEClass.eStructuralFeatures.at(1);}
			public EReference getVariableDeclarationStatement_Annotations(){return (EReference)VariableDeclarationStatementEClass.eStructuralFeatures.at(2);}
			public EClass getWildCardType(){return WildCardTypeEClass;}
			
			public EAttribute getWildCardType_UpperBound(){return (EAttribute)WildCardTypeEClass.eStructuralFeatures.at(0);}
			public EReference getWildCardType_Bound(){return (EReference)WildCardTypeEClass.eStructuralFeatures.at(1);}
			public EClass getWhileStatement(){return WhileStatementEClass;}
			
			public EReference getWhileStatement_Expression(){return (EReference)WhileStatementEClass.eStructuralFeatures.at(0);}
			public EReference getWhileStatement_Body(){return (EReference)WhileStatementEClass.eStructuralFeatures.at(1);}
			public EEnum getAssignmentKind(){return AssignmentKindEEnum;}
			public EEnum getInfixExpressionKind(){return InfixExpressionKindEEnum;}
			public EEnum getInheritanceKind(){return InheritanceKindEEnum;}
			public EEnum getPostfixExpressionKind(){return PostfixExpressionKindEEnum;}
			public EEnum getPrefixExpressionKind(){return PrefixExpressionKindEEnum;}
			public EEnum getVisibilityKind(){return VisibilityKindEEnum;}
			
			public class Literals{
				public static EClass ASTNODE = Java_PackageImpl.eINSTANCE.getASTNode();
				
				public static EReference ASTNODE_COMMENTS = Java_PackageImpl.eINSTANCE.getASTNode_Comments();
				public static EReference ASTNODE_ORIGINALCOMPILATIONUNIT = Java_PackageImpl.eINSTANCE.getASTNode_OriginalCompilationUnit();
				public static EReference ASTNODE_ORIGINALCLASSFILE = Java_PackageImpl.eINSTANCE.getASTNode_OriginalClassFile();
				
				public static EClass NAMEDELEMENT = Java_PackageImpl.eINSTANCE.getNamedElement();
				
				public static EReference NAMEDELEMENT_USAGESINIMPORTS = Java_PackageImpl.eINSTANCE.getNamedElement_UsagesInImports();
				
				public static EAttribute NAMEDELEMENT_NAME = Java_PackageImpl.eINSTANCE.getNamedElement_Name();
				public static EAttribute NAMEDELEMENT_PROXY = Java_PackageImpl.eINSTANCE.getNamedElement_Proxy();
				public static EClass BODYDECLARATION = Java_PackageImpl.eINSTANCE.getBodyDeclaration();
				
				public static EReference BODYDECLARATION_ABSTRACTTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getBodyDeclaration_AbstractTypeDeclaration();
				public static EReference BODYDECLARATION_ANNOTATIONS = Java_PackageImpl.eINSTANCE.getBodyDeclaration_Annotations();
				public static EReference BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER = Java_PackageImpl.eINSTANCE.getBodyDeclaration_AnonymousClassDeclarationOwner();
				public static EReference BODYDECLARATION_MODIFIER = Java_PackageImpl.eINSTANCE.getBodyDeclaration_Modifier();
				
				public static EClass ABSTRACTMETHODDECLARATION = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration();
				
				public static EReference ABSTRACTMETHODDECLARATION_BODY = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Body();
				public static EReference ABSTRACTMETHODDECLARATION_PARAMETERS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Parameters();
				public static EReference ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_ThrownExceptions();
				public static EReference ABSTRACTMETHODDECLARATION_TYPEPARAMETERS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_TypeParameters();
				public static EReference ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_UsagesInDocComments();
				public static EReference ABSTRACTMETHODDECLARATION_USAGES = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Usages();
				
				public static EClass ABSTRACTMETHODINVOCATION = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation();
				
				public static EReference ABSTRACTMETHODINVOCATION_METHOD = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_Method();
				public static EReference ABSTRACTMETHODINVOCATION_ARGUMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_Arguments();
				public static EReference ABSTRACTMETHODINVOCATION_TYPEARGUMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_TypeArguments();
				
				public static EClass TYPE = Java_PackageImpl.eINSTANCE.getType();
				
				public static EReference TYPE_USAGESINTYPEACCESS = Java_PackageImpl.eINSTANCE.getType_UsagesInTypeAccess();
				
				public static EClass ABSTRACTTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration();
				
				public static EReference ABSTRACTTYPEDECLARATION_BODYDECLARATIONS = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations();
				public static EReference ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_CommentsBeforeBody();
				public static EReference ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_CommentsAfterBody();
				public static EReference ABSTRACTTYPEDECLARATION_PACKAGE = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_Package();
				public static EReference ABSTRACTTYPEDECLARATION_SUPERINTERFACES = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_SuperInterfaces();
				
				public static EClass EXPRESSION = Java_PackageImpl.eINSTANCE.getExpression();
				
				
				public static EClass ABSTRACTTYPEQUALIFIEDEXPRESSION = Java_PackageImpl.eINSTANCE.getAbstractTypeQualifiedExpression();
				
				public static EReference ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER = Java_PackageImpl.eINSTANCE.getAbstractTypeQualifiedExpression_Qualifier();
				
				public static EClass ABSTRACTVARIABLESCONTAINER = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer();
				
				public static EReference ABSTRACTVARIABLESCONTAINER_TYPE = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer_Type();
				public static EReference ABSTRACTVARIABLESCONTAINER_FRAGMENTS = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer_Fragments();
				
				public static EClass ANNOTATION = Java_PackageImpl.eINSTANCE.getAnnotation();
				
				public static EReference ANNOTATION_TYPE = Java_PackageImpl.eINSTANCE.getAnnotation_Type();
				public static EReference ANNOTATION_VALUES = Java_PackageImpl.eINSTANCE.getAnnotation_Values();
				
				public static EClass ARCHIVE = Java_PackageImpl.eINSTANCE.getArchive();
				
				public static EReference ARCHIVE_CLASSFILES = Java_PackageImpl.eINSTANCE.getArchive_ClassFiles();
				public static EReference ARCHIVE_MANIFEST = Java_PackageImpl.eINSTANCE.getArchive_Manifest();
				
				public static EAttribute ARCHIVE_ORIGINALFILEPATH = Java_PackageImpl.eINSTANCE.getArchive_OriginalFilePath();
				public static EClass STATEMENT = Java_PackageImpl.eINSTANCE.getStatement();
				
				
				public static EClass ASSERTSTATEMENT = Java_PackageImpl.eINSTANCE.getAssertStatement();
				
				public static EReference ASSERTSTATEMENT_MESSAGE = Java_PackageImpl.eINSTANCE.getAssertStatement_Message();
				public static EReference ASSERTSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getAssertStatement_Expression();
				
				public static EClass ANNOTATIONMEMBERVALUEPAIR = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair();
				
				public static EReference ANNOTATIONMEMBERVALUEPAIR_MEMBER = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair_Member();
				public static EReference ANNOTATIONMEMBERVALUEPAIR_VALUE = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair_Value();
				
				public static EClass ANNOTATIONTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getAnnotationTypeDeclaration();
				
				
				public static EClass ANNOTATIONTYPEMEMBERDECLARATION = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration();
				
				public static EReference ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Default();
				public static EReference ANNOTATIONTYPEMEMBERDECLARATION_TYPE = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Type();
				public static EReference ANNOTATIONTYPEMEMBERDECLARATION_USAGES = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Usages();
				
				public static EClass ANONYMOUSCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration();
				
				public static EReference ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations();
				public static EReference ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration_ClassInstanceCreation();
				
				public static EClass ARRAYACCESS = Java_PackageImpl.eINSTANCE.getArrayAccess();
				
				public static EReference ARRAYACCESS_ARRAY = Java_PackageImpl.eINSTANCE.getArrayAccess_Array();
				public static EReference ARRAYACCESS_INDEX = Java_PackageImpl.eINSTANCE.getArrayAccess_Index();
				
				public static EClass ARRAYCREATION = Java_PackageImpl.eINSTANCE.getArrayCreation();
				
				public static EReference ARRAYCREATION_DIMENSIONS = Java_PackageImpl.eINSTANCE.getArrayCreation_Dimensions();
				public static EReference ARRAYCREATION_INITIALIZER = Java_PackageImpl.eINSTANCE.getArrayCreation_Initializer();
				public static EReference ARRAYCREATION_TYPE = Java_PackageImpl.eINSTANCE.getArrayCreation_Type();
				
				public static EClass ARRAYINITIALIZER = Java_PackageImpl.eINSTANCE.getArrayInitializer();
				
				public static EReference ARRAYINITIALIZER_EXPRESSIONS = Java_PackageImpl.eINSTANCE.getArrayInitializer_Expressions();
				
				public static EClass ARRAYLENGTHACCESS = Java_PackageImpl.eINSTANCE.getArrayLengthAccess();
				
				public static EReference ARRAYLENGTHACCESS_ARRAY = Java_PackageImpl.eINSTANCE.getArrayLengthAccess_Array();
				
				public static EClass ARRAYTYPE = Java_PackageImpl.eINSTANCE.getArrayType();
				
				public static EReference ARRAYTYPE_ELEMENTTYPE = Java_PackageImpl.eINSTANCE.getArrayType_ElementType();
				
				public static EAttribute ARRAYTYPE_DIMENSIONS = Java_PackageImpl.eINSTANCE.getArrayType_Dimensions();
				public static EClass ASSIGNMENT = Java_PackageImpl.eINSTANCE.getAssignment();
				
				public static EReference ASSIGNMENT_LEFTHANDSIDE = Java_PackageImpl.eINSTANCE.getAssignment_LeftHandSide();
				public static EReference ASSIGNMENT_RIGHTHANDSIDE = Java_PackageImpl.eINSTANCE.getAssignment_RightHandSide();
				
				public static EAttribute ASSIGNMENT_OPERATOR = Java_PackageImpl.eINSTANCE.getAssignment_Operator();
				public static EClass BOOLEANLITERAL = Java_PackageImpl.eINSTANCE.getBooleanLiteral();
				
				
				public static EAttribute BOOLEANLITERAL_VALUE = Java_PackageImpl.eINSTANCE.getBooleanLiteral_Value();
				public static EClass COMMENT = Java_PackageImpl.eINSTANCE.getComment();
				
				
				public static EAttribute COMMENT_CONTENT = Java_PackageImpl.eINSTANCE.getComment_Content();
				public static EAttribute COMMENT_ENCLOSEDBYPARENT = Java_PackageImpl.eINSTANCE.getComment_EnclosedByParent();
				public static EAttribute COMMENT_PREFIXOFPARENT = Java_PackageImpl.eINSTANCE.getComment_PrefixOfParent();
				public static EClass BLOCKCOMMENT = Java_PackageImpl.eINSTANCE.getBlockComment();
				
				
				public static EClass BLOCK = Java_PackageImpl.eINSTANCE.getBlock();
				
				public static EReference BLOCK_STATEMENTS = Java_PackageImpl.eINSTANCE.getBlock_Statements();
				
				public static EClass BREAKSTATEMENT = Java_PackageImpl.eINSTANCE.getBreakStatement();
				
				public static EReference BREAKSTATEMENT_LABEL = Java_PackageImpl.eINSTANCE.getBreakStatement_Label();
				
				public static EClass CASTEXPRESSION = Java_PackageImpl.eINSTANCE.getCastExpression();
				
				public static EReference CASTEXPRESSION_EXPRESSION = Java_PackageImpl.eINSTANCE.getCastExpression_Expression();
				public static EReference CASTEXPRESSION_TYPE = Java_PackageImpl.eINSTANCE.getCastExpression_Type();
				
				public static EClass CATCHCLAUSE = Java_PackageImpl.eINSTANCE.getCatchClause();
				
				public static EReference CATCHCLAUSE_EXCEPTION = Java_PackageImpl.eINSTANCE.getCatchClause_Exception();
				public static EReference CATCHCLAUSE_BODY = Java_PackageImpl.eINSTANCE.getCatchClause_Body();
				
				public static EClass CHARACTERLITERAL = Java_PackageImpl.eINSTANCE.getCharacterLiteral();
				
				
				public static EAttribute CHARACTERLITERAL_ESCAPEDVALUE = Java_PackageImpl.eINSTANCE.getCharacterLiteral_EscapedValue();
				public static EClass CLASSFILE = Java_PackageImpl.eINSTANCE.getClassFile();
				
				public static EReference CLASSFILE_TYPE = Java_PackageImpl.eINSTANCE.getClassFile_Type();
				public static EReference CLASSFILE_ATTACHEDSOURCE = Java_PackageImpl.eINSTANCE.getClassFile_AttachedSource();
				public static EReference CLASSFILE_PACKAGE = Java_PackageImpl.eINSTANCE.getClassFile_Package();
				
				public static EAttribute CLASSFILE_ORIGINALFILEPATH = Java_PackageImpl.eINSTANCE.getClassFile_OriginalFilePath();
				public static EClass CLASSINSTANCECREATION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation();
				
				public static EReference CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_AnonymousClassDeclaration();
				public static EReference CLASSINSTANCECREATION_EXPRESSION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_Expression();
				public static EReference CLASSINSTANCECREATION_TYPE = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_Type();
				
				public static EClass CONSTRUCTORDECLARATION = Java_PackageImpl.eINSTANCE.getConstructorDeclaration();
				
				
				public static EClass CONDITIONALEXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression();
				
				public static EReference CONDITIONALEXPRESSION_ELSEEXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_ElseExpression();
				public static EReference CONDITIONALEXPRESSION_EXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_Expression();
				public static EReference CONDITIONALEXPRESSION_THENEXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_ThenExpression();
				
				public static EClass CONSTRUCTORINVOCATION = Java_PackageImpl.eINSTANCE.getConstructorInvocation();
				
				
				public static EClass TYPEDECLARATION = Java_PackageImpl.eINSTANCE.getTypeDeclaration();
				
				public static EReference TYPEDECLARATION_TYPEPARAMETERS = Java_PackageImpl.eINSTANCE.getTypeDeclaration_TypeParameters();
				
				public static EClass CLASSDECLARATION = Java_PackageImpl.eINSTANCE.getClassDeclaration();
				
				public static EReference CLASSDECLARATION_SUPERCLASS = Java_PackageImpl.eINSTANCE.getClassDeclaration_SuperClass();
				
				public static EClass COMPILATIONUNIT = Java_PackageImpl.eINSTANCE.getCompilationUnit();
				
				public static EReference COMPILATIONUNIT_COMMENTLIST = Java_PackageImpl.eINSTANCE.getCompilationUnit_CommentList();
				public static EReference COMPILATIONUNIT_IMPORTS = Java_PackageImpl.eINSTANCE.getCompilationUnit_Imports();
				public static EReference COMPILATIONUNIT_PACKAGE = Java_PackageImpl.eINSTANCE.getCompilationUnit_Package();
				public static EReference COMPILATIONUNIT_TYPES = Java_PackageImpl.eINSTANCE.getCompilationUnit_Types();
				
				public static EAttribute COMPILATIONUNIT_ORIGINALFILEPATH = Java_PackageImpl.eINSTANCE.getCompilationUnit_OriginalFilePath();
				public static EClass CONTINUESTATEMENT = Java_PackageImpl.eINSTANCE.getContinueStatement();
				
				public static EReference CONTINUESTATEMENT_LABEL = Java_PackageImpl.eINSTANCE.getContinueStatement_Label();
				
				public static EClass DOSTATEMENT = Java_PackageImpl.eINSTANCE.getDoStatement();
				
				public static EReference DOSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getDoStatement_Expression();
				public static EReference DOSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getDoStatement_Body();
				
				public static EClass EMPTYSTATEMENT = Java_PackageImpl.eINSTANCE.getEmptyStatement();
				
				
				public static EClass ENHANCEDFORSTATEMENT = Java_PackageImpl.eINSTANCE.getEnhancedForStatement();
				
				public static EReference ENHANCEDFORSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Body();
				public static EReference ENHANCEDFORSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Expression();
				public static EReference ENHANCEDFORSTATEMENT_PARAMETER = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Parameter();
				
				public static EClass VARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getVariableDeclaration();
				
				public static EReference VARIABLEDECLARATION_INITIALIZER = Java_PackageImpl.eINSTANCE.getVariableDeclaration_Initializer();
				public static EReference VARIABLEDECLARATION_USAGEINVARIABLEACCESS = Java_PackageImpl.eINSTANCE.getVariableDeclaration_UsageInVariableAccess();
				
				public static EAttribute VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS = Java_PackageImpl.eINSTANCE.getVariableDeclaration_ExtraArrayDimensions();
				public static EClass ENUMCONSTANTDECLARATION = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration();
				
				public static EReference ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration_AnonymousClassDeclaration();
				public static EReference ENUMCONSTANTDECLARATION_ARGUMENTS = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration_Arguments();
				
				public static EClass ENUMDECLARATION = Java_PackageImpl.eINSTANCE.getEnumDeclaration();
				
				public static EReference ENUMDECLARATION_ENUMCONSTANTS = Java_PackageImpl.eINSTANCE.getEnumDeclaration_EnumConstants();
				
				public static EClass EXPRESSIONSTATEMENT = Java_PackageImpl.eINSTANCE.getExpressionStatement();
				
				public static EReference EXPRESSIONSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getExpressionStatement_Expression();
				
				public static EClass FIELDACCESS = Java_PackageImpl.eINSTANCE.getFieldAccess();
				
				public static EReference FIELDACCESS_FIELD = Java_PackageImpl.eINSTANCE.getFieldAccess_Field();
				public static EReference FIELDACCESS_EXPRESSION = Java_PackageImpl.eINSTANCE.getFieldAccess_Expression();
				
				public static EClass FIELDDECLARATION = Java_PackageImpl.eINSTANCE.getFieldDeclaration();
				
				
				public static EClass FORSTATEMENT = Java_PackageImpl.eINSTANCE.getForStatement();
				
				public static EReference FORSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getForStatement_Expression();
				public static EReference FORSTATEMENT_UPDATERS = Java_PackageImpl.eINSTANCE.getForStatement_Updaters();
				public static EReference FORSTATEMENT_INITIALIZERS = Java_PackageImpl.eINSTANCE.getForStatement_Initializers();
				public static EReference FORSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getForStatement_Body();
				
				public static EClass IFSTATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement();
				
				public static EReference IFSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getIfStatement_Expression();
				public static EReference IFSTATEMENT_THENSTATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement_ThenStatement();
				public static EReference IFSTATEMENT_ELSESTATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement_ElseStatement();
				
				public static EClass IMPORTDECLARATION = Java_PackageImpl.eINSTANCE.getImportDeclaration();
				
				public static EReference IMPORTDECLARATION_IMPORTEDELEMENT = Java_PackageImpl.eINSTANCE.getImportDeclaration_ImportedElement();
				
				public static EAttribute IMPORTDECLARATION_STATIC = Java_PackageImpl.eINSTANCE.getImportDeclaration_Static();
				public static EClass INFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getInfixExpression();
				
				public static EReference INFIXEXPRESSION_RIGHTOPERAND = Java_PackageImpl.eINSTANCE.getInfixExpression_RightOperand();
				public static EReference INFIXEXPRESSION_LEFTOPERAND = Java_PackageImpl.eINSTANCE.getInfixExpression_LeftOperand();
				public static EReference INFIXEXPRESSION_EXTENDEDOPERANDS = Java_PackageImpl.eINSTANCE.getInfixExpression_ExtendedOperands();
				
				public static EAttribute INFIXEXPRESSION_OPERATOR = Java_PackageImpl.eINSTANCE.getInfixExpression_Operator();
				public static EClass INITIALIZER = Java_PackageImpl.eINSTANCE.getInitializer();
				
				public static EReference INITIALIZER_BODY = Java_PackageImpl.eINSTANCE.getInitializer_Body();
				
				public static EClass INSTANCEOFEXPRESSION = Java_PackageImpl.eINSTANCE.getInstanceofExpression();
				
				public static EReference INSTANCEOFEXPRESSION_RIGHTOPERAND = Java_PackageImpl.eINSTANCE.getInstanceofExpression_RightOperand();
				public static EReference INSTANCEOFEXPRESSION_LEFTOPERAND = Java_PackageImpl.eINSTANCE.getInstanceofExpression_LeftOperand();
				
				public static EClass INTERFACEDECLARATION = Java_PackageImpl.eINSTANCE.getInterfaceDeclaration();
				
				
				public static EClass JAVADOC = Java_PackageImpl.eINSTANCE.getJavadoc();
				
				public static EReference JAVADOC_TAGS = Java_PackageImpl.eINSTANCE.getJavadoc_Tags();
				
				public static EClass LABELEDSTATEMENT = Java_PackageImpl.eINSTANCE.getLabeledStatement();
				
				public static EReference LABELEDSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getLabeledStatement_Body();
				public static EReference LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS = Java_PackageImpl.eINSTANCE.getLabeledStatement_UsagesInBreakStatements();
				public static EReference LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS = Java_PackageImpl.eINSTANCE.getLabeledStatement_UsagesInContinueStatements();
				
				public static EClass LINECOMMENT = Java_PackageImpl.eINSTANCE.getLineComment();
				
				
				public static EClass MANIFEST = Java_PackageImpl.eINSTANCE.getManifest();
				
				public static EReference MANIFEST_MAINATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifest_MainAttributes();
				public static EReference MANIFEST_ENTRYATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifest_EntryAttributes();
				
				public static EClass MANIFESTATTRIBUTE = Java_PackageImpl.eINSTANCE.getManifestAttribute();
				
				
				public static EAttribute MANIFESTATTRIBUTE_KEY = Java_PackageImpl.eINSTANCE.getManifestAttribute_Key();
				public static EAttribute MANIFESTATTRIBUTE_VALUE = Java_PackageImpl.eINSTANCE.getManifestAttribute_Value();
				public static EClass MANIFESTENTRY = Java_PackageImpl.eINSTANCE.getManifestEntry();
				
				public static EReference MANIFESTENTRY_ATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifestEntry_Attributes();
				
				public static EAttribute MANIFESTENTRY_NAME = Java_PackageImpl.eINSTANCE.getManifestEntry_Name();
				public static EClass MEMBERREF = Java_PackageImpl.eINSTANCE.getMemberRef();
				
				public static EReference MEMBERREF_MEMBER = Java_PackageImpl.eINSTANCE.getMemberRef_Member();
				public static EReference MEMBERREF_QUALIFIER = Java_PackageImpl.eINSTANCE.getMemberRef_Qualifier();
				
				public static EClass METHODDECLARATION = Java_PackageImpl.eINSTANCE.getMethodDeclaration();
				
				public static EReference METHODDECLARATION_RETURNTYPE = Java_PackageImpl.eINSTANCE.getMethodDeclaration_ReturnType();
				public static EReference METHODDECLARATION_REDEFINEDMETHODDECLARATION = Java_PackageImpl.eINSTANCE.getMethodDeclaration_RedefinedMethodDeclaration();
				public static EReference METHODDECLARATION_REDEFINITIONS = Java_PackageImpl.eINSTANCE.getMethodDeclaration_Redefinitions();
				
				public static EAttribute METHODDECLARATION_EXTRAARRAYDIMENSIONS = Java_PackageImpl.eINSTANCE.getMethodDeclaration_ExtraArrayDimensions();
				public static EClass METHODINVOCATION = Java_PackageImpl.eINSTANCE.getMethodInvocation();
				
				public static EReference METHODINVOCATION_EXPRESSION = Java_PackageImpl.eINSTANCE.getMethodInvocation_Expression();
				
				public static EClass METHODREF = Java_PackageImpl.eINSTANCE.getMethodRef();
				
				public static EReference METHODREF_METHOD = Java_PackageImpl.eINSTANCE.getMethodRef_Method();
				public static EReference METHODREF_QUALIFIER = Java_PackageImpl.eINSTANCE.getMethodRef_Qualifier();
				public static EReference METHODREF_PARAMETERS = Java_PackageImpl.eINSTANCE.getMethodRef_Parameters();
				
				public static EClass METHODREFPARAMETER = Java_PackageImpl.eINSTANCE.getMethodRefParameter();
				
				public static EReference METHODREFPARAMETER_TYPE = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Type();
				
				public static EAttribute METHODREFPARAMETER_NAME = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Name();
				public static EAttribute METHODREFPARAMETER_VARARGS = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Varargs();
				public static EClass MODEL = Java_PackageImpl.eINSTANCE.getModel();
				
				public static EReference MODEL_OWNEDELEMENTS = Java_PackageImpl.eINSTANCE.getModel_OwnedElements();
				public static EReference MODEL_ORPHANTYPES = Java_PackageImpl.eINSTANCE.getModel_OrphanTypes();
				public static EReference MODEL_UNRESOLVEDITEMS = Java_PackageImpl.eINSTANCE.getModel_UnresolvedItems();
				public static EReference MODEL_COMPILATIONUNITS = Java_PackageImpl.eINSTANCE.getModel_CompilationUnits();
				public static EReference MODEL_CLASSFILES = Java_PackageImpl.eINSTANCE.getModel_ClassFiles();
				public static EReference MODEL_ARCHIVES = Java_PackageImpl.eINSTANCE.getModel_Archives();
				
				public static EAttribute MODEL_NAME = Java_PackageImpl.eINSTANCE.getModel_Name();
				public static EClass MODIFIER = Java_PackageImpl.eINSTANCE.getModifier();
				
				public static EReference MODIFIER_BODYDECLARATION = Java_PackageImpl.eINSTANCE.getModifier_BodyDeclaration();
				public static EReference MODIFIER_SINGLEVARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getModifier_SingleVariableDeclaration();
				public static EReference MODIFIER_VARIABLEDECLARATIONSTATEMENT = Java_PackageImpl.eINSTANCE.getModifier_VariableDeclarationStatement();
				public static EReference MODIFIER_VARIABLEDECLARATIONEXPRESSION = Java_PackageImpl.eINSTANCE.getModifier_VariableDeclarationExpression();
				
				public static EAttribute MODIFIER_VISIBILITY = Java_PackageImpl.eINSTANCE.getModifier_Visibility();
				public static EAttribute MODIFIER_INHERITANCE = Java_PackageImpl.eINSTANCE.getModifier_Inheritance();
				public static EAttribute MODIFIER_STATIC = Java_PackageImpl.eINSTANCE.getModifier_Static();
				public static EAttribute MODIFIER_TRANSIENT = Java_PackageImpl.eINSTANCE.getModifier_Transient();
				public static EAttribute MODIFIER_VOLATILE = Java_PackageImpl.eINSTANCE.getModifier_Volatile();
				public static EAttribute MODIFIER_NATIVE = Java_PackageImpl.eINSTANCE.getModifier_Native();
				public static EAttribute MODIFIER_STRICTFP = Java_PackageImpl.eINSTANCE.getModifier_Strictfp();
				public static EAttribute MODIFIER_SYNCHRONIZED = Java_PackageImpl.eINSTANCE.getModifier_Synchronized();
				public static EClass NAMESPACEACCESS = Java_PackageImpl.eINSTANCE.getNamespaceAccess();
				
				
				public static EClass NUMBERLITERAL = Java_PackageImpl.eINSTANCE.getNumberLiteral();
				
				
				public static EAttribute NUMBERLITERAL_TOKENVALUE = Java_PackageImpl.eINSTANCE.getNumberLiteral_TokenValue();
				public static EClass NULLLITERAL = Java_PackageImpl.eINSTANCE.getNullLiteral();
				
				
				public static EClass PACKAGE = Java_PackageImpl.eINSTANCE.getPackage();
				
				public static EReference PACKAGE_OWNEDELEMENTS = Java_PackageImpl.eINSTANCE.getPackage_OwnedElements();
				public static EReference PACKAGE_MODEL = Java_PackageImpl.eINSTANCE.getPackage_Model();
				public static EReference PACKAGE_OWNEDPACKAGES = Java_PackageImpl.eINSTANCE.getPackage_OwnedPackages();
				public static EReference PACKAGE_PACKAGE = Java_PackageImpl.eINSTANCE.getPackage_Package();
				public static EReference PACKAGE_USAGESINPACKAGEACCESS = Java_PackageImpl.eINSTANCE.getPackage_UsagesInPackageAccess();
				
				public static EClass PACKAGEACCESS = Java_PackageImpl.eINSTANCE.getPackageAccess();
				
				public static EReference PACKAGEACCESS_PACKAGE = Java_PackageImpl.eINSTANCE.getPackageAccess_Package();
				public static EReference PACKAGEACCESS_QUALIFIER = Java_PackageImpl.eINSTANCE.getPackageAccess_Qualifier();
				
				public static EClass PARAMETERIZEDTYPE = Java_PackageImpl.eINSTANCE.getParameterizedType();
				
				public static EReference PARAMETERIZEDTYPE_TYPE = Java_PackageImpl.eINSTANCE.getParameterizedType_Type();
				public static EReference PARAMETERIZEDTYPE_TYPEARGUMENTS = Java_PackageImpl.eINSTANCE.getParameterizedType_TypeArguments();
				
				public static EClass PARENTHESIZEDEXPRESSION = Java_PackageImpl.eINSTANCE.getParenthesizedExpression();
				
				public static EReference PARENTHESIZEDEXPRESSION_EXPRESSION = Java_PackageImpl.eINSTANCE.getParenthesizedExpression_Expression();
				
				public static EClass POSTFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getPostfixExpression();
				
				public static EReference POSTFIXEXPRESSION_OPERAND = Java_PackageImpl.eINSTANCE.getPostfixExpression_Operand();
				
				public static EAttribute POSTFIXEXPRESSION_OPERATOR = Java_PackageImpl.eINSTANCE.getPostfixExpression_Operator();
				public static EClass PREFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getPrefixExpression();
				
				public static EReference PREFIXEXPRESSION_OPERAND = Java_PackageImpl.eINSTANCE.getPrefixExpression_Operand();
				
				public static EAttribute PREFIXEXPRESSION_OPERATOR = Java_PackageImpl.eINSTANCE.getPrefixExpression_Operator();
				public static EClass PRIMITIVETYPE = Java_PackageImpl.eINSTANCE.getPrimitiveType();
				
				
				public static EClass PRIMITIVETYPEBOOLEAN = Java_PackageImpl.eINSTANCE.getPrimitiveTypeBoolean();
				
				
				public static EClass PRIMITIVETYPEBYTE = Java_PackageImpl.eINSTANCE.getPrimitiveTypeByte();
				
				
				public static EClass PRIMITIVETYPECHAR = Java_PackageImpl.eINSTANCE.getPrimitiveTypeChar();
				
				
				public static EClass PRIMITIVETYPEDOUBLE = Java_PackageImpl.eINSTANCE.getPrimitiveTypeDouble();
				
				
				public static EClass PRIMITIVETYPESHORT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeShort();
				
				
				public static EClass PRIMITIVETYPEFLOAT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeFloat();
				
				
				public static EClass PRIMITIVETYPEINT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeInt();
				
				
				public static EClass PRIMITIVETYPELONG = Java_PackageImpl.eINSTANCE.getPrimitiveTypeLong();
				
				
				public static EClass PRIMITIVETYPEVOID = Java_PackageImpl.eINSTANCE.getPrimitiveTypeVoid();
				
				
				public static EClass RETURNSTATEMENT = Java_PackageImpl.eINSTANCE.getReturnStatement();
				
				public static EReference RETURNSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getReturnStatement_Expression();
				
				public static EClass SINGLEVARIABLEACCESS = Java_PackageImpl.eINSTANCE.getSingleVariableAccess();
				
				public static EReference SINGLEVARIABLEACCESS_VARIABLE = Java_PackageImpl.eINSTANCE.getSingleVariableAccess_Variable();
				public static EReference SINGLEVARIABLEACCESS_QUALIFIER = Java_PackageImpl.eINSTANCE.getSingleVariableAccess_Qualifier();
				
				public static EClass SINGLEVARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration();
				
				public static EReference SINGLEVARIABLEDECLARATION_MODIFIER = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Modifier();
				public static EReference SINGLEVARIABLEDECLARATION_TYPE = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Type();
				public static EReference SINGLEVARIABLEDECLARATION_ANNOTATIONS = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Annotations();
				public static EReference SINGLEVARIABLEDECLARATION_METHODDECLARATION = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_MethodDeclaration();
				public static EReference SINGLEVARIABLEDECLARATION_CATCHCLAUSE = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_CatchClause();
				public static EReference SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_EnhancedForStatement();
				
				public static EAttribute SINGLEVARIABLEDECLARATION_VARARGS = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Varargs();
				public static EClass STRINGLITERAL = Java_PackageImpl.eINSTANCE.getStringLiteral();
				
				
				public static EAttribute STRINGLITERAL_ESCAPEDVALUE = Java_PackageImpl.eINSTANCE.getStringLiteral_EscapedValue();
				public static EClass SUPERCONSTRUCTORINVOCATION = Java_PackageImpl.eINSTANCE.getSuperConstructorInvocation();
				
				public static EReference SUPERCONSTRUCTORINVOCATION_EXPRESSION = Java_PackageImpl.eINSTANCE.getSuperConstructorInvocation_Expression();
				
				public static EClass SUPERFIELDACCESS = Java_PackageImpl.eINSTANCE.getSuperFieldAccess();
				
				public static EReference SUPERFIELDACCESS_FIELD = Java_PackageImpl.eINSTANCE.getSuperFieldAccess_Field();
				
				public static EClass SUPERMETHODINVOCATION = Java_PackageImpl.eINSTANCE.getSuperMethodInvocation();
				
				
				public static EClass SWITCHCASE = Java_PackageImpl.eINSTANCE.getSwitchCase();
				
				public static EReference SWITCHCASE_EXPRESSION = Java_PackageImpl.eINSTANCE.getSwitchCase_Expression();
				
				public static EAttribute SWITCHCASE_DEFAULT = Java_PackageImpl.eINSTANCE.getSwitchCase_Default();
				public static EClass SWITCHSTATEMENT = Java_PackageImpl.eINSTANCE.getSwitchStatement();
				
				public static EReference SWITCHSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getSwitchStatement_Expression();
				public static EReference SWITCHSTATEMENT_STATEMENTS = Java_PackageImpl.eINSTANCE.getSwitchStatement_Statements();
				
				public static EClass SYNCHRONIZEDSTATEMENT = Java_PackageImpl.eINSTANCE.getSynchronizedStatement();
				
				public static EReference SYNCHRONIZEDSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getSynchronizedStatement_Body();
				public static EReference SYNCHRONIZEDSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getSynchronizedStatement_Expression();
				
				public static EClass TAGELEMENT = Java_PackageImpl.eINSTANCE.getTagElement();
				
				public static EReference TAGELEMENT_FRAGMENTS = Java_PackageImpl.eINSTANCE.getTagElement_Fragments();
				
				public static EAttribute TAGELEMENT_TAGNAME = Java_PackageImpl.eINSTANCE.getTagElement_TagName();
				public static EClass TEXTELEMENT = Java_PackageImpl.eINSTANCE.getTextElement();
				
				
				public static EAttribute TEXTELEMENT_TEXT = Java_PackageImpl.eINSTANCE.getTextElement_Text();
				public static EClass THISEXPRESSION = Java_PackageImpl.eINSTANCE.getThisExpression();
				
				
				public static EClass THROWSTATEMENT = Java_PackageImpl.eINSTANCE.getThrowStatement();
				
				public static EReference THROWSTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getThrowStatement_Expression();
				
				public static EClass TRYSTATEMENT = Java_PackageImpl.eINSTANCE.getTryStatement();
				
				public static EReference TRYSTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getTryStatement_Body();
				public static EReference TRYSTATEMENT_FINALLY = Java_PackageImpl.eINSTANCE.getTryStatement_Finally();
				public static EReference TRYSTATEMENT_CATCHCLAUSES = Java_PackageImpl.eINSTANCE.getTryStatement_CatchClauses();
				
				public static EClass TYPEACCESS = Java_PackageImpl.eINSTANCE.getTypeAccess();
				
				public static EReference TYPEACCESS_TYPE = Java_PackageImpl.eINSTANCE.getTypeAccess_Type();
				public static EReference TYPEACCESS_QUALIFIER = Java_PackageImpl.eINSTANCE.getTypeAccess_Qualifier();
				
				public static EClass TYPEDECLARATIONSTATEMENT = Java_PackageImpl.eINSTANCE.getTypeDeclarationStatement();
				
				public static EReference TYPEDECLARATIONSTATEMENT_DECLARATION = Java_PackageImpl.eINSTANCE.getTypeDeclarationStatement_Declaration();
				
				public static EClass TYPELITERAL = Java_PackageImpl.eINSTANCE.getTypeLiteral();
				
				public static EReference TYPELITERAL_TYPE = Java_PackageImpl.eINSTANCE.getTypeLiteral_Type();
				
				public static EClass TYPEPARAMETER = Java_PackageImpl.eINSTANCE.getTypeParameter();
				
				public static EReference TYPEPARAMETER_BOUNDS = Java_PackageImpl.eINSTANCE.getTypeParameter_Bounds();
				
				public static EClass UNRESOLVEDITEM = Java_PackageImpl.eINSTANCE.getUnresolvedItem();
				
				
				public static EClass UNRESOLVEDITEMACCESS = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess();
				
				public static EReference UNRESOLVEDITEMACCESS_ELEMENT = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess_Element();
				public static EReference UNRESOLVEDITEMACCESS_QUALIFIER = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess_Qualifier();
				
				public static EClass UNRESOLVEDANNOTATIONDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedAnnotationDeclaration();
				
				
				public static EClass UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedAnnotationTypeMemberDeclaration();
				
				
				public static EClass UNRESOLVEDCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedClassDeclaration();
				
				
				public static EClass UNRESOLVEDENUMDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedEnumDeclaration();
				
				
				public static EClass UNRESOLVEDINTERFACEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedInterfaceDeclaration();
				
				
				public static EClass UNRESOLVEDLABELEDSTATEMENT = Java_PackageImpl.eINSTANCE.getUnresolvedLabeledStatement();
				
				
				public static EClass UNRESOLVEDMETHODDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedMethodDeclaration();
				
				
				public static EClass UNRESOLVEDSINGLEVARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedSingleVariableDeclaration();
				
				
				public static EClass UNRESOLVEDTYPE = Java_PackageImpl.eINSTANCE.getUnresolvedType();
				
				
				public static EClass UNRESOLVEDTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedTypeDeclaration();
				
				
				public static EClass VARIABLEDECLARATIONFRAGMENT = Java_PackageImpl.eINSTANCE.getVariableDeclarationFragment();
				
				public static EReference VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER = Java_PackageImpl.eINSTANCE.getVariableDeclarationFragment_VariablesContainer();
				
				public static EClass UNRESOLVEDVARIABLEDECLARATIONFRAGMENT = Java_PackageImpl.eINSTANCE.getUnresolvedVariableDeclarationFragment();
				
				
				public static EClass VARIABLEDECLARATIONEXPRESSION = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression();
				
				public static EReference VARIABLEDECLARATIONEXPRESSION_MODIFIER = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression_Modifier();
				public static EReference VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression_Annotations();
				
				public static EClass VARIABLEDECLARATIONSTATEMENT = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement();
				
				public static EReference VARIABLEDECLARATIONSTATEMENT_MODIFIER = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_Modifier();
				public static EReference VARIABLEDECLARATIONSTATEMENT_ANNOTATIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_Annotations();
				
				public static EAttribute VARIABLEDECLARATIONSTATEMENT_EXTRAARRAYDIMENSIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_ExtraArrayDimensions();
				public static EClass WILDCARDTYPE = Java_PackageImpl.eINSTANCE.getWildCardType();
				
				public static EReference WILDCARDTYPE_BOUND = Java_PackageImpl.eINSTANCE.getWildCardType_Bound();
				
				public static EAttribute WILDCARDTYPE_UPPERBOUND = Java_PackageImpl.eINSTANCE.getWildCardType_UpperBound();
				public static EClass WHILESTATEMENT = Java_PackageImpl.eINSTANCE.getWhileStatement();
				
				public static EReference WHILESTATEMENT_EXPRESSION = Java_PackageImpl.eINSTANCE.getWhileStatement_Expression();
				public static EReference WHILESTATEMENT_BODY = Java_PackageImpl.eINSTANCE.getWhileStatement_Body();
				
				public static EEnum ASSIGNMENTKIND = Java_PackageImpl.eINSTANCE.getAssignmentKind();
				public static EEnum INFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getInfixExpressionKind();
				public static EEnum INHERITANCEKIND = Java_PackageImpl.eINSTANCE.getInheritanceKind();
				public static EEnum POSTFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getPostfixExpressionKind();
				public static EEnum PREFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getPrefixExpressionKind();
				public static EEnum VISIBILITYKIND = Java_PackageImpl.eINSTANCE.getVisibilityKind();
			}
	 
	}
}
