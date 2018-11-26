import {EFactoryImpl} from "ecore/EFactoryImpl";
import {EClass} from "ecore/EClass";
import {EDataType} from "ecore/EDataType";
import {EObject} from "ecore/EObject";
import {Archive} from "./Archive";
import {ArrayInitializerImpl} from "./ArrayInitializerImpl";
import {MemberRef} from "./MemberRef";
import {SynchronizedStatement} from "./SynchronizedStatement";
import {DoStatementImpl} from "./DoStatementImpl";
import {SingleVariableDeclarationImpl} from "./SingleVariableDeclarationImpl";
import {ArrayAccess} from "./ArrayAccess";
import {PrimitiveTypeDoubleImpl} from "./PrimitiveTypeDoubleImpl";
import {TryStatement} from "./TryStatement";
import {VariableDeclarationFragment} from "./VariableDeclarationFragment";
import {EnhancedForStatement} from "./EnhancedForStatement";
import {PrimitiveType} from "./PrimitiveType";
import {AnnotationTypeDeclarationImpl} from "./AnnotationTypeDeclarationImpl";
import {UnresolvedItemAccessImpl} from "./UnresolvedItemAccessImpl";
import {CompilationUnit} from "./CompilationUnit";
import {PrimitiveTypeCharImpl} from "./PrimitiveTypeCharImpl";
import {MemberRefImpl} from "./MemberRefImpl";
import {ClassFile} from "./ClassFile";
import {CatchClauseImpl} from "./CatchClauseImpl";
import {ManifestAttributeImpl} from "./ManifestAttributeImpl";
import {ManifestAttribute} from "./ManifestAttribute";
import {SuperFieldAccess} from "./SuperFieldAccess";
import {ArrayLengthAccess} from "./ArrayLengthAccess";
import {PostfixExpressionImpl} from "./PostfixExpressionImpl";
import {InstanceofExpressionImpl} from "./InstanceofExpressionImpl";
import {WildCardType} from "./WildCardType";
import {Initializer} from "./Initializer";
import {PrefixExpression} from "./PrefixExpression";
import {AbstractTypeQualifiedExpressionImpl} from "./AbstractTypeQualifiedExpressionImpl";
import {CommentImpl} from "./CommentImpl";
import {ArrayTypeImpl} from "./ArrayTypeImpl";
import {BodyDeclaration} from "./BodyDeclaration";
import {IfStatementImpl} from "./IfStatementImpl";
import {NullLiteral} from "./NullLiteral";
import {CastExpressionImpl} from "./CastExpressionImpl";
import {Java_PackageImpl} from "./Java_PackageImpl";
import {ArrayAccessImpl} from "./ArrayAccessImpl";
import {UnresolvedAnnotationTypeMemberDeclaration} from "./UnresolvedAnnotationTypeMemberDeclaration";
import {ParameterizedTypeImpl} from "./ParameterizedTypeImpl";
import {VariableDeclarationImpl} from "./VariableDeclarationImpl";
import {JavadocImpl} from "./JavadocImpl";
import {ConditionalExpressionImpl} from "./ConditionalExpressionImpl";
import {ParameterizedType} from "./ParameterizedType";
import {PrimitiveTypeFloatImpl} from "./PrimitiveTypeFloatImpl";
import {InfixExpressionKind} from "./InfixExpressionKind";
import {TypeLiteral} from "./TypeLiteral";
import {TextElementImpl} from "./TextElementImpl";
import {ContinueStatement} from "./ContinueStatement";
import {PrimitiveTypeLong} from "./PrimitiveTypeLong";
import {AnnotationMemberValuePair} from "./AnnotationMemberValuePair";
import {MethodRefImpl} from "./MethodRefImpl";
import {PackageAccess} from "./PackageAccess";
import {MethodDeclaration} from "./MethodDeclaration";
import {ParenthesizedExpressionImpl} from "./ParenthesizedExpressionImpl";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {Statement} from "./Statement";
import {UnresolvedItem} from "./UnresolvedItem";
import {AnnotationImpl} from "./AnnotationImpl";
import {BreakStatement} from "./BreakStatement";
import {LabeledStatementImpl} from "./LabeledStatementImpl";
import {ImportDeclaration} from "./ImportDeclaration";
import {SwitchCaseImpl} from "./SwitchCaseImpl";
import {BlockCommentImpl} from "./BlockCommentImpl";
import {SingleVariableAccess} from "./SingleVariableAccess";
import {CharacterLiteral} from "./CharacterLiteral";
import {PrimitiveTypeImpl} from "./PrimitiveTypeImpl";
import {UnresolvedSingleVariableDeclaration} from "./UnresolvedSingleVariableDeclaration";
import {UnresolvedTypeDeclarationImpl} from "./UnresolvedTypeDeclarationImpl";
import {LineComment} from "./LineComment";
import {EmptyStatementImpl} from "./EmptyStatementImpl";
import {TypeLiteralImpl} from "./TypeLiteralImpl";
import {UnresolvedClassDeclaration} from "./UnresolvedClassDeclaration";
import {EnumConstantDeclaration} from "./EnumConstantDeclaration";
import {PrefixExpressionKind} from "./PrefixExpressionKind";
import {InfixExpression} from "./InfixExpression";
import {UnresolvedType} from "./UnresolvedType";
import {PrimitiveTypeByteImpl} from "./PrimitiveTypeByteImpl";
import {TypeDeclarationStatementImpl} from "./TypeDeclarationStatementImpl";
import {AnonymousClassDeclarationImpl} from "./AnonymousClassDeclarationImpl";
import {BlockComment} from "./BlockComment";
import {UnresolvedMethodDeclarationImpl} from "./UnresolvedMethodDeclarationImpl";
import {UnresolvedTypeDeclaration} from "./UnresolvedTypeDeclaration";
import {ForStatementImpl} from "./ForStatementImpl";
import {SwitchStatementImpl} from "./SwitchStatementImpl";
import {AnnotationTypeMemberDeclarationImpl} from "./AnnotationTypeMemberDeclarationImpl";
import {PostfixExpressionKind} from "./PostfixExpressionKind";
import {ClassFileImpl} from "./ClassFileImpl";
import {PrimitiveTypeBoolean} from "./PrimitiveTypeBoolean";
import {SwitchCase} from "./SwitchCase";
import {SuperConstructorInvocationImpl} from "./SuperConstructorInvocationImpl";
import {FieldAccessImpl} from "./FieldAccessImpl";
import {PrimitiveTypeShortImpl} from "./PrimitiveTypeShortImpl";
import {EnumConstantDeclarationImpl} from "./EnumConstantDeclarationImpl";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
import {NamedElement} from "./NamedElement";
import {AbstractMethodDeclarationImpl} from "./AbstractMethodDeclarationImpl";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
import {UnresolvedEnumDeclarationImpl} from "./UnresolvedEnumDeclarationImpl";
import {DoStatement} from "./DoStatement";
import {MethodInvocationImpl} from "./MethodInvocationImpl";
import {NamedElementImpl} from "./NamedElementImpl";
import {WhileStatementImpl} from "./WhileStatementImpl";
import {UnresolvedAnnotationTypeMemberDeclarationImpl} from "./UnresolvedAnnotationTypeMemberDeclarationImpl";
import {UnresolvedLabeledStatementImpl} from "./UnresolvedLabeledStatementImpl";
import {NumberLiteralImpl} from "./NumberLiteralImpl";
import {UnresolvedEnumDeclaration} from "./UnresolvedEnumDeclaration";
import {FieldDeclaration} from "./FieldDeclaration";
import {MethodDeclarationImpl} from "./MethodDeclarationImpl";
import {PrimitiveTypeVoidImpl} from "./PrimitiveTypeVoidImpl";
import {UnresolvedInterfaceDeclarationImpl} from "./UnresolvedInterfaceDeclarationImpl";
import {TextElement} from "./TextElement";
import {VisibilityKind} from "./VisibilityKind";
import {ContinueStatementImpl} from "./ContinueStatementImpl";
import {ThrowStatement} from "./ThrowStatement";
import {AssertStatementImpl} from "./AssertStatementImpl";
import {ArrayLengthAccessImpl} from "./ArrayLengthAccessImpl";
import {ASTNodeImpl} from "./ASTNodeImpl";
import {ClassInstanceCreation} from "./ClassInstanceCreation";
import {ThrowStatementImpl} from "./ThrowStatementImpl";
import {InfixExpressionImpl} from "./InfixExpressionImpl";
import {StringLiteralImpl} from "./StringLiteralImpl";
import {ImportDeclarationImpl} from "./ImportDeclarationImpl";
import {VariableDeclarationExpression} from "./VariableDeclarationExpression";
import {MethodRefParameterImpl} from "./MethodRefParameterImpl";
import {BreakStatementImpl} from "./BreakStatementImpl";
import {PackageImpl} from "./PackageImpl";
import {ModifierImpl} from "./ModifierImpl";
import {ExpressionStatement} from "./ExpressionStatement";
import {ArrayCreation} from "./ArrayCreation";
import {ArrayInitializer} from "./ArrayInitializer";
import {AbstractVariablesContainerImpl} from "./AbstractVariablesContainerImpl";
import {ConstructorInvocationImpl} from "./ConstructorInvocationImpl";
import {TypeParameterImpl} from "./TypeParameterImpl";
import {AssignmentImpl} from "./AssignmentImpl";
import {EmptyStatement} from "./EmptyStatement";
import {Javadoc} from "./Javadoc";
import {ManifestImpl} from "./ManifestImpl";
import {TypeAccess} from "./TypeAccess";
import {SingleVariableAccessImpl} from "./SingleVariableAccessImpl";
import {Assignment} from "./Assignment";
import {IfStatement} from "./IfStatement";
import {PrimitiveTypeBooleanImpl} from "./PrimitiveTypeBooleanImpl";
import {TagElementImpl} from "./TagElementImpl";
import {ReturnStatement} from "./ReturnStatement";
import {UnresolvedClassDeclarationImpl} from "./UnresolvedClassDeclarationImpl";
import {TypeImpl} from "./TypeImpl";
import {ReturnStatementImpl} from "./ReturnStatementImpl";
import {NullLiteralImpl} from "./NullLiteralImpl";
import {CatchClause} from "./CatchClause";
import {UnresolvedVariableDeclarationFragment} from "./UnresolvedVariableDeclarationFragment";
import {PrefixExpressionImpl} from "./PrefixExpressionImpl";
import {PrimitiveTypeFloat} from "./PrimitiveTypeFloat";
import {LineCommentImpl} from "./LineCommentImpl";
import {PrimitiveTypeVoid} from "./PrimitiveTypeVoid";
import {LabeledStatement} from "./LabeledStatement";
import {StringLiteral} from "./StringLiteral";
import {SynchronizedStatementImpl} from "./SynchronizedStatementImpl";
import {AssertStatement} from "./AssertStatement";
import {MethodRefParameter} from "./MethodRefParameter";
import {Package} from "./Package";
import {PrimitiveTypeLongImpl} from "./PrimitiveTypeLongImpl";
import {BlockImpl} from "./BlockImpl";
import {EnumDeclarationImpl} from "./EnumDeclarationImpl";
import {UnresolvedSingleVariableDeclarationImpl} from "./UnresolvedSingleVariableDeclarationImpl";
import {VariableDeclarationStatementImpl} from "./VariableDeclarationStatementImpl";
import {PrimitiveTypeChar} from "./PrimitiveTypeChar";
import {WhileStatement} from "./WhileStatement";
import {CharacterLiteralImpl} from "./CharacterLiteralImpl";
import {ConstructorDeclarationImpl} from "./ConstructorDeclarationImpl";
import {ExpressionImpl} from "./ExpressionImpl";
import {MethodRef} from "./MethodRef";
import {InheritanceKind} from "./InheritanceKind";
import {ASTNode} from "./ASTNode";
import {ClassDeclarationImpl} from "./ClassDeclarationImpl";
import {UnresolvedVariableDeclarationFragmentImpl} from "./UnresolvedVariableDeclarationFragmentImpl";
import {ClassInstanceCreationImpl} from "./ClassInstanceCreationImpl";
import {ForStatement} from "./ForStatement";
import {ModelImpl} from "./ModelImpl";
import {ExpressionStatementImpl} from "./ExpressionStatementImpl";
import {ParenthesizedExpression} from "./ParenthesizedExpression";
import {EnhancedForStatementImpl} from "./EnhancedForStatementImpl";
import {AbstractMethodInvocationImpl} from "./AbstractMethodInvocationImpl";
import {AnnotationTypeDeclaration} from "./AnnotationTypeDeclaration";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";
import {ArrayCreationImpl} from "./ArrayCreationImpl";
import {TryStatementImpl} from "./TryStatementImpl";
import {Annotation} from "./Annotation";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {InitializerImpl} from "./InitializerImpl";
import {Type} from "./Type";
import {Expression} from "./Expression";
import {PrimitiveTypeIntImpl} from "./PrimitiveTypeIntImpl";
import {Model} from "./Model";
import {NamespaceAccess} from "./NamespaceAccess";
import {SuperConstructorInvocation} from "./SuperConstructorInvocation";
import {TypeDeclarationImpl} from "./TypeDeclarationImpl";
import {TypeDeclaration} from "./TypeDeclaration";
import {TypeParameter} from "./TypeParameter";
import {InterfaceDeclaration} from "./InterfaceDeclaration";
import {MethodInvocation} from "./MethodInvocation";
import {AssignmentKind} from "./AssignmentKind";
import {SuperMethodInvocation} from "./SuperMethodInvocation";
import {InterfaceDeclarationImpl} from "./InterfaceDeclarationImpl";
import {Java_Factory} from "./Java_Factory";
import {ArrayType} from "./ArrayType";
import {PrimitiveTypeShort} from "./PrimitiveTypeShort";
import {ThisExpression} from "./ThisExpression";
import {SwitchStatement} from "./SwitchStatement";
import {ConstructorInvocation} from "./ConstructorInvocation";
import {FieldDeclarationImpl} from "./FieldDeclarationImpl";
import {PackageAccessImpl} from "./PackageAccessImpl";
import {PrimitiveTypeByte} from "./PrimitiveTypeByte";
import {AbstractTypeDeclarationImpl} from "./AbstractTypeDeclarationImpl";
import {TagElement} from "./TagElement";
import {VariableDeclarationStatement} from "./VariableDeclarationStatement";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {CompilationUnitImpl} from "./CompilationUnitImpl";
import {VariableDeclarationExpressionImpl} from "./VariableDeclarationExpressionImpl";
import {ConditionalExpression} from "./ConditionalExpression";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {UnresolvedAnnotationDeclaration} from "./UnresolvedAnnotationDeclaration";
import {UnresolvedInterfaceDeclaration} from "./UnresolvedInterfaceDeclaration";
import {AbstractTypeQualifiedExpression} from "./AbstractTypeQualifiedExpression";
import {SuperFieldAccessImpl} from "./SuperFieldAccessImpl";
import {PrimitiveTypeDouble} from "./PrimitiveTypeDouble";
import {UnresolvedTypeImpl} from "./UnresolvedTypeImpl";
import {VariableDeclarationFragmentImpl} from "./VariableDeclarationFragmentImpl";
import {AnnotationTypeMemberDeclaration} from "./AnnotationTypeMemberDeclaration";
import {TypeDeclarationStatement} from "./TypeDeclarationStatement";
import {UnresolvedLabeledStatement} from "./UnresolvedLabeledStatement";
import {Block} from "./Block";
import {PostfixExpression} from "./PostfixExpression";
import {CastExpression} from "./CastExpression";
import {UnresolvedItemAccess} from "./UnresolvedItemAccess";
import {BooleanLiteral} from "./BooleanLiteral";
import {NamespaceAccessImpl} from "./NamespaceAccessImpl";
import {UnresolvedAnnotationDeclarationImpl} from "./UnresolvedAnnotationDeclarationImpl";
import {BooleanLiteralImpl} from "./BooleanLiteralImpl";
import {UnresolvedMethodDeclaration} from "./UnresolvedMethodDeclaration";
import {ArchiveImpl} from "./ArchiveImpl";
import {AnnotationMemberValuePairImpl} from "./AnnotationMemberValuePairImpl";
import {ConstructorDeclaration} from "./ConstructorDeclaration";
import {InstanceofExpression} from "./InstanceofExpression";
import {StatementImpl} from "./StatementImpl";
import {ThisExpressionImpl} from "./ThisExpressionImpl";
import {VariableDeclaration} from "./VariableDeclaration";
import {Modifier} from "./Modifier";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
import {WildCardTypeImpl} from "./WildCardTypeImpl";
import {Comment} from "./Comment";
import {PrimitiveTypeInt} from "./PrimitiveTypeInt";
import {ManifestEntryImpl} from "./ManifestEntryImpl";
import {SuperMethodInvocationImpl} from "./SuperMethodInvocationImpl";
import {Manifest} from "./Manifest";
import {EnumDeclaration} from "./EnumDeclaration";
import {ClassDeclaration} from "./ClassDeclaration";
import {ManifestEntry} from "./ManifestEntry";
import {FieldAccess} from "./FieldAccess";
import {TypeAccessImpl} from "./TypeAccessImpl";
import {NumberLiteral} from "./NumberLiteral";
export class Java_FactoryImpl extends EFactoryImpl implements Java_Factory{
	public static eINSTANCE : Java_Factory = Java_FactoryImpl.init();
	public static init() : Java_Factory 
	{
		return new Java_FactoryImpl();
	}
	
	public createAbstractMethodDeclaration = () : AbstractMethodDeclaration => {
		var theAbstractMethodDeclaration = new AbstractMethodDeclarationImpl();
		
		
		//AbstractMethodDeclarationImpl.allInstances_.add(theAbstractMethodDeclaration);
		
		return theAbstractMethodDeclaration;
	}
	public createAbstractMethodInvocation = () : AbstractMethodInvocation => {
		var theAbstractMethodInvocation = new AbstractMethodInvocationImpl();
		
		
		//AbstractMethodInvocationImpl.allInstances_.add(theAbstractMethodInvocation);
		
		return theAbstractMethodInvocation;
	}
	public createAbstractTypeDeclaration = () : AbstractTypeDeclaration => {
		var theAbstractTypeDeclaration = new AbstractTypeDeclarationImpl();
		
		
		//AbstractTypeDeclarationImpl.allInstances_.add(theAbstractTypeDeclaration);
		
		return theAbstractTypeDeclaration;
	}
	public createAbstractTypeQualifiedExpression = () : AbstractTypeQualifiedExpression => {
		var theAbstractTypeQualifiedExpression = new AbstractTypeQualifiedExpressionImpl();
		
		
		//AbstractTypeQualifiedExpressionImpl.allInstances_.add(theAbstractTypeQualifiedExpression);
		
		return theAbstractTypeQualifiedExpression;
	}
	public createAbstractVariablesContainer = () : AbstractVariablesContainer => {
		var theAbstractVariablesContainer = new AbstractVariablesContainerImpl();
		
		
		//AbstractVariablesContainerImpl.allInstances_.add(theAbstractVariablesContainer);
		
		return theAbstractVariablesContainer;
	}
	public createAnnotation = () : Annotation => {
		var theAnnotation = new AnnotationImpl();
		
		
		//AnnotationImpl.allInstances_.add(theAnnotation);
		
		return theAnnotation;
	}
	public createArchive = () : Archive => {
		var theArchive = new ArchiveImpl();
		
		
		//ArchiveImpl.allInstances_.add(theArchive);
		
		return theArchive;
	}
	public createAssertStatement = () : AssertStatement => {
		var theAssertStatement = new AssertStatementImpl();
		
		
		//AssertStatementImpl.allInstances_.add(theAssertStatement);
		
		return theAssertStatement;
	}
	public createASTNode = () : ASTNode => {
		var theASTNode = new ASTNodeImpl();
		
		
		//ASTNodeImpl.allInstances_.add(theASTNode);
		
		return theASTNode;
	}
	public createAnnotationMemberValuePair = () : AnnotationMemberValuePair => {
		var theAnnotationMemberValuePair = new AnnotationMemberValuePairImpl();
		
		
		//AnnotationMemberValuePairImpl.allInstances_.add(theAnnotationMemberValuePair);
		
		return theAnnotationMemberValuePair;
	}
	public createAnnotationTypeDeclaration = () : AnnotationTypeDeclaration => {
		var theAnnotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		
		
		//AnnotationTypeDeclarationImpl.allInstances_.add(theAnnotationTypeDeclaration);
		
		return theAnnotationTypeDeclaration;
	}
	public createAnnotationTypeMemberDeclaration = () : AnnotationTypeMemberDeclaration => {
		var theAnnotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		
		
		//AnnotationTypeMemberDeclarationImpl.allInstances_.add(theAnnotationTypeMemberDeclaration);
		
		return theAnnotationTypeMemberDeclaration;
	}
	public createAnonymousClassDeclaration = () : AnonymousClassDeclaration => {
		var theAnonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		
		
		//AnonymousClassDeclarationImpl.allInstances_.add(theAnonymousClassDeclaration);
		
		return theAnonymousClassDeclaration;
	}
	public createArrayAccess = () : ArrayAccess => {
		var theArrayAccess = new ArrayAccessImpl();
		
		
		//ArrayAccessImpl.allInstances_.add(theArrayAccess);
		
		return theArrayAccess;
	}
	public createArrayCreation = () : ArrayCreation => {
		var theArrayCreation = new ArrayCreationImpl();
		
		
		//ArrayCreationImpl.allInstances_.add(theArrayCreation);
		
		return theArrayCreation;
	}
	public createArrayInitializer = () : ArrayInitializer => {
		var theArrayInitializer = new ArrayInitializerImpl();
		
		
		//ArrayInitializerImpl.allInstances_.add(theArrayInitializer);
		
		return theArrayInitializer;
	}
	public createArrayLengthAccess = () : ArrayLengthAccess => {
		var theArrayLengthAccess = new ArrayLengthAccessImpl();
		
		
		//ArrayLengthAccessImpl.allInstances_.add(theArrayLengthAccess);
		
		return theArrayLengthAccess;
	}
	public createArrayType = () : ArrayType => {
		var theArrayType = new ArrayTypeImpl();
		
		
		//ArrayTypeImpl.allInstances_.add(theArrayType);
		
		return theArrayType;
	}
	public createAssignment = () : Assignment => {
		var theAssignment = new AssignmentImpl();
		
		
		//AssignmentImpl.allInstances_.add(theAssignment);
		
		return theAssignment;
	}
	public createBodyDeclaration = () : BodyDeclaration => {
		var theBodyDeclaration = new BodyDeclarationImpl();
		
		
		//BodyDeclarationImpl.allInstances_.add(theBodyDeclaration);
		
		return theBodyDeclaration;
	}
	public createBooleanLiteral = () : BooleanLiteral => {
		var theBooleanLiteral = new BooleanLiteralImpl();
		
		
		//BooleanLiteralImpl.allInstances_.add(theBooleanLiteral);
		
		return theBooleanLiteral;
	}
	public createBlockComment = () : BlockComment => {
		var theBlockComment = new BlockCommentImpl();
		
		
		//BlockCommentImpl.allInstances_.add(theBlockComment);
		
		return theBlockComment;
	}
	public createBlock = () : Block => {
		var theBlock = new BlockImpl();
		
		
		//BlockImpl.allInstances_.add(theBlock);
		
		return theBlock;
	}
	public createBreakStatement = () : BreakStatement => {
		var theBreakStatement = new BreakStatementImpl();
		
		
		//BreakStatementImpl.allInstances_.add(theBreakStatement);
		
		return theBreakStatement;
	}
	public createCastExpression = () : CastExpression => {
		var theCastExpression = new CastExpressionImpl();
		
		
		//CastExpressionImpl.allInstances_.add(theCastExpression);
		
		return theCastExpression;
	}
	public createCatchClause = () : CatchClause => {
		var theCatchClause = new CatchClauseImpl();
		
		
		//CatchClauseImpl.allInstances_.add(theCatchClause);
		
		return theCatchClause;
	}
	public createCharacterLiteral = () : CharacterLiteral => {
		var theCharacterLiteral = new CharacterLiteralImpl();
		
		
		//CharacterLiteralImpl.allInstances_.add(theCharacterLiteral);
		
		return theCharacterLiteral;
	}
	public createClassFile = () : ClassFile => {
		var theClassFile = new ClassFileImpl();
		
		
		//ClassFileImpl.allInstances_.add(theClassFile);
		
		return theClassFile;
	}
	public createClassInstanceCreation = () : ClassInstanceCreation => {
		var theClassInstanceCreation = new ClassInstanceCreationImpl();
		
		
		//ClassInstanceCreationImpl.allInstances_.add(theClassInstanceCreation);
		
		return theClassInstanceCreation;
	}
	public createConstructorDeclaration = () : ConstructorDeclaration => {
		var theConstructorDeclaration = new ConstructorDeclarationImpl();
		
		
		//ConstructorDeclarationImpl.allInstances_.add(theConstructorDeclaration);
		
		return theConstructorDeclaration;
	}
	public createConditionalExpression = () : ConditionalExpression => {
		var theConditionalExpression = new ConditionalExpressionImpl();
		
		
		//ConditionalExpressionImpl.allInstances_.add(theConditionalExpression);
		
		return theConditionalExpression;
	}
	public createConstructorInvocation = () : ConstructorInvocation => {
		var theConstructorInvocation = new ConstructorInvocationImpl();
		
		
		//ConstructorInvocationImpl.allInstances_.add(theConstructorInvocation);
		
		return theConstructorInvocation;
	}
	public createClassDeclaration = () : ClassDeclaration => {
		var theClassDeclaration = new ClassDeclarationImpl();
		
		
		//ClassDeclarationImpl.allInstances_.add(theClassDeclaration);
		
		return theClassDeclaration;
	}
	public createComment = () : Comment => {
		var theComment = new CommentImpl();
		
		
		//CommentImpl.allInstances_.add(theComment);
		
		return theComment;
	}
	public createCompilationUnit = () : CompilationUnit => {
		var theCompilationUnit = new CompilationUnitImpl();
		
		
		//CompilationUnitImpl.allInstances_.add(theCompilationUnit);
		
		return theCompilationUnit;
	}
	public createContinueStatement = () : ContinueStatement => {
		var theContinueStatement = new ContinueStatementImpl();
		
		
		//ContinueStatementImpl.allInstances_.add(theContinueStatement);
		
		return theContinueStatement;
	}
	public createDoStatement = () : DoStatement => {
		var theDoStatement = new DoStatementImpl();
		
		
		//DoStatementImpl.allInstances_.add(theDoStatement);
		
		return theDoStatement;
	}
	public createEmptyStatement = () : EmptyStatement => {
		var theEmptyStatement = new EmptyStatementImpl();
		
		
		//EmptyStatementImpl.allInstances_.add(theEmptyStatement);
		
		return theEmptyStatement;
	}
	public createEnhancedForStatement = () : EnhancedForStatement => {
		var theEnhancedForStatement = new EnhancedForStatementImpl();
		
		
		//EnhancedForStatementImpl.allInstances_.add(theEnhancedForStatement);
		
		return theEnhancedForStatement;
	}
	public createEnumConstantDeclaration = () : EnumConstantDeclaration => {
		var theEnumConstantDeclaration = new EnumConstantDeclarationImpl();
		
		
		//EnumConstantDeclarationImpl.allInstances_.add(theEnumConstantDeclaration);
		
		return theEnumConstantDeclaration;
	}
	public createEnumDeclaration = () : EnumDeclaration => {
		var theEnumDeclaration = new EnumDeclarationImpl();
		
		
		//EnumDeclarationImpl.allInstances_.add(theEnumDeclaration);
		
		return theEnumDeclaration;
	}
	public createExpression = () : Expression => {
		var theExpression = new ExpressionImpl();
		
		
		//ExpressionImpl.allInstances_.add(theExpression);
		
		return theExpression;
	}
	public createExpressionStatement = () : ExpressionStatement => {
		var theExpressionStatement = new ExpressionStatementImpl();
		
		
		//ExpressionStatementImpl.allInstances_.add(theExpressionStatement);
		
		return theExpressionStatement;
	}
	public createFieldAccess = () : FieldAccess => {
		var theFieldAccess = new FieldAccessImpl();
		
		
		//FieldAccessImpl.allInstances_.add(theFieldAccess);
		
		return theFieldAccess;
	}
	public createFieldDeclaration = () : FieldDeclaration => {
		var theFieldDeclaration = new FieldDeclarationImpl();
		
		
		//FieldDeclarationImpl.allInstances_.add(theFieldDeclaration);
		
		return theFieldDeclaration;
	}
	public createForStatement = () : ForStatement => {
		var theForStatement = new ForStatementImpl();
		
		
		//ForStatementImpl.allInstances_.add(theForStatement);
		
		return theForStatement;
	}
	public createIfStatement = () : IfStatement => {
		var theIfStatement = new IfStatementImpl();
		
		
		//IfStatementImpl.allInstances_.add(theIfStatement);
		
		return theIfStatement;
	}
	public createImportDeclaration = () : ImportDeclaration => {
		var theImportDeclaration = new ImportDeclarationImpl();
		
		
		//ImportDeclarationImpl.allInstances_.add(theImportDeclaration);
		
		return theImportDeclaration;
	}
	public createInfixExpression = () : InfixExpression => {
		var theInfixExpression = new InfixExpressionImpl();
		
		
		//InfixExpressionImpl.allInstances_.add(theInfixExpression);
		
		return theInfixExpression;
	}
	public createInitializer = () : Initializer => {
		var theInitializer = new InitializerImpl();
		
		
		//InitializerImpl.allInstances_.add(theInitializer);
		
		return theInitializer;
	}
	public createInstanceofExpression = () : InstanceofExpression => {
		var theInstanceofExpression = new InstanceofExpressionImpl();
		
		
		//InstanceofExpressionImpl.allInstances_.add(theInstanceofExpression);
		
		return theInstanceofExpression;
	}
	public createInterfaceDeclaration = () : InterfaceDeclaration => {
		var theInterfaceDeclaration = new InterfaceDeclarationImpl();
		
		
		//InterfaceDeclarationImpl.allInstances_.add(theInterfaceDeclaration);
		
		return theInterfaceDeclaration;
	}
	public createJavadoc = () : Javadoc => {
		var theJavadoc = new JavadocImpl();
		
		
		//JavadocImpl.allInstances_.add(theJavadoc);
		
		return theJavadoc;
	}
	public createLabeledStatement = () : LabeledStatement => {
		var theLabeledStatement = new LabeledStatementImpl();
		
		
		//LabeledStatementImpl.allInstances_.add(theLabeledStatement);
		
		return theLabeledStatement;
	}
	public createLineComment = () : LineComment => {
		var theLineComment = new LineCommentImpl();
		
		
		//LineCommentImpl.allInstances_.add(theLineComment);
		
		return theLineComment;
	}
	public createManifest = () : Manifest => {
		var theManifest = new ManifestImpl();
		
		
		//ManifestImpl.allInstances_.add(theManifest);
		
		return theManifest;
	}
	public createManifestAttribute = () : ManifestAttribute => {
		var theManifestAttribute = new ManifestAttributeImpl();
		
		
		//ManifestAttributeImpl.allInstances_.add(theManifestAttribute);
		
		return theManifestAttribute;
	}
	public createManifestEntry = () : ManifestEntry => {
		var theManifestEntry = new ManifestEntryImpl();
		
		
		//ManifestEntryImpl.allInstances_.add(theManifestEntry);
		
		return theManifestEntry;
	}
	public createMemberRef = () : MemberRef => {
		var theMemberRef = new MemberRefImpl();
		
		
		//MemberRefImpl.allInstances_.add(theMemberRef);
		
		return theMemberRef;
	}
	public createMethodDeclaration = () : MethodDeclaration => {
		var theMethodDeclaration = new MethodDeclarationImpl();
		
		
		//MethodDeclarationImpl.allInstances_.add(theMethodDeclaration);
		
		return theMethodDeclaration;
	}
	public createMethodInvocation = () : MethodInvocation => {
		var theMethodInvocation = new MethodInvocationImpl();
		
		
		//MethodInvocationImpl.allInstances_.add(theMethodInvocation);
		
		return theMethodInvocation;
	}
	public createMethodRef = () : MethodRef => {
		var theMethodRef = new MethodRefImpl();
		
		
		//MethodRefImpl.allInstances_.add(theMethodRef);
		
		return theMethodRef;
	}
	public createMethodRefParameter = () : MethodRefParameter => {
		var theMethodRefParameter = new MethodRefParameterImpl();
		
		
		//MethodRefParameterImpl.allInstances_.add(theMethodRefParameter);
		
		return theMethodRefParameter;
	}
	public createModel = () : Model => {
		var theModel = new ModelImpl();
		
		
		//ModelImpl.allInstances_.add(theModel);
		
		return theModel;
	}
	public createModifier = () : Modifier => {
		var theModifier = new ModifierImpl();
		
		
		//ModifierImpl.allInstances_.add(theModifier);
		
		return theModifier;
	}
	public createNamedElement = () : NamedElement => {
		var theNamedElement = new NamedElementImpl();
		
		
		//NamedElementImpl.allInstances_.add(theNamedElement);
		
		return theNamedElement;
	}
	public createNamespaceAccess = () : NamespaceAccess => {
		var theNamespaceAccess = new NamespaceAccessImpl();
		
		
		//NamespaceAccessImpl.allInstances_.add(theNamespaceAccess);
		
		return theNamespaceAccess;
	}
	public createNumberLiteral = () : NumberLiteral => {
		var theNumberLiteral = new NumberLiteralImpl();
		
		
		//NumberLiteralImpl.allInstances_.add(theNumberLiteral);
		
		return theNumberLiteral;
	}
	public createNullLiteral = () : NullLiteral => {
		var theNullLiteral = new NullLiteralImpl();
		
		
		//NullLiteralImpl.allInstances_.add(theNullLiteral);
		
		return theNullLiteral;
	}
	public createPackage = () : Package => {
		var thePackage = new PackageImpl();
		
		
		//PackageImpl.allInstances_.add(thePackage);
		
		return thePackage;
	}
	public createPackageAccess = () : PackageAccess => {
		var thePackageAccess = new PackageAccessImpl();
		
		
		//PackageAccessImpl.allInstances_.add(thePackageAccess);
		
		return thePackageAccess;
	}
	public createParameterizedType = () : ParameterizedType => {
		var theParameterizedType = new ParameterizedTypeImpl();
		
		
		//ParameterizedTypeImpl.allInstances_.add(theParameterizedType);
		
		return theParameterizedType;
	}
	public createParenthesizedExpression = () : ParenthesizedExpression => {
		var theParenthesizedExpression = new ParenthesizedExpressionImpl();
		
		
		//ParenthesizedExpressionImpl.allInstances_.add(theParenthesizedExpression);
		
		return theParenthesizedExpression;
	}
	public createPostfixExpression = () : PostfixExpression => {
		var thePostfixExpression = new PostfixExpressionImpl();
		
		
		//PostfixExpressionImpl.allInstances_.add(thePostfixExpression);
		
		return thePostfixExpression;
	}
	public createPrefixExpression = () : PrefixExpression => {
		var thePrefixExpression = new PrefixExpressionImpl();
		
		
		//PrefixExpressionImpl.allInstances_.add(thePrefixExpression);
		
		return thePrefixExpression;
	}
	public createPrimitiveType = () : PrimitiveType => {
		var thePrimitiveType = new PrimitiveTypeImpl();
		
		
		//PrimitiveTypeImpl.allInstances_.add(thePrimitiveType);
		
		return thePrimitiveType;
	}
	public createPrimitiveTypeBoolean = () : PrimitiveTypeBoolean => {
		var thePrimitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		
		
		//PrimitiveTypeBooleanImpl.allInstances_.add(thePrimitiveTypeBoolean);
		
		return thePrimitiveTypeBoolean;
	}
	public createPrimitiveTypeByte = () : PrimitiveTypeByte => {
		var thePrimitiveTypeByte = new PrimitiveTypeByteImpl();
		
		
		//PrimitiveTypeByteImpl.allInstances_.add(thePrimitiveTypeByte);
		
		return thePrimitiveTypeByte;
	}
	public createPrimitiveTypeChar = () : PrimitiveTypeChar => {
		var thePrimitiveTypeChar = new PrimitiveTypeCharImpl();
		
		
		//PrimitiveTypeCharImpl.allInstances_.add(thePrimitiveTypeChar);
		
		return thePrimitiveTypeChar;
	}
	public createPrimitiveTypeDouble = () : PrimitiveTypeDouble => {
		var thePrimitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		
		
		//PrimitiveTypeDoubleImpl.allInstances_.add(thePrimitiveTypeDouble);
		
		return thePrimitiveTypeDouble;
	}
	public createPrimitiveTypeShort = () : PrimitiveTypeShort => {
		var thePrimitiveTypeShort = new PrimitiveTypeShortImpl();
		
		
		//PrimitiveTypeShortImpl.allInstances_.add(thePrimitiveTypeShort);
		
		return thePrimitiveTypeShort;
	}
	public createPrimitiveTypeFloat = () : PrimitiveTypeFloat => {
		var thePrimitiveTypeFloat = new PrimitiveTypeFloatImpl();
		
		
		//PrimitiveTypeFloatImpl.allInstances_.add(thePrimitiveTypeFloat);
		
		return thePrimitiveTypeFloat;
	}
	public createPrimitiveTypeInt = () : PrimitiveTypeInt => {
		var thePrimitiveTypeInt = new PrimitiveTypeIntImpl();
		
		
		//PrimitiveTypeIntImpl.allInstances_.add(thePrimitiveTypeInt);
		
		return thePrimitiveTypeInt;
	}
	public createPrimitiveTypeLong = () : PrimitiveTypeLong => {
		var thePrimitiveTypeLong = new PrimitiveTypeLongImpl();
		
		
		//PrimitiveTypeLongImpl.allInstances_.add(thePrimitiveTypeLong);
		
		return thePrimitiveTypeLong;
	}
	public createPrimitiveTypeVoid = () : PrimitiveTypeVoid => {
		var thePrimitiveTypeVoid = new PrimitiveTypeVoidImpl();
		
		
		//PrimitiveTypeVoidImpl.allInstances_.add(thePrimitiveTypeVoid);
		
		return thePrimitiveTypeVoid;
	}
	public createReturnStatement = () : ReturnStatement => {
		var theReturnStatement = new ReturnStatementImpl();
		
		
		//ReturnStatementImpl.allInstances_.add(theReturnStatement);
		
		return theReturnStatement;
	}
	public createSingleVariableAccess = () : SingleVariableAccess => {
		var theSingleVariableAccess = new SingleVariableAccessImpl();
		
		
		//SingleVariableAccessImpl.allInstances_.add(theSingleVariableAccess);
		
		return theSingleVariableAccess;
	}
	public createSingleVariableDeclaration = () : SingleVariableDeclaration => {
		var theSingleVariableDeclaration = new SingleVariableDeclarationImpl();
		
		
		//SingleVariableDeclarationImpl.allInstances_.add(theSingleVariableDeclaration);
		
		return theSingleVariableDeclaration;
	}
	public createStatement = () : Statement => {
		var theStatement = new StatementImpl();
		
		
		//StatementImpl.allInstances_.add(theStatement);
		
		return theStatement;
	}
	public createStringLiteral = () : StringLiteral => {
		var theStringLiteral = new StringLiteralImpl();
		
		
		//StringLiteralImpl.allInstances_.add(theStringLiteral);
		
		return theStringLiteral;
	}
	public createSuperConstructorInvocation = () : SuperConstructorInvocation => {
		var theSuperConstructorInvocation = new SuperConstructorInvocationImpl();
		
		
		//SuperConstructorInvocationImpl.allInstances_.add(theSuperConstructorInvocation);
		
		return theSuperConstructorInvocation;
	}
	public createSuperFieldAccess = () : SuperFieldAccess => {
		var theSuperFieldAccess = new SuperFieldAccessImpl();
		
		
		//SuperFieldAccessImpl.allInstances_.add(theSuperFieldAccess);
		
		return theSuperFieldAccess;
	}
	public createSuperMethodInvocation = () : SuperMethodInvocation => {
		var theSuperMethodInvocation = new SuperMethodInvocationImpl();
		
		
		//SuperMethodInvocationImpl.allInstances_.add(theSuperMethodInvocation);
		
		return theSuperMethodInvocation;
	}
	public createSwitchCase = () : SwitchCase => {
		var theSwitchCase = new SwitchCaseImpl();
		
		
		//SwitchCaseImpl.allInstances_.add(theSwitchCase);
		
		return theSwitchCase;
	}
	public createSwitchStatement = () : SwitchStatement => {
		var theSwitchStatement = new SwitchStatementImpl();
		
		
		//SwitchStatementImpl.allInstances_.add(theSwitchStatement);
		
		return theSwitchStatement;
	}
	public createSynchronizedStatement = () : SynchronizedStatement => {
		var theSynchronizedStatement = new SynchronizedStatementImpl();
		
		
		//SynchronizedStatementImpl.allInstances_.add(theSynchronizedStatement);
		
		return theSynchronizedStatement;
	}
	public createTagElement = () : TagElement => {
		var theTagElement = new TagElementImpl();
		
		
		//TagElementImpl.allInstances_.add(theTagElement);
		
		return theTagElement;
	}
	public createTextElement = () : TextElement => {
		var theTextElement = new TextElementImpl();
		
		
		//TextElementImpl.allInstances_.add(theTextElement);
		
		return theTextElement;
	}
	public createThisExpression = () : ThisExpression => {
		var theThisExpression = new ThisExpressionImpl();
		
		
		//ThisExpressionImpl.allInstances_.add(theThisExpression);
		
		return theThisExpression;
	}
	public createThrowStatement = () : ThrowStatement => {
		var theThrowStatement = new ThrowStatementImpl();
		
		
		//ThrowStatementImpl.allInstances_.add(theThrowStatement);
		
		return theThrowStatement;
	}
	public createTryStatement = () : TryStatement => {
		var theTryStatement = new TryStatementImpl();
		
		
		//TryStatementImpl.allInstances_.add(theTryStatement);
		
		return theTryStatement;
	}
	public createType = () : Type => {
		var theType = new TypeImpl();
		
		
		//TypeImpl.allInstances_.add(theType);
		
		return theType;
	}
	public createTypeAccess = () : TypeAccess => {
		var theTypeAccess = new TypeAccessImpl();
		
		
		//TypeAccessImpl.allInstances_.add(theTypeAccess);
		
		return theTypeAccess;
	}
	public createTypeDeclaration = () : TypeDeclaration => {
		var theTypeDeclaration = new TypeDeclarationImpl();
		
		
		//TypeDeclarationImpl.allInstances_.add(theTypeDeclaration);
		
		return theTypeDeclaration;
	}
	public createTypeDeclarationStatement = () : TypeDeclarationStatement => {
		var theTypeDeclarationStatement = new TypeDeclarationStatementImpl();
		
		
		//TypeDeclarationStatementImpl.allInstances_.add(theTypeDeclarationStatement);
		
		return theTypeDeclarationStatement;
	}
	public createTypeLiteral = () : TypeLiteral => {
		var theTypeLiteral = new TypeLiteralImpl();
		
		
		//TypeLiteralImpl.allInstances_.add(theTypeLiteral);
		
		return theTypeLiteral;
	}
	public createTypeParameter = () : TypeParameter => {
		var theTypeParameter = new TypeParameterImpl();
		
		
		//TypeParameterImpl.allInstances_.add(theTypeParameter);
		
		return theTypeParameter;
	}
	public createUnresolvedItem = () : UnresolvedItem => {
		var theUnresolvedItem = new UnresolvedItemImpl();
		
		
		//UnresolvedItemImpl.allInstances_.add(theUnresolvedItem);
		
		return theUnresolvedItem;
	}
	public createUnresolvedItemAccess = () : UnresolvedItemAccess => {
		var theUnresolvedItemAccess = new UnresolvedItemAccessImpl();
		
		
		//UnresolvedItemAccessImpl.allInstances_.add(theUnresolvedItemAccess);
		
		return theUnresolvedItemAccess;
	}
	public createUnresolvedAnnotationDeclaration = () : UnresolvedAnnotationDeclaration => {
		var theUnresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
		
		
		//UnresolvedAnnotationDeclarationImpl.allInstances_.add(theUnresolvedAnnotationDeclaration);
		
		return theUnresolvedAnnotationDeclaration;
	}
	public createUnresolvedAnnotationTypeMemberDeclaration = () : UnresolvedAnnotationTypeMemberDeclaration => {
		var theUnresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
		
		
		//UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_.add(theUnresolvedAnnotationTypeMemberDeclaration);
		
		return theUnresolvedAnnotationTypeMemberDeclaration;
	}
	public createUnresolvedClassDeclaration = () : UnresolvedClassDeclaration => {
		var theUnresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
		
		
		//UnresolvedClassDeclarationImpl.allInstances_.add(theUnresolvedClassDeclaration);
		
		return theUnresolvedClassDeclaration;
	}
	public createUnresolvedEnumDeclaration = () : UnresolvedEnumDeclaration => {
		var theUnresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
		
		
		//UnresolvedEnumDeclarationImpl.allInstances_.add(theUnresolvedEnumDeclaration);
		
		return theUnresolvedEnumDeclaration;
	}
	public createUnresolvedInterfaceDeclaration = () : UnresolvedInterfaceDeclaration => {
		var theUnresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
		
		
		//UnresolvedInterfaceDeclarationImpl.allInstances_.add(theUnresolvedInterfaceDeclaration);
		
		return theUnresolvedInterfaceDeclaration;
	}
	public createUnresolvedLabeledStatement = () : UnresolvedLabeledStatement => {
		var theUnresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
		
		
		//UnresolvedLabeledStatementImpl.allInstances_.add(theUnresolvedLabeledStatement);
		
		return theUnresolvedLabeledStatement;
	}
	public createUnresolvedMethodDeclaration = () : UnresolvedMethodDeclaration => {
		var theUnresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		
		
		//UnresolvedMethodDeclarationImpl.allInstances_.add(theUnresolvedMethodDeclaration);
		
		return theUnresolvedMethodDeclaration;
	}
	public createUnresolvedSingleVariableDeclaration = () : UnresolvedSingleVariableDeclaration => {
		var theUnresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
		
		
		//UnresolvedSingleVariableDeclarationImpl.allInstances_.add(theUnresolvedSingleVariableDeclaration);
		
		return theUnresolvedSingleVariableDeclaration;
	}
	public createUnresolvedType = () : UnresolvedType => {
		var theUnresolvedType = new UnresolvedTypeImpl();
		
		
		//UnresolvedTypeImpl.allInstances_.add(theUnresolvedType);
		
		return theUnresolvedType;
	}
	public createUnresolvedTypeDeclaration = () : UnresolvedTypeDeclaration => {
		var theUnresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		
		
		//UnresolvedTypeDeclarationImpl.allInstances_.add(theUnresolvedTypeDeclaration);
		
		return theUnresolvedTypeDeclaration;
	}
	public createUnresolvedVariableDeclarationFragment = () : UnresolvedVariableDeclarationFragment => {
		var theUnresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
		
		
		//UnresolvedVariableDeclarationFragmentImpl.allInstances_.add(theUnresolvedVariableDeclarationFragment);
		
		return theUnresolvedVariableDeclarationFragment;
	}
	public createVariableDeclaration = () : VariableDeclaration => {
		var theVariableDeclaration = new VariableDeclarationImpl();
		
		
		//VariableDeclarationImpl.allInstances_.add(theVariableDeclaration);
		
		return theVariableDeclaration;
	}
	public createVariableDeclarationExpression = () : VariableDeclarationExpression => {
		var theVariableDeclarationExpression = new VariableDeclarationExpressionImpl();
		
		
		//VariableDeclarationExpressionImpl.allInstances_.add(theVariableDeclarationExpression);
		
		return theVariableDeclarationExpression;
	}
	public createVariableDeclarationFragment = () : VariableDeclarationFragment => {
		var theVariableDeclarationFragment = new VariableDeclarationFragmentImpl();
		
		
		//VariableDeclarationFragmentImpl.allInstances_.add(theVariableDeclarationFragment);
		
		return theVariableDeclarationFragment;
	}
	public createVariableDeclarationStatement = () : VariableDeclarationStatement => {
		var theVariableDeclarationStatement = new VariableDeclarationStatementImpl();
		
		
		//VariableDeclarationStatementImpl.allInstances_.add(theVariableDeclarationStatement);
		
		return theVariableDeclarationStatement;
	}
	public createWildCardType = () : WildCardType => {
		var theWildCardType = new WildCardTypeImpl();
		
		
		//WildCardTypeImpl.allInstances_.add(theWildCardType);
		
		return theWildCardType;
	}
	public createWhileStatement = () : WhileStatement => {
		var theWhileStatement = new WhileStatementImpl();
		
		
		//WhileStatementImpl.allInstances_.add(theWhileStatement);
		
		return theWhileStatement;
	}
	
	public create(eClass:EClass):EObject {
		switch (eClass.getClassifierID()) {
			case Java_PackageImpl.ANNOTATION: return this.createAnnotation();
			case Java_PackageImpl.ARCHIVE: return this.createArchive();
			case Java_PackageImpl.ASSERTSTATEMENT: return this.createAssertStatement();
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR: return this.createAnnotationMemberValuePair();
			case Java_PackageImpl.ANNOTATIONTYPEDECLARATION: return this.createAnnotationTypeDeclaration();
			case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION: return this.createAnnotationTypeMemberDeclaration();
			case Java_PackageImpl.ANONYMOUSCLASSDECLARATION: return this.createAnonymousClassDeclaration();
			case Java_PackageImpl.ARRAYACCESS: return this.createArrayAccess();
			case Java_PackageImpl.ARRAYCREATION: return this.createArrayCreation();
			case Java_PackageImpl.ARRAYINITIALIZER: return this.createArrayInitializer();
			case Java_PackageImpl.ARRAYLENGTHACCESS: return this.createArrayLengthAccess();
			case Java_PackageImpl.ARRAYTYPE: return this.createArrayType();
			case Java_PackageImpl.ASSIGNMENT: return this.createAssignment();
			case Java_PackageImpl.BOOLEANLITERAL: return this.createBooleanLiteral();
			case Java_PackageImpl.BLOCKCOMMENT: return this.createBlockComment();
			case Java_PackageImpl.BLOCK: return this.createBlock();
			case Java_PackageImpl.BREAKSTATEMENT: return this.createBreakStatement();
			case Java_PackageImpl.CASTEXPRESSION: return this.createCastExpression();
			case Java_PackageImpl.CATCHCLAUSE: return this.createCatchClause();
			case Java_PackageImpl.CHARACTERLITERAL: return this.createCharacterLiteral();
			case Java_PackageImpl.CLASSFILE: return this.createClassFile();
			case Java_PackageImpl.CLASSINSTANCECREATION: return this.createClassInstanceCreation();
			case Java_PackageImpl.CONSTRUCTORDECLARATION: return this.createConstructorDeclaration();
			case Java_PackageImpl.CONDITIONALEXPRESSION: return this.createConditionalExpression();
			case Java_PackageImpl.CONSTRUCTORINVOCATION: return this.createConstructorInvocation();
			case Java_PackageImpl.CLASSDECLARATION: return this.createClassDeclaration();
			case Java_PackageImpl.COMPILATIONUNIT: return this.createCompilationUnit();
			case Java_PackageImpl.CONTINUESTATEMENT: return this.createContinueStatement();
			case Java_PackageImpl.DOSTATEMENT: return this.createDoStatement();
			case Java_PackageImpl.EMPTYSTATEMENT: return this.createEmptyStatement();
			case Java_PackageImpl.ENHANCEDFORSTATEMENT: return this.createEnhancedForStatement();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION: return this.createEnumConstantDeclaration();
			case Java_PackageImpl.ENUMDECLARATION: return this.createEnumDeclaration();
			case Java_PackageImpl.EXPRESSIONSTATEMENT: return this.createExpressionStatement();
			case Java_PackageImpl.FIELDACCESS: return this.createFieldAccess();
			case Java_PackageImpl.FIELDDECLARATION: return this.createFieldDeclaration();
			case Java_PackageImpl.FORSTATEMENT: return this.createForStatement();
			case Java_PackageImpl.IFSTATEMENT: return this.createIfStatement();
			case Java_PackageImpl.IMPORTDECLARATION: return this.createImportDeclaration();
			case Java_PackageImpl.INFIXEXPRESSION: return this.createInfixExpression();
			case Java_PackageImpl.INITIALIZER: return this.createInitializer();
			case Java_PackageImpl.INSTANCEOFEXPRESSION: return this.createInstanceofExpression();
			case Java_PackageImpl.INTERFACEDECLARATION: return this.createInterfaceDeclaration();
			case Java_PackageImpl.JAVADOC: return this.createJavadoc();
			case Java_PackageImpl.LABELEDSTATEMENT: return this.createLabeledStatement();
			case Java_PackageImpl.LINECOMMENT: return this.createLineComment();
			case Java_PackageImpl.MANIFEST: return this.createManifest();
			case Java_PackageImpl.MANIFESTATTRIBUTE: return this.createManifestAttribute();
			case Java_PackageImpl.MANIFESTENTRY: return this.createManifestEntry();
			case Java_PackageImpl.MEMBERREF: return this.createMemberRef();
			case Java_PackageImpl.METHODDECLARATION: return this.createMethodDeclaration();
			case Java_PackageImpl.METHODINVOCATION: return this.createMethodInvocation();
			case Java_PackageImpl.METHODREF: return this.createMethodRef();
			case Java_PackageImpl.METHODREFPARAMETER: return this.createMethodRefParameter();
			case Java_PackageImpl.MODEL: return this.createModel();
			case Java_PackageImpl.MODIFIER: return this.createModifier();
			case Java_PackageImpl.NUMBERLITERAL: return this.createNumberLiteral();
			case Java_PackageImpl.NULLLITERAL: return this.createNullLiteral();
			case Java_PackageImpl.PACKAGE: return this.createPackage();
			case Java_PackageImpl.PACKAGEACCESS: return this.createPackageAccess();
			case Java_PackageImpl.PARAMETERIZEDTYPE: return this.createParameterizedType();
			case Java_PackageImpl.PARENTHESIZEDEXPRESSION: return this.createParenthesizedExpression();
			case Java_PackageImpl.POSTFIXEXPRESSION: return this.createPostfixExpression();
			case Java_PackageImpl.PREFIXEXPRESSION: return this.createPrefixExpression();
			case Java_PackageImpl.PRIMITIVETYPE: return this.createPrimitiveType();
			case Java_PackageImpl.PRIMITIVETYPEBOOLEAN: return this.createPrimitiveTypeBoolean();
			case Java_PackageImpl.PRIMITIVETYPEBYTE: return this.createPrimitiveTypeByte();
			case Java_PackageImpl.PRIMITIVETYPECHAR: return this.createPrimitiveTypeChar();
			case Java_PackageImpl.PRIMITIVETYPEDOUBLE: return this.createPrimitiveTypeDouble();
			case Java_PackageImpl.PRIMITIVETYPESHORT: return this.createPrimitiveTypeShort();
			case Java_PackageImpl.PRIMITIVETYPEFLOAT: return this.createPrimitiveTypeFloat();
			case Java_PackageImpl.PRIMITIVETYPEINT: return this.createPrimitiveTypeInt();
			case Java_PackageImpl.PRIMITIVETYPELONG: return this.createPrimitiveTypeLong();
			case Java_PackageImpl.PRIMITIVETYPEVOID: return this.createPrimitiveTypeVoid();
			case Java_PackageImpl.RETURNSTATEMENT: return this.createReturnStatement();
			case Java_PackageImpl.SINGLEVARIABLEACCESS: return this.createSingleVariableAccess();
			case Java_PackageImpl.SINGLEVARIABLEDECLARATION: return this.createSingleVariableDeclaration();
			case Java_PackageImpl.STRINGLITERAL: return this.createStringLiteral();
			case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION: return this.createSuperConstructorInvocation();
			case Java_PackageImpl.SUPERFIELDACCESS: return this.createSuperFieldAccess();
			case Java_PackageImpl.SUPERMETHODINVOCATION: return this.createSuperMethodInvocation();
			case Java_PackageImpl.SWITCHCASE: return this.createSwitchCase();
			case Java_PackageImpl.SWITCHSTATEMENT: return this.createSwitchStatement();
			case Java_PackageImpl.SYNCHRONIZEDSTATEMENT: return this.createSynchronizedStatement();
			case Java_PackageImpl.TAGELEMENT: return this.createTagElement();
			case Java_PackageImpl.TEXTELEMENT: return this.createTextElement();
			case Java_PackageImpl.THISEXPRESSION: return this.createThisExpression();
			case Java_PackageImpl.THROWSTATEMENT: return this.createThrowStatement();
			case Java_PackageImpl.TRYSTATEMENT: return this.createTryStatement();
			case Java_PackageImpl.TYPEACCESS: return this.createTypeAccess();
			case Java_PackageImpl.TYPEDECLARATIONSTATEMENT: return this.createTypeDeclarationStatement();
			case Java_PackageImpl.TYPELITERAL: return this.createTypeLiteral();
			case Java_PackageImpl.TYPEPARAMETER: return this.createTypeParameter();
			case Java_PackageImpl.UNRESOLVEDITEM: return this.createUnresolvedItem();
			case Java_PackageImpl.UNRESOLVEDITEMACCESS: return this.createUnresolvedItemAccess();
			case Java_PackageImpl.UNRESOLVEDANNOTATIONDECLARATION: return this.createUnresolvedAnnotationDeclaration();
			case Java_PackageImpl.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION: return this.createUnresolvedAnnotationTypeMemberDeclaration();
			case Java_PackageImpl.UNRESOLVEDCLASSDECLARATION: return this.createUnresolvedClassDeclaration();
			case Java_PackageImpl.UNRESOLVEDENUMDECLARATION: return this.createUnresolvedEnumDeclaration();
			case Java_PackageImpl.UNRESOLVEDINTERFACEDECLARATION: return this.createUnresolvedInterfaceDeclaration();
			case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT: return this.createUnresolvedLabeledStatement();
			case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION: return this.createUnresolvedMethodDeclaration();
			case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION: return this.createUnresolvedSingleVariableDeclaration();
			case Java_PackageImpl.UNRESOLVEDTYPE: return this.createUnresolvedType();
			case Java_PackageImpl.UNRESOLVEDTYPEDECLARATION: return this.createUnresolvedTypeDeclaration();
			case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT: return this.createUnresolvedVariableDeclarationFragment();
			case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION: return this.createVariableDeclarationExpression();
			case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT: return this.createVariableDeclarationFragment();
			case Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT: return this.createVariableDeclarationStatement();
			case Java_PackageImpl.WILDCARDTYPE: return this.createWildCardType();
			case Java_PackageImpl.WHILESTATEMENT: return this.createWhileStatement();
			default:
				throw new Error("The class '" + eClass.name + "' is not a valid classifier");
		}
	}
	
	
	public createFromString(eDataType:EDataType, initialValue:string):any {
		switch (eDataType.getClassifierID()) {
		case Java_PackageImpl.ASSIGNMENTKIND:
			return this.createAssignmentKindFromString(eDataType, initialValue);
		case Java_PackageImpl.INFIXEXPRESSIONKIND:
			return this.createInfixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.INHERITANCEKIND:
			return this.createInheritanceKindFromString(eDataType, initialValue);
		case Java_PackageImpl.POSTFIXEXPRESSIONKIND:
			return this.createPostfixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.PREFIXEXPRESSIONKIND:
			return this.createPrefixExpressionKindFromString(eDataType, initialValue);
		case Java_PackageImpl.VISIBILITYKIND:
			return this.createVisibilityKindFromString(eDataType, initialValue);
		default:
			throw new Error("The datatype '" + eDataType.name + "' is not a valid classifier");
		}
	}
	
	public convertToString(eDataType:EDataType, instanceValue:any):string {
		switch (eDataType.getClassifierID()) {
		case Java_PackageImpl.ASSIGNMENTKIND:
			return this.convertAssignmentKindToString(eDataType, instanceValue);
		case Java_PackageImpl.INFIXEXPRESSIONKIND:
			return this.convertInfixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.INHERITANCEKIND:
			return this.convertInheritanceKindToString(eDataType, instanceValue);
		case Java_PackageImpl.POSTFIXEXPRESSIONKIND:
			return this.convertPostfixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.PREFIXEXPRESSIONKIND:
			return this.convertPrefixExpressionKindToString(eDataType, instanceValue);
		case Java_PackageImpl.VISIBILITYKIND:
			return this.convertVisibilityKindToString(eDataType, instanceValue);
		default:
			throw new Error("The datatype '" + eDataType.name + "' is not a valid classifier");
		}
	}
	
	
	public createAssignmentKindFromString(eDataType:EDataType, initialValue:string):AssignmentKind {
		let result:AssignmentKind = AssignmentKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertAssignmentKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
	public createInfixExpressionKindFromString(eDataType:EDataType, initialValue:string):InfixExpressionKind {
		let result:InfixExpressionKind = InfixExpressionKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertInfixExpressionKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
	public createInheritanceKindFromString(eDataType:EDataType, initialValue:string):InheritanceKind {
		let result:InheritanceKind = InheritanceKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertInheritanceKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
	public createPostfixExpressionKindFromString(eDataType:EDataType, initialValue:string):PostfixExpressionKind {
		let result:PostfixExpressionKind = PostfixExpressionKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertPostfixExpressionKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
	public createPrefixExpressionKindFromString(eDataType:EDataType, initialValue:string):PrefixExpressionKind {
		let result:PrefixExpressionKind = PrefixExpressionKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertPrefixExpressionKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
	public createVisibilityKindFromString(eDataType:EDataType, initialValue:string):VisibilityKind {
		let result:VisibilityKind = VisibilityKind.get_string(initialValue);
		if (result == null)
			throw new Error(
	                        "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.name + "'");
		return result;
	}
	
	public convertVisibilityKindToString(eDataType:EDataType, instanceValue:any):string {
		return instanceValue === null ? null : instanceValue.toString();
	}
}
