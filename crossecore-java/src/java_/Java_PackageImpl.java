package java_;

import org.eclipse.emf.ecore.*;

public class Java_PackageImpl extends org.eclipse.emf.ecore.impl.EPackageImpl implements Java_Package{
		public static String eNAME = "java_";
		
		public static String eNS_URI = "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_";
		
		public static String eNS_PREFIX = "java_";
		
		public static Java_Package eINSTANCE = init();
		
		private Java_PackageImpl()
		{
			super(eNS_URI, Java_FactoryImpl.eINSTANCE);
		}
		
		private static boolean isInited = false;
		
		
		public static void unload(){
		
			AbstractMethodDeclaration.allInstances_.clear();
			AbstractMethodInvocation.allInstances_.clear();
			AbstractTypeDeclaration.allInstances_.clear();
			AbstractTypeQualifiedExpression.allInstances_.clear();
			AbstractVariablesContainer.allInstances_.clear();
			Annotation.allInstances_.clear();
			Archive.allInstances_.clear();
			AssertStatement.allInstances_.clear();
			ASTNode.allInstances_.clear();
			AnnotationMemberValuePair.allInstances_.clear();
			AnnotationTypeDeclaration.allInstances_.clear();
			AnnotationTypeMemberDeclaration.allInstances_.clear();
			AnonymousClassDeclaration.allInstances_.clear();
			ArrayAccess.allInstances_.clear();
			ArrayCreation.allInstances_.clear();
			ArrayInitializer.allInstances_.clear();
			ArrayLengthAccess.allInstances_.clear();
			ArrayType.allInstances_.clear();
			Assignment.allInstances_.clear();
			BodyDeclaration.allInstances_.clear();
			BooleanLiteral.allInstances_.clear();
			BlockComment.allInstances_.clear();
			Block.allInstances_.clear();
			BreakStatement.allInstances_.clear();
			CastExpression.allInstances_.clear();
			CatchClause.allInstances_.clear();
			CharacterLiteral.allInstances_.clear();
			ClassFile.allInstances_.clear();
			ClassInstanceCreation.allInstances_.clear();
			ConstructorDeclaration.allInstances_.clear();
			ConditionalExpression.allInstances_.clear();
			ConstructorInvocation.allInstances_.clear();
			ClassDeclaration.allInstances_.clear();
			Comment.allInstances_.clear();
			CompilationUnit.allInstances_.clear();
			ContinueStatement.allInstances_.clear();
			DoStatement.allInstances_.clear();
			EmptyStatement.allInstances_.clear();
			EnhancedForStatement.allInstances_.clear();
			EnumConstantDeclaration.allInstances_.clear();
			EnumDeclaration.allInstances_.clear();
			Expression.allInstances_.clear();
			ExpressionStatement.allInstances_.clear();
			FieldAccess.allInstances_.clear();
			FieldDeclaration.allInstances_.clear();
			ForStatement.allInstances_.clear();
			IfStatement.allInstances_.clear();
			ImportDeclaration.allInstances_.clear();
			InfixExpression.allInstances_.clear();
			Initializer.allInstances_.clear();
			InstanceofExpression.allInstances_.clear();
			InterfaceDeclaration.allInstances_.clear();
			Javadoc.allInstances_.clear();
			LabeledStatement.allInstances_.clear();
			LineComment.allInstances_.clear();
			Manifest.allInstances_.clear();
			ManifestAttribute.allInstances_.clear();
			ManifestEntry.allInstances_.clear();
			MemberRef.allInstances_.clear();
			MethodDeclaration.allInstances_.clear();
			MethodInvocation.allInstances_.clear();
			MethodRef.allInstances_.clear();
			MethodRefParameter.allInstances_.clear();
			Model.allInstances_.clear();
			Modifier.allInstances_.clear();
			NamedElement.allInstances_.clear();
			NamespaceAccess.allInstances_.clear();
			NumberLiteral.allInstances_.clear();
			NullLiteral.allInstances_.clear();
			Package.allInstances_.clear();
			PackageAccess.allInstances_.clear();
			ParameterizedType.allInstances_.clear();
			ParenthesizedExpression.allInstances_.clear();
			PostfixExpression.allInstances_.clear();
			PrefixExpression.allInstances_.clear();
			PrimitiveType.allInstances_.clear();
			PrimitiveTypeBoolean.allInstances_.clear();
			PrimitiveTypeByte.allInstances_.clear();
			PrimitiveTypeChar.allInstances_.clear();
			PrimitiveTypeDouble.allInstances_.clear();
			PrimitiveTypeShort.allInstances_.clear();
			PrimitiveTypeFloat.allInstances_.clear();
			PrimitiveTypeInt.allInstances_.clear();
			PrimitiveTypeLong.allInstances_.clear();
			PrimitiveTypeVoid.allInstances_.clear();
			ReturnStatement.allInstances_.clear();
			SingleVariableAccess.allInstances_.clear();
			SingleVariableDeclaration.allInstances_.clear();
			Statement.allInstances_.clear();
			StringLiteral.allInstances_.clear();
			SuperConstructorInvocation.allInstances_.clear();
			SuperFieldAccess.allInstances_.clear();
			SuperMethodInvocation.allInstances_.clear();
			SwitchCase.allInstances_.clear();
			SwitchStatement.allInstances_.clear();
			SynchronizedStatement.allInstances_.clear();
			TagElement.allInstances_.clear();
			TextElement.allInstances_.clear();
			ThisExpression.allInstances_.clear();
			ThrowStatement.allInstances_.clear();
			TryStatement.allInstances_.clear();
			Type.allInstances_.clear();
			TypeAccess.allInstances_.clear();
			TypeDeclaration.allInstances_.clear();
			TypeDeclarationStatement.allInstances_.clear();
			TypeLiteral.allInstances_.clear();
			TypeParameter.allInstances_.clear();
			UnresolvedItem.allInstances_.clear();
			UnresolvedItemAccess.allInstances_.clear();
			UnresolvedAnnotationDeclaration.allInstances_.clear();
			UnresolvedAnnotationTypeMemberDeclaration.allInstances_.clear();
			UnresolvedClassDeclaration.allInstances_.clear();
			UnresolvedEnumDeclaration.allInstances_.clear();
			UnresolvedInterfaceDeclaration.allInstances_.clear();
			UnresolvedLabeledStatement.allInstances_.clear();
			UnresolvedMethodDeclaration.allInstances_.clear();
			UnresolvedSingleVariableDeclaration.allInstances_.clear();
			UnresolvedType.allInstances_.clear();
			UnresolvedTypeDeclaration.allInstances_.clear();
			UnresolvedVariableDeclarationFragment.allInstances_.clear();
			VariableDeclaration.allInstances_.clear();
			VariableDeclarationExpression.allInstances_.clear();
			VariableDeclarationFragment.allInstances_.clear();
			VariableDeclarationStatement.allInstances_.clear();
			WildCardType.allInstances_.clear();
			WhileStatement.allInstances_.clear();
			
		}
		
		public static Java_Package init()
		{
			
			unload();
			
			if (isInited) return (Java_Package)EPackage.Registry.INSTANCE.getEPackage(Java_PackageImpl.eNS_URI);

			// Obtain or create and register package
			Java_PackageImpl thePackage = (Java_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Java_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Java_PackageImpl());

			isInited = true;

			// Create package meta-data objects
			thePackage.createPackageContents();

			// Initialize created meta-data
			thePackage.initializePackageContents();

			// Register package validator
			EValidator.Registry.INSTANCE.put
				(thePackage, 
				 new EValidator.Descriptor() {
					 public EValidator getEValidator() {
						 return Java_Validator.INSTANCE;
					 }
			 });

			// Mark meta-data to indicate it can't be changed
			thePackage.freeze();

			// Update the registry and return the package
			EPackage.Registry.INSTANCE.put(Java_PackageImpl.eNS_URI, thePackage);
			return thePackage;
        }
        
        private boolean isCreated = false;
	            public void createPackageContents()
	            {
	                if (isCreated) return;
	                isCreated = true;
			AbstractMethodDeclarationEClass = createEClass(ABSTRACTMETHODDECLARATION);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__BODY);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__PARAMETERS);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS);
			createEReference(AbstractMethodDeclarationEClass, ABSTRACT_METHOD_DECLARATION__USAGES);
			AbstractMethodInvocationEClass = createEClass(ABSTRACTMETHODINVOCATION);
			createEReference(AbstractMethodInvocationEClass, ABSTRACT_METHOD_INVOCATION__METHOD);
			createEReference(AbstractMethodInvocationEClass, ABSTRACT_METHOD_INVOCATION__ARGUMENTS);
			createEReference(AbstractMethodInvocationEClass, ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS);
			AbstractTypeDeclarationEClass = createEClass(ABSTRACTTYPEDECLARATION);
			createEReference(AbstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS);
			createEReference(AbstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY);
			createEReference(AbstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY);
			createEReference(AbstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__PACKAGE);
			createEReference(AbstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES);
			AbstractTypeQualifiedExpressionEClass = createEClass(ABSTRACTTYPEQUALIFIEDEXPRESSION);
			createEReference(AbstractTypeQualifiedExpressionEClass, ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER);
			AbstractVariablesContainerEClass = createEClass(ABSTRACTVARIABLESCONTAINER);
			createEReference(AbstractVariablesContainerEClass, ABSTRACT_VARIABLES_CONTAINER__TYPE);
			createEReference(AbstractVariablesContainerEClass, ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS);
			AnnotationEClass = createEClass(ANNOTATION);
			createEReference(AnnotationEClass, ANNOTATION__TYPE);
			createEReference(AnnotationEClass, ANNOTATION__VALUES);
			ArchiveEClass = createEClass(ARCHIVE);
			createEAttribute(ArchiveEClass, ARCHIVE__ORIGINAL_FILE_PATH);
			createEReference(ArchiveEClass, ARCHIVE__CLASS_FILES);
			createEReference(ArchiveEClass, ARCHIVE__MANIFEST);
			AssertStatementEClass = createEClass(ASSERTSTATEMENT);
			createEReference(AssertStatementEClass, ASSERT_STATEMENT__MESSAGE);
			createEReference(AssertStatementEClass, ASSERT_STATEMENT__EXPRESSION);
			ASTNodeEClass = createEClass(ASTNODE);
			createEReference(ASTNodeEClass, ASTNODE__COMMENTS);
			createEReference(ASTNodeEClass, ASTNODE__ORIGINAL_COMPILATION_UNIT);
			createEReference(ASTNodeEClass, ASTNODE__ORIGINAL_CLASS_FILE);
			AnnotationMemberValuePairEClass = createEClass(ANNOTATIONMEMBERVALUEPAIR);
			createEReference(AnnotationMemberValuePairEClass, ANNOTATION_MEMBER_VALUE_PAIR__MEMBER);
			createEReference(AnnotationMemberValuePairEClass, ANNOTATION_MEMBER_VALUE_PAIR__VALUE);
			AnnotationTypeDeclarationEClass = createEClass(ANNOTATIONTYPEDECLARATION);
			AnnotationTypeMemberDeclarationEClass = createEClass(ANNOTATIONTYPEMEMBERDECLARATION);
			createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT);
			createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE);
			createEReference(AnnotationTypeMemberDeclarationEClass, ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES);
			AnonymousClassDeclarationEClass = createEClass(ANONYMOUSCLASSDECLARATION);
			createEReference(AnonymousClassDeclarationEClass, ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS);
			createEReference(AnonymousClassDeclarationEClass, ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION);
			ArrayAccessEClass = createEClass(ARRAYACCESS);
			createEReference(ArrayAccessEClass, ARRAY_ACCESS__ARRAY);
			createEReference(ArrayAccessEClass, ARRAY_ACCESS__INDEX);
			ArrayCreationEClass = createEClass(ARRAYCREATION);
			createEReference(ArrayCreationEClass, ARRAY_CREATION__DIMENSIONS);
			createEReference(ArrayCreationEClass, ARRAY_CREATION__INITIALIZER);
			createEReference(ArrayCreationEClass, ARRAY_CREATION__TYPE);
			ArrayInitializerEClass = createEClass(ARRAYINITIALIZER);
			createEReference(ArrayInitializerEClass, ARRAY_INITIALIZER__EXPRESSIONS);
			ArrayLengthAccessEClass = createEClass(ARRAYLENGTHACCESS);
			createEReference(ArrayLengthAccessEClass, ARRAY_LENGTH_ACCESS__ARRAY);
			ArrayTypeEClass = createEClass(ARRAYTYPE);
			createEAttribute(ArrayTypeEClass, ARRAY_TYPE__DIMENSIONS);
			createEReference(ArrayTypeEClass, ARRAY_TYPE__ELEMENT_TYPE);
			AssignmentEClass = createEClass(ASSIGNMENT);
			createEReference(AssignmentEClass, ASSIGNMENT__LEFT_HAND_SIDE);
			createEAttribute(AssignmentEClass, ASSIGNMENT__OPERATOR);
			createEReference(AssignmentEClass, ASSIGNMENT__RIGHT_HAND_SIDE);
			BodyDeclarationEClass = createEClass(BODYDECLARATION);
			createEReference(BodyDeclarationEClass, BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION);
			createEReference(BodyDeclarationEClass, BODY_DECLARATION__ANNOTATIONS);
			createEReference(BodyDeclarationEClass, BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER);
			createEReference(BodyDeclarationEClass, BODY_DECLARATION__MODIFIER);
			BooleanLiteralEClass = createEClass(BOOLEANLITERAL);
			createEAttribute(BooleanLiteralEClass, BOOLEAN_LITERAL__VALUE);
			BlockCommentEClass = createEClass(BLOCKCOMMENT);
			BlockEClass = createEClass(BLOCK);
			createEReference(BlockEClass, BLOCK__STATEMENTS);
			BreakStatementEClass = createEClass(BREAKSTATEMENT);
			createEReference(BreakStatementEClass, BREAK_STATEMENT__LABEL);
			CastExpressionEClass = createEClass(CASTEXPRESSION);
			createEReference(CastExpressionEClass, CAST_EXPRESSION__EXPRESSION);
			createEReference(CastExpressionEClass, CAST_EXPRESSION__TYPE);
			CatchClauseEClass = createEClass(CATCHCLAUSE);
			createEReference(CatchClauseEClass, CATCH_CLAUSE__EXCEPTION);
			createEReference(CatchClauseEClass, CATCH_CLAUSE__BODY);
			CharacterLiteralEClass = createEClass(CHARACTERLITERAL);
			createEAttribute(CharacterLiteralEClass, CHARACTER_LITERAL__ESCAPED_VALUE);
			ClassFileEClass = createEClass(CLASSFILE);
			createEAttribute(ClassFileEClass, CLASS_FILE__ORIGINAL_FILE_PATH);
			createEReference(ClassFileEClass, CLASS_FILE__TYPE);
			createEReference(ClassFileEClass, CLASS_FILE__ATTACHED_SOURCE);
			createEReference(ClassFileEClass, CLASS_FILE__PACKAGE);
			ClassInstanceCreationEClass = createEClass(CLASSINSTANCECREATION);
			createEReference(ClassInstanceCreationEClass, CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION);
			createEReference(ClassInstanceCreationEClass, CLASS_INSTANCE_CREATION__EXPRESSION);
			createEReference(ClassInstanceCreationEClass, CLASS_INSTANCE_CREATION__TYPE);
			ConstructorDeclarationEClass = createEClass(CONSTRUCTORDECLARATION);
			ConditionalExpressionEClass = createEClass(CONDITIONALEXPRESSION);
			createEReference(ConditionalExpressionEClass, CONDITIONAL_EXPRESSION__ELSE_EXPRESSION);
			createEReference(ConditionalExpressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION);
			createEReference(ConditionalExpressionEClass, CONDITIONAL_EXPRESSION__THEN_EXPRESSION);
			ConstructorInvocationEClass = createEClass(CONSTRUCTORINVOCATION);
			ClassDeclarationEClass = createEClass(CLASSDECLARATION);
			createEReference(ClassDeclarationEClass, CLASS_DECLARATION__SUPER_CLASS);
			CommentEClass = createEClass(COMMENT);
			createEAttribute(CommentEClass, COMMENT__CONTENT);
			createEAttribute(CommentEClass, COMMENT__ENCLOSED_BY_PARENT);
			createEAttribute(CommentEClass, COMMENT__PREFIX_OF_PARENT);
			CompilationUnitEClass = createEClass(COMPILATIONUNIT);
			createEAttribute(CompilationUnitEClass, COMPILATION_UNIT__ORIGINAL_FILE_PATH);
			createEReference(CompilationUnitEClass, COMPILATION_UNIT__COMMENT_LIST);
			createEReference(CompilationUnitEClass, COMPILATION_UNIT__IMPORTS);
			createEReference(CompilationUnitEClass, COMPILATION_UNIT__PACKAGE);
			createEReference(CompilationUnitEClass, COMPILATION_UNIT__TYPES);
			ContinueStatementEClass = createEClass(CONTINUESTATEMENT);
			createEReference(ContinueStatementEClass, CONTINUE_STATEMENT__LABEL);
			DoStatementEClass = createEClass(DOSTATEMENT);
			createEReference(DoStatementEClass, DO_STATEMENT__EXPRESSION);
			createEReference(DoStatementEClass, DO_STATEMENT__BODY);
			EmptyStatementEClass = createEClass(EMPTYSTATEMENT);
			EnhancedForStatementEClass = createEClass(ENHANCEDFORSTATEMENT);
			createEReference(EnhancedForStatementEClass, ENHANCED_FOR_STATEMENT__BODY);
			createEReference(EnhancedForStatementEClass, ENHANCED_FOR_STATEMENT__EXPRESSION);
			createEReference(EnhancedForStatementEClass, ENHANCED_FOR_STATEMENT__PARAMETER);
			EnumConstantDeclarationEClass = createEClass(ENUMCONSTANTDECLARATION);
			createEReference(EnumConstantDeclarationEClass, ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION);
			createEReference(EnumConstantDeclarationEClass, ENUM_CONSTANT_DECLARATION__ARGUMENTS);
			EnumDeclarationEClass = createEClass(ENUMDECLARATION);
			createEReference(EnumDeclarationEClass, ENUM_DECLARATION__ENUM_CONSTANTS);
			ExpressionEClass = createEClass(EXPRESSION);
			ExpressionStatementEClass = createEClass(EXPRESSIONSTATEMENT);
			createEReference(ExpressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);
			FieldAccessEClass = createEClass(FIELDACCESS);
			createEReference(FieldAccessEClass, FIELD_ACCESS__FIELD);
			createEReference(FieldAccessEClass, FIELD_ACCESS__EXPRESSION);
			FieldDeclarationEClass = createEClass(FIELDDECLARATION);
			ForStatementEClass = createEClass(FORSTATEMENT);
			createEReference(ForStatementEClass, FOR_STATEMENT__EXPRESSION);
			createEReference(ForStatementEClass, FOR_STATEMENT__UPDATERS);
			createEReference(ForStatementEClass, FOR_STATEMENT__INITIALIZERS);
			createEReference(ForStatementEClass, FOR_STATEMENT__BODY);
			IfStatementEClass = createEClass(IFSTATEMENT);
			createEReference(IfStatementEClass, IF_STATEMENT__EXPRESSION);
			createEReference(IfStatementEClass, IF_STATEMENT__THEN_STATEMENT);
			createEReference(IfStatementEClass, IF_STATEMENT__ELSE_STATEMENT);
			ImportDeclarationEClass = createEClass(IMPORTDECLARATION);
			createEAttribute(ImportDeclarationEClass, IMPORT_DECLARATION__STATIC);
			createEReference(ImportDeclarationEClass, IMPORT_DECLARATION__IMPORTED_ELEMENT);
			InfixExpressionEClass = createEClass(INFIXEXPRESSION);
			createEAttribute(InfixExpressionEClass, INFIX_EXPRESSION__OPERATOR);
			createEReference(InfixExpressionEClass, INFIX_EXPRESSION__RIGHT_OPERAND);
			createEReference(InfixExpressionEClass, INFIX_EXPRESSION__LEFT_OPERAND);
			createEReference(InfixExpressionEClass, INFIX_EXPRESSION__EXTENDED_OPERANDS);
			InitializerEClass = createEClass(INITIALIZER);
			createEReference(InitializerEClass, INITIALIZER__BODY);
			InstanceofExpressionEClass = createEClass(INSTANCEOFEXPRESSION);
			createEReference(InstanceofExpressionEClass, INSTANCEOF_EXPRESSION__RIGHT_OPERAND);
			createEReference(InstanceofExpressionEClass, INSTANCEOF_EXPRESSION__LEFT_OPERAND);
			InterfaceDeclarationEClass = createEClass(INTERFACEDECLARATION);
			JavadocEClass = createEClass(JAVADOC);
			createEReference(JavadocEClass, JAVADOC__TAGS);
			LabeledStatementEClass = createEClass(LABELEDSTATEMENT);
			createEReference(LabeledStatementEClass, LABELED_STATEMENT__BODY);
			createEReference(LabeledStatementEClass, LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS);
			createEReference(LabeledStatementEClass, LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS);
			LineCommentEClass = createEClass(LINECOMMENT);
			ManifestEClass = createEClass(MANIFEST);
			createEReference(ManifestEClass, MANIFEST__MAIN_ATTRIBUTES);
			createEReference(ManifestEClass, MANIFEST__ENTRY_ATTRIBUTES);
			ManifestAttributeEClass = createEClass(MANIFESTATTRIBUTE);
			createEAttribute(ManifestAttributeEClass, MANIFEST_ATTRIBUTE__KEY);
			createEAttribute(ManifestAttributeEClass, MANIFEST_ATTRIBUTE__VALUE);
			ManifestEntryEClass = createEClass(MANIFESTENTRY);
			createEAttribute(ManifestEntryEClass, MANIFEST_ENTRY__NAME);
			createEReference(ManifestEntryEClass, MANIFEST_ENTRY__ATTRIBUTES);
			MemberRefEClass = createEClass(MEMBERREF);
			createEReference(MemberRefEClass, MEMBER_REF__MEMBER);
			createEReference(MemberRefEClass, MEMBER_REF__QUALIFIER);
			MethodDeclarationEClass = createEClass(METHODDECLARATION);
			createEAttribute(MethodDeclarationEClass, METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
			createEReference(MethodDeclarationEClass, METHOD_DECLARATION__RETURN_TYPE);
			createEReference(MethodDeclarationEClass, METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION);
			createEReference(MethodDeclarationEClass, METHOD_DECLARATION__REDEFINITIONS);
			MethodInvocationEClass = createEClass(METHODINVOCATION);
			createEReference(MethodInvocationEClass, METHOD_INVOCATION__EXPRESSION);
			MethodRefEClass = createEClass(METHODREF);
			createEReference(MethodRefEClass, METHOD_REF__METHOD);
			createEReference(MethodRefEClass, METHOD_REF__QUALIFIER);
			createEReference(MethodRefEClass, METHOD_REF__PARAMETERS);
			MethodRefParameterEClass = createEClass(METHODREFPARAMETER);
			createEAttribute(MethodRefParameterEClass, METHOD_REF_PARAMETER__NAME);
			createEAttribute(MethodRefParameterEClass, METHOD_REF_PARAMETER__VARARGS);
			createEReference(MethodRefParameterEClass, METHOD_REF_PARAMETER__TYPE);
			ModelEClass = createEClass(MODEL);
			createEAttribute(ModelEClass, MODEL__NAME);
			createEReference(ModelEClass, MODEL__OWNED_ELEMENTS);
			createEReference(ModelEClass, MODEL__ORPHAN_TYPES);
			createEReference(ModelEClass, MODEL__UNRESOLVED_ITEMS);
			createEReference(ModelEClass, MODEL__COMPILATION_UNITS);
			createEReference(ModelEClass, MODEL__CLASS_FILES);
			createEReference(ModelEClass, MODEL__ARCHIVES);
			ModifierEClass = createEClass(MODIFIER);
			createEAttribute(ModifierEClass, MODIFIER__VISIBILITY);
			createEAttribute(ModifierEClass, MODIFIER__INHERITANCE);
			createEAttribute(ModifierEClass, MODIFIER__STATIC);
			createEAttribute(ModifierEClass, MODIFIER__TRANSIENT);
			createEAttribute(ModifierEClass, MODIFIER__VOLATILE);
			createEAttribute(ModifierEClass, MODIFIER__NATIVE);
			createEAttribute(ModifierEClass, MODIFIER__STRICTFP);
			createEAttribute(ModifierEClass, MODIFIER__SYNCHRONIZED);
			createEReference(ModifierEClass, MODIFIER__BODY_DECLARATION);
			createEReference(ModifierEClass, MODIFIER__SINGLE_VARIABLE_DECLARATION);
			createEReference(ModifierEClass, MODIFIER__VARIABLE_DECLARATION_STATEMENT);
			createEReference(ModifierEClass, MODIFIER__VARIABLE_DECLARATION_EXPRESSION);
			NamedElementEClass = createEClass(NAMEDELEMENT);
			createEAttribute(NamedElementEClass, NAMED_ELEMENT__NAME);
			createEAttribute(NamedElementEClass, NAMED_ELEMENT__PROXY);
			createEReference(NamedElementEClass, NAMED_ELEMENT__USAGES_IN_IMPORTS);
			NamespaceAccessEClass = createEClass(NAMESPACEACCESS);
			NumberLiteralEClass = createEClass(NUMBERLITERAL);
			createEAttribute(NumberLiteralEClass, NUMBER_LITERAL__TOKEN_VALUE);
			NullLiteralEClass = createEClass(NULLLITERAL);
			PackageEClass = createEClass(PACKAGE);
			createEReference(PackageEClass, PACKAGE__OWNED_ELEMENTS);
			createEReference(PackageEClass, PACKAGE__MODEL);
			createEReference(PackageEClass, PACKAGE__OWNED_PACKAGES);
			createEReference(PackageEClass, PACKAGE__PACKAGE);
			createEReference(PackageEClass, PACKAGE__USAGES_IN_PACKAGE_ACCESS);
			PackageAccessEClass = createEClass(PACKAGEACCESS);
			createEReference(PackageAccessEClass, PACKAGE_ACCESS__PACKAGE);
			createEReference(PackageAccessEClass, PACKAGE_ACCESS__QUALIFIER);
			ParameterizedTypeEClass = createEClass(PARAMETERIZEDTYPE);
			createEReference(ParameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE);
			createEReference(ParameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_ARGUMENTS);
			ParenthesizedExpressionEClass = createEClass(PARENTHESIZEDEXPRESSION);
			createEReference(ParenthesizedExpressionEClass, PARENTHESIZED_EXPRESSION__EXPRESSION);
			PostfixExpressionEClass = createEClass(POSTFIXEXPRESSION);
			createEAttribute(PostfixExpressionEClass, POSTFIX_EXPRESSION__OPERATOR);
			createEReference(PostfixExpressionEClass, POSTFIX_EXPRESSION__OPERAND);
			PrefixExpressionEClass = createEClass(PREFIXEXPRESSION);
			createEAttribute(PrefixExpressionEClass, PREFIX_EXPRESSION__OPERATOR);
			createEReference(PrefixExpressionEClass, PREFIX_EXPRESSION__OPERAND);
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
			createEReference(ReturnStatementEClass, RETURN_STATEMENT__EXPRESSION);
			SingleVariableAccessEClass = createEClass(SINGLEVARIABLEACCESS);
			createEReference(SingleVariableAccessEClass, SINGLE_VARIABLE_ACCESS__VARIABLE);
			createEReference(SingleVariableAccessEClass, SINGLE_VARIABLE_ACCESS__QUALIFIER);
			SingleVariableDeclarationEClass = createEClass(SINGLEVARIABLEDECLARATION);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__MODIFIER);
			createEAttribute(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__VARARGS);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__TYPE);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__ANNOTATIONS);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE);
			createEReference(SingleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT);
			StatementEClass = createEClass(STATEMENT);
			StringLiteralEClass = createEClass(STRINGLITERAL);
			createEAttribute(StringLiteralEClass, STRING_LITERAL__ESCAPED_VALUE);
			SuperConstructorInvocationEClass = createEClass(SUPERCONSTRUCTORINVOCATION);
			createEReference(SuperConstructorInvocationEClass, SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION);
			SuperFieldAccessEClass = createEClass(SUPERFIELDACCESS);
			createEReference(SuperFieldAccessEClass, SUPER_FIELD_ACCESS__FIELD);
			SuperMethodInvocationEClass = createEClass(SUPERMETHODINVOCATION);
			SwitchCaseEClass = createEClass(SWITCHCASE);
			createEAttribute(SwitchCaseEClass, SWITCH_CASE__DEFAULT);
			createEReference(SwitchCaseEClass, SWITCH_CASE__EXPRESSION);
			SwitchStatementEClass = createEClass(SWITCHSTATEMENT);
			createEReference(SwitchStatementEClass, SWITCH_STATEMENT__EXPRESSION);
			createEReference(SwitchStatementEClass, SWITCH_STATEMENT__STATEMENTS);
			SynchronizedStatementEClass = createEClass(SYNCHRONIZEDSTATEMENT);
			createEReference(SynchronizedStatementEClass, SYNCHRONIZED_STATEMENT__BODY);
			createEReference(SynchronizedStatementEClass, SYNCHRONIZED_STATEMENT__EXPRESSION);
			TagElementEClass = createEClass(TAGELEMENT);
			createEAttribute(TagElementEClass, TAG_ELEMENT__TAG_NAME);
			createEReference(TagElementEClass, TAG_ELEMENT__FRAGMENTS);
			TextElementEClass = createEClass(TEXTELEMENT);
			createEAttribute(TextElementEClass, TEXT_ELEMENT__TEXT);
			ThisExpressionEClass = createEClass(THISEXPRESSION);
			ThrowStatementEClass = createEClass(THROWSTATEMENT);
			createEReference(ThrowStatementEClass, THROW_STATEMENT__EXPRESSION);
			TryStatementEClass = createEClass(TRYSTATEMENT);
			createEReference(TryStatementEClass, TRY_STATEMENT__BODY);
			createEReference(TryStatementEClass, TRY_STATEMENT__FINALLY);
			createEReference(TryStatementEClass, TRY_STATEMENT__CATCH_CLAUSES);
			TypeEClass = createEClass(TYPE);
			createEReference(TypeEClass, TYPE__USAGES_IN_TYPE_ACCESS);
			TypeAccessEClass = createEClass(TYPEACCESS);
			createEReference(TypeAccessEClass, TYPE_ACCESS__TYPE);
			createEReference(TypeAccessEClass, TYPE_ACCESS__QUALIFIER);
			TypeDeclarationEClass = createEClass(TYPEDECLARATION);
			createEReference(TypeDeclarationEClass, TYPE_DECLARATION__TYPE_PARAMETERS);
			TypeDeclarationStatementEClass = createEClass(TYPEDECLARATIONSTATEMENT);
			createEReference(TypeDeclarationStatementEClass, TYPE_DECLARATION_STATEMENT__DECLARATION);
			TypeLiteralEClass = createEClass(TYPELITERAL);
			createEReference(TypeLiteralEClass, TYPE_LITERAL__TYPE);
			TypeParameterEClass = createEClass(TYPEPARAMETER);
			createEReference(TypeParameterEClass, TYPE_PARAMETER__BOUNDS);
			UnresolvedItemEClass = createEClass(UNRESOLVEDITEM);
			UnresolvedItemAccessEClass = createEClass(UNRESOLVEDITEMACCESS);
			createEReference(UnresolvedItemAccessEClass, UNRESOLVED_ITEM_ACCESS__ELEMENT);
			createEReference(UnresolvedItemAccessEClass, UNRESOLVED_ITEM_ACCESS__QUALIFIER);
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
			createEAttribute(VariableDeclarationEClass, VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
			createEReference(VariableDeclarationEClass, VARIABLE_DECLARATION__INITIALIZER);
			createEReference(VariableDeclarationEClass, VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS);
			VariableDeclarationExpressionEClass = createEClass(VARIABLEDECLARATIONEXPRESSION);
			createEReference(VariableDeclarationExpressionEClass, VARIABLE_DECLARATION_EXPRESSION__MODIFIER);
			createEReference(VariableDeclarationExpressionEClass, VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS);
			VariableDeclarationFragmentEClass = createEClass(VARIABLEDECLARATIONFRAGMENT);
			createEReference(VariableDeclarationFragmentEClass, VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER);
			VariableDeclarationStatementEClass = createEClass(VARIABLEDECLARATIONSTATEMENT);
			createEAttribute(VariableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS);
			createEReference(VariableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__MODIFIER);
			createEReference(VariableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS);
			WildCardTypeEClass = createEClass(WILDCARDTYPE);
			createEAttribute(WildCardTypeEClass, WILD_CARD_TYPE__UPPER_BOUND);
			createEReference(WildCardTypeEClass, WILD_CARD_TYPE__BOUND);
			WhileStatementEClass = createEClass(WHILESTATEMENT);
			createEReference(WhileStatementEClass, WHILE_STATEMENT__EXPRESSION);
			createEReference(WhileStatementEClass, WHILE_STATEMENT__BODY);
			
			AssignmentKindEEnum = createEEnum(ASSIGNMENTKIND);
			InfixExpressionKindEEnum = createEEnum(INFIXEXPRESSIONKIND);
			InheritanceKindEEnum = createEEnum(INHERITANCEKIND);
			PostfixExpressionKindEEnum = createEEnum(POSTFIXEXPRESSIONKIND);
			PrefixExpressionKindEEnum = createEEnum(PREFIXEXPRESSIONKIND);
			VisibilityKindEEnum = createEEnum(VISIBILITYKIND);
        }
        
        private boolean isInitialized = false;
        public void initializePackageContents()
        {
	                if (isInitialized) return;
	                isInitialized = true;
            // Initialize package
			setName(eNAME);
			setNsPrefix(eNS_PREFIX);
			setNsURI(eNS_URI);

			
			AbstractMethodDeclarationEClass.getESuperTypes().add(getBodyDeclaration());
										
			
			AbstractMethodInvocationEClass.getESuperTypes().add(getASTNode());
										
			
			AbstractTypeDeclarationEClass.getESuperTypes().add(getBodyDeclaration());
										
			AbstractTypeDeclarationEClass.getESuperTypes().add(getType());
										
			
			AbstractTypeQualifiedExpressionEClass.getESuperTypes().add(getExpression());
										
			
			AbstractVariablesContainerEClass.getESuperTypes().add(getASTNode());
										
			
			AnnotationEClass.getESuperTypes().add(getExpression());
										
			
			ArchiveEClass.getESuperTypes().add(getNamedElement());
										
			
			AssertStatementEClass.getESuperTypes().add(getStatement());
										
			
			
			AnnotationMemberValuePairEClass.getESuperTypes().add(getNamedElement());
										
			
			AnnotationTypeDeclarationEClass.getESuperTypes().add(getAbstractTypeDeclaration());
										
			
			AnnotationTypeMemberDeclarationEClass.getESuperTypes().add(getBodyDeclaration());
										
			
			AnonymousClassDeclarationEClass.getESuperTypes().add(getASTNode());
										
			
			ArrayAccessEClass.getESuperTypes().add(getExpression());
										
			
			ArrayCreationEClass.getESuperTypes().add(getExpression());
										
			
			ArrayInitializerEClass.getESuperTypes().add(getExpression());
										
			
			ArrayLengthAccessEClass.getESuperTypes().add(getExpression());
										
			
			ArrayTypeEClass.getESuperTypes().add(getType());
										
			
			AssignmentEClass.getESuperTypes().add(getExpression());
										
			
			BodyDeclarationEClass.getESuperTypes().add(getNamedElement());
										
			
			BooleanLiteralEClass.getESuperTypes().add(getExpression());
										
			
			BlockCommentEClass.getESuperTypes().add(getComment());
										
			
			BlockEClass.getESuperTypes().add(getStatement());
										
			
			BreakStatementEClass.getESuperTypes().add(getStatement());
										
			
			CastExpressionEClass.getESuperTypes().add(getExpression());
										
			
			CatchClauseEClass.getESuperTypes().add(getStatement());
										
			
			CharacterLiteralEClass.getESuperTypes().add(getExpression());
										
			
			ClassFileEClass.getESuperTypes().add(getNamedElement());
										
			
			ClassInstanceCreationEClass.getESuperTypes().add(getExpression());
										
			ClassInstanceCreationEClass.getESuperTypes().add(getAbstractMethodInvocation());
										
			
			ConstructorDeclarationEClass.getESuperTypes().add(getAbstractMethodDeclaration());
										
			
			ConditionalExpressionEClass.getESuperTypes().add(getExpression());
										
			
			ConstructorInvocationEClass.getESuperTypes().add(getStatement());
										
			ConstructorInvocationEClass.getESuperTypes().add(getAbstractMethodInvocation());
										
			
			ClassDeclarationEClass.getESuperTypes().add(getTypeDeclaration());
										
			
			CommentEClass.getESuperTypes().add(getASTNode());
										
			
			CompilationUnitEClass.getESuperTypes().add(getNamedElement());
										
			
			ContinueStatementEClass.getESuperTypes().add(getStatement());
										
			
			DoStatementEClass.getESuperTypes().add(getStatement());
										
			
			EmptyStatementEClass.getESuperTypes().add(getStatement());
										
			
			EnhancedForStatementEClass.getESuperTypes().add(getStatement());
										
			
			EnumConstantDeclarationEClass.getESuperTypes().add(getBodyDeclaration());
										
			EnumConstantDeclarationEClass.getESuperTypes().add(getVariableDeclaration());
										
			
			EnumDeclarationEClass.getESuperTypes().add(getAbstractTypeDeclaration());
										
			
			ExpressionEClass.getESuperTypes().add(getASTNode());
										
			
			ExpressionStatementEClass.getESuperTypes().add(getStatement());
										
			
			FieldAccessEClass.getESuperTypes().add(getExpression());
										
			
			FieldDeclarationEClass.getESuperTypes().add(getBodyDeclaration());
										
			FieldDeclarationEClass.getESuperTypes().add(getAbstractVariablesContainer());
										
			
			ForStatementEClass.getESuperTypes().add(getStatement());
										
			
			IfStatementEClass.getESuperTypes().add(getStatement());
										
			
			ImportDeclarationEClass.getESuperTypes().add(getASTNode());
										
			
			InfixExpressionEClass.getESuperTypes().add(getExpression());
										
			
			InitializerEClass.getESuperTypes().add(getBodyDeclaration());
										
			
			InstanceofExpressionEClass.getESuperTypes().add(getExpression());
										
			
			InterfaceDeclarationEClass.getESuperTypes().add(getTypeDeclaration());
										
			
			JavadocEClass.getESuperTypes().add(getComment());
										
			
			LabeledStatementEClass.getESuperTypes().add(getNamedElement());
										
			LabeledStatementEClass.getESuperTypes().add(getStatement());
										
			
			LineCommentEClass.getESuperTypes().add(getComment());
										
			
			
			
			
			MemberRefEClass.getESuperTypes().add(getASTNode());
										
			
			MethodDeclarationEClass.getESuperTypes().add(getAbstractMethodDeclaration());
										
			
			MethodInvocationEClass.getESuperTypes().add(getExpression());
										
			MethodInvocationEClass.getESuperTypes().add(getAbstractMethodInvocation());
										
			
			MethodRefEClass.getESuperTypes().add(getASTNode());
										
			
			MethodRefParameterEClass.getESuperTypes().add(getASTNode());
										
			
			
			ModifierEClass.getESuperTypes().add(getASTNode());
										
			
			NamedElementEClass.getESuperTypes().add(getASTNode());
										
			
			NamespaceAccessEClass.getESuperTypes().add(getASTNode());
										
			
			NumberLiteralEClass.getESuperTypes().add(getExpression());
										
			
			NullLiteralEClass.getESuperTypes().add(getExpression());
										
			
			PackageEClass.getESuperTypes().add(getNamedElement());
										
			
			PackageAccessEClass.getESuperTypes().add(getNamespaceAccess());
										
			
			ParameterizedTypeEClass.getESuperTypes().add(getType());
										
			
			ParenthesizedExpressionEClass.getESuperTypes().add(getExpression());
										
			
			PostfixExpressionEClass.getESuperTypes().add(getExpression());
										
			
			PrefixExpressionEClass.getESuperTypes().add(getExpression());
										
			
			PrimitiveTypeEClass.getESuperTypes().add(getType());
										
			
			PrimitiveTypeBooleanEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeByteEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeCharEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeDoubleEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeShortEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeFloatEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeIntEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeLongEClass.getESuperTypes().add(getPrimitiveType());
										
			
			PrimitiveTypeVoidEClass.getESuperTypes().add(getPrimitiveType());
										
			
			ReturnStatementEClass.getESuperTypes().add(getStatement());
										
			
			SingleVariableAccessEClass.getESuperTypes().add(getExpression());
										
			
			SingleVariableDeclarationEClass.getESuperTypes().add(getVariableDeclaration());
										
			
			StatementEClass.getESuperTypes().add(getASTNode());
										
			
			StringLiteralEClass.getESuperTypes().add(getExpression());
										
			
			SuperConstructorInvocationEClass.getESuperTypes().add(getStatement());
										
			SuperConstructorInvocationEClass.getESuperTypes().add(getAbstractMethodInvocation());
										
			
			SuperFieldAccessEClass.getESuperTypes().add(getAbstractTypeQualifiedExpression());
										
			
			SuperMethodInvocationEClass.getESuperTypes().add(getAbstractTypeQualifiedExpression());
										
			SuperMethodInvocationEClass.getESuperTypes().add(getAbstractMethodInvocation());
										
			
			SwitchCaseEClass.getESuperTypes().add(getStatement());
										
			
			SwitchStatementEClass.getESuperTypes().add(getStatement());
										
			
			SynchronizedStatementEClass.getESuperTypes().add(getStatement());
										
			
			TagElementEClass.getESuperTypes().add(getASTNode());
										
			
			TextElementEClass.getESuperTypes().add(getASTNode());
										
			
			ThisExpressionEClass.getESuperTypes().add(getAbstractTypeQualifiedExpression());
										
			
			ThrowStatementEClass.getESuperTypes().add(getStatement());
										
			
			TryStatementEClass.getESuperTypes().add(getStatement());
										
			
			TypeEClass.getESuperTypes().add(getNamedElement());
										
			
			TypeAccessEClass.getESuperTypes().add(getExpression());
										
			TypeAccessEClass.getESuperTypes().add(getNamespaceAccess());
										
			
			TypeDeclarationEClass.getESuperTypes().add(getAbstractTypeDeclaration());
										
			
			TypeDeclarationStatementEClass.getESuperTypes().add(getStatement());
										
			
			TypeLiteralEClass.getESuperTypes().add(getExpression());
										
			
			TypeParameterEClass.getESuperTypes().add(getType());
										
			
			UnresolvedItemEClass.getESuperTypes().add(getNamedElement());
										
			
			UnresolvedItemAccessEClass.getESuperTypes().add(getExpression());
										
			UnresolvedItemAccessEClass.getESuperTypes().add(getNamespaceAccess());
										
			
			UnresolvedAnnotationDeclarationEClass.getESuperTypes().add(getAnnotationTypeDeclaration());
										
			UnresolvedAnnotationDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedAnnotationTypeMemberDeclarationEClass.getESuperTypes().add(getAnnotationTypeMemberDeclaration());
										
			UnresolvedAnnotationTypeMemberDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedClassDeclarationEClass.getESuperTypes().add(getClassDeclaration());
										
			UnresolvedClassDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedEnumDeclarationEClass.getESuperTypes().add(getEnumDeclaration());
										
			UnresolvedEnumDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedInterfaceDeclarationEClass.getESuperTypes().add(getInterfaceDeclaration());
										
			UnresolvedInterfaceDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedLabeledStatementEClass.getESuperTypes().add(getLabeledStatement());
										
			UnresolvedLabeledStatementEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedMethodDeclarationEClass.getESuperTypes().add(getMethodDeclaration());
										
			UnresolvedMethodDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedSingleVariableDeclarationEClass.getESuperTypes().add(getSingleVariableDeclaration());
										
			UnresolvedSingleVariableDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedTypeEClass.getESuperTypes().add(getType());
										
			UnresolvedTypeEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedTypeDeclarationEClass.getESuperTypes().add(getAbstractTypeDeclaration());
										
			UnresolvedTypeDeclarationEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			UnresolvedVariableDeclarationFragmentEClass.getESuperTypes().add(getVariableDeclarationFragment());
										
			UnresolvedVariableDeclarationFragmentEClass.getESuperTypes().add(getUnresolvedItem());
										
			
			VariableDeclarationEClass.getESuperTypes().add(getNamedElement());
										
			
			VariableDeclarationExpressionEClass.getESuperTypes().add(getExpression());
										
			VariableDeclarationExpressionEClass.getESuperTypes().add(getAbstractVariablesContainer());
										
			
			VariableDeclarationFragmentEClass.getESuperTypes().add(getVariableDeclaration());
										
			
			VariableDeclarationStatementEClass.getESuperTypes().add(getStatement());
										
			VariableDeclarationStatementEClass.getESuperTypes().add(getAbstractVariablesContainer());
										
			
			WildCardTypeEClass.getESuperTypes().add(getType());
										
			
			WhileStatementEClass.getESuperTypes().add(getStatement());
										
			
			initEClass(AbstractMethodDeclarationEClass, AbstractMethodDeclaration.class, "AbstractMethodDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAbstractMethodDeclaration_Body(), 
				this.getBlock(), 
				null, 
				"body", 
				null, 
				0, 
				1, 
				AbstractMethodDeclaration.class, 
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
				AbstractMethodDeclaration.class, 
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
				AbstractMethodDeclaration.class, 
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
				AbstractMethodDeclaration.class, 
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
				AbstractMethodDeclaration.class, 
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
				AbstractMethodDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AbstractMethodInvocationEClass, AbstractMethodInvocation.class, "AbstractMethodInvocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAbstractMethodInvocation_Method(), 
				this.getAbstractMethodDeclaration(), 
				getAbstractMethodDeclaration_Usages(), 
				"method", 
				null, 
				1, 
				1, 
				AbstractMethodInvocation.class, 
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
				AbstractMethodInvocation.class, 
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
				AbstractMethodInvocation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(AbstractTypeDeclarationEClass, AbstractTypeDeclaration.class, "AbstractTypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAbstractTypeDeclaration_BodyDeclarations(), 
				this.getBodyDeclaration(), 
				getBodyDeclaration_AbstractTypeDeclaration(), 
				"bodyDeclarations", 
				null, 
				0, 
				-1, 
				AbstractTypeDeclaration.class, 
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
				AbstractTypeDeclaration.class, 
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
				AbstractTypeDeclaration.class, 
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
				AbstractTypeDeclaration.class, 
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
				AbstractTypeDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(AbstractTypeQualifiedExpressionEClass, AbstractTypeQualifiedExpression.class, "AbstractTypeQualifiedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAbstractTypeQualifiedExpression_Qualifier(), 
				this.getTypeAccess(), 
				null, 
				"qualifier", 
				null, 
				0, 
				1, 
				AbstractTypeQualifiedExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AbstractVariablesContainerEClass, AbstractVariablesContainer.class, "AbstractVariablesContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAbstractVariablesContainer_Type(), 
				this.getTypeAccess(), 
				null, 
				"type", 
				null, 
				0, 
				1, 
				AbstractVariablesContainer.class, 
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
				AbstractVariablesContainer.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(AnnotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAnnotation_Type(), 
				this.getTypeAccess(), 
				null, 
				"type", 
				null, 
				1, 
				1, 
				Annotation.class, 
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
				Annotation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(ArchiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getArchive_OriginalFilePath(), 
				ecorePackage.getEString(), 
				"originalFilePath", 
				null, 
				1, 
				1, 
				EAttribute.class, 
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
				Archive.class, 
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
				Archive.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AssertStatementEClass, AssertStatement.class, "AssertStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAssertStatement_Message(), 
				this.getExpression(), 
				null, 
				"message", 
				null, 
				0, 
				1, 
				AssertStatement.class, 
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
				AssertStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ASTNodeEClass, ASTNode.class, "ASTNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getASTNode_Comments(), 
				this.getComment(), 
				null, 
				"comments", 
				null, 
				0, 
				-1, 
				ASTNode.class, 
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
				ASTNode.class, 
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
				ASTNode.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AnnotationMemberValuePairEClass, AnnotationMemberValuePair.class, "AnnotationMemberValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAnnotationMemberValuePair_Member(), 
				this.getAnnotationTypeMemberDeclaration(), 
				getAnnotationTypeMemberDeclaration_Usages(), 
				"member", 
				null, 
				0, 
				1, 
				AnnotationMemberValuePair.class, 
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
				AnnotationMemberValuePair.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AnnotationTypeDeclarationEClass, AnnotationTypeDeclaration.class, "AnnotationTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(AnnotationTypeMemberDeclarationEClass, AnnotationTypeMemberDeclaration.class, "AnnotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAnnotationTypeMemberDeclaration_Default(), 
				this.getExpression(), 
				null, 
				"default", 
				null, 
				0, 
				1, 
				AnnotationTypeMemberDeclaration.class, 
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
				AnnotationTypeMemberDeclaration.class, 
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
				AnnotationTypeMemberDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AnonymousClassDeclarationEClass, AnonymousClassDeclaration.class, "AnonymousClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getAnonymousClassDeclaration_BodyDeclarations(), 
				this.getBodyDeclaration(), 
				getBodyDeclaration_AnonymousClassDeclarationOwner(), 
				"bodyDeclarations", 
				null, 
				0, 
				-1, 
				AnonymousClassDeclaration.class, 
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
				AnonymousClassDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ArrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getArrayAccess_Array(), 
				this.getExpression(), 
				null, 
				"array", 
				null, 
				1, 
				1, 
				ArrayAccess.class, 
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
				ArrayAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ArrayCreationEClass, ArrayCreation.class, "ArrayCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getArrayCreation_Dimensions(), 
				this.getExpression(), 
				null, 
				"dimensions", 
				null, 
				0, 
				-1, 
				ArrayCreation.class, 
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
				ArrayCreation.class, 
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
				ArrayCreation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ArrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getArrayInitializer_Expressions(), 
				this.getExpression(), 
				null, 
				"expressions", 
				null, 
				0, 
				-1, 
				ArrayInitializer.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(ArrayLengthAccessEClass, ArrayLengthAccess.class, "ArrayLengthAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getArrayLengthAccess_Array(), 
				this.getExpression(), 
				null, 
				"array", 
				null, 
				1, 
				1, 
				ArrayLengthAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ArrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getArrayType_Dimensions(), 
				ecorePackage.getEInt(), 
				"dimensions", 
				"0", 
				1, 
				1, 
				EAttribute.class, 
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
				ArrayType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(AssignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getAssignment_Operator(), 
				this.getAssignmentKind(), 
				"operator", 
				"=", 
				1, 
				1, 
				EAttribute.class, 
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
				Assignment.class, 
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
				Assignment.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(BodyDeclarationEClass, BodyDeclaration.class, "BodyDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getBodyDeclaration_AbstractTypeDeclaration(), 
				this.getAbstractTypeDeclaration(), 
				getAbstractTypeDeclaration_BodyDeclarations(), 
				"abstractTypeDeclaration", 
				null, 
				0, 
				1, 
				BodyDeclaration.class, 
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
				BodyDeclaration.class, 
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
				BodyDeclaration.class, 
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
				BodyDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(BooleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getBooleanLiteral_Value(), 
				ecorePackage.getEBoolean(), 
				"value", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(BlockCommentEClass, BlockComment.class, "BlockComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(BlockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getBlock_Statements(), 
				this.getStatement(), 
				null, 
				"statements", 
				null, 
				0, 
				-1, 
				Block.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(BreakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getBreakStatement_Label(), 
				this.getLabeledStatement(), 
				getLabeledStatement_UsagesInBreakStatements(), 
				"label", 
				null, 
				0, 
				1, 
				BreakStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(CastExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getCastExpression_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				CastExpression.class, 
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
				CastExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(CatchClauseEClass, CatchClause.class, "CatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getCatchClause_Exception(), 
				this.getSingleVariableDeclaration(), 
				getSingleVariableDeclaration_CatchClause(), 
				"exception", 
				null, 
				1, 
				1, 
				CatchClause.class, 
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
				CatchClause.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(CharacterLiteralEClass, CharacterLiteral.class, "CharacterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getCharacterLiteral_EscapedValue(), 
				ecorePackage.getEString(), 
				"escapedValue", 
				null, 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(ClassFileEClass, ClassFile.class, "ClassFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getClassFile_OriginalFilePath(), 
				ecorePackage.getEString(), 
				"originalFilePath", 
				null, 
				1, 
				1, 
				EAttribute.class, 
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
				ClassFile.class, 
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
				ClassFile.class, 
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
				ClassFile.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ClassInstanceCreationEClass, ClassInstanceCreation.class, "ClassInstanceCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getClassInstanceCreation_AnonymousClassDeclaration(), 
				this.getAnonymousClassDeclaration(), 
				getAnonymousClassDeclaration_ClassInstanceCreation(), 
				"anonymousClassDeclaration", 
				null, 
				0, 
				1, 
				ClassInstanceCreation.class, 
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
				ClassInstanceCreation.class, 
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
				ClassInstanceCreation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ConstructorDeclarationEClass, ConstructorDeclaration.class, "ConstructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ConditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getConditionalExpression_ElseExpression(), 
				this.getExpression(), 
				null, 
				"elseExpression", 
				null, 
				1, 
				1, 
				ConditionalExpression.class, 
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
				ConditionalExpression.class, 
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
				ConditionalExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ConstructorInvocationEClass, ConstructorInvocation.class, "ConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ClassDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getClassDeclaration_SuperClass(), 
				this.getTypeAccess(), 
				null, 
				"superClass", 
				null, 
				0, 
				1, 
				ClassDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(CommentEClass, Comment.class, "Comment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getComment_Content(), 
				ecorePackage.getEString(), 
				"content", 
				null, 
				1, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(CompilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getCompilationUnit_OriginalFilePath(), 
				ecorePackage.getEString(), 
				"originalFilePath", 
				null, 
				1, 
				1, 
				EAttribute.class, 
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
				CompilationUnit.class, 
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
				CompilationUnit.class, 
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
				CompilationUnit.class, 
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
				CompilationUnit.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(ContinueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getContinueStatement_Label(), 
				this.getLabeledStatement(), 
				getLabeledStatement_UsagesInContinueStatements(), 
				"label", 
				null, 
				0, 
				1, 
				ContinueStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(DoStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getDoStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				DoStatement.class, 
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
				DoStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(EmptyStatementEClass, EmptyStatement.class, "EmptyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(EnhancedForStatementEClass, EnhancedForStatement.class, "EnhancedForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEnhancedForStatement_Body(), 
				this.getStatement(), 
				null, 
				"body", 
				null, 
				1, 
				1, 
				EnhancedForStatement.class, 
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
				EnhancedForStatement.class, 
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
				EnhancedForStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(EnumConstantDeclarationEClass, EnumConstantDeclaration.class, "EnumConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEnumConstantDeclaration_AnonymousClassDeclaration(), 
				this.getAnonymousClassDeclaration(), 
				null, 
				"anonymousClassDeclaration", 
				null, 
				0, 
				1, 
				EnumConstantDeclaration.class, 
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
				EnumConstantDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(EnumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEnumDeclaration_EnumConstants(), 
				this.getEnumConstantDeclaration(), 
				null, 
				"enumConstants", 
				null, 
				0, 
				-1, 
				EnumDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(ExpressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ExpressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getExpressionStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				ExpressionStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(FieldAccessEClass, FieldAccess.class, "FieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getFieldAccess_Field(), 
				this.getSingleVariableAccess(), 
				null, 
				"field", 
				null, 
				1, 
				1, 
				FieldAccess.class, 
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
				FieldAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(FieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ForStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getForStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				0, 
				1, 
				ForStatement.class, 
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
				ForStatement.class, 
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
				ForStatement.class, 
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
				ForStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(IfStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getIfStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				IfStatement.class, 
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
				IfStatement.class, 
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
				IfStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ImportDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getImportDeclaration_Static(), 
				ecorePackage.getEBoolean(), 
				"static", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
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
				ImportDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(InfixExpressionEClass, InfixExpression.class, "InfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getInfixExpression_Operator(), 
				this.getInfixExpressionKind(), 
				"operator", 
				"*", 
				1, 
				1, 
				EAttribute.class, 
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
				InfixExpression.class, 
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
				InfixExpression.class, 
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
				InfixExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(InitializerEClass, Initializer.class, "Initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getInitializer_Body(), 
				this.getBlock(), 
				null, 
				"body", 
				null, 
				1, 
				1, 
				Initializer.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(InstanceofExpressionEClass, InstanceofExpression.class, "InstanceofExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getInstanceofExpression_RightOperand(), 
				this.getTypeAccess(), 
				null, 
				"rightOperand", 
				null, 
				1, 
				1, 
				InstanceofExpression.class, 
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
				InstanceofExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(InterfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(JavadocEClass, Javadoc.class, "Javadoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getJavadoc_Tags(), 
				this.getTagElement(), 
				null, 
				"tags", 
				null, 
				0, 
				-1, 
				Javadoc.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(LabeledStatementEClass, LabeledStatement.class, "LabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getLabeledStatement_Body(), 
				this.getStatement(), 
				null, 
				"body", 
				null, 
				1, 
				1, 
				LabeledStatement.class, 
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
				LabeledStatement.class, 
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
				LabeledStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(LineCommentEClass, LineComment.class, "LineComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ManifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getManifest_MainAttributes(), 
				this.getManifestAttribute(), 
				null, 
				"mainAttributes", 
				null, 
				0, 
				-1, 
				Manifest.class, 
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
				Manifest.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ManifestAttributeEClass, ManifestAttribute.class, "ManifestAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getManifestAttribute_Key(), 
				ecorePackage.getEString(), 
				"key", 
				null, 
				1, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(ManifestEntryEClass, ManifestEntry.class, "ManifestEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getManifestEntry_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
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
				ManifestEntry.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(MemberRefEClass, MemberRef.class, "MemberRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getMemberRef_Member(), 
				this.getNamedElement(), 
				null, 
				"member", 
				null, 
				1, 
				1, 
				MemberRef.class, 
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
				MemberRef.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(MethodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getMethodDeclaration_ExtraArrayDimensions(), 
				ecorePackage.getEInt(), 
				"extraArrayDimensions", 
				"0", 
				1, 
				1, 
				EAttribute.class, 
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
				MethodDeclaration.class, 
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
				MethodDeclaration.class, 
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
				MethodDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(MethodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getMethodInvocation_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				0, 
				1, 
				MethodInvocation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(MethodRefEClass, MethodRef.class, "MethodRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getMethodRef_Method(), 
				this.getAbstractMethodDeclaration(), 
				getAbstractMethodDeclaration_UsagesInDocComments(), 
				"method", 
				null, 
				1, 
				1, 
				MethodRef.class, 
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
				MethodRef.class, 
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
				MethodRef.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(MethodRefParameterEClass, MethodRefParameter.class, "MethodRefParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getMethodRefParameter_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				MethodRefParameter.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ModelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getModel_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
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
				Model.class, 
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
				Model.class, 
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
				Model.class, 
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
				Model.class, 
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
				Model.class, 
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
				Model.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ModifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getModifier_Visibility(), 
				this.getVisibilityKind(), 
				"visibility", 
				"none", 
				1, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				"static", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				"volatile", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				EAttribute.class, 
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
				EAttribute.class, 
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
				Modifier.class, 
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
				Modifier.class, 
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
				Modifier.class, 
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
				Modifier.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(NamedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getNamedElement_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
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
				EAttribute.class, 
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
				NamedElement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(NamespaceAccessEClass, NamespaceAccess.class, "NamespaceAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(NumberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getNumberLiteral_TokenValue(), 
				ecorePackage.getEString(), 
				"tokenValue", 
				null, 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(NullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PackageEClass, Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getPackage_OwnedElements(), 
				this.getAbstractTypeDeclaration(), 
				getAbstractTypeDeclaration_Package(), 
				"ownedElements", 
				null, 
				0, 
				-1, 
				Package.class, 
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
				Package.class, 
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
				Package.class, 
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
				Package.class, 
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
				Package.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(PackageAccessEClass, PackageAccess.class, "PackageAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getPackageAccess_Package(), 
				this.getPackage(), 
				getPackage_UsagesInPackageAccess(), 
				"package", 
				null, 
				1, 
				1, 
				PackageAccess.class, 
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
				PackageAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(ParameterizedTypeEClass, ParameterizedType.class, "ParameterizedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getParameterizedType_Type(), 
				this.getTypeAccess(), 
				null, 
				"type", 
				null, 
				1, 
				1, 
				ParameterizedType.class, 
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
				ParameterizedType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(ParenthesizedExpressionEClass, ParenthesizedExpression.class, "ParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getParenthesizedExpression_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				ParenthesizedExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(PostfixExpressionEClass, PostfixExpression.class, "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getPostfixExpression_Operator(), 
				this.getPostfixExpressionKind(), 
				"operator", 
				"++", 
				1, 
				1, 
				EAttribute.class, 
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
				PostfixExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(PrefixExpressionEClass, PrefixExpression.class, "PrefixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getPrefixExpression_Operator(), 
				this.getPrefixExpressionKind(), 
				"operator", 
				"++", 
				1, 
				1, 
				EAttribute.class, 
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
				PrefixExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(PrimitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeBooleanEClass, PrimitiveTypeBoolean.class, "PrimitiveTypeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeByteEClass, PrimitiveTypeByte.class, "PrimitiveTypeByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeCharEClass, PrimitiveTypeChar.class, "PrimitiveTypeChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeDoubleEClass, PrimitiveTypeDouble.class, "PrimitiveTypeDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeShortEClass, PrimitiveTypeShort.class, "PrimitiveTypeShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeFloatEClass, PrimitiveTypeFloat.class, "PrimitiveTypeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeIntEClass, PrimitiveTypeInt.class, "PrimitiveTypeInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeLongEClass, PrimitiveTypeLong.class, "PrimitiveTypeLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(PrimitiveTypeVoidEClass, PrimitiveTypeVoid.class, "PrimitiveTypeVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ReturnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getReturnStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				0, 
				1, 
				ReturnStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(SingleVariableAccessEClass, SingleVariableAccess.class, "SingleVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getSingleVariableAccess_Variable(), 
				this.getVariableDeclaration(), 
				getVariableDeclaration_UsageInVariableAccess(), 
				"variable", 
				null, 
				1, 
				1, 
				SingleVariableAccess.class, 
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
				SingleVariableAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(SingleVariableDeclarationEClass, SingleVariableDeclaration.class, "SingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getSingleVariableDeclaration_Varargs(), 
				ecorePackage.getEBoolean(), 
				"varargs", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
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
				SingleVariableDeclaration.class, 
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
				SingleVariableDeclaration.class, 
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
				SingleVariableDeclaration.class, 
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
				SingleVariableDeclaration.class, 
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
				SingleVariableDeclaration.class, 
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
				SingleVariableDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(StatementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(StringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getStringLiteral_EscapedValue(), 
				ecorePackage.getEString(), 
				"escapedValue", 
				null, 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(SuperConstructorInvocationEClass, SuperConstructorInvocation.class, "SuperConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getSuperConstructorInvocation_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				0, 
				1, 
				SuperConstructorInvocation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(SuperFieldAccessEClass, SuperFieldAccess.class, "SuperFieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getSuperFieldAccess_Field(), 
				this.getSingleVariableAccess(), 
				null, 
				"field", 
				null, 
				1, 
				1, 
				SuperFieldAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(SuperMethodInvocationEClass, SuperMethodInvocation.class, "SuperMethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(SwitchCaseEClass, SwitchCase.class, "SwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getSwitchCase_Default(), 
				ecorePackage.getEBoolean(), 
				"default", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
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
				SwitchCase.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(SwitchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getSwitchStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				SwitchStatement.class, 
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
				SwitchStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(SynchronizedStatementEClass, SynchronizedStatement.class, "SynchronizedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getSynchronizedStatement_Body(), 
				this.getBlock(), 
				null, 
				"body", 
				null, 
				1, 
				1, 
				SynchronizedStatement.class, 
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
				SynchronizedStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TagElementEClass, TagElement.class, "TagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getTagElement_TagName(), 
				ecorePackage.getEString(), 
				"tagName", 
				null, 
				0, 
				1, 
				EAttribute.class, 
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
				TagElement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(TextElementEClass, TextElement.class, "TextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getTextElement_Text(), 
				ecorePackage.getEString(), 
				"text", 
				null, 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				!IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEClass(ThisExpressionEClass, ThisExpression.class, "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(ThrowStatementEClass, ThrowStatement.class, "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getThrowStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				ThrowStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TryStatementEClass, TryStatement.class, "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTryStatement_Body(), 
				this.getBlock(), 
				null, 
				"body", 
				null, 
				1, 
				1, 
				TryStatement.class, 
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
				"finally", 
				null, 
				0, 
				1, 
				TryStatement.class, 
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
				TryStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(TypeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getType_UsagesInTypeAccess(), 
				this.getTypeAccess(), 
				getTypeAccess_Type(), 
				"usagesInTypeAccess", 
				null, 
				0, 
				-1, 
				Type.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TypeAccessEClass, TypeAccess.class, "TypeAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTypeAccess_Type(), 
				this.getType(), 
				getType_UsagesInTypeAccess(), 
				"type", 
				null, 
				1, 
				1, 
				TypeAccess.class, 
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
				TypeAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TypeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTypeDeclaration_TypeParameters(), 
				this.getTypeParameter(), 
				null, 
				"typeParameters", 
				null, 
				0, 
				-1, 
				TypeDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(TypeDeclarationStatementEClass, TypeDeclarationStatement.class, "TypeDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTypeDeclarationStatement_Declaration(), 
				this.getAbstractTypeDeclaration(), 
				null, 
				"declaration", 
				null, 
				1, 
				1, 
				TypeDeclarationStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TypeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTypeLiteral_Type(), 
				this.getTypeAccess(), 
				null, 
				"type", 
				null, 
				1, 
				1, 
				TypeLiteral.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(TypeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getTypeParameter_Bounds(), 
				this.getTypeAccess(), 
				null, 
				"bounds", 
				null, 
				0, 
				-1, 
				TypeParameter.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(UnresolvedItemEClass, UnresolvedItem.class, "UnresolvedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedItemAccessEClass, UnresolvedItemAccess.class, "UnresolvedItemAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getUnresolvedItemAccess_Element(), 
				this.getUnresolvedItem(), 
				null, 
				"element", 
				null, 
				0, 
				1, 
				UnresolvedItemAccess.class, 
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
				UnresolvedItemAccess.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(UnresolvedAnnotationDeclarationEClass, UnresolvedAnnotationDeclaration.class, "UnresolvedAnnotationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedAnnotationTypeMemberDeclarationEClass, UnresolvedAnnotationTypeMemberDeclaration.class, "UnresolvedAnnotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedClassDeclarationEClass, UnresolvedClassDeclaration.class, "UnresolvedClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedEnumDeclarationEClass, UnresolvedEnumDeclaration.class, "UnresolvedEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedInterfaceDeclarationEClass, UnresolvedInterfaceDeclaration.class, "UnresolvedInterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedLabeledStatementEClass, UnresolvedLabeledStatement.class, "UnresolvedLabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedMethodDeclarationEClass, UnresolvedMethodDeclaration.class, "UnresolvedMethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedSingleVariableDeclarationEClass, UnresolvedSingleVariableDeclaration.class, "UnresolvedSingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedTypeEClass, UnresolvedType.class, "UnresolvedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedTypeDeclarationEClass, UnresolvedTypeDeclaration.class, "UnresolvedTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(UnresolvedVariableDeclarationFragmentEClass, UnresolvedVariableDeclarationFragment.class, "UnresolvedVariableDeclarationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			
			
			initEClass(VariableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getVariableDeclaration_ExtraArrayDimensions(), 
				ecorePackage.getEInt(), 
				"extraArrayDimensions", 
				"0", 
				1, 
				1, 
				EAttribute.class, 
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
				VariableDeclaration.class, 
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
				VariableDeclaration.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(VariableDeclarationExpressionEClass, VariableDeclarationExpression.class, "VariableDeclarationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getVariableDeclarationExpression_Modifier(), 
				this.getModifier(), 
				getModifier_VariableDeclarationExpression(), 
				"modifier", 
				null, 
				0, 
				1, 
				VariableDeclarationExpression.class, 
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
				VariableDeclarationExpression.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(VariableDeclarationFragmentEClass, VariableDeclarationFragment.class, "VariableDeclarationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getVariableDeclarationFragment_VariablesContainer(), 
				this.getAbstractVariablesContainer(), 
				getAbstractVariablesContainer_Fragments(), 
				"variablesContainer", 
				null, 
				0, 
				1, 
				VariableDeclarationFragment.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(VariableDeclarationStatementEClass, VariableDeclarationStatement.class, "VariableDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getVariableDeclarationStatement_ExtraArrayDimensions(), 
				ecorePackage.getEInt(), 
				"extraArrayDimensions", 
				"0", 
				1, 
				1, 
				EAttribute.class, 
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
				VariableDeclarationStatement.class, 
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
				VariableDeclarationStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			
			initEClass(WildCardTypeEClass, WildCardType.class, "WildCardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getWildCardType_UpperBound(), 
				ecorePackage.getEBoolean(), 
				"upperBound", 
				"false", 
				1, 
				1, 
				EAttribute.class, 
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
				WildCardType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			initEClass(WhileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getWhileStatement_Expression(), 
				this.getExpression(), 
				null, 
				"expression", 
				null, 
				1, 
				1, 
				WhileStatement.class, 
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
				WhileStatement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			
			
			
			initEEnum(AssignmentKindEEnum, AssignmentKind.class, "AssignmentKind");
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.PLUS_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.MINUS_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.TIMES_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.DIVIDE_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_AND_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_OR_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.BIT_XOR_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.REMAINDER_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.LEFT_SHIFT_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.RIGHT_SHIFT_SIGNED_ASSIGN);
			addEEnumLiteral(AssignmentKindEEnum, AssignmentKind.RIGHT_SHIFT_UNSIGNED_ASSIGN);
			initEEnum(InfixExpressionKindEEnum, InfixExpressionKind.class, "InfixExpressionKind");
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.TIMES);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.DIVIDE);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.REMAINDER);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.PLUS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.MINUS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LEFT_SHIFT);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.RIGHT_SHIFT_SIGNED);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.RIGHT_SHIFT_UNSIGNED);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LESS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.GREATER);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.LESS_EQUALS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.GREATER_EQUALS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.EQUALS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.NOT_EQUALS);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.XOR);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.AND);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.OR);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.CONDITIONAL_AND);
			addEEnumLiteral(InfixExpressionKindEEnum, InfixExpressionKind.CONDITIONAL_OR);
			initEEnum(InheritanceKindEEnum, InheritanceKind.class, "InheritanceKind");
			addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.NONE);
			addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.ABSTRACT);
			addEEnumLiteral(InheritanceKindEEnum, InheritanceKind.FINAL);
			initEEnum(PostfixExpressionKindEEnum, PostfixExpressionKind.class, "PostfixExpressionKind");
			addEEnumLiteral(PostfixExpressionKindEEnum, PostfixExpressionKind.INCREMENT);
			addEEnumLiteral(PostfixExpressionKindEEnum, PostfixExpressionKind.DECREMENT);
			initEEnum(PrefixExpressionKindEEnum, PrefixExpressionKind.class, "PrefixExpressionKind");
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.INCREMENT);
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.DECREMENT);
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.PLUS);
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.MINUS);
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.COMPLEMENT);
			addEEnumLiteral(PrefixExpressionKindEEnum, PrefixExpressionKind.NOT);
			initEEnum(VisibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
			addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.NONE);
			addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PUBLIC);
			addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PRIVATE);
			addEEnumLiteral(VisibilityKindEEnum, VisibilityKind.PROTECTED);
			
			// Create resource
			createResource(eNS_URI);
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
		
		
		public final static int ASTNODE = 8;
		public final static int ASTNODE_FEATURE_COUNT = 3;
		public final static int ASTNODE_OPERATION_COUNT = 0;
		
		public final static int ASTNODE__COMMENTS = 0;
		public final static int ASTNODE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ASTNODE__ORIGINAL_CLASS_FILE = 2;
		
		public final static int NAMEDELEMENT = 68;
		public final static int NAMEDELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
		public final static int NAMEDELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int NAMED_ELEMENT__COMMENTS = 0;
		public final static int NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int NAMED_ELEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int NAMED_ELEMENT__NAME = 3;
		public final static int NAMED_ELEMENT__PROXY = 4;
		public final static int NAMED_ELEMENT__USAGES_IN_IMPORTS = 5;
		
		public final static int BODYDECLARATION = 20;
		public final static int BODYDECLARATION_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 4;
		public final static int BODYDECLARATION_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int BODY_DECLARATION__COMMENTS = 0;
		public final static int BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int BODY_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int BODY_DECLARATION__NAME = 3;
		public final static int BODY_DECLARATION__PROXY = 4;
		public final static int BODY_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int BODY_DECLARATION__ANNOTATIONS = 7;
		public final static int BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int BODY_DECLARATION__MODIFIER = 9;
		
		public final static int ABSTRACTMETHODDECLARATION = 0;
		public final static int ABSTRACTMETHODDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 6;
		public final static int ABSTRACTMETHODDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
		
		public final static int ABSTRACT_METHOD_DECLARATION__COMMENTS = 0;
		public final static int ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ABSTRACT_METHOD_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ABSTRACT_METHOD_DECLARATION__NAME = 3;
		public final static int ABSTRACT_METHOD_DECLARATION__PROXY = 4;
		public final static int ABSTRACT_METHOD_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ABSTRACT_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ABSTRACT_METHOD_DECLARATION__ANNOTATIONS = 7;
		public final static int ABSTRACT_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ABSTRACT_METHOD_DECLARATION__MODIFIER = 9;
		public final static int ABSTRACT_METHOD_DECLARATION__BODY = 10;
		public final static int ABSTRACT_METHOD_DECLARATION__PARAMETERS = 11;
		public final static int ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS = 12;
		public final static int ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS = 13;
		public final static int ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = 14;
		public final static int ABSTRACT_METHOD_DECLARATION__USAGES = 15;
		
		public final static int ABSTRACTMETHODINVOCATION = 1;
		public final static int ABSTRACTMETHODINVOCATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
		public final static int ABSTRACTMETHODINVOCATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int ABSTRACT_METHOD_INVOCATION__COMMENTS = 0;
		public final static int ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ABSTRACT_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ABSTRACT_METHOD_INVOCATION__METHOD = 3;
		public final static int ABSTRACT_METHOD_INVOCATION__ARGUMENTS = 4;
		public final static int ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = 5;
		
		public final static int TYPE = 106;
		public final static int TYPE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 1;
		public final static int TYPE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int TYPE__COMMENTS = 0;
		public final static int TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE__NAME = 3;
		public final static int TYPE__PROXY = 4;
		public final static int TYPE__USAGES_IN_IMPORTS = 5;
		public final static int TYPE__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int ABSTRACTTYPEDECLARATION = 2;
		public final static int ABSTRACTTYPEDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + TYPE_FEATURE_COUNT + 5;
		public final static int ABSTRACTTYPEDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + TYPE_OPERATION_COUNT + 0;
		
		public final static int ABSTRACT_TYPE_DECLARATION__COMMENTS = 0;
		public final static int ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ABSTRACT_TYPE_DECLARATION__NAME = 3;
		public final static int ABSTRACT_TYPE_DECLARATION__PROXY = 4;
		public final static int ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ABSTRACT_TYPE_DECLARATION__ANNOTATIONS = 7;
		public final static int ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ABSTRACT_TYPE_DECLARATION__MODIFIER = 9;
		public final static int ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int ABSTRACT_TYPE_DECLARATION__PACKAGE = 14;
		public final static int ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES = 15;
		
		public final static int EXPRESSION = 42;
		public final static int EXPRESSION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
		public final static int EXPRESSION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int EXPRESSION__COMMENTS = 0;
		public final static int EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		
		public final static int ABSTRACTTYPEQUALIFIEDEXPRESSION = 3;
		public final static int ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__COMMENTS = 0;
		public final static int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER = 3;
		
		public final static int ABSTRACTVARIABLESCONTAINER = 4;
		public final static int ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
		public final static int ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int ABSTRACT_VARIABLES_CONTAINER__COMMENTS = 0;
		public final static int ABSTRACT_VARIABLES_CONTAINER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ABSTRACT_VARIABLES_CONTAINER__ORIGINAL_CLASS_FILE = 2;
		public final static int ABSTRACT_VARIABLES_CONTAINER__TYPE = 3;
		public final static int ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS = 4;
		
		public final static int ANNOTATION = 5;
		public final static int ANNOTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int ANNOTATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ANNOTATION__COMMENTS = 0;
		public final static int ANNOTATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ANNOTATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ANNOTATION__TYPE = 3;
		public final static int ANNOTATION__VALUES = 4;
		
		public final static int ARCHIVE = 6;
		public final static int ARCHIVE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 3;
		public final static int ARCHIVE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int ARCHIVE__COMMENTS = 0;
		public final static int ARCHIVE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARCHIVE__ORIGINAL_CLASS_FILE = 2;
		public final static int ARCHIVE__NAME = 3;
		public final static int ARCHIVE__PROXY = 4;
		public final static int ARCHIVE__USAGES_IN_IMPORTS = 5;
		public final static int ARCHIVE__ORIGINAL_FILE_PATH = 6;
		public final static int ARCHIVE__CLASS_FILES = 7;
		public final static int ARCHIVE__MANIFEST = 8;
		
		public final static int STATEMENT = 93;
		public final static int STATEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
		public final static int STATEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int STATEMENT__COMMENTS = 0;
		public final static int STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int STATEMENT__ORIGINAL_CLASS_FILE = 2;
		
		public final static int ASSERTSTATEMENT = 7;
		public final static int ASSERTSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int ASSERTSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int ASSERT_STATEMENT__COMMENTS = 0;
		public final static int ASSERT_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ASSERT_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int ASSERT_STATEMENT__MESSAGE = 3;
		public final static int ASSERT_STATEMENT__EXPRESSION = 4;
		
		public final static int ANNOTATIONMEMBERVALUEPAIR = 9;
		public final static int ANNOTATIONMEMBERVALUEPAIR_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 2;
		public final static int ANNOTATIONMEMBERVALUEPAIR_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__COMMENTS = 0;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__ORIGINAL_CLASS_FILE = 2;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__NAME = 3;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__PROXY = 4;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__USAGES_IN_IMPORTS = 5;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__MEMBER = 6;
		public final static int ANNOTATION_MEMBER_VALUE_PAIR__VALUE = 7;
		
		public final static int ANNOTATIONTYPEDECLARATION = 10;
		public final static int ANNOTATIONTYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 0;
		public final static int ANNOTATIONTYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int ANNOTATION_TYPE_DECLARATION__COMMENTS = 0;
		public final static int ANNOTATION_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ANNOTATION_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ANNOTATION_TYPE_DECLARATION__NAME = 3;
		public final static int ANNOTATION_TYPE_DECLARATION__PROXY = 4;
		public final static int ANNOTATION_TYPE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ANNOTATION_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ANNOTATION_TYPE_DECLARATION__ANNOTATIONS = 7;
		public final static int ANNOTATION_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ANNOTATION_TYPE_DECLARATION__MODIFIER = 9;
		public final static int ANNOTATION_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int ANNOTATION_TYPE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int ANNOTATION_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int ANNOTATION_TYPE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int ANNOTATION_TYPE_DECLARATION__PACKAGE = 14;
		public final static int ANNOTATION_TYPE_DECLARATION__SUPER_INTERFACES = 15;
		
		public final static int ANNOTATIONTYPEMEMBERDECLARATION = 11;
		public final static int ANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 3;
		public final static int ANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
		
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__COMMENTS = 0;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__NAME = 3;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY = 4;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS = 7;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIER = 9;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = 10;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = 11;
		public final static int ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES = 12;
		
		public final static int ANONYMOUSCLASSDECLARATION = 12;
		public final static int ANONYMOUSCLASSDECLARATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
		public final static int ANONYMOUSCLASSDECLARATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int ANONYMOUS_CLASS_DECLARATION__COMMENTS = 0;
		public final static int ANONYMOUS_CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ANONYMOUS_CLASS_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS = 3;
		public final static int ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION = 4;
		
		public final static int ARRAYACCESS = 13;
		public final static int ARRAYACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int ARRAYACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ARRAY_ACCESS__COMMENTS = 0;
		public final static int ARRAY_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARRAY_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int ARRAY_ACCESS__ARRAY = 3;
		public final static int ARRAY_ACCESS__INDEX = 4;
		
		public final static int ARRAYCREATION = 14;
		public final static int ARRAYCREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
		public final static int ARRAYCREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ARRAY_CREATION__COMMENTS = 0;
		public final static int ARRAY_CREATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARRAY_CREATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ARRAY_CREATION__DIMENSIONS = 3;
		public final static int ARRAY_CREATION__INITIALIZER = 4;
		public final static int ARRAY_CREATION__TYPE = 5;
		
		public final static int ARRAYINITIALIZER = 15;
		public final static int ARRAYINITIALIZER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int ARRAYINITIALIZER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ARRAY_INITIALIZER__COMMENTS = 0;
		public final static int ARRAY_INITIALIZER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARRAY_INITIALIZER__ORIGINAL_CLASS_FILE = 2;
		public final static int ARRAY_INITIALIZER__EXPRESSIONS = 3;
		
		public final static int ARRAYLENGTHACCESS = 16;
		public final static int ARRAYLENGTHACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int ARRAYLENGTHACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ARRAY_LENGTH_ACCESS__COMMENTS = 0;
		public final static int ARRAY_LENGTH_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARRAY_LENGTH_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int ARRAY_LENGTH_ACCESS__ARRAY = 3;
		
		public final static int ARRAYTYPE = 17;
		public final static int ARRAYTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
		public final static int ARRAYTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
		
		public final static int ARRAY_TYPE__COMMENTS = 0;
		public final static int ARRAY_TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ARRAY_TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int ARRAY_TYPE__NAME = 3;
		public final static int ARRAY_TYPE__PROXY = 4;
		public final static int ARRAY_TYPE__USAGES_IN_IMPORTS = 5;
		public final static int ARRAY_TYPE__USAGES_IN_TYPE_ACCESS = 6;
		public final static int ARRAY_TYPE__DIMENSIONS = 7;
		public final static int ARRAY_TYPE__ELEMENT_TYPE = 8;
		
		public final static int ASSIGNMENT = 18;
		public final static int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
		public final static int ASSIGNMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int ASSIGNMENT__COMMENTS = 0;
		public final static int ASSIGNMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ASSIGNMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int ASSIGNMENT__LEFT_HAND_SIDE = 3;
		public final static int ASSIGNMENT__OPERATOR = 4;
		public final static int ASSIGNMENT__RIGHT_HAND_SIDE = 5;
		
		public final static int BOOLEANLITERAL = 21;
		public final static int BOOLEANLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int BOOLEANLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int BOOLEAN_LITERAL__COMMENTS = 0;
		public final static int BOOLEAN_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int BOOLEAN_LITERAL__ORIGINAL_CLASS_FILE = 2;
		public final static int BOOLEAN_LITERAL__VALUE = 3;
		
		public final static int COMMENT = 34;
		public final static int COMMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
		public final static int COMMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int COMMENT__COMMENTS = 0;
		public final static int COMMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int COMMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int COMMENT__CONTENT = 3;
		public final static int COMMENT__ENCLOSED_BY_PARENT = 4;
		public final static int COMMENT__PREFIX_OF_PARENT = 5;
		
		public final static int BLOCKCOMMENT = 22;
		public final static int BLOCKCOMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;
		public final static int BLOCKCOMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
		
		public final static int BLOCK_COMMENT__COMMENTS = 0;
		public final static int BLOCK_COMMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int BLOCK_COMMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int BLOCK_COMMENT__CONTENT = 3;
		public final static int BLOCK_COMMENT__ENCLOSED_BY_PARENT = 4;
		public final static int BLOCK_COMMENT__PREFIX_OF_PARENT = 5;
		
		public final static int BLOCK = 23;
		public final static int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int BLOCK__COMMENTS = 0;
		public final static int BLOCK__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int BLOCK__ORIGINAL_CLASS_FILE = 2;
		public final static int BLOCK__STATEMENTS = 3;
		
		public final static int BREAKSTATEMENT = 24;
		public final static int BREAKSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int BREAKSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int BREAK_STATEMENT__COMMENTS = 0;
		public final static int BREAK_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int BREAK_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int BREAK_STATEMENT__LABEL = 3;
		
		public final static int CASTEXPRESSION = 25;
		public final static int CASTEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int CASTEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int CAST_EXPRESSION__COMMENTS = 0;
		public final static int CAST_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CAST_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int CAST_EXPRESSION__EXPRESSION = 3;
		public final static int CAST_EXPRESSION__TYPE = 4;
		
		public final static int CATCHCLAUSE = 26;
		public final static int CATCHCLAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int CATCHCLAUSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int CATCH_CLAUSE__COMMENTS = 0;
		public final static int CATCH_CLAUSE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CATCH_CLAUSE__ORIGINAL_CLASS_FILE = 2;
		public final static int CATCH_CLAUSE__EXCEPTION = 3;
		public final static int CATCH_CLAUSE__BODY = 4;
		
		public final static int CHARACTERLITERAL = 27;
		public final static int CHARACTERLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int CHARACTERLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int CHARACTER_LITERAL__COMMENTS = 0;
		public final static int CHARACTER_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CHARACTER_LITERAL__ORIGINAL_CLASS_FILE = 2;
		public final static int CHARACTER_LITERAL__ESCAPED_VALUE = 3;
		
		public final static int CLASSFILE = 28;
		public final static int CLASSFILE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 4;
		public final static int CLASSFILE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int CLASS_FILE__COMMENTS = 0;
		public final static int CLASS_FILE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CLASS_FILE__ORIGINAL_CLASS_FILE = 2;
		public final static int CLASS_FILE__NAME = 3;
		public final static int CLASS_FILE__PROXY = 4;
		public final static int CLASS_FILE__USAGES_IN_IMPORTS = 5;
		public final static int CLASS_FILE__ORIGINAL_FILE_PATH = 6;
		public final static int CLASS_FILE__TYPE = 7;
		public final static int CLASS_FILE__ATTACHED_SOURCE = 8;
		public final static int CLASS_FILE__PACKAGE = 9;
		
		public final static int CLASSINSTANCECREATION = 29;
		public final static int CLASSINSTANCECREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 3;
		public final static int CLASSINSTANCECREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
		
		public final static int CLASS_INSTANCE_CREATION__COMMENTS = 0;
		public final static int CLASS_INSTANCE_CREATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CLASS_INSTANCE_CREATION__ORIGINAL_CLASS_FILE = 2;
		public final static int CLASS_INSTANCE_CREATION__METHOD = 3;
		public final static int CLASS_INSTANCE_CREATION__ARGUMENTS = 4;
		public final static int CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS = 5;
		public final static int CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = 6;
		public final static int CLASS_INSTANCE_CREATION__EXPRESSION = 7;
		public final static int CLASS_INSTANCE_CREATION__TYPE = 8;
		
		public final static int CONSTRUCTORDECLARATION = 30;
		public final static int CONSTRUCTORDECLARATION_FEATURE_COUNT = ABSTRACTMETHODDECLARATION_FEATURE_COUNT + 0;
		public final static int CONSTRUCTORDECLARATION_OPERATION_COUNT = ABSTRACTMETHODDECLARATION_OPERATION_COUNT + 0;
		
		public final static int CONSTRUCTOR_DECLARATION__COMMENTS = 0;
		public final static int CONSTRUCTOR_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CONSTRUCTOR_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int CONSTRUCTOR_DECLARATION__NAME = 3;
		public final static int CONSTRUCTOR_DECLARATION__PROXY = 4;
		public final static int CONSTRUCTOR_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int CONSTRUCTOR_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int CONSTRUCTOR_DECLARATION__ANNOTATIONS = 7;
		public final static int CONSTRUCTOR_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int CONSTRUCTOR_DECLARATION__MODIFIER = 9;
		public final static int CONSTRUCTOR_DECLARATION__BODY = 10;
		public final static int CONSTRUCTOR_DECLARATION__PARAMETERS = 11;
		public final static int CONSTRUCTOR_DECLARATION__THROWN_EXCEPTIONS = 12;
		public final static int CONSTRUCTOR_DECLARATION__TYPE_PARAMETERS = 13;
		public final static int CONSTRUCTOR_DECLARATION__USAGES_IN_DOC_COMMENTS = 14;
		public final static int CONSTRUCTOR_DECLARATION__USAGES = 15;
		
		public final static int CONDITIONALEXPRESSION = 31;
		public final static int CONDITIONALEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;
		public final static int CONDITIONALEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int CONDITIONAL_EXPRESSION__COMMENTS = 0;
		public final static int CONDITIONAL_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CONDITIONAL_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = 3;
		public final static int CONDITIONAL_EXPRESSION__EXPRESSION = 4;
		public final static int CONDITIONAL_EXPRESSION__THEN_EXPRESSION = 5;
		
		public final static int CONSTRUCTORINVOCATION = 32;
		public final static int CONSTRUCTORINVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 0;
		public final static int CONSTRUCTORINVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
		
		public final static int CONSTRUCTOR_INVOCATION__COMMENTS = 0;
		public final static int CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = 2;
		public final static int CONSTRUCTOR_INVOCATION__METHOD = 3;
		public final static int CONSTRUCTOR_INVOCATION__ARGUMENTS = 4;
		public final static int CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = 5;
		
		public final static int TYPEDECLARATION = 108;
		public final static int TYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 1;
		public final static int TYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int TYPE_DECLARATION__COMMENTS = 0;
		public final static int TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE_DECLARATION__NAME = 3;
		public final static int TYPE_DECLARATION__PROXY = 4;
		public final static int TYPE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int TYPE_DECLARATION__ANNOTATIONS = 7;
		public final static int TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int TYPE_DECLARATION__MODIFIER = 9;
		public final static int TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int TYPE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int TYPE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int TYPE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int TYPE_DECLARATION__PACKAGE = 14;
		public final static int TYPE_DECLARATION__SUPER_INTERFACES = 15;
		public final static int TYPE_DECLARATION__TYPE_PARAMETERS = 16;
		
		public final static int CLASSDECLARATION = 33;
		public final static int CLASSDECLARATION_FEATURE_COUNT = TYPEDECLARATION_FEATURE_COUNT + 1;
		public final static int CLASSDECLARATION_OPERATION_COUNT = TYPEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int CLASS_DECLARATION__COMMENTS = 0;
		public final static int CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CLASS_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int CLASS_DECLARATION__NAME = 3;
		public final static int CLASS_DECLARATION__PROXY = 4;
		public final static int CLASS_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int CLASS_DECLARATION__ANNOTATIONS = 7;
		public final static int CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int CLASS_DECLARATION__MODIFIER = 9;
		public final static int CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int CLASS_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int CLASS_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int CLASS_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int CLASS_DECLARATION__PACKAGE = 14;
		public final static int CLASS_DECLARATION__SUPER_INTERFACES = 15;
		public final static int CLASS_DECLARATION__TYPE_PARAMETERS = 16;
		public final static int CLASS_DECLARATION__SUPER_CLASS = 17;
		
		public final static int COMPILATIONUNIT = 35;
		public final static int COMPILATIONUNIT_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 5;
		public final static int COMPILATIONUNIT_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int COMPILATION_UNIT__COMMENTS = 0;
		public final static int COMPILATION_UNIT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int COMPILATION_UNIT__ORIGINAL_CLASS_FILE = 2;
		public final static int COMPILATION_UNIT__NAME = 3;
		public final static int COMPILATION_UNIT__PROXY = 4;
		public final static int COMPILATION_UNIT__USAGES_IN_IMPORTS = 5;
		public final static int COMPILATION_UNIT__ORIGINAL_FILE_PATH = 6;
		public final static int COMPILATION_UNIT__COMMENT_LIST = 7;
		public final static int COMPILATION_UNIT__IMPORTS = 8;
		public final static int COMPILATION_UNIT__PACKAGE = 9;
		public final static int COMPILATION_UNIT__TYPES = 10;
		
		public final static int CONTINUESTATEMENT = 36;
		public final static int CONTINUESTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int CONTINUESTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int CONTINUE_STATEMENT__COMMENTS = 0;
		public final static int CONTINUE_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int CONTINUE_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int CONTINUE_STATEMENT__LABEL = 3;
		
		public final static int DOSTATEMENT = 37;
		public final static int DOSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int DOSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int DO_STATEMENT__COMMENTS = 0;
		public final static int DO_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int DO_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int DO_STATEMENT__EXPRESSION = 3;
		public final static int DO_STATEMENT__BODY = 4;
		
		public final static int EMPTYSTATEMENT = 38;
		public final static int EMPTYSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;
		public final static int EMPTYSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int EMPTY_STATEMENT__COMMENTS = 0;
		public final static int EMPTY_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int EMPTY_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		
		public final static int ENHANCEDFORSTATEMENT = 39;
		public final static int ENHANCEDFORSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
		public final static int ENHANCEDFORSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int ENHANCED_FOR_STATEMENT__COMMENTS = 0;
		public final static int ENHANCED_FOR_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ENHANCED_FOR_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int ENHANCED_FOR_STATEMENT__BODY = 3;
		public final static int ENHANCED_FOR_STATEMENT__EXPRESSION = 4;
		public final static int ENHANCED_FOR_STATEMENT__PARAMETER = 5;
		
		public final static int VARIABLEDECLARATION = 125;
		public final static int VARIABLEDECLARATION_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 3;
		public final static int VARIABLEDECLARATION_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int VARIABLE_DECLARATION__COMMENTS = 0;
		public final static int VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int VARIABLE_DECLARATION__NAME = 3;
		public final static int VARIABLE_DECLARATION__PROXY = 4;
		public final static int VARIABLE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 6;
		public final static int VARIABLE_DECLARATION__INITIALIZER = 7;
		public final static int VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = 8;
		
		public final static int ENUMCONSTANTDECLARATION = 40;
		public final static int ENUMCONSTANTDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + VARIABLEDECLARATION_FEATURE_COUNT + 2;
		public final static int ENUMCONSTANTDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + VARIABLEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int ENUM_CONSTANT_DECLARATION__COMMENTS = 0;
		public final static int ENUM_CONSTANT_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ENUM_CONSTANT_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ENUM_CONSTANT_DECLARATION__NAME = 3;
		public final static int ENUM_CONSTANT_DECLARATION__PROXY = 4;
		public final static int ENUM_CONSTANT_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ENUM_CONSTANT_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ENUM_CONSTANT_DECLARATION__ANNOTATIONS = 7;
		public final static int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ENUM_CONSTANT_DECLARATION__MODIFIER = 9;
		public final static int ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 10;
		public final static int ENUM_CONSTANT_DECLARATION__INITIALIZER = 11;
		public final static int ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS = 12;
		public final static int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION = 13;
		public final static int ENUM_CONSTANT_DECLARATION__ARGUMENTS = 14;
		
		public final static int ENUMDECLARATION = 41;
		public final static int ENUMDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + 1;
		public final static int ENUMDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int ENUM_DECLARATION__COMMENTS = 0;
		public final static int ENUM_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int ENUM_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int ENUM_DECLARATION__NAME = 3;
		public final static int ENUM_DECLARATION__PROXY = 4;
		public final static int ENUM_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int ENUM_DECLARATION__ANNOTATIONS = 7;
		public final static int ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int ENUM_DECLARATION__MODIFIER = 9;
		public final static int ENUM_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int ENUM_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int ENUM_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int ENUM_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int ENUM_DECLARATION__PACKAGE = 14;
		public final static int ENUM_DECLARATION__SUPER_INTERFACES = 15;
		public final static int ENUM_DECLARATION__ENUM_CONSTANTS = 16;
		
		public final static int EXPRESSIONSTATEMENT = 43;
		public final static int EXPRESSIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int EXPRESSIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int EXPRESSION_STATEMENT__COMMENTS = 0;
		public final static int EXPRESSION_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int EXPRESSION_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int EXPRESSION_STATEMENT__EXPRESSION = 3;
		
		public final static int FIELDACCESS = 44;
		public final static int FIELDACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int FIELDACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int FIELD_ACCESS__COMMENTS = 0;
		public final static int FIELD_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int FIELD_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int FIELD_ACCESS__FIELD = 3;
		public final static int FIELD_ACCESS__EXPRESSION = 4;
		
		public final static int FIELDDECLARATION = 45;
		public final static int FIELDDECLARATION_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 0;
		public final static int FIELDDECLARATION_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
		
		public final static int FIELD_DECLARATION__COMMENTS = 0;
		public final static int FIELD_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int FIELD_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int FIELD_DECLARATION__NAME = 3;
		public final static int FIELD_DECLARATION__PROXY = 4;
		public final static int FIELD_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int FIELD_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int FIELD_DECLARATION__ANNOTATIONS = 7;
		public final static int FIELD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int FIELD_DECLARATION__MODIFIER = 9;
		public final static int FIELD_DECLARATION__TYPE = 10;
		public final static int FIELD_DECLARATION__FRAGMENTS = 11;
		
		public final static int FORSTATEMENT = 46;
		public final static int FORSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;
		public final static int FORSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int FOR_STATEMENT__COMMENTS = 0;
		public final static int FOR_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int FOR_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int FOR_STATEMENT__EXPRESSION = 3;
		public final static int FOR_STATEMENT__UPDATERS = 4;
		public final static int FOR_STATEMENT__INITIALIZERS = 5;
		public final static int FOR_STATEMENT__BODY = 6;
		
		public final static int IFSTATEMENT = 47;
		public final static int IFSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
		public final static int IFSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int IF_STATEMENT__COMMENTS = 0;
		public final static int IF_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int IF_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int IF_STATEMENT__EXPRESSION = 3;
		public final static int IF_STATEMENT__THEN_STATEMENT = 4;
		public final static int IF_STATEMENT__ELSE_STATEMENT = 5;
		
		public final static int IMPORTDECLARATION = 48;
		public final static int IMPORTDECLARATION_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
		public final static int IMPORTDECLARATION_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int IMPORT_DECLARATION__COMMENTS = 0;
		public final static int IMPORT_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int IMPORT_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int IMPORT_DECLARATION__STATIC = 3;
		public final static int IMPORT_DECLARATION__IMPORTED_ELEMENT = 4;
		
		public final static int INFIXEXPRESSION = 49;
		public final static int INFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;
		public final static int INFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int INFIX_EXPRESSION__COMMENTS = 0;
		public final static int INFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int INFIX_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int INFIX_EXPRESSION__OPERATOR = 3;
		public final static int INFIX_EXPRESSION__RIGHT_OPERAND = 4;
		public final static int INFIX_EXPRESSION__LEFT_OPERAND = 5;
		public final static int INFIX_EXPRESSION__EXTENDED_OPERANDS = 6;
		
		public final static int INITIALIZER = 52;
		public final static int INITIALIZER_FEATURE_COUNT = BODYDECLARATION_FEATURE_COUNT + 1;
		public final static int INITIALIZER_OPERATION_COUNT = BODYDECLARATION_OPERATION_COUNT + 0;
		
		public final static int INITIALIZER__COMMENTS = 0;
		public final static int INITIALIZER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int INITIALIZER__ORIGINAL_CLASS_FILE = 2;
		public final static int INITIALIZER__NAME = 3;
		public final static int INITIALIZER__PROXY = 4;
		public final static int INITIALIZER__USAGES_IN_IMPORTS = 5;
		public final static int INITIALIZER__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int INITIALIZER__ANNOTATIONS = 7;
		public final static int INITIALIZER__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int INITIALIZER__MODIFIER = 9;
		public final static int INITIALIZER__BODY = 10;
		
		public final static int INSTANCEOFEXPRESSION = 53;
		public final static int INSTANCEOFEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int INSTANCEOFEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int INSTANCEOF_EXPRESSION__COMMENTS = 0;
		public final static int INSTANCEOF_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int INSTANCEOF_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int INSTANCEOF_EXPRESSION__RIGHT_OPERAND = 3;
		public final static int INSTANCEOF_EXPRESSION__LEFT_OPERAND = 4;
		
		public final static int INTERFACEDECLARATION = 54;
		public final static int INTERFACEDECLARATION_FEATURE_COUNT = TYPEDECLARATION_FEATURE_COUNT + 0;
		public final static int INTERFACEDECLARATION_OPERATION_COUNT = TYPEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int INTERFACE_DECLARATION__COMMENTS = 0;
		public final static int INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int INTERFACE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int INTERFACE_DECLARATION__NAME = 3;
		public final static int INTERFACE_DECLARATION__PROXY = 4;
		public final static int INTERFACE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int INTERFACE_DECLARATION__ANNOTATIONS = 7;
		public final static int INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int INTERFACE_DECLARATION__MODIFIER = 9;
		public final static int INTERFACE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int INTERFACE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int INTERFACE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int INTERFACE_DECLARATION__PACKAGE = 14;
		public final static int INTERFACE_DECLARATION__SUPER_INTERFACES = 15;
		public final static int INTERFACE_DECLARATION__TYPE_PARAMETERS = 16;
		
		public final static int JAVADOC = 55;
		public final static int JAVADOC_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 1;
		public final static int JAVADOC_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
		
		public final static int JAVADOC__COMMENTS = 0;
		public final static int JAVADOC__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int JAVADOC__ORIGINAL_CLASS_FILE = 2;
		public final static int JAVADOC__CONTENT = 3;
		public final static int JAVADOC__ENCLOSED_BY_PARENT = 4;
		public final static int JAVADOC__PREFIX_OF_PARENT = 5;
		public final static int JAVADOC__TAGS = 6;
		
		public final static int LABELEDSTATEMENT = 56;
		public final static int LABELEDSTATEMENT_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + STATEMENT_FEATURE_COUNT + 3;
		public final static int LABELEDSTATEMENT_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + STATEMENT_OPERATION_COUNT + 0;
		
		public final static int LABELED_STATEMENT__COMMENTS = 0;
		public final static int LABELED_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int LABELED_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int LABELED_STATEMENT__NAME = 3;
		public final static int LABELED_STATEMENT__PROXY = 4;
		public final static int LABELED_STATEMENT__USAGES_IN_IMPORTS = 5;
		public final static int LABELED_STATEMENT__BODY = 6;
		public final static int LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS = 7;
		public final static int LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS = 8;
		
		public final static int LINECOMMENT = 57;
		public final static int LINECOMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;
		public final static int LINECOMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;
		
		public final static int LINE_COMMENT__COMMENTS = 0;
		public final static int LINE_COMMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int LINE_COMMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int LINE_COMMENT__CONTENT = 3;
		public final static int LINE_COMMENT__ENCLOSED_BY_PARENT = 4;
		public final static int LINE_COMMENT__PREFIX_OF_PARENT = 5;
		
		public final static int MANIFEST = 58;
		public final static int MANIFEST_FEATURE_COUNT = 2;
		public final static int MANIFEST_OPERATION_COUNT = 0;
		
		public final static int MANIFEST__MAIN_ATTRIBUTES = 0;
		public final static int MANIFEST__ENTRY_ATTRIBUTES = 1;
		
		public final static int MANIFESTATTRIBUTE = 59;
		public final static int MANIFESTATTRIBUTE_FEATURE_COUNT = 2;
		public final static int MANIFESTATTRIBUTE_OPERATION_COUNT = 0;
		
		public final static int MANIFEST_ATTRIBUTE__KEY = 0;
		public final static int MANIFEST_ATTRIBUTE__VALUE = 1;
		
		public final static int MANIFESTENTRY = 60;
		public final static int MANIFESTENTRY_FEATURE_COUNT = 2;
		public final static int MANIFESTENTRY_OPERATION_COUNT = 0;
		
		public final static int MANIFEST_ENTRY__NAME = 0;
		public final static int MANIFEST_ENTRY__ATTRIBUTES = 1;
		
		public final static int MEMBERREF = 61;
		public final static int MEMBERREF_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
		public final static int MEMBERREF_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int MEMBER_REF__COMMENTS = 0;
		public final static int MEMBER_REF__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int MEMBER_REF__ORIGINAL_CLASS_FILE = 2;
		public final static int MEMBER_REF__MEMBER = 3;
		public final static int MEMBER_REF__QUALIFIER = 4;
		
		public final static int METHODDECLARATION = 62;
		public final static int METHODDECLARATION_FEATURE_COUNT = ABSTRACTMETHODDECLARATION_FEATURE_COUNT + 4;
		public final static int METHODDECLARATION_OPERATION_COUNT = ABSTRACTMETHODDECLARATION_OPERATION_COUNT + 0;
		
		public final static int METHOD_DECLARATION__COMMENTS = 0;
		public final static int METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int METHOD_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int METHOD_DECLARATION__NAME = 3;
		public final static int METHOD_DECLARATION__PROXY = 4;
		public final static int METHOD_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int METHOD_DECLARATION__ANNOTATIONS = 7;
		public final static int METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int METHOD_DECLARATION__MODIFIER = 9;
		public final static int METHOD_DECLARATION__BODY = 10;
		public final static int METHOD_DECLARATION__PARAMETERS = 11;
		public final static int METHOD_DECLARATION__THROWN_EXCEPTIONS = 12;
		public final static int METHOD_DECLARATION__TYPE_PARAMETERS = 13;
		public final static int METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = 14;
		public final static int METHOD_DECLARATION__USAGES = 15;
		public final static int METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 16;
		public final static int METHOD_DECLARATION__RETURN_TYPE = 17;
		public final static int METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = 18;
		public final static int METHOD_DECLARATION__REDEFINITIONS = 19;
		
		public final static int METHODINVOCATION = 63;
		public final static int METHODINVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 1;
		public final static int METHODINVOCATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
		
		public final static int METHOD_INVOCATION__COMMENTS = 0;
		public final static int METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int METHOD_INVOCATION__ORIGINAL_CLASS_FILE = 2;
		public final static int METHOD_INVOCATION__METHOD = 3;
		public final static int METHOD_INVOCATION__ARGUMENTS = 4;
		public final static int METHOD_INVOCATION__TYPE_ARGUMENTS = 5;
		public final static int METHOD_INVOCATION__EXPRESSION = 6;
		
		public final static int METHODREF = 64;
		public final static int METHODREF_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
		public final static int METHODREF_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int METHOD_REF__COMMENTS = 0;
		public final static int METHOD_REF__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int METHOD_REF__ORIGINAL_CLASS_FILE = 2;
		public final static int METHOD_REF__METHOD = 3;
		public final static int METHOD_REF__QUALIFIER = 4;
		public final static int METHOD_REF__PARAMETERS = 5;
		
		public final static int METHODREFPARAMETER = 65;
		public final static int METHODREFPARAMETER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 3;
		public final static int METHODREFPARAMETER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int METHOD_REF_PARAMETER__COMMENTS = 0;
		public final static int METHOD_REF_PARAMETER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int METHOD_REF_PARAMETER__ORIGINAL_CLASS_FILE = 2;
		public final static int METHOD_REF_PARAMETER__NAME = 3;
		public final static int METHOD_REF_PARAMETER__VARARGS = 4;
		public final static int METHOD_REF_PARAMETER__TYPE = 5;
		
		public final static int MODEL = 66;
		public final static int MODEL_FEATURE_COUNT = 7;
		public final static int MODEL_OPERATION_COUNT = 0;
		
		public final static int MODEL__NAME = 0;
		public final static int MODEL__OWNED_ELEMENTS = 1;
		public final static int MODEL__ORPHAN_TYPES = 2;
		public final static int MODEL__UNRESOLVED_ITEMS = 3;
		public final static int MODEL__COMPILATION_UNITS = 4;
		public final static int MODEL__CLASS_FILES = 5;
		public final static int MODEL__ARCHIVES = 6;
		
		public final static int MODIFIER = 67;
		public final static int MODIFIER_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 12;
		public final static int MODIFIER_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int MODIFIER__COMMENTS = 0;
		public final static int MODIFIER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int MODIFIER__ORIGINAL_CLASS_FILE = 2;
		public final static int MODIFIER__VISIBILITY = 3;
		public final static int MODIFIER__INHERITANCE = 4;
		public final static int MODIFIER__STATIC = 5;
		public final static int MODIFIER__TRANSIENT = 6;
		public final static int MODIFIER__VOLATILE = 7;
		public final static int MODIFIER__NATIVE = 8;
		public final static int MODIFIER__STRICTFP = 9;
		public final static int MODIFIER__SYNCHRONIZED = 10;
		public final static int MODIFIER__BODY_DECLARATION = 11;
		public final static int MODIFIER__SINGLE_VARIABLE_DECLARATION = 12;
		public final static int MODIFIER__VARIABLE_DECLARATION_STATEMENT = 13;
		public final static int MODIFIER__VARIABLE_DECLARATION_EXPRESSION = 14;
		
		public final static int NAMESPACEACCESS = 69;
		public final static int NAMESPACEACCESS_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 0;
		public final static int NAMESPACEACCESS_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int NAMESPACE_ACCESS__COMMENTS = 0;
		public final static int NAMESPACE_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int NAMESPACE_ACCESS__ORIGINAL_CLASS_FILE = 2;
		
		public final static int NUMBERLITERAL = 70;
		public final static int NUMBERLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int NUMBERLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int NUMBER_LITERAL__COMMENTS = 0;
		public final static int NUMBER_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int NUMBER_LITERAL__ORIGINAL_CLASS_FILE = 2;
		public final static int NUMBER_LITERAL__TOKEN_VALUE = 3;
		
		public final static int NULLLITERAL = 71;
		public final static int NULLLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;
		public final static int NULLLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int NULL_LITERAL__COMMENTS = 0;
		public final static int NULL_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int NULL_LITERAL__ORIGINAL_CLASS_FILE = 2;
		
		public final static int PACKAGE = 72;
		public final static int PACKAGE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 5;
		public final static int PACKAGE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int PACKAGE__COMMENTS = 0;
		public final static int PACKAGE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PACKAGE__ORIGINAL_CLASS_FILE = 2;
		public final static int PACKAGE__NAME = 3;
		public final static int PACKAGE__PROXY = 4;
		public final static int PACKAGE__USAGES_IN_IMPORTS = 5;
		public final static int PACKAGE__OWNED_ELEMENTS = 6;
		public final static int PACKAGE__MODEL = 7;
		public final static int PACKAGE__OWNED_PACKAGES = 8;
		public final static int PACKAGE__PACKAGE = 9;
		public final static int PACKAGE__USAGES_IN_PACKAGE_ACCESS = 10;
		
		public final static int PACKAGEACCESS = 73;
		public final static int PACKAGEACCESS_FEATURE_COUNT = NAMESPACEACCESS_FEATURE_COUNT + 2;
		public final static int PACKAGEACCESS_OPERATION_COUNT = NAMESPACEACCESS_OPERATION_COUNT + 0;
		
		public final static int PACKAGE_ACCESS__COMMENTS = 0;
		public final static int PACKAGE_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PACKAGE_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int PACKAGE_ACCESS__PACKAGE = 3;
		public final static int PACKAGE_ACCESS__QUALIFIER = 4;
		
		public final static int PARAMETERIZEDTYPE = 74;
		public final static int PARAMETERIZEDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
		public final static int PARAMETERIZEDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
		
		public final static int PARAMETERIZED_TYPE__COMMENTS = 0;
		public final static int PARAMETERIZED_TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PARAMETERIZED_TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int PARAMETERIZED_TYPE__NAME = 3;
		public final static int PARAMETERIZED_TYPE__PROXY = 4;
		public final static int PARAMETERIZED_TYPE__USAGES_IN_IMPORTS = 5;
		public final static int PARAMETERIZED_TYPE__USAGES_IN_TYPE_ACCESS = 6;
		public final static int PARAMETERIZED_TYPE__TYPE = 7;
		public final static int PARAMETERIZED_TYPE__TYPE_ARGUMENTS = 8;
		
		public final static int PARENTHESIZEDEXPRESSION = 75;
		public final static int PARENTHESIZEDEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int PARENTHESIZEDEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int PARENTHESIZED_EXPRESSION__COMMENTS = 0;
		public final static int PARENTHESIZED_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PARENTHESIZED_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int PARENTHESIZED_EXPRESSION__EXPRESSION = 3;
		
		public final static int POSTFIXEXPRESSION = 76;
		public final static int POSTFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int POSTFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int POSTFIX_EXPRESSION__COMMENTS = 0;
		public final static int POSTFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int POSTFIX_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int POSTFIX_EXPRESSION__OPERATOR = 3;
		public final static int POSTFIX_EXPRESSION__OPERAND = 4;
		
		public final static int PREFIXEXPRESSION = 78;
		public final static int PREFIXEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int PREFIXEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int PREFIX_EXPRESSION__COMMENTS = 0;
		public final static int PREFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PREFIX_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int PREFIX_EXPRESSION__OPERATOR = 3;
		public final static int PREFIX_EXPRESSION__OPERAND = 4;
		
		public final static int PRIMITIVETYPE = 80;
		public final static int PRIMITIVETYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE__NAME = 3;
		public final static int PRIMITIVE_TYPE__PROXY = 4;
		public final static int PRIMITIVE_TYPE__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEBOOLEAN = 81;
		public final static int PRIMITIVETYPEBOOLEAN_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEBOOLEAN_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_BOOLEAN__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_BOOLEAN__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_BOOLEAN__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_BOOLEAN__NAME = 3;
		public final static int PRIMITIVE_TYPE_BOOLEAN__PROXY = 4;
		public final static int PRIMITIVE_TYPE_BOOLEAN__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_BOOLEAN__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEBYTE = 82;
		public final static int PRIMITIVETYPEBYTE_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEBYTE_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_BYTE__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_BYTE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_BYTE__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_BYTE__NAME = 3;
		public final static int PRIMITIVE_TYPE_BYTE__PROXY = 4;
		public final static int PRIMITIVE_TYPE_BYTE__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_BYTE__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPECHAR = 83;
		public final static int PRIMITIVETYPECHAR_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPECHAR_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_CHAR__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_CHAR__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_CHAR__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_CHAR__NAME = 3;
		public final static int PRIMITIVE_TYPE_CHAR__PROXY = 4;
		public final static int PRIMITIVE_TYPE_CHAR__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_CHAR__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEDOUBLE = 84;
		public final static int PRIMITIVETYPEDOUBLE_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEDOUBLE_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_DOUBLE__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_DOUBLE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_DOUBLE__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_DOUBLE__NAME = 3;
		public final static int PRIMITIVE_TYPE_DOUBLE__PROXY = 4;
		public final static int PRIMITIVE_TYPE_DOUBLE__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_DOUBLE__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPESHORT = 85;
		public final static int PRIMITIVETYPESHORT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPESHORT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_SHORT__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_SHORT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_SHORT__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_SHORT__NAME = 3;
		public final static int PRIMITIVE_TYPE_SHORT__PROXY = 4;
		public final static int PRIMITIVE_TYPE_SHORT__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_SHORT__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEFLOAT = 86;
		public final static int PRIMITIVETYPEFLOAT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEFLOAT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_FLOAT__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_FLOAT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_FLOAT__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_FLOAT__NAME = 3;
		public final static int PRIMITIVE_TYPE_FLOAT__PROXY = 4;
		public final static int PRIMITIVE_TYPE_FLOAT__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_FLOAT__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEINT = 87;
		public final static int PRIMITIVETYPEINT_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEINT_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_INT__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_INT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_INT__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_INT__NAME = 3;
		public final static int PRIMITIVE_TYPE_INT__PROXY = 4;
		public final static int PRIMITIVE_TYPE_INT__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_INT__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPELONG = 88;
		public final static int PRIMITIVETYPELONG_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPELONG_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_LONG__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_LONG__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_LONG__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_LONG__NAME = 3;
		public final static int PRIMITIVE_TYPE_LONG__PROXY = 4;
		public final static int PRIMITIVE_TYPE_LONG__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_LONG__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int PRIMITIVETYPEVOID = 89;
		public final static int PRIMITIVETYPEVOID_FEATURE_COUNT = PRIMITIVETYPE_FEATURE_COUNT + 0;
		public final static int PRIMITIVETYPEVOID_OPERATION_COUNT = PRIMITIVETYPE_OPERATION_COUNT + 0;
		
		public final static int PRIMITIVE_TYPE_VOID__COMMENTS = 0;
		public final static int PRIMITIVE_TYPE_VOID__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int PRIMITIVE_TYPE_VOID__ORIGINAL_CLASS_FILE = 2;
		public final static int PRIMITIVE_TYPE_VOID__NAME = 3;
		public final static int PRIMITIVE_TYPE_VOID__PROXY = 4;
		public final static int PRIMITIVE_TYPE_VOID__USAGES_IN_IMPORTS = 5;
		public final static int PRIMITIVE_TYPE_VOID__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int RETURNSTATEMENT = 90;
		public final static int RETURNSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int RETURNSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int RETURN_STATEMENT__COMMENTS = 0;
		public final static int RETURN_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int RETURN_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int RETURN_STATEMENT__EXPRESSION = 3;
		
		public final static int SINGLEVARIABLEACCESS = 91;
		public final static int SINGLEVARIABLEACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;
		public final static int SINGLEVARIABLEACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int SINGLE_VARIABLE_ACCESS__COMMENTS = 0;
		public final static int SINGLE_VARIABLE_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SINGLE_VARIABLE_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int SINGLE_VARIABLE_ACCESS__VARIABLE = 3;
		public final static int SINGLE_VARIABLE_ACCESS__QUALIFIER = 4;
		
		public final static int SINGLEVARIABLEDECLARATION = 92;
		public final static int SINGLEVARIABLEDECLARATION_FEATURE_COUNT = VARIABLEDECLARATION_FEATURE_COUNT + 7;
		public final static int SINGLEVARIABLEDECLARATION_OPERATION_COUNT = VARIABLEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int SINGLE_VARIABLE_DECLARATION__COMMENTS = 0;
		public final static int SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int SINGLE_VARIABLE_DECLARATION__NAME = 3;
		public final static int SINGLE_VARIABLE_DECLARATION__PROXY = 4;
		public final static int SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 6;
		public final static int SINGLE_VARIABLE_DECLARATION__INITIALIZER = 7;
		public final static int SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = 8;
		public final static int SINGLE_VARIABLE_DECLARATION__MODIFIER = 9;
		public final static int SINGLE_VARIABLE_DECLARATION__VARARGS = 10;
		public final static int SINGLE_VARIABLE_DECLARATION__TYPE = 11;
		public final static int SINGLE_VARIABLE_DECLARATION__ANNOTATIONS = 12;
		public final static int SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = 13;
		public final static int SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = 14;
		public final static int SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = 15;
		
		public final static int STRINGLITERAL = 94;
		public final static int STRINGLITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int STRINGLITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int STRING_LITERAL__COMMENTS = 0;
		public final static int STRING_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int STRING_LITERAL__ORIGINAL_CLASS_FILE = 2;
		public final static int STRING_LITERAL__ESCAPED_VALUE = 3;
		
		public final static int SUPERCONSTRUCTORINVOCATION = 95;
		public final static int SUPERCONSTRUCTORINVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 1;
		public final static int SUPERCONSTRUCTORINVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
		
		public final static int SUPER_CONSTRUCTOR_INVOCATION__COMMENTS = 0;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = 2;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__METHOD = 3;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS = 4;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = 5;
		public final static int SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = 6;
		
		public final static int SUPERFIELDACCESS = 96;
		public final static int SUPERFIELDACCESS_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + 1;
		public final static int SUPERFIELDACCESS_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + 0;
		
		public final static int SUPER_FIELD_ACCESS__COMMENTS = 0;
		public final static int SUPER_FIELD_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SUPER_FIELD_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int SUPER_FIELD_ACCESS__QUALIFIER = 3;
		public final static int SUPER_FIELD_ACCESS__FIELD = 4;
		
		public final static int SUPERMETHODINVOCATION = 97;
		public final static int SUPERMETHODINVOCATION_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + ABSTRACTMETHODINVOCATION_FEATURE_COUNT + 0;
		public final static int SUPERMETHODINVOCATION_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + ABSTRACTMETHODINVOCATION_OPERATION_COUNT + 0;
		
		public final static int SUPER_METHOD_INVOCATION__COMMENTS = 0;
		public final static int SUPER_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SUPER_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = 2;
		public final static int SUPER_METHOD_INVOCATION__QUALIFIER = 3;
		public final static int SUPER_METHOD_INVOCATION__METHOD = 4;
		public final static int SUPER_METHOD_INVOCATION__ARGUMENTS = 5;
		public final static int SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS = 6;
		
		public final static int SWITCHCASE = 98;
		public final static int SWITCHCASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int SWITCHCASE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int SWITCH_CASE__COMMENTS = 0;
		public final static int SWITCH_CASE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SWITCH_CASE__ORIGINAL_CLASS_FILE = 2;
		public final static int SWITCH_CASE__DEFAULT = 3;
		public final static int SWITCH_CASE__EXPRESSION = 4;
		
		public final static int SWITCHSTATEMENT = 99;
		public final static int SWITCHSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int SWITCHSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int SWITCH_STATEMENT__COMMENTS = 0;
		public final static int SWITCH_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SWITCH_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int SWITCH_STATEMENT__EXPRESSION = 3;
		public final static int SWITCH_STATEMENT__STATEMENTS = 4;
		
		public final static int SYNCHRONIZEDSTATEMENT = 100;
		public final static int SYNCHRONIZEDSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int SYNCHRONIZEDSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int SYNCHRONIZED_STATEMENT__COMMENTS = 0;
		public final static int SYNCHRONIZED_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int SYNCHRONIZED_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int SYNCHRONIZED_STATEMENT__BODY = 3;
		public final static int SYNCHRONIZED_STATEMENT__EXPRESSION = 4;
		
		public final static int TAGELEMENT = 101;
		public final static int TAGELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 2;
		public final static int TAGELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int TAG_ELEMENT__COMMENTS = 0;
		public final static int TAG_ELEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TAG_ELEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int TAG_ELEMENT__TAG_NAME = 3;
		public final static int TAG_ELEMENT__FRAGMENTS = 4;
		
		public final static int TEXTELEMENT = 102;
		public final static int TEXTELEMENT_FEATURE_COUNT = ASTNODE_FEATURE_COUNT + 1;
		public final static int TEXTELEMENT_OPERATION_COUNT = ASTNODE_OPERATION_COUNT + 0;
		
		public final static int TEXT_ELEMENT__COMMENTS = 0;
		public final static int TEXT_ELEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TEXT_ELEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int TEXT_ELEMENT__TEXT = 3;
		
		public final static int THISEXPRESSION = 103;
		public final static int THISEXPRESSION_FEATURE_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_FEATURE_COUNT + 0;
		public final static int THISEXPRESSION_OPERATION_COUNT = ABSTRACTTYPEQUALIFIEDEXPRESSION_OPERATION_COUNT + 0;
		
		public final static int THIS_EXPRESSION__COMMENTS = 0;
		public final static int THIS_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int THIS_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int THIS_EXPRESSION__QUALIFIER = 3;
		
		public final static int THROWSTATEMENT = 104;
		public final static int THROWSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int THROWSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int THROW_STATEMENT__COMMENTS = 0;
		public final static int THROW_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int THROW_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int THROW_STATEMENT__EXPRESSION = 3;
		
		public final static int TRYSTATEMENT = 105;
		public final static int TRYSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;
		public final static int TRYSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int TRY_STATEMENT__COMMENTS = 0;
		public final static int TRY_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TRY_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int TRY_STATEMENT__BODY = 3;
		public final static int TRY_STATEMENT__FINALLY = 4;
		public final static int TRY_STATEMENT__CATCH_CLAUSES = 5;
		
		public final static int TYPEACCESS = 107;
		public final static int TYPEACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + NAMESPACEACCESS_FEATURE_COUNT + 2;
		public final static int TYPEACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + NAMESPACEACCESS_OPERATION_COUNT + 0;
		
		public final static int TYPE_ACCESS__COMMENTS = 0;
		public final static int TYPE_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE_ACCESS__TYPE = 3;
		public final static int TYPE_ACCESS__QUALIFIER = 4;
		
		public final static int TYPEDECLARATIONSTATEMENT = 109;
		public final static int TYPEDECLARATIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;
		public final static int TYPEDECLARATIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int TYPE_DECLARATION_STATEMENT__COMMENTS = 0;
		public final static int TYPE_DECLARATION_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE_DECLARATION_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE_DECLARATION_STATEMENT__DECLARATION = 3;
		
		public final static int TYPELITERAL = 110;
		public final static int TYPELITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;
		public final static int TYPELITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;
		
		public final static int TYPE_LITERAL__COMMENTS = 0;
		public final static int TYPE_LITERAL__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE_LITERAL__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE_LITERAL__TYPE = 3;
		
		public final static int TYPEPARAMETER = 111;
		public final static int TYPEPARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;
		public final static int TYPEPARAMETER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
		
		public final static int TYPE_PARAMETER__COMMENTS = 0;
		public final static int TYPE_PARAMETER__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int TYPE_PARAMETER__ORIGINAL_CLASS_FILE = 2;
		public final static int TYPE_PARAMETER__NAME = 3;
		public final static int TYPE_PARAMETER__PROXY = 4;
		public final static int TYPE_PARAMETER__USAGES_IN_IMPORTS = 5;
		public final static int TYPE_PARAMETER__USAGES_IN_TYPE_ACCESS = 6;
		public final static int TYPE_PARAMETER__BOUNDS = 7;
		
		public final static int UNRESOLVEDITEM = 112;
		public final static int UNRESOLVEDITEM_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDITEM_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_ITEM__COMMENTS = 0;
		public final static int UNRESOLVED_ITEM__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_ITEM__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_ITEM__NAME = 3;
		public final static int UNRESOLVED_ITEM__PROXY = 4;
		public final static int UNRESOLVED_ITEM__USAGES_IN_IMPORTS = 5;
		
		public final static int UNRESOLVEDITEMACCESS = 113;
		public final static int UNRESOLVEDITEMACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + NAMESPACEACCESS_FEATURE_COUNT + 2;
		public final static int UNRESOLVEDITEMACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + NAMESPACEACCESS_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_ITEM_ACCESS__COMMENTS = 0;
		public final static int UNRESOLVED_ITEM_ACCESS__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_ITEM_ACCESS__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_ITEM_ACCESS__ELEMENT = 3;
		public final static int UNRESOLVED_ITEM_ACCESS__QUALIFIER = 4;
		
		public final static int UNRESOLVEDANNOTATIONDECLARATION = 114;
		public final static int UNRESOLVEDANNOTATIONDECLARATION_FEATURE_COUNT = ANNOTATIONTYPEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDANNOTATIONDECLARATION_OPERATION_COUNT = ANNOTATIONTYPEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__PACKAGE = 14;
		public final static int UNRESOLVED_ANNOTATION_DECLARATION__SUPER_INTERFACES = 15;
		
		public final static int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION = 115;
		public final static int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT = ANNOTATIONTYPEMEMBERDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT = ANNOTATIONTYPEMEMBERDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = 10;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = 11;
		public final static int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES = 12;
		
		public final static int UNRESOLVEDCLASSDECLARATION = 116;
		public final static int UNRESOLVEDCLASSDECLARATION_FEATURE_COUNT = CLASSDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDCLASSDECLARATION_OPERATION_COUNT = CLASSDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_CLASS_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_CLASS_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_CLASS_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_CLASS_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_CLASS_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_CLASS_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_CLASS_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int UNRESOLVED_CLASS_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int UNRESOLVED_CLASS_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int UNRESOLVED_CLASS_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int UNRESOLVED_CLASS_DECLARATION__PACKAGE = 14;
		public final static int UNRESOLVED_CLASS_DECLARATION__SUPER_INTERFACES = 15;
		public final static int UNRESOLVED_CLASS_DECLARATION__TYPE_PARAMETERS = 16;
		public final static int UNRESOLVED_CLASS_DECLARATION__SUPER_CLASS = 17;
		
		public final static int UNRESOLVEDENUMDECLARATION = 117;
		public final static int UNRESOLVEDENUMDECLARATION_FEATURE_COUNT = ENUMDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDENUMDECLARATION_OPERATION_COUNT = ENUMDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_ENUM_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_ENUM_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_ENUM_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_ENUM_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_ENUM_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_ENUM_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_ENUM_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_ENUM_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_ENUM_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int UNRESOLVED_ENUM_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int UNRESOLVED_ENUM_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int UNRESOLVED_ENUM_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int UNRESOLVED_ENUM_DECLARATION__PACKAGE = 14;
		public final static int UNRESOLVED_ENUM_DECLARATION__SUPER_INTERFACES = 15;
		public final static int UNRESOLVED_ENUM_DECLARATION__ENUM_CONSTANTS = 16;
		
		public final static int UNRESOLVEDINTERFACEDECLARATION = 118;
		public final static int UNRESOLVEDINTERFACEDECLARATION_FEATURE_COUNT = INTERFACEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDINTERFACEDECLARATION_OPERATION_COUNT = INTERFACEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__PACKAGE = 14;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__SUPER_INTERFACES = 15;
		public final static int UNRESOLVED_INTERFACE_DECLARATION__TYPE_PARAMETERS = 16;
		
		public final static int UNRESOLVEDLABELEDSTATEMENT = 119;
		public final static int UNRESOLVEDLABELEDSTATEMENT_FEATURE_COUNT = LABELEDSTATEMENT_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDLABELEDSTATEMENT_OPERATION_COUNT = LABELEDSTATEMENT_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_LABELED_STATEMENT__COMMENTS = 0;
		public final static int UNRESOLVED_LABELED_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_LABELED_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_LABELED_STATEMENT__NAME = 3;
		public final static int UNRESOLVED_LABELED_STATEMENT__PROXY = 4;
		public final static int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_LABELED_STATEMENT__BODY = 6;
		public final static int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS = 7;
		public final static int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS = 8;
		
		public final static int UNRESOLVEDMETHODDECLARATION = 120;
		public final static int UNRESOLVEDMETHODDECLARATION_FEATURE_COUNT = METHODDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDMETHODDECLARATION_OPERATION_COUNT = METHODDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_METHOD_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_METHOD_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_METHOD_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_METHOD_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_METHOD_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_METHOD_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_METHOD_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_METHOD_DECLARATION__BODY = 10;
		public final static int UNRESOLVED_METHOD_DECLARATION__PARAMETERS = 11;
		public final static int UNRESOLVED_METHOD_DECLARATION__THROWN_EXCEPTIONS = 12;
		public final static int UNRESOLVED_METHOD_DECLARATION__TYPE_PARAMETERS = 13;
		public final static int UNRESOLVED_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = 14;
		public final static int UNRESOLVED_METHOD_DECLARATION__USAGES = 15;
		public final static int UNRESOLVED_METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 16;
		public final static int UNRESOLVED_METHOD_DECLARATION__RETURN_TYPE = 17;
		public final static int UNRESOLVED_METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = 18;
		public final static int UNRESOLVED_METHOD_DECLARATION__REDEFINITIONS = 19;
		
		public final static int UNRESOLVEDSINGLEVARIABLEDECLARATION = 121;
		public final static int UNRESOLVEDSINGLEVARIABLEDECLARATION_FEATURE_COUNT = SINGLEVARIABLEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDSINGLEVARIABLEDECLARATION_OPERATION_COUNT = SINGLEVARIABLEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = 6;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__INITIALIZER = 7;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = 8;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__VARARGS = 10;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__TYPE = 11;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ANNOTATIONS = 12;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = 13;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = 14;
		public final static int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = 15;
		
		public final static int UNRESOLVEDTYPE = 122;
		public final static int UNRESOLVEDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_TYPE__COMMENTS = 0;
		public final static int UNRESOLVED_TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_TYPE__NAME = 3;
		public final static int UNRESOLVED_TYPE__PROXY = 4;
		public final static int UNRESOLVED_TYPE__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_TYPE__USAGES_IN_TYPE_ACCESS = 6;
		
		public final static int UNRESOLVEDTYPEDECLARATION = 123;
		public final static int UNRESOLVEDTYPEDECLARATION_FEATURE_COUNT = ABSTRACTTYPEDECLARATION_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDTYPEDECLARATION_OPERATION_COUNT = ABSTRACTTYPEDECLARATION_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_TYPE_DECLARATION__COMMENTS = 0;
		public final static int UNRESOLVED_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_TYPE_DECLARATION__NAME = 3;
		public final static int UNRESOLVED_TYPE_DECLARATION__PROXY = 4;
		public final static int UNRESOLVED_TYPE_DECLARATION__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = 6;
		public final static int UNRESOLVED_TYPE_DECLARATION__ANNOTATIONS = 7;
		public final static int UNRESOLVED_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = 8;
		public final static int UNRESOLVED_TYPE_DECLARATION__MODIFIER = 9;
		public final static int UNRESOLVED_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = 10;
		public final static int UNRESOLVED_TYPE_DECLARATION__BODY_DECLARATIONS = 11;
		public final static int UNRESOLVED_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = 12;
		public final static int UNRESOLVED_TYPE_DECLARATION__COMMENTS_AFTER_BODY = 13;
		public final static int UNRESOLVED_TYPE_DECLARATION__PACKAGE = 14;
		public final static int UNRESOLVED_TYPE_DECLARATION__SUPER_INTERFACES = 15;
		
		public final static int VARIABLEDECLARATIONFRAGMENT = 127;
		public final static int VARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT = VARIABLEDECLARATION_FEATURE_COUNT + 1;
		public final static int VARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT = VARIABLEDECLARATION_OPERATION_COUNT + 0;
		
		public final static int VARIABLE_DECLARATION_FRAGMENT__COMMENTS = 0;
		public final static int VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int VARIABLE_DECLARATION_FRAGMENT__NAME = 3;
		public final static int VARIABLE_DECLARATION_FRAGMENT__PROXY = 4;
		public final static int VARIABLE_DECLARATION_FRAGMENT__USAGES_IN_IMPORTS = 5;
		public final static int VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS = 6;
		public final static int VARIABLE_DECLARATION_FRAGMENT__INITIALIZER = 7;
		public final static int VARIABLE_DECLARATION_FRAGMENT__USAGE_IN_VARIABLE_ACCESS = 8;
		public final static int VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER = 9;
		
		public final static int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT = 124;
		public final static int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT = VARIABLEDECLARATIONFRAGMENT_FEATURE_COUNT + UNRESOLVEDITEM_FEATURE_COUNT + 0;
		public final static int UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT = VARIABLEDECLARATIONFRAGMENT_OPERATION_COUNT + UNRESOLVEDITEM_OPERATION_COUNT + 0;
		
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__COMMENTS = 0;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__NAME = 3;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__PROXY = 4;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__USAGES_IN_IMPORTS = 5;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS = 6;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__INITIALIZER = 7;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__USAGE_IN_VARIABLE_ACCESS = 8;
		public final static int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER = 9;
		
		public final static int VARIABLEDECLARATIONEXPRESSION = 126;
		public final static int VARIABLEDECLARATIONEXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 2;
		public final static int VARIABLEDECLARATIONEXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
		
		public final static int VARIABLE_DECLARATION_EXPRESSION__COMMENTS = 0;
		public final static int VARIABLE_DECLARATION_EXPRESSION__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int VARIABLE_DECLARATION_EXPRESSION__ORIGINAL_CLASS_FILE = 2;
		public final static int VARIABLE_DECLARATION_EXPRESSION__TYPE = 3;
		public final static int VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS = 4;
		public final static int VARIABLE_DECLARATION_EXPRESSION__MODIFIER = 5;
		public final static int VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS = 6;
		
		public final static int VARIABLEDECLARATIONSTATEMENT = 128;
		public final static int VARIABLEDECLARATIONSTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + ABSTRACTVARIABLESCONTAINER_FEATURE_COUNT + 3;
		public final static int VARIABLEDECLARATIONSTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + ABSTRACTVARIABLESCONTAINER_OPERATION_COUNT + 0;
		
		public final static int VARIABLE_DECLARATION_STATEMENT__COMMENTS = 0;
		public final static int VARIABLE_DECLARATION_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int VARIABLE_DECLARATION_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int VARIABLE_DECLARATION_STATEMENT__TYPE = 3;
		public final static int VARIABLE_DECLARATION_STATEMENT__FRAGMENTS = 4;
		public final static int VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS = 5;
		public final static int VARIABLE_DECLARATION_STATEMENT__MODIFIER = 6;
		public final static int VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS = 7;
		
		public final static int WILDCARDTYPE = 130;
		public final static int WILDCARDTYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;
		public final static int WILDCARDTYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;
		
		public final static int WILD_CARD_TYPE__COMMENTS = 0;
		public final static int WILD_CARD_TYPE__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int WILD_CARD_TYPE__ORIGINAL_CLASS_FILE = 2;
		public final static int WILD_CARD_TYPE__NAME = 3;
		public final static int WILD_CARD_TYPE__PROXY = 4;
		public final static int WILD_CARD_TYPE__USAGES_IN_IMPORTS = 5;
		public final static int WILD_CARD_TYPE__USAGES_IN_TYPE_ACCESS = 6;
		public final static int WILD_CARD_TYPE__UPPER_BOUND = 7;
		public final static int WILD_CARD_TYPE__BOUND = 8;
		
		public final static int WHILESTATEMENT = 131;
		public final static int WHILESTATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;
		public final static int WHILESTATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;
		
		public final static int WHILE_STATEMENT__COMMENTS = 0;
		public final static int WHILE_STATEMENT__ORIGINAL_COMPILATION_UNIT = 1;
		public final static int WHILE_STATEMENT__ORIGINAL_CLASS_FILE = 2;
		public final static int WHILE_STATEMENT__EXPRESSION = 3;
		public final static int WHILE_STATEMENT__BODY = 4;
		
		public final static int ASSIGNMENTKIND = 19;
		public final static int INFIXEXPRESSIONKIND = 50;
		public final static int INHERITANCEKIND = 51;
		public final static int POSTFIXEXPRESSIONKIND = 77;
		public final static int PREFIXEXPRESSIONKIND = 79;
		public final static int VISIBILITYKIND = 129;
		
		
		public EClass getASTNode(){return ASTNodeEClass;}
		
		public EReference getASTNode_Comments(){return (EReference)ASTNodeEClass.getEStructuralFeatures().get(0);}
		public EReference getASTNode_OriginalCompilationUnit(){return (EReference)ASTNodeEClass.getEStructuralFeatures().get(1);}
		public EReference getASTNode_OriginalClassFile(){return (EReference)ASTNodeEClass.getEStructuralFeatures().get(2);}
		public EClass getNamedElement(){return NamedElementEClass;}
		
		public EAttribute getNamedElement_Name(){return (EAttribute)NamedElementEClass.getEStructuralFeatures().get(0);}
		public EAttribute getNamedElement_Proxy(){return (EAttribute)NamedElementEClass.getEStructuralFeatures().get(1);}
		public EReference getNamedElement_UsagesInImports(){return (EReference)NamedElementEClass.getEStructuralFeatures().get(2);}
		public EClass getBodyDeclaration(){return BodyDeclarationEClass;}
		
		public EReference getBodyDeclaration_AbstractTypeDeclaration(){return (EReference)BodyDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getBodyDeclaration_Annotations(){return (EReference)BodyDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getBodyDeclaration_AnonymousClassDeclarationOwner(){return (EReference)BodyDeclarationEClass.getEStructuralFeatures().get(2);}
		public EReference getBodyDeclaration_Modifier(){return (EReference)BodyDeclarationEClass.getEStructuralFeatures().get(3);}
		public EClass getAbstractMethodDeclaration(){return AbstractMethodDeclarationEClass;}
		
		public EReference getAbstractMethodDeclaration_Body(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getAbstractMethodDeclaration_Parameters(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getAbstractMethodDeclaration_ThrownExceptions(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(2);}
		public EReference getAbstractMethodDeclaration_TypeParameters(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(3);}
		public EReference getAbstractMethodDeclaration_UsagesInDocComments(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(4);}
		public EReference getAbstractMethodDeclaration_Usages(){return (EReference)AbstractMethodDeclarationEClass.getEStructuralFeatures().get(5);}
		public EClass getAbstractMethodInvocation(){return AbstractMethodInvocationEClass;}
		
		public EReference getAbstractMethodInvocation_Method(){return (EReference)AbstractMethodInvocationEClass.getEStructuralFeatures().get(0);}
		public EReference getAbstractMethodInvocation_Arguments(){return (EReference)AbstractMethodInvocationEClass.getEStructuralFeatures().get(1);}
		public EReference getAbstractMethodInvocation_TypeArguments(){return (EReference)AbstractMethodInvocationEClass.getEStructuralFeatures().get(2);}
		public EClass getType(){return TypeEClass;}
		
		public EReference getType_UsagesInTypeAccess(){return (EReference)TypeEClass.getEStructuralFeatures().get(0);}
		public EClass getAbstractTypeDeclaration(){return AbstractTypeDeclarationEClass;}
		
		public EReference getAbstractTypeDeclaration_BodyDeclarations(){return (EReference)AbstractTypeDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getAbstractTypeDeclaration_CommentsBeforeBody(){return (EReference)AbstractTypeDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getAbstractTypeDeclaration_CommentsAfterBody(){return (EReference)AbstractTypeDeclarationEClass.getEStructuralFeatures().get(2);}
		public EReference getAbstractTypeDeclaration_Package(){return (EReference)AbstractTypeDeclarationEClass.getEStructuralFeatures().get(3);}
		public EReference getAbstractTypeDeclaration_SuperInterfaces(){return (EReference)AbstractTypeDeclarationEClass.getEStructuralFeatures().get(4);}
		public EClass getExpression(){return ExpressionEClass;}
		
		public EClass getAbstractTypeQualifiedExpression(){return AbstractTypeQualifiedExpressionEClass;}
		
		public EReference getAbstractTypeQualifiedExpression_Qualifier(){return (EReference)AbstractTypeQualifiedExpressionEClass.getEStructuralFeatures().get(0);}
		public EClass getAbstractVariablesContainer(){return AbstractVariablesContainerEClass;}
		
		public EReference getAbstractVariablesContainer_Type(){return (EReference)AbstractVariablesContainerEClass.getEStructuralFeatures().get(0);}
		public EReference getAbstractVariablesContainer_Fragments(){return (EReference)AbstractVariablesContainerEClass.getEStructuralFeatures().get(1);}
		public EClass getAnnotation(){return AnnotationEClass;}
		
		public EReference getAnnotation_Type(){return (EReference)AnnotationEClass.getEStructuralFeatures().get(0);}
		public EReference getAnnotation_Values(){return (EReference)AnnotationEClass.getEStructuralFeatures().get(1);}
		public EClass getArchive(){return ArchiveEClass;}
		
		public EAttribute getArchive_OriginalFilePath(){return (EAttribute)ArchiveEClass.getEStructuralFeatures().get(0);}
		public EReference getArchive_ClassFiles(){return (EReference)ArchiveEClass.getEStructuralFeatures().get(1);}
		public EReference getArchive_Manifest(){return (EReference)ArchiveEClass.getEStructuralFeatures().get(2);}
		public EClass getStatement(){return StatementEClass;}
		
		public EClass getAssertStatement(){return AssertStatementEClass;}
		
		public EReference getAssertStatement_Message(){return (EReference)AssertStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getAssertStatement_Expression(){return (EReference)AssertStatementEClass.getEStructuralFeatures().get(1);}
		public EClass getAnnotationMemberValuePair(){return AnnotationMemberValuePairEClass;}
		
		public EReference getAnnotationMemberValuePair_Member(){return (EReference)AnnotationMemberValuePairEClass.getEStructuralFeatures().get(0);}
		public EReference getAnnotationMemberValuePair_Value(){return (EReference)AnnotationMemberValuePairEClass.getEStructuralFeatures().get(1);}
		public EClass getAnnotationTypeDeclaration(){return AnnotationTypeDeclarationEClass;}
		
		public EClass getAnnotationTypeMemberDeclaration(){return AnnotationTypeMemberDeclarationEClass;}
		
		public EReference getAnnotationTypeMemberDeclaration_Default(){return (EReference)AnnotationTypeMemberDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getAnnotationTypeMemberDeclaration_Type(){return (EReference)AnnotationTypeMemberDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getAnnotationTypeMemberDeclaration_Usages(){return (EReference)AnnotationTypeMemberDeclarationEClass.getEStructuralFeatures().get(2);}
		public EClass getAnonymousClassDeclaration(){return AnonymousClassDeclarationEClass;}
		
		public EReference getAnonymousClassDeclaration_BodyDeclarations(){return (EReference)AnonymousClassDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getAnonymousClassDeclaration_ClassInstanceCreation(){return (EReference)AnonymousClassDeclarationEClass.getEStructuralFeatures().get(1);}
		public EClass getArrayAccess(){return ArrayAccessEClass;}
		
		public EReference getArrayAccess_Array(){return (EReference)ArrayAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getArrayAccess_Index(){return (EReference)ArrayAccessEClass.getEStructuralFeatures().get(1);}
		public EClass getArrayCreation(){return ArrayCreationEClass;}
		
		public EReference getArrayCreation_Dimensions(){return (EReference)ArrayCreationEClass.getEStructuralFeatures().get(0);}
		public EReference getArrayCreation_Initializer(){return (EReference)ArrayCreationEClass.getEStructuralFeatures().get(1);}
		public EReference getArrayCreation_Type(){return (EReference)ArrayCreationEClass.getEStructuralFeatures().get(2);}
		public EClass getArrayInitializer(){return ArrayInitializerEClass;}
		
		public EReference getArrayInitializer_Expressions(){return (EReference)ArrayInitializerEClass.getEStructuralFeatures().get(0);}
		public EClass getArrayLengthAccess(){return ArrayLengthAccessEClass;}
		
		public EReference getArrayLengthAccess_Array(){return (EReference)ArrayLengthAccessEClass.getEStructuralFeatures().get(0);}
		public EClass getArrayType(){return ArrayTypeEClass;}
		
		public EAttribute getArrayType_Dimensions(){return (EAttribute)ArrayTypeEClass.getEStructuralFeatures().get(0);}
		public EReference getArrayType_ElementType(){return (EReference)ArrayTypeEClass.getEStructuralFeatures().get(1);}
		public EClass getAssignment(){return AssignmentEClass;}
		
		public EReference getAssignment_LeftHandSide(){return (EReference)AssignmentEClass.getEStructuralFeatures().get(0);}
		public EAttribute getAssignment_Operator(){return (EAttribute)AssignmentEClass.getEStructuralFeatures().get(1);}
		public EReference getAssignment_RightHandSide(){return (EReference)AssignmentEClass.getEStructuralFeatures().get(2);}
		public EClass getBooleanLiteral(){return BooleanLiteralEClass;}
		
		public EAttribute getBooleanLiteral_Value(){return (EAttribute)BooleanLiteralEClass.getEStructuralFeatures().get(0);}
		public EClass getComment(){return CommentEClass;}
		
		public EAttribute getComment_Content(){return (EAttribute)CommentEClass.getEStructuralFeatures().get(0);}
		public EAttribute getComment_EnclosedByParent(){return (EAttribute)CommentEClass.getEStructuralFeatures().get(1);}
		public EAttribute getComment_PrefixOfParent(){return (EAttribute)CommentEClass.getEStructuralFeatures().get(2);}
		public EClass getBlockComment(){return BlockCommentEClass;}
		
		public EClass getBlock(){return BlockEClass;}
		
		public EReference getBlock_Statements(){return (EReference)BlockEClass.getEStructuralFeatures().get(0);}
		public EClass getBreakStatement(){return BreakStatementEClass;}
		
		public EReference getBreakStatement_Label(){return (EReference)BreakStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getCastExpression(){return CastExpressionEClass;}
		
		public EReference getCastExpression_Expression(){return (EReference)CastExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getCastExpression_Type(){return (EReference)CastExpressionEClass.getEStructuralFeatures().get(1);}
		public EClass getCatchClause(){return CatchClauseEClass;}
		
		public EReference getCatchClause_Exception(){return (EReference)CatchClauseEClass.getEStructuralFeatures().get(0);}
		public EReference getCatchClause_Body(){return (EReference)CatchClauseEClass.getEStructuralFeatures().get(1);}
		public EClass getCharacterLiteral(){return CharacterLiteralEClass;}
		
		public EAttribute getCharacterLiteral_EscapedValue(){return (EAttribute)CharacterLiteralEClass.getEStructuralFeatures().get(0);}
		public EClass getClassFile(){return ClassFileEClass;}
		
		public EAttribute getClassFile_OriginalFilePath(){return (EAttribute)ClassFileEClass.getEStructuralFeatures().get(0);}
		public EReference getClassFile_Type(){return (EReference)ClassFileEClass.getEStructuralFeatures().get(1);}
		public EReference getClassFile_AttachedSource(){return (EReference)ClassFileEClass.getEStructuralFeatures().get(2);}
		public EReference getClassFile_Package(){return (EReference)ClassFileEClass.getEStructuralFeatures().get(3);}
		public EClass getClassInstanceCreation(){return ClassInstanceCreationEClass;}
		
		public EReference getClassInstanceCreation_AnonymousClassDeclaration(){return (EReference)ClassInstanceCreationEClass.getEStructuralFeatures().get(0);}
		public EReference getClassInstanceCreation_Expression(){return (EReference)ClassInstanceCreationEClass.getEStructuralFeatures().get(1);}
		public EReference getClassInstanceCreation_Type(){return (EReference)ClassInstanceCreationEClass.getEStructuralFeatures().get(2);}
		public EClass getConstructorDeclaration(){return ConstructorDeclarationEClass;}
		
		public EClass getConditionalExpression(){return ConditionalExpressionEClass;}
		
		public EReference getConditionalExpression_ElseExpression(){return (EReference)ConditionalExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getConditionalExpression_Expression(){return (EReference)ConditionalExpressionEClass.getEStructuralFeatures().get(1);}
		public EReference getConditionalExpression_ThenExpression(){return (EReference)ConditionalExpressionEClass.getEStructuralFeatures().get(2);}
		public EClass getConstructorInvocation(){return ConstructorInvocationEClass;}
		
		public EClass getTypeDeclaration(){return TypeDeclarationEClass;}
		
		public EReference getTypeDeclaration_TypeParameters(){return (EReference)TypeDeclarationEClass.getEStructuralFeatures().get(0);}
		public EClass getClassDeclaration(){return ClassDeclarationEClass;}
		
		public EReference getClassDeclaration_SuperClass(){return (EReference)ClassDeclarationEClass.getEStructuralFeatures().get(0);}
		public EClass getCompilationUnit(){return CompilationUnitEClass;}
		
		public EAttribute getCompilationUnit_OriginalFilePath(){return (EAttribute)CompilationUnitEClass.getEStructuralFeatures().get(0);}
		public EReference getCompilationUnit_CommentList(){return (EReference)CompilationUnitEClass.getEStructuralFeatures().get(1);}
		public EReference getCompilationUnit_Imports(){return (EReference)CompilationUnitEClass.getEStructuralFeatures().get(2);}
		public EReference getCompilationUnit_Package(){return (EReference)CompilationUnitEClass.getEStructuralFeatures().get(3);}
		public EReference getCompilationUnit_Types(){return (EReference)CompilationUnitEClass.getEStructuralFeatures().get(4);}
		public EClass getContinueStatement(){return ContinueStatementEClass;}
		
		public EReference getContinueStatement_Label(){return (EReference)ContinueStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getDoStatement(){return DoStatementEClass;}
		
		public EReference getDoStatement_Expression(){return (EReference)DoStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getDoStatement_Body(){return (EReference)DoStatementEClass.getEStructuralFeatures().get(1);}
		public EClass getEmptyStatement(){return EmptyStatementEClass;}
		
		public EClass getEnhancedForStatement(){return EnhancedForStatementEClass;}
		
		public EReference getEnhancedForStatement_Body(){return (EReference)EnhancedForStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getEnhancedForStatement_Expression(){return (EReference)EnhancedForStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getEnhancedForStatement_Parameter(){return (EReference)EnhancedForStatementEClass.getEStructuralFeatures().get(2);}
		public EClass getVariableDeclaration(){return VariableDeclarationEClass;}
		
		public EAttribute getVariableDeclaration_ExtraArrayDimensions(){return (EAttribute)VariableDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getVariableDeclaration_Initializer(){return (EReference)VariableDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getVariableDeclaration_UsageInVariableAccess(){return (EReference)VariableDeclarationEClass.getEStructuralFeatures().get(2);}
		public EClass getEnumConstantDeclaration(){return EnumConstantDeclarationEClass;}
		
		public EReference getEnumConstantDeclaration_AnonymousClassDeclaration(){return (EReference)EnumConstantDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getEnumConstantDeclaration_Arguments(){return (EReference)EnumConstantDeclarationEClass.getEStructuralFeatures().get(1);}
		public EClass getEnumDeclaration(){return EnumDeclarationEClass;}
		
		public EReference getEnumDeclaration_EnumConstants(){return (EReference)EnumDeclarationEClass.getEStructuralFeatures().get(0);}
		public EClass getExpressionStatement(){return ExpressionStatementEClass;}
		
		public EReference getExpressionStatement_Expression(){return (EReference)ExpressionStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getFieldAccess(){return FieldAccessEClass;}
		
		public EReference getFieldAccess_Field(){return (EReference)FieldAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getFieldAccess_Expression(){return (EReference)FieldAccessEClass.getEStructuralFeatures().get(1);}
		public EClass getFieldDeclaration(){return FieldDeclarationEClass;}
		
		public EClass getForStatement(){return ForStatementEClass;}
		
		public EReference getForStatement_Expression(){return (EReference)ForStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getForStatement_Updaters(){return (EReference)ForStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getForStatement_Initializers(){return (EReference)ForStatementEClass.getEStructuralFeatures().get(2);}
		public EReference getForStatement_Body(){return (EReference)ForStatementEClass.getEStructuralFeatures().get(3);}
		public EClass getIfStatement(){return IfStatementEClass;}
		
		public EReference getIfStatement_Expression(){return (EReference)IfStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getIfStatement_ThenStatement(){return (EReference)IfStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getIfStatement_ElseStatement(){return (EReference)IfStatementEClass.getEStructuralFeatures().get(2);}
		public EClass getImportDeclaration(){return ImportDeclarationEClass;}
		
		public EAttribute getImportDeclaration_Static(){return (EAttribute)ImportDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getImportDeclaration_ImportedElement(){return (EReference)ImportDeclarationEClass.getEStructuralFeatures().get(1);}
		public EClass getInfixExpression(){return InfixExpressionEClass;}
		
		public EAttribute getInfixExpression_Operator(){return (EAttribute)InfixExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getInfixExpression_RightOperand(){return (EReference)InfixExpressionEClass.getEStructuralFeatures().get(1);}
		public EReference getInfixExpression_LeftOperand(){return (EReference)InfixExpressionEClass.getEStructuralFeatures().get(2);}
		public EReference getInfixExpression_ExtendedOperands(){return (EReference)InfixExpressionEClass.getEStructuralFeatures().get(3);}
		public EClass getInitializer(){return InitializerEClass;}
		
		public EReference getInitializer_Body(){return (EReference)InitializerEClass.getEStructuralFeatures().get(0);}
		public EClass getInstanceofExpression(){return InstanceofExpressionEClass;}
		
		public EReference getInstanceofExpression_RightOperand(){return (EReference)InstanceofExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getInstanceofExpression_LeftOperand(){return (EReference)InstanceofExpressionEClass.getEStructuralFeatures().get(1);}
		public EClass getInterfaceDeclaration(){return InterfaceDeclarationEClass;}
		
		public EClass getJavadoc(){return JavadocEClass;}
		
		public EReference getJavadoc_Tags(){return (EReference)JavadocEClass.getEStructuralFeatures().get(0);}
		public EClass getLabeledStatement(){return LabeledStatementEClass;}
		
		public EReference getLabeledStatement_Body(){return (EReference)LabeledStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getLabeledStatement_UsagesInBreakStatements(){return (EReference)LabeledStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getLabeledStatement_UsagesInContinueStatements(){return (EReference)LabeledStatementEClass.getEStructuralFeatures().get(2);}
		public EClass getLineComment(){return LineCommentEClass;}
		
		public EClass getManifest(){return ManifestEClass;}
		
		public EReference getManifest_MainAttributes(){return (EReference)ManifestEClass.getEStructuralFeatures().get(0);}
		public EReference getManifest_EntryAttributes(){return (EReference)ManifestEClass.getEStructuralFeatures().get(1);}
		public EClass getManifestAttribute(){return ManifestAttributeEClass;}
		
		public EAttribute getManifestAttribute_Key(){return (EAttribute)ManifestAttributeEClass.getEStructuralFeatures().get(0);}
		public EAttribute getManifestAttribute_Value(){return (EAttribute)ManifestAttributeEClass.getEStructuralFeatures().get(1);}
		public EClass getManifestEntry(){return ManifestEntryEClass;}
		
		public EAttribute getManifestEntry_Name(){return (EAttribute)ManifestEntryEClass.getEStructuralFeatures().get(0);}
		public EReference getManifestEntry_Attributes(){return (EReference)ManifestEntryEClass.getEStructuralFeatures().get(1);}
		public EClass getMemberRef(){return MemberRefEClass;}
		
		public EReference getMemberRef_Member(){return (EReference)MemberRefEClass.getEStructuralFeatures().get(0);}
		public EReference getMemberRef_Qualifier(){return (EReference)MemberRefEClass.getEStructuralFeatures().get(1);}
		public EClass getMethodDeclaration(){return MethodDeclarationEClass;}
		
		public EAttribute getMethodDeclaration_ExtraArrayDimensions(){return (EAttribute)MethodDeclarationEClass.getEStructuralFeatures().get(0);}
		public EReference getMethodDeclaration_ReturnType(){return (EReference)MethodDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getMethodDeclaration_RedefinedMethodDeclaration(){return (EReference)MethodDeclarationEClass.getEStructuralFeatures().get(2);}
		public EReference getMethodDeclaration_Redefinitions(){return (EReference)MethodDeclarationEClass.getEStructuralFeatures().get(3);}
		public EClass getMethodInvocation(){return MethodInvocationEClass;}
		
		public EReference getMethodInvocation_Expression(){return (EReference)MethodInvocationEClass.getEStructuralFeatures().get(0);}
		public EClass getMethodRef(){return MethodRefEClass;}
		
		public EReference getMethodRef_Method(){return (EReference)MethodRefEClass.getEStructuralFeatures().get(0);}
		public EReference getMethodRef_Qualifier(){return (EReference)MethodRefEClass.getEStructuralFeatures().get(1);}
		public EReference getMethodRef_Parameters(){return (EReference)MethodRefEClass.getEStructuralFeatures().get(2);}
		public EClass getMethodRefParameter(){return MethodRefParameterEClass;}
		
		public EAttribute getMethodRefParameter_Name(){return (EAttribute)MethodRefParameterEClass.getEStructuralFeatures().get(0);}
		public EAttribute getMethodRefParameter_Varargs(){return (EAttribute)MethodRefParameterEClass.getEStructuralFeatures().get(1);}
		public EReference getMethodRefParameter_Type(){return (EReference)MethodRefParameterEClass.getEStructuralFeatures().get(2);}
		public EClass getModel(){return ModelEClass;}
		
		public EAttribute getModel_Name(){return (EAttribute)ModelEClass.getEStructuralFeatures().get(0);}
		public EReference getModel_OwnedElements(){return (EReference)ModelEClass.getEStructuralFeatures().get(1);}
		public EReference getModel_OrphanTypes(){return (EReference)ModelEClass.getEStructuralFeatures().get(2);}
		public EReference getModel_UnresolvedItems(){return (EReference)ModelEClass.getEStructuralFeatures().get(3);}
		public EReference getModel_CompilationUnits(){return (EReference)ModelEClass.getEStructuralFeatures().get(4);}
		public EReference getModel_ClassFiles(){return (EReference)ModelEClass.getEStructuralFeatures().get(5);}
		public EReference getModel_Archives(){return (EReference)ModelEClass.getEStructuralFeatures().get(6);}
		public EClass getModifier(){return ModifierEClass;}
		
		public EAttribute getModifier_Visibility(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(0);}
		public EAttribute getModifier_Inheritance(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(1);}
		public EAttribute getModifier_Static(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(2);}
		public EAttribute getModifier_Transient(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(3);}
		public EAttribute getModifier_Volatile(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(4);}
		public EAttribute getModifier_Native(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(5);}
		public EAttribute getModifier_Strictfp(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(6);}
		public EAttribute getModifier_Synchronized(){return (EAttribute)ModifierEClass.getEStructuralFeatures().get(7);}
		public EReference getModifier_BodyDeclaration(){return (EReference)ModifierEClass.getEStructuralFeatures().get(8);}
		public EReference getModifier_SingleVariableDeclaration(){return (EReference)ModifierEClass.getEStructuralFeatures().get(9);}
		public EReference getModifier_VariableDeclarationStatement(){return (EReference)ModifierEClass.getEStructuralFeatures().get(10);}
		public EReference getModifier_VariableDeclarationExpression(){return (EReference)ModifierEClass.getEStructuralFeatures().get(11);}
		public EClass getNamespaceAccess(){return NamespaceAccessEClass;}
		
		public EClass getNumberLiteral(){return NumberLiteralEClass;}
		
		public EAttribute getNumberLiteral_TokenValue(){return (EAttribute)NumberLiteralEClass.getEStructuralFeatures().get(0);}
		public EClass getNullLiteral(){return NullLiteralEClass;}
		
		public EClass getPackage(){return PackageEClass;}
		
		public EReference getPackage_OwnedElements(){return (EReference)PackageEClass.getEStructuralFeatures().get(0);}
		public EReference getPackage_Model(){return (EReference)PackageEClass.getEStructuralFeatures().get(1);}
		public EReference getPackage_OwnedPackages(){return (EReference)PackageEClass.getEStructuralFeatures().get(2);}
		public EReference getPackage_Package(){return (EReference)PackageEClass.getEStructuralFeatures().get(3);}
		public EReference getPackage_UsagesInPackageAccess(){return (EReference)PackageEClass.getEStructuralFeatures().get(4);}
		public EClass getPackageAccess(){return PackageAccessEClass;}
		
		public EReference getPackageAccess_Package(){return (EReference)PackageAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getPackageAccess_Qualifier(){return (EReference)PackageAccessEClass.getEStructuralFeatures().get(1);}
		public EClass getParameterizedType(){return ParameterizedTypeEClass;}
		
		public EReference getParameterizedType_Type(){return (EReference)ParameterizedTypeEClass.getEStructuralFeatures().get(0);}
		public EReference getParameterizedType_TypeArguments(){return (EReference)ParameterizedTypeEClass.getEStructuralFeatures().get(1);}
		public EClass getParenthesizedExpression(){return ParenthesizedExpressionEClass;}
		
		public EReference getParenthesizedExpression_Expression(){return (EReference)ParenthesizedExpressionEClass.getEStructuralFeatures().get(0);}
		public EClass getPostfixExpression(){return PostfixExpressionEClass;}
		
		public EAttribute getPostfixExpression_Operator(){return (EAttribute)PostfixExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getPostfixExpression_Operand(){return (EReference)PostfixExpressionEClass.getEStructuralFeatures().get(1);}
		public EClass getPrefixExpression(){return PrefixExpressionEClass;}
		
		public EAttribute getPrefixExpression_Operator(){return (EAttribute)PrefixExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getPrefixExpression_Operand(){return (EReference)PrefixExpressionEClass.getEStructuralFeatures().get(1);}
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
		
		public EReference getReturnStatement_Expression(){return (EReference)ReturnStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getSingleVariableAccess(){return SingleVariableAccessEClass;}
		
		public EReference getSingleVariableAccess_Variable(){return (EReference)SingleVariableAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getSingleVariableAccess_Qualifier(){return (EReference)SingleVariableAccessEClass.getEStructuralFeatures().get(1);}
		public EClass getSingleVariableDeclaration(){return SingleVariableDeclarationEClass;}
		
		public EReference getSingleVariableDeclaration_Modifier(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(0);}
		public EAttribute getSingleVariableDeclaration_Varargs(){return (EAttribute)SingleVariableDeclarationEClass.getEStructuralFeatures().get(1);}
		public EReference getSingleVariableDeclaration_Type(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(2);}
		public EReference getSingleVariableDeclaration_Annotations(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(3);}
		public EReference getSingleVariableDeclaration_MethodDeclaration(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(4);}
		public EReference getSingleVariableDeclaration_CatchClause(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(5);}
		public EReference getSingleVariableDeclaration_EnhancedForStatement(){return (EReference)SingleVariableDeclarationEClass.getEStructuralFeatures().get(6);}
		public EClass getStringLiteral(){return StringLiteralEClass;}
		
		public EAttribute getStringLiteral_EscapedValue(){return (EAttribute)StringLiteralEClass.getEStructuralFeatures().get(0);}
		public EClass getSuperConstructorInvocation(){return SuperConstructorInvocationEClass;}
		
		public EReference getSuperConstructorInvocation_Expression(){return (EReference)SuperConstructorInvocationEClass.getEStructuralFeatures().get(0);}
		public EClass getSuperFieldAccess(){return SuperFieldAccessEClass;}
		
		public EReference getSuperFieldAccess_Field(){return (EReference)SuperFieldAccessEClass.getEStructuralFeatures().get(0);}
		public EClass getSuperMethodInvocation(){return SuperMethodInvocationEClass;}
		
		public EClass getSwitchCase(){return SwitchCaseEClass;}
		
		public EAttribute getSwitchCase_Default(){return (EAttribute)SwitchCaseEClass.getEStructuralFeatures().get(0);}
		public EReference getSwitchCase_Expression(){return (EReference)SwitchCaseEClass.getEStructuralFeatures().get(1);}
		public EClass getSwitchStatement(){return SwitchStatementEClass;}
		
		public EReference getSwitchStatement_Expression(){return (EReference)SwitchStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getSwitchStatement_Statements(){return (EReference)SwitchStatementEClass.getEStructuralFeatures().get(1);}
		public EClass getSynchronizedStatement(){return SynchronizedStatementEClass;}
		
		public EReference getSynchronizedStatement_Body(){return (EReference)SynchronizedStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getSynchronizedStatement_Expression(){return (EReference)SynchronizedStatementEClass.getEStructuralFeatures().get(1);}
		public EClass getTagElement(){return TagElementEClass;}
		
		public EAttribute getTagElement_TagName(){return (EAttribute)TagElementEClass.getEStructuralFeatures().get(0);}
		public EReference getTagElement_Fragments(){return (EReference)TagElementEClass.getEStructuralFeatures().get(1);}
		public EClass getTextElement(){return TextElementEClass;}
		
		public EAttribute getTextElement_Text(){return (EAttribute)TextElementEClass.getEStructuralFeatures().get(0);}
		public EClass getThisExpression(){return ThisExpressionEClass;}
		
		public EClass getThrowStatement(){return ThrowStatementEClass;}
		
		public EReference getThrowStatement_Expression(){return (EReference)ThrowStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getTryStatement(){return TryStatementEClass;}
		
		public EReference getTryStatement_Body(){return (EReference)TryStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getTryStatement_Finally(){return (EReference)TryStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getTryStatement_CatchClauses(){return (EReference)TryStatementEClass.getEStructuralFeatures().get(2);}
		public EClass getTypeAccess(){return TypeAccessEClass;}
		
		public EReference getTypeAccess_Type(){return (EReference)TypeAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getTypeAccess_Qualifier(){return (EReference)TypeAccessEClass.getEStructuralFeatures().get(1);}
		public EClass getTypeDeclarationStatement(){return TypeDeclarationStatementEClass;}
		
		public EReference getTypeDeclarationStatement_Declaration(){return (EReference)TypeDeclarationStatementEClass.getEStructuralFeatures().get(0);}
		public EClass getTypeLiteral(){return TypeLiteralEClass;}
		
		public EReference getTypeLiteral_Type(){return (EReference)TypeLiteralEClass.getEStructuralFeatures().get(0);}
		public EClass getTypeParameter(){return TypeParameterEClass;}
		
		public EReference getTypeParameter_Bounds(){return (EReference)TypeParameterEClass.getEStructuralFeatures().get(0);}
		public EClass getUnresolvedItem(){return UnresolvedItemEClass;}
		
		public EClass getUnresolvedItemAccess(){return UnresolvedItemAccessEClass;}
		
		public EReference getUnresolvedItemAccess_Element(){return (EReference)UnresolvedItemAccessEClass.getEStructuralFeatures().get(0);}
		public EReference getUnresolvedItemAccess_Qualifier(){return (EReference)UnresolvedItemAccessEClass.getEStructuralFeatures().get(1);}
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
		
		public EReference getVariableDeclarationFragment_VariablesContainer(){return (EReference)VariableDeclarationFragmentEClass.getEStructuralFeatures().get(0);}
		public EClass getUnresolvedVariableDeclarationFragment(){return UnresolvedVariableDeclarationFragmentEClass;}
		
		public EClass getVariableDeclarationExpression(){return VariableDeclarationExpressionEClass;}
		
		public EReference getVariableDeclarationExpression_Modifier(){return (EReference)VariableDeclarationExpressionEClass.getEStructuralFeatures().get(0);}
		public EReference getVariableDeclarationExpression_Annotations(){return (EReference)VariableDeclarationExpressionEClass.getEStructuralFeatures().get(1);}
		public EClass getVariableDeclarationStatement(){return VariableDeclarationStatementEClass;}
		
		public EAttribute getVariableDeclarationStatement_ExtraArrayDimensions(){return (EAttribute)VariableDeclarationStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getVariableDeclarationStatement_Modifier(){return (EReference)VariableDeclarationStatementEClass.getEStructuralFeatures().get(1);}
		public EReference getVariableDeclarationStatement_Annotations(){return (EReference)VariableDeclarationStatementEClass.getEStructuralFeatures().get(2);}
		public EClass getWildCardType(){return WildCardTypeEClass;}
		
		public EAttribute getWildCardType_UpperBound(){return (EAttribute)WildCardTypeEClass.getEStructuralFeatures().get(0);}
		public EReference getWildCardType_Bound(){return (EReference)WildCardTypeEClass.getEStructuralFeatures().get(1);}
		public EClass getWhileStatement(){return WhileStatementEClass;}
		
		public EReference getWhileStatement_Expression(){return (EReference)WhileStatementEClass.getEStructuralFeatures().get(0);}
		public EReference getWhileStatement_Body(){return (EReference)WhileStatementEClass.getEStructuralFeatures().get(1);}
		public EEnum getAssignmentKind(){return AssignmentKindEEnum;}
		public EEnum getInfixExpressionKind(){return InfixExpressionKindEEnum;}
		public EEnum getInheritanceKind(){return InheritanceKindEEnum;}
		public EEnum getPostfixExpressionKind(){return PostfixExpressionKindEEnum;}
		public EEnum getPrefixExpressionKind(){return PrefixExpressionKindEEnum;}
		public EEnum getVisibilityKind(){return VisibilityKindEEnum;}
		
		public static class Literals{
			public final static EClass ASTNODE = Java_PackageImpl.eINSTANCE.getASTNode();
			
			public final static EReference ASTNODE__COMMENTS = Java_PackageImpl.eINSTANCE.getASTNode_Comments();
			public final static EReference ASTNODE__ORIGINAL_COMPILATION_UNIT = Java_PackageImpl.eINSTANCE.getASTNode_OriginalCompilationUnit();
			public final static EReference ASTNODE__ORIGINAL_CLASS_FILE = Java_PackageImpl.eINSTANCE.getASTNode_OriginalClassFile();
			
			public final static EClass NAMEDELEMENT = Java_PackageImpl.eINSTANCE.getNamedElement();
			
			public final static EReference NAMED_ELEMENT__USAGES_IN_IMPORTS = Java_PackageImpl.eINSTANCE.getNamedElement_UsagesInImports();
			
			public final static EAttribute NAMED_ELEMENT__NAME = Java_PackageImpl.eINSTANCE.getNamedElement_Name();
			public final static EAttribute NAMED_ELEMENT__PROXY = Java_PackageImpl.eINSTANCE.getNamedElement_Proxy();
			public final static EClass BODYDECLARATION = Java_PackageImpl.eINSTANCE.getBodyDeclaration();
			
			public final static EReference BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION = Java_PackageImpl.eINSTANCE.getBodyDeclaration_AbstractTypeDeclaration();
			public final static EReference BODY_DECLARATION__ANNOTATIONS = Java_PackageImpl.eINSTANCE.getBodyDeclaration_Annotations();
			public final static EReference BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = Java_PackageImpl.eINSTANCE.getBodyDeclaration_AnonymousClassDeclarationOwner();
			public final static EReference BODY_DECLARATION__MODIFIER = Java_PackageImpl.eINSTANCE.getBodyDeclaration_Modifier();
			
			public final static EClass ABSTRACTMETHODDECLARATION = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration();
			
			public final static EReference ABSTRACT_METHOD_DECLARATION__BODY = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Body();
			public final static EReference ABSTRACT_METHOD_DECLARATION__PARAMETERS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Parameters();
			public final static EReference ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_ThrownExceptions();
			public final static EReference ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_TypeParameters();
			public final static EReference ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_UsagesInDocComments();
			public final static EReference ABSTRACT_METHOD_DECLARATION__USAGES = Java_PackageImpl.eINSTANCE.getAbstractMethodDeclaration_Usages();
			
			public final static EClass ABSTRACTMETHODINVOCATION = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation();
			
			public final static EReference ABSTRACT_METHOD_INVOCATION__METHOD = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_Method();
			public final static EReference ABSTRACT_METHOD_INVOCATION__ARGUMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_Arguments();
			public final static EReference ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = Java_PackageImpl.eINSTANCE.getAbstractMethodInvocation_TypeArguments();
			
			public final static EClass TYPE = Java_PackageImpl.eINSTANCE.getType();
			
			public final static EReference TYPE__USAGES_IN_TYPE_ACCESS = Java_PackageImpl.eINSTANCE.getType_UsagesInTypeAccess();
			
			public final static EClass ABSTRACTTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration();
			
			public final static EReference ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations();
			public final static EReference ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_CommentsBeforeBody();
			public final static EReference ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_CommentsAfterBody();
			public final static EReference ABSTRACT_TYPE_DECLARATION__PACKAGE = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_Package();
			public final static EReference ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES = Java_PackageImpl.eINSTANCE.getAbstractTypeDeclaration_SuperInterfaces();
			
			public final static EClass EXPRESSION = Java_PackageImpl.eINSTANCE.getExpression();
			
			
			public final static EClass ABSTRACTTYPEQUALIFIEDEXPRESSION = Java_PackageImpl.eINSTANCE.getAbstractTypeQualifiedExpression();
			
			public final static EReference ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER = Java_PackageImpl.eINSTANCE.getAbstractTypeQualifiedExpression_Qualifier();
			
			public final static EClass ABSTRACTVARIABLESCONTAINER = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer();
			
			public final static EReference ABSTRACT_VARIABLES_CONTAINER__TYPE = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer_Type();
			public final static EReference ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS = Java_PackageImpl.eINSTANCE.getAbstractVariablesContainer_Fragments();
			
			public final static EClass ANNOTATION = Java_PackageImpl.eINSTANCE.getAnnotation();
			
			public final static EReference ANNOTATION__TYPE = Java_PackageImpl.eINSTANCE.getAnnotation_Type();
			public final static EReference ANNOTATION__VALUES = Java_PackageImpl.eINSTANCE.getAnnotation_Values();
			
			public final static EClass ARCHIVE = Java_PackageImpl.eINSTANCE.getArchive();
			
			public final static EReference ARCHIVE__CLASS_FILES = Java_PackageImpl.eINSTANCE.getArchive_ClassFiles();
			public final static EReference ARCHIVE__MANIFEST = Java_PackageImpl.eINSTANCE.getArchive_Manifest();
			
			public final static EAttribute ARCHIVE__ORIGINAL_FILE_PATH = Java_PackageImpl.eINSTANCE.getArchive_OriginalFilePath();
			public final static EClass STATEMENT = Java_PackageImpl.eINSTANCE.getStatement();
			
			
			public final static EClass ASSERTSTATEMENT = Java_PackageImpl.eINSTANCE.getAssertStatement();
			
			public final static EReference ASSERT_STATEMENT__MESSAGE = Java_PackageImpl.eINSTANCE.getAssertStatement_Message();
			public final static EReference ASSERT_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getAssertStatement_Expression();
			
			public final static EClass ANNOTATIONMEMBERVALUEPAIR = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair();
			
			public final static EReference ANNOTATION_MEMBER_VALUE_PAIR__MEMBER = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair_Member();
			public final static EReference ANNOTATION_MEMBER_VALUE_PAIR__VALUE = Java_PackageImpl.eINSTANCE.getAnnotationMemberValuePair_Value();
			
			public final static EClass ANNOTATIONTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getAnnotationTypeDeclaration();
			
			
			public final static EClass ANNOTATIONTYPEMEMBERDECLARATION = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration();
			
			public final static EReference ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Default();
			public final static EReference ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Type();
			public final static EReference ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES = Java_PackageImpl.eINSTANCE.getAnnotationTypeMemberDeclaration_Usages();
			
			public final static EClass ANONYMOUSCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration();
			
			public final static EReference ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations();
			public final static EReference ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION = Java_PackageImpl.eINSTANCE.getAnonymousClassDeclaration_ClassInstanceCreation();
			
			public final static EClass ARRAYACCESS = Java_PackageImpl.eINSTANCE.getArrayAccess();
			
			public final static EReference ARRAY_ACCESS__ARRAY = Java_PackageImpl.eINSTANCE.getArrayAccess_Array();
			public final static EReference ARRAY_ACCESS__INDEX = Java_PackageImpl.eINSTANCE.getArrayAccess_Index();
			
			public final static EClass ARRAYCREATION = Java_PackageImpl.eINSTANCE.getArrayCreation();
			
			public final static EReference ARRAY_CREATION__DIMENSIONS = Java_PackageImpl.eINSTANCE.getArrayCreation_Dimensions();
			public final static EReference ARRAY_CREATION__INITIALIZER = Java_PackageImpl.eINSTANCE.getArrayCreation_Initializer();
			public final static EReference ARRAY_CREATION__TYPE = Java_PackageImpl.eINSTANCE.getArrayCreation_Type();
			
			public final static EClass ARRAYINITIALIZER = Java_PackageImpl.eINSTANCE.getArrayInitializer();
			
			public final static EReference ARRAY_INITIALIZER__EXPRESSIONS = Java_PackageImpl.eINSTANCE.getArrayInitializer_Expressions();
			
			public final static EClass ARRAYLENGTHACCESS = Java_PackageImpl.eINSTANCE.getArrayLengthAccess();
			
			public final static EReference ARRAY_LENGTH_ACCESS__ARRAY = Java_PackageImpl.eINSTANCE.getArrayLengthAccess_Array();
			
			public final static EClass ARRAYTYPE = Java_PackageImpl.eINSTANCE.getArrayType();
			
			public final static EReference ARRAY_TYPE__ELEMENT_TYPE = Java_PackageImpl.eINSTANCE.getArrayType_ElementType();
			
			public final static EAttribute ARRAY_TYPE__DIMENSIONS = Java_PackageImpl.eINSTANCE.getArrayType_Dimensions();
			public final static EClass ASSIGNMENT = Java_PackageImpl.eINSTANCE.getAssignment();
			
			public final static EReference ASSIGNMENT__LEFT_HAND_SIDE = Java_PackageImpl.eINSTANCE.getAssignment_LeftHandSide();
			public final static EReference ASSIGNMENT__RIGHT_HAND_SIDE = Java_PackageImpl.eINSTANCE.getAssignment_RightHandSide();
			
			public final static EAttribute ASSIGNMENT__OPERATOR = Java_PackageImpl.eINSTANCE.getAssignment_Operator();
			public final static EClass BOOLEANLITERAL = Java_PackageImpl.eINSTANCE.getBooleanLiteral();
			
			
			public final static EAttribute BOOLEAN_LITERAL__VALUE = Java_PackageImpl.eINSTANCE.getBooleanLiteral_Value();
			public final static EClass COMMENT = Java_PackageImpl.eINSTANCE.getComment();
			
			
			public final static EAttribute COMMENT__CONTENT = Java_PackageImpl.eINSTANCE.getComment_Content();
			public final static EAttribute COMMENT__ENCLOSED_BY_PARENT = Java_PackageImpl.eINSTANCE.getComment_EnclosedByParent();
			public final static EAttribute COMMENT__PREFIX_OF_PARENT = Java_PackageImpl.eINSTANCE.getComment_PrefixOfParent();
			public final static EClass BLOCKCOMMENT = Java_PackageImpl.eINSTANCE.getBlockComment();
			
			
			public final static EClass BLOCK = Java_PackageImpl.eINSTANCE.getBlock();
			
			public final static EReference BLOCK__STATEMENTS = Java_PackageImpl.eINSTANCE.getBlock_Statements();
			
			public final static EClass BREAKSTATEMENT = Java_PackageImpl.eINSTANCE.getBreakStatement();
			
			public final static EReference BREAK_STATEMENT__LABEL = Java_PackageImpl.eINSTANCE.getBreakStatement_Label();
			
			public final static EClass CASTEXPRESSION = Java_PackageImpl.eINSTANCE.getCastExpression();
			
			public final static EReference CAST_EXPRESSION__EXPRESSION = Java_PackageImpl.eINSTANCE.getCastExpression_Expression();
			public final static EReference CAST_EXPRESSION__TYPE = Java_PackageImpl.eINSTANCE.getCastExpression_Type();
			
			public final static EClass CATCHCLAUSE = Java_PackageImpl.eINSTANCE.getCatchClause();
			
			public final static EReference CATCH_CLAUSE__EXCEPTION = Java_PackageImpl.eINSTANCE.getCatchClause_Exception();
			public final static EReference CATCH_CLAUSE__BODY = Java_PackageImpl.eINSTANCE.getCatchClause_Body();
			
			public final static EClass CHARACTERLITERAL = Java_PackageImpl.eINSTANCE.getCharacterLiteral();
			
			
			public final static EAttribute CHARACTER_LITERAL__ESCAPED_VALUE = Java_PackageImpl.eINSTANCE.getCharacterLiteral_EscapedValue();
			public final static EClass CLASSFILE = Java_PackageImpl.eINSTANCE.getClassFile();
			
			public final static EReference CLASS_FILE__TYPE = Java_PackageImpl.eINSTANCE.getClassFile_Type();
			public final static EReference CLASS_FILE__ATTACHED_SOURCE = Java_PackageImpl.eINSTANCE.getClassFile_AttachedSource();
			public final static EReference CLASS_FILE__PACKAGE = Java_PackageImpl.eINSTANCE.getClassFile_Package();
			
			public final static EAttribute CLASS_FILE__ORIGINAL_FILE_PATH = Java_PackageImpl.eINSTANCE.getClassFile_OriginalFilePath();
			public final static EClass CLASSINSTANCECREATION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation();
			
			public final static EReference CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_AnonymousClassDeclaration();
			public final static EReference CLASS_INSTANCE_CREATION__EXPRESSION = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_Expression();
			public final static EReference CLASS_INSTANCE_CREATION__TYPE = Java_PackageImpl.eINSTANCE.getClassInstanceCreation_Type();
			
			public final static EClass CONSTRUCTORDECLARATION = Java_PackageImpl.eINSTANCE.getConstructorDeclaration();
			
			
			public final static EClass CONDITIONALEXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression();
			
			public final static EReference CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_ElseExpression();
			public final static EReference CONDITIONAL_EXPRESSION__EXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_Expression();
			public final static EReference CONDITIONAL_EXPRESSION__THEN_EXPRESSION = Java_PackageImpl.eINSTANCE.getConditionalExpression_ThenExpression();
			
			public final static EClass CONSTRUCTORINVOCATION = Java_PackageImpl.eINSTANCE.getConstructorInvocation();
			
			
			public final static EClass TYPEDECLARATION = Java_PackageImpl.eINSTANCE.getTypeDeclaration();
			
			public final static EReference TYPE_DECLARATION__TYPE_PARAMETERS = Java_PackageImpl.eINSTANCE.getTypeDeclaration_TypeParameters();
			
			public final static EClass CLASSDECLARATION = Java_PackageImpl.eINSTANCE.getClassDeclaration();
			
			public final static EReference CLASS_DECLARATION__SUPER_CLASS = Java_PackageImpl.eINSTANCE.getClassDeclaration_SuperClass();
			
			public final static EClass COMPILATIONUNIT = Java_PackageImpl.eINSTANCE.getCompilationUnit();
			
			public final static EReference COMPILATION_UNIT__COMMENT_LIST = Java_PackageImpl.eINSTANCE.getCompilationUnit_CommentList();
			public final static EReference COMPILATION_UNIT__IMPORTS = Java_PackageImpl.eINSTANCE.getCompilationUnit_Imports();
			public final static EReference COMPILATION_UNIT__PACKAGE = Java_PackageImpl.eINSTANCE.getCompilationUnit_Package();
			public final static EReference COMPILATION_UNIT__TYPES = Java_PackageImpl.eINSTANCE.getCompilationUnit_Types();
			
			public final static EAttribute COMPILATION_UNIT__ORIGINAL_FILE_PATH = Java_PackageImpl.eINSTANCE.getCompilationUnit_OriginalFilePath();
			public final static EClass CONTINUESTATEMENT = Java_PackageImpl.eINSTANCE.getContinueStatement();
			
			public final static EReference CONTINUE_STATEMENT__LABEL = Java_PackageImpl.eINSTANCE.getContinueStatement_Label();
			
			public final static EClass DOSTATEMENT = Java_PackageImpl.eINSTANCE.getDoStatement();
			
			public final static EReference DO_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getDoStatement_Expression();
			public final static EReference DO_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getDoStatement_Body();
			
			public final static EClass EMPTYSTATEMENT = Java_PackageImpl.eINSTANCE.getEmptyStatement();
			
			
			public final static EClass ENHANCEDFORSTATEMENT = Java_PackageImpl.eINSTANCE.getEnhancedForStatement();
			
			public final static EReference ENHANCED_FOR_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Body();
			public final static EReference ENHANCED_FOR_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Expression();
			public final static EReference ENHANCED_FOR_STATEMENT__PARAMETER = Java_PackageImpl.eINSTANCE.getEnhancedForStatement_Parameter();
			
			public final static EClass VARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getVariableDeclaration();
			
			public final static EReference VARIABLE_DECLARATION__INITIALIZER = Java_PackageImpl.eINSTANCE.getVariableDeclaration_Initializer();
			public final static EReference VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = Java_PackageImpl.eINSTANCE.getVariableDeclaration_UsageInVariableAccess();
			
			public final static EAttribute VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = Java_PackageImpl.eINSTANCE.getVariableDeclaration_ExtraArrayDimensions();
			public final static EClass ENUMCONSTANTDECLARATION = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration();
			
			public final static EReference ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration_AnonymousClassDeclaration();
			public final static EReference ENUM_CONSTANT_DECLARATION__ARGUMENTS = Java_PackageImpl.eINSTANCE.getEnumConstantDeclaration_Arguments();
			
			public final static EClass ENUMDECLARATION = Java_PackageImpl.eINSTANCE.getEnumDeclaration();
			
			public final static EReference ENUM_DECLARATION__ENUM_CONSTANTS = Java_PackageImpl.eINSTANCE.getEnumDeclaration_EnumConstants();
			
			public final static EClass EXPRESSIONSTATEMENT = Java_PackageImpl.eINSTANCE.getExpressionStatement();
			
			public final static EReference EXPRESSION_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getExpressionStatement_Expression();
			
			public final static EClass FIELDACCESS = Java_PackageImpl.eINSTANCE.getFieldAccess();
			
			public final static EReference FIELD_ACCESS__FIELD = Java_PackageImpl.eINSTANCE.getFieldAccess_Field();
			public final static EReference FIELD_ACCESS__EXPRESSION = Java_PackageImpl.eINSTANCE.getFieldAccess_Expression();
			
			public final static EClass FIELDDECLARATION = Java_PackageImpl.eINSTANCE.getFieldDeclaration();
			
			
			public final static EClass FORSTATEMENT = Java_PackageImpl.eINSTANCE.getForStatement();
			
			public final static EReference FOR_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getForStatement_Expression();
			public final static EReference FOR_STATEMENT__UPDATERS = Java_PackageImpl.eINSTANCE.getForStatement_Updaters();
			public final static EReference FOR_STATEMENT__INITIALIZERS = Java_PackageImpl.eINSTANCE.getForStatement_Initializers();
			public final static EReference FOR_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getForStatement_Body();
			
			public final static EClass IFSTATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement();
			
			public final static EReference IF_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getIfStatement_Expression();
			public final static EReference IF_STATEMENT__THEN_STATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement_ThenStatement();
			public final static EReference IF_STATEMENT__ELSE_STATEMENT = Java_PackageImpl.eINSTANCE.getIfStatement_ElseStatement();
			
			public final static EClass IMPORTDECLARATION = Java_PackageImpl.eINSTANCE.getImportDeclaration();
			
			public final static EReference IMPORT_DECLARATION__IMPORTED_ELEMENT = Java_PackageImpl.eINSTANCE.getImportDeclaration_ImportedElement();
			
			public final static EAttribute IMPORT_DECLARATION__STATIC = Java_PackageImpl.eINSTANCE.getImportDeclaration_Static();
			public final static EClass INFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getInfixExpression();
			
			public final static EReference INFIX_EXPRESSION__RIGHT_OPERAND = Java_PackageImpl.eINSTANCE.getInfixExpression_RightOperand();
			public final static EReference INFIX_EXPRESSION__LEFT_OPERAND = Java_PackageImpl.eINSTANCE.getInfixExpression_LeftOperand();
			public final static EReference INFIX_EXPRESSION__EXTENDED_OPERANDS = Java_PackageImpl.eINSTANCE.getInfixExpression_ExtendedOperands();
			
			public final static EAttribute INFIX_EXPRESSION__OPERATOR = Java_PackageImpl.eINSTANCE.getInfixExpression_Operator();
			public final static EClass INITIALIZER = Java_PackageImpl.eINSTANCE.getInitializer();
			
			public final static EReference INITIALIZER__BODY = Java_PackageImpl.eINSTANCE.getInitializer_Body();
			
			public final static EClass INSTANCEOFEXPRESSION = Java_PackageImpl.eINSTANCE.getInstanceofExpression();
			
			public final static EReference INSTANCEOF_EXPRESSION__RIGHT_OPERAND = Java_PackageImpl.eINSTANCE.getInstanceofExpression_RightOperand();
			public final static EReference INSTANCEOF_EXPRESSION__LEFT_OPERAND = Java_PackageImpl.eINSTANCE.getInstanceofExpression_LeftOperand();
			
			public final static EClass INTERFACEDECLARATION = Java_PackageImpl.eINSTANCE.getInterfaceDeclaration();
			
			
			public final static EClass JAVADOC = Java_PackageImpl.eINSTANCE.getJavadoc();
			
			public final static EReference JAVADOC__TAGS = Java_PackageImpl.eINSTANCE.getJavadoc_Tags();
			
			public final static EClass LABELEDSTATEMENT = Java_PackageImpl.eINSTANCE.getLabeledStatement();
			
			public final static EReference LABELED_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getLabeledStatement_Body();
			public final static EReference LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS = Java_PackageImpl.eINSTANCE.getLabeledStatement_UsagesInBreakStatements();
			public final static EReference LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS = Java_PackageImpl.eINSTANCE.getLabeledStatement_UsagesInContinueStatements();
			
			public final static EClass LINECOMMENT = Java_PackageImpl.eINSTANCE.getLineComment();
			
			
			public final static EClass MANIFEST = Java_PackageImpl.eINSTANCE.getManifest();
			
			public final static EReference MANIFEST__MAIN_ATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifest_MainAttributes();
			public final static EReference MANIFEST__ENTRY_ATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifest_EntryAttributes();
			
			public final static EClass MANIFESTATTRIBUTE = Java_PackageImpl.eINSTANCE.getManifestAttribute();
			
			
			public final static EAttribute MANIFEST_ATTRIBUTE__KEY = Java_PackageImpl.eINSTANCE.getManifestAttribute_Key();
			public final static EAttribute MANIFEST_ATTRIBUTE__VALUE = Java_PackageImpl.eINSTANCE.getManifestAttribute_Value();
			public final static EClass MANIFESTENTRY = Java_PackageImpl.eINSTANCE.getManifestEntry();
			
			public final static EReference MANIFEST_ENTRY__ATTRIBUTES = Java_PackageImpl.eINSTANCE.getManifestEntry_Attributes();
			
			public final static EAttribute MANIFEST_ENTRY__NAME = Java_PackageImpl.eINSTANCE.getManifestEntry_Name();
			public final static EClass MEMBERREF = Java_PackageImpl.eINSTANCE.getMemberRef();
			
			public final static EReference MEMBER_REF__MEMBER = Java_PackageImpl.eINSTANCE.getMemberRef_Member();
			public final static EReference MEMBER_REF__QUALIFIER = Java_PackageImpl.eINSTANCE.getMemberRef_Qualifier();
			
			public final static EClass METHODDECLARATION = Java_PackageImpl.eINSTANCE.getMethodDeclaration();
			
			public final static EReference METHOD_DECLARATION__RETURN_TYPE = Java_PackageImpl.eINSTANCE.getMethodDeclaration_ReturnType();
			public final static EReference METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = Java_PackageImpl.eINSTANCE.getMethodDeclaration_RedefinedMethodDeclaration();
			public final static EReference METHOD_DECLARATION__REDEFINITIONS = Java_PackageImpl.eINSTANCE.getMethodDeclaration_Redefinitions();
			
			public final static EAttribute METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = Java_PackageImpl.eINSTANCE.getMethodDeclaration_ExtraArrayDimensions();
			public final static EClass METHODINVOCATION = Java_PackageImpl.eINSTANCE.getMethodInvocation();
			
			public final static EReference METHOD_INVOCATION__EXPRESSION = Java_PackageImpl.eINSTANCE.getMethodInvocation_Expression();
			
			public final static EClass METHODREF = Java_PackageImpl.eINSTANCE.getMethodRef();
			
			public final static EReference METHOD_REF__METHOD = Java_PackageImpl.eINSTANCE.getMethodRef_Method();
			public final static EReference METHOD_REF__QUALIFIER = Java_PackageImpl.eINSTANCE.getMethodRef_Qualifier();
			public final static EReference METHOD_REF__PARAMETERS = Java_PackageImpl.eINSTANCE.getMethodRef_Parameters();
			
			public final static EClass METHODREFPARAMETER = Java_PackageImpl.eINSTANCE.getMethodRefParameter();
			
			public final static EReference METHOD_REF_PARAMETER__TYPE = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Type();
			
			public final static EAttribute METHOD_REF_PARAMETER__NAME = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Name();
			public final static EAttribute METHOD_REF_PARAMETER__VARARGS = Java_PackageImpl.eINSTANCE.getMethodRefParameter_Varargs();
			public final static EClass MODEL = Java_PackageImpl.eINSTANCE.getModel();
			
			public final static EReference MODEL__OWNED_ELEMENTS = Java_PackageImpl.eINSTANCE.getModel_OwnedElements();
			public final static EReference MODEL__ORPHAN_TYPES = Java_PackageImpl.eINSTANCE.getModel_OrphanTypes();
			public final static EReference MODEL__UNRESOLVED_ITEMS = Java_PackageImpl.eINSTANCE.getModel_UnresolvedItems();
			public final static EReference MODEL__COMPILATION_UNITS = Java_PackageImpl.eINSTANCE.getModel_CompilationUnits();
			public final static EReference MODEL__CLASS_FILES = Java_PackageImpl.eINSTANCE.getModel_ClassFiles();
			public final static EReference MODEL__ARCHIVES = Java_PackageImpl.eINSTANCE.getModel_Archives();
			
			public final static EAttribute MODEL__NAME = Java_PackageImpl.eINSTANCE.getModel_Name();
			public final static EClass MODIFIER = Java_PackageImpl.eINSTANCE.getModifier();
			
			public final static EReference MODIFIER__BODY_DECLARATION = Java_PackageImpl.eINSTANCE.getModifier_BodyDeclaration();
			public final static EReference MODIFIER__SINGLE_VARIABLE_DECLARATION = Java_PackageImpl.eINSTANCE.getModifier_SingleVariableDeclaration();
			public final static EReference MODIFIER__VARIABLE_DECLARATION_STATEMENT = Java_PackageImpl.eINSTANCE.getModifier_VariableDeclarationStatement();
			public final static EReference MODIFIER__VARIABLE_DECLARATION_EXPRESSION = Java_PackageImpl.eINSTANCE.getModifier_VariableDeclarationExpression();
			
			public final static EAttribute MODIFIER__VISIBILITY = Java_PackageImpl.eINSTANCE.getModifier_Visibility();
			public final static EAttribute MODIFIER__INHERITANCE = Java_PackageImpl.eINSTANCE.getModifier_Inheritance();
			public final static EAttribute MODIFIER__STATIC = Java_PackageImpl.eINSTANCE.getModifier_Static();
			public final static EAttribute MODIFIER__TRANSIENT = Java_PackageImpl.eINSTANCE.getModifier_Transient();
			public final static EAttribute MODIFIER__VOLATILE = Java_PackageImpl.eINSTANCE.getModifier_Volatile();
			public final static EAttribute MODIFIER__NATIVE = Java_PackageImpl.eINSTANCE.getModifier_Native();
			public final static EAttribute MODIFIER__STRICTFP = Java_PackageImpl.eINSTANCE.getModifier_Strictfp();
			public final static EAttribute MODIFIER__SYNCHRONIZED = Java_PackageImpl.eINSTANCE.getModifier_Synchronized();
			public final static EClass NAMESPACEACCESS = Java_PackageImpl.eINSTANCE.getNamespaceAccess();
			
			
			public final static EClass NUMBERLITERAL = Java_PackageImpl.eINSTANCE.getNumberLiteral();
			
			
			public final static EAttribute NUMBER_LITERAL__TOKEN_VALUE = Java_PackageImpl.eINSTANCE.getNumberLiteral_TokenValue();
			public final static EClass NULLLITERAL = Java_PackageImpl.eINSTANCE.getNullLiteral();
			
			
			public final static EClass PACKAGE = Java_PackageImpl.eINSTANCE.getPackage();
			
			public final static EReference PACKAGE__OWNED_ELEMENTS = Java_PackageImpl.eINSTANCE.getPackage_OwnedElements();
			public final static EReference PACKAGE__MODEL = Java_PackageImpl.eINSTANCE.getPackage_Model();
			public final static EReference PACKAGE__OWNED_PACKAGES = Java_PackageImpl.eINSTANCE.getPackage_OwnedPackages();
			public final static EReference PACKAGE__PACKAGE = Java_PackageImpl.eINSTANCE.getPackage_Package();
			public final static EReference PACKAGE__USAGES_IN_PACKAGE_ACCESS = Java_PackageImpl.eINSTANCE.getPackage_UsagesInPackageAccess();
			
			public final static EClass PACKAGEACCESS = Java_PackageImpl.eINSTANCE.getPackageAccess();
			
			public final static EReference PACKAGE_ACCESS__PACKAGE = Java_PackageImpl.eINSTANCE.getPackageAccess_Package();
			public final static EReference PACKAGE_ACCESS__QUALIFIER = Java_PackageImpl.eINSTANCE.getPackageAccess_Qualifier();
			
			public final static EClass PARAMETERIZEDTYPE = Java_PackageImpl.eINSTANCE.getParameterizedType();
			
			public final static EReference PARAMETERIZED_TYPE__TYPE = Java_PackageImpl.eINSTANCE.getParameterizedType_Type();
			public final static EReference PARAMETERIZED_TYPE__TYPE_ARGUMENTS = Java_PackageImpl.eINSTANCE.getParameterizedType_TypeArguments();
			
			public final static EClass PARENTHESIZEDEXPRESSION = Java_PackageImpl.eINSTANCE.getParenthesizedExpression();
			
			public final static EReference PARENTHESIZED_EXPRESSION__EXPRESSION = Java_PackageImpl.eINSTANCE.getParenthesizedExpression_Expression();
			
			public final static EClass POSTFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getPostfixExpression();
			
			public final static EReference POSTFIX_EXPRESSION__OPERAND = Java_PackageImpl.eINSTANCE.getPostfixExpression_Operand();
			
			public final static EAttribute POSTFIX_EXPRESSION__OPERATOR = Java_PackageImpl.eINSTANCE.getPostfixExpression_Operator();
			public final static EClass PREFIXEXPRESSION = Java_PackageImpl.eINSTANCE.getPrefixExpression();
			
			public final static EReference PREFIX_EXPRESSION__OPERAND = Java_PackageImpl.eINSTANCE.getPrefixExpression_Operand();
			
			public final static EAttribute PREFIX_EXPRESSION__OPERATOR = Java_PackageImpl.eINSTANCE.getPrefixExpression_Operator();
			public final static EClass PRIMITIVETYPE = Java_PackageImpl.eINSTANCE.getPrimitiveType();
			
			
			public final static EClass PRIMITIVETYPEBOOLEAN = Java_PackageImpl.eINSTANCE.getPrimitiveTypeBoolean();
			
			
			public final static EClass PRIMITIVETYPEBYTE = Java_PackageImpl.eINSTANCE.getPrimitiveTypeByte();
			
			
			public final static EClass PRIMITIVETYPECHAR = Java_PackageImpl.eINSTANCE.getPrimitiveTypeChar();
			
			
			public final static EClass PRIMITIVETYPEDOUBLE = Java_PackageImpl.eINSTANCE.getPrimitiveTypeDouble();
			
			
			public final static EClass PRIMITIVETYPESHORT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeShort();
			
			
			public final static EClass PRIMITIVETYPEFLOAT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeFloat();
			
			
			public final static EClass PRIMITIVETYPEINT = Java_PackageImpl.eINSTANCE.getPrimitiveTypeInt();
			
			
			public final static EClass PRIMITIVETYPELONG = Java_PackageImpl.eINSTANCE.getPrimitiveTypeLong();
			
			
			public final static EClass PRIMITIVETYPEVOID = Java_PackageImpl.eINSTANCE.getPrimitiveTypeVoid();
			
			
			public final static EClass RETURNSTATEMENT = Java_PackageImpl.eINSTANCE.getReturnStatement();
			
			public final static EReference RETURN_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getReturnStatement_Expression();
			
			public final static EClass SINGLEVARIABLEACCESS = Java_PackageImpl.eINSTANCE.getSingleVariableAccess();
			
			public final static EReference SINGLE_VARIABLE_ACCESS__VARIABLE = Java_PackageImpl.eINSTANCE.getSingleVariableAccess_Variable();
			public final static EReference SINGLE_VARIABLE_ACCESS__QUALIFIER = Java_PackageImpl.eINSTANCE.getSingleVariableAccess_Qualifier();
			
			public final static EClass SINGLEVARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration();
			
			public final static EReference SINGLE_VARIABLE_DECLARATION__MODIFIER = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Modifier();
			public final static EReference SINGLE_VARIABLE_DECLARATION__TYPE = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Type();
			public final static EReference SINGLE_VARIABLE_DECLARATION__ANNOTATIONS = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Annotations();
			public final static EReference SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_MethodDeclaration();
			public final static EReference SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_CatchClause();
			public final static EReference SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_EnhancedForStatement();
			
			public final static EAttribute SINGLE_VARIABLE_DECLARATION__VARARGS = Java_PackageImpl.eINSTANCE.getSingleVariableDeclaration_Varargs();
			public final static EClass STRINGLITERAL = Java_PackageImpl.eINSTANCE.getStringLiteral();
			
			
			public final static EAttribute STRING_LITERAL__ESCAPED_VALUE = Java_PackageImpl.eINSTANCE.getStringLiteral_EscapedValue();
			public final static EClass SUPERCONSTRUCTORINVOCATION = Java_PackageImpl.eINSTANCE.getSuperConstructorInvocation();
			
			public final static EReference SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = Java_PackageImpl.eINSTANCE.getSuperConstructorInvocation_Expression();
			
			public final static EClass SUPERFIELDACCESS = Java_PackageImpl.eINSTANCE.getSuperFieldAccess();
			
			public final static EReference SUPER_FIELD_ACCESS__FIELD = Java_PackageImpl.eINSTANCE.getSuperFieldAccess_Field();
			
			public final static EClass SUPERMETHODINVOCATION = Java_PackageImpl.eINSTANCE.getSuperMethodInvocation();
			
			
			public final static EClass SWITCHCASE = Java_PackageImpl.eINSTANCE.getSwitchCase();
			
			public final static EReference SWITCH_CASE__EXPRESSION = Java_PackageImpl.eINSTANCE.getSwitchCase_Expression();
			
			public final static EAttribute SWITCH_CASE__DEFAULT = Java_PackageImpl.eINSTANCE.getSwitchCase_Default();
			public final static EClass SWITCHSTATEMENT = Java_PackageImpl.eINSTANCE.getSwitchStatement();
			
			public final static EReference SWITCH_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getSwitchStatement_Expression();
			public final static EReference SWITCH_STATEMENT__STATEMENTS = Java_PackageImpl.eINSTANCE.getSwitchStatement_Statements();
			
			public final static EClass SYNCHRONIZEDSTATEMENT = Java_PackageImpl.eINSTANCE.getSynchronizedStatement();
			
			public final static EReference SYNCHRONIZED_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getSynchronizedStatement_Body();
			public final static EReference SYNCHRONIZED_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getSynchronizedStatement_Expression();
			
			public final static EClass TAGELEMENT = Java_PackageImpl.eINSTANCE.getTagElement();
			
			public final static EReference TAG_ELEMENT__FRAGMENTS = Java_PackageImpl.eINSTANCE.getTagElement_Fragments();
			
			public final static EAttribute TAG_ELEMENT__TAG_NAME = Java_PackageImpl.eINSTANCE.getTagElement_TagName();
			public final static EClass TEXTELEMENT = Java_PackageImpl.eINSTANCE.getTextElement();
			
			
			public final static EAttribute TEXT_ELEMENT__TEXT = Java_PackageImpl.eINSTANCE.getTextElement_Text();
			public final static EClass THISEXPRESSION = Java_PackageImpl.eINSTANCE.getThisExpression();
			
			
			public final static EClass THROWSTATEMENT = Java_PackageImpl.eINSTANCE.getThrowStatement();
			
			public final static EReference THROW_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getThrowStatement_Expression();
			
			public final static EClass TRYSTATEMENT = Java_PackageImpl.eINSTANCE.getTryStatement();
			
			public final static EReference TRY_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getTryStatement_Body();
			public final static EReference TRY_STATEMENT__FINALLY = Java_PackageImpl.eINSTANCE.getTryStatement_Finally();
			public final static EReference TRY_STATEMENT__CATCH_CLAUSES = Java_PackageImpl.eINSTANCE.getTryStatement_CatchClauses();
			
			public final static EClass TYPEACCESS = Java_PackageImpl.eINSTANCE.getTypeAccess();
			
			public final static EReference TYPE_ACCESS__TYPE = Java_PackageImpl.eINSTANCE.getTypeAccess_Type();
			public final static EReference TYPE_ACCESS__QUALIFIER = Java_PackageImpl.eINSTANCE.getTypeAccess_Qualifier();
			
			public final static EClass TYPEDECLARATIONSTATEMENT = Java_PackageImpl.eINSTANCE.getTypeDeclarationStatement();
			
			public final static EReference TYPE_DECLARATION_STATEMENT__DECLARATION = Java_PackageImpl.eINSTANCE.getTypeDeclarationStatement_Declaration();
			
			public final static EClass TYPELITERAL = Java_PackageImpl.eINSTANCE.getTypeLiteral();
			
			public final static EReference TYPE_LITERAL__TYPE = Java_PackageImpl.eINSTANCE.getTypeLiteral_Type();
			
			public final static EClass TYPEPARAMETER = Java_PackageImpl.eINSTANCE.getTypeParameter();
			
			public final static EReference TYPE_PARAMETER__BOUNDS = Java_PackageImpl.eINSTANCE.getTypeParameter_Bounds();
			
			public final static EClass UNRESOLVEDITEM = Java_PackageImpl.eINSTANCE.getUnresolvedItem();
			
			
			public final static EClass UNRESOLVEDITEMACCESS = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess();
			
			public final static EReference UNRESOLVED_ITEM_ACCESS__ELEMENT = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess_Element();
			public final static EReference UNRESOLVED_ITEM_ACCESS__QUALIFIER = Java_PackageImpl.eINSTANCE.getUnresolvedItemAccess_Qualifier();
			
			public final static EClass UNRESOLVEDANNOTATIONDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedAnnotationDeclaration();
			
			
			public final static EClass UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedAnnotationTypeMemberDeclaration();
			
			
			public final static EClass UNRESOLVEDCLASSDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedClassDeclaration();
			
			
			public final static EClass UNRESOLVEDENUMDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedEnumDeclaration();
			
			
			public final static EClass UNRESOLVEDINTERFACEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedInterfaceDeclaration();
			
			
			public final static EClass UNRESOLVEDLABELEDSTATEMENT = Java_PackageImpl.eINSTANCE.getUnresolvedLabeledStatement();
			
			
			public final static EClass UNRESOLVEDMETHODDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedMethodDeclaration();
			
			
			public final static EClass UNRESOLVEDSINGLEVARIABLEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedSingleVariableDeclaration();
			
			
			public final static EClass UNRESOLVEDTYPE = Java_PackageImpl.eINSTANCE.getUnresolvedType();
			
			
			public final static EClass UNRESOLVEDTYPEDECLARATION = Java_PackageImpl.eINSTANCE.getUnresolvedTypeDeclaration();
			
			
			public final static EClass VARIABLEDECLARATIONFRAGMENT = Java_PackageImpl.eINSTANCE.getVariableDeclarationFragment();
			
			public final static EReference VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER = Java_PackageImpl.eINSTANCE.getVariableDeclarationFragment_VariablesContainer();
			
			public final static EClass UNRESOLVEDVARIABLEDECLARATIONFRAGMENT = Java_PackageImpl.eINSTANCE.getUnresolvedVariableDeclarationFragment();
			
			
			public final static EClass VARIABLEDECLARATIONEXPRESSION = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression();
			
			public final static EReference VARIABLE_DECLARATION_EXPRESSION__MODIFIER = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression_Modifier();
			public final static EReference VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationExpression_Annotations();
			
			public final static EClass VARIABLEDECLARATIONSTATEMENT = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement();
			
			public final static EReference VARIABLE_DECLARATION_STATEMENT__MODIFIER = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_Modifier();
			public final static EReference VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_Annotations();
			
			public final static EAttribute VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS = Java_PackageImpl.eINSTANCE.getVariableDeclarationStatement_ExtraArrayDimensions();
			public final static EClass WILDCARDTYPE = Java_PackageImpl.eINSTANCE.getWildCardType();
			
			public final static EReference WILD_CARD_TYPE__BOUND = Java_PackageImpl.eINSTANCE.getWildCardType_Bound();
			
			public final static EAttribute WILD_CARD_TYPE__UPPER_BOUND = Java_PackageImpl.eINSTANCE.getWildCardType_UpperBound();
			public final static EClass WHILESTATEMENT = Java_PackageImpl.eINSTANCE.getWhileStatement();
			
			public final static EReference WHILE_STATEMENT__EXPRESSION = Java_PackageImpl.eINSTANCE.getWhileStatement_Expression();
			public final static EReference WHILE_STATEMENT__BODY = Java_PackageImpl.eINSTANCE.getWhileStatement_Body();
			
			public final static EEnum ASSIGNMENTKIND = Java_PackageImpl.eINSTANCE.getAssignmentKind();
			public final static EEnum INFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getInfixExpressionKind();
			public final static EEnum INHERITANCEKIND = Java_PackageImpl.eINSTANCE.getInheritanceKind();
			public final static EEnum POSTFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getPostfixExpressionKind();
			public final static EEnum PREFIXEXPRESSIONKIND = Java_PackageImpl.eINSTANCE.getPrefixExpressionKind();
			public final static EEnum VISIBILITYKIND = Java_PackageImpl.eINSTANCE.getVisibilityKind();
		}
 
}

