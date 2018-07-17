/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mdt-ocl-java/model/java.ecore
 * using:
 *   /mdt-ocl-java/model/java.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package java_;

import java_.Java_Tables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * Java_Tables provides the dispatch tables for the java_ for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Java_Tables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Java_Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_ = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", null, java_.Java_Package.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ASTNode = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ASTNode", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AbstractMethodDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AbstractMethodDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AbstractMethodInvocation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AbstractMethodInvocation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AbstractTypeDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AbstractTypeDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AbstractTypeQualifiedExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AbstractTypeQualifiedExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AbstractVariablesContainer = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AbstractVariablesContainer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Annotation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Annotation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AnnotationMemberValuePair = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AnnotationMemberValuePair", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AnnotationTypeMemberDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AnnotationTypeMemberDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AnonymousClassDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AnonymousClassDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Archive = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Archive", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ArrayAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayCreation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ArrayCreation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayInitializer = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ArrayInitializer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayLengthAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ArrayLengthAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayType = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ArrayType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AssertStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("AssertStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Assignment = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Assignment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Block = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Block", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_BodyDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("BodyDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_BreakStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("BreakStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CastExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("CastExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CatchClause = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("CatchClause", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = java_.Java_Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ClassDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ClassDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ClassFile = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ClassFile", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ClassInstanceCreation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ClassInstanceCreation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Comment = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Comment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CompilationUnit = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("CompilationUnit", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ConditionalExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ConditionalExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ContinueStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ContinueStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DoStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("DoStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EnhancedForStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("EnhancedForStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EnumConstantDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("EnumConstantDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EnumDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("EnumDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Expression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ExpressionStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ExpressionStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_FieldAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("FieldAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ForStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ForStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_IfStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("IfStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ImportDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ImportDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InfixExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("InfixExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Initializer = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Initializer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_InstanceofExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("InstanceofExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Javadoc = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Javadoc", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_LabeledStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("LabeledStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Manifest = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Manifest", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ManifestAttribute = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ManifestAttribute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ManifestEntry = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ManifestEntry", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MemberRef = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("MemberRef", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MethodDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("MethodDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MethodInvocation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("MethodInvocation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MethodRef = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("MethodRef", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MethodRefParameter = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("MethodRefParameter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Model = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Model", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Modifier = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Modifier", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_NamedElement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("NamedElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_NamespaceAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("NamespaceAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Package = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Package", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PackageAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("PackageAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ParameterizedType = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ParameterizedType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ParenthesizedExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ParenthesizedExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PostfixExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("PostfixExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PrefixExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("PrefixExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_QueryCollection = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("QueryCollection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ReturnStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ReturnStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SingleVariableAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SingleVariableAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SingleVariableDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SingleVariableDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Statement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Statement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SuperConstructorInvocation = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SuperConstructorInvocation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SuperFieldAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SuperFieldAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SwitchCase = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SwitchCase", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SwitchStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SwitchStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SynchronizedStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("SynchronizedStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TagElement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TagElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TextElement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TextElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ThrowStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("ThrowStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TryStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TryStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Type = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("Type", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypeAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TypeAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypeDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TypeDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypeDeclarationStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TypeDeclarationStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypeLiteral = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TypeLiteral", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TypeParameter = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("TypeParameter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_UnresolvedItem = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("UnresolvedItem", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_UnresolvedItemAccess = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("UnresolvedItemAccess", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_VariableDeclaration = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("VariableDeclaration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_VariableDeclarationExpression = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("VariableDeclarationExpression", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_VariableDeclarationFragment = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("VariableDeclarationFragment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_VariableDeclarationStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("VariableDeclarationStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_WhileStatement = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("WhileStatement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_WildCardType = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getClassId("WildCardType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AssignmentKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("AssignmentKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_InfixExpressionKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("InfixExpressionKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_InheritanceKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("InheritanceKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_PostfixExpressionKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("PostfixExpressionKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_PrefixExpressionKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("PrefixExpressionKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_VisibilityKind = java_.Java_Tables.PACKid_http_c_s_s_www_eclipse_org_s_MoDisco_s_Java_s_0_2_incubation_s_java_.getEnumerationId("VisibilityKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_ASTNode = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_ASTNode);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_BodyDeclaration = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_BodyDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_ClassFile = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_ClassFile);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Comment = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_Comment);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_CompilationUnit = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_CompilationUnit);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_MemberRef = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_MemberRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_TagElement = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_TagElement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_UnresolvedItemAccess = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(java_.Java_Tables.CLSSid_UnresolvedItemAccess);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationLiteralId ELITid_private = java_.Java_Tables.ENUMid_VisibilityKind.getEnumerationLiteralId("private");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationLiteralId ELITid_protected = java_.Java_Tables.ENUMid_VisibilityKind.getEnumerationLiteralId("protected");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_ASTNode = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_ASTNode);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_AbstractTypeDeclaration = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_AbstractTypeDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Annotation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_Annotation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_AnnotationMemberValuePair = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_AnnotationMemberValuePair);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_BodyDeclaration = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_BodyDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_CatchClause = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_CatchClause);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Comment = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_Comment);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_EnumConstantDeclaration = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_EnumConstantDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Expression = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_Expression);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_ImportDeclaration = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_ImportDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_MethodRefParameter = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_MethodRefParameter);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_SingleVariableDeclaration = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_SingleVariableDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Statement = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_Statement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TagElement = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_TagElement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TypeAccess = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_TypeAccess);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_TypeParameter = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_TypeParameter);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_VariableDeclarationFragment = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(java_.Java_Tables.CLSSid_VariableDeclarationFragment);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_ASTNode = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(java_.Java_Tables.CLSSid_ASTNode);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_BodyDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(java_.Java_Tables.CLSSid_BodyDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_TypeDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(java_.Java_Tables.CLSSid_TypeDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_AbstractMethodInvocation = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_AbstractMethodInvocation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_AbstractTypeDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_AbstractTypeDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_AnnotationMemberValuePair = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_AnnotationMemberValuePair);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Archive = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_Archive);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_BreakStatement = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_BreakStatement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ClassDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ClassDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ClassFile = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ClassFile);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_CompilationUnit = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_CompilationUnit);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ContinueStatement = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ContinueStatement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ImportDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ImportDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ManifestAttribute = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ManifestAttribute);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_ManifestEntry = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_ManifestEntry);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_MethodDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_MethodDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_MethodRef = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_MethodRef);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Package = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_Package);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_PackageAccess = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_PackageAccess);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_SingleVariableAccess = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_SingleVariableAccess);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Type = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_Type);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_TypeAccess = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_TypeAccess);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_TypeDeclaration = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_TypeDeclaration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_UnresolvedItem = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(java_.Java_Tables.CLSSid_UnresolvedItem);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Java_Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _ASTNode = new EcoreExecutorType(Java_Package.Literals.AST_NODE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _AbstractMethodDeclaration = new EcoreExecutorType(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _AbstractMethodInvocation = new EcoreExecutorType(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _AbstractTypeDeclaration = new EcoreExecutorType(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _AbstractTypeQualifiedExpression = new EcoreExecutorType(Java_Package.Literals.ABSTRACT_TYPE_QUALIFIED_EXPRESSION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _AbstractVariablesContainer = new EcoreExecutorType(Java_Package.Literals.ABSTRACT_VARIABLES_CONTAINER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Annotation = new EcoreExecutorType(Java_Package.Literals.ANNOTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AnnotationMemberValuePair = new EcoreExecutorType(Java_Package.Literals.ANNOTATION_MEMBER_VALUE_PAIR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AnnotationTypeDeclaration = new EcoreExecutorType(Java_Package.Literals.ANNOTATION_TYPE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AnnotationTypeMemberDeclaration = new EcoreExecutorType(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AnonymousClassDeclaration = new EcoreExecutorType(Java_Package.Literals.ANONYMOUS_CLASS_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Archive = new EcoreExecutorType(Java_Package.Literals.ARCHIVE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayAccess = new EcoreExecutorType(Java_Package.Literals.ARRAY_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayCreation = new EcoreExecutorType(Java_Package.Literals.ARRAY_CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayInitializer = new EcoreExecutorType(Java_Package.Literals.ARRAY_INITIALIZER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayLengthAccess = new EcoreExecutorType(Java_Package.Literals.ARRAY_LENGTH_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayType = new EcoreExecutorType(Java_Package.Literals.ARRAY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AssertStatement = new EcoreExecutorType(Java_Package.Literals.ASSERT_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Assignment = new EcoreExecutorType(Java_Package.Literals.ASSIGNMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _AssignmentKind = new EcoreExecutorEnumeration(Java_Package.Literals.ASSIGNMENT_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Block = new EcoreExecutorType(Java_Package.Literals.BLOCK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BlockComment = new EcoreExecutorType(Java_Package.Literals.BLOCK_COMMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BodyDeclaration = new EcoreExecutorType(Java_Package.Literals.BODY_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _BooleanLiteral = new EcoreExecutorType(Java_Package.Literals.BOOLEAN_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BreakStatement = new EcoreExecutorType(Java_Package.Literals.BREAK_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CastExpression = new EcoreExecutorType(Java_Package.Literals.CAST_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CatchClause = new EcoreExecutorType(Java_Package.Literals.CATCH_CLAUSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CharacterLiteral = new EcoreExecutorType(Java_Package.Literals.CHARACTER_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ClassDeclaration = new EcoreExecutorType(Java_Package.Literals.CLASS_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ClassFile = new EcoreExecutorType(Java_Package.Literals.CLASS_FILE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ClassInstanceCreation = new EcoreExecutorType(Java_Package.Literals.CLASS_INSTANCE_CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Comment = new EcoreExecutorType(Java_Package.Literals.COMMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _CompilationUnit = new EcoreExecutorType(Java_Package.Literals.COMPILATION_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ConditionalExpression = new EcoreExecutorType(Java_Package.Literals.CONDITIONAL_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ConstructorDeclaration = new EcoreExecutorType(Java_Package.Literals.CONSTRUCTOR_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ConstructorInvocation = new EcoreExecutorType(Java_Package.Literals.CONSTRUCTOR_INVOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ContinueStatement = new EcoreExecutorType(Java_Package.Literals.CONTINUE_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DoStatement = new EcoreExecutorType(Java_Package.Literals.DO_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _EmptyStatement = new EcoreExecutorType(Java_Package.Literals.EMPTY_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _EnhancedForStatement = new EcoreExecutorType(Java_Package.Literals.ENHANCED_FOR_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _EnumConstantDeclaration = new EcoreExecutorType(Java_Package.Literals.ENUM_CONSTANT_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _EnumDeclaration = new EcoreExecutorType(Java_Package.Literals.ENUM_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Expression = new EcoreExecutorType(Java_Package.Literals.EXPRESSION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _ExpressionStatement = new EcoreExecutorType(Java_Package.Literals.EXPRESSION_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _FieldAccess = new EcoreExecutorType(Java_Package.Literals.FIELD_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _FieldDeclaration = new EcoreExecutorType(Java_Package.Literals.FIELD_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ForStatement = new EcoreExecutorType(Java_Package.Literals.FOR_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IfStatement = new EcoreExecutorType(Java_Package.Literals.IF_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ImportDeclaration = new EcoreExecutorType(Java_Package.Literals.IMPORT_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InfixExpression = new EcoreExecutorType(Java_Package.Literals.INFIX_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _InfixExpressionKind = new EcoreExecutorEnumeration(Java_Package.Literals.INFIX_EXPRESSION_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _InheritanceKind = new EcoreExecutorEnumeration(Java_Package.Literals.INHERITANCE_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Initializer = new EcoreExecutorType(Java_Package.Literals.INITIALIZER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InstanceofExpression = new EcoreExecutorType(Java_Package.Literals.INSTANCEOF_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _InterfaceDeclaration = new EcoreExecutorType(Java_Package.Literals.INTERFACE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Javadoc = new EcoreExecutorType(Java_Package.Literals.JAVADOC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _LabeledStatement = new EcoreExecutorType(Java_Package.Literals.LABELED_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _LineComment = new EcoreExecutorType(Java_Package.Literals.LINE_COMMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manifest = new EcoreExecutorType(Java_Package.Literals.MANIFEST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ManifestAttribute = new EcoreExecutorType(Java_Package.Literals.MANIFEST_ATTRIBUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ManifestEntry = new EcoreExecutorType(Java_Package.Literals.MANIFEST_ENTRY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MemberRef = new EcoreExecutorType(Java_Package.Literals.MEMBER_REF, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MethodDeclaration = new EcoreExecutorType(Java_Package.Literals.METHOD_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MethodInvocation = new EcoreExecutorType(Java_Package.Literals.METHOD_INVOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MethodRef = new EcoreExecutorType(Java_Package.Literals.METHOD_REF, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MethodRefParameter = new EcoreExecutorType(Java_Package.Literals.METHOD_REF_PARAMETER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Model = new EcoreExecutorType(Java_Package.Literals.MODEL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Modifier = new EcoreExecutorType(Java_Package.Literals.MODIFIER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NamedElement = new EcoreExecutorType(Java_Package.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _NamespaceAccess = new EcoreExecutorType(Java_Package.Literals.NAMESPACE_ACCESS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _NullLiteral = new EcoreExecutorType(Java_Package.Literals.NULL_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NumberLiteral = new EcoreExecutorType(Java_Package.Literals.NUMBER_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Package = new EcoreExecutorType(Java_Package.Literals.PACKAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PackageAccess = new EcoreExecutorType(Java_Package.Literals.PACKAGE_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ParameterizedType = new EcoreExecutorType(Java_Package.Literals.PARAMETERIZED_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ParenthesizedExpression = new EcoreExecutorType(Java_Package.Literals.PARENTHESIZED_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PostfixExpression = new EcoreExecutorType(Java_Package.Literals.POSTFIX_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _PostfixExpressionKind = new EcoreExecutorEnumeration(Java_Package.Literals.POSTFIX_EXPRESSION_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrefixExpression = new EcoreExecutorType(Java_Package.Literals.PREFIX_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _PrefixExpressionKind = new EcoreExecutorEnumeration(Java_Package.Literals.PREFIX_EXPRESSION_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveType = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeBoolean = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_BOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeByte = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_BYTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeChar = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_CHAR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeDouble = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_DOUBLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeFloat = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_FLOAT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeInt = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_INT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeLong = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_LONG, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeShort = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_SHORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PrimitiveTypeVoid = new EcoreExecutorType(Java_Package.Literals.PRIMITIVE_TYPE_VOID, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _QueryCollection = new EcoreExecutorType(Java_Package.Literals.QUERY_COLLECTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ReturnStatement = new EcoreExecutorType(Java_Package.Literals.RETURN_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SingleVariableAccess = new EcoreExecutorType(Java_Package.Literals.SINGLE_VARIABLE_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SingleVariableDeclaration = new EcoreExecutorType(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Statement = new EcoreExecutorType(Java_Package.Literals.STATEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _StringLiteral = new EcoreExecutorType(Java_Package.Literals.STRING_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SuperConstructorInvocation = new EcoreExecutorType(Java_Package.Literals.SUPER_CONSTRUCTOR_INVOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SuperFieldAccess = new EcoreExecutorType(Java_Package.Literals.SUPER_FIELD_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SuperMethodInvocation = new EcoreExecutorType(Java_Package.Literals.SUPER_METHOD_INVOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SwitchCase = new EcoreExecutorType(Java_Package.Literals.SWITCH_CASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SwitchStatement = new EcoreExecutorType(Java_Package.Literals.SWITCH_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SynchronizedStatement = new EcoreExecutorType(Java_Package.Literals.SYNCHRONIZED_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TagElement = new EcoreExecutorType(Java_Package.Literals.TAG_ELEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TextElement = new EcoreExecutorType(Java_Package.Literals.TEXT_ELEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ThisExpression = new EcoreExecutorType(Java_Package.Literals.THIS_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ThrowStatement = new EcoreExecutorType(Java_Package.Literals.THROW_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TryStatement = new EcoreExecutorType(Java_Package.Literals.TRY_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Type = new EcoreExecutorType(Java_Package.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _TypeAccess = new EcoreExecutorType(Java_Package.Literals.TYPE_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TypeDeclaration = new EcoreExecutorType(Java_Package.Literals.TYPE_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _TypeDeclarationStatement = new EcoreExecutorType(Java_Package.Literals.TYPE_DECLARATION_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TypeLiteral = new EcoreExecutorType(Java_Package.Literals.TYPE_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TypeParameter = new EcoreExecutorType(Java_Package.Literals.TYPE_PARAMETER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedAnnotationDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_ANNOTATION_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedAnnotationTypeMemberDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedClassDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_CLASS_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedEnumDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_ENUM_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedInterfaceDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_INTERFACE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedItem = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_ITEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedItemAccess = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_ITEM_ACCESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedLabeledStatement = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_LABELED_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedMethodDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_METHOD_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedSingleVariableDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_SINGLE_VARIABLE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedType = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedTypeDeclaration = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_TYPE_DECLARATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _UnresolvedVariableDeclarationFragment = new EcoreExecutorType(Java_Package.Literals.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VariableDeclaration = new EcoreExecutorType(Java_Package.Literals.VARIABLE_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _VariableDeclarationExpression = new EcoreExecutorType(Java_Package.Literals.VARIABLE_DECLARATION_EXPRESSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VariableDeclarationFragment = new EcoreExecutorType(Java_Package.Literals.VARIABLE_DECLARATION_FRAGMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VariableDeclarationStatement = new EcoreExecutorType(Java_Package.Literals.VARIABLE_DECLARATION_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _VisibilityKind = new EcoreExecutorEnumeration(Java_Package.Literals.VISIBILITY_KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _WhileStatement = new EcoreExecutorType(Java_Package.Literals.WHILE_STATEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _WildCardType = new EcoreExecutorType(Java_Package.Literals.WILD_CARD_TYPE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_ASTNode,
			_AbstractMethodDeclaration,
			_AbstractMethodInvocation,
			_AbstractTypeDeclaration,
			_AbstractTypeQualifiedExpression,
			_AbstractVariablesContainer,
			_Annotation,
			_AnnotationMemberValuePair,
			_AnnotationTypeDeclaration,
			_AnnotationTypeMemberDeclaration,
			_AnonymousClassDeclaration,
			_Archive,
			_ArrayAccess,
			_ArrayCreation,
			_ArrayInitializer,
			_ArrayLengthAccess,
			_ArrayType,
			_AssertStatement,
			_Assignment,
			_AssignmentKind,
			_Block,
			_BlockComment,
			_BodyDeclaration,
			_BooleanLiteral,
			_BreakStatement,
			_CastExpression,
			_CatchClause,
			_CharacterLiteral,
			_ClassDeclaration,
			_ClassFile,
			_ClassInstanceCreation,
			_Comment,
			_CompilationUnit,
			_ConditionalExpression,
			_ConstructorDeclaration,
			_ConstructorInvocation,
			_ContinueStatement,
			_DoStatement,
			_EmptyStatement,
			_EnhancedForStatement,
			_EnumConstantDeclaration,
			_EnumDeclaration,
			_Expression,
			_ExpressionStatement,
			_FieldAccess,
			_FieldDeclaration,
			_ForStatement,
			_IfStatement,
			_ImportDeclaration,
			_InfixExpression,
			_InfixExpressionKind,
			_InheritanceKind,
			_Initializer,
			_InstanceofExpression,
			_InterfaceDeclaration,
			_Javadoc,
			_LabeledStatement,
			_LineComment,
			_Manifest,
			_ManifestAttribute,
			_ManifestEntry,
			_MemberRef,
			_MethodDeclaration,
			_MethodInvocation,
			_MethodRef,
			_MethodRefParameter,
			_Model,
			_Modifier,
			_NamedElement,
			_NamespaceAccess,
			_NullLiteral,
			_NumberLiteral,
			_Package,
			_PackageAccess,
			_ParameterizedType,
			_ParenthesizedExpression,
			_PostfixExpression,
			_PostfixExpressionKind,
			_PrefixExpression,
			_PrefixExpressionKind,
			_PrimitiveType,
			_PrimitiveTypeBoolean,
			_PrimitiveTypeByte,
			_PrimitiveTypeChar,
			_PrimitiveTypeDouble,
			_PrimitiveTypeFloat,
			_PrimitiveTypeInt,
			_PrimitiveTypeLong,
			_PrimitiveTypeShort,
			_PrimitiveTypeVoid,
			_QueryCollection,
			_ReturnStatement,
			_SingleVariableAccess,
			_SingleVariableDeclaration,
			_Statement,
			_StringLiteral,
			_SuperConstructorInvocation,
			_SuperFieldAccess,
			_SuperMethodInvocation,
			_SwitchCase,
			_SwitchStatement,
			_SynchronizedStatement,
			_TagElement,
			_TextElement,
			_ThisExpression,
			_ThrowStatement,
			_TryStatement,
			_Type,
			_TypeAccess,
			_TypeDeclaration,
			_TypeDeclarationStatement,
			_TypeLiteral,
			_TypeParameter,
			_UnresolvedAnnotationDeclaration,
			_UnresolvedAnnotationTypeMemberDeclaration,
			_UnresolvedClassDeclaration,
			_UnresolvedEnumDeclaration,
			_UnresolvedInterfaceDeclaration,
			_UnresolvedItem,
			_UnresolvedItemAccess,
			_UnresolvedLabeledStatement,
			_UnresolvedMethodDeclaration,
			_UnresolvedSingleVariableDeclaration,
			_UnresolvedType,
			_UnresolvedTypeDeclaration,
			_UnresolvedVariableDeclarationFragment,
			_VariableDeclaration,
			_VariableDeclarationExpression,
			_VariableDeclarationFragment,
			_VariableDeclarationStatement,
			_VisibilityKind,
			_WhileStatement,
			_WildCardType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _ASTNode__ASTNode = new ExecutorFragment(Types._ASTNode, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ASTNode__OclAny = new ExecutorFragment(Types._ASTNode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ASTNode__OclElement = new ExecutorFragment(Types._ASTNode, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__ASTNode = new ExecutorFragment(Types._AbstractMethodDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__AbstractMethodDeclaration = new ExecutorFragment(Types._AbstractMethodDeclaration, Java_Tables.Types._AbstractMethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__BodyDeclaration = new ExecutorFragment(Types._AbstractMethodDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__NamedElement = new ExecutorFragment(Types._AbstractMethodDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__OclAny = new ExecutorFragment(Types._AbstractMethodDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodDeclaration__OclElement = new ExecutorFragment(Types._AbstractMethodDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodInvocation__ASTNode = new ExecutorFragment(Types._AbstractMethodInvocation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodInvocation__AbstractMethodInvocation = new ExecutorFragment(Types._AbstractMethodInvocation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodInvocation__OclAny = new ExecutorFragment(Types._AbstractMethodInvocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AbstractMethodInvocation__OclElement = new ExecutorFragment(Types._AbstractMethodInvocation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__ASTNode = new ExecutorFragment(Types._AbstractTypeDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._AbstractTypeDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__BodyDeclaration = new ExecutorFragment(Types._AbstractTypeDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__NamedElement = new ExecutorFragment(Types._AbstractTypeDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__OclAny = new ExecutorFragment(Types._AbstractTypeDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__OclElement = new ExecutorFragment(Types._AbstractTypeDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeDeclaration__Type = new ExecutorFragment(Types._AbstractTypeDeclaration, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeQualifiedExpression__ASTNode = new ExecutorFragment(Types._AbstractTypeQualifiedExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression = new ExecutorFragment(Types._AbstractTypeQualifiedExpression, Java_Tables.Types._AbstractTypeQualifiedExpression);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeQualifiedExpression__Expression = new ExecutorFragment(Types._AbstractTypeQualifiedExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeQualifiedExpression__OclAny = new ExecutorFragment(Types._AbstractTypeQualifiedExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AbstractTypeQualifiedExpression__OclElement = new ExecutorFragment(Types._AbstractTypeQualifiedExpression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AbstractVariablesContainer__ASTNode = new ExecutorFragment(Types._AbstractVariablesContainer, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AbstractVariablesContainer__AbstractVariablesContainer = new ExecutorFragment(Types._AbstractVariablesContainer, Java_Tables.Types._AbstractVariablesContainer);
		private static final /*@NonNull*/ ExecutorFragment _AbstractVariablesContainer__OclAny = new ExecutorFragment(Types._AbstractVariablesContainer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AbstractVariablesContainer__OclElement = new ExecutorFragment(Types._AbstractVariablesContainer, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Annotation__ASTNode = new ExecutorFragment(Types._Annotation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__Annotation = new ExecutorFragment(Types._Annotation, Java_Tables.Types._Annotation);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__Expression = new ExecutorFragment(Types._Annotation, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__OclAny = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__OclElement = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AnnotationMemberValuePair__ASTNode = new ExecutorFragment(Types._AnnotationMemberValuePair, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationMemberValuePair__AnnotationMemberValuePair = new ExecutorFragment(Types._AnnotationMemberValuePair, Java_Tables.Types._AnnotationMemberValuePair);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationMemberValuePair__NamedElement = new ExecutorFragment(Types._AnnotationMemberValuePair, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationMemberValuePair__OclAny = new ExecutorFragment(Types._AnnotationMemberValuePair, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationMemberValuePair__OclElement = new ExecutorFragment(Types._AnnotationMemberValuePair, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__ASTNode = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__AnnotationTypeDeclaration = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._AnnotationTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__BodyDeclaration = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__NamedElement = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__OclAny = new ExecutorFragment(Types._AnnotationTypeDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__OclElement = new ExecutorFragment(Types._AnnotationTypeDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeDeclaration__Type = new ExecutorFragment(Types._AnnotationTypeDeclaration, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__ASTNode = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, Java_Tables.Types._AnnotationTypeMemberDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__BodyDeclaration = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__NamedElement = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__OclAny = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AnnotationTypeMemberDeclaration__OclElement = new ExecutorFragment(Types._AnnotationTypeMemberDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AnonymousClassDeclaration__ASTNode = new ExecutorFragment(Types._AnonymousClassDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AnonymousClassDeclaration__AnonymousClassDeclaration = new ExecutorFragment(Types._AnonymousClassDeclaration, Java_Tables.Types._AnonymousClassDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _AnonymousClassDeclaration__OclAny = new ExecutorFragment(Types._AnonymousClassDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AnonymousClassDeclaration__OclElement = new ExecutorFragment(Types._AnonymousClassDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Archive__ASTNode = new ExecutorFragment(Types._Archive, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Archive__Archive = new ExecutorFragment(Types._Archive, Java_Tables.Types._Archive);
		private static final /*@NonNull*/ ExecutorFragment _Archive__NamedElement = new ExecutorFragment(Types._Archive, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Archive__OclAny = new ExecutorFragment(Types._Archive, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Archive__OclElement = new ExecutorFragment(Types._Archive, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayAccess__ASTNode = new ExecutorFragment(Types._ArrayAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ArrayAccess__ArrayAccess = new ExecutorFragment(Types._ArrayAccess, Java_Tables.Types._ArrayAccess);
		private static final /*@NonNull*/ ExecutorFragment _ArrayAccess__Expression = new ExecutorFragment(Types._ArrayAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ArrayAccess__OclAny = new ExecutorFragment(Types._ArrayAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayAccess__OclElement = new ExecutorFragment(Types._ArrayAccess, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayCreation__ASTNode = new ExecutorFragment(Types._ArrayCreation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ArrayCreation__ArrayCreation = new ExecutorFragment(Types._ArrayCreation, Java_Tables.Types._ArrayCreation);
		private static final /*@NonNull*/ ExecutorFragment _ArrayCreation__Expression = new ExecutorFragment(Types._ArrayCreation, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ArrayCreation__OclAny = new ExecutorFragment(Types._ArrayCreation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayCreation__OclElement = new ExecutorFragment(Types._ArrayCreation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayInitializer__ASTNode = new ExecutorFragment(Types._ArrayInitializer, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ArrayInitializer__ArrayInitializer = new ExecutorFragment(Types._ArrayInitializer, Java_Tables.Types._ArrayInitializer);
		private static final /*@NonNull*/ ExecutorFragment _ArrayInitializer__Expression = new ExecutorFragment(Types._ArrayInitializer, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ArrayInitializer__OclAny = new ExecutorFragment(Types._ArrayInitializer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayInitializer__OclElement = new ExecutorFragment(Types._ArrayInitializer, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayLengthAccess__ASTNode = new ExecutorFragment(Types._ArrayLengthAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ArrayLengthAccess__ArrayLengthAccess = new ExecutorFragment(Types._ArrayLengthAccess, Java_Tables.Types._ArrayLengthAccess);
		private static final /*@NonNull*/ ExecutorFragment _ArrayLengthAccess__Expression = new ExecutorFragment(Types._ArrayLengthAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ArrayLengthAccess__OclAny = new ExecutorFragment(Types._ArrayLengthAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayLengthAccess__OclElement = new ExecutorFragment(Types._ArrayLengthAccess, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayType__ASTNode = new ExecutorFragment(Types._ArrayType, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__ArrayType = new ExecutorFragment(Types._ArrayType, Java_Tables.Types._ArrayType);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__NamedElement = new ExecutorFragment(Types._ArrayType, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__OclAny = new ExecutorFragment(Types._ArrayType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__OclElement = new ExecutorFragment(Types._ArrayType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__Type = new ExecutorFragment(Types._ArrayType, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _AssertStatement__ASTNode = new ExecutorFragment(Types._AssertStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _AssertStatement__AssertStatement = new ExecutorFragment(Types._AssertStatement, Java_Tables.Types._AssertStatement);
		private static final /*@NonNull*/ ExecutorFragment _AssertStatement__OclAny = new ExecutorFragment(Types._AssertStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AssertStatement__OclElement = new ExecutorFragment(Types._AssertStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AssertStatement__Statement = new ExecutorFragment(Types._AssertStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _Assignment__ASTNode = new ExecutorFragment(Types._Assignment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Assignment__Assignment = new ExecutorFragment(Types._Assignment, Java_Tables.Types._Assignment);
		private static final /*@NonNull*/ ExecutorFragment _Assignment__Expression = new ExecutorFragment(Types._Assignment, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _Assignment__OclAny = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Assignment__OclElement = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AssignmentKind__AssignmentKind = new ExecutorFragment(Types._AssignmentKind, Java_Tables.Types._AssignmentKind);
		private static final /*@NonNull*/ ExecutorFragment _AssignmentKind__OclAny = new ExecutorFragment(Types._AssignmentKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AssignmentKind__OclElement = new ExecutorFragment(Types._AssignmentKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AssignmentKind__OclEnumeration = new ExecutorFragment(Types._AssignmentKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AssignmentKind__OclType = new ExecutorFragment(Types._AssignmentKind, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Block__ASTNode = new ExecutorFragment(Types._Block, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Block__Block = new ExecutorFragment(Types._Block, Java_Tables.Types._Block);
		private static final /*@NonNull*/ ExecutorFragment _Block__OclAny = new ExecutorFragment(Types._Block, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Block__OclElement = new ExecutorFragment(Types._Block, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Block__Statement = new ExecutorFragment(Types._Block, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _BlockComment__ASTNode = new ExecutorFragment(Types._BlockComment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _BlockComment__BlockComment = new ExecutorFragment(Types._BlockComment, Java_Tables.Types._BlockComment);
		private static final /*@NonNull*/ ExecutorFragment _BlockComment__Comment = new ExecutorFragment(Types._BlockComment, Java_Tables.Types._Comment);
		private static final /*@NonNull*/ ExecutorFragment _BlockComment__OclAny = new ExecutorFragment(Types._BlockComment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BlockComment__OclElement = new ExecutorFragment(Types._BlockComment, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _BodyDeclaration__ASTNode = new ExecutorFragment(Types._BodyDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _BodyDeclaration__BodyDeclaration = new ExecutorFragment(Types._BodyDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _BodyDeclaration__NamedElement = new ExecutorFragment(Types._BodyDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _BodyDeclaration__OclAny = new ExecutorFragment(Types._BodyDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BodyDeclaration__OclElement = new ExecutorFragment(Types._BodyDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _BooleanLiteral__ASTNode = new ExecutorFragment(Types._BooleanLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _BooleanLiteral__BooleanLiteral = new ExecutorFragment(Types._BooleanLiteral, Java_Tables.Types._BooleanLiteral);
		private static final /*@NonNull*/ ExecutorFragment _BooleanLiteral__Expression = new ExecutorFragment(Types._BooleanLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _BooleanLiteral__OclAny = new ExecutorFragment(Types._BooleanLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BooleanLiteral__OclElement = new ExecutorFragment(Types._BooleanLiteral, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _BreakStatement__ASTNode = new ExecutorFragment(Types._BreakStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _BreakStatement__BreakStatement = new ExecutorFragment(Types._BreakStatement, Java_Tables.Types._BreakStatement);
		private static final /*@NonNull*/ ExecutorFragment _BreakStatement__OclAny = new ExecutorFragment(Types._BreakStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BreakStatement__OclElement = new ExecutorFragment(Types._BreakStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _BreakStatement__Statement = new ExecutorFragment(Types._BreakStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _CastExpression__ASTNode = new ExecutorFragment(Types._CastExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _CastExpression__CastExpression = new ExecutorFragment(Types._CastExpression, Java_Tables.Types._CastExpression);
		private static final /*@NonNull*/ ExecutorFragment _CastExpression__Expression = new ExecutorFragment(Types._CastExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _CastExpression__OclAny = new ExecutorFragment(Types._CastExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CastExpression__OclElement = new ExecutorFragment(Types._CastExpression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CatchClause__ASTNode = new ExecutorFragment(Types._CatchClause, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _CatchClause__CatchClause = new ExecutorFragment(Types._CatchClause, Java_Tables.Types._CatchClause);
		private static final /*@NonNull*/ ExecutorFragment _CatchClause__OclAny = new ExecutorFragment(Types._CatchClause, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CatchClause__OclElement = new ExecutorFragment(Types._CatchClause, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _CatchClause__Statement = new ExecutorFragment(Types._CatchClause, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _CharacterLiteral__ASTNode = new ExecutorFragment(Types._CharacterLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _CharacterLiteral__CharacterLiteral = new ExecutorFragment(Types._CharacterLiteral, Java_Tables.Types._CharacterLiteral);
		private static final /*@NonNull*/ ExecutorFragment _CharacterLiteral__Expression = new ExecutorFragment(Types._CharacterLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _CharacterLiteral__OclAny = new ExecutorFragment(Types._CharacterLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CharacterLiteral__OclElement = new ExecutorFragment(Types._CharacterLiteral, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__ASTNode = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__BodyDeclaration = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__ClassDeclaration = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._ClassDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__NamedElement = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__OclAny = new ExecutorFragment(Types._ClassDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__OclElement = new ExecutorFragment(Types._ClassDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__Type = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _ClassDeclaration__TypeDeclaration = new ExecutorFragment(Types._ClassDeclaration, Java_Tables.Types._TypeDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _ClassFile__ASTNode = new ExecutorFragment(Types._ClassFile, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ClassFile__ClassFile = new ExecutorFragment(Types._ClassFile, Java_Tables.Types._ClassFile);
		private static final /*@NonNull*/ ExecutorFragment _ClassFile__NamedElement = new ExecutorFragment(Types._ClassFile, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ClassFile__OclAny = new ExecutorFragment(Types._ClassFile, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ClassFile__OclElement = new ExecutorFragment(Types._ClassFile, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__ASTNode = new ExecutorFragment(Types._ClassInstanceCreation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__AbstractMethodInvocation = new ExecutorFragment(Types._ClassInstanceCreation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__ClassInstanceCreation = new ExecutorFragment(Types._ClassInstanceCreation, Java_Tables.Types._ClassInstanceCreation);
		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__Expression = new ExecutorFragment(Types._ClassInstanceCreation, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__OclAny = new ExecutorFragment(Types._ClassInstanceCreation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ClassInstanceCreation__OclElement = new ExecutorFragment(Types._ClassInstanceCreation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Comment__ASTNode = new ExecutorFragment(Types._Comment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Comment__Comment = new ExecutorFragment(Types._Comment, Java_Tables.Types._Comment);
		private static final /*@NonNull*/ ExecutorFragment _Comment__OclAny = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Comment__OclElement = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CompilationUnit__ASTNode = new ExecutorFragment(Types._CompilationUnit, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _CompilationUnit__CompilationUnit = new ExecutorFragment(Types._CompilationUnit, Java_Tables.Types._CompilationUnit);
		private static final /*@NonNull*/ ExecutorFragment _CompilationUnit__NamedElement = new ExecutorFragment(Types._CompilationUnit, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _CompilationUnit__OclAny = new ExecutorFragment(Types._CompilationUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CompilationUnit__OclElement = new ExecutorFragment(Types._CompilationUnit, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ConditionalExpression__ASTNode = new ExecutorFragment(Types._ConditionalExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ConditionalExpression__ConditionalExpression = new ExecutorFragment(Types._ConditionalExpression, Java_Tables.Types._ConditionalExpression);
		private static final /*@NonNull*/ ExecutorFragment _ConditionalExpression__Expression = new ExecutorFragment(Types._ConditionalExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ConditionalExpression__OclAny = new ExecutorFragment(Types._ConditionalExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ConditionalExpression__OclElement = new ExecutorFragment(Types._ConditionalExpression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__ASTNode = new ExecutorFragment(Types._ConstructorDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__AbstractMethodDeclaration = new ExecutorFragment(Types._ConstructorDeclaration, Java_Tables.Types._AbstractMethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__BodyDeclaration = new ExecutorFragment(Types._ConstructorDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__ConstructorDeclaration = new ExecutorFragment(Types._ConstructorDeclaration, Java_Tables.Types._ConstructorDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__NamedElement = new ExecutorFragment(Types._ConstructorDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__OclAny = new ExecutorFragment(Types._ConstructorDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorDeclaration__OclElement = new ExecutorFragment(Types._ConstructorDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__ASTNode = new ExecutorFragment(Types._ConstructorInvocation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__AbstractMethodInvocation = new ExecutorFragment(Types._ConstructorInvocation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__ConstructorInvocation = new ExecutorFragment(Types._ConstructorInvocation, Java_Tables.Types._ConstructorInvocation);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__OclAny = new ExecutorFragment(Types._ConstructorInvocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__OclElement = new ExecutorFragment(Types._ConstructorInvocation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ConstructorInvocation__Statement = new ExecutorFragment(Types._ConstructorInvocation, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _ContinueStatement__ASTNode = new ExecutorFragment(Types._ContinueStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ContinueStatement__ContinueStatement = new ExecutorFragment(Types._ContinueStatement, Java_Tables.Types._ContinueStatement);
		private static final /*@NonNull*/ ExecutorFragment _ContinueStatement__OclAny = new ExecutorFragment(Types._ContinueStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ContinueStatement__OclElement = new ExecutorFragment(Types._ContinueStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ContinueStatement__Statement = new ExecutorFragment(Types._ContinueStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _DoStatement__ASTNode = new ExecutorFragment(Types._DoStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _DoStatement__DoStatement = new ExecutorFragment(Types._DoStatement, Java_Tables.Types._DoStatement);
		private static final /*@NonNull*/ ExecutorFragment _DoStatement__OclAny = new ExecutorFragment(Types._DoStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DoStatement__OclElement = new ExecutorFragment(Types._DoStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _DoStatement__Statement = new ExecutorFragment(Types._DoStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _EmptyStatement__ASTNode = new ExecutorFragment(Types._EmptyStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _EmptyStatement__EmptyStatement = new ExecutorFragment(Types._EmptyStatement, Java_Tables.Types._EmptyStatement);
		private static final /*@NonNull*/ ExecutorFragment _EmptyStatement__OclAny = new ExecutorFragment(Types._EmptyStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EmptyStatement__OclElement = new ExecutorFragment(Types._EmptyStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _EmptyStatement__Statement = new ExecutorFragment(Types._EmptyStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _EnhancedForStatement__ASTNode = new ExecutorFragment(Types._EnhancedForStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _EnhancedForStatement__EnhancedForStatement = new ExecutorFragment(Types._EnhancedForStatement, Java_Tables.Types._EnhancedForStatement);
		private static final /*@NonNull*/ ExecutorFragment _EnhancedForStatement__OclAny = new ExecutorFragment(Types._EnhancedForStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EnhancedForStatement__OclElement = new ExecutorFragment(Types._EnhancedForStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _EnhancedForStatement__Statement = new ExecutorFragment(Types._EnhancedForStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__ASTNode = new ExecutorFragment(Types._EnumConstantDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__BodyDeclaration = new ExecutorFragment(Types._EnumConstantDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__EnumConstantDeclaration = new ExecutorFragment(Types._EnumConstantDeclaration, Java_Tables.Types._EnumConstantDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__NamedElement = new ExecutorFragment(Types._EnumConstantDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__OclAny = new ExecutorFragment(Types._EnumConstantDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__OclElement = new ExecutorFragment(Types._EnumConstantDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _EnumConstantDeclaration__VariableDeclaration = new ExecutorFragment(Types._EnumConstantDeclaration, Java_Tables.Types._VariableDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__ASTNode = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__BodyDeclaration = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__EnumDeclaration = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._EnumDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__NamedElement = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__OclAny = new ExecutorFragment(Types._EnumDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__OclElement = new ExecutorFragment(Types._EnumDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _EnumDeclaration__Type = new ExecutorFragment(Types._EnumDeclaration, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _Expression__ASTNode = new ExecutorFragment(Types._Expression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Expression__Expression = new ExecutorFragment(Types._Expression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _Expression__OclAny = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Expression__OclElement = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ExpressionStatement__ASTNode = new ExecutorFragment(Types._ExpressionStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ExpressionStatement__ExpressionStatement = new ExecutorFragment(Types._ExpressionStatement, Java_Tables.Types._ExpressionStatement);
		private static final /*@NonNull*/ ExecutorFragment _ExpressionStatement__OclAny = new ExecutorFragment(Types._ExpressionStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ExpressionStatement__OclElement = new ExecutorFragment(Types._ExpressionStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ExpressionStatement__Statement = new ExecutorFragment(Types._ExpressionStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _FieldAccess__ASTNode = new ExecutorFragment(Types._FieldAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _FieldAccess__Expression = new ExecutorFragment(Types._FieldAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _FieldAccess__FieldAccess = new ExecutorFragment(Types._FieldAccess, Java_Tables.Types._FieldAccess);
		private static final /*@NonNull*/ ExecutorFragment _FieldAccess__OclAny = new ExecutorFragment(Types._FieldAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FieldAccess__OclElement = new ExecutorFragment(Types._FieldAccess, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__ASTNode = new ExecutorFragment(Types._FieldDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__AbstractVariablesContainer = new ExecutorFragment(Types._FieldDeclaration, Java_Tables.Types._AbstractVariablesContainer);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__BodyDeclaration = new ExecutorFragment(Types._FieldDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__FieldDeclaration = new ExecutorFragment(Types._FieldDeclaration, Java_Tables.Types._FieldDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__NamedElement = new ExecutorFragment(Types._FieldDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__OclAny = new ExecutorFragment(Types._FieldDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FieldDeclaration__OclElement = new ExecutorFragment(Types._FieldDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ForStatement__ASTNode = new ExecutorFragment(Types._ForStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ForStatement__ForStatement = new ExecutorFragment(Types._ForStatement, Java_Tables.Types._ForStatement);
		private static final /*@NonNull*/ ExecutorFragment _ForStatement__OclAny = new ExecutorFragment(Types._ForStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ForStatement__OclElement = new ExecutorFragment(Types._ForStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ForStatement__Statement = new ExecutorFragment(Types._ForStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _IfStatement__ASTNode = new ExecutorFragment(Types._IfStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _IfStatement__IfStatement = new ExecutorFragment(Types._IfStatement, Java_Tables.Types._IfStatement);
		private static final /*@NonNull*/ ExecutorFragment _IfStatement__OclAny = new ExecutorFragment(Types._IfStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IfStatement__OclElement = new ExecutorFragment(Types._IfStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _IfStatement__Statement = new ExecutorFragment(Types._IfStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _ImportDeclaration__ASTNode = new ExecutorFragment(Types._ImportDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ImportDeclaration__ImportDeclaration = new ExecutorFragment(Types._ImportDeclaration, Java_Tables.Types._ImportDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _ImportDeclaration__OclAny = new ExecutorFragment(Types._ImportDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ImportDeclaration__OclElement = new ExecutorFragment(Types._ImportDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InfixExpression__ASTNode = new ExecutorFragment(Types._InfixExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpression__Expression = new ExecutorFragment(Types._InfixExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpression__InfixExpression = new ExecutorFragment(Types._InfixExpression, Java_Tables.Types._InfixExpression);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpression__OclAny = new ExecutorFragment(Types._InfixExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpression__OclElement = new ExecutorFragment(Types._InfixExpression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InfixExpressionKind__InfixExpressionKind = new ExecutorFragment(Types._InfixExpressionKind, Java_Tables.Types._InfixExpressionKind);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpressionKind__OclAny = new ExecutorFragment(Types._InfixExpressionKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpressionKind__OclElement = new ExecutorFragment(Types._InfixExpressionKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpressionKind__OclEnumeration = new ExecutorFragment(Types._InfixExpressionKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _InfixExpressionKind__OclType = new ExecutorFragment(Types._InfixExpressionKind, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _InheritanceKind__InheritanceKind = new ExecutorFragment(Types._InheritanceKind, Java_Tables.Types._InheritanceKind);
		private static final /*@NonNull*/ ExecutorFragment _InheritanceKind__OclAny = new ExecutorFragment(Types._InheritanceKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InheritanceKind__OclElement = new ExecutorFragment(Types._InheritanceKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InheritanceKind__OclEnumeration = new ExecutorFragment(Types._InheritanceKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _InheritanceKind__OclType = new ExecutorFragment(Types._InheritanceKind, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Initializer__ASTNode = new ExecutorFragment(Types._Initializer, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Initializer__BodyDeclaration = new ExecutorFragment(Types._Initializer, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _Initializer__Initializer = new ExecutorFragment(Types._Initializer, Java_Tables.Types._Initializer);
		private static final /*@NonNull*/ ExecutorFragment _Initializer__NamedElement = new ExecutorFragment(Types._Initializer, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Initializer__OclAny = new ExecutorFragment(Types._Initializer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Initializer__OclElement = new ExecutorFragment(Types._Initializer, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InstanceofExpression__ASTNode = new ExecutorFragment(Types._InstanceofExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _InstanceofExpression__Expression = new ExecutorFragment(Types._InstanceofExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _InstanceofExpression__InstanceofExpression = new ExecutorFragment(Types._InstanceofExpression, Java_Tables.Types._InstanceofExpression);
		private static final /*@NonNull*/ ExecutorFragment _InstanceofExpression__OclAny = new ExecutorFragment(Types._InstanceofExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InstanceofExpression__OclElement = new ExecutorFragment(Types._InstanceofExpression, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__ASTNode = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__BodyDeclaration = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__InterfaceDeclaration = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._InterfaceDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__NamedElement = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__OclAny = new ExecutorFragment(Types._InterfaceDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__OclElement = new ExecutorFragment(Types._InterfaceDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__Type = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _InterfaceDeclaration__TypeDeclaration = new ExecutorFragment(Types._InterfaceDeclaration, Java_Tables.Types._TypeDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _Javadoc__ASTNode = new ExecutorFragment(Types._Javadoc, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Javadoc__Comment = new ExecutorFragment(Types._Javadoc, Java_Tables.Types._Comment);
		private static final /*@NonNull*/ ExecutorFragment _Javadoc__Javadoc = new ExecutorFragment(Types._Javadoc, Java_Tables.Types._Javadoc);
		private static final /*@NonNull*/ ExecutorFragment _Javadoc__OclAny = new ExecutorFragment(Types._Javadoc, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Javadoc__OclElement = new ExecutorFragment(Types._Javadoc, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__ASTNode = new ExecutorFragment(Types._LabeledStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__LabeledStatement = new ExecutorFragment(Types._LabeledStatement, Java_Tables.Types._LabeledStatement);
		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__NamedElement = new ExecutorFragment(Types._LabeledStatement, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__OclAny = new ExecutorFragment(Types._LabeledStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__OclElement = new ExecutorFragment(Types._LabeledStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _LabeledStatement__Statement = new ExecutorFragment(Types._LabeledStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _LineComment__ASTNode = new ExecutorFragment(Types._LineComment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _LineComment__Comment = new ExecutorFragment(Types._LineComment, Java_Tables.Types._Comment);
		private static final /*@NonNull*/ ExecutorFragment _LineComment__LineComment = new ExecutorFragment(Types._LineComment, Java_Tables.Types._LineComment);
		private static final /*@NonNull*/ ExecutorFragment _LineComment__OclAny = new ExecutorFragment(Types._LineComment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _LineComment__OclElement = new ExecutorFragment(Types._LineComment, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Manifest__Manifest = new ExecutorFragment(Types._Manifest, Java_Tables.Types._Manifest);
		private static final /*@NonNull*/ ExecutorFragment _Manifest__OclAny = new ExecutorFragment(Types._Manifest, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manifest__OclElement = new ExecutorFragment(Types._Manifest, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ManifestAttribute__ManifestAttribute = new ExecutorFragment(Types._ManifestAttribute, Java_Tables.Types._ManifestAttribute);
		private static final /*@NonNull*/ ExecutorFragment _ManifestAttribute__OclAny = new ExecutorFragment(Types._ManifestAttribute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ManifestAttribute__OclElement = new ExecutorFragment(Types._ManifestAttribute, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ManifestEntry__ManifestEntry = new ExecutorFragment(Types._ManifestEntry, Java_Tables.Types._ManifestEntry);
		private static final /*@NonNull*/ ExecutorFragment _ManifestEntry__OclAny = new ExecutorFragment(Types._ManifestEntry, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ManifestEntry__OclElement = new ExecutorFragment(Types._ManifestEntry, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MemberRef__ASTNode = new ExecutorFragment(Types._MemberRef, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _MemberRef__MemberRef = new ExecutorFragment(Types._MemberRef, Java_Tables.Types._MemberRef);
		private static final /*@NonNull*/ ExecutorFragment _MemberRef__OclAny = new ExecutorFragment(Types._MemberRef, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MemberRef__OclElement = new ExecutorFragment(Types._MemberRef, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__ASTNode = new ExecutorFragment(Types._MethodDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__AbstractMethodDeclaration = new ExecutorFragment(Types._MethodDeclaration, Java_Tables.Types._AbstractMethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__BodyDeclaration = new ExecutorFragment(Types._MethodDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__MethodDeclaration = new ExecutorFragment(Types._MethodDeclaration, Java_Tables.Types._MethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__NamedElement = new ExecutorFragment(Types._MethodDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__OclAny = new ExecutorFragment(Types._MethodDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MethodDeclaration__OclElement = new ExecutorFragment(Types._MethodDeclaration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__ASTNode = new ExecutorFragment(Types._MethodInvocation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__AbstractMethodInvocation = new ExecutorFragment(Types._MethodInvocation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__Expression = new ExecutorFragment(Types._MethodInvocation, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__MethodInvocation = new ExecutorFragment(Types._MethodInvocation, Java_Tables.Types._MethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__OclAny = new ExecutorFragment(Types._MethodInvocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MethodInvocation__OclElement = new ExecutorFragment(Types._MethodInvocation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MethodRef__ASTNode = new ExecutorFragment(Types._MethodRef, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _MethodRef__MethodRef = new ExecutorFragment(Types._MethodRef, Java_Tables.Types._MethodRef);
		private static final /*@NonNull*/ ExecutorFragment _MethodRef__OclAny = new ExecutorFragment(Types._MethodRef, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MethodRef__OclElement = new ExecutorFragment(Types._MethodRef, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MethodRefParameter__ASTNode = new ExecutorFragment(Types._MethodRefParameter, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _MethodRefParameter__MethodRefParameter = new ExecutorFragment(Types._MethodRefParameter, Java_Tables.Types._MethodRefParameter);
		private static final /*@NonNull*/ ExecutorFragment _MethodRefParameter__OclAny = new ExecutorFragment(Types._MethodRefParameter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MethodRefParameter__OclElement = new ExecutorFragment(Types._MethodRefParameter, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, Java_Tables.Types._Model);
		private static final /*@NonNull*/ ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Modifier__ASTNode = new ExecutorFragment(Types._Modifier, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Modifier__Modifier = new ExecutorFragment(Types._Modifier, Java_Tables.Types._Modifier);
		private static final /*@NonNull*/ ExecutorFragment _Modifier__OclAny = new ExecutorFragment(Types._Modifier, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Modifier__OclElement = new ExecutorFragment(Types._Modifier, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NamedElement__ASTNode = new ExecutorFragment(Types._NamedElement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NamespaceAccess__ASTNode = new ExecutorFragment(Types._NamespaceAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _NamespaceAccess__NamespaceAccess = new ExecutorFragment(Types._NamespaceAccess, Java_Tables.Types._NamespaceAccess);
		private static final /*@NonNull*/ ExecutorFragment _NamespaceAccess__OclAny = new ExecutorFragment(Types._NamespaceAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NamespaceAccess__OclElement = new ExecutorFragment(Types._NamespaceAccess, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NullLiteral__ASTNode = new ExecutorFragment(Types._NullLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _NullLiteral__Expression = new ExecutorFragment(Types._NullLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _NullLiteral__NullLiteral = new ExecutorFragment(Types._NullLiteral, Java_Tables.Types._NullLiteral);
		private static final /*@NonNull*/ ExecutorFragment _NullLiteral__OclAny = new ExecutorFragment(Types._NullLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NullLiteral__OclElement = new ExecutorFragment(Types._NullLiteral, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NumberLiteral__ASTNode = new ExecutorFragment(Types._NumberLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _NumberLiteral__Expression = new ExecutorFragment(Types._NumberLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _NumberLiteral__NumberLiteral = new ExecutorFragment(Types._NumberLiteral, Java_Tables.Types._NumberLiteral);
		private static final /*@NonNull*/ ExecutorFragment _NumberLiteral__OclAny = new ExecutorFragment(Types._NumberLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NumberLiteral__OclElement = new ExecutorFragment(Types._NumberLiteral, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Package__ASTNode = new ExecutorFragment(Types._Package, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Package__NamedElement = new ExecutorFragment(Types._Package, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Package__OclAny = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Package__OclElement = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Package__Package = new ExecutorFragment(Types._Package, Java_Tables.Types._Package);

		private static final /*@NonNull*/ ExecutorFragment _PackageAccess__ASTNode = new ExecutorFragment(Types._PackageAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PackageAccess__NamespaceAccess = new ExecutorFragment(Types._PackageAccess, Java_Tables.Types._NamespaceAccess);
		private static final /*@NonNull*/ ExecutorFragment _PackageAccess__OclAny = new ExecutorFragment(Types._PackageAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PackageAccess__OclElement = new ExecutorFragment(Types._PackageAccess, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageAccess__PackageAccess = new ExecutorFragment(Types._PackageAccess, Java_Tables.Types._PackageAccess);

		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__ASTNode = new ExecutorFragment(Types._ParameterizedType, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__NamedElement = new ExecutorFragment(Types._ParameterizedType, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__OclAny = new ExecutorFragment(Types._ParameterizedType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__OclElement = new ExecutorFragment(Types._ParameterizedType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__ParameterizedType = new ExecutorFragment(Types._ParameterizedType, Java_Tables.Types._ParameterizedType);
		private static final /*@NonNull*/ ExecutorFragment _ParameterizedType__Type = new ExecutorFragment(Types._ParameterizedType, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _ParenthesizedExpression__ASTNode = new ExecutorFragment(Types._ParenthesizedExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ParenthesizedExpression__Expression = new ExecutorFragment(Types._ParenthesizedExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ParenthesizedExpression__OclAny = new ExecutorFragment(Types._ParenthesizedExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ParenthesizedExpression__OclElement = new ExecutorFragment(Types._ParenthesizedExpression, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ParenthesizedExpression__ParenthesizedExpression = new ExecutorFragment(Types._ParenthesizedExpression, Java_Tables.Types._ParenthesizedExpression);

		private static final /*@NonNull*/ ExecutorFragment _PostfixExpression__ASTNode = new ExecutorFragment(Types._PostfixExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpression__Expression = new ExecutorFragment(Types._PostfixExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpression__OclAny = new ExecutorFragment(Types._PostfixExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpression__OclElement = new ExecutorFragment(Types._PostfixExpression, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpression__PostfixExpression = new ExecutorFragment(Types._PostfixExpression, Java_Tables.Types._PostfixExpression);

		private static final /*@NonNull*/ ExecutorFragment _PostfixExpressionKind__OclAny = new ExecutorFragment(Types._PostfixExpressionKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpressionKind__OclElement = new ExecutorFragment(Types._PostfixExpressionKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpressionKind__OclEnumeration = new ExecutorFragment(Types._PostfixExpressionKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpressionKind__OclType = new ExecutorFragment(Types._PostfixExpressionKind, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _PostfixExpressionKind__PostfixExpressionKind = new ExecutorFragment(Types._PostfixExpressionKind, Java_Tables.Types._PostfixExpressionKind);

		private static final /*@NonNull*/ ExecutorFragment _PrefixExpression__ASTNode = new ExecutorFragment(Types._PrefixExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpression__Expression = new ExecutorFragment(Types._PrefixExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpression__OclAny = new ExecutorFragment(Types._PrefixExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpression__OclElement = new ExecutorFragment(Types._PrefixExpression, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpression__PrefixExpression = new ExecutorFragment(Types._PrefixExpression, Java_Tables.Types._PrefixExpression);

		private static final /*@NonNull*/ ExecutorFragment _PrefixExpressionKind__OclAny = new ExecutorFragment(Types._PrefixExpressionKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpressionKind__OclElement = new ExecutorFragment(Types._PrefixExpressionKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpressionKind__OclEnumeration = new ExecutorFragment(Types._PrefixExpressionKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpressionKind__OclType = new ExecutorFragment(Types._PrefixExpressionKind, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _PrefixExpressionKind__PrefixExpressionKind = new ExecutorFragment(Types._PrefixExpressionKind, Java_Tables.Types._PrefixExpressionKind);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__ASTNode = new ExecutorFragment(Types._PrimitiveType, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__NamedElement = new ExecutorFragment(Types._PrimitiveType, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__OclAny = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__OclElement = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__PrimitiveType = new ExecutorFragment(Types._PrimitiveType, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveType__Type = new ExecutorFragment(Types._PrimitiveType, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__ASTNode = new ExecutorFragment(Types._PrimitiveTypeBoolean, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__NamedElement = new ExecutorFragment(Types._PrimitiveTypeBoolean, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__OclAny = new ExecutorFragment(Types._PrimitiveTypeBoolean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__OclElement = new ExecutorFragment(Types._PrimitiveTypeBoolean, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeBoolean, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__PrimitiveTypeBoolean = new ExecutorFragment(Types._PrimitiveTypeBoolean, Java_Tables.Types._PrimitiveTypeBoolean);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeBoolean__Type = new ExecutorFragment(Types._PrimitiveTypeBoolean, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__ASTNode = new ExecutorFragment(Types._PrimitiveTypeByte, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__NamedElement = new ExecutorFragment(Types._PrimitiveTypeByte, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__OclAny = new ExecutorFragment(Types._PrimitiveTypeByte, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__OclElement = new ExecutorFragment(Types._PrimitiveTypeByte, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeByte, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__PrimitiveTypeByte = new ExecutorFragment(Types._PrimitiveTypeByte, Java_Tables.Types._PrimitiveTypeByte);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeByte__Type = new ExecutorFragment(Types._PrimitiveTypeByte, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__ASTNode = new ExecutorFragment(Types._PrimitiveTypeChar, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__NamedElement = new ExecutorFragment(Types._PrimitiveTypeChar, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__OclAny = new ExecutorFragment(Types._PrimitiveTypeChar, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__OclElement = new ExecutorFragment(Types._PrimitiveTypeChar, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeChar, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__PrimitiveTypeChar = new ExecutorFragment(Types._PrimitiveTypeChar, Java_Tables.Types._PrimitiveTypeChar);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeChar__Type = new ExecutorFragment(Types._PrimitiveTypeChar, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__ASTNode = new ExecutorFragment(Types._PrimitiveTypeDouble, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__NamedElement = new ExecutorFragment(Types._PrimitiveTypeDouble, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__OclAny = new ExecutorFragment(Types._PrimitiveTypeDouble, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__OclElement = new ExecutorFragment(Types._PrimitiveTypeDouble, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeDouble, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__PrimitiveTypeDouble = new ExecutorFragment(Types._PrimitiveTypeDouble, Java_Tables.Types._PrimitiveTypeDouble);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeDouble__Type = new ExecutorFragment(Types._PrimitiveTypeDouble, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__ASTNode = new ExecutorFragment(Types._PrimitiveTypeFloat, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__NamedElement = new ExecutorFragment(Types._PrimitiveTypeFloat, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__OclAny = new ExecutorFragment(Types._PrimitiveTypeFloat, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__OclElement = new ExecutorFragment(Types._PrimitiveTypeFloat, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeFloat, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__PrimitiveTypeFloat = new ExecutorFragment(Types._PrimitiveTypeFloat, Java_Tables.Types._PrimitiveTypeFloat);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeFloat__Type = new ExecutorFragment(Types._PrimitiveTypeFloat, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__ASTNode = new ExecutorFragment(Types._PrimitiveTypeInt, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__NamedElement = new ExecutorFragment(Types._PrimitiveTypeInt, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__OclAny = new ExecutorFragment(Types._PrimitiveTypeInt, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__OclElement = new ExecutorFragment(Types._PrimitiveTypeInt, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeInt, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__PrimitiveTypeInt = new ExecutorFragment(Types._PrimitiveTypeInt, Java_Tables.Types._PrimitiveTypeInt);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeInt__Type = new ExecutorFragment(Types._PrimitiveTypeInt, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__ASTNode = new ExecutorFragment(Types._PrimitiveTypeLong, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__NamedElement = new ExecutorFragment(Types._PrimitiveTypeLong, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__OclAny = new ExecutorFragment(Types._PrimitiveTypeLong, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__OclElement = new ExecutorFragment(Types._PrimitiveTypeLong, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeLong, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__PrimitiveTypeLong = new ExecutorFragment(Types._PrimitiveTypeLong, Java_Tables.Types._PrimitiveTypeLong);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeLong__Type = new ExecutorFragment(Types._PrimitiveTypeLong, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__ASTNode = new ExecutorFragment(Types._PrimitiveTypeShort, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__NamedElement = new ExecutorFragment(Types._PrimitiveTypeShort, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__OclAny = new ExecutorFragment(Types._PrimitiveTypeShort, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__OclElement = new ExecutorFragment(Types._PrimitiveTypeShort, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeShort, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__PrimitiveTypeShort = new ExecutorFragment(Types._PrimitiveTypeShort, Java_Tables.Types._PrimitiveTypeShort);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeShort__Type = new ExecutorFragment(Types._PrimitiveTypeShort, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__ASTNode = new ExecutorFragment(Types._PrimitiveTypeVoid, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__NamedElement = new ExecutorFragment(Types._PrimitiveTypeVoid, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__OclAny = new ExecutorFragment(Types._PrimitiveTypeVoid, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__OclElement = new ExecutorFragment(Types._PrimitiveTypeVoid, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__PrimitiveType = new ExecutorFragment(Types._PrimitiveTypeVoid, Java_Tables.Types._PrimitiveType);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__PrimitiveTypeVoid = new ExecutorFragment(Types._PrimitiveTypeVoid, Java_Tables.Types._PrimitiveTypeVoid);
		private static final /*@NonNull*/ ExecutorFragment _PrimitiveTypeVoid__Type = new ExecutorFragment(Types._PrimitiveTypeVoid, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _QueryCollection__OclAny = new ExecutorFragment(Types._QueryCollection, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _QueryCollection__OclElement = new ExecutorFragment(Types._QueryCollection, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _QueryCollection__QueryCollection = new ExecutorFragment(Types._QueryCollection, Java_Tables.Types._QueryCollection);

		private static final /*@NonNull*/ ExecutorFragment _ReturnStatement__ASTNode = new ExecutorFragment(Types._ReturnStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ReturnStatement__OclAny = new ExecutorFragment(Types._ReturnStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ReturnStatement__OclElement = new ExecutorFragment(Types._ReturnStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ReturnStatement__ReturnStatement = new ExecutorFragment(Types._ReturnStatement, Java_Tables.Types._ReturnStatement);
		private static final /*@NonNull*/ ExecutorFragment _ReturnStatement__Statement = new ExecutorFragment(Types._ReturnStatement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _SingleVariableAccess__ASTNode = new ExecutorFragment(Types._SingleVariableAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableAccess__Expression = new ExecutorFragment(Types._SingleVariableAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableAccess__OclAny = new ExecutorFragment(Types._SingleVariableAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableAccess__OclElement = new ExecutorFragment(Types._SingleVariableAccess, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableAccess__SingleVariableAccess = new ExecutorFragment(Types._SingleVariableAccess, Java_Tables.Types._SingleVariableAccess);

		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__ASTNode = new ExecutorFragment(Types._SingleVariableDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__NamedElement = new ExecutorFragment(Types._SingleVariableDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__OclAny = new ExecutorFragment(Types._SingleVariableDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__OclElement = new ExecutorFragment(Types._SingleVariableDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__SingleVariableDeclaration = new ExecutorFragment(Types._SingleVariableDeclaration, Java_Tables.Types._SingleVariableDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _SingleVariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._SingleVariableDeclaration, Java_Tables.Types._VariableDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _Statement__ASTNode = new ExecutorFragment(Types._Statement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Statement__OclAny = new ExecutorFragment(Types._Statement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Statement__OclElement = new ExecutorFragment(Types._Statement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Statement__Statement = new ExecutorFragment(Types._Statement, Java_Tables.Types._Statement);

		private static final /*@NonNull*/ ExecutorFragment _StringLiteral__ASTNode = new ExecutorFragment(Types._StringLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _StringLiteral__Expression = new ExecutorFragment(Types._StringLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _StringLiteral__OclAny = new ExecutorFragment(Types._StringLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StringLiteral__OclElement = new ExecutorFragment(Types._StringLiteral, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StringLiteral__StringLiteral = new ExecutorFragment(Types._StringLiteral, Java_Tables.Types._StringLiteral);

		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__ASTNode = new ExecutorFragment(Types._SuperConstructorInvocation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__AbstractMethodInvocation = new ExecutorFragment(Types._SuperConstructorInvocation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__OclAny = new ExecutorFragment(Types._SuperConstructorInvocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__OclElement = new ExecutorFragment(Types._SuperConstructorInvocation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__Statement = new ExecutorFragment(Types._SuperConstructorInvocation, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _SuperConstructorInvocation__SuperConstructorInvocation = new ExecutorFragment(Types._SuperConstructorInvocation, Java_Tables.Types._SuperConstructorInvocation);

		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__ASTNode = new ExecutorFragment(Types._SuperFieldAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__AbstractTypeQualifiedExpression = new ExecutorFragment(Types._SuperFieldAccess, Java_Tables.Types._AbstractTypeQualifiedExpression);
		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__Expression = new ExecutorFragment(Types._SuperFieldAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__OclAny = new ExecutorFragment(Types._SuperFieldAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__OclElement = new ExecutorFragment(Types._SuperFieldAccess, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SuperFieldAccess__SuperFieldAccess = new ExecutorFragment(Types._SuperFieldAccess, Java_Tables.Types._SuperFieldAccess);

		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__ASTNode = new ExecutorFragment(Types._SuperMethodInvocation, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__AbstractMethodInvocation = new ExecutorFragment(Types._SuperMethodInvocation, Java_Tables.Types._AbstractMethodInvocation);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__AbstractTypeQualifiedExpression = new ExecutorFragment(Types._SuperMethodInvocation, Java_Tables.Types._AbstractTypeQualifiedExpression);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__Expression = new ExecutorFragment(Types._SuperMethodInvocation, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__OclAny = new ExecutorFragment(Types._SuperMethodInvocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__OclElement = new ExecutorFragment(Types._SuperMethodInvocation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SuperMethodInvocation__SuperMethodInvocation = new ExecutorFragment(Types._SuperMethodInvocation, Java_Tables.Types._SuperMethodInvocation);

		private static final /*@NonNull*/ ExecutorFragment _SwitchCase__ASTNode = new ExecutorFragment(Types._SwitchCase, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SwitchCase__OclAny = new ExecutorFragment(Types._SwitchCase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SwitchCase__OclElement = new ExecutorFragment(Types._SwitchCase, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SwitchCase__Statement = new ExecutorFragment(Types._SwitchCase, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _SwitchCase__SwitchCase = new ExecutorFragment(Types._SwitchCase, Java_Tables.Types._SwitchCase);

		private static final /*@NonNull*/ ExecutorFragment _SwitchStatement__ASTNode = new ExecutorFragment(Types._SwitchStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SwitchStatement__OclAny = new ExecutorFragment(Types._SwitchStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SwitchStatement__OclElement = new ExecutorFragment(Types._SwitchStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SwitchStatement__Statement = new ExecutorFragment(Types._SwitchStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _SwitchStatement__SwitchStatement = new ExecutorFragment(Types._SwitchStatement, Java_Tables.Types._SwitchStatement);

		private static final /*@NonNull*/ ExecutorFragment _SynchronizedStatement__ASTNode = new ExecutorFragment(Types._SynchronizedStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _SynchronizedStatement__OclAny = new ExecutorFragment(Types._SynchronizedStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SynchronizedStatement__OclElement = new ExecutorFragment(Types._SynchronizedStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SynchronizedStatement__Statement = new ExecutorFragment(Types._SynchronizedStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _SynchronizedStatement__SynchronizedStatement = new ExecutorFragment(Types._SynchronizedStatement, Java_Tables.Types._SynchronizedStatement);

		private static final /*@NonNull*/ ExecutorFragment _TagElement__ASTNode = new ExecutorFragment(Types._TagElement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TagElement__OclAny = new ExecutorFragment(Types._TagElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TagElement__OclElement = new ExecutorFragment(Types._TagElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TagElement__TagElement = new ExecutorFragment(Types._TagElement, Java_Tables.Types._TagElement);

		private static final /*@NonNull*/ ExecutorFragment _TextElement__ASTNode = new ExecutorFragment(Types._TextElement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TextElement__OclAny = new ExecutorFragment(Types._TextElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TextElement__OclElement = new ExecutorFragment(Types._TextElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TextElement__TextElement = new ExecutorFragment(Types._TextElement, Java_Tables.Types._TextElement);

		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__ASTNode = new ExecutorFragment(Types._ThisExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__AbstractTypeQualifiedExpression = new ExecutorFragment(Types._ThisExpression, Java_Tables.Types._AbstractTypeQualifiedExpression);
		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__Expression = new ExecutorFragment(Types._ThisExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__OclAny = new ExecutorFragment(Types._ThisExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__OclElement = new ExecutorFragment(Types._ThisExpression, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ThisExpression__ThisExpression = new ExecutorFragment(Types._ThisExpression, Java_Tables.Types._ThisExpression);

		private static final /*@NonNull*/ ExecutorFragment _ThrowStatement__ASTNode = new ExecutorFragment(Types._ThrowStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _ThrowStatement__OclAny = new ExecutorFragment(Types._ThrowStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ThrowStatement__OclElement = new ExecutorFragment(Types._ThrowStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ThrowStatement__Statement = new ExecutorFragment(Types._ThrowStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _ThrowStatement__ThrowStatement = new ExecutorFragment(Types._ThrowStatement, Java_Tables.Types._ThrowStatement);

		private static final /*@NonNull*/ ExecutorFragment _TryStatement__ASTNode = new ExecutorFragment(Types._TryStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TryStatement__OclAny = new ExecutorFragment(Types._TryStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TryStatement__OclElement = new ExecutorFragment(Types._TryStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TryStatement__Statement = new ExecutorFragment(Types._TryStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _TryStatement__TryStatement = new ExecutorFragment(Types._TryStatement, Java_Tables.Types._TryStatement);

		private static final /*@NonNull*/ ExecutorFragment _Type__ASTNode = new ExecutorFragment(Types._Type, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _Type__NamedElement = new ExecutorFragment(Types._Type, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, Java_Tables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__ASTNode = new ExecutorFragment(Types._TypeAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__Expression = new ExecutorFragment(Types._TypeAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__NamespaceAccess = new ExecutorFragment(Types._TypeAccess, Java_Tables.Types._NamespaceAccess);
		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__OclAny = new ExecutorFragment(Types._TypeAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__OclElement = new ExecutorFragment(Types._TypeAccess, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeAccess__TypeAccess = new ExecutorFragment(Types._TypeAccess, Java_Tables.Types._TypeAccess);

		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__ASTNode = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__BodyDeclaration = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__NamedElement = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__OclAny = new ExecutorFragment(Types._TypeDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__OclElement = new ExecutorFragment(Types._TypeDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__Type = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclaration__TypeDeclaration = new ExecutorFragment(Types._TypeDeclaration, Java_Tables.Types._TypeDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _TypeDeclarationStatement__ASTNode = new ExecutorFragment(Types._TypeDeclarationStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclarationStatement__OclAny = new ExecutorFragment(Types._TypeDeclarationStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclarationStatement__OclElement = new ExecutorFragment(Types._TypeDeclarationStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclarationStatement__Statement = new ExecutorFragment(Types._TypeDeclarationStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _TypeDeclarationStatement__TypeDeclarationStatement = new ExecutorFragment(Types._TypeDeclarationStatement, Java_Tables.Types._TypeDeclarationStatement);

		private static final /*@NonNull*/ ExecutorFragment _TypeLiteral__ASTNode = new ExecutorFragment(Types._TypeLiteral, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TypeLiteral__Expression = new ExecutorFragment(Types._TypeLiteral, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _TypeLiteral__OclAny = new ExecutorFragment(Types._TypeLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeLiteral__OclElement = new ExecutorFragment(Types._TypeLiteral, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeLiteral__TypeLiteral = new ExecutorFragment(Types._TypeLiteral, Java_Tables.Types._TypeLiteral);

		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__ASTNode = new ExecutorFragment(Types._TypeParameter, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__NamedElement = new ExecutorFragment(Types._TypeParameter, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__OclAny = new ExecutorFragment(Types._TypeParameter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__OclElement = new ExecutorFragment(Types._TypeParameter, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__Type = new ExecutorFragment(Types._TypeParameter, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _TypeParameter__TypeParameter = new ExecutorFragment(Types._TypeParameter, Java_Tables.Types._TypeParameter);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__AnnotationTypeDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._AnnotationTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__Type = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._UnresolvedAnnotationDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedAnnotationDeclaration, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._AnnotationTypeMemberDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._UnresolvedAnnotationTypeMemberDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedAnnotationTypeMemberDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedAnnotationTypeMemberDeclaration, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__ClassDeclaration = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._ClassDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedClassDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedClassDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__Type = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__TypeDeclaration = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._TypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__UnresolvedClassDeclaration = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._UnresolvedClassDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedClassDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedClassDeclaration, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__EnumDeclaration = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._EnumDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedEnumDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedEnumDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__Type = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__UnresolvedEnumDeclaration = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._UnresolvedEnumDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedEnumDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedEnumDeclaration, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__InterfaceDeclaration = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._InterfaceDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__Type = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__TypeDeclaration = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._TypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._UnresolvedInterfaceDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedInterfaceDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedInterfaceDeclaration, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItem__ASTNode = new ExecutorFragment(Types._UnresolvedItem, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItem__NamedElement = new ExecutorFragment(Types._UnresolvedItem, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItem__OclAny = new ExecutorFragment(Types._UnresolvedItem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItem__OclElement = new ExecutorFragment(Types._UnresolvedItem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItem__UnresolvedItem = new ExecutorFragment(Types._UnresolvedItem, Java_Tables.Types._UnresolvedItem);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__ASTNode = new ExecutorFragment(Types._UnresolvedItemAccess, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__Expression = new ExecutorFragment(Types._UnresolvedItemAccess, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__NamespaceAccess = new ExecutorFragment(Types._UnresolvedItemAccess, Java_Tables.Types._NamespaceAccess);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__OclAny = new ExecutorFragment(Types._UnresolvedItemAccess, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__OclElement = new ExecutorFragment(Types._UnresolvedItemAccess, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedItemAccess__UnresolvedItemAccess = new ExecutorFragment(Types._UnresolvedItemAccess, Java_Tables.Types._UnresolvedItemAccess);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__ASTNode = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__LabeledStatement = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._LabeledStatement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__NamedElement = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__OclAny = new ExecutorFragment(Types._UnresolvedLabeledStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__OclElement = new ExecutorFragment(Types._UnresolvedLabeledStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__Statement = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__UnresolvedItem = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedLabeledStatement__UnresolvedLabeledStatement = new ExecutorFragment(Types._UnresolvedLabeledStatement, Java_Tables.Types._UnresolvedLabeledStatement);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__AbstractMethodDeclaration = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._AbstractMethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__MethodDeclaration = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._MethodDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedMethodDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedMethodDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedMethodDeclaration__UnresolvedMethodDeclaration = new ExecutorFragment(Types._UnresolvedMethodDeclaration, Java_Tables.Types._UnresolvedMethodDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__SingleVariableDeclaration = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._SingleVariableDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._UnresolvedSingleVariableDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedSingleVariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._UnresolvedSingleVariableDeclaration, Java_Tables.Types._VariableDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__ASTNode = new ExecutorFragment(Types._UnresolvedType, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__NamedElement = new ExecutorFragment(Types._UnresolvedType, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__OclAny = new ExecutorFragment(Types._UnresolvedType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__OclElement = new ExecutorFragment(Types._UnresolvedType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__Type = new ExecutorFragment(Types._UnresolvedType, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__UnresolvedItem = new ExecutorFragment(Types._UnresolvedType, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedType__UnresolvedType = new ExecutorFragment(Types._UnresolvedType, Java_Tables.Types._UnresolvedType);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__ASTNode = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__AbstractTypeDeclaration = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._AbstractTypeDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__BodyDeclaration = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._BodyDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__NamedElement = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__OclAny = new ExecutorFragment(Types._UnresolvedTypeDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__OclElement = new ExecutorFragment(Types._UnresolvedTypeDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__Type = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__UnresolvedItem = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedTypeDeclaration__UnresolvedTypeDeclaration = new ExecutorFragment(Types._UnresolvedTypeDeclaration, Java_Tables.Types._UnresolvedTypeDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__ASTNode = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__NamedElement = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__OclAny = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__OclElement = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__UnresolvedItem = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._UnresolvedItem);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._UnresolvedVariableDeclarationFragment);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__VariableDeclaration = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._VariableDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _UnresolvedVariableDeclarationFragment__VariableDeclarationFragment = new ExecutorFragment(Types._UnresolvedVariableDeclarationFragment, Java_Tables.Types._VariableDeclarationFragment);

		private static final /*@NonNull*/ ExecutorFragment _VariableDeclaration__ASTNode = new ExecutorFragment(Types._VariableDeclaration, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclaration__NamedElement = new ExecutorFragment(Types._VariableDeclaration, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclaration__OclAny = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclaration__OclElement = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._VariableDeclaration, Java_Tables.Types._VariableDeclaration);

		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__ASTNode = new ExecutorFragment(Types._VariableDeclarationExpression, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__AbstractVariablesContainer = new ExecutorFragment(Types._VariableDeclarationExpression, Java_Tables.Types._AbstractVariablesContainer);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__Expression = new ExecutorFragment(Types._VariableDeclarationExpression, Java_Tables.Types._Expression);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__OclAny = new ExecutorFragment(Types._VariableDeclarationExpression, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__OclElement = new ExecutorFragment(Types._VariableDeclarationExpression, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationExpression__VariableDeclarationExpression = new ExecutorFragment(Types._VariableDeclarationExpression, Java_Tables.Types._VariableDeclarationExpression);

		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__ASTNode = new ExecutorFragment(Types._VariableDeclarationFragment, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__NamedElement = new ExecutorFragment(Types._VariableDeclarationFragment, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__OclAny = new ExecutorFragment(Types._VariableDeclarationFragment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__OclElement = new ExecutorFragment(Types._VariableDeclarationFragment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__VariableDeclaration = new ExecutorFragment(Types._VariableDeclarationFragment, Java_Tables.Types._VariableDeclaration);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationFragment__VariableDeclarationFragment = new ExecutorFragment(Types._VariableDeclarationFragment, Java_Tables.Types._VariableDeclarationFragment);

		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__ASTNode = new ExecutorFragment(Types._VariableDeclarationStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__AbstractVariablesContainer = new ExecutorFragment(Types._VariableDeclarationStatement, Java_Tables.Types._AbstractVariablesContainer);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__OclAny = new ExecutorFragment(Types._VariableDeclarationStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__OclElement = new ExecutorFragment(Types._VariableDeclarationStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__Statement = new ExecutorFragment(Types._VariableDeclarationStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _VariableDeclarationStatement__VariableDeclarationStatement = new ExecutorFragment(Types._VariableDeclarationStatement, Java_Tables.Types._VariableDeclarationStatement);

		private static final /*@NonNull*/ ExecutorFragment _VisibilityKind__OclAny = new ExecutorFragment(Types._VisibilityKind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityKind__OclElement = new ExecutorFragment(Types._VisibilityKind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityKind__OclEnumeration = new ExecutorFragment(Types._VisibilityKind, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityKind__OclType = new ExecutorFragment(Types._VisibilityKind, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityKind__VisibilityKind = new ExecutorFragment(Types._VisibilityKind, Java_Tables.Types._VisibilityKind);

		private static final /*@NonNull*/ ExecutorFragment _WhileStatement__ASTNode = new ExecutorFragment(Types._WhileStatement, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _WhileStatement__OclAny = new ExecutorFragment(Types._WhileStatement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _WhileStatement__OclElement = new ExecutorFragment(Types._WhileStatement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _WhileStatement__Statement = new ExecutorFragment(Types._WhileStatement, Java_Tables.Types._Statement);
		private static final /*@NonNull*/ ExecutorFragment _WhileStatement__WhileStatement = new ExecutorFragment(Types._WhileStatement, Java_Tables.Types._WhileStatement);

		private static final /*@NonNull*/ ExecutorFragment _WildCardType__ASTNode = new ExecutorFragment(Types._WildCardType, Java_Tables.Types._ASTNode);
		private static final /*@NonNull*/ ExecutorFragment _WildCardType__NamedElement = new ExecutorFragment(Types._WildCardType, Java_Tables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _WildCardType__OclAny = new ExecutorFragment(Types._WildCardType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _WildCardType__OclElement = new ExecutorFragment(Types._WildCardType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _WildCardType__Type = new ExecutorFragment(Types._WildCardType, Java_Tables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _WildCardType__WildCardType = new ExecutorFragment(Types._WildCardType, Java_Tables.Types._WildCardType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _Model = TypeUtil.createParameterTypes(Java_Tables.Types._Model);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _QueryCollection__emptyTextElementInJavadoc = new ExecutorOperation("emptyTextElementInJavadoc", Parameters._Model, Types._QueryCollection,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _QueryCollection__grabats09 = new ExecutorOperation("grabats09", TypeUtil.EMPTY_PARAMETER_TYPES, Types._QueryCollection,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _QueryCollection__invisibleMethods = new ExecutorOperation("invisibleMethods", TypeUtil.EMPTY_PARAMETER_TYPES, Types._QueryCollection,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _QueryCollection__textElementInJavadoc = new ExecutorOperation("textElementInJavadoc", Parameters._Model, Types._QueryCollection,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _QueryCollection__thrownExceptions = new ExecutorOperation("thrownExceptions", TypeUtil.EMPTY_PARAMETER_TYPES, Types._QueryCollection,
			4, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _ASTNode__comments = new EcoreExecutorProperty(Java_Package.Literals.AST_NODE__COMMENTS, Types._ASTNode, 0);
		public static final /*@NonNull*/ ExecutorProperty _ASTNode__originalClassFile = new EcoreExecutorProperty(Java_Package.Literals.AST_NODE__ORIGINAL_CLASS_FILE, Types._ASTNode, 1);
		public static final /*@NonNull*/ ExecutorProperty _ASTNode__originalCompilationUnit = new EcoreExecutorProperty(Java_Package.Literals.AST_NODE__ORIGINAL_COMPILATION_UNIT, Types._ASTNode, 2);
		public static final /*@NonNull*/ ExecutorProperty _ASTNode__TagElement__fragments = new ExecutorPropertyWithImplementation("TagElement", Types._ASTNode, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.TAG_ELEMENT__FRAGMENTS));
		public static final /*@NonNull*/ ExecutorProperty _ASTNode__UnresolvedItemAccess__qualifier = new ExecutorPropertyWithImplementation("UnresolvedItemAccess", Types._ASTNode, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.UNRESOLVED_ITEM_ACCESS__QUALIFIER));

		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__body = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__BODY, Types._AbstractMethodDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__parameters = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__PARAMETERS, Types._AbstractMethodDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__thrownExceptions = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS, Types._AbstractMethodDeclaration, 2);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__typeParameters = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS, Types._AbstractMethodDeclaration, 3);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__usages = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__USAGES, Types._AbstractMethodDeclaration, 4);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodDeclaration__usagesInDocComments = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, Types._AbstractMethodDeclaration, 5);

		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodInvocation__arguments = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION__ARGUMENTS, Types._AbstractMethodInvocation, 0);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodInvocation__method = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION__METHOD, Types._AbstractMethodInvocation, 1);
		public static final /*@NonNull*/ ExecutorProperty _AbstractMethodInvocation__typeArguments = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS, Types._AbstractMethodInvocation, 2);

		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__bodyDeclarations = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, Types._AbstractTypeDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__commentsAfterBody = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY, Types._AbstractTypeDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__commentsBeforeBody = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY, Types._AbstractTypeDeclaration, 2);
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__package = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__PACKAGE, Types._AbstractTypeDeclaration, 3);
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__superInterfaces = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES, Types._AbstractTypeDeclaration, 4);
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__ClassFile__type = new ExecutorPropertyWithImplementation("ClassFile", Types._AbstractTypeDeclaration, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_FILE__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__CompilationUnit__types = new ExecutorPropertyWithImplementation("CompilationUnit", Types._AbstractTypeDeclaration, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.COMPILATION_UNIT__TYPES));
		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeDeclaration__TypeDeclarationStatement__declaration = new ExecutorPropertyWithImplementation("TypeDeclarationStatement", Types._AbstractTypeDeclaration, 7, new EcoreLibraryOppositeProperty(Java_Package.Literals.TYPE_DECLARATION_STATEMENT__DECLARATION));

		public static final /*@NonNull*/ ExecutorProperty _AbstractTypeQualifiedExpression__qualifier = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER, Types._AbstractTypeQualifiedExpression, 0);

		public static final /*@NonNull*/ ExecutorProperty _AbstractVariablesContainer__fragments = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, Types._AbstractVariablesContainer, 0);
		public static final /*@NonNull*/ ExecutorProperty _AbstractVariablesContainer__type = new EcoreExecutorProperty(Java_Package.Literals.ABSTRACT_VARIABLES_CONTAINER__TYPE, Types._AbstractVariablesContainer, 1);

		public static final /*@NonNull*/ ExecutorProperty _Annotation__type = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION__TYPE, Types._Annotation, 0);
		public static final /*@NonNull*/ ExecutorProperty _Annotation__values = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION__VALUES, Types._Annotation, 1);
		public static final /*@NonNull*/ ExecutorProperty _Annotation__BodyDeclaration__annotations = new ExecutorPropertyWithImplementation("BodyDeclaration", Types._Annotation, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.BODY_DECLARATION__ANNOTATIONS));
		public static final /*@NonNull*/ ExecutorProperty _Annotation__SingleVariableDeclaration__annotations = new ExecutorPropertyWithImplementation("SingleVariableDeclaration", Types._Annotation, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS));
		public static final /*@NonNull*/ ExecutorProperty _Annotation__VariableDeclarationExpression__annotations = new ExecutorPropertyWithImplementation("VariableDeclarationExpression", Types._Annotation, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS));
		public static final /*@NonNull*/ ExecutorProperty _Annotation__VariableDeclarationStatement__annotations = new ExecutorPropertyWithImplementation("VariableDeclarationStatement", Types._Annotation, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS));

		public static final /*@NonNull*/ ExecutorProperty _AnnotationMemberValuePair__member = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER, Types._AnnotationMemberValuePair, 0);
		public static final /*@NonNull*/ ExecutorProperty _AnnotationMemberValuePair__value = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION_MEMBER_VALUE_PAIR__VALUE, Types._AnnotationMemberValuePair, 1);
		public static final /*@NonNull*/ ExecutorProperty _AnnotationMemberValuePair__Annotation__values = new ExecutorPropertyWithImplementation("Annotation", Types._AnnotationMemberValuePair, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ANNOTATION__VALUES));

		public static final /*@NonNull*/ ExecutorProperty _AnnotationTypeMemberDeclaration__default = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, Types._AnnotationTypeMemberDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _AnnotationTypeMemberDeclaration__type = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, Types._AnnotationTypeMemberDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _AnnotationTypeMemberDeclaration__usages = new EcoreExecutorProperty(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES, Types._AnnotationTypeMemberDeclaration, 2);

		public static final /*@NonNull*/ ExecutorProperty _AnonymousClassDeclaration__bodyDeclarations = new EcoreExecutorProperty(Java_Package.Literals.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, Types._AnonymousClassDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _AnonymousClassDeclaration__classInstanceCreation = new EcoreExecutorProperty(Java_Package.Literals.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION, Types._AnonymousClassDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _AnonymousClassDeclaration__EnumConstantDeclaration__anonymousClassDeclaration = new ExecutorPropertyWithImplementation("EnumConstantDeclaration", Types._AnonymousClassDeclaration, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION));

		public static final /*@NonNull*/ ExecutorProperty _Archive__classFiles = new EcoreExecutorProperty(Java_Package.Literals.ARCHIVE__CLASS_FILES, Types._Archive, 0);
		public static final /*@NonNull*/ ExecutorProperty _Archive__manifest = new EcoreExecutorProperty(Java_Package.Literals.ARCHIVE__MANIFEST, Types._Archive, 1);
		public static final /*@NonNull*/ ExecutorProperty _Archive__originalFilePath = new EcoreExecutorProperty(Java_Package.Literals.ARCHIVE__ORIGINAL_FILE_PATH, Types._Archive, 2);
		public static final /*@NonNull*/ ExecutorProperty _Archive__Model__archives = new ExecutorPropertyWithImplementation("Model", Types._Archive, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.MODEL__ARCHIVES));

		public static final /*@NonNull*/ ExecutorProperty _ArrayAccess__array = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_ACCESS__ARRAY, Types._ArrayAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrayAccess__index = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_ACCESS__INDEX, Types._ArrayAccess, 1);

		public static final /*@NonNull*/ ExecutorProperty _ArrayCreation__dimensions = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_CREATION__DIMENSIONS, Types._ArrayCreation, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrayCreation__initializer = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_CREATION__INITIALIZER, Types._ArrayCreation, 1);
		public static final /*@NonNull*/ ExecutorProperty _ArrayCreation__type = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_CREATION__TYPE, Types._ArrayCreation, 2);

		public static final /*@NonNull*/ ExecutorProperty _ArrayInitializer__expressions = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_INITIALIZER__EXPRESSIONS, Types._ArrayInitializer, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrayInitializer__ArrayCreation__initializer = new ExecutorPropertyWithImplementation("ArrayCreation", Types._ArrayInitializer, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_CREATION__INITIALIZER));

		public static final /*@NonNull*/ ExecutorProperty _ArrayLengthAccess__array = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_LENGTH_ACCESS__ARRAY, Types._ArrayLengthAccess, 0);

		public static final /*@NonNull*/ ExecutorProperty _ArrayType__dimensions = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_TYPE__DIMENSIONS, Types._ArrayType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrayType__elementType = new EcoreExecutorProperty(Java_Package.Literals.ARRAY_TYPE__ELEMENT_TYPE, Types._ArrayType, 1);

		public static final /*@NonNull*/ ExecutorProperty _AssertStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.ASSERT_STATEMENT__EXPRESSION, Types._AssertStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _AssertStatement__message = new EcoreExecutorProperty(Java_Package.Literals.ASSERT_STATEMENT__MESSAGE, Types._AssertStatement, 1);

		public static final /*@NonNull*/ ExecutorProperty _Assignment__leftHandSide = new EcoreExecutorProperty(Java_Package.Literals.ASSIGNMENT__LEFT_HAND_SIDE, Types._Assignment, 0);
		public static final /*@NonNull*/ ExecutorProperty _Assignment__operator = new EcoreExecutorProperty(Java_Package.Literals.ASSIGNMENT__OPERATOR, Types._Assignment, 1);
		public static final /*@NonNull*/ ExecutorProperty _Assignment__rightHandSide = new EcoreExecutorProperty(Java_Package.Literals.ASSIGNMENT__RIGHT_HAND_SIDE, Types._Assignment, 2);

		public static final /*@NonNull*/ ExecutorProperty _Block__statements = new EcoreExecutorProperty(Java_Package.Literals.BLOCK__STATEMENTS, Types._Block, 0);
		public static final /*@NonNull*/ ExecutorProperty _Block__AbstractMethodDeclaration__body = new ExecutorPropertyWithImplementation("AbstractMethodDeclaration", Types._Block, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Block__CatchClause__body = new ExecutorPropertyWithImplementation("CatchClause", Types._Block, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.CATCH_CLAUSE__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Block__Initializer__body = new ExecutorPropertyWithImplementation("Initializer", Types._Block, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.INITIALIZER__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Block__SynchronizedStatement__body = new ExecutorPropertyWithImplementation("SynchronizedStatement", Types._Block, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.SYNCHRONIZED_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Block__TryStatement__body = new ExecutorPropertyWithImplementation("TryStatement", Types._Block, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.TRY_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Block__TryStatement__finally = new ExecutorPropertyWithImplementation("TryStatement", Types._Block, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.TRY_STATEMENT__FINALLY));

		public static final /*@NonNull*/ ExecutorProperty _BodyDeclaration__abstractTypeDeclaration = new EcoreExecutorProperty(Java_Package.Literals.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, Types._BodyDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _BodyDeclaration__annotations = new EcoreExecutorProperty(Java_Package.Literals.BODY_DECLARATION__ANNOTATIONS, Types._BodyDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _BodyDeclaration__anonymousClassDeclarationOwner = new EcoreExecutorProperty(Java_Package.Literals.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, Types._BodyDeclaration, 2);
		public static final /*@NonNull*/ ExecutorProperty _BodyDeclaration__modifier = new EcoreExecutorProperty(Java_Package.Literals.BODY_DECLARATION__MODIFIER, Types._BodyDeclaration, 3);

		public static final /*@NonNull*/ ExecutorProperty _BooleanLiteral__value = new EcoreExecutorProperty(Java_Package.Literals.BOOLEAN_LITERAL__VALUE, Types._BooleanLiteral, 0);

		public static final /*@NonNull*/ ExecutorProperty _BreakStatement__label = new EcoreExecutorProperty(Java_Package.Literals.BREAK_STATEMENT__LABEL, Types._BreakStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _CastExpression__expression = new EcoreExecutorProperty(Java_Package.Literals.CAST_EXPRESSION__EXPRESSION, Types._CastExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _CastExpression__type = new EcoreExecutorProperty(Java_Package.Literals.CAST_EXPRESSION__TYPE, Types._CastExpression, 1);

		public static final /*@NonNull*/ ExecutorProperty _CatchClause__body = new EcoreExecutorProperty(Java_Package.Literals.CATCH_CLAUSE__BODY, Types._CatchClause, 0);
		public static final /*@NonNull*/ ExecutorProperty _CatchClause__exception = new EcoreExecutorProperty(Java_Package.Literals.CATCH_CLAUSE__EXCEPTION, Types._CatchClause, 1);
		public static final /*@NonNull*/ ExecutorProperty _CatchClause__TryStatement__catchClauses = new ExecutorPropertyWithImplementation("TryStatement", Types._CatchClause, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.TRY_STATEMENT__CATCH_CLAUSES));

		public static final /*@NonNull*/ ExecutorProperty _CharacterLiteral__escapedValue = new EcoreExecutorProperty(Java_Package.Literals.CHARACTER_LITERAL__ESCAPED_VALUE, Types._CharacterLiteral, 0);

		public static final /*@NonNull*/ ExecutorProperty _ClassDeclaration__superClass = new EcoreExecutorProperty(Java_Package.Literals.CLASS_DECLARATION__SUPER_CLASS, Types._ClassDeclaration, 0);

		public static final /*@NonNull*/ ExecutorProperty _ClassFile__attachedSource = new EcoreExecutorProperty(Java_Package.Literals.CLASS_FILE__ATTACHED_SOURCE, Types._ClassFile, 0);
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__originalFilePath = new EcoreExecutorProperty(Java_Package.Literals.CLASS_FILE__ORIGINAL_FILE_PATH, Types._ClassFile, 1);
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__package = new EcoreExecutorProperty(Java_Package.Literals.CLASS_FILE__PACKAGE, Types._ClassFile, 2);
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__type = new EcoreExecutorProperty(Java_Package.Literals.CLASS_FILE__TYPE, Types._ClassFile, 3);
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__ASTNode__originalClassFile = new ExecutorPropertyWithImplementation("ASTNode", Types._ClassFile, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.AST_NODE__ORIGINAL_CLASS_FILE));
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__Archive__classFiles = new ExecutorPropertyWithImplementation("Archive", Types._ClassFile, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARCHIVE__CLASS_FILES));
		public static final /*@NonNull*/ ExecutorProperty _ClassFile__Model__classFiles = new ExecutorPropertyWithImplementation("Model", Types._ClassFile, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.MODEL__CLASS_FILES));

		public static final /*@NonNull*/ ExecutorProperty _ClassInstanceCreation__anonymousClassDeclaration = new EcoreExecutorProperty(Java_Package.Literals.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, Types._ClassInstanceCreation, 0);
		public static final /*@NonNull*/ ExecutorProperty _ClassInstanceCreation__expression = new EcoreExecutorProperty(Java_Package.Literals.CLASS_INSTANCE_CREATION__EXPRESSION, Types._ClassInstanceCreation, 1);
		public static final /*@NonNull*/ ExecutorProperty _ClassInstanceCreation__type = new EcoreExecutorProperty(Java_Package.Literals.CLASS_INSTANCE_CREATION__TYPE, Types._ClassInstanceCreation, 2);

		public static final /*@NonNull*/ ExecutorProperty _Comment__content = new EcoreExecutorProperty(Java_Package.Literals.COMMENT__CONTENT, Types._Comment, 0);
		public static final /*@NonNull*/ ExecutorProperty _Comment__enclosedByParent = new EcoreExecutorProperty(Java_Package.Literals.COMMENT__ENCLOSED_BY_PARENT, Types._Comment, 1);
		public static final /*@NonNull*/ ExecutorProperty _Comment__prefixOfParent = new EcoreExecutorProperty(Java_Package.Literals.COMMENT__PREFIX_OF_PARENT, Types._Comment, 2);
		public static final /*@NonNull*/ ExecutorProperty _Comment__ASTNode__comments = new ExecutorPropertyWithImplementation("ASTNode", Types._Comment, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.AST_NODE__COMMENTS));
		public static final /*@NonNull*/ ExecutorProperty _Comment__AbstractTypeDeclaration__commentsAfterBody = new ExecutorPropertyWithImplementation("AbstractTypeDeclaration", Types._Comment, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY));
		public static final /*@NonNull*/ ExecutorProperty _Comment__AbstractTypeDeclaration__commentsBeforeBody = new ExecutorPropertyWithImplementation("AbstractTypeDeclaration", Types._Comment, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY));
		public static final /*@NonNull*/ ExecutorProperty _Comment__CompilationUnit__commentList = new ExecutorPropertyWithImplementation("CompilationUnit", Types._Comment, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.COMPILATION_UNIT__COMMENT_LIST));

		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__commentList = new EcoreExecutorProperty(Java_Package.Literals.COMPILATION_UNIT__COMMENT_LIST, Types._CompilationUnit, 0);
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__imports = new EcoreExecutorProperty(Java_Package.Literals.COMPILATION_UNIT__IMPORTS, Types._CompilationUnit, 1);
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__originalFilePath = new EcoreExecutorProperty(Java_Package.Literals.COMPILATION_UNIT__ORIGINAL_FILE_PATH, Types._CompilationUnit, 2);
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__package = new EcoreExecutorProperty(Java_Package.Literals.COMPILATION_UNIT__PACKAGE, Types._CompilationUnit, 3);
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__types = new EcoreExecutorProperty(Java_Package.Literals.COMPILATION_UNIT__TYPES, Types._CompilationUnit, 4);
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__ASTNode__originalCompilationUnit = new ExecutorPropertyWithImplementation("ASTNode", Types._CompilationUnit, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.AST_NODE__ORIGINAL_COMPILATION_UNIT));
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__ClassFile__attachedSource = new ExecutorPropertyWithImplementation("ClassFile", Types._CompilationUnit, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_FILE__ATTACHED_SOURCE));
		public static final /*@NonNull*/ ExecutorProperty _CompilationUnit__Model__compilationUnits = new ExecutorPropertyWithImplementation("Model", Types._CompilationUnit, 7, new EcoreLibraryOppositeProperty(Java_Package.Literals.MODEL__COMPILATION_UNITS));

		public static final /*@NonNull*/ ExecutorProperty _ConditionalExpression__elseExpression = new EcoreExecutorProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, Types._ConditionalExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _ConditionalExpression__expression = new EcoreExecutorProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__EXPRESSION, Types._ConditionalExpression, 1);
		public static final /*@NonNull*/ ExecutorProperty _ConditionalExpression__thenExpression = new EcoreExecutorProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, Types._ConditionalExpression, 2);

		public static final /*@NonNull*/ ExecutorProperty _ContinueStatement__label = new EcoreExecutorProperty(Java_Package.Literals.CONTINUE_STATEMENT__LABEL, Types._ContinueStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _DoStatement__body = new EcoreExecutorProperty(Java_Package.Literals.DO_STATEMENT__BODY, Types._DoStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _DoStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.DO_STATEMENT__EXPRESSION, Types._DoStatement, 1);

		public static final /*@NonNull*/ ExecutorProperty _EnhancedForStatement__body = new EcoreExecutorProperty(Java_Package.Literals.ENHANCED_FOR_STATEMENT__BODY, Types._EnhancedForStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _EnhancedForStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION, Types._EnhancedForStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _EnhancedForStatement__parameter = new EcoreExecutorProperty(Java_Package.Literals.ENHANCED_FOR_STATEMENT__PARAMETER, Types._EnhancedForStatement, 2);

		public static final /*@NonNull*/ ExecutorProperty _EnumConstantDeclaration__anonymousClassDeclaration = new EcoreExecutorProperty(Java_Package.Literals.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, Types._EnumConstantDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _EnumConstantDeclaration__arguments = new EcoreExecutorProperty(Java_Package.Literals.ENUM_CONSTANT_DECLARATION__ARGUMENTS, Types._EnumConstantDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _EnumConstantDeclaration__EnumDeclaration__enumConstants = new ExecutorPropertyWithImplementation("EnumDeclaration", Types._EnumConstantDeclaration, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ENUM_DECLARATION__ENUM_CONSTANTS));

		public static final /*@NonNull*/ ExecutorProperty _EnumDeclaration__enumConstants = new EcoreExecutorProperty(Java_Package.Literals.ENUM_DECLARATION__ENUM_CONSTANTS, Types._EnumDeclaration, 0);

		public static final /*@NonNull*/ ExecutorProperty _Expression__AbstractMethodInvocation__arguments = new ExecutorPropertyWithImplementation("AbstractMethodInvocation", Types._Expression, 0, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION__ARGUMENTS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__AnnotationMemberValuePair__value = new ExecutorPropertyWithImplementation("AnnotationMemberValuePair", Types._Expression, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.ANNOTATION_MEMBER_VALUE_PAIR__VALUE));
		public static final /*@NonNull*/ ExecutorProperty _Expression__AnnotationTypeMemberDeclaration__default = new ExecutorPropertyWithImplementation("AnnotationTypeMemberDeclaration", Types._Expression, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ArrayAccess__array = new ExecutorPropertyWithImplementation("ArrayAccess", Types._Expression, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_ACCESS__ARRAY));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ArrayAccess__index = new ExecutorPropertyWithImplementation("ArrayAccess", Types._Expression, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_ACCESS__INDEX));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ArrayCreation__dimensions = new ExecutorPropertyWithImplementation("ArrayCreation", Types._Expression, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_CREATION__DIMENSIONS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ArrayInitializer__expressions = new ExecutorPropertyWithImplementation("ArrayInitializer", Types._Expression, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_INITIALIZER__EXPRESSIONS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ArrayLengthAccess__array = new ExecutorPropertyWithImplementation("ArrayLengthAccess", Types._Expression, 7, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_LENGTH_ACCESS__ARRAY));
		public static final /*@NonNull*/ ExecutorProperty _Expression__AssertStatement__expression = new ExecutorPropertyWithImplementation("AssertStatement", Types._Expression, 8, new EcoreLibraryOppositeProperty(Java_Package.Literals.ASSERT_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__AssertStatement__message = new ExecutorPropertyWithImplementation("AssertStatement", Types._Expression, 9, new EcoreLibraryOppositeProperty(Java_Package.Literals.ASSERT_STATEMENT__MESSAGE));
		public static final /*@NonNull*/ ExecutorProperty _Expression__Assignment__leftHandSide = new ExecutorPropertyWithImplementation("Assignment", Types._Expression, 10, new EcoreLibraryOppositeProperty(Java_Package.Literals.ASSIGNMENT__LEFT_HAND_SIDE));
		public static final /*@NonNull*/ ExecutorProperty _Expression__Assignment__rightHandSide = new ExecutorPropertyWithImplementation("Assignment", Types._Expression, 11, new EcoreLibraryOppositeProperty(Java_Package.Literals.ASSIGNMENT__RIGHT_HAND_SIDE));
		public static final /*@NonNull*/ ExecutorProperty _Expression__CastExpression__expression = new ExecutorPropertyWithImplementation("CastExpression", Types._Expression, 12, new EcoreLibraryOppositeProperty(Java_Package.Literals.CAST_EXPRESSION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ClassInstanceCreation__expression = new ExecutorPropertyWithImplementation("ClassInstanceCreation", Types._Expression, 13, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_INSTANCE_CREATION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ConditionalExpression__elseExpression = new ExecutorPropertyWithImplementation("ConditionalExpression", Types._Expression, 14, new EcoreLibraryOppositeProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ConditionalExpression__expression = new ExecutorPropertyWithImplementation("ConditionalExpression", Types._Expression, 15, new EcoreLibraryOppositeProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ConditionalExpression__thenExpression = new ExecutorPropertyWithImplementation("ConditionalExpression", Types._Expression, 16, new EcoreLibraryOppositeProperty(Java_Package.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__DoStatement__expression = new ExecutorPropertyWithImplementation("DoStatement", Types._Expression, 17, new EcoreLibraryOppositeProperty(Java_Package.Literals.DO_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__EnhancedForStatement__expression = new ExecutorPropertyWithImplementation("EnhancedForStatement", Types._Expression, 18, new EcoreLibraryOppositeProperty(Java_Package.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__EnumConstantDeclaration__arguments = new ExecutorPropertyWithImplementation("EnumConstantDeclaration", Types._Expression, 19, new EcoreLibraryOppositeProperty(Java_Package.Literals.ENUM_CONSTANT_DECLARATION__ARGUMENTS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ExpressionStatement__expression = new ExecutorPropertyWithImplementation("ExpressionStatement", Types._Expression, 20, new EcoreLibraryOppositeProperty(Java_Package.Literals.EXPRESSION_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__FieldAccess__expression = new ExecutorPropertyWithImplementation("FieldAccess", Types._Expression, 21, new EcoreLibraryOppositeProperty(Java_Package.Literals.FIELD_ACCESS__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ForStatement__expression = new ExecutorPropertyWithImplementation("ForStatement", Types._Expression, 22, new EcoreLibraryOppositeProperty(Java_Package.Literals.FOR_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ForStatement__initializers = new ExecutorPropertyWithImplementation("ForStatement", Types._Expression, 23, new EcoreLibraryOppositeProperty(Java_Package.Literals.FOR_STATEMENT__INITIALIZERS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ForStatement__updaters = new ExecutorPropertyWithImplementation("ForStatement", Types._Expression, 24, new EcoreLibraryOppositeProperty(Java_Package.Literals.FOR_STATEMENT__UPDATERS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__IfStatement__expression = new ExecutorPropertyWithImplementation("IfStatement", Types._Expression, 25, new EcoreLibraryOppositeProperty(Java_Package.Literals.IF_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__InfixExpression__extendedOperands = new ExecutorPropertyWithImplementation("InfixExpression", Types._Expression, 26, new EcoreLibraryOppositeProperty(Java_Package.Literals.INFIX_EXPRESSION__EXTENDED_OPERANDS));
		public static final /*@NonNull*/ ExecutorProperty _Expression__InfixExpression__leftOperand = new ExecutorPropertyWithImplementation("InfixExpression", Types._Expression, 27, new EcoreLibraryOppositeProperty(Java_Package.Literals.INFIX_EXPRESSION__LEFT_OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _Expression__InfixExpression__rightOperand = new ExecutorPropertyWithImplementation("InfixExpression", Types._Expression, 28, new EcoreLibraryOppositeProperty(Java_Package.Literals.INFIX_EXPRESSION__RIGHT_OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _Expression__InstanceofExpression__leftOperand = new ExecutorPropertyWithImplementation("InstanceofExpression", Types._Expression, 29, new EcoreLibraryOppositeProperty(Java_Package.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _Expression__MethodInvocation__expression = new ExecutorPropertyWithImplementation("MethodInvocation", Types._Expression, 30, new EcoreLibraryOppositeProperty(Java_Package.Literals.METHOD_INVOCATION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ParenthesizedExpression__expression = new ExecutorPropertyWithImplementation("ParenthesizedExpression", Types._Expression, 31, new EcoreLibraryOppositeProperty(Java_Package.Literals.PARENTHESIZED_EXPRESSION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__PostfixExpression__operand = new ExecutorPropertyWithImplementation("PostfixExpression", Types._Expression, 32, new EcoreLibraryOppositeProperty(Java_Package.Literals.POSTFIX_EXPRESSION__OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _Expression__PrefixExpression__operand = new ExecutorPropertyWithImplementation("PrefixExpression", Types._Expression, 33, new EcoreLibraryOppositeProperty(Java_Package.Literals.PREFIX_EXPRESSION__OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ReturnStatement__expression = new ExecutorPropertyWithImplementation("ReturnStatement", Types._Expression, 34, new EcoreLibraryOppositeProperty(Java_Package.Literals.RETURN_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__SingleVariableAccess__qualifier = new ExecutorPropertyWithImplementation("SingleVariableAccess", Types._Expression, 35, new EcoreLibraryOppositeProperty(Java_Package.Literals.SINGLE_VARIABLE_ACCESS__QUALIFIER));
		public static final /*@NonNull*/ ExecutorProperty _Expression__SuperConstructorInvocation__expression = new ExecutorPropertyWithImplementation("SuperConstructorInvocation", Types._Expression, 36, new EcoreLibraryOppositeProperty(Java_Package.Literals.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__SwitchCase__expression = new ExecutorPropertyWithImplementation("SwitchCase", Types._Expression, 37, new EcoreLibraryOppositeProperty(Java_Package.Literals.SWITCH_CASE__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__SwitchStatement__expression = new ExecutorPropertyWithImplementation("SwitchStatement", Types._Expression, 38, new EcoreLibraryOppositeProperty(Java_Package.Literals.SWITCH_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__SynchronizedStatement__expression = new ExecutorPropertyWithImplementation("SynchronizedStatement", Types._Expression, 39, new EcoreLibraryOppositeProperty(Java_Package.Literals.SYNCHRONIZED_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__ThrowStatement__expression = new ExecutorPropertyWithImplementation("ThrowStatement", Types._Expression, 40, new EcoreLibraryOppositeProperty(Java_Package.Literals.THROW_STATEMENT__EXPRESSION));
		public static final /*@NonNull*/ ExecutorProperty _Expression__VariableDeclaration__initializer = new ExecutorPropertyWithImplementation("VariableDeclaration", Types._Expression, 41, new EcoreLibraryOppositeProperty(Java_Package.Literals.VARIABLE_DECLARATION__INITIALIZER));
		public static final /*@NonNull*/ ExecutorProperty _Expression__WhileStatement__expression = new ExecutorPropertyWithImplementation("WhileStatement", Types._Expression, 42, new EcoreLibraryOppositeProperty(Java_Package.Literals.WHILE_STATEMENT__EXPRESSION));

		public static final /*@NonNull*/ ExecutorProperty _ExpressionStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.EXPRESSION_STATEMENT__EXPRESSION, Types._ExpressionStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _FieldAccess__expression = new EcoreExecutorProperty(Java_Package.Literals.FIELD_ACCESS__EXPRESSION, Types._FieldAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _FieldAccess__field = new EcoreExecutorProperty(Java_Package.Literals.FIELD_ACCESS__FIELD, Types._FieldAccess, 1);

		public static final /*@NonNull*/ ExecutorProperty _ForStatement__body = new EcoreExecutorProperty(Java_Package.Literals.FOR_STATEMENT__BODY, Types._ForStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _ForStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.FOR_STATEMENT__EXPRESSION, Types._ForStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _ForStatement__initializers = new EcoreExecutorProperty(Java_Package.Literals.FOR_STATEMENT__INITIALIZERS, Types._ForStatement, 2);
		public static final /*@NonNull*/ ExecutorProperty _ForStatement__updaters = new EcoreExecutorProperty(Java_Package.Literals.FOR_STATEMENT__UPDATERS, Types._ForStatement, 3);

		public static final /*@NonNull*/ ExecutorProperty _IfStatement__elseStatement = new EcoreExecutorProperty(Java_Package.Literals.IF_STATEMENT__ELSE_STATEMENT, Types._IfStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _IfStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.IF_STATEMENT__EXPRESSION, Types._IfStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _IfStatement__thenStatement = new EcoreExecutorProperty(Java_Package.Literals.IF_STATEMENT__THEN_STATEMENT, Types._IfStatement, 2);

		public static final /*@NonNull*/ ExecutorProperty _ImportDeclaration__importedElement = new EcoreExecutorProperty(Java_Package.Literals.IMPORT_DECLARATION__IMPORTED_ELEMENT, Types._ImportDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _ImportDeclaration__static = new EcoreExecutorProperty(Java_Package.Literals.IMPORT_DECLARATION__STATIC, Types._ImportDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _ImportDeclaration__CompilationUnit__imports = new ExecutorPropertyWithImplementation("CompilationUnit", Types._ImportDeclaration, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.COMPILATION_UNIT__IMPORTS));

		public static final /*@NonNull*/ ExecutorProperty _InfixExpression__extendedOperands = new EcoreExecutorProperty(Java_Package.Literals.INFIX_EXPRESSION__EXTENDED_OPERANDS, Types._InfixExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _InfixExpression__leftOperand = new EcoreExecutorProperty(Java_Package.Literals.INFIX_EXPRESSION__LEFT_OPERAND, Types._InfixExpression, 1);
		public static final /*@NonNull*/ ExecutorProperty _InfixExpression__operator = new EcoreExecutorProperty(Java_Package.Literals.INFIX_EXPRESSION__OPERATOR, Types._InfixExpression, 2);
		public static final /*@NonNull*/ ExecutorProperty _InfixExpression__rightOperand = new EcoreExecutorProperty(Java_Package.Literals.INFIX_EXPRESSION__RIGHT_OPERAND, Types._InfixExpression, 3);

		public static final /*@NonNull*/ ExecutorProperty _Initializer__body = new EcoreExecutorProperty(Java_Package.Literals.INITIALIZER__BODY, Types._Initializer, 0);

		public static final /*@NonNull*/ ExecutorProperty _InstanceofExpression__leftOperand = new EcoreExecutorProperty(Java_Package.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND, Types._InstanceofExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _InstanceofExpression__rightOperand = new EcoreExecutorProperty(Java_Package.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, Types._InstanceofExpression, 1);

		public static final /*@NonNull*/ ExecutorProperty _Javadoc__tags = new EcoreExecutorProperty(Java_Package.Literals.JAVADOC__TAGS, Types._Javadoc, 0);

		public static final /*@NonNull*/ ExecutorProperty _LabeledStatement__body = new EcoreExecutorProperty(Java_Package.Literals.LABELED_STATEMENT__BODY, Types._LabeledStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _LabeledStatement__usagesInBreakStatements = new EcoreExecutorProperty(Java_Package.Literals.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS, Types._LabeledStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _LabeledStatement__usagesInContinueStatements = new EcoreExecutorProperty(Java_Package.Literals.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS, Types._LabeledStatement, 2);

		public static final /*@NonNull*/ ExecutorProperty _Manifest__entryAttributes = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST__ENTRY_ATTRIBUTES, Types._Manifest, 0);
		public static final /*@NonNull*/ ExecutorProperty _Manifest__mainAttributes = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST__MAIN_ATTRIBUTES, Types._Manifest, 1);
		public static final /*@NonNull*/ ExecutorProperty _Manifest__Archive__manifest = new ExecutorPropertyWithImplementation("Archive", Types._Manifest, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARCHIVE__MANIFEST));

		public static final /*@NonNull*/ ExecutorProperty _ManifestAttribute__key = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST_ATTRIBUTE__KEY, Types._ManifestAttribute, 0);
		public static final /*@NonNull*/ ExecutorProperty _ManifestAttribute__value = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST_ATTRIBUTE__VALUE, Types._ManifestAttribute, 1);
		public static final /*@NonNull*/ ExecutorProperty _ManifestAttribute__Manifest__mainAttributes = new ExecutorPropertyWithImplementation("Manifest", Types._ManifestAttribute, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.MANIFEST__MAIN_ATTRIBUTES));
		public static final /*@NonNull*/ ExecutorProperty _ManifestAttribute__ManifestEntry__attributes = new ExecutorPropertyWithImplementation("ManifestEntry", Types._ManifestAttribute, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.MANIFEST_ENTRY__ATTRIBUTES));

		public static final /*@NonNull*/ ExecutorProperty _ManifestEntry__attributes = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST_ENTRY__ATTRIBUTES, Types._ManifestEntry, 0);
		public static final /*@NonNull*/ ExecutorProperty _ManifestEntry__name = new EcoreExecutorProperty(Java_Package.Literals.MANIFEST_ENTRY__NAME, Types._ManifestEntry, 1);
		public static final /*@NonNull*/ ExecutorProperty _ManifestEntry__Manifest__entryAttributes = new ExecutorPropertyWithImplementation("Manifest", Types._ManifestEntry, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.MANIFEST__ENTRY_ATTRIBUTES));

		public static final /*@NonNull*/ ExecutorProperty _MemberRef__member = new EcoreExecutorProperty(Java_Package.Literals.MEMBER_REF__MEMBER, Types._MemberRef, 0);
		public static final /*@NonNull*/ ExecutorProperty _MemberRef__qualifier = new EcoreExecutorProperty(Java_Package.Literals.MEMBER_REF__QUALIFIER, Types._MemberRef, 1);

		public static final /*@NonNull*/ ExecutorProperty _MethodDeclaration__extraArrayDimensions = new EcoreExecutorProperty(Java_Package.Literals.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS, Types._MethodDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _MethodDeclaration__redefinedMethodDeclaration = new EcoreExecutorProperty(Java_Package.Literals.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, Types._MethodDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _MethodDeclaration__redefinitions = new EcoreExecutorProperty(Java_Package.Literals.METHOD_DECLARATION__REDEFINITIONS, Types._MethodDeclaration, 2);
		public static final /*@NonNull*/ ExecutorProperty _MethodDeclaration__returnType = new EcoreExecutorProperty(Java_Package.Literals.METHOD_DECLARATION__RETURN_TYPE, Types._MethodDeclaration, 3);

		public static final /*@NonNull*/ ExecutorProperty _MethodInvocation__expression = new EcoreExecutorProperty(Java_Package.Literals.METHOD_INVOCATION__EXPRESSION, Types._MethodInvocation, 0);

		public static final /*@NonNull*/ ExecutorProperty _MethodRef__method = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF__METHOD, Types._MethodRef, 0);
		public static final /*@NonNull*/ ExecutorProperty _MethodRef__parameters = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF__PARAMETERS, Types._MethodRef, 1);
		public static final /*@NonNull*/ ExecutorProperty _MethodRef__qualifier = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF__QUALIFIER, Types._MethodRef, 2);

		public static final /*@NonNull*/ ExecutorProperty _MethodRefParameter__name = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF_PARAMETER__NAME, Types._MethodRefParameter, 0);
		public static final /*@NonNull*/ ExecutorProperty _MethodRefParameter__type = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF_PARAMETER__TYPE, Types._MethodRefParameter, 1);
		public static final /*@NonNull*/ ExecutorProperty _MethodRefParameter__varargs = new EcoreExecutorProperty(Java_Package.Literals.METHOD_REF_PARAMETER__VARARGS, Types._MethodRefParameter, 2);
		public static final /*@NonNull*/ ExecutorProperty _MethodRefParameter__MethodRef__parameters = new ExecutorPropertyWithImplementation("MethodRef", Types._MethodRefParameter, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.METHOD_REF__PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _Model__archives = new EcoreExecutorProperty(Java_Package.Literals.MODEL__ARCHIVES, Types._Model, 0);
		public static final /*@NonNull*/ ExecutorProperty _Model__classFiles = new EcoreExecutorProperty(Java_Package.Literals.MODEL__CLASS_FILES, Types._Model, 1);
		public static final /*@NonNull*/ ExecutorProperty _Model__compilationUnits = new EcoreExecutorProperty(Java_Package.Literals.MODEL__COMPILATION_UNITS, Types._Model, 2);
		public static final /*@NonNull*/ ExecutorProperty _Model__name = new EcoreExecutorProperty(Java_Package.Literals.MODEL__NAME, Types._Model, 3);
		public static final /*@NonNull*/ ExecutorProperty _Model__orphanTypes = new EcoreExecutorProperty(Java_Package.Literals.MODEL__ORPHAN_TYPES, Types._Model, 4);
		public static final /*@NonNull*/ ExecutorProperty _Model__ownedElements = new EcoreExecutorProperty(Java_Package.Literals.MODEL__OWNED_ELEMENTS, Types._Model, 5);
		public static final /*@NonNull*/ ExecutorProperty _Model__unresolvedItems = new EcoreExecutorProperty(Java_Package.Literals.MODEL__UNRESOLVED_ITEMS, Types._Model, 6);

		public static final /*@NonNull*/ ExecutorProperty _Modifier__bodyDeclaration = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__BODY_DECLARATION, Types._Modifier, 0);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__inheritance = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__INHERITANCE, Types._Modifier, 1);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__native = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__NATIVE, Types._Modifier, 2);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__singleVariableDeclaration = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__SINGLE_VARIABLE_DECLARATION, Types._Modifier, 3);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__static = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__STATIC, Types._Modifier, 4);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__strictfp = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__STRICTFP, Types._Modifier, 5);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__synchronized = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__SYNCHRONIZED, Types._Modifier, 6);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__transient = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__TRANSIENT, Types._Modifier, 7);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__variableDeclarationExpression = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, Types._Modifier, 8);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__variableDeclarationStatement = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__VARIABLE_DECLARATION_STATEMENT, Types._Modifier, 9);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__visibility = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__VISIBILITY, Types._Modifier, 10);
		public static final /*@NonNull*/ ExecutorProperty _Modifier__volatile = new EcoreExecutorProperty(Java_Package.Literals.MODIFIER__VOLATILE, Types._Modifier, 11);

		public static final /*@NonNull*/ ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(Java_Package.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);
		public static final /*@NonNull*/ ExecutorProperty _NamedElement__proxy = new EcoreExecutorProperty(Java_Package.Literals.NAMED_ELEMENT__PROXY, Types._NamedElement, 1);
		public static final /*@NonNull*/ ExecutorProperty _NamedElement__usagesInImports = new EcoreExecutorProperty(Java_Package.Literals.NAMED_ELEMENT__USAGES_IN_IMPORTS, Types._NamedElement, 2);
		public static final /*@NonNull*/ ExecutorProperty _NamedElement__MemberRef__member = new ExecutorPropertyWithImplementation("MemberRef", Types._NamedElement, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.MEMBER_REF__MEMBER));

		public static final /*@NonNull*/ ExecutorProperty _NamespaceAccess__TypeAccess__qualifier = new ExecutorPropertyWithImplementation("TypeAccess", Types._NamespaceAccess, 0, new EcoreLibraryOppositeProperty(Java_Package.Literals.TYPE_ACCESS__QUALIFIER));

		public static final /*@NonNull*/ ExecutorProperty _NumberLiteral__tokenValue = new EcoreExecutorProperty(Java_Package.Literals.NUMBER_LITERAL__TOKEN_VALUE, Types._NumberLiteral, 0);

		public static final /*@NonNull*/ ExecutorProperty _Package__model = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE__MODEL, Types._Package, 0);
		public static final /*@NonNull*/ ExecutorProperty _Package__ownedElements = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE__OWNED_ELEMENTS, Types._Package, 1);
		public static final /*@NonNull*/ ExecutorProperty _Package__ownedPackages = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE__OWNED_PACKAGES, Types._Package, 2);
		public static final /*@NonNull*/ ExecutorProperty _Package__package = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE__PACKAGE, Types._Package, 3);
		public static final /*@NonNull*/ ExecutorProperty _Package__usagesInPackageAccess = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Types._Package, 4);
		public static final /*@NonNull*/ ExecutorProperty _Package__ClassFile__package = new ExecutorPropertyWithImplementation("ClassFile", Types._Package, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_FILE__PACKAGE));
		public static final /*@NonNull*/ ExecutorProperty _Package__CompilationUnit__package = new ExecutorPropertyWithImplementation("CompilationUnit", Types._Package, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.COMPILATION_UNIT__PACKAGE));

		public static final /*@NonNull*/ ExecutorProperty _PackageAccess__package = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE_ACCESS__PACKAGE, Types._PackageAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _PackageAccess__qualifier = new EcoreExecutorProperty(Java_Package.Literals.PACKAGE_ACCESS__QUALIFIER, Types._PackageAccess, 1);
		public static final /*@NonNull*/ ExecutorProperty _PackageAccess__PackageAccess__qualifier = new ExecutorPropertyWithImplementation("PackageAccess", Types._PackageAccess, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.PACKAGE_ACCESS__QUALIFIER));

		public static final /*@NonNull*/ ExecutorProperty _ParameterizedType__type = new EcoreExecutorProperty(Java_Package.Literals.PARAMETERIZED_TYPE__TYPE, Types._ParameterizedType, 0);
		public static final /*@NonNull*/ ExecutorProperty _ParameterizedType__typeArguments = new EcoreExecutorProperty(Java_Package.Literals.PARAMETERIZED_TYPE__TYPE_ARGUMENTS, Types._ParameterizedType, 1);

		public static final /*@NonNull*/ ExecutorProperty _ParenthesizedExpression__expression = new EcoreExecutorProperty(Java_Package.Literals.PARENTHESIZED_EXPRESSION__EXPRESSION, Types._ParenthesizedExpression, 0);

		public static final /*@NonNull*/ ExecutorProperty _PostfixExpression__operand = new EcoreExecutorProperty(Java_Package.Literals.POSTFIX_EXPRESSION__OPERAND, Types._PostfixExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _PostfixExpression__operator = new EcoreExecutorProperty(Java_Package.Literals.POSTFIX_EXPRESSION__OPERATOR, Types._PostfixExpression, 1);

		public static final /*@NonNull*/ ExecutorProperty _PrefixExpression__operand = new EcoreExecutorProperty(Java_Package.Literals.PREFIX_EXPRESSION__OPERAND, Types._PrefixExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _PrefixExpression__operator = new EcoreExecutorProperty(Java_Package.Literals.PREFIX_EXPRESSION__OPERATOR, Types._PrefixExpression, 1);

		public static final /*@NonNull*/ ExecutorProperty _ReturnStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.RETURN_STATEMENT__EXPRESSION, Types._ReturnStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _SingleVariableAccess__qualifier = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_ACCESS__QUALIFIER, Types._SingleVariableAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableAccess__variable = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_ACCESS__VARIABLE, Types._SingleVariableAccess, 1);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableAccess__FieldAccess__field = new ExecutorPropertyWithImplementation("FieldAccess", Types._SingleVariableAccess, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.FIELD_ACCESS__FIELD));
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableAccess__SuperFieldAccess__field = new ExecutorPropertyWithImplementation("SuperFieldAccess", Types._SingleVariableAccess, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.SUPER_FIELD_ACCESS__FIELD));

		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__annotations = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS, Types._SingleVariableDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__catchClause = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, Types._SingleVariableDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__enhancedForStatement = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT, Types._SingleVariableDeclaration, 2);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__methodDeclaration = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION, Types._SingleVariableDeclaration, 3);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__modifier = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__MODIFIER, Types._SingleVariableDeclaration, 4);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__type = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__TYPE, Types._SingleVariableDeclaration, 5);
		public static final /*@NonNull*/ ExecutorProperty _SingleVariableDeclaration__varargs = new EcoreExecutorProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__VARARGS, Types._SingleVariableDeclaration, 6);

		public static final /*@NonNull*/ ExecutorProperty _Statement__Block__statements = new ExecutorPropertyWithImplementation("Block", Types._Statement, 0, new EcoreLibraryOppositeProperty(Java_Package.Literals.BLOCK__STATEMENTS));
		public static final /*@NonNull*/ ExecutorProperty _Statement__DoStatement__body = new ExecutorPropertyWithImplementation("DoStatement", Types._Statement, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.DO_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Statement__EnhancedForStatement__body = new ExecutorPropertyWithImplementation("EnhancedForStatement", Types._Statement, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ENHANCED_FOR_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Statement__ForStatement__body = new ExecutorPropertyWithImplementation("ForStatement", Types._Statement, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.FOR_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Statement__IfStatement__elseStatement = new ExecutorPropertyWithImplementation("IfStatement", Types._Statement, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.IF_STATEMENT__ELSE_STATEMENT));
		public static final /*@NonNull*/ ExecutorProperty _Statement__IfStatement__thenStatement = new ExecutorPropertyWithImplementation("IfStatement", Types._Statement, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.IF_STATEMENT__THEN_STATEMENT));
		public static final /*@NonNull*/ ExecutorProperty _Statement__LabeledStatement__body = new ExecutorPropertyWithImplementation("LabeledStatement", Types._Statement, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.LABELED_STATEMENT__BODY));
		public static final /*@NonNull*/ ExecutorProperty _Statement__SwitchStatement__statements = new ExecutorPropertyWithImplementation("SwitchStatement", Types._Statement, 7, new EcoreLibraryOppositeProperty(Java_Package.Literals.SWITCH_STATEMENT__STATEMENTS));
		public static final /*@NonNull*/ ExecutorProperty _Statement__WhileStatement__body = new ExecutorPropertyWithImplementation("WhileStatement", Types._Statement, 8, new EcoreLibraryOppositeProperty(Java_Package.Literals.WHILE_STATEMENT__BODY));

		public static final /*@NonNull*/ ExecutorProperty _StringLiteral__escapedValue = new EcoreExecutorProperty(Java_Package.Literals.STRING_LITERAL__ESCAPED_VALUE, Types._StringLiteral, 0);

		public static final /*@NonNull*/ ExecutorProperty _SuperConstructorInvocation__expression = new EcoreExecutorProperty(Java_Package.Literals.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, Types._SuperConstructorInvocation, 0);

		public static final /*@NonNull*/ ExecutorProperty _SuperFieldAccess__field = new EcoreExecutorProperty(Java_Package.Literals.SUPER_FIELD_ACCESS__FIELD, Types._SuperFieldAccess, 0);

		public static final /*@NonNull*/ ExecutorProperty _SwitchCase__default = new EcoreExecutorProperty(Java_Package.Literals.SWITCH_CASE__DEFAULT, Types._SwitchCase, 0);
		public static final /*@NonNull*/ ExecutorProperty _SwitchCase__expression = new EcoreExecutorProperty(Java_Package.Literals.SWITCH_CASE__EXPRESSION, Types._SwitchCase, 1);

		public static final /*@NonNull*/ ExecutorProperty _SwitchStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.SWITCH_STATEMENT__EXPRESSION, Types._SwitchStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _SwitchStatement__statements = new EcoreExecutorProperty(Java_Package.Literals.SWITCH_STATEMENT__STATEMENTS, Types._SwitchStatement, 1);

		public static final /*@NonNull*/ ExecutorProperty _SynchronizedStatement__body = new EcoreExecutorProperty(Java_Package.Literals.SYNCHRONIZED_STATEMENT__BODY, Types._SynchronizedStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _SynchronizedStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.SYNCHRONIZED_STATEMENT__EXPRESSION, Types._SynchronizedStatement, 1);

		public static final /*@NonNull*/ ExecutorProperty _TagElement__fragments = new EcoreExecutorProperty(Java_Package.Literals.TAG_ELEMENT__FRAGMENTS, Types._TagElement, 0);
		public static final /*@NonNull*/ ExecutorProperty _TagElement__tagName = new EcoreExecutorProperty(Java_Package.Literals.TAG_ELEMENT__TAG_NAME, Types._TagElement, 1);
		public static final /*@NonNull*/ ExecutorProperty _TagElement__Javadoc__tags = new ExecutorPropertyWithImplementation("Javadoc", Types._TagElement, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.JAVADOC__TAGS));

		public static final /*@NonNull*/ ExecutorProperty _TextElement__text = new EcoreExecutorProperty(Java_Package.Literals.TEXT_ELEMENT__TEXT, Types._TextElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _ThrowStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.THROW_STATEMENT__EXPRESSION, Types._ThrowStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _TryStatement__body = new EcoreExecutorProperty(Java_Package.Literals.TRY_STATEMENT__BODY, Types._TryStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _TryStatement__catchClauses = new EcoreExecutorProperty(Java_Package.Literals.TRY_STATEMENT__CATCH_CLAUSES, Types._TryStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _TryStatement__finally = new EcoreExecutorProperty(Java_Package.Literals.TRY_STATEMENT__FINALLY, Types._TryStatement, 2);

		public static final /*@NonNull*/ ExecutorProperty _Type__usagesInTypeAccess = new EcoreExecutorProperty(Java_Package.Literals.TYPE__USAGES_IN_TYPE_ACCESS, Types._Type, 0);
		public static final /*@NonNull*/ ExecutorProperty _Type__Model__orphanTypes = new ExecutorPropertyWithImplementation("Model", Types._Type, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.MODEL__ORPHAN_TYPES));

		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__qualifier = new EcoreExecutorProperty(Java_Package.Literals.TYPE_ACCESS__QUALIFIER, Types._TypeAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__type = new EcoreExecutorProperty(Java_Package.Literals.TYPE_ACCESS__TYPE, Types._TypeAccess, 1);
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AbstractMethodDeclaration__thrownExceptions = new ExecutorPropertyWithImplementation("AbstractMethodDeclaration", Types._TypeAccess, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AbstractMethodInvocation__typeArguments = new ExecutorPropertyWithImplementation("AbstractMethodInvocation", Types._TypeAccess, 3, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AbstractTypeDeclaration__superInterfaces = new ExecutorPropertyWithImplementation("AbstractTypeDeclaration", Types._TypeAccess, 4, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AbstractTypeQualifiedExpression__qualifier = new ExecutorPropertyWithImplementation("AbstractTypeQualifiedExpression", Types._TypeAccess, 5, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AbstractVariablesContainer__type = new ExecutorPropertyWithImplementation("AbstractVariablesContainer", Types._TypeAccess, 6, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_VARIABLES_CONTAINER__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__Annotation__type = new ExecutorPropertyWithImplementation("Annotation", Types._TypeAccess, 7, new EcoreLibraryOppositeProperty(Java_Package.Literals.ANNOTATION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__AnnotationTypeMemberDeclaration__type = new ExecutorPropertyWithImplementation("AnnotationTypeMemberDeclaration", Types._TypeAccess, 8, new EcoreLibraryOppositeProperty(Java_Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ArrayCreation__type = new ExecutorPropertyWithImplementation("ArrayCreation", Types._TypeAccess, 9, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_CREATION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ArrayType__elementType = new ExecutorPropertyWithImplementation("ArrayType", Types._TypeAccess, 10, new EcoreLibraryOppositeProperty(Java_Package.Literals.ARRAY_TYPE__ELEMENT_TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__CastExpression__type = new ExecutorPropertyWithImplementation("CastExpression", Types._TypeAccess, 11, new EcoreLibraryOppositeProperty(Java_Package.Literals.CAST_EXPRESSION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ClassDeclaration__superClass = new ExecutorPropertyWithImplementation("ClassDeclaration", Types._TypeAccess, 12, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_DECLARATION__SUPER_CLASS));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ClassInstanceCreation__type = new ExecutorPropertyWithImplementation("ClassInstanceCreation", Types._TypeAccess, 13, new EcoreLibraryOppositeProperty(Java_Package.Literals.CLASS_INSTANCE_CREATION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__InstanceofExpression__rightOperand = new ExecutorPropertyWithImplementation("InstanceofExpression", Types._TypeAccess, 14, new EcoreLibraryOppositeProperty(Java_Package.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__MemberRef__qualifier = new ExecutorPropertyWithImplementation("MemberRef", Types._TypeAccess, 15, new EcoreLibraryOppositeProperty(Java_Package.Literals.MEMBER_REF__QUALIFIER));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__MethodDeclaration__returnType = new ExecutorPropertyWithImplementation("MethodDeclaration", Types._TypeAccess, 16, new EcoreLibraryOppositeProperty(Java_Package.Literals.METHOD_DECLARATION__RETURN_TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__MethodRef__qualifier = new ExecutorPropertyWithImplementation("MethodRef", Types._TypeAccess, 17, new EcoreLibraryOppositeProperty(Java_Package.Literals.METHOD_REF__QUALIFIER));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__MethodRefParameter__type = new ExecutorPropertyWithImplementation("MethodRefParameter", Types._TypeAccess, 18, new EcoreLibraryOppositeProperty(Java_Package.Literals.METHOD_REF_PARAMETER__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ParameterizedType__type = new ExecutorPropertyWithImplementation("ParameterizedType", Types._TypeAccess, 19, new EcoreLibraryOppositeProperty(Java_Package.Literals.PARAMETERIZED_TYPE__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__ParameterizedType__typeArguments = new ExecutorPropertyWithImplementation("ParameterizedType", Types._TypeAccess, 20, new EcoreLibraryOppositeProperty(Java_Package.Literals.PARAMETERIZED_TYPE__TYPE_ARGUMENTS));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__SingleVariableDeclaration__type = new ExecutorPropertyWithImplementation("SingleVariableDeclaration", Types._TypeAccess, 21, new EcoreLibraryOppositeProperty(Java_Package.Literals.SINGLE_VARIABLE_DECLARATION__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__TypeLiteral__type = new ExecutorPropertyWithImplementation("TypeLiteral", Types._TypeAccess, 22, new EcoreLibraryOppositeProperty(Java_Package.Literals.TYPE_LITERAL__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__TypeParameter__bounds = new ExecutorPropertyWithImplementation("TypeParameter", Types._TypeAccess, 23, new EcoreLibraryOppositeProperty(Java_Package.Literals.TYPE_PARAMETER__BOUNDS));
		public static final /*@NonNull*/ ExecutorProperty _TypeAccess__WildCardType__bound = new ExecutorPropertyWithImplementation("WildCardType", Types._TypeAccess, 24, new EcoreLibraryOppositeProperty(Java_Package.Literals.WILD_CARD_TYPE__BOUND));

		public static final /*@NonNull*/ ExecutorProperty _TypeDeclaration__typeParameters = new EcoreExecutorProperty(Java_Package.Literals.TYPE_DECLARATION__TYPE_PARAMETERS, Types._TypeDeclaration, 0);

		public static final /*@NonNull*/ ExecutorProperty _TypeDeclarationStatement__declaration = new EcoreExecutorProperty(Java_Package.Literals.TYPE_DECLARATION_STATEMENT__DECLARATION, Types._TypeDeclarationStatement, 0);

		public static final /*@NonNull*/ ExecutorProperty _TypeLiteral__type = new EcoreExecutorProperty(Java_Package.Literals.TYPE_LITERAL__TYPE, Types._TypeLiteral, 0);

		public static final /*@NonNull*/ ExecutorProperty _TypeParameter__bounds = new EcoreExecutorProperty(Java_Package.Literals.TYPE_PARAMETER__BOUNDS, Types._TypeParameter, 0);
		public static final /*@NonNull*/ ExecutorProperty _TypeParameter__AbstractMethodDeclaration__typeParameters = new ExecutorPropertyWithImplementation("AbstractMethodDeclaration", Types._TypeParameter, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS));
		public static final /*@NonNull*/ ExecutorProperty _TypeParameter__TypeDeclaration__typeParameters = new ExecutorPropertyWithImplementation("TypeDeclaration", Types._TypeParameter, 2, new EcoreLibraryOppositeProperty(Java_Package.Literals.TYPE_DECLARATION__TYPE_PARAMETERS));

		public static final /*@NonNull*/ ExecutorProperty _UnresolvedItem__Model__unresolvedItems = new ExecutorPropertyWithImplementation("Model", Types._UnresolvedItem, 0, new EcoreLibraryOppositeProperty(Java_Package.Literals.MODEL__UNRESOLVED_ITEMS));
		public static final /*@NonNull*/ ExecutorProperty _UnresolvedItem__UnresolvedItemAccess__element = new ExecutorPropertyWithImplementation("UnresolvedItemAccess", Types._UnresolvedItem, 1, new EcoreLibraryOppositeProperty(Java_Package.Literals.UNRESOLVED_ITEM_ACCESS__ELEMENT));

		public static final /*@NonNull*/ ExecutorProperty _UnresolvedItemAccess__element = new EcoreExecutorProperty(Java_Package.Literals.UNRESOLVED_ITEM_ACCESS__ELEMENT, Types._UnresolvedItemAccess, 0);
		public static final /*@NonNull*/ ExecutorProperty _UnresolvedItemAccess__qualifier = new EcoreExecutorProperty(Java_Package.Literals.UNRESOLVED_ITEM_ACCESS__QUALIFIER, Types._UnresolvedItemAccess, 1);

		public static final /*@NonNull*/ ExecutorProperty _VariableDeclaration__extraArrayDimensions = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS, Types._VariableDeclaration, 0);
		public static final /*@NonNull*/ ExecutorProperty _VariableDeclaration__initializer = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION__INITIALIZER, Types._VariableDeclaration, 1);
		public static final /*@NonNull*/ ExecutorProperty _VariableDeclaration__usageInVariableAccess = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS, Types._VariableDeclaration, 2);

		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationExpression__annotations = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS, Types._VariableDeclarationExpression, 0);
		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationExpression__modifier = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, Types._VariableDeclarationExpression, 1);

		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationFragment__variablesContainer = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER, Types._VariableDeclarationFragment, 0);

		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationStatement__annotations = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS, Types._VariableDeclarationStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationStatement__extraArrayDimensions = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS, Types._VariableDeclarationStatement, 1);
		public static final /*@NonNull*/ ExecutorProperty _VariableDeclarationStatement__modifier = new EcoreExecutorProperty(Java_Package.Literals.VARIABLE_DECLARATION_STATEMENT__MODIFIER, Types._VariableDeclarationStatement, 2);

		public static final /*@NonNull*/ ExecutorProperty _WhileStatement__body = new EcoreExecutorProperty(Java_Package.Literals.WHILE_STATEMENT__BODY, Types._WhileStatement, 0);
		public static final /*@NonNull*/ ExecutorProperty _WhileStatement__expression = new EcoreExecutorProperty(Java_Package.Literals.WHILE_STATEMENT__EXPRESSION, Types._WhileStatement, 1);

		public static final /*@NonNull*/ ExecutorProperty _WildCardType__bound = new EcoreExecutorProperty(Java_Package.Literals.WILD_CARD_TYPE__BOUND, Types._WildCardType, 0);
		public static final /*@NonNull*/ ExecutorProperty _WildCardType__upperBound = new EcoreExecutorProperty(Java_Package.Literals.WILD_CARD_TYPE__UPPER_BOUND, Types._WildCardType, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ASTNode =
			{
				Fragments._ASTNode__OclAny /* 0 */,
				Fragments._ASTNode__OclElement /* 1 */,
				Fragments._ASTNode__ASTNode /* 2 */
			};
		private static final int /*@NonNull*/ [] __ASTNode = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AbstractMethodDeclaration =
			{
				Fragments._AbstractMethodDeclaration__OclAny /* 0 */,
				Fragments._AbstractMethodDeclaration__OclElement /* 1 */,
				Fragments._AbstractMethodDeclaration__ASTNode /* 2 */,
				Fragments._AbstractMethodDeclaration__NamedElement /* 3 */,
				Fragments._AbstractMethodDeclaration__BodyDeclaration /* 4 */,
				Fragments._AbstractMethodDeclaration__AbstractMethodDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __AbstractMethodDeclaration = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AbstractMethodInvocation =
			{
				Fragments._AbstractMethodInvocation__OclAny /* 0 */,
				Fragments._AbstractMethodInvocation__OclElement /* 1 */,
				Fragments._AbstractMethodInvocation__ASTNode /* 2 */,
				Fragments._AbstractMethodInvocation__AbstractMethodInvocation /* 3 */
			};
		private static final int /*@NonNull*/ [] __AbstractMethodInvocation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AbstractTypeDeclaration =
			{
				Fragments._AbstractTypeDeclaration__OclAny /* 0 */,
				Fragments._AbstractTypeDeclaration__OclElement /* 1 */,
				Fragments._AbstractTypeDeclaration__ASTNode /* 2 */,
				Fragments._AbstractTypeDeclaration__NamedElement /* 3 */,
				Fragments._AbstractTypeDeclaration__BodyDeclaration /* 4 */,
				Fragments._AbstractTypeDeclaration__Type /* 4 */,
				Fragments._AbstractTypeDeclaration__AbstractTypeDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __AbstractTypeDeclaration = { 1,1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AbstractTypeQualifiedExpression =
			{
				Fragments._AbstractTypeQualifiedExpression__OclAny /* 0 */,
				Fragments._AbstractTypeQualifiedExpression__OclElement /* 1 */,
				Fragments._AbstractTypeQualifiedExpression__ASTNode /* 2 */,
				Fragments._AbstractTypeQualifiedExpression__Expression /* 3 */,
				Fragments._AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __AbstractTypeQualifiedExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AbstractVariablesContainer =
			{
				Fragments._AbstractVariablesContainer__OclAny /* 0 */,
				Fragments._AbstractVariablesContainer__OclElement /* 1 */,
				Fragments._AbstractVariablesContainer__ASTNode /* 2 */,
				Fragments._AbstractVariablesContainer__AbstractVariablesContainer /* 3 */
			};
		private static final int /*@NonNull*/ [] __AbstractVariablesContainer = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Annotation =
			{
				Fragments._Annotation__OclAny /* 0 */,
				Fragments._Annotation__OclElement /* 1 */,
				Fragments._Annotation__ASTNode /* 2 */,
				Fragments._Annotation__Expression /* 3 */,
				Fragments._Annotation__Annotation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Annotation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AnnotationMemberValuePair =
			{
				Fragments._AnnotationMemberValuePair__OclAny /* 0 */,
				Fragments._AnnotationMemberValuePair__OclElement /* 1 */,
				Fragments._AnnotationMemberValuePair__ASTNode /* 2 */,
				Fragments._AnnotationMemberValuePair__NamedElement /* 3 */,
				Fragments._AnnotationMemberValuePair__AnnotationMemberValuePair /* 4 */
			};
		private static final int /*@NonNull*/ [] __AnnotationMemberValuePair = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AnnotationTypeDeclaration =
			{
				Fragments._AnnotationTypeDeclaration__OclAny /* 0 */,
				Fragments._AnnotationTypeDeclaration__OclElement /* 1 */,
				Fragments._AnnotationTypeDeclaration__ASTNode /* 2 */,
				Fragments._AnnotationTypeDeclaration__NamedElement /* 3 */,
				Fragments._AnnotationTypeDeclaration__BodyDeclaration /* 4 */,
				Fragments._AnnotationTypeDeclaration__Type /* 4 */,
				Fragments._AnnotationTypeDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._AnnotationTypeDeclaration__AnnotationTypeDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __AnnotationTypeDeclaration = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AnnotationTypeMemberDeclaration =
			{
				Fragments._AnnotationTypeMemberDeclaration__OclAny /* 0 */,
				Fragments._AnnotationTypeMemberDeclaration__OclElement /* 1 */,
				Fragments._AnnotationTypeMemberDeclaration__ASTNode /* 2 */,
				Fragments._AnnotationTypeMemberDeclaration__NamedElement /* 3 */,
				Fragments._AnnotationTypeMemberDeclaration__BodyDeclaration /* 4 */,
				Fragments._AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __AnnotationTypeMemberDeclaration = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AnonymousClassDeclaration =
			{
				Fragments._AnonymousClassDeclaration__OclAny /* 0 */,
				Fragments._AnonymousClassDeclaration__OclElement /* 1 */,
				Fragments._AnonymousClassDeclaration__ASTNode /* 2 */,
				Fragments._AnonymousClassDeclaration__AnonymousClassDeclaration /* 3 */
			};
		private static final int /*@NonNull*/ [] __AnonymousClassDeclaration = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Archive =
			{
				Fragments._Archive__OclAny /* 0 */,
				Fragments._Archive__OclElement /* 1 */,
				Fragments._Archive__ASTNode /* 2 */,
				Fragments._Archive__NamedElement /* 3 */,
				Fragments._Archive__Archive /* 4 */
			};
		private static final int /*@NonNull*/ [] __Archive = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayAccess =
			{
				Fragments._ArrayAccess__OclAny /* 0 */,
				Fragments._ArrayAccess__OclElement /* 1 */,
				Fragments._ArrayAccess__ASTNode /* 2 */,
				Fragments._ArrayAccess__Expression /* 3 */,
				Fragments._ArrayAccess__ArrayAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArrayAccess = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayCreation =
			{
				Fragments._ArrayCreation__OclAny /* 0 */,
				Fragments._ArrayCreation__OclElement /* 1 */,
				Fragments._ArrayCreation__ASTNode /* 2 */,
				Fragments._ArrayCreation__Expression /* 3 */,
				Fragments._ArrayCreation__ArrayCreation /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArrayCreation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayInitializer =
			{
				Fragments._ArrayInitializer__OclAny /* 0 */,
				Fragments._ArrayInitializer__OclElement /* 1 */,
				Fragments._ArrayInitializer__ASTNode /* 2 */,
				Fragments._ArrayInitializer__Expression /* 3 */,
				Fragments._ArrayInitializer__ArrayInitializer /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArrayInitializer = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayLengthAccess =
			{
				Fragments._ArrayLengthAccess__OclAny /* 0 */,
				Fragments._ArrayLengthAccess__OclElement /* 1 */,
				Fragments._ArrayLengthAccess__ASTNode /* 2 */,
				Fragments._ArrayLengthAccess__Expression /* 3 */,
				Fragments._ArrayLengthAccess__ArrayLengthAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArrayLengthAccess = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayType =
			{
				Fragments._ArrayType__OclAny /* 0 */,
				Fragments._ArrayType__OclElement /* 1 */,
				Fragments._ArrayType__ASTNode /* 2 */,
				Fragments._ArrayType__NamedElement /* 3 */,
				Fragments._ArrayType__Type /* 4 */,
				Fragments._ArrayType__ArrayType /* 5 */
			};
		private static final int /*@NonNull*/ [] __ArrayType = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AssertStatement =
			{
				Fragments._AssertStatement__OclAny /* 0 */,
				Fragments._AssertStatement__OclElement /* 1 */,
				Fragments._AssertStatement__ASTNode /* 2 */,
				Fragments._AssertStatement__Statement /* 3 */,
				Fragments._AssertStatement__AssertStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __AssertStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Assignment =
			{
				Fragments._Assignment__OclAny /* 0 */,
				Fragments._Assignment__OclElement /* 1 */,
				Fragments._Assignment__ASTNode /* 2 */,
				Fragments._Assignment__Expression /* 3 */,
				Fragments._Assignment__Assignment /* 4 */
			};
		private static final int /*@NonNull*/ [] __Assignment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AssignmentKind =
			{
				Fragments._AssignmentKind__OclAny /* 0 */,
				Fragments._AssignmentKind__OclElement /* 1 */,
				Fragments._AssignmentKind__OclType /* 2 */,
				Fragments._AssignmentKind__OclEnumeration /* 3 */,
				Fragments._AssignmentKind__AssignmentKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __AssignmentKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Block =
			{
				Fragments._Block__OclAny /* 0 */,
				Fragments._Block__OclElement /* 1 */,
				Fragments._Block__ASTNode /* 2 */,
				Fragments._Block__Statement /* 3 */,
				Fragments._Block__Block /* 4 */
			};
		private static final int /*@NonNull*/ [] __Block = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BlockComment =
			{
				Fragments._BlockComment__OclAny /* 0 */,
				Fragments._BlockComment__OclElement /* 1 */,
				Fragments._BlockComment__ASTNode /* 2 */,
				Fragments._BlockComment__Comment /* 3 */,
				Fragments._BlockComment__BlockComment /* 4 */
			};
		private static final int /*@NonNull*/ [] __BlockComment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BodyDeclaration =
			{
				Fragments._BodyDeclaration__OclAny /* 0 */,
				Fragments._BodyDeclaration__OclElement /* 1 */,
				Fragments._BodyDeclaration__ASTNode /* 2 */,
				Fragments._BodyDeclaration__NamedElement /* 3 */,
				Fragments._BodyDeclaration__BodyDeclaration /* 4 */
			};
		private static final int /*@NonNull*/ [] __BodyDeclaration = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BooleanLiteral =
			{
				Fragments._BooleanLiteral__OclAny /* 0 */,
				Fragments._BooleanLiteral__OclElement /* 1 */,
				Fragments._BooleanLiteral__ASTNode /* 2 */,
				Fragments._BooleanLiteral__Expression /* 3 */,
				Fragments._BooleanLiteral__BooleanLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BreakStatement =
			{
				Fragments._BreakStatement__OclAny /* 0 */,
				Fragments._BreakStatement__OclElement /* 1 */,
				Fragments._BreakStatement__ASTNode /* 2 */,
				Fragments._BreakStatement__Statement /* 3 */,
				Fragments._BreakStatement__BreakStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __BreakStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CastExpression =
			{
				Fragments._CastExpression__OclAny /* 0 */,
				Fragments._CastExpression__OclElement /* 1 */,
				Fragments._CastExpression__ASTNode /* 2 */,
				Fragments._CastExpression__Expression /* 3 */,
				Fragments._CastExpression__CastExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __CastExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CatchClause =
			{
				Fragments._CatchClause__OclAny /* 0 */,
				Fragments._CatchClause__OclElement /* 1 */,
				Fragments._CatchClause__ASTNode /* 2 */,
				Fragments._CatchClause__Statement /* 3 */,
				Fragments._CatchClause__CatchClause /* 4 */
			};
		private static final int /*@NonNull*/ [] __CatchClause = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CharacterLiteral =
			{
				Fragments._CharacterLiteral__OclAny /* 0 */,
				Fragments._CharacterLiteral__OclElement /* 1 */,
				Fragments._CharacterLiteral__ASTNode /* 2 */,
				Fragments._CharacterLiteral__Expression /* 3 */,
				Fragments._CharacterLiteral__CharacterLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __CharacterLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ClassDeclaration =
			{
				Fragments._ClassDeclaration__OclAny /* 0 */,
				Fragments._ClassDeclaration__OclElement /* 1 */,
				Fragments._ClassDeclaration__ASTNode /* 2 */,
				Fragments._ClassDeclaration__NamedElement /* 3 */,
				Fragments._ClassDeclaration__BodyDeclaration /* 4 */,
				Fragments._ClassDeclaration__Type /* 4 */,
				Fragments._ClassDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._ClassDeclaration__TypeDeclaration /* 6 */,
				Fragments._ClassDeclaration__ClassDeclaration /* 7 */
			};
		private static final int /*@NonNull*/ [] __ClassDeclaration = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ClassFile =
			{
				Fragments._ClassFile__OclAny /* 0 */,
				Fragments._ClassFile__OclElement /* 1 */,
				Fragments._ClassFile__ASTNode /* 2 */,
				Fragments._ClassFile__NamedElement /* 3 */,
				Fragments._ClassFile__ClassFile /* 4 */
			};
		private static final int /*@NonNull*/ [] __ClassFile = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ClassInstanceCreation =
			{
				Fragments._ClassInstanceCreation__OclAny /* 0 */,
				Fragments._ClassInstanceCreation__OclElement /* 1 */,
				Fragments._ClassInstanceCreation__ASTNode /* 2 */,
				Fragments._ClassInstanceCreation__AbstractMethodInvocation /* 3 */,
				Fragments._ClassInstanceCreation__Expression /* 3 */,
				Fragments._ClassInstanceCreation__ClassInstanceCreation /* 4 */
			};
		private static final int /*@NonNull*/ [] __ClassInstanceCreation = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Comment =
			{
				Fragments._Comment__OclAny /* 0 */,
				Fragments._Comment__OclElement /* 1 */,
				Fragments._Comment__ASTNode /* 2 */,
				Fragments._Comment__Comment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Comment = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CompilationUnit =
			{
				Fragments._CompilationUnit__OclAny /* 0 */,
				Fragments._CompilationUnit__OclElement /* 1 */,
				Fragments._CompilationUnit__ASTNode /* 2 */,
				Fragments._CompilationUnit__NamedElement /* 3 */,
				Fragments._CompilationUnit__CompilationUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __CompilationUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ConditionalExpression =
			{
				Fragments._ConditionalExpression__OclAny /* 0 */,
				Fragments._ConditionalExpression__OclElement /* 1 */,
				Fragments._ConditionalExpression__ASTNode /* 2 */,
				Fragments._ConditionalExpression__Expression /* 3 */,
				Fragments._ConditionalExpression__ConditionalExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __ConditionalExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ConstructorDeclaration =
			{
				Fragments._ConstructorDeclaration__OclAny /* 0 */,
				Fragments._ConstructorDeclaration__OclElement /* 1 */,
				Fragments._ConstructorDeclaration__ASTNode /* 2 */,
				Fragments._ConstructorDeclaration__NamedElement /* 3 */,
				Fragments._ConstructorDeclaration__BodyDeclaration /* 4 */,
				Fragments._ConstructorDeclaration__AbstractMethodDeclaration /* 5 */,
				Fragments._ConstructorDeclaration__ConstructorDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __ConstructorDeclaration = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ConstructorInvocation =
			{
				Fragments._ConstructorInvocation__OclAny /* 0 */,
				Fragments._ConstructorInvocation__OclElement /* 1 */,
				Fragments._ConstructorInvocation__ASTNode /* 2 */,
				Fragments._ConstructorInvocation__AbstractMethodInvocation /* 3 */,
				Fragments._ConstructorInvocation__Statement /* 3 */,
				Fragments._ConstructorInvocation__ConstructorInvocation /* 4 */
			};
		private static final int /*@NonNull*/ [] __ConstructorInvocation = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ContinueStatement =
			{
				Fragments._ContinueStatement__OclAny /* 0 */,
				Fragments._ContinueStatement__OclElement /* 1 */,
				Fragments._ContinueStatement__ASTNode /* 2 */,
				Fragments._ContinueStatement__Statement /* 3 */,
				Fragments._ContinueStatement__ContinueStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __ContinueStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DoStatement =
			{
				Fragments._DoStatement__OclAny /* 0 */,
				Fragments._DoStatement__OclElement /* 1 */,
				Fragments._DoStatement__ASTNode /* 2 */,
				Fragments._DoStatement__Statement /* 3 */,
				Fragments._DoStatement__DoStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __DoStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EmptyStatement =
			{
				Fragments._EmptyStatement__OclAny /* 0 */,
				Fragments._EmptyStatement__OclElement /* 1 */,
				Fragments._EmptyStatement__ASTNode /* 2 */,
				Fragments._EmptyStatement__Statement /* 3 */,
				Fragments._EmptyStatement__EmptyStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __EmptyStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EnhancedForStatement =
			{
				Fragments._EnhancedForStatement__OclAny /* 0 */,
				Fragments._EnhancedForStatement__OclElement /* 1 */,
				Fragments._EnhancedForStatement__ASTNode /* 2 */,
				Fragments._EnhancedForStatement__Statement /* 3 */,
				Fragments._EnhancedForStatement__EnhancedForStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnhancedForStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EnumConstantDeclaration =
			{
				Fragments._EnumConstantDeclaration__OclAny /* 0 */,
				Fragments._EnumConstantDeclaration__OclElement /* 1 */,
				Fragments._EnumConstantDeclaration__ASTNode /* 2 */,
				Fragments._EnumConstantDeclaration__NamedElement /* 3 */,
				Fragments._EnumConstantDeclaration__BodyDeclaration /* 4 */,
				Fragments._EnumConstantDeclaration__VariableDeclaration /* 4 */,
				Fragments._EnumConstantDeclaration__EnumConstantDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __EnumConstantDeclaration = { 1,1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EnumDeclaration =
			{
				Fragments._EnumDeclaration__OclAny /* 0 */,
				Fragments._EnumDeclaration__OclElement /* 1 */,
				Fragments._EnumDeclaration__ASTNode /* 2 */,
				Fragments._EnumDeclaration__NamedElement /* 3 */,
				Fragments._EnumDeclaration__BodyDeclaration /* 4 */,
				Fragments._EnumDeclaration__Type /* 4 */,
				Fragments._EnumDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._EnumDeclaration__EnumDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __EnumDeclaration = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Expression =
			{
				Fragments._Expression__OclAny /* 0 */,
				Fragments._Expression__OclElement /* 1 */,
				Fragments._Expression__ASTNode /* 2 */,
				Fragments._Expression__Expression /* 3 */
			};
		private static final int /*@NonNull*/ [] __Expression = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ExpressionStatement =
			{
				Fragments._ExpressionStatement__OclAny /* 0 */,
				Fragments._ExpressionStatement__OclElement /* 1 */,
				Fragments._ExpressionStatement__ASTNode /* 2 */,
				Fragments._ExpressionStatement__Statement /* 3 */,
				Fragments._ExpressionStatement__ExpressionStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __ExpressionStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FieldAccess =
			{
				Fragments._FieldAccess__OclAny /* 0 */,
				Fragments._FieldAccess__OclElement /* 1 */,
				Fragments._FieldAccess__ASTNode /* 2 */,
				Fragments._FieldAccess__Expression /* 3 */,
				Fragments._FieldAccess__FieldAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __FieldAccess = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FieldDeclaration =
			{
				Fragments._FieldDeclaration__OclAny /* 0 */,
				Fragments._FieldDeclaration__OclElement /* 1 */,
				Fragments._FieldDeclaration__ASTNode /* 2 */,
				Fragments._FieldDeclaration__AbstractVariablesContainer /* 3 */,
				Fragments._FieldDeclaration__NamedElement /* 3 */,
				Fragments._FieldDeclaration__BodyDeclaration /* 4 */,
				Fragments._FieldDeclaration__FieldDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __FieldDeclaration = { 1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ForStatement =
			{
				Fragments._ForStatement__OclAny /* 0 */,
				Fragments._ForStatement__OclElement /* 1 */,
				Fragments._ForStatement__ASTNode /* 2 */,
				Fragments._ForStatement__Statement /* 3 */,
				Fragments._ForStatement__ForStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __ForStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IfStatement =
			{
				Fragments._IfStatement__OclAny /* 0 */,
				Fragments._IfStatement__OclElement /* 1 */,
				Fragments._IfStatement__ASTNode /* 2 */,
				Fragments._IfStatement__Statement /* 3 */,
				Fragments._IfStatement__IfStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __IfStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ImportDeclaration =
			{
				Fragments._ImportDeclaration__OclAny /* 0 */,
				Fragments._ImportDeclaration__OclElement /* 1 */,
				Fragments._ImportDeclaration__ASTNode /* 2 */,
				Fragments._ImportDeclaration__ImportDeclaration /* 3 */
			};
		private static final int /*@NonNull*/ [] __ImportDeclaration = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InfixExpression =
			{
				Fragments._InfixExpression__OclAny /* 0 */,
				Fragments._InfixExpression__OclElement /* 1 */,
				Fragments._InfixExpression__ASTNode /* 2 */,
				Fragments._InfixExpression__Expression /* 3 */,
				Fragments._InfixExpression__InfixExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __InfixExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InfixExpressionKind =
			{
				Fragments._InfixExpressionKind__OclAny /* 0 */,
				Fragments._InfixExpressionKind__OclElement /* 1 */,
				Fragments._InfixExpressionKind__OclType /* 2 */,
				Fragments._InfixExpressionKind__OclEnumeration /* 3 */,
				Fragments._InfixExpressionKind__InfixExpressionKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __InfixExpressionKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InheritanceKind =
			{
				Fragments._InheritanceKind__OclAny /* 0 */,
				Fragments._InheritanceKind__OclElement /* 1 */,
				Fragments._InheritanceKind__OclType /* 2 */,
				Fragments._InheritanceKind__OclEnumeration /* 3 */,
				Fragments._InheritanceKind__InheritanceKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __InheritanceKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Initializer =
			{
				Fragments._Initializer__OclAny /* 0 */,
				Fragments._Initializer__OclElement /* 1 */,
				Fragments._Initializer__ASTNode /* 2 */,
				Fragments._Initializer__NamedElement /* 3 */,
				Fragments._Initializer__BodyDeclaration /* 4 */,
				Fragments._Initializer__Initializer /* 5 */
			};
		private static final int /*@NonNull*/ [] __Initializer = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InstanceofExpression =
			{
				Fragments._InstanceofExpression__OclAny /* 0 */,
				Fragments._InstanceofExpression__OclElement /* 1 */,
				Fragments._InstanceofExpression__ASTNode /* 2 */,
				Fragments._InstanceofExpression__Expression /* 3 */,
				Fragments._InstanceofExpression__InstanceofExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __InstanceofExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InterfaceDeclaration =
			{
				Fragments._InterfaceDeclaration__OclAny /* 0 */,
				Fragments._InterfaceDeclaration__OclElement /* 1 */,
				Fragments._InterfaceDeclaration__ASTNode /* 2 */,
				Fragments._InterfaceDeclaration__NamedElement /* 3 */,
				Fragments._InterfaceDeclaration__BodyDeclaration /* 4 */,
				Fragments._InterfaceDeclaration__Type /* 4 */,
				Fragments._InterfaceDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._InterfaceDeclaration__TypeDeclaration /* 6 */,
				Fragments._InterfaceDeclaration__InterfaceDeclaration /* 7 */
			};
		private static final int /*@NonNull*/ [] __InterfaceDeclaration = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Javadoc =
			{
				Fragments._Javadoc__OclAny /* 0 */,
				Fragments._Javadoc__OclElement /* 1 */,
				Fragments._Javadoc__ASTNode /* 2 */,
				Fragments._Javadoc__Comment /* 3 */,
				Fragments._Javadoc__Javadoc /* 4 */
			};
		private static final int /*@NonNull*/ [] __Javadoc = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _LabeledStatement =
			{
				Fragments._LabeledStatement__OclAny /* 0 */,
				Fragments._LabeledStatement__OclElement /* 1 */,
				Fragments._LabeledStatement__ASTNode /* 2 */,
				Fragments._LabeledStatement__NamedElement /* 3 */,
				Fragments._LabeledStatement__Statement /* 3 */,
				Fragments._LabeledStatement__LabeledStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __LabeledStatement = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _LineComment =
			{
				Fragments._LineComment__OclAny /* 0 */,
				Fragments._LineComment__OclElement /* 1 */,
				Fragments._LineComment__ASTNode /* 2 */,
				Fragments._LineComment__Comment /* 3 */,
				Fragments._LineComment__LineComment /* 4 */
			};
		private static final int /*@NonNull*/ [] __LineComment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manifest =
			{
				Fragments._Manifest__OclAny /* 0 */,
				Fragments._Manifest__OclElement /* 1 */,
				Fragments._Manifest__Manifest /* 2 */
			};
		private static final int /*@NonNull*/ [] __Manifest = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ManifestAttribute =
			{
				Fragments._ManifestAttribute__OclAny /* 0 */,
				Fragments._ManifestAttribute__OclElement /* 1 */,
				Fragments._ManifestAttribute__ManifestAttribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __ManifestAttribute = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ManifestEntry =
			{
				Fragments._ManifestEntry__OclAny /* 0 */,
				Fragments._ManifestEntry__OclElement /* 1 */,
				Fragments._ManifestEntry__ManifestEntry /* 2 */
			};
		private static final int /*@NonNull*/ [] __ManifestEntry = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MemberRef =
			{
				Fragments._MemberRef__OclAny /* 0 */,
				Fragments._MemberRef__OclElement /* 1 */,
				Fragments._MemberRef__ASTNode /* 2 */,
				Fragments._MemberRef__MemberRef /* 3 */
			};
		private static final int /*@NonNull*/ [] __MemberRef = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MethodDeclaration =
			{
				Fragments._MethodDeclaration__OclAny /* 0 */,
				Fragments._MethodDeclaration__OclElement /* 1 */,
				Fragments._MethodDeclaration__ASTNode /* 2 */,
				Fragments._MethodDeclaration__NamedElement /* 3 */,
				Fragments._MethodDeclaration__BodyDeclaration /* 4 */,
				Fragments._MethodDeclaration__AbstractMethodDeclaration /* 5 */,
				Fragments._MethodDeclaration__MethodDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __MethodDeclaration = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MethodInvocation =
			{
				Fragments._MethodInvocation__OclAny /* 0 */,
				Fragments._MethodInvocation__OclElement /* 1 */,
				Fragments._MethodInvocation__ASTNode /* 2 */,
				Fragments._MethodInvocation__AbstractMethodInvocation /* 3 */,
				Fragments._MethodInvocation__Expression /* 3 */,
				Fragments._MethodInvocation__MethodInvocation /* 4 */
			};
		private static final int /*@NonNull*/ [] __MethodInvocation = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MethodRef =
			{
				Fragments._MethodRef__OclAny /* 0 */,
				Fragments._MethodRef__OclElement /* 1 */,
				Fragments._MethodRef__ASTNode /* 2 */,
				Fragments._MethodRef__MethodRef /* 3 */
			};
		private static final int /*@NonNull*/ [] __MethodRef = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MethodRefParameter =
			{
				Fragments._MethodRefParameter__OclAny /* 0 */,
				Fragments._MethodRefParameter__OclElement /* 1 */,
				Fragments._MethodRefParameter__ASTNode /* 2 */,
				Fragments._MethodRefParameter__MethodRefParameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __MethodRefParameter = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Modifier =
			{
				Fragments._Modifier__OclAny /* 0 */,
				Fragments._Modifier__OclElement /* 1 */,
				Fragments._Modifier__ASTNode /* 2 */,
				Fragments._Modifier__Modifier /* 3 */
			};
		private static final int /*@NonNull*/ [] __Modifier = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__ASTNode /* 2 */,
				Fragments._NamedElement__NamedElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NamespaceAccess =
			{
				Fragments._NamespaceAccess__OclAny /* 0 */,
				Fragments._NamespaceAccess__OclElement /* 1 */,
				Fragments._NamespaceAccess__ASTNode /* 2 */,
				Fragments._NamespaceAccess__NamespaceAccess /* 3 */
			};
		private static final int /*@NonNull*/ [] __NamespaceAccess = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NullLiteral =
			{
				Fragments._NullLiteral__OclAny /* 0 */,
				Fragments._NullLiteral__OclElement /* 1 */,
				Fragments._NullLiteral__ASTNode /* 2 */,
				Fragments._NullLiteral__Expression /* 3 */,
				Fragments._NullLiteral__NullLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __NullLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NumberLiteral =
			{
				Fragments._NumberLiteral__OclAny /* 0 */,
				Fragments._NumberLiteral__OclElement /* 1 */,
				Fragments._NumberLiteral__ASTNode /* 2 */,
				Fragments._NumberLiteral__Expression /* 3 */,
				Fragments._NumberLiteral__NumberLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __NumberLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Package =
			{
				Fragments._Package__OclAny /* 0 */,
				Fragments._Package__OclElement /* 1 */,
				Fragments._Package__ASTNode /* 2 */,
				Fragments._Package__NamedElement /* 3 */,
				Fragments._Package__Package /* 4 */
			};
		private static final int /*@NonNull*/ [] __Package = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PackageAccess =
			{
				Fragments._PackageAccess__OclAny /* 0 */,
				Fragments._PackageAccess__OclElement /* 1 */,
				Fragments._PackageAccess__ASTNode /* 2 */,
				Fragments._PackageAccess__NamespaceAccess /* 3 */,
				Fragments._PackageAccess__PackageAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __PackageAccess = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ParameterizedType =
			{
				Fragments._ParameterizedType__OclAny /* 0 */,
				Fragments._ParameterizedType__OclElement /* 1 */,
				Fragments._ParameterizedType__ASTNode /* 2 */,
				Fragments._ParameterizedType__NamedElement /* 3 */,
				Fragments._ParameterizedType__Type /* 4 */,
				Fragments._ParameterizedType__ParameterizedType /* 5 */
			};
		private static final int /*@NonNull*/ [] __ParameterizedType = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ParenthesizedExpression =
			{
				Fragments._ParenthesizedExpression__OclAny /* 0 */,
				Fragments._ParenthesizedExpression__OclElement /* 1 */,
				Fragments._ParenthesizedExpression__ASTNode /* 2 */,
				Fragments._ParenthesizedExpression__Expression /* 3 */,
				Fragments._ParenthesizedExpression__ParenthesizedExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __ParenthesizedExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PostfixExpression =
			{
				Fragments._PostfixExpression__OclAny /* 0 */,
				Fragments._PostfixExpression__OclElement /* 1 */,
				Fragments._PostfixExpression__ASTNode /* 2 */,
				Fragments._PostfixExpression__Expression /* 3 */,
				Fragments._PostfixExpression__PostfixExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __PostfixExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PostfixExpressionKind =
			{
				Fragments._PostfixExpressionKind__OclAny /* 0 */,
				Fragments._PostfixExpressionKind__OclElement /* 1 */,
				Fragments._PostfixExpressionKind__OclType /* 2 */,
				Fragments._PostfixExpressionKind__OclEnumeration /* 3 */,
				Fragments._PostfixExpressionKind__PostfixExpressionKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __PostfixExpressionKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrefixExpression =
			{
				Fragments._PrefixExpression__OclAny /* 0 */,
				Fragments._PrefixExpression__OclElement /* 1 */,
				Fragments._PrefixExpression__ASTNode /* 2 */,
				Fragments._PrefixExpression__Expression /* 3 */,
				Fragments._PrefixExpression__PrefixExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrefixExpression = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrefixExpressionKind =
			{
				Fragments._PrefixExpressionKind__OclAny /* 0 */,
				Fragments._PrefixExpressionKind__OclElement /* 1 */,
				Fragments._PrefixExpressionKind__OclType /* 2 */,
				Fragments._PrefixExpressionKind__OclEnumeration /* 3 */,
				Fragments._PrefixExpressionKind__PrefixExpressionKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrefixExpressionKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveType =
			{
				Fragments._PrimitiveType__OclAny /* 0 */,
				Fragments._PrimitiveType__OclElement /* 1 */,
				Fragments._PrimitiveType__ASTNode /* 2 */,
				Fragments._PrimitiveType__NamedElement /* 3 */,
				Fragments._PrimitiveType__Type /* 4 */,
				Fragments._PrimitiveType__PrimitiveType /* 5 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveType = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeBoolean =
			{
				Fragments._PrimitiveTypeBoolean__OclAny /* 0 */,
				Fragments._PrimitiveTypeBoolean__OclElement /* 1 */,
				Fragments._PrimitiveTypeBoolean__ASTNode /* 2 */,
				Fragments._PrimitiveTypeBoolean__NamedElement /* 3 */,
				Fragments._PrimitiveTypeBoolean__Type /* 4 */,
				Fragments._PrimitiveTypeBoolean__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeBoolean__PrimitiveTypeBoolean /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeBoolean = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeByte =
			{
				Fragments._PrimitiveTypeByte__OclAny /* 0 */,
				Fragments._PrimitiveTypeByte__OclElement /* 1 */,
				Fragments._PrimitiveTypeByte__ASTNode /* 2 */,
				Fragments._PrimitiveTypeByte__NamedElement /* 3 */,
				Fragments._PrimitiveTypeByte__Type /* 4 */,
				Fragments._PrimitiveTypeByte__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeByte__PrimitiveTypeByte /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeByte = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeChar =
			{
				Fragments._PrimitiveTypeChar__OclAny /* 0 */,
				Fragments._PrimitiveTypeChar__OclElement /* 1 */,
				Fragments._PrimitiveTypeChar__ASTNode /* 2 */,
				Fragments._PrimitiveTypeChar__NamedElement /* 3 */,
				Fragments._PrimitiveTypeChar__Type /* 4 */,
				Fragments._PrimitiveTypeChar__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeChar__PrimitiveTypeChar /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeChar = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeDouble =
			{
				Fragments._PrimitiveTypeDouble__OclAny /* 0 */,
				Fragments._PrimitiveTypeDouble__OclElement /* 1 */,
				Fragments._PrimitiveTypeDouble__ASTNode /* 2 */,
				Fragments._PrimitiveTypeDouble__NamedElement /* 3 */,
				Fragments._PrimitiveTypeDouble__Type /* 4 */,
				Fragments._PrimitiveTypeDouble__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeDouble__PrimitiveTypeDouble /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeDouble = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeFloat =
			{
				Fragments._PrimitiveTypeFloat__OclAny /* 0 */,
				Fragments._PrimitiveTypeFloat__OclElement /* 1 */,
				Fragments._PrimitiveTypeFloat__ASTNode /* 2 */,
				Fragments._PrimitiveTypeFloat__NamedElement /* 3 */,
				Fragments._PrimitiveTypeFloat__Type /* 4 */,
				Fragments._PrimitiveTypeFloat__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeFloat__PrimitiveTypeFloat /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeFloat = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeInt =
			{
				Fragments._PrimitiveTypeInt__OclAny /* 0 */,
				Fragments._PrimitiveTypeInt__OclElement /* 1 */,
				Fragments._PrimitiveTypeInt__ASTNode /* 2 */,
				Fragments._PrimitiveTypeInt__NamedElement /* 3 */,
				Fragments._PrimitiveTypeInt__Type /* 4 */,
				Fragments._PrimitiveTypeInt__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeInt__PrimitiveTypeInt /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeInt = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeLong =
			{
				Fragments._PrimitiveTypeLong__OclAny /* 0 */,
				Fragments._PrimitiveTypeLong__OclElement /* 1 */,
				Fragments._PrimitiveTypeLong__ASTNode /* 2 */,
				Fragments._PrimitiveTypeLong__NamedElement /* 3 */,
				Fragments._PrimitiveTypeLong__Type /* 4 */,
				Fragments._PrimitiveTypeLong__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeLong__PrimitiveTypeLong /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeLong = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeShort =
			{
				Fragments._PrimitiveTypeShort__OclAny /* 0 */,
				Fragments._PrimitiveTypeShort__OclElement /* 1 */,
				Fragments._PrimitiveTypeShort__ASTNode /* 2 */,
				Fragments._PrimitiveTypeShort__NamedElement /* 3 */,
				Fragments._PrimitiveTypeShort__Type /* 4 */,
				Fragments._PrimitiveTypeShort__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeShort__PrimitiveTypeShort /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeShort = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PrimitiveTypeVoid =
			{
				Fragments._PrimitiveTypeVoid__OclAny /* 0 */,
				Fragments._PrimitiveTypeVoid__OclElement /* 1 */,
				Fragments._PrimitiveTypeVoid__ASTNode /* 2 */,
				Fragments._PrimitiveTypeVoid__NamedElement /* 3 */,
				Fragments._PrimitiveTypeVoid__Type /* 4 */,
				Fragments._PrimitiveTypeVoid__PrimitiveType /* 5 */,
				Fragments._PrimitiveTypeVoid__PrimitiveTypeVoid /* 6 */
			};
		private static final int /*@NonNull*/ [] __PrimitiveTypeVoid = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _QueryCollection =
			{
				Fragments._QueryCollection__OclAny /* 0 */,
				Fragments._QueryCollection__OclElement /* 1 */,
				Fragments._QueryCollection__QueryCollection /* 2 */
			};
		private static final int /*@NonNull*/ [] __QueryCollection = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ReturnStatement =
			{
				Fragments._ReturnStatement__OclAny /* 0 */,
				Fragments._ReturnStatement__OclElement /* 1 */,
				Fragments._ReturnStatement__ASTNode /* 2 */,
				Fragments._ReturnStatement__Statement /* 3 */,
				Fragments._ReturnStatement__ReturnStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReturnStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SingleVariableAccess =
			{
				Fragments._SingleVariableAccess__OclAny /* 0 */,
				Fragments._SingleVariableAccess__OclElement /* 1 */,
				Fragments._SingleVariableAccess__ASTNode /* 2 */,
				Fragments._SingleVariableAccess__Expression /* 3 */,
				Fragments._SingleVariableAccess__SingleVariableAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __SingleVariableAccess = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SingleVariableDeclaration =
			{
				Fragments._SingleVariableDeclaration__OclAny /* 0 */,
				Fragments._SingleVariableDeclaration__OclElement /* 1 */,
				Fragments._SingleVariableDeclaration__ASTNode /* 2 */,
				Fragments._SingleVariableDeclaration__NamedElement /* 3 */,
				Fragments._SingleVariableDeclaration__VariableDeclaration /* 4 */,
				Fragments._SingleVariableDeclaration__SingleVariableDeclaration /* 5 */
			};
		private static final int /*@NonNull*/ [] __SingleVariableDeclaration = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Statement =
			{
				Fragments._Statement__OclAny /* 0 */,
				Fragments._Statement__OclElement /* 1 */,
				Fragments._Statement__ASTNode /* 2 */,
				Fragments._Statement__Statement /* 3 */
			};
		private static final int /*@NonNull*/ [] __Statement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StringLiteral =
			{
				Fragments._StringLiteral__OclAny /* 0 */,
				Fragments._StringLiteral__OclElement /* 1 */,
				Fragments._StringLiteral__ASTNode /* 2 */,
				Fragments._StringLiteral__Expression /* 3 */,
				Fragments._StringLiteral__StringLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __StringLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SuperConstructorInvocation =
			{
				Fragments._SuperConstructorInvocation__OclAny /* 0 */,
				Fragments._SuperConstructorInvocation__OclElement /* 1 */,
				Fragments._SuperConstructorInvocation__ASTNode /* 2 */,
				Fragments._SuperConstructorInvocation__AbstractMethodInvocation /* 3 */,
				Fragments._SuperConstructorInvocation__Statement /* 3 */,
				Fragments._SuperConstructorInvocation__SuperConstructorInvocation /* 4 */
			};
		private static final int /*@NonNull*/ [] __SuperConstructorInvocation = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SuperFieldAccess =
			{
				Fragments._SuperFieldAccess__OclAny /* 0 */,
				Fragments._SuperFieldAccess__OclElement /* 1 */,
				Fragments._SuperFieldAccess__ASTNode /* 2 */,
				Fragments._SuperFieldAccess__Expression /* 3 */,
				Fragments._SuperFieldAccess__AbstractTypeQualifiedExpression /* 4 */,
				Fragments._SuperFieldAccess__SuperFieldAccess /* 5 */
			};
		private static final int /*@NonNull*/ [] __SuperFieldAccess = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SuperMethodInvocation =
			{
				Fragments._SuperMethodInvocation__OclAny /* 0 */,
				Fragments._SuperMethodInvocation__OclElement /* 1 */,
				Fragments._SuperMethodInvocation__ASTNode /* 2 */,
				Fragments._SuperMethodInvocation__AbstractMethodInvocation /* 3 */,
				Fragments._SuperMethodInvocation__Expression /* 3 */,
				Fragments._SuperMethodInvocation__AbstractTypeQualifiedExpression /* 4 */,
				Fragments._SuperMethodInvocation__SuperMethodInvocation /* 5 */
			};
		private static final int /*@NonNull*/ [] __SuperMethodInvocation = { 1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SwitchCase =
			{
				Fragments._SwitchCase__OclAny /* 0 */,
				Fragments._SwitchCase__OclElement /* 1 */,
				Fragments._SwitchCase__ASTNode /* 2 */,
				Fragments._SwitchCase__Statement /* 3 */,
				Fragments._SwitchCase__SwitchCase /* 4 */
			};
		private static final int /*@NonNull*/ [] __SwitchCase = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SwitchStatement =
			{
				Fragments._SwitchStatement__OclAny /* 0 */,
				Fragments._SwitchStatement__OclElement /* 1 */,
				Fragments._SwitchStatement__ASTNode /* 2 */,
				Fragments._SwitchStatement__Statement /* 3 */,
				Fragments._SwitchStatement__SwitchStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __SwitchStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SynchronizedStatement =
			{
				Fragments._SynchronizedStatement__OclAny /* 0 */,
				Fragments._SynchronizedStatement__OclElement /* 1 */,
				Fragments._SynchronizedStatement__ASTNode /* 2 */,
				Fragments._SynchronizedStatement__Statement /* 3 */,
				Fragments._SynchronizedStatement__SynchronizedStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __SynchronizedStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TagElement =
			{
				Fragments._TagElement__OclAny /* 0 */,
				Fragments._TagElement__OclElement /* 1 */,
				Fragments._TagElement__ASTNode /* 2 */,
				Fragments._TagElement__TagElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __TagElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TextElement =
			{
				Fragments._TextElement__OclAny /* 0 */,
				Fragments._TextElement__OclElement /* 1 */,
				Fragments._TextElement__ASTNode /* 2 */,
				Fragments._TextElement__TextElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __TextElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ThisExpression =
			{
				Fragments._ThisExpression__OclAny /* 0 */,
				Fragments._ThisExpression__OclElement /* 1 */,
				Fragments._ThisExpression__ASTNode /* 2 */,
				Fragments._ThisExpression__Expression /* 3 */,
				Fragments._ThisExpression__AbstractTypeQualifiedExpression /* 4 */,
				Fragments._ThisExpression__ThisExpression /* 5 */
			};
		private static final int /*@NonNull*/ [] __ThisExpression = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ThrowStatement =
			{
				Fragments._ThrowStatement__OclAny /* 0 */,
				Fragments._ThrowStatement__OclElement /* 1 */,
				Fragments._ThrowStatement__ASTNode /* 2 */,
				Fragments._ThrowStatement__Statement /* 3 */,
				Fragments._ThrowStatement__ThrowStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __ThrowStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TryStatement =
			{
				Fragments._TryStatement__OclAny /* 0 */,
				Fragments._TryStatement__OclElement /* 1 */,
				Fragments._TryStatement__ASTNode /* 2 */,
				Fragments._TryStatement__Statement /* 3 */,
				Fragments._TryStatement__TryStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __TryStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__ASTNode /* 2 */,
				Fragments._Type__NamedElement /* 3 */,
				Fragments._Type__Type /* 4 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeAccess =
			{
				Fragments._TypeAccess__OclAny /* 0 */,
				Fragments._TypeAccess__OclElement /* 1 */,
				Fragments._TypeAccess__ASTNode /* 2 */,
				Fragments._TypeAccess__Expression /* 3 */,
				Fragments._TypeAccess__NamespaceAccess /* 3 */,
				Fragments._TypeAccess__TypeAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypeAccess = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeDeclaration =
			{
				Fragments._TypeDeclaration__OclAny /* 0 */,
				Fragments._TypeDeclaration__OclElement /* 1 */,
				Fragments._TypeDeclaration__ASTNode /* 2 */,
				Fragments._TypeDeclaration__NamedElement /* 3 */,
				Fragments._TypeDeclaration__BodyDeclaration /* 4 */,
				Fragments._TypeDeclaration__Type /* 4 */,
				Fragments._TypeDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._TypeDeclaration__TypeDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __TypeDeclaration = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeDeclarationStatement =
			{
				Fragments._TypeDeclarationStatement__OclAny /* 0 */,
				Fragments._TypeDeclarationStatement__OclElement /* 1 */,
				Fragments._TypeDeclarationStatement__ASTNode /* 2 */,
				Fragments._TypeDeclarationStatement__Statement /* 3 */,
				Fragments._TypeDeclarationStatement__TypeDeclarationStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypeDeclarationStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeLiteral =
			{
				Fragments._TypeLiteral__OclAny /* 0 */,
				Fragments._TypeLiteral__OclElement /* 1 */,
				Fragments._TypeLiteral__ASTNode /* 2 */,
				Fragments._TypeLiteral__Expression /* 3 */,
				Fragments._TypeLiteral__TypeLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypeLiteral = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeParameter =
			{
				Fragments._TypeParameter__OclAny /* 0 */,
				Fragments._TypeParameter__OclElement /* 1 */,
				Fragments._TypeParameter__ASTNode /* 2 */,
				Fragments._TypeParameter__NamedElement /* 3 */,
				Fragments._TypeParameter__Type /* 4 */,
				Fragments._TypeParameter__TypeParameter /* 5 */
			};
		private static final int /*@NonNull*/ [] __TypeParameter = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedAnnotationDeclaration =
			{
				Fragments._UnresolvedAnnotationDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedAnnotationDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedAnnotationDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedAnnotationDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedAnnotationDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedAnnotationDeclaration__Type /* 4 */,
				Fragments._UnresolvedAnnotationDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedAnnotationDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._UnresolvedAnnotationDeclaration__AnnotationTypeDeclaration /* 6 */,
				Fragments._UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration /* 7 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedAnnotationDeclaration = { 1,1,1,1,3,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration =
			{
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration /* 5 */,
				Fragments._UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedAnnotationTypeMemberDeclaration = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedClassDeclaration =
			{
				Fragments._UnresolvedClassDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedClassDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedClassDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedClassDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedClassDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedClassDeclaration__Type /* 4 */,
				Fragments._UnresolvedClassDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedClassDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._UnresolvedClassDeclaration__TypeDeclaration /* 6 */,
				Fragments._UnresolvedClassDeclaration__ClassDeclaration /* 7 */,
				Fragments._UnresolvedClassDeclaration__UnresolvedClassDeclaration /* 8 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedClassDeclaration = { 1,1,1,1,3,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedEnumDeclaration =
			{
				Fragments._UnresolvedEnumDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedEnumDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedEnumDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedEnumDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedEnumDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedEnumDeclaration__Type /* 4 */,
				Fragments._UnresolvedEnumDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedEnumDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._UnresolvedEnumDeclaration__EnumDeclaration /* 6 */,
				Fragments._UnresolvedEnumDeclaration__UnresolvedEnumDeclaration /* 7 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedEnumDeclaration = { 1,1,1,1,3,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedInterfaceDeclaration =
			{
				Fragments._UnresolvedInterfaceDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedInterfaceDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedInterfaceDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedInterfaceDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedInterfaceDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedInterfaceDeclaration__Type /* 4 */,
				Fragments._UnresolvedInterfaceDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedInterfaceDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._UnresolvedInterfaceDeclaration__TypeDeclaration /* 6 */,
				Fragments._UnresolvedInterfaceDeclaration__InterfaceDeclaration /* 7 */,
				Fragments._UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration /* 8 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedInterfaceDeclaration = { 1,1,1,1,3,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedItem =
			{
				Fragments._UnresolvedItem__OclAny /* 0 */,
				Fragments._UnresolvedItem__OclElement /* 1 */,
				Fragments._UnresolvedItem__ASTNode /* 2 */,
				Fragments._UnresolvedItem__NamedElement /* 3 */,
				Fragments._UnresolvedItem__UnresolvedItem /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedItem = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedItemAccess =
			{
				Fragments._UnresolvedItemAccess__OclAny /* 0 */,
				Fragments._UnresolvedItemAccess__OclElement /* 1 */,
				Fragments._UnresolvedItemAccess__ASTNode /* 2 */,
				Fragments._UnresolvedItemAccess__Expression /* 3 */,
				Fragments._UnresolvedItemAccess__NamespaceAccess /* 3 */,
				Fragments._UnresolvedItemAccess__UnresolvedItemAccess /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedItemAccess = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedLabeledStatement =
			{
				Fragments._UnresolvedLabeledStatement__OclAny /* 0 */,
				Fragments._UnresolvedLabeledStatement__OclElement /* 1 */,
				Fragments._UnresolvedLabeledStatement__ASTNode /* 2 */,
				Fragments._UnresolvedLabeledStatement__NamedElement /* 3 */,
				Fragments._UnresolvedLabeledStatement__Statement /* 3 */,
				Fragments._UnresolvedLabeledStatement__LabeledStatement /* 4 */,
				Fragments._UnresolvedLabeledStatement__UnresolvedItem /* 4 */,
				Fragments._UnresolvedLabeledStatement__UnresolvedLabeledStatement /* 5 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedLabeledStatement = { 1,1,1,2,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedMethodDeclaration =
			{
				Fragments._UnresolvedMethodDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedMethodDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedMethodDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedMethodDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedMethodDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedMethodDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedMethodDeclaration__AbstractMethodDeclaration /* 5 */,
				Fragments._UnresolvedMethodDeclaration__MethodDeclaration /* 6 */,
				Fragments._UnresolvedMethodDeclaration__UnresolvedMethodDeclaration /* 7 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedMethodDeclaration = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration =
			{
				Fragments._UnresolvedSingleVariableDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedSingleVariableDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedSingleVariableDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedSingleVariableDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedSingleVariableDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedSingleVariableDeclaration__VariableDeclaration /* 4 */,
				Fragments._UnresolvedSingleVariableDeclaration__SingleVariableDeclaration /* 5 */,
				Fragments._UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedSingleVariableDeclaration = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedType =
			{
				Fragments._UnresolvedType__OclAny /* 0 */,
				Fragments._UnresolvedType__OclElement /* 1 */,
				Fragments._UnresolvedType__ASTNode /* 2 */,
				Fragments._UnresolvedType__NamedElement /* 3 */,
				Fragments._UnresolvedType__Type /* 4 */,
				Fragments._UnresolvedType__UnresolvedItem /* 4 */,
				Fragments._UnresolvedType__UnresolvedType /* 5 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedType = { 1,1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedTypeDeclaration =
			{
				Fragments._UnresolvedTypeDeclaration__OclAny /* 0 */,
				Fragments._UnresolvedTypeDeclaration__OclElement /* 1 */,
				Fragments._UnresolvedTypeDeclaration__ASTNode /* 2 */,
				Fragments._UnresolvedTypeDeclaration__NamedElement /* 3 */,
				Fragments._UnresolvedTypeDeclaration__BodyDeclaration /* 4 */,
				Fragments._UnresolvedTypeDeclaration__Type /* 4 */,
				Fragments._UnresolvedTypeDeclaration__UnresolvedItem /* 4 */,
				Fragments._UnresolvedTypeDeclaration__AbstractTypeDeclaration /* 5 */,
				Fragments._UnresolvedTypeDeclaration__UnresolvedTypeDeclaration /* 6 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedTypeDeclaration = { 1,1,1,1,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment =
			{
				Fragments._UnresolvedVariableDeclarationFragment__OclAny /* 0 */,
				Fragments._UnresolvedVariableDeclarationFragment__OclElement /* 1 */,
				Fragments._UnresolvedVariableDeclarationFragment__ASTNode /* 2 */,
				Fragments._UnresolvedVariableDeclarationFragment__NamedElement /* 3 */,
				Fragments._UnresolvedVariableDeclarationFragment__UnresolvedItem /* 4 */,
				Fragments._UnresolvedVariableDeclarationFragment__VariableDeclaration /* 4 */,
				Fragments._UnresolvedVariableDeclarationFragment__VariableDeclarationFragment /* 5 */,
				Fragments._UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment /* 6 */
			};
		private static final int /*@NonNull*/ [] __UnresolvedVariableDeclarationFragment = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VariableDeclaration =
			{
				Fragments._VariableDeclaration__OclAny /* 0 */,
				Fragments._VariableDeclaration__OclElement /* 1 */,
				Fragments._VariableDeclaration__ASTNode /* 2 */,
				Fragments._VariableDeclaration__NamedElement /* 3 */,
				Fragments._VariableDeclaration__VariableDeclaration /* 4 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclaration = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VariableDeclarationExpression =
			{
				Fragments._VariableDeclarationExpression__OclAny /* 0 */,
				Fragments._VariableDeclarationExpression__OclElement /* 1 */,
				Fragments._VariableDeclarationExpression__ASTNode /* 2 */,
				Fragments._VariableDeclarationExpression__AbstractVariablesContainer /* 3 */,
				Fragments._VariableDeclarationExpression__Expression /* 3 */,
				Fragments._VariableDeclarationExpression__VariableDeclarationExpression /* 4 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclarationExpression = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VariableDeclarationFragment =
			{
				Fragments._VariableDeclarationFragment__OclAny /* 0 */,
				Fragments._VariableDeclarationFragment__OclElement /* 1 */,
				Fragments._VariableDeclarationFragment__ASTNode /* 2 */,
				Fragments._VariableDeclarationFragment__NamedElement /* 3 */,
				Fragments._VariableDeclarationFragment__VariableDeclaration /* 4 */,
				Fragments._VariableDeclarationFragment__VariableDeclarationFragment /* 5 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclarationFragment = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VariableDeclarationStatement =
			{
				Fragments._VariableDeclarationStatement__OclAny /* 0 */,
				Fragments._VariableDeclarationStatement__OclElement /* 1 */,
				Fragments._VariableDeclarationStatement__ASTNode /* 2 */,
				Fragments._VariableDeclarationStatement__AbstractVariablesContainer /* 3 */,
				Fragments._VariableDeclarationStatement__Statement /* 3 */,
				Fragments._VariableDeclarationStatement__VariableDeclarationStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __VariableDeclarationStatement = { 1,1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VisibilityKind =
			{
				Fragments._VisibilityKind__OclAny /* 0 */,
				Fragments._VisibilityKind__OclElement /* 1 */,
				Fragments._VisibilityKind__OclType /* 2 */,
				Fragments._VisibilityKind__OclEnumeration /* 3 */,
				Fragments._VisibilityKind__VisibilityKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __VisibilityKind = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _WhileStatement =
			{
				Fragments._WhileStatement__OclAny /* 0 */,
				Fragments._WhileStatement__OclElement /* 1 */,
				Fragments._WhileStatement__ASTNode /* 2 */,
				Fragments._WhileStatement__Statement /* 3 */,
				Fragments._WhileStatement__WhileStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __WhileStatement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _WildCardType =
			{
				Fragments._WildCardType__OclAny /* 0 */,
				Fragments._WildCardType__OclElement /* 1 */,
				Fragments._WildCardType__ASTNode /* 2 */,
				Fragments._WildCardType__NamedElement /* 3 */,
				Fragments._WildCardType__Type /* 4 */,
				Fragments._WildCardType__WildCardType /* 5 */
			};
		private static final int /*@NonNull*/ [] __WildCardType = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ASTNode.initFragments(_ASTNode, __ASTNode);
			Types._AbstractMethodDeclaration.initFragments(_AbstractMethodDeclaration, __AbstractMethodDeclaration);
			Types._AbstractMethodInvocation.initFragments(_AbstractMethodInvocation, __AbstractMethodInvocation);
			Types._AbstractTypeDeclaration.initFragments(_AbstractTypeDeclaration, __AbstractTypeDeclaration);
			Types._AbstractTypeQualifiedExpression.initFragments(_AbstractTypeQualifiedExpression, __AbstractTypeQualifiedExpression);
			Types._AbstractVariablesContainer.initFragments(_AbstractVariablesContainer, __AbstractVariablesContainer);
			Types._Annotation.initFragments(_Annotation, __Annotation);
			Types._AnnotationMemberValuePair.initFragments(_AnnotationMemberValuePair, __AnnotationMemberValuePair);
			Types._AnnotationTypeDeclaration.initFragments(_AnnotationTypeDeclaration, __AnnotationTypeDeclaration);
			Types._AnnotationTypeMemberDeclaration.initFragments(_AnnotationTypeMemberDeclaration, __AnnotationTypeMemberDeclaration);
			Types._AnonymousClassDeclaration.initFragments(_AnonymousClassDeclaration, __AnonymousClassDeclaration);
			Types._Archive.initFragments(_Archive, __Archive);
			Types._ArrayAccess.initFragments(_ArrayAccess, __ArrayAccess);
			Types._ArrayCreation.initFragments(_ArrayCreation, __ArrayCreation);
			Types._ArrayInitializer.initFragments(_ArrayInitializer, __ArrayInitializer);
			Types._ArrayLengthAccess.initFragments(_ArrayLengthAccess, __ArrayLengthAccess);
			Types._ArrayType.initFragments(_ArrayType, __ArrayType);
			Types._AssertStatement.initFragments(_AssertStatement, __AssertStatement);
			Types._Assignment.initFragments(_Assignment, __Assignment);
			Types._AssignmentKind.initFragments(_AssignmentKind, __AssignmentKind);
			Types._Block.initFragments(_Block, __Block);
			Types._BlockComment.initFragments(_BlockComment, __BlockComment);
			Types._BodyDeclaration.initFragments(_BodyDeclaration, __BodyDeclaration);
			Types._BooleanLiteral.initFragments(_BooleanLiteral, __BooleanLiteral);
			Types._BreakStatement.initFragments(_BreakStatement, __BreakStatement);
			Types._CastExpression.initFragments(_CastExpression, __CastExpression);
			Types._CatchClause.initFragments(_CatchClause, __CatchClause);
			Types._CharacterLiteral.initFragments(_CharacterLiteral, __CharacterLiteral);
			Types._ClassDeclaration.initFragments(_ClassDeclaration, __ClassDeclaration);
			Types._ClassFile.initFragments(_ClassFile, __ClassFile);
			Types._ClassInstanceCreation.initFragments(_ClassInstanceCreation, __ClassInstanceCreation);
			Types._Comment.initFragments(_Comment, __Comment);
			Types._CompilationUnit.initFragments(_CompilationUnit, __CompilationUnit);
			Types._ConditionalExpression.initFragments(_ConditionalExpression, __ConditionalExpression);
			Types._ConstructorDeclaration.initFragments(_ConstructorDeclaration, __ConstructorDeclaration);
			Types._ConstructorInvocation.initFragments(_ConstructorInvocation, __ConstructorInvocation);
			Types._ContinueStatement.initFragments(_ContinueStatement, __ContinueStatement);
			Types._DoStatement.initFragments(_DoStatement, __DoStatement);
			Types._EmptyStatement.initFragments(_EmptyStatement, __EmptyStatement);
			Types._EnhancedForStatement.initFragments(_EnhancedForStatement, __EnhancedForStatement);
			Types._EnumConstantDeclaration.initFragments(_EnumConstantDeclaration, __EnumConstantDeclaration);
			Types._EnumDeclaration.initFragments(_EnumDeclaration, __EnumDeclaration);
			Types._Expression.initFragments(_Expression, __Expression);
			Types._ExpressionStatement.initFragments(_ExpressionStatement, __ExpressionStatement);
			Types._FieldAccess.initFragments(_FieldAccess, __FieldAccess);
			Types._FieldDeclaration.initFragments(_FieldDeclaration, __FieldDeclaration);
			Types._ForStatement.initFragments(_ForStatement, __ForStatement);
			Types._IfStatement.initFragments(_IfStatement, __IfStatement);
			Types._ImportDeclaration.initFragments(_ImportDeclaration, __ImportDeclaration);
			Types._InfixExpression.initFragments(_InfixExpression, __InfixExpression);
			Types._InfixExpressionKind.initFragments(_InfixExpressionKind, __InfixExpressionKind);
			Types._InheritanceKind.initFragments(_InheritanceKind, __InheritanceKind);
			Types._Initializer.initFragments(_Initializer, __Initializer);
			Types._InstanceofExpression.initFragments(_InstanceofExpression, __InstanceofExpression);
			Types._InterfaceDeclaration.initFragments(_InterfaceDeclaration, __InterfaceDeclaration);
			Types._Javadoc.initFragments(_Javadoc, __Javadoc);
			Types._LabeledStatement.initFragments(_LabeledStatement, __LabeledStatement);
			Types._LineComment.initFragments(_LineComment, __LineComment);
			Types._Manifest.initFragments(_Manifest, __Manifest);
			Types._ManifestAttribute.initFragments(_ManifestAttribute, __ManifestAttribute);
			Types._ManifestEntry.initFragments(_ManifestEntry, __ManifestEntry);
			Types._MemberRef.initFragments(_MemberRef, __MemberRef);
			Types._MethodDeclaration.initFragments(_MethodDeclaration, __MethodDeclaration);
			Types._MethodInvocation.initFragments(_MethodInvocation, __MethodInvocation);
			Types._MethodRef.initFragments(_MethodRef, __MethodRef);
			Types._MethodRefParameter.initFragments(_MethodRefParameter, __MethodRefParameter);
			Types._Model.initFragments(_Model, __Model);
			Types._Modifier.initFragments(_Modifier, __Modifier);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._NamespaceAccess.initFragments(_NamespaceAccess, __NamespaceAccess);
			Types._NullLiteral.initFragments(_NullLiteral, __NullLiteral);
			Types._NumberLiteral.initFragments(_NumberLiteral, __NumberLiteral);
			Types._Package.initFragments(_Package, __Package);
			Types._PackageAccess.initFragments(_PackageAccess, __PackageAccess);
			Types._ParameterizedType.initFragments(_ParameterizedType, __ParameterizedType);
			Types._ParenthesizedExpression.initFragments(_ParenthesizedExpression, __ParenthesizedExpression);
			Types._PostfixExpression.initFragments(_PostfixExpression, __PostfixExpression);
			Types._PostfixExpressionKind.initFragments(_PostfixExpressionKind, __PostfixExpressionKind);
			Types._PrefixExpression.initFragments(_PrefixExpression, __PrefixExpression);
			Types._PrefixExpressionKind.initFragments(_PrefixExpressionKind, __PrefixExpressionKind);
			Types._PrimitiveType.initFragments(_PrimitiveType, __PrimitiveType);
			Types._PrimitiveTypeBoolean.initFragments(_PrimitiveTypeBoolean, __PrimitiveTypeBoolean);
			Types._PrimitiveTypeByte.initFragments(_PrimitiveTypeByte, __PrimitiveTypeByte);
			Types._PrimitiveTypeChar.initFragments(_PrimitiveTypeChar, __PrimitiveTypeChar);
			Types._PrimitiveTypeDouble.initFragments(_PrimitiveTypeDouble, __PrimitiveTypeDouble);
			Types._PrimitiveTypeFloat.initFragments(_PrimitiveTypeFloat, __PrimitiveTypeFloat);
			Types._PrimitiveTypeInt.initFragments(_PrimitiveTypeInt, __PrimitiveTypeInt);
			Types._PrimitiveTypeLong.initFragments(_PrimitiveTypeLong, __PrimitiveTypeLong);
			Types._PrimitiveTypeShort.initFragments(_PrimitiveTypeShort, __PrimitiveTypeShort);
			Types._PrimitiveTypeVoid.initFragments(_PrimitiveTypeVoid, __PrimitiveTypeVoid);
			Types._QueryCollection.initFragments(_QueryCollection, __QueryCollection);
			Types._ReturnStatement.initFragments(_ReturnStatement, __ReturnStatement);
			Types._SingleVariableAccess.initFragments(_SingleVariableAccess, __SingleVariableAccess);
			Types._SingleVariableDeclaration.initFragments(_SingleVariableDeclaration, __SingleVariableDeclaration);
			Types._Statement.initFragments(_Statement, __Statement);
			Types._StringLiteral.initFragments(_StringLiteral, __StringLiteral);
			Types._SuperConstructorInvocation.initFragments(_SuperConstructorInvocation, __SuperConstructorInvocation);
			Types._SuperFieldAccess.initFragments(_SuperFieldAccess, __SuperFieldAccess);
			Types._SuperMethodInvocation.initFragments(_SuperMethodInvocation, __SuperMethodInvocation);
			Types._SwitchCase.initFragments(_SwitchCase, __SwitchCase);
			Types._SwitchStatement.initFragments(_SwitchStatement, __SwitchStatement);
			Types._SynchronizedStatement.initFragments(_SynchronizedStatement, __SynchronizedStatement);
			Types._TagElement.initFragments(_TagElement, __TagElement);
			Types._TextElement.initFragments(_TextElement, __TextElement);
			Types._ThisExpression.initFragments(_ThisExpression, __ThisExpression);
			Types._ThrowStatement.initFragments(_ThrowStatement, __ThrowStatement);
			Types._TryStatement.initFragments(_TryStatement, __TryStatement);
			Types._Type.initFragments(_Type, __Type);
			Types._TypeAccess.initFragments(_TypeAccess, __TypeAccess);
			Types._TypeDeclaration.initFragments(_TypeDeclaration, __TypeDeclaration);
			Types._TypeDeclarationStatement.initFragments(_TypeDeclarationStatement, __TypeDeclarationStatement);
			Types._TypeLiteral.initFragments(_TypeLiteral, __TypeLiteral);
			Types._TypeParameter.initFragments(_TypeParameter, __TypeParameter);
			Types._UnresolvedAnnotationDeclaration.initFragments(_UnresolvedAnnotationDeclaration, __UnresolvedAnnotationDeclaration);
			Types._UnresolvedAnnotationTypeMemberDeclaration.initFragments(_UnresolvedAnnotationTypeMemberDeclaration, __UnresolvedAnnotationTypeMemberDeclaration);
			Types._UnresolvedClassDeclaration.initFragments(_UnresolvedClassDeclaration, __UnresolvedClassDeclaration);
			Types._UnresolvedEnumDeclaration.initFragments(_UnresolvedEnumDeclaration, __UnresolvedEnumDeclaration);
			Types._UnresolvedInterfaceDeclaration.initFragments(_UnresolvedInterfaceDeclaration, __UnresolvedInterfaceDeclaration);
			Types._UnresolvedItem.initFragments(_UnresolvedItem, __UnresolvedItem);
			Types._UnresolvedItemAccess.initFragments(_UnresolvedItemAccess, __UnresolvedItemAccess);
			Types._UnresolvedLabeledStatement.initFragments(_UnresolvedLabeledStatement, __UnresolvedLabeledStatement);
			Types._UnresolvedMethodDeclaration.initFragments(_UnresolvedMethodDeclaration, __UnresolvedMethodDeclaration);
			Types._UnresolvedSingleVariableDeclaration.initFragments(_UnresolvedSingleVariableDeclaration, __UnresolvedSingleVariableDeclaration);
			Types._UnresolvedType.initFragments(_UnresolvedType, __UnresolvedType);
			Types._UnresolvedTypeDeclaration.initFragments(_UnresolvedTypeDeclaration, __UnresolvedTypeDeclaration);
			Types._UnresolvedVariableDeclarationFragment.initFragments(_UnresolvedVariableDeclarationFragment, __UnresolvedVariableDeclarationFragment);
			Types._VariableDeclaration.initFragments(_VariableDeclaration, __VariableDeclaration);
			Types._VariableDeclarationExpression.initFragments(_VariableDeclarationExpression, __VariableDeclarationExpression);
			Types._VariableDeclarationFragment.initFragments(_VariableDeclarationFragment, __VariableDeclarationFragment);
			Types._VariableDeclarationStatement.initFragments(_VariableDeclarationStatement, __VariableDeclarationStatement);
			Types._VisibilityKind.initFragments(_VisibilityKind, __VisibilityKind);
			Types._WhileStatement.initFragments(_WhileStatement, __WhileStatement);
			Types._WildCardType.initFragments(_WildCardType, __WildCardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ASTNode__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ASTNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ASTNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__AbstractMethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodInvocation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodInvocation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodInvocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractMethodInvocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeDeclaration__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeQualifiedExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeQualifiedExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeQualifiedExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractTypeQualifiedExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractVariablesContainer__AbstractVariablesContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractVariablesContainer__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractVariablesContainer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AbstractVariablesContainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__Annotation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationMemberValuePair__AnnotationMemberValuePair = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationMemberValuePair__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationMemberValuePair__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationMemberValuePair__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationMemberValuePair__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__AnnotationTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeDeclaration__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotationTypeMemberDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnonymousClassDeclaration__AnonymousClassDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnonymousClassDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnonymousClassDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnonymousClassDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Archive__Archive = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Archive__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Archive__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Archive__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Archive__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayAccess__ArrayAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayCreation__ArrayCreation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayCreation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayCreation__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayCreation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayCreation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayInitializer__ArrayInitializer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayInitializer__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayInitializer__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayInitializer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayInitializer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayLengthAccess__ArrayLengthAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayLengthAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayLengthAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayLengthAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayLengthAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__ArrayType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssertStatement__AssertStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssertStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssertStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssertStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssertStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Assignment__Assignment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Assignment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Assignment__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Assignment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Assignment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssignmentKind__AssignmentKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssignmentKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssignmentKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssignmentKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AssignmentKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__Block = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlockComment__BlockComment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlockComment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlockComment__Comment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlockComment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlockComment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BodyDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BodyDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BodyDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BodyDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BodyDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__BooleanLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BreakStatement__BreakStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BreakStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BreakStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BreakStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BreakStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CastExpression__CastExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CastExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CastExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CastExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CastExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CatchClause__CatchClause = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CatchClause__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CatchClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CatchClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CatchClause__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CharacterLiteral__CharacterLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CharacterLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CharacterLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CharacterLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CharacterLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__ClassDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassDeclaration__TypeDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassFile__ClassFile = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassFile__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassFile__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassFile__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassFile__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__ClassInstanceCreation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ClassInstanceCreation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__Comment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompilationUnit__CompilationUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompilationUnit__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompilationUnit__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompilationUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompilationUnit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConditionalExpression__ConditionalExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConditionalExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConditionalExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConditionalExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConditionalExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__ConstructorDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__AbstractMethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__ConstructorInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ConstructorInvocation__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ContinueStatement__ContinueStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ContinueStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ContinueStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ContinueStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ContinueStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DoStatement__DoStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DoStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DoStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DoStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DoStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EmptyStatement__EmptyStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EmptyStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EmptyStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EmptyStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EmptyStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnhancedForStatement__EnhancedForStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnhancedForStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnhancedForStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnhancedForStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnhancedForStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__EnumConstantDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumConstantDeclaration__VariableDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__EnumDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumDeclaration__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Expression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Expression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Expression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Expression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExpressionStatement__ExpressionStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExpressionStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExpressionStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExpressionStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ExpressionStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldAccess__FieldAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__FieldDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__AbstractVariablesContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FieldDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ForStatement__ForStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ForStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ForStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ForStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ForStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IfStatement__IfStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IfStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IfStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IfStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IfStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportDeclaration__ImportDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ImportDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpression__InfixExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpressionKind__InfixExpressionKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpressionKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpressionKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpressionKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InfixExpressionKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InheritanceKind__InheritanceKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InheritanceKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InheritanceKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InheritanceKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InheritanceKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__Initializer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Initializer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceofExpression__InstanceofExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceofExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceofExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceofExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceofExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__InterfaceDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InterfaceDeclaration__TypeDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Javadoc__Javadoc = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Javadoc__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Javadoc__Comment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Javadoc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Javadoc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__LabeledStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LabeledStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LineComment__LineComment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LineComment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LineComment__Comment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LineComment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LineComment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manifest__Manifest = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manifest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manifest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestAttribute__ManifestAttribute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestEntry__ManifestEntry = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestEntry__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ManifestEntry__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MemberRef__MemberRef = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MemberRef__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MemberRef__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MemberRef__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__MethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__AbstractMethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__MethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodInvocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRef__MethodRef = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRef__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRef__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRef__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRefParameter__MethodRefParameter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRefParameter__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRefParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MethodRefParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Modifier__Modifier = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Modifier__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Modifier__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Modifier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamespaceAccess__NamespaceAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamespaceAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamespaceAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamespaceAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NullLiteral__NullLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NullLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NullLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NullLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NullLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumberLiteral__NumberLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumberLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumberLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumberLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumberLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Package__Package = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Package__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Package__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Package__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Package__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageAccess__PackageAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageAccess__NamespaceAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__ParameterizedType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParameterizedType__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParenthesizedExpression__ParenthesizedExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParenthesizedExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParenthesizedExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParenthesizedExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ParenthesizedExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpression__PostfixExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpressionKind__PostfixExpressionKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpressionKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpressionKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpressionKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PostfixExpressionKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpression__PrefixExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpressionKind__PrefixExpressionKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpressionKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpressionKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpressionKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrefixExpressionKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveType__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__PrimitiveTypeBoolean = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeBoolean__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__PrimitiveTypeByte = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeByte__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__PrimitiveTypeChar = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeChar__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__PrimitiveTypeDouble = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeDouble__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__PrimitiveTypeFloat = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeFloat__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__PrimitiveTypeInt = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeInt__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__PrimitiveTypeLong = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeLong__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__PrimitiveTypeShort = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeShort__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__PrimitiveTypeVoid = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__PrimitiveType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PrimitiveTypeVoid__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _QueryCollection__QueryCollection = {
			Java_Tables.Operations._QueryCollection__emptyTextElementInJavadoc /* emptyTextElementInJavadoc(Model[?]) */,
			Java_Tables.Operations._QueryCollection__grabats09 /* grabats09() */,
			Java_Tables.Operations._QueryCollection__invisibleMethods /* invisibleMethods() */,
			Java_Tables.Operations._QueryCollection__textElementInJavadoc /* textElementInJavadoc(Model[?]) */,
			Java_Tables.Operations._QueryCollection__thrownExceptions /* thrownExceptions() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _QueryCollection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _QueryCollection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ReturnStatement__ReturnStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ReturnStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ReturnStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ReturnStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ReturnStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableAccess__SingleVariableAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__SingleVariableDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleVariableDeclaration__VariableDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statement__Statement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringLiteral__StringLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__SuperConstructorInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperConstructorInvocation__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__SuperFieldAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__AbstractTypeQualifiedExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperFieldAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__SuperMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__AbstractMethodInvocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__AbstractTypeQualifiedExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuperMethodInvocation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchCase__SwitchCase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchCase__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchCase__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchCase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchCase__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchStatement__SwitchStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SwitchStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SynchronizedStatement__SynchronizedStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SynchronizedStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SynchronizedStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SynchronizedStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SynchronizedStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TagElement__TagElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TagElement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TagElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TagElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TextElement__TextElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TextElement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TextElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TextElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__ThisExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__AbstractTypeQualifiedExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThisExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThrowStatement__ThrowStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThrowStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThrowStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThrowStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ThrowStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TryStatement__TryStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TryStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TryStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TryStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TryStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__TypeAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__NamespaceAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__TypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclaration__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclarationStatement__TypeDeclarationStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclarationStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclarationStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclarationStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeDeclarationStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeLiteral__TypeLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeLiteral__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeLiteral__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__TypeParameter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeParameter__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__AnnotationTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__UnresolvedClassDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__ClassDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__TypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedClassDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__UnresolvedEnumDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__EnumDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedEnumDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__InterfaceDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__TypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedInterfaceDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItem__UnresolvedItem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItem__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItem__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__UnresolvedItemAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__NamespaceAccess = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedItemAccess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__UnresolvedLabeledStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__LabeledStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__Statement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedLabeledStatement__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__UnresolvedMethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__AbstractMethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__MethodDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedMethodDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__SingleVariableDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__UnresolvedItem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration__VariableDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__UnresolvedType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedType__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__UnresolvedTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__AbstractTypeDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__BodyDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedTypeDeclaration__UnresolvedItem = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__UnresolvedItem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__VariableDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment__VariableDeclarationFragment = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__VariableDeclaration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__VariableDeclarationExpression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__AbstractVariablesContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__Expression = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__VariableDeclarationFragment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationFragment__VariableDeclaration = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__VariableDeclarationStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__AbstractVariablesContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VariableDeclarationStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityKind__VisibilityKind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WhileStatement__WhileStatement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WhileStatement__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WhileStatement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WhileStatement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WhileStatement__Statement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__WildCardType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__ASTNode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _WildCardType__Type = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ASTNode__ASTNode.initOperations(_ASTNode__ASTNode);
			Fragments._ASTNode__OclAny.initOperations(_ASTNode__OclAny);
			Fragments._ASTNode__OclElement.initOperations(_ASTNode__OclElement);

			Fragments._AbstractMethodDeclaration__ASTNode.initOperations(_AbstractMethodDeclaration__ASTNode);
			Fragments._AbstractMethodDeclaration__AbstractMethodDeclaration.initOperations(_AbstractMethodDeclaration__AbstractMethodDeclaration);
			Fragments._AbstractMethodDeclaration__BodyDeclaration.initOperations(_AbstractMethodDeclaration__BodyDeclaration);
			Fragments._AbstractMethodDeclaration__NamedElement.initOperations(_AbstractMethodDeclaration__NamedElement);
			Fragments._AbstractMethodDeclaration__OclAny.initOperations(_AbstractMethodDeclaration__OclAny);
			Fragments._AbstractMethodDeclaration__OclElement.initOperations(_AbstractMethodDeclaration__OclElement);

			Fragments._AbstractMethodInvocation__ASTNode.initOperations(_AbstractMethodInvocation__ASTNode);
			Fragments._AbstractMethodInvocation__AbstractMethodInvocation.initOperations(_AbstractMethodInvocation__AbstractMethodInvocation);
			Fragments._AbstractMethodInvocation__OclAny.initOperations(_AbstractMethodInvocation__OclAny);
			Fragments._AbstractMethodInvocation__OclElement.initOperations(_AbstractMethodInvocation__OclElement);

			Fragments._AbstractTypeDeclaration__ASTNode.initOperations(_AbstractTypeDeclaration__ASTNode);
			Fragments._AbstractTypeDeclaration__AbstractTypeDeclaration.initOperations(_AbstractTypeDeclaration__AbstractTypeDeclaration);
			Fragments._AbstractTypeDeclaration__BodyDeclaration.initOperations(_AbstractTypeDeclaration__BodyDeclaration);
			Fragments._AbstractTypeDeclaration__NamedElement.initOperations(_AbstractTypeDeclaration__NamedElement);
			Fragments._AbstractTypeDeclaration__OclAny.initOperations(_AbstractTypeDeclaration__OclAny);
			Fragments._AbstractTypeDeclaration__OclElement.initOperations(_AbstractTypeDeclaration__OclElement);
			Fragments._AbstractTypeDeclaration__Type.initOperations(_AbstractTypeDeclaration__Type);

			Fragments._AbstractTypeQualifiedExpression__ASTNode.initOperations(_AbstractTypeQualifiedExpression__ASTNode);
			Fragments._AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression.initOperations(_AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression);
			Fragments._AbstractTypeQualifiedExpression__Expression.initOperations(_AbstractTypeQualifiedExpression__Expression);
			Fragments._AbstractTypeQualifiedExpression__OclAny.initOperations(_AbstractTypeQualifiedExpression__OclAny);
			Fragments._AbstractTypeQualifiedExpression__OclElement.initOperations(_AbstractTypeQualifiedExpression__OclElement);

			Fragments._AbstractVariablesContainer__ASTNode.initOperations(_AbstractVariablesContainer__ASTNode);
			Fragments._AbstractVariablesContainer__AbstractVariablesContainer.initOperations(_AbstractVariablesContainer__AbstractVariablesContainer);
			Fragments._AbstractVariablesContainer__OclAny.initOperations(_AbstractVariablesContainer__OclAny);
			Fragments._AbstractVariablesContainer__OclElement.initOperations(_AbstractVariablesContainer__OclElement);

			Fragments._Annotation__ASTNode.initOperations(_Annotation__ASTNode);
			Fragments._Annotation__Annotation.initOperations(_Annotation__Annotation);
			Fragments._Annotation__Expression.initOperations(_Annotation__Expression);
			Fragments._Annotation__OclAny.initOperations(_Annotation__OclAny);
			Fragments._Annotation__OclElement.initOperations(_Annotation__OclElement);

			Fragments._AnnotationMemberValuePair__ASTNode.initOperations(_AnnotationMemberValuePair__ASTNode);
			Fragments._AnnotationMemberValuePair__AnnotationMemberValuePair.initOperations(_AnnotationMemberValuePair__AnnotationMemberValuePair);
			Fragments._AnnotationMemberValuePair__NamedElement.initOperations(_AnnotationMemberValuePair__NamedElement);
			Fragments._AnnotationMemberValuePair__OclAny.initOperations(_AnnotationMemberValuePair__OclAny);
			Fragments._AnnotationMemberValuePair__OclElement.initOperations(_AnnotationMemberValuePair__OclElement);

			Fragments._AnnotationTypeDeclaration__ASTNode.initOperations(_AnnotationTypeDeclaration__ASTNode);
			Fragments._AnnotationTypeDeclaration__AbstractTypeDeclaration.initOperations(_AnnotationTypeDeclaration__AbstractTypeDeclaration);
			Fragments._AnnotationTypeDeclaration__AnnotationTypeDeclaration.initOperations(_AnnotationTypeDeclaration__AnnotationTypeDeclaration);
			Fragments._AnnotationTypeDeclaration__BodyDeclaration.initOperations(_AnnotationTypeDeclaration__BodyDeclaration);
			Fragments._AnnotationTypeDeclaration__NamedElement.initOperations(_AnnotationTypeDeclaration__NamedElement);
			Fragments._AnnotationTypeDeclaration__OclAny.initOperations(_AnnotationTypeDeclaration__OclAny);
			Fragments._AnnotationTypeDeclaration__OclElement.initOperations(_AnnotationTypeDeclaration__OclElement);
			Fragments._AnnotationTypeDeclaration__Type.initOperations(_AnnotationTypeDeclaration__Type);

			Fragments._AnnotationTypeMemberDeclaration__ASTNode.initOperations(_AnnotationTypeMemberDeclaration__ASTNode);
			Fragments._AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration.initOperations(_AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration);
			Fragments._AnnotationTypeMemberDeclaration__BodyDeclaration.initOperations(_AnnotationTypeMemberDeclaration__BodyDeclaration);
			Fragments._AnnotationTypeMemberDeclaration__NamedElement.initOperations(_AnnotationTypeMemberDeclaration__NamedElement);
			Fragments._AnnotationTypeMemberDeclaration__OclAny.initOperations(_AnnotationTypeMemberDeclaration__OclAny);
			Fragments._AnnotationTypeMemberDeclaration__OclElement.initOperations(_AnnotationTypeMemberDeclaration__OclElement);

			Fragments._AnonymousClassDeclaration__ASTNode.initOperations(_AnonymousClassDeclaration__ASTNode);
			Fragments._AnonymousClassDeclaration__AnonymousClassDeclaration.initOperations(_AnonymousClassDeclaration__AnonymousClassDeclaration);
			Fragments._AnonymousClassDeclaration__OclAny.initOperations(_AnonymousClassDeclaration__OclAny);
			Fragments._AnonymousClassDeclaration__OclElement.initOperations(_AnonymousClassDeclaration__OclElement);

			Fragments._Archive__ASTNode.initOperations(_Archive__ASTNode);
			Fragments._Archive__Archive.initOperations(_Archive__Archive);
			Fragments._Archive__NamedElement.initOperations(_Archive__NamedElement);
			Fragments._Archive__OclAny.initOperations(_Archive__OclAny);
			Fragments._Archive__OclElement.initOperations(_Archive__OclElement);

			Fragments._ArrayAccess__ASTNode.initOperations(_ArrayAccess__ASTNode);
			Fragments._ArrayAccess__ArrayAccess.initOperations(_ArrayAccess__ArrayAccess);
			Fragments._ArrayAccess__Expression.initOperations(_ArrayAccess__Expression);
			Fragments._ArrayAccess__OclAny.initOperations(_ArrayAccess__OclAny);
			Fragments._ArrayAccess__OclElement.initOperations(_ArrayAccess__OclElement);

			Fragments._ArrayCreation__ASTNode.initOperations(_ArrayCreation__ASTNode);
			Fragments._ArrayCreation__ArrayCreation.initOperations(_ArrayCreation__ArrayCreation);
			Fragments._ArrayCreation__Expression.initOperations(_ArrayCreation__Expression);
			Fragments._ArrayCreation__OclAny.initOperations(_ArrayCreation__OclAny);
			Fragments._ArrayCreation__OclElement.initOperations(_ArrayCreation__OclElement);

			Fragments._ArrayInitializer__ASTNode.initOperations(_ArrayInitializer__ASTNode);
			Fragments._ArrayInitializer__ArrayInitializer.initOperations(_ArrayInitializer__ArrayInitializer);
			Fragments._ArrayInitializer__Expression.initOperations(_ArrayInitializer__Expression);
			Fragments._ArrayInitializer__OclAny.initOperations(_ArrayInitializer__OclAny);
			Fragments._ArrayInitializer__OclElement.initOperations(_ArrayInitializer__OclElement);

			Fragments._ArrayLengthAccess__ASTNode.initOperations(_ArrayLengthAccess__ASTNode);
			Fragments._ArrayLengthAccess__ArrayLengthAccess.initOperations(_ArrayLengthAccess__ArrayLengthAccess);
			Fragments._ArrayLengthAccess__Expression.initOperations(_ArrayLengthAccess__Expression);
			Fragments._ArrayLengthAccess__OclAny.initOperations(_ArrayLengthAccess__OclAny);
			Fragments._ArrayLengthAccess__OclElement.initOperations(_ArrayLengthAccess__OclElement);

			Fragments._ArrayType__ASTNode.initOperations(_ArrayType__ASTNode);
			Fragments._ArrayType__ArrayType.initOperations(_ArrayType__ArrayType);
			Fragments._ArrayType__NamedElement.initOperations(_ArrayType__NamedElement);
			Fragments._ArrayType__OclAny.initOperations(_ArrayType__OclAny);
			Fragments._ArrayType__OclElement.initOperations(_ArrayType__OclElement);
			Fragments._ArrayType__Type.initOperations(_ArrayType__Type);

			Fragments._AssertStatement__ASTNode.initOperations(_AssertStatement__ASTNode);
			Fragments._AssertStatement__AssertStatement.initOperations(_AssertStatement__AssertStatement);
			Fragments._AssertStatement__OclAny.initOperations(_AssertStatement__OclAny);
			Fragments._AssertStatement__OclElement.initOperations(_AssertStatement__OclElement);
			Fragments._AssertStatement__Statement.initOperations(_AssertStatement__Statement);

			Fragments._Assignment__ASTNode.initOperations(_Assignment__ASTNode);
			Fragments._Assignment__Assignment.initOperations(_Assignment__Assignment);
			Fragments._Assignment__Expression.initOperations(_Assignment__Expression);
			Fragments._Assignment__OclAny.initOperations(_Assignment__OclAny);
			Fragments._Assignment__OclElement.initOperations(_Assignment__OclElement);

			Fragments._AssignmentKind__AssignmentKind.initOperations(_AssignmentKind__AssignmentKind);
			Fragments._AssignmentKind__OclAny.initOperations(_AssignmentKind__OclAny);
			Fragments._AssignmentKind__OclElement.initOperations(_AssignmentKind__OclElement);
			Fragments._AssignmentKind__OclEnumeration.initOperations(_AssignmentKind__OclEnumeration);
			Fragments._AssignmentKind__OclType.initOperations(_AssignmentKind__OclType);

			Fragments._Block__ASTNode.initOperations(_Block__ASTNode);
			Fragments._Block__Block.initOperations(_Block__Block);
			Fragments._Block__OclAny.initOperations(_Block__OclAny);
			Fragments._Block__OclElement.initOperations(_Block__OclElement);
			Fragments._Block__Statement.initOperations(_Block__Statement);

			Fragments._BlockComment__ASTNode.initOperations(_BlockComment__ASTNode);
			Fragments._BlockComment__BlockComment.initOperations(_BlockComment__BlockComment);
			Fragments._BlockComment__Comment.initOperations(_BlockComment__Comment);
			Fragments._BlockComment__OclAny.initOperations(_BlockComment__OclAny);
			Fragments._BlockComment__OclElement.initOperations(_BlockComment__OclElement);

			Fragments._BodyDeclaration__ASTNode.initOperations(_BodyDeclaration__ASTNode);
			Fragments._BodyDeclaration__BodyDeclaration.initOperations(_BodyDeclaration__BodyDeclaration);
			Fragments._BodyDeclaration__NamedElement.initOperations(_BodyDeclaration__NamedElement);
			Fragments._BodyDeclaration__OclAny.initOperations(_BodyDeclaration__OclAny);
			Fragments._BodyDeclaration__OclElement.initOperations(_BodyDeclaration__OclElement);

			Fragments._BooleanLiteral__ASTNode.initOperations(_BooleanLiteral__ASTNode);
			Fragments._BooleanLiteral__BooleanLiteral.initOperations(_BooleanLiteral__BooleanLiteral);
			Fragments._BooleanLiteral__Expression.initOperations(_BooleanLiteral__Expression);
			Fragments._BooleanLiteral__OclAny.initOperations(_BooleanLiteral__OclAny);
			Fragments._BooleanLiteral__OclElement.initOperations(_BooleanLiteral__OclElement);

			Fragments._BreakStatement__ASTNode.initOperations(_BreakStatement__ASTNode);
			Fragments._BreakStatement__BreakStatement.initOperations(_BreakStatement__BreakStatement);
			Fragments._BreakStatement__OclAny.initOperations(_BreakStatement__OclAny);
			Fragments._BreakStatement__OclElement.initOperations(_BreakStatement__OclElement);
			Fragments._BreakStatement__Statement.initOperations(_BreakStatement__Statement);

			Fragments._CastExpression__ASTNode.initOperations(_CastExpression__ASTNode);
			Fragments._CastExpression__CastExpression.initOperations(_CastExpression__CastExpression);
			Fragments._CastExpression__Expression.initOperations(_CastExpression__Expression);
			Fragments._CastExpression__OclAny.initOperations(_CastExpression__OclAny);
			Fragments._CastExpression__OclElement.initOperations(_CastExpression__OclElement);

			Fragments._CatchClause__ASTNode.initOperations(_CatchClause__ASTNode);
			Fragments._CatchClause__CatchClause.initOperations(_CatchClause__CatchClause);
			Fragments._CatchClause__OclAny.initOperations(_CatchClause__OclAny);
			Fragments._CatchClause__OclElement.initOperations(_CatchClause__OclElement);
			Fragments._CatchClause__Statement.initOperations(_CatchClause__Statement);

			Fragments._CharacterLiteral__ASTNode.initOperations(_CharacterLiteral__ASTNode);
			Fragments._CharacterLiteral__CharacterLiteral.initOperations(_CharacterLiteral__CharacterLiteral);
			Fragments._CharacterLiteral__Expression.initOperations(_CharacterLiteral__Expression);
			Fragments._CharacterLiteral__OclAny.initOperations(_CharacterLiteral__OclAny);
			Fragments._CharacterLiteral__OclElement.initOperations(_CharacterLiteral__OclElement);

			Fragments._ClassDeclaration__ASTNode.initOperations(_ClassDeclaration__ASTNode);
			Fragments._ClassDeclaration__AbstractTypeDeclaration.initOperations(_ClassDeclaration__AbstractTypeDeclaration);
			Fragments._ClassDeclaration__BodyDeclaration.initOperations(_ClassDeclaration__BodyDeclaration);
			Fragments._ClassDeclaration__ClassDeclaration.initOperations(_ClassDeclaration__ClassDeclaration);
			Fragments._ClassDeclaration__NamedElement.initOperations(_ClassDeclaration__NamedElement);
			Fragments._ClassDeclaration__OclAny.initOperations(_ClassDeclaration__OclAny);
			Fragments._ClassDeclaration__OclElement.initOperations(_ClassDeclaration__OclElement);
			Fragments._ClassDeclaration__Type.initOperations(_ClassDeclaration__Type);
			Fragments._ClassDeclaration__TypeDeclaration.initOperations(_ClassDeclaration__TypeDeclaration);

			Fragments._ClassFile__ASTNode.initOperations(_ClassFile__ASTNode);
			Fragments._ClassFile__ClassFile.initOperations(_ClassFile__ClassFile);
			Fragments._ClassFile__NamedElement.initOperations(_ClassFile__NamedElement);
			Fragments._ClassFile__OclAny.initOperations(_ClassFile__OclAny);
			Fragments._ClassFile__OclElement.initOperations(_ClassFile__OclElement);

			Fragments._ClassInstanceCreation__ASTNode.initOperations(_ClassInstanceCreation__ASTNode);
			Fragments._ClassInstanceCreation__AbstractMethodInvocation.initOperations(_ClassInstanceCreation__AbstractMethodInvocation);
			Fragments._ClassInstanceCreation__ClassInstanceCreation.initOperations(_ClassInstanceCreation__ClassInstanceCreation);
			Fragments._ClassInstanceCreation__Expression.initOperations(_ClassInstanceCreation__Expression);
			Fragments._ClassInstanceCreation__OclAny.initOperations(_ClassInstanceCreation__OclAny);
			Fragments._ClassInstanceCreation__OclElement.initOperations(_ClassInstanceCreation__OclElement);

			Fragments._Comment__ASTNode.initOperations(_Comment__ASTNode);
			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__OclElement.initOperations(_Comment__OclElement);

			Fragments._CompilationUnit__ASTNode.initOperations(_CompilationUnit__ASTNode);
			Fragments._CompilationUnit__CompilationUnit.initOperations(_CompilationUnit__CompilationUnit);
			Fragments._CompilationUnit__NamedElement.initOperations(_CompilationUnit__NamedElement);
			Fragments._CompilationUnit__OclAny.initOperations(_CompilationUnit__OclAny);
			Fragments._CompilationUnit__OclElement.initOperations(_CompilationUnit__OclElement);

			Fragments._ConditionalExpression__ASTNode.initOperations(_ConditionalExpression__ASTNode);
			Fragments._ConditionalExpression__ConditionalExpression.initOperations(_ConditionalExpression__ConditionalExpression);
			Fragments._ConditionalExpression__Expression.initOperations(_ConditionalExpression__Expression);
			Fragments._ConditionalExpression__OclAny.initOperations(_ConditionalExpression__OclAny);
			Fragments._ConditionalExpression__OclElement.initOperations(_ConditionalExpression__OclElement);

			Fragments._ConstructorDeclaration__ASTNode.initOperations(_ConstructorDeclaration__ASTNode);
			Fragments._ConstructorDeclaration__AbstractMethodDeclaration.initOperations(_ConstructorDeclaration__AbstractMethodDeclaration);
			Fragments._ConstructorDeclaration__BodyDeclaration.initOperations(_ConstructorDeclaration__BodyDeclaration);
			Fragments._ConstructorDeclaration__ConstructorDeclaration.initOperations(_ConstructorDeclaration__ConstructorDeclaration);
			Fragments._ConstructorDeclaration__NamedElement.initOperations(_ConstructorDeclaration__NamedElement);
			Fragments._ConstructorDeclaration__OclAny.initOperations(_ConstructorDeclaration__OclAny);
			Fragments._ConstructorDeclaration__OclElement.initOperations(_ConstructorDeclaration__OclElement);

			Fragments._ConstructorInvocation__ASTNode.initOperations(_ConstructorInvocation__ASTNode);
			Fragments._ConstructorInvocation__AbstractMethodInvocation.initOperations(_ConstructorInvocation__AbstractMethodInvocation);
			Fragments._ConstructorInvocation__ConstructorInvocation.initOperations(_ConstructorInvocation__ConstructorInvocation);
			Fragments._ConstructorInvocation__OclAny.initOperations(_ConstructorInvocation__OclAny);
			Fragments._ConstructorInvocation__OclElement.initOperations(_ConstructorInvocation__OclElement);
			Fragments._ConstructorInvocation__Statement.initOperations(_ConstructorInvocation__Statement);

			Fragments._ContinueStatement__ASTNode.initOperations(_ContinueStatement__ASTNode);
			Fragments._ContinueStatement__ContinueStatement.initOperations(_ContinueStatement__ContinueStatement);
			Fragments._ContinueStatement__OclAny.initOperations(_ContinueStatement__OclAny);
			Fragments._ContinueStatement__OclElement.initOperations(_ContinueStatement__OclElement);
			Fragments._ContinueStatement__Statement.initOperations(_ContinueStatement__Statement);

			Fragments._DoStatement__ASTNode.initOperations(_DoStatement__ASTNode);
			Fragments._DoStatement__DoStatement.initOperations(_DoStatement__DoStatement);
			Fragments._DoStatement__OclAny.initOperations(_DoStatement__OclAny);
			Fragments._DoStatement__OclElement.initOperations(_DoStatement__OclElement);
			Fragments._DoStatement__Statement.initOperations(_DoStatement__Statement);

			Fragments._EmptyStatement__ASTNode.initOperations(_EmptyStatement__ASTNode);
			Fragments._EmptyStatement__EmptyStatement.initOperations(_EmptyStatement__EmptyStatement);
			Fragments._EmptyStatement__OclAny.initOperations(_EmptyStatement__OclAny);
			Fragments._EmptyStatement__OclElement.initOperations(_EmptyStatement__OclElement);
			Fragments._EmptyStatement__Statement.initOperations(_EmptyStatement__Statement);

			Fragments._EnhancedForStatement__ASTNode.initOperations(_EnhancedForStatement__ASTNode);
			Fragments._EnhancedForStatement__EnhancedForStatement.initOperations(_EnhancedForStatement__EnhancedForStatement);
			Fragments._EnhancedForStatement__OclAny.initOperations(_EnhancedForStatement__OclAny);
			Fragments._EnhancedForStatement__OclElement.initOperations(_EnhancedForStatement__OclElement);
			Fragments._EnhancedForStatement__Statement.initOperations(_EnhancedForStatement__Statement);

			Fragments._EnumConstantDeclaration__ASTNode.initOperations(_EnumConstantDeclaration__ASTNode);
			Fragments._EnumConstantDeclaration__BodyDeclaration.initOperations(_EnumConstantDeclaration__BodyDeclaration);
			Fragments._EnumConstantDeclaration__EnumConstantDeclaration.initOperations(_EnumConstantDeclaration__EnumConstantDeclaration);
			Fragments._EnumConstantDeclaration__NamedElement.initOperations(_EnumConstantDeclaration__NamedElement);
			Fragments._EnumConstantDeclaration__OclAny.initOperations(_EnumConstantDeclaration__OclAny);
			Fragments._EnumConstantDeclaration__OclElement.initOperations(_EnumConstantDeclaration__OclElement);
			Fragments._EnumConstantDeclaration__VariableDeclaration.initOperations(_EnumConstantDeclaration__VariableDeclaration);

			Fragments._EnumDeclaration__ASTNode.initOperations(_EnumDeclaration__ASTNode);
			Fragments._EnumDeclaration__AbstractTypeDeclaration.initOperations(_EnumDeclaration__AbstractTypeDeclaration);
			Fragments._EnumDeclaration__BodyDeclaration.initOperations(_EnumDeclaration__BodyDeclaration);
			Fragments._EnumDeclaration__EnumDeclaration.initOperations(_EnumDeclaration__EnumDeclaration);
			Fragments._EnumDeclaration__NamedElement.initOperations(_EnumDeclaration__NamedElement);
			Fragments._EnumDeclaration__OclAny.initOperations(_EnumDeclaration__OclAny);
			Fragments._EnumDeclaration__OclElement.initOperations(_EnumDeclaration__OclElement);
			Fragments._EnumDeclaration__Type.initOperations(_EnumDeclaration__Type);

			Fragments._Expression__ASTNode.initOperations(_Expression__ASTNode);
			Fragments._Expression__Expression.initOperations(_Expression__Expression);
			Fragments._Expression__OclAny.initOperations(_Expression__OclAny);
			Fragments._Expression__OclElement.initOperations(_Expression__OclElement);

			Fragments._ExpressionStatement__ASTNode.initOperations(_ExpressionStatement__ASTNode);
			Fragments._ExpressionStatement__ExpressionStatement.initOperations(_ExpressionStatement__ExpressionStatement);
			Fragments._ExpressionStatement__OclAny.initOperations(_ExpressionStatement__OclAny);
			Fragments._ExpressionStatement__OclElement.initOperations(_ExpressionStatement__OclElement);
			Fragments._ExpressionStatement__Statement.initOperations(_ExpressionStatement__Statement);

			Fragments._FieldAccess__ASTNode.initOperations(_FieldAccess__ASTNode);
			Fragments._FieldAccess__Expression.initOperations(_FieldAccess__Expression);
			Fragments._FieldAccess__FieldAccess.initOperations(_FieldAccess__FieldAccess);
			Fragments._FieldAccess__OclAny.initOperations(_FieldAccess__OclAny);
			Fragments._FieldAccess__OclElement.initOperations(_FieldAccess__OclElement);

			Fragments._FieldDeclaration__ASTNode.initOperations(_FieldDeclaration__ASTNode);
			Fragments._FieldDeclaration__AbstractVariablesContainer.initOperations(_FieldDeclaration__AbstractVariablesContainer);
			Fragments._FieldDeclaration__BodyDeclaration.initOperations(_FieldDeclaration__BodyDeclaration);
			Fragments._FieldDeclaration__FieldDeclaration.initOperations(_FieldDeclaration__FieldDeclaration);
			Fragments._FieldDeclaration__NamedElement.initOperations(_FieldDeclaration__NamedElement);
			Fragments._FieldDeclaration__OclAny.initOperations(_FieldDeclaration__OclAny);
			Fragments._FieldDeclaration__OclElement.initOperations(_FieldDeclaration__OclElement);

			Fragments._ForStatement__ASTNode.initOperations(_ForStatement__ASTNode);
			Fragments._ForStatement__ForStatement.initOperations(_ForStatement__ForStatement);
			Fragments._ForStatement__OclAny.initOperations(_ForStatement__OclAny);
			Fragments._ForStatement__OclElement.initOperations(_ForStatement__OclElement);
			Fragments._ForStatement__Statement.initOperations(_ForStatement__Statement);

			Fragments._IfStatement__ASTNode.initOperations(_IfStatement__ASTNode);
			Fragments._IfStatement__IfStatement.initOperations(_IfStatement__IfStatement);
			Fragments._IfStatement__OclAny.initOperations(_IfStatement__OclAny);
			Fragments._IfStatement__OclElement.initOperations(_IfStatement__OclElement);
			Fragments._IfStatement__Statement.initOperations(_IfStatement__Statement);

			Fragments._ImportDeclaration__ASTNode.initOperations(_ImportDeclaration__ASTNode);
			Fragments._ImportDeclaration__ImportDeclaration.initOperations(_ImportDeclaration__ImportDeclaration);
			Fragments._ImportDeclaration__OclAny.initOperations(_ImportDeclaration__OclAny);
			Fragments._ImportDeclaration__OclElement.initOperations(_ImportDeclaration__OclElement);

			Fragments._InfixExpression__ASTNode.initOperations(_InfixExpression__ASTNode);
			Fragments._InfixExpression__Expression.initOperations(_InfixExpression__Expression);
			Fragments._InfixExpression__InfixExpression.initOperations(_InfixExpression__InfixExpression);
			Fragments._InfixExpression__OclAny.initOperations(_InfixExpression__OclAny);
			Fragments._InfixExpression__OclElement.initOperations(_InfixExpression__OclElement);

			Fragments._InfixExpressionKind__InfixExpressionKind.initOperations(_InfixExpressionKind__InfixExpressionKind);
			Fragments._InfixExpressionKind__OclAny.initOperations(_InfixExpressionKind__OclAny);
			Fragments._InfixExpressionKind__OclElement.initOperations(_InfixExpressionKind__OclElement);
			Fragments._InfixExpressionKind__OclEnumeration.initOperations(_InfixExpressionKind__OclEnumeration);
			Fragments._InfixExpressionKind__OclType.initOperations(_InfixExpressionKind__OclType);

			Fragments._InheritanceKind__InheritanceKind.initOperations(_InheritanceKind__InheritanceKind);
			Fragments._InheritanceKind__OclAny.initOperations(_InheritanceKind__OclAny);
			Fragments._InheritanceKind__OclElement.initOperations(_InheritanceKind__OclElement);
			Fragments._InheritanceKind__OclEnumeration.initOperations(_InheritanceKind__OclEnumeration);
			Fragments._InheritanceKind__OclType.initOperations(_InheritanceKind__OclType);

			Fragments._Initializer__ASTNode.initOperations(_Initializer__ASTNode);
			Fragments._Initializer__BodyDeclaration.initOperations(_Initializer__BodyDeclaration);
			Fragments._Initializer__Initializer.initOperations(_Initializer__Initializer);
			Fragments._Initializer__NamedElement.initOperations(_Initializer__NamedElement);
			Fragments._Initializer__OclAny.initOperations(_Initializer__OclAny);
			Fragments._Initializer__OclElement.initOperations(_Initializer__OclElement);

			Fragments._InstanceofExpression__ASTNode.initOperations(_InstanceofExpression__ASTNode);
			Fragments._InstanceofExpression__Expression.initOperations(_InstanceofExpression__Expression);
			Fragments._InstanceofExpression__InstanceofExpression.initOperations(_InstanceofExpression__InstanceofExpression);
			Fragments._InstanceofExpression__OclAny.initOperations(_InstanceofExpression__OclAny);
			Fragments._InstanceofExpression__OclElement.initOperations(_InstanceofExpression__OclElement);

			Fragments._InterfaceDeclaration__ASTNode.initOperations(_InterfaceDeclaration__ASTNode);
			Fragments._InterfaceDeclaration__AbstractTypeDeclaration.initOperations(_InterfaceDeclaration__AbstractTypeDeclaration);
			Fragments._InterfaceDeclaration__BodyDeclaration.initOperations(_InterfaceDeclaration__BodyDeclaration);
			Fragments._InterfaceDeclaration__InterfaceDeclaration.initOperations(_InterfaceDeclaration__InterfaceDeclaration);
			Fragments._InterfaceDeclaration__NamedElement.initOperations(_InterfaceDeclaration__NamedElement);
			Fragments._InterfaceDeclaration__OclAny.initOperations(_InterfaceDeclaration__OclAny);
			Fragments._InterfaceDeclaration__OclElement.initOperations(_InterfaceDeclaration__OclElement);
			Fragments._InterfaceDeclaration__Type.initOperations(_InterfaceDeclaration__Type);
			Fragments._InterfaceDeclaration__TypeDeclaration.initOperations(_InterfaceDeclaration__TypeDeclaration);

			Fragments._Javadoc__ASTNode.initOperations(_Javadoc__ASTNode);
			Fragments._Javadoc__Comment.initOperations(_Javadoc__Comment);
			Fragments._Javadoc__Javadoc.initOperations(_Javadoc__Javadoc);
			Fragments._Javadoc__OclAny.initOperations(_Javadoc__OclAny);
			Fragments._Javadoc__OclElement.initOperations(_Javadoc__OclElement);

			Fragments._LabeledStatement__ASTNode.initOperations(_LabeledStatement__ASTNode);
			Fragments._LabeledStatement__LabeledStatement.initOperations(_LabeledStatement__LabeledStatement);
			Fragments._LabeledStatement__NamedElement.initOperations(_LabeledStatement__NamedElement);
			Fragments._LabeledStatement__OclAny.initOperations(_LabeledStatement__OclAny);
			Fragments._LabeledStatement__OclElement.initOperations(_LabeledStatement__OclElement);
			Fragments._LabeledStatement__Statement.initOperations(_LabeledStatement__Statement);

			Fragments._LineComment__ASTNode.initOperations(_LineComment__ASTNode);
			Fragments._LineComment__Comment.initOperations(_LineComment__Comment);
			Fragments._LineComment__LineComment.initOperations(_LineComment__LineComment);
			Fragments._LineComment__OclAny.initOperations(_LineComment__OclAny);
			Fragments._LineComment__OclElement.initOperations(_LineComment__OclElement);

			Fragments._Manifest__Manifest.initOperations(_Manifest__Manifest);
			Fragments._Manifest__OclAny.initOperations(_Manifest__OclAny);
			Fragments._Manifest__OclElement.initOperations(_Manifest__OclElement);

			Fragments._ManifestAttribute__ManifestAttribute.initOperations(_ManifestAttribute__ManifestAttribute);
			Fragments._ManifestAttribute__OclAny.initOperations(_ManifestAttribute__OclAny);
			Fragments._ManifestAttribute__OclElement.initOperations(_ManifestAttribute__OclElement);

			Fragments._ManifestEntry__ManifestEntry.initOperations(_ManifestEntry__ManifestEntry);
			Fragments._ManifestEntry__OclAny.initOperations(_ManifestEntry__OclAny);
			Fragments._ManifestEntry__OclElement.initOperations(_ManifestEntry__OclElement);

			Fragments._MemberRef__ASTNode.initOperations(_MemberRef__ASTNode);
			Fragments._MemberRef__MemberRef.initOperations(_MemberRef__MemberRef);
			Fragments._MemberRef__OclAny.initOperations(_MemberRef__OclAny);
			Fragments._MemberRef__OclElement.initOperations(_MemberRef__OclElement);

			Fragments._MethodDeclaration__ASTNode.initOperations(_MethodDeclaration__ASTNode);
			Fragments._MethodDeclaration__AbstractMethodDeclaration.initOperations(_MethodDeclaration__AbstractMethodDeclaration);
			Fragments._MethodDeclaration__BodyDeclaration.initOperations(_MethodDeclaration__BodyDeclaration);
			Fragments._MethodDeclaration__MethodDeclaration.initOperations(_MethodDeclaration__MethodDeclaration);
			Fragments._MethodDeclaration__NamedElement.initOperations(_MethodDeclaration__NamedElement);
			Fragments._MethodDeclaration__OclAny.initOperations(_MethodDeclaration__OclAny);
			Fragments._MethodDeclaration__OclElement.initOperations(_MethodDeclaration__OclElement);

			Fragments._MethodInvocation__ASTNode.initOperations(_MethodInvocation__ASTNode);
			Fragments._MethodInvocation__AbstractMethodInvocation.initOperations(_MethodInvocation__AbstractMethodInvocation);
			Fragments._MethodInvocation__Expression.initOperations(_MethodInvocation__Expression);
			Fragments._MethodInvocation__MethodInvocation.initOperations(_MethodInvocation__MethodInvocation);
			Fragments._MethodInvocation__OclAny.initOperations(_MethodInvocation__OclAny);
			Fragments._MethodInvocation__OclElement.initOperations(_MethodInvocation__OclElement);

			Fragments._MethodRef__ASTNode.initOperations(_MethodRef__ASTNode);
			Fragments._MethodRef__MethodRef.initOperations(_MethodRef__MethodRef);
			Fragments._MethodRef__OclAny.initOperations(_MethodRef__OclAny);
			Fragments._MethodRef__OclElement.initOperations(_MethodRef__OclElement);

			Fragments._MethodRefParameter__ASTNode.initOperations(_MethodRefParameter__ASTNode);
			Fragments._MethodRefParameter__MethodRefParameter.initOperations(_MethodRefParameter__MethodRefParameter);
			Fragments._MethodRefParameter__OclAny.initOperations(_MethodRefParameter__OclAny);
			Fragments._MethodRefParameter__OclElement.initOperations(_MethodRefParameter__OclElement);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._Modifier__ASTNode.initOperations(_Modifier__ASTNode);
			Fragments._Modifier__Modifier.initOperations(_Modifier__Modifier);
			Fragments._Modifier__OclAny.initOperations(_Modifier__OclAny);
			Fragments._Modifier__OclElement.initOperations(_Modifier__OclElement);

			Fragments._NamedElement__ASTNode.initOperations(_NamedElement__ASTNode);
			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._NamespaceAccess__ASTNode.initOperations(_NamespaceAccess__ASTNode);
			Fragments._NamespaceAccess__NamespaceAccess.initOperations(_NamespaceAccess__NamespaceAccess);
			Fragments._NamespaceAccess__OclAny.initOperations(_NamespaceAccess__OclAny);
			Fragments._NamespaceAccess__OclElement.initOperations(_NamespaceAccess__OclElement);

			Fragments._NullLiteral__ASTNode.initOperations(_NullLiteral__ASTNode);
			Fragments._NullLiteral__Expression.initOperations(_NullLiteral__Expression);
			Fragments._NullLiteral__NullLiteral.initOperations(_NullLiteral__NullLiteral);
			Fragments._NullLiteral__OclAny.initOperations(_NullLiteral__OclAny);
			Fragments._NullLiteral__OclElement.initOperations(_NullLiteral__OclElement);

			Fragments._NumberLiteral__ASTNode.initOperations(_NumberLiteral__ASTNode);
			Fragments._NumberLiteral__Expression.initOperations(_NumberLiteral__Expression);
			Fragments._NumberLiteral__NumberLiteral.initOperations(_NumberLiteral__NumberLiteral);
			Fragments._NumberLiteral__OclAny.initOperations(_NumberLiteral__OclAny);
			Fragments._NumberLiteral__OclElement.initOperations(_NumberLiteral__OclElement);

			Fragments._Package__ASTNode.initOperations(_Package__ASTNode);
			Fragments._Package__NamedElement.initOperations(_Package__NamedElement);
			Fragments._Package__OclAny.initOperations(_Package__OclAny);
			Fragments._Package__OclElement.initOperations(_Package__OclElement);
			Fragments._Package__Package.initOperations(_Package__Package);

			Fragments._PackageAccess__ASTNode.initOperations(_PackageAccess__ASTNode);
			Fragments._PackageAccess__NamespaceAccess.initOperations(_PackageAccess__NamespaceAccess);
			Fragments._PackageAccess__OclAny.initOperations(_PackageAccess__OclAny);
			Fragments._PackageAccess__OclElement.initOperations(_PackageAccess__OclElement);
			Fragments._PackageAccess__PackageAccess.initOperations(_PackageAccess__PackageAccess);

			Fragments._ParameterizedType__ASTNode.initOperations(_ParameterizedType__ASTNode);
			Fragments._ParameterizedType__NamedElement.initOperations(_ParameterizedType__NamedElement);
			Fragments._ParameterizedType__OclAny.initOperations(_ParameterizedType__OclAny);
			Fragments._ParameterizedType__OclElement.initOperations(_ParameterizedType__OclElement);
			Fragments._ParameterizedType__ParameterizedType.initOperations(_ParameterizedType__ParameterizedType);
			Fragments._ParameterizedType__Type.initOperations(_ParameterizedType__Type);

			Fragments._ParenthesizedExpression__ASTNode.initOperations(_ParenthesizedExpression__ASTNode);
			Fragments._ParenthesizedExpression__Expression.initOperations(_ParenthesizedExpression__Expression);
			Fragments._ParenthesizedExpression__OclAny.initOperations(_ParenthesizedExpression__OclAny);
			Fragments._ParenthesizedExpression__OclElement.initOperations(_ParenthesizedExpression__OclElement);
			Fragments._ParenthesizedExpression__ParenthesizedExpression.initOperations(_ParenthesizedExpression__ParenthesizedExpression);

			Fragments._PostfixExpression__ASTNode.initOperations(_PostfixExpression__ASTNode);
			Fragments._PostfixExpression__Expression.initOperations(_PostfixExpression__Expression);
			Fragments._PostfixExpression__OclAny.initOperations(_PostfixExpression__OclAny);
			Fragments._PostfixExpression__OclElement.initOperations(_PostfixExpression__OclElement);
			Fragments._PostfixExpression__PostfixExpression.initOperations(_PostfixExpression__PostfixExpression);

			Fragments._PostfixExpressionKind__OclAny.initOperations(_PostfixExpressionKind__OclAny);
			Fragments._PostfixExpressionKind__OclElement.initOperations(_PostfixExpressionKind__OclElement);
			Fragments._PostfixExpressionKind__OclEnumeration.initOperations(_PostfixExpressionKind__OclEnumeration);
			Fragments._PostfixExpressionKind__OclType.initOperations(_PostfixExpressionKind__OclType);
			Fragments._PostfixExpressionKind__PostfixExpressionKind.initOperations(_PostfixExpressionKind__PostfixExpressionKind);

			Fragments._PrefixExpression__ASTNode.initOperations(_PrefixExpression__ASTNode);
			Fragments._PrefixExpression__Expression.initOperations(_PrefixExpression__Expression);
			Fragments._PrefixExpression__OclAny.initOperations(_PrefixExpression__OclAny);
			Fragments._PrefixExpression__OclElement.initOperations(_PrefixExpression__OclElement);
			Fragments._PrefixExpression__PrefixExpression.initOperations(_PrefixExpression__PrefixExpression);

			Fragments._PrefixExpressionKind__OclAny.initOperations(_PrefixExpressionKind__OclAny);
			Fragments._PrefixExpressionKind__OclElement.initOperations(_PrefixExpressionKind__OclElement);
			Fragments._PrefixExpressionKind__OclEnumeration.initOperations(_PrefixExpressionKind__OclEnumeration);
			Fragments._PrefixExpressionKind__OclType.initOperations(_PrefixExpressionKind__OclType);
			Fragments._PrefixExpressionKind__PrefixExpressionKind.initOperations(_PrefixExpressionKind__PrefixExpressionKind);

			Fragments._PrimitiveType__ASTNode.initOperations(_PrimitiveType__ASTNode);
			Fragments._PrimitiveType__NamedElement.initOperations(_PrimitiveType__NamedElement);
			Fragments._PrimitiveType__OclAny.initOperations(_PrimitiveType__OclAny);
			Fragments._PrimitiveType__OclElement.initOperations(_PrimitiveType__OclElement);
			Fragments._PrimitiveType__PrimitiveType.initOperations(_PrimitiveType__PrimitiveType);
			Fragments._PrimitiveType__Type.initOperations(_PrimitiveType__Type);

			Fragments._PrimitiveTypeBoolean__ASTNode.initOperations(_PrimitiveTypeBoolean__ASTNode);
			Fragments._PrimitiveTypeBoolean__NamedElement.initOperations(_PrimitiveTypeBoolean__NamedElement);
			Fragments._PrimitiveTypeBoolean__OclAny.initOperations(_PrimitiveTypeBoolean__OclAny);
			Fragments._PrimitiveTypeBoolean__OclElement.initOperations(_PrimitiveTypeBoolean__OclElement);
			Fragments._PrimitiveTypeBoolean__PrimitiveType.initOperations(_PrimitiveTypeBoolean__PrimitiveType);
			Fragments._PrimitiveTypeBoolean__PrimitiveTypeBoolean.initOperations(_PrimitiveTypeBoolean__PrimitiveTypeBoolean);
			Fragments._PrimitiveTypeBoolean__Type.initOperations(_PrimitiveTypeBoolean__Type);

			Fragments._PrimitiveTypeByte__ASTNode.initOperations(_PrimitiveTypeByte__ASTNode);
			Fragments._PrimitiveTypeByte__NamedElement.initOperations(_PrimitiveTypeByte__NamedElement);
			Fragments._PrimitiveTypeByte__OclAny.initOperations(_PrimitiveTypeByte__OclAny);
			Fragments._PrimitiveTypeByte__OclElement.initOperations(_PrimitiveTypeByte__OclElement);
			Fragments._PrimitiveTypeByte__PrimitiveType.initOperations(_PrimitiveTypeByte__PrimitiveType);
			Fragments._PrimitiveTypeByte__PrimitiveTypeByte.initOperations(_PrimitiveTypeByte__PrimitiveTypeByte);
			Fragments._PrimitiveTypeByte__Type.initOperations(_PrimitiveTypeByte__Type);

			Fragments._PrimitiveTypeChar__ASTNode.initOperations(_PrimitiveTypeChar__ASTNode);
			Fragments._PrimitiveTypeChar__NamedElement.initOperations(_PrimitiveTypeChar__NamedElement);
			Fragments._PrimitiveTypeChar__OclAny.initOperations(_PrimitiveTypeChar__OclAny);
			Fragments._PrimitiveTypeChar__OclElement.initOperations(_PrimitiveTypeChar__OclElement);
			Fragments._PrimitiveTypeChar__PrimitiveType.initOperations(_PrimitiveTypeChar__PrimitiveType);
			Fragments._PrimitiveTypeChar__PrimitiveTypeChar.initOperations(_PrimitiveTypeChar__PrimitiveTypeChar);
			Fragments._PrimitiveTypeChar__Type.initOperations(_PrimitiveTypeChar__Type);

			Fragments._PrimitiveTypeDouble__ASTNode.initOperations(_PrimitiveTypeDouble__ASTNode);
			Fragments._PrimitiveTypeDouble__NamedElement.initOperations(_PrimitiveTypeDouble__NamedElement);
			Fragments._PrimitiveTypeDouble__OclAny.initOperations(_PrimitiveTypeDouble__OclAny);
			Fragments._PrimitiveTypeDouble__OclElement.initOperations(_PrimitiveTypeDouble__OclElement);
			Fragments._PrimitiveTypeDouble__PrimitiveType.initOperations(_PrimitiveTypeDouble__PrimitiveType);
			Fragments._PrimitiveTypeDouble__PrimitiveTypeDouble.initOperations(_PrimitiveTypeDouble__PrimitiveTypeDouble);
			Fragments._PrimitiveTypeDouble__Type.initOperations(_PrimitiveTypeDouble__Type);

			Fragments._PrimitiveTypeFloat__ASTNode.initOperations(_PrimitiveTypeFloat__ASTNode);
			Fragments._PrimitiveTypeFloat__NamedElement.initOperations(_PrimitiveTypeFloat__NamedElement);
			Fragments._PrimitiveTypeFloat__OclAny.initOperations(_PrimitiveTypeFloat__OclAny);
			Fragments._PrimitiveTypeFloat__OclElement.initOperations(_PrimitiveTypeFloat__OclElement);
			Fragments._PrimitiveTypeFloat__PrimitiveType.initOperations(_PrimitiveTypeFloat__PrimitiveType);
			Fragments._PrimitiveTypeFloat__PrimitiveTypeFloat.initOperations(_PrimitiveTypeFloat__PrimitiveTypeFloat);
			Fragments._PrimitiveTypeFloat__Type.initOperations(_PrimitiveTypeFloat__Type);

			Fragments._PrimitiveTypeInt__ASTNode.initOperations(_PrimitiveTypeInt__ASTNode);
			Fragments._PrimitiveTypeInt__NamedElement.initOperations(_PrimitiveTypeInt__NamedElement);
			Fragments._PrimitiveTypeInt__OclAny.initOperations(_PrimitiveTypeInt__OclAny);
			Fragments._PrimitiveTypeInt__OclElement.initOperations(_PrimitiveTypeInt__OclElement);
			Fragments._PrimitiveTypeInt__PrimitiveType.initOperations(_PrimitiveTypeInt__PrimitiveType);
			Fragments._PrimitiveTypeInt__PrimitiveTypeInt.initOperations(_PrimitiveTypeInt__PrimitiveTypeInt);
			Fragments._PrimitiveTypeInt__Type.initOperations(_PrimitiveTypeInt__Type);

			Fragments._PrimitiveTypeLong__ASTNode.initOperations(_PrimitiveTypeLong__ASTNode);
			Fragments._PrimitiveTypeLong__NamedElement.initOperations(_PrimitiveTypeLong__NamedElement);
			Fragments._PrimitiveTypeLong__OclAny.initOperations(_PrimitiveTypeLong__OclAny);
			Fragments._PrimitiveTypeLong__OclElement.initOperations(_PrimitiveTypeLong__OclElement);
			Fragments._PrimitiveTypeLong__PrimitiveType.initOperations(_PrimitiveTypeLong__PrimitiveType);
			Fragments._PrimitiveTypeLong__PrimitiveTypeLong.initOperations(_PrimitiveTypeLong__PrimitiveTypeLong);
			Fragments._PrimitiveTypeLong__Type.initOperations(_PrimitiveTypeLong__Type);

			Fragments._PrimitiveTypeShort__ASTNode.initOperations(_PrimitiveTypeShort__ASTNode);
			Fragments._PrimitiveTypeShort__NamedElement.initOperations(_PrimitiveTypeShort__NamedElement);
			Fragments._PrimitiveTypeShort__OclAny.initOperations(_PrimitiveTypeShort__OclAny);
			Fragments._PrimitiveTypeShort__OclElement.initOperations(_PrimitiveTypeShort__OclElement);
			Fragments._PrimitiveTypeShort__PrimitiveType.initOperations(_PrimitiveTypeShort__PrimitiveType);
			Fragments._PrimitiveTypeShort__PrimitiveTypeShort.initOperations(_PrimitiveTypeShort__PrimitiveTypeShort);
			Fragments._PrimitiveTypeShort__Type.initOperations(_PrimitiveTypeShort__Type);

			Fragments._PrimitiveTypeVoid__ASTNode.initOperations(_PrimitiveTypeVoid__ASTNode);
			Fragments._PrimitiveTypeVoid__NamedElement.initOperations(_PrimitiveTypeVoid__NamedElement);
			Fragments._PrimitiveTypeVoid__OclAny.initOperations(_PrimitiveTypeVoid__OclAny);
			Fragments._PrimitiveTypeVoid__OclElement.initOperations(_PrimitiveTypeVoid__OclElement);
			Fragments._PrimitiveTypeVoid__PrimitiveType.initOperations(_PrimitiveTypeVoid__PrimitiveType);
			Fragments._PrimitiveTypeVoid__PrimitiveTypeVoid.initOperations(_PrimitiveTypeVoid__PrimitiveTypeVoid);
			Fragments._PrimitiveTypeVoid__Type.initOperations(_PrimitiveTypeVoid__Type);

			Fragments._QueryCollection__OclAny.initOperations(_QueryCollection__OclAny);
			Fragments._QueryCollection__OclElement.initOperations(_QueryCollection__OclElement);
			Fragments._QueryCollection__QueryCollection.initOperations(_QueryCollection__QueryCollection);

			Fragments._ReturnStatement__ASTNode.initOperations(_ReturnStatement__ASTNode);
			Fragments._ReturnStatement__OclAny.initOperations(_ReturnStatement__OclAny);
			Fragments._ReturnStatement__OclElement.initOperations(_ReturnStatement__OclElement);
			Fragments._ReturnStatement__ReturnStatement.initOperations(_ReturnStatement__ReturnStatement);
			Fragments._ReturnStatement__Statement.initOperations(_ReturnStatement__Statement);

			Fragments._SingleVariableAccess__ASTNode.initOperations(_SingleVariableAccess__ASTNode);
			Fragments._SingleVariableAccess__Expression.initOperations(_SingleVariableAccess__Expression);
			Fragments._SingleVariableAccess__OclAny.initOperations(_SingleVariableAccess__OclAny);
			Fragments._SingleVariableAccess__OclElement.initOperations(_SingleVariableAccess__OclElement);
			Fragments._SingleVariableAccess__SingleVariableAccess.initOperations(_SingleVariableAccess__SingleVariableAccess);

			Fragments._SingleVariableDeclaration__ASTNode.initOperations(_SingleVariableDeclaration__ASTNode);
			Fragments._SingleVariableDeclaration__NamedElement.initOperations(_SingleVariableDeclaration__NamedElement);
			Fragments._SingleVariableDeclaration__OclAny.initOperations(_SingleVariableDeclaration__OclAny);
			Fragments._SingleVariableDeclaration__OclElement.initOperations(_SingleVariableDeclaration__OclElement);
			Fragments._SingleVariableDeclaration__SingleVariableDeclaration.initOperations(_SingleVariableDeclaration__SingleVariableDeclaration);
			Fragments._SingleVariableDeclaration__VariableDeclaration.initOperations(_SingleVariableDeclaration__VariableDeclaration);

			Fragments._Statement__ASTNode.initOperations(_Statement__ASTNode);
			Fragments._Statement__OclAny.initOperations(_Statement__OclAny);
			Fragments._Statement__OclElement.initOperations(_Statement__OclElement);
			Fragments._Statement__Statement.initOperations(_Statement__Statement);

			Fragments._StringLiteral__ASTNode.initOperations(_StringLiteral__ASTNode);
			Fragments._StringLiteral__Expression.initOperations(_StringLiteral__Expression);
			Fragments._StringLiteral__OclAny.initOperations(_StringLiteral__OclAny);
			Fragments._StringLiteral__OclElement.initOperations(_StringLiteral__OclElement);
			Fragments._StringLiteral__StringLiteral.initOperations(_StringLiteral__StringLiteral);

			Fragments._SuperConstructorInvocation__ASTNode.initOperations(_SuperConstructorInvocation__ASTNode);
			Fragments._SuperConstructorInvocation__AbstractMethodInvocation.initOperations(_SuperConstructorInvocation__AbstractMethodInvocation);
			Fragments._SuperConstructorInvocation__OclAny.initOperations(_SuperConstructorInvocation__OclAny);
			Fragments._SuperConstructorInvocation__OclElement.initOperations(_SuperConstructorInvocation__OclElement);
			Fragments._SuperConstructorInvocation__Statement.initOperations(_SuperConstructorInvocation__Statement);
			Fragments._SuperConstructorInvocation__SuperConstructorInvocation.initOperations(_SuperConstructorInvocation__SuperConstructorInvocation);

			Fragments._SuperFieldAccess__ASTNode.initOperations(_SuperFieldAccess__ASTNode);
			Fragments._SuperFieldAccess__AbstractTypeQualifiedExpression.initOperations(_SuperFieldAccess__AbstractTypeQualifiedExpression);
			Fragments._SuperFieldAccess__Expression.initOperations(_SuperFieldAccess__Expression);
			Fragments._SuperFieldAccess__OclAny.initOperations(_SuperFieldAccess__OclAny);
			Fragments._SuperFieldAccess__OclElement.initOperations(_SuperFieldAccess__OclElement);
			Fragments._SuperFieldAccess__SuperFieldAccess.initOperations(_SuperFieldAccess__SuperFieldAccess);

			Fragments._SuperMethodInvocation__ASTNode.initOperations(_SuperMethodInvocation__ASTNode);
			Fragments._SuperMethodInvocation__AbstractMethodInvocation.initOperations(_SuperMethodInvocation__AbstractMethodInvocation);
			Fragments._SuperMethodInvocation__AbstractTypeQualifiedExpression.initOperations(_SuperMethodInvocation__AbstractTypeQualifiedExpression);
			Fragments._SuperMethodInvocation__Expression.initOperations(_SuperMethodInvocation__Expression);
			Fragments._SuperMethodInvocation__OclAny.initOperations(_SuperMethodInvocation__OclAny);
			Fragments._SuperMethodInvocation__OclElement.initOperations(_SuperMethodInvocation__OclElement);
			Fragments._SuperMethodInvocation__SuperMethodInvocation.initOperations(_SuperMethodInvocation__SuperMethodInvocation);

			Fragments._SwitchCase__ASTNode.initOperations(_SwitchCase__ASTNode);
			Fragments._SwitchCase__OclAny.initOperations(_SwitchCase__OclAny);
			Fragments._SwitchCase__OclElement.initOperations(_SwitchCase__OclElement);
			Fragments._SwitchCase__Statement.initOperations(_SwitchCase__Statement);
			Fragments._SwitchCase__SwitchCase.initOperations(_SwitchCase__SwitchCase);

			Fragments._SwitchStatement__ASTNode.initOperations(_SwitchStatement__ASTNode);
			Fragments._SwitchStatement__OclAny.initOperations(_SwitchStatement__OclAny);
			Fragments._SwitchStatement__OclElement.initOperations(_SwitchStatement__OclElement);
			Fragments._SwitchStatement__Statement.initOperations(_SwitchStatement__Statement);
			Fragments._SwitchStatement__SwitchStatement.initOperations(_SwitchStatement__SwitchStatement);

			Fragments._SynchronizedStatement__ASTNode.initOperations(_SynchronizedStatement__ASTNode);
			Fragments._SynchronizedStatement__OclAny.initOperations(_SynchronizedStatement__OclAny);
			Fragments._SynchronizedStatement__OclElement.initOperations(_SynchronizedStatement__OclElement);
			Fragments._SynchronizedStatement__Statement.initOperations(_SynchronizedStatement__Statement);
			Fragments._SynchronizedStatement__SynchronizedStatement.initOperations(_SynchronizedStatement__SynchronizedStatement);

			Fragments._TagElement__ASTNode.initOperations(_TagElement__ASTNode);
			Fragments._TagElement__OclAny.initOperations(_TagElement__OclAny);
			Fragments._TagElement__OclElement.initOperations(_TagElement__OclElement);
			Fragments._TagElement__TagElement.initOperations(_TagElement__TagElement);

			Fragments._TextElement__ASTNode.initOperations(_TextElement__ASTNode);
			Fragments._TextElement__OclAny.initOperations(_TextElement__OclAny);
			Fragments._TextElement__OclElement.initOperations(_TextElement__OclElement);
			Fragments._TextElement__TextElement.initOperations(_TextElement__TextElement);

			Fragments._ThisExpression__ASTNode.initOperations(_ThisExpression__ASTNode);
			Fragments._ThisExpression__AbstractTypeQualifiedExpression.initOperations(_ThisExpression__AbstractTypeQualifiedExpression);
			Fragments._ThisExpression__Expression.initOperations(_ThisExpression__Expression);
			Fragments._ThisExpression__OclAny.initOperations(_ThisExpression__OclAny);
			Fragments._ThisExpression__OclElement.initOperations(_ThisExpression__OclElement);
			Fragments._ThisExpression__ThisExpression.initOperations(_ThisExpression__ThisExpression);

			Fragments._ThrowStatement__ASTNode.initOperations(_ThrowStatement__ASTNode);
			Fragments._ThrowStatement__OclAny.initOperations(_ThrowStatement__OclAny);
			Fragments._ThrowStatement__OclElement.initOperations(_ThrowStatement__OclElement);
			Fragments._ThrowStatement__Statement.initOperations(_ThrowStatement__Statement);
			Fragments._ThrowStatement__ThrowStatement.initOperations(_ThrowStatement__ThrowStatement);

			Fragments._TryStatement__ASTNode.initOperations(_TryStatement__ASTNode);
			Fragments._TryStatement__OclAny.initOperations(_TryStatement__OclAny);
			Fragments._TryStatement__OclElement.initOperations(_TryStatement__OclElement);
			Fragments._TryStatement__Statement.initOperations(_TryStatement__Statement);
			Fragments._TryStatement__TryStatement.initOperations(_TryStatement__TryStatement);

			Fragments._Type__ASTNode.initOperations(_Type__ASTNode);
			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._TypeAccess__ASTNode.initOperations(_TypeAccess__ASTNode);
			Fragments._TypeAccess__Expression.initOperations(_TypeAccess__Expression);
			Fragments._TypeAccess__NamespaceAccess.initOperations(_TypeAccess__NamespaceAccess);
			Fragments._TypeAccess__OclAny.initOperations(_TypeAccess__OclAny);
			Fragments._TypeAccess__OclElement.initOperations(_TypeAccess__OclElement);
			Fragments._TypeAccess__TypeAccess.initOperations(_TypeAccess__TypeAccess);

			Fragments._TypeDeclaration__ASTNode.initOperations(_TypeDeclaration__ASTNode);
			Fragments._TypeDeclaration__AbstractTypeDeclaration.initOperations(_TypeDeclaration__AbstractTypeDeclaration);
			Fragments._TypeDeclaration__BodyDeclaration.initOperations(_TypeDeclaration__BodyDeclaration);
			Fragments._TypeDeclaration__NamedElement.initOperations(_TypeDeclaration__NamedElement);
			Fragments._TypeDeclaration__OclAny.initOperations(_TypeDeclaration__OclAny);
			Fragments._TypeDeclaration__OclElement.initOperations(_TypeDeclaration__OclElement);
			Fragments._TypeDeclaration__Type.initOperations(_TypeDeclaration__Type);
			Fragments._TypeDeclaration__TypeDeclaration.initOperations(_TypeDeclaration__TypeDeclaration);

			Fragments._TypeDeclarationStatement__ASTNode.initOperations(_TypeDeclarationStatement__ASTNode);
			Fragments._TypeDeclarationStatement__OclAny.initOperations(_TypeDeclarationStatement__OclAny);
			Fragments._TypeDeclarationStatement__OclElement.initOperations(_TypeDeclarationStatement__OclElement);
			Fragments._TypeDeclarationStatement__Statement.initOperations(_TypeDeclarationStatement__Statement);
			Fragments._TypeDeclarationStatement__TypeDeclarationStatement.initOperations(_TypeDeclarationStatement__TypeDeclarationStatement);

			Fragments._TypeLiteral__ASTNode.initOperations(_TypeLiteral__ASTNode);
			Fragments._TypeLiteral__Expression.initOperations(_TypeLiteral__Expression);
			Fragments._TypeLiteral__OclAny.initOperations(_TypeLiteral__OclAny);
			Fragments._TypeLiteral__OclElement.initOperations(_TypeLiteral__OclElement);
			Fragments._TypeLiteral__TypeLiteral.initOperations(_TypeLiteral__TypeLiteral);

			Fragments._TypeParameter__ASTNode.initOperations(_TypeParameter__ASTNode);
			Fragments._TypeParameter__NamedElement.initOperations(_TypeParameter__NamedElement);
			Fragments._TypeParameter__OclAny.initOperations(_TypeParameter__OclAny);
			Fragments._TypeParameter__OclElement.initOperations(_TypeParameter__OclElement);
			Fragments._TypeParameter__Type.initOperations(_TypeParameter__Type);
			Fragments._TypeParameter__TypeParameter.initOperations(_TypeParameter__TypeParameter);

			Fragments._UnresolvedAnnotationDeclaration__ASTNode.initOperations(_UnresolvedAnnotationDeclaration__ASTNode);
			Fragments._UnresolvedAnnotationDeclaration__AbstractTypeDeclaration.initOperations(_UnresolvedAnnotationDeclaration__AbstractTypeDeclaration);
			Fragments._UnresolvedAnnotationDeclaration__AnnotationTypeDeclaration.initOperations(_UnresolvedAnnotationDeclaration__AnnotationTypeDeclaration);
			Fragments._UnresolvedAnnotationDeclaration__BodyDeclaration.initOperations(_UnresolvedAnnotationDeclaration__BodyDeclaration);
			Fragments._UnresolvedAnnotationDeclaration__NamedElement.initOperations(_UnresolvedAnnotationDeclaration__NamedElement);
			Fragments._UnresolvedAnnotationDeclaration__OclAny.initOperations(_UnresolvedAnnotationDeclaration__OclAny);
			Fragments._UnresolvedAnnotationDeclaration__OclElement.initOperations(_UnresolvedAnnotationDeclaration__OclElement);
			Fragments._UnresolvedAnnotationDeclaration__Type.initOperations(_UnresolvedAnnotationDeclaration__Type);
			Fragments._UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration.initOperations(_UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration);
			Fragments._UnresolvedAnnotationDeclaration__UnresolvedItem.initOperations(_UnresolvedAnnotationDeclaration__UnresolvedItem);

			Fragments._UnresolvedAnnotationTypeMemberDeclaration__ASTNode.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__ASTNode);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__BodyDeclaration.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__BodyDeclaration);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__NamedElement.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__NamedElement);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__OclAny.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__OclAny);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__OclElement.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__OclElement);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__UnresolvedItem.initOperations(_UnresolvedAnnotationTypeMemberDeclaration__UnresolvedItem);

			Fragments._UnresolvedClassDeclaration__ASTNode.initOperations(_UnresolvedClassDeclaration__ASTNode);
			Fragments._UnresolvedClassDeclaration__AbstractTypeDeclaration.initOperations(_UnresolvedClassDeclaration__AbstractTypeDeclaration);
			Fragments._UnresolvedClassDeclaration__BodyDeclaration.initOperations(_UnresolvedClassDeclaration__BodyDeclaration);
			Fragments._UnresolvedClassDeclaration__ClassDeclaration.initOperations(_UnresolvedClassDeclaration__ClassDeclaration);
			Fragments._UnresolvedClassDeclaration__NamedElement.initOperations(_UnresolvedClassDeclaration__NamedElement);
			Fragments._UnresolvedClassDeclaration__OclAny.initOperations(_UnresolvedClassDeclaration__OclAny);
			Fragments._UnresolvedClassDeclaration__OclElement.initOperations(_UnresolvedClassDeclaration__OclElement);
			Fragments._UnresolvedClassDeclaration__Type.initOperations(_UnresolvedClassDeclaration__Type);
			Fragments._UnresolvedClassDeclaration__TypeDeclaration.initOperations(_UnresolvedClassDeclaration__TypeDeclaration);
			Fragments._UnresolvedClassDeclaration__UnresolvedClassDeclaration.initOperations(_UnresolvedClassDeclaration__UnresolvedClassDeclaration);
			Fragments._UnresolvedClassDeclaration__UnresolvedItem.initOperations(_UnresolvedClassDeclaration__UnresolvedItem);

			Fragments._UnresolvedEnumDeclaration__ASTNode.initOperations(_UnresolvedEnumDeclaration__ASTNode);
			Fragments._UnresolvedEnumDeclaration__AbstractTypeDeclaration.initOperations(_UnresolvedEnumDeclaration__AbstractTypeDeclaration);
			Fragments._UnresolvedEnumDeclaration__BodyDeclaration.initOperations(_UnresolvedEnumDeclaration__BodyDeclaration);
			Fragments._UnresolvedEnumDeclaration__EnumDeclaration.initOperations(_UnresolvedEnumDeclaration__EnumDeclaration);
			Fragments._UnresolvedEnumDeclaration__NamedElement.initOperations(_UnresolvedEnumDeclaration__NamedElement);
			Fragments._UnresolvedEnumDeclaration__OclAny.initOperations(_UnresolvedEnumDeclaration__OclAny);
			Fragments._UnresolvedEnumDeclaration__OclElement.initOperations(_UnresolvedEnumDeclaration__OclElement);
			Fragments._UnresolvedEnumDeclaration__Type.initOperations(_UnresolvedEnumDeclaration__Type);
			Fragments._UnresolvedEnumDeclaration__UnresolvedEnumDeclaration.initOperations(_UnresolvedEnumDeclaration__UnresolvedEnumDeclaration);
			Fragments._UnresolvedEnumDeclaration__UnresolvedItem.initOperations(_UnresolvedEnumDeclaration__UnresolvedItem);

			Fragments._UnresolvedInterfaceDeclaration__ASTNode.initOperations(_UnresolvedInterfaceDeclaration__ASTNode);
			Fragments._UnresolvedInterfaceDeclaration__AbstractTypeDeclaration.initOperations(_UnresolvedInterfaceDeclaration__AbstractTypeDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__BodyDeclaration.initOperations(_UnresolvedInterfaceDeclaration__BodyDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__InterfaceDeclaration.initOperations(_UnresolvedInterfaceDeclaration__InterfaceDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__NamedElement.initOperations(_UnresolvedInterfaceDeclaration__NamedElement);
			Fragments._UnresolvedInterfaceDeclaration__OclAny.initOperations(_UnresolvedInterfaceDeclaration__OclAny);
			Fragments._UnresolvedInterfaceDeclaration__OclElement.initOperations(_UnresolvedInterfaceDeclaration__OclElement);
			Fragments._UnresolvedInterfaceDeclaration__Type.initOperations(_UnresolvedInterfaceDeclaration__Type);
			Fragments._UnresolvedInterfaceDeclaration__TypeDeclaration.initOperations(_UnresolvedInterfaceDeclaration__TypeDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration.initOperations(_UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__UnresolvedItem.initOperations(_UnresolvedInterfaceDeclaration__UnresolvedItem);

			Fragments._UnresolvedItem__ASTNode.initOperations(_UnresolvedItem__ASTNode);
			Fragments._UnresolvedItem__NamedElement.initOperations(_UnresolvedItem__NamedElement);
			Fragments._UnresolvedItem__OclAny.initOperations(_UnresolvedItem__OclAny);
			Fragments._UnresolvedItem__OclElement.initOperations(_UnresolvedItem__OclElement);
			Fragments._UnresolvedItem__UnresolvedItem.initOperations(_UnresolvedItem__UnresolvedItem);

			Fragments._UnresolvedItemAccess__ASTNode.initOperations(_UnresolvedItemAccess__ASTNode);
			Fragments._UnresolvedItemAccess__Expression.initOperations(_UnresolvedItemAccess__Expression);
			Fragments._UnresolvedItemAccess__NamespaceAccess.initOperations(_UnresolvedItemAccess__NamespaceAccess);
			Fragments._UnresolvedItemAccess__OclAny.initOperations(_UnresolvedItemAccess__OclAny);
			Fragments._UnresolvedItemAccess__OclElement.initOperations(_UnresolvedItemAccess__OclElement);
			Fragments._UnresolvedItemAccess__UnresolvedItemAccess.initOperations(_UnresolvedItemAccess__UnresolvedItemAccess);

			Fragments._UnresolvedLabeledStatement__ASTNode.initOperations(_UnresolvedLabeledStatement__ASTNode);
			Fragments._UnresolvedLabeledStatement__LabeledStatement.initOperations(_UnresolvedLabeledStatement__LabeledStatement);
			Fragments._UnresolvedLabeledStatement__NamedElement.initOperations(_UnresolvedLabeledStatement__NamedElement);
			Fragments._UnresolvedLabeledStatement__OclAny.initOperations(_UnresolvedLabeledStatement__OclAny);
			Fragments._UnresolvedLabeledStatement__OclElement.initOperations(_UnresolvedLabeledStatement__OclElement);
			Fragments._UnresolvedLabeledStatement__Statement.initOperations(_UnresolvedLabeledStatement__Statement);
			Fragments._UnresolvedLabeledStatement__UnresolvedItem.initOperations(_UnresolvedLabeledStatement__UnresolvedItem);
			Fragments._UnresolvedLabeledStatement__UnresolvedLabeledStatement.initOperations(_UnresolvedLabeledStatement__UnresolvedLabeledStatement);

			Fragments._UnresolvedMethodDeclaration__ASTNode.initOperations(_UnresolvedMethodDeclaration__ASTNode);
			Fragments._UnresolvedMethodDeclaration__AbstractMethodDeclaration.initOperations(_UnresolvedMethodDeclaration__AbstractMethodDeclaration);
			Fragments._UnresolvedMethodDeclaration__BodyDeclaration.initOperations(_UnresolvedMethodDeclaration__BodyDeclaration);
			Fragments._UnresolvedMethodDeclaration__MethodDeclaration.initOperations(_UnresolvedMethodDeclaration__MethodDeclaration);
			Fragments._UnresolvedMethodDeclaration__NamedElement.initOperations(_UnresolvedMethodDeclaration__NamedElement);
			Fragments._UnresolvedMethodDeclaration__OclAny.initOperations(_UnresolvedMethodDeclaration__OclAny);
			Fragments._UnresolvedMethodDeclaration__OclElement.initOperations(_UnresolvedMethodDeclaration__OclElement);
			Fragments._UnresolvedMethodDeclaration__UnresolvedItem.initOperations(_UnresolvedMethodDeclaration__UnresolvedItem);
			Fragments._UnresolvedMethodDeclaration__UnresolvedMethodDeclaration.initOperations(_UnresolvedMethodDeclaration__UnresolvedMethodDeclaration);

			Fragments._UnresolvedSingleVariableDeclaration__ASTNode.initOperations(_UnresolvedSingleVariableDeclaration__ASTNode);
			Fragments._UnresolvedSingleVariableDeclaration__NamedElement.initOperations(_UnresolvedSingleVariableDeclaration__NamedElement);
			Fragments._UnresolvedSingleVariableDeclaration__OclAny.initOperations(_UnresolvedSingleVariableDeclaration__OclAny);
			Fragments._UnresolvedSingleVariableDeclaration__OclElement.initOperations(_UnresolvedSingleVariableDeclaration__OclElement);
			Fragments._UnresolvedSingleVariableDeclaration__SingleVariableDeclaration.initOperations(_UnresolvedSingleVariableDeclaration__SingleVariableDeclaration);
			Fragments._UnresolvedSingleVariableDeclaration__UnresolvedItem.initOperations(_UnresolvedSingleVariableDeclaration__UnresolvedItem);
			Fragments._UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration.initOperations(_UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration);
			Fragments._UnresolvedSingleVariableDeclaration__VariableDeclaration.initOperations(_UnresolvedSingleVariableDeclaration__VariableDeclaration);

			Fragments._UnresolvedType__ASTNode.initOperations(_UnresolvedType__ASTNode);
			Fragments._UnresolvedType__NamedElement.initOperations(_UnresolvedType__NamedElement);
			Fragments._UnresolvedType__OclAny.initOperations(_UnresolvedType__OclAny);
			Fragments._UnresolvedType__OclElement.initOperations(_UnresolvedType__OclElement);
			Fragments._UnresolvedType__Type.initOperations(_UnresolvedType__Type);
			Fragments._UnresolvedType__UnresolvedItem.initOperations(_UnresolvedType__UnresolvedItem);
			Fragments._UnresolvedType__UnresolvedType.initOperations(_UnresolvedType__UnresolvedType);

			Fragments._UnresolvedTypeDeclaration__ASTNode.initOperations(_UnresolvedTypeDeclaration__ASTNode);
			Fragments._UnresolvedTypeDeclaration__AbstractTypeDeclaration.initOperations(_UnresolvedTypeDeclaration__AbstractTypeDeclaration);
			Fragments._UnresolvedTypeDeclaration__BodyDeclaration.initOperations(_UnresolvedTypeDeclaration__BodyDeclaration);
			Fragments._UnresolvedTypeDeclaration__NamedElement.initOperations(_UnresolvedTypeDeclaration__NamedElement);
			Fragments._UnresolvedTypeDeclaration__OclAny.initOperations(_UnresolvedTypeDeclaration__OclAny);
			Fragments._UnresolvedTypeDeclaration__OclElement.initOperations(_UnresolvedTypeDeclaration__OclElement);
			Fragments._UnresolvedTypeDeclaration__Type.initOperations(_UnresolvedTypeDeclaration__Type);
			Fragments._UnresolvedTypeDeclaration__UnresolvedItem.initOperations(_UnresolvedTypeDeclaration__UnresolvedItem);
			Fragments._UnresolvedTypeDeclaration__UnresolvedTypeDeclaration.initOperations(_UnresolvedTypeDeclaration__UnresolvedTypeDeclaration);

			Fragments._UnresolvedVariableDeclarationFragment__ASTNode.initOperations(_UnresolvedVariableDeclarationFragment__ASTNode);
			Fragments._UnresolvedVariableDeclarationFragment__NamedElement.initOperations(_UnresolvedVariableDeclarationFragment__NamedElement);
			Fragments._UnresolvedVariableDeclarationFragment__OclAny.initOperations(_UnresolvedVariableDeclarationFragment__OclAny);
			Fragments._UnresolvedVariableDeclarationFragment__OclElement.initOperations(_UnresolvedVariableDeclarationFragment__OclElement);
			Fragments._UnresolvedVariableDeclarationFragment__UnresolvedItem.initOperations(_UnresolvedVariableDeclarationFragment__UnresolvedItem);
			Fragments._UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment.initOperations(_UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment);
			Fragments._UnresolvedVariableDeclarationFragment__VariableDeclaration.initOperations(_UnresolvedVariableDeclarationFragment__VariableDeclaration);
			Fragments._UnresolvedVariableDeclarationFragment__VariableDeclarationFragment.initOperations(_UnresolvedVariableDeclarationFragment__VariableDeclarationFragment);

			Fragments._VariableDeclaration__ASTNode.initOperations(_VariableDeclaration__ASTNode);
			Fragments._VariableDeclaration__NamedElement.initOperations(_VariableDeclaration__NamedElement);
			Fragments._VariableDeclaration__OclAny.initOperations(_VariableDeclaration__OclAny);
			Fragments._VariableDeclaration__OclElement.initOperations(_VariableDeclaration__OclElement);
			Fragments._VariableDeclaration__VariableDeclaration.initOperations(_VariableDeclaration__VariableDeclaration);

			Fragments._VariableDeclarationExpression__ASTNode.initOperations(_VariableDeclarationExpression__ASTNode);
			Fragments._VariableDeclarationExpression__AbstractVariablesContainer.initOperations(_VariableDeclarationExpression__AbstractVariablesContainer);
			Fragments._VariableDeclarationExpression__Expression.initOperations(_VariableDeclarationExpression__Expression);
			Fragments._VariableDeclarationExpression__OclAny.initOperations(_VariableDeclarationExpression__OclAny);
			Fragments._VariableDeclarationExpression__OclElement.initOperations(_VariableDeclarationExpression__OclElement);
			Fragments._VariableDeclarationExpression__VariableDeclarationExpression.initOperations(_VariableDeclarationExpression__VariableDeclarationExpression);

			Fragments._VariableDeclarationFragment__ASTNode.initOperations(_VariableDeclarationFragment__ASTNode);
			Fragments._VariableDeclarationFragment__NamedElement.initOperations(_VariableDeclarationFragment__NamedElement);
			Fragments._VariableDeclarationFragment__OclAny.initOperations(_VariableDeclarationFragment__OclAny);
			Fragments._VariableDeclarationFragment__OclElement.initOperations(_VariableDeclarationFragment__OclElement);
			Fragments._VariableDeclarationFragment__VariableDeclaration.initOperations(_VariableDeclarationFragment__VariableDeclaration);
			Fragments._VariableDeclarationFragment__VariableDeclarationFragment.initOperations(_VariableDeclarationFragment__VariableDeclarationFragment);

			Fragments._VariableDeclarationStatement__ASTNode.initOperations(_VariableDeclarationStatement__ASTNode);
			Fragments._VariableDeclarationStatement__AbstractVariablesContainer.initOperations(_VariableDeclarationStatement__AbstractVariablesContainer);
			Fragments._VariableDeclarationStatement__OclAny.initOperations(_VariableDeclarationStatement__OclAny);
			Fragments._VariableDeclarationStatement__OclElement.initOperations(_VariableDeclarationStatement__OclElement);
			Fragments._VariableDeclarationStatement__Statement.initOperations(_VariableDeclarationStatement__Statement);
			Fragments._VariableDeclarationStatement__VariableDeclarationStatement.initOperations(_VariableDeclarationStatement__VariableDeclarationStatement);

			Fragments._VisibilityKind__OclAny.initOperations(_VisibilityKind__OclAny);
			Fragments._VisibilityKind__OclElement.initOperations(_VisibilityKind__OclElement);
			Fragments._VisibilityKind__OclEnumeration.initOperations(_VisibilityKind__OclEnumeration);
			Fragments._VisibilityKind__OclType.initOperations(_VisibilityKind__OclType);
			Fragments._VisibilityKind__VisibilityKind.initOperations(_VisibilityKind__VisibilityKind);

			Fragments._WhileStatement__ASTNode.initOperations(_WhileStatement__ASTNode);
			Fragments._WhileStatement__OclAny.initOperations(_WhileStatement__OclAny);
			Fragments._WhileStatement__OclElement.initOperations(_WhileStatement__OclElement);
			Fragments._WhileStatement__Statement.initOperations(_WhileStatement__Statement);
			Fragments._WhileStatement__WhileStatement.initOperations(_WhileStatement__WhileStatement);

			Fragments._WildCardType__ASTNode.initOperations(_WildCardType__ASTNode);
			Fragments._WildCardType__NamedElement.initOperations(_WildCardType__NamedElement);
			Fragments._WildCardType__OclAny.initOperations(_WildCardType__OclAny);
			Fragments._WildCardType__OclElement.initOperations(_WildCardType__OclElement);
			Fragments._WildCardType__Type.initOperations(_WildCardType__Type);
			Fragments._WildCardType__WildCardType.initOperations(_WildCardType__WildCardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ASTNode = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AbstractMethodDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractMethodDeclaration__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodDeclaration__parameters,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractMethodDeclaration__thrownExceptions,
			Java_Tables.Properties._AbstractMethodDeclaration__typeParameters,
			Java_Tables.Properties._AbstractMethodDeclaration__usages,
			Java_Tables.Properties._AbstractMethodDeclaration__usagesInDocComments,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AbstractMethodInvocation = {
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AbstractTypeDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AbstractTypeQualifiedExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeQualifiedExpression__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AbstractVariablesContainer = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractVariablesContainer__fragments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractVariablesContainer__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Annotation = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Annotation__type,
			Java_Tables.Properties._Annotation__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AnnotationMemberValuePair = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AnnotationMemberValuePair__member,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._AnnotationMemberValuePair__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AnnotationTypeDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AnnotationTypeMemberDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__default,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__type,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__usages,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AnonymousClassDeclaration = {
			Java_Tables.Properties._AnonymousClassDeclaration__bodyDeclarations,
			Java_Tables.Properties._AnonymousClassDeclaration__classInstanceCreation,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Archive = {
			Java_Tables.Properties._Archive__classFiles,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Archive__manifest,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Archive__originalFilePath,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayAccess = {
			Java_Tables.Properties._ArrayAccess__array,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ArrayAccess__index,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayCreation = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ArrayCreation__dimensions,
			Java_Tables.Properties._ArrayCreation__initializer,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ArrayCreation__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayInitializer = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ArrayInitializer__expressions,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayLengthAccess = {
			Java_Tables.Properties._ArrayLengthAccess__array,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayType = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ArrayType__dimensions,
			Java_Tables.Properties._ArrayType__elementType,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AssertStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AssertStatement__expression,
			Java_Tables.Properties._AssertStatement__message,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Assignment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Assignment__leftHandSide,
			Java_Tables.Properties._Assignment__operator,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Assignment__rightHandSide
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AssignmentKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Block = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Block__statements
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BlockComment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Comment__content,
			Java_Tables.Properties._Comment__enclosedByParent,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Comment__prefixOfParent
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BodyDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BooleanLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._BooleanLiteral__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BreakStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._BreakStatement__label,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CastExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._CastExpression__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._CastExpression__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CatchClause = {
			Java_Tables.Properties._CatchClause__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._CatchClause__exception,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CharacterLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._CharacterLiteral__escapedValue,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ClassDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._ClassDeclaration__superClass,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._TypeDeclaration__typeParameters,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ClassFile = {
			Java_Tables.Properties._ClassFile__attachedSource,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ClassFile__originalFilePath,
			Java_Tables.Properties._ClassFile__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._ClassFile__type,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ClassInstanceCreation = {
			Java_Tables.Properties._ClassInstanceCreation__anonymousClassDeclaration,
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ClassInstanceCreation__expression,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ClassInstanceCreation__type,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Comment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Comment__content,
			Java_Tables.Properties._Comment__enclosedByParent,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Comment__prefixOfParent
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CompilationUnit = {
			Java_Tables.Properties._CompilationUnit__commentList,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._CompilationUnit__imports,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._CompilationUnit__originalFilePath,
			Java_Tables.Properties._CompilationUnit__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._CompilationUnit__types,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ConditionalExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ConditionalExpression__elseExpression,
			Java_Tables.Properties._ConditionalExpression__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ConditionalExpression__thenExpression
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ConstructorDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractMethodDeclaration__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodDeclaration__parameters,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractMethodDeclaration__thrownExceptions,
			Java_Tables.Properties._AbstractMethodDeclaration__typeParameters,
			Java_Tables.Properties._AbstractMethodDeclaration__usages,
			Java_Tables.Properties._AbstractMethodDeclaration__usagesInDocComments,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ConstructorInvocation = {
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ContinueStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ContinueStatement__label,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DoStatement = {
			Java_Tables.Properties._DoStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._DoStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EmptyStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EnhancedForStatement = {
			Java_Tables.Properties._EnhancedForStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._EnhancedForStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._EnhancedForStatement__parameter
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EnumConstantDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._EnumConstantDeclaration__anonymousClassDeclaration,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._EnumConstantDeclaration__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EnumDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._EnumDeclaration__enumConstants,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Expression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ExpressionStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ExpressionStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FieldAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._FieldAccess__expression,
			Java_Tables.Properties._FieldAccess__field,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FieldDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractVariablesContainer__fragments,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractVariablesContainer__type,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ForStatement = {
			Java_Tables.Properties._ForStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ForStatement__expression,
			Java_Tables.Properties._ForStatement__initializers,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ForStatement__updaters
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IfStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._IfStatement__elseStatement,
			Java_Tables.Properties._IfStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._IfStatement__thenStatement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ImportDeclaration = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ImportDeclaration__importedElement,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._ImportDeclaration__static
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InfixExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._InfixExpression__extendedOperands,
			Java_Tables.Properties._InfixExpression__leftOperand,
			Java_Tables.Properties._InfixExpression__operator,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._InfixExpression__rightOperand
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InfixExpressionKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InheritanceKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Initializer = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._Initializer__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InstanceofExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._InstanceofExpression__leftOperand,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._InstanceofExpression__rightOperand
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InterfaceDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._TypeDeclaration__typeParameters,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Javadoc = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Comment__content,
			Java_Tables.Properties._Comment__enclosedByParent,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Comment__prefixOfParent,
			Java_Tables.Properties._Javadoc__tags
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _LabeledStatement = {
			Java_Tables.Properties._LabeledStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._LabeledStatement__usagesInBreakStatements,
			Java_Tables.Properties._LabeledStatement__usagesInContinueStatements,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _LineComment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Comment__content,
			Java_Tables.Properties._Comment__enclosedByParent,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Comment__prefixOfParent
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manifest = {
			Java_Tables.Properties._Manifest__entryAttributes,
			Java_Tables.Properties._Manifest__mainAttributes
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ManifestAttribute = {
			Java_Tables.Properties._ManifestAttribute__key,
			Java_Tables.Properties._ManifestAttribute__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ManifestEntry = {
			Java_Tables.Properties._ManifestEntry__attributes,
			Java_Tables.Properties._ManifestEntry__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MemberRef = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MemberRef__member,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._MemberRef__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MethodDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractMethodDeclaration__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MethodDeclaration__extraArrayDimensions,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodDeclaration__parameters,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._MethodDeclaration__redefinedMethodDeclaration,
			Java_Tables.Properties._MethodDeclaration__redefinitions,
			Java_Tables.Properties._MethodDeclaration__returnType,
			Java_Tables.Properties._AbstractMethodDeclaration__thrownExceptions,
			Java_Tables.Properties._AbstractMethodDeclaration__typeParameters,
			Java_Tables.Properties._AbstractMethodDeclaration__usages,
			Java_Tables.Properties._AbstractMethodDeclaration__usagesInDocComments,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MethodInvocation = {
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MethodInvocation__expression,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MethodRef = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MethodRef__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._MethodRef__parameters,
			Java_Tables.Properties._MethodRef__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MethodRefParameter = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MethodRefParameter__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._MethodRefParameter__type,
			Java_Tables.Properties._MethodRefParameter__varargs
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Model = {
			Java_Tables.Properties._Model__archives,
			Java_Tables.Properties._Model__classFiles,
			Java_Tables.Properties._Model__compilationUnits,
			Java_Tables.Properties._Model__name,
			Java_Tables.Properties._Model__orphanTypes,
			Java_Tables.Properties._Model__ownedElements,
			Java_Tables.Properties._Model__unresolvedItems
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Modifier = {
			Java_Tables.Properties._Modifier__bodyDeclaration,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Modifier__inheritance,
			Java_Tables.Properties._Modifier__native,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Modifier__singleVariableDeclaration,
			Java_Tables.Properties._Modifier__static,
			Java_Tables.Properties._Modifier__strictfp,
			Java_Tables.Properties._Modifier__synchronized,
			Java_Tables.Properties._Modifier__transient,
			Java_Tables.Properties._Modifier__variableDeclarationExpression,
			Java_Tables.Properties._Modifier__variableDeclarationStatement,
			Java_Tables.Properties._Modifier__visibility,
			Java_Tables.Properties._Modifier__volatile
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NamespaceAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NullLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NumberLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NumberLiteral__tokenValue
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Package = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._Package__model,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._Package__ownedElements,
			Java_Tables.Properties._Package__ownedPackages,
			Java_Tables.Properties._Package__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Package__usagesInPackageAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PackageAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._PackageAccess__package,
			Java_Tables.Properties._PackageAccess__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ParameterizedType = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._ParameterizedType__type,
			Java_Tables.Properties._ParameterizedType__typeArguments,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ParenthesizedExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ParenthesizedExpression__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PostfixExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._PostfixExpression__operand,
			Java_Tables.Properties._PostfixExpression__operator,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PostfixExpressionKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrefixExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._PrefixExpression__operand,
			Java_Tables.Properties._PrefixExpression__operator,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrefixExpressionKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveType = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeBoolean = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeByte = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeChar = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeDouble = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeFloat = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeInt = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeLong = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeShort = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PrimitiveTypeVoid = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _QueryCollection = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ReturnStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ReturnStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SingleVariableAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._SingleVariableAccess__qualifier,
			Java_Tables.Properties._SingleVariableAccess__variable
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SingleVariableDeclaration = {
			Java_Tables.Properties._SingleVariableDeclaration__annotations,
			Java_Tables.Properties._SingleVariableDeclaration__catchClause,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SingleVariableDeclaration__enhancedForStatement,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._SingleVariableDeclaration__methodDeclaration,
			Java_Tables.Properties._SingleVariableDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._SingleVariableDeclaration__type,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._SingleVariableDeclaration__varargs
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Statement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StringLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._StringLiteral__escapedValue,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SuperConstructorInvocation = {
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SuperConstructorInvocation__expression,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SuperFieldAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SuperFieldAccess__field,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeQualifiedExpression__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SuperMethodInvocation = {
			Java_Tables.Properties._AbstractMethodInvocation__arguments,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractMethodInvocation__method,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeQualifiedExpression__qualifier,
			Java_Tables.Properties._AbstractMethodInvocation__typeArguments
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SwitchCase = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SwitchCase__default,
			Java_Tables.Properties._SwitchCase__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SwitchStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SwitchStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._SwitchStatement__statements
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SynchronizedStatement = {
			Java_Tables.Properties._SynchronizedStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SynchronizedStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TagElement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._TagElement__fragments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._TagElement__tagName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TextElement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._TextElement__text
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ThisExpression = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeQualifiedExpression__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ThrowStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ThrowStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TryStatement = {
			Java_Tables.Properties._TryStatement__body,
			Java_Tables.Properties._TryStatement__catchClauses,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._TryStatement__finally,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Type = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._TypeAccess__qualifier,
			Java_Tables.Properties._TypeAccess__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._TypeDeclaration__typeParameters,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeDeclarationStatement = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._TypeDeclarationStatement__declaration,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeLiteral = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._TypeLiteral__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeParameter = {
			Java_Tables.Properties._TypeParameter__bounds,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedAnnotationDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedAnnotationTypeMemberDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__default,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__type,
			Java_Tables.Properties._AnnotationTypeMemberDeclaration__usages,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedClassDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._ClassDeclaration__superClass,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._TypeDeclaration__typeParameters,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedEnumDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._EnumDeclaration__enumConstants,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedInterfaceDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._TypeDeclaration__typeParameters,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedItem = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedItemAccess = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._UnresolvedItemAccess__element,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._UnresolvedItemAccess__qualifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedLabeledStatement = {
			Java_Tables.Properties._LabeledStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._LabeledStatement__usagesInBreakStatements,
			Java_Tables.Properties._LabeledStatement__usagesInContinueStatements,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedMethodDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractMethodDeclaration__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._MethodDeclaration__extraArrayDimensions,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractMethodDeclaration__parameters,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._MethodDeclaration__redefinedMethodDeclaration,
			Java_Tables.Properties._MethodDeclaration__redefinitions,
			Java_Tables.Properties._MethodDeclaration__returnType,
			Java_Tables.Properties._AbstractMethodDeclaration__thrownExceptions,
			Java_Tables.Properties._AbstractMethodDeclaration__typeParameters,
			Java_Tables.Properties._AbstractMethodDeclaration__usages,
			Java_Tables.Properties._AbstractMethodDeclaration__usagesInDocComments,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedSingleVariableDeclaration = {
			Java_Tables.Properties._SingleVariableDeclaration__annotations,
			Java_Tables.Properties._SingleVariableDeclaration__catchClause,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._SingleVariableDeclaration__enhancedForStatement,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._SingleVariableDeclaration__methodDeclaration,
			Java_Tables.Properties._SingleVariableDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._SingleVariableDeclaration__type,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._SingleVariableDeclaration__varargs
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedType = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedTypeDeclaration = {
			Java_Tables.Properties._BodyDeclaration__abstractTypeDeclaration,
			Java_Tables.Properties._BodyDeclaration__annotations,
			Java_Tables.Properties._BodyDeclaration__anonymousClassDeclarationOwner,
			Java_Tables.Properties._AbstractTypeDeclaration__bodyDeclarations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsAfterBody,
			Java_Tables.Properties._AbstractTypeDeclaration__commentsBeforeBody,
			Java_Tables.Properties._BodyDeclaration__modifier,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractTypeDeclaration__package,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._AbstractTypeDeclaration__superInterfaces,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UnresolvedVariableDeclarationFragment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._VariableDeclarationFragment__variablesContainer
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VariableDeclaration = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VariableDeclarationExpression = {
			Java_Tables.Properties._VariableDeclarationExpression__annotations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._AbstractVariablesContainer__fragments,
			Java_Tables.Properties._VariableDeclarationExpression__modifier,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractVariablesContainer__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VariableDeclarationFragment = {
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._VariableDeclaration__extraArrayDimensions,
			Java_Tables.Properties._VariableDeclaration__initializer,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._VariableDeclaration__usageInVariableAccess,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._VariableDeclarationFragment__variablesContainer
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VariableDeclarationStatement = {
			Java_Tables.Properties._VariableDeclarationStatement__annotations,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._VariableDeclarationStatement__extraArrayDimensions,
			Java_Tables.Properties._AbstractVariablesContainer__fragments,
			Java_Tables.Properties._VariableDeclarationStatement__modifier,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._AbstractVariablesContainer__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VisibilityKind = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _WhileStatement = {
			Java_Tables.Properties._WhileStatement__body,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._WhileStatement__expression,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _WildCardType = {
			Java_Tables.Properties._WildCardType__bound,
			Java_Tables.Properties._ASTNode__comments,
			Java_Tables.Properties._NamedElement__name,
			Java_Tables.Properties._ASTNode__originalClassFile,
			Java_Tables.Properties._ASTNode__originalCompilationUnit,
			Java_Tables.Properties._NamedElement__proxy,
			Java_Tables.Properties._WildCardType__upperBound,
			Java_Tables.Properties._NamedElement__usagesInImports,
			Java_Tables.Properties._Type__usagesInTypeAccess
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ASTNode__ASTNode.initProperties(_ASTNode);
			Fragments._AbstractMethodDeclaration__AbstractMethodDeclaration.initProperties(_AbstractMethodDeclaration);
			Fragments._AbstractMethodInvocation__AbstractMethodInvocation.initProperties(_AbstractMethodInvocation);
			Fragments._AbstractTypeDeclaration__AbstractTypeDeclaration.initProperties(_AbstractTypeDeclaration);
			Fragments._AbstractTypeQualifiedExpression__AbstractTypeQualifiedExpression.initProperties(_AbstractTypeQualifiedExpression);
			Fragments._AbstractVariablesContainer__AbstractVariablesContainer.initProperties(_AbstractVariablesContainer);
			Fragments._Annotation__Annotation.initProperties(_Annotation);
			Fragments._AnnotationMemberValuePair__AnnotationMemberValuePair.initProperties(_AnnotationMemberValuePair);
			Fragments._AnnotationTypeDeclaration__AnnotationTypeDeclaration.initProperties(_AnnotationTypeDeclaration);
			Fragments._AnnotationTypeMemberDeclaration__AnnotationTypeMemberDeclaration.initProperties(_AnnotationTypeMemberDeclaration);
			Fragments._AnonymousClassDeclaration__AnonymousClassDeclaration.initProperties(_AnonymousClassDeclaration);
			Fragments._Archive__Archive.initProperties(_Archive);
			Fragments._ArrayAccess__ArrayAccess.initProperties(_ArrayAccess);
			Fragments._ArrayCreation__ArrayCreation.initProperties(_ArrayCreation);
			Fragments._ArrayInitializer__ArrayInitializer.initProperties(_ArrayInitializer);
			Fragments._ArrayLengthAccess__ArrayLengthAccess.initProperties(_ArrayLengthAccess);
			Fragments._ArrayType__ArrayType.initProperties(_ArrayType);
			Fragments._AssertStatement__AssertStatement.initProperties(_AssertStatement);
			Fragments._Assignment__Assignment.initProperties(_Assignment);
			Fragments._AssignmentKind__AssignmentKind.initProperties(_AssignmentKind);
			Fragments._Block__Block.initProperties(_Block);
			Fragments._BlockComment__BlockComment.initProperties(_BlockComment);
			Fragments._BodyDeclaration__BodyDeclaration.initProperties(_BodyDeclaration);
			Fragments._BooleanLiteral__BooleanLiteral.initProperties(_BooleanLiteral);
			Fragments._BreakStatement__BreakStatement.initProperties(_BreakStatement);
			Fragments._CastExpression__CastExpression.initProperties(_CastExpression);
			Fragments._CatchClause__CatchClause.initProperties(_CatchClause);
			Fragments._CharacterLiteral__CharacterLiteral.initProperties(_CharacterLiteral);
			Fragments._ClassDeclaration__ClassDeclaration.initProperties(_ClassDeclaration);
			Fragments._ClassFile__ClassFile.initProperties(_ClassFile);
			Fragments._ClassInstanceCreation__ClassInstanceCreation.initProperties(_ClassInstanceCreation);
			Fragments._Comment__Comment.initProperties(_Comment);
			Fragments._CompilationUnit__CompilationUnit.initProperties(_CompilationUnit);
			Fragments._ConditionalExpression__ConditionalExpression.initProperties(_ConditionalExpression);
			Fragments._ConstructorDeclaration__ConstructorDeclaration.initProperties(_ConstructorDeclaration);
			Fragments._ConstructorInvocation__ConstructorInvocation.initProperties(_ConstructorInvocation);
			Fragments._ContinueStatement__ContinueStatement.initProperties(_ContinueStatement);
			Fragments._DoStatement__DoStatement.initProperties(_DoStatement);
			Fragments._EmptyStatement__EmptyStatement.initProperties(_EmptyStatement);
			Fragments._EnhancedForStatement__EnhancedForStatement.initProperties(_EnhancedForStatement);
			Fragments._EnumConstantDeclaration__EnumConstantDeclaration.initProperties(_EnumConstantDeclaration);
			Fragments._EnumDeclaration__EnumDeclaration.initProperties(_EnumDeclaration);
			Fragments._Expression__Expression.initProperties(_Expression);
			Fragments._ExpressionStatement__ExpressionStatement.initProperties(_ExpressionStatement);
			Fragments._FieldAccess__FieldAccess.initProperties(_FieldAccess);
			Fragments._FieldDeclaration__FieldDeclaration.initProperties(_FieldDeclaration);
			Fragments._ForStatement__ForStatement.initProperties(_ForStatement);
			Fragments._IfStatement__IfStatement.initProperties(_IfStatement);
			Fragments._ImportDeclaration__ImportDeclaration.initProperties(_ImportDeclaration);
			Fragments._InfixExpression__InfixExpression.initProperties(_InfixExpression);
			Fragments._InfixExpressionKind__InfixExpressionKind.initProperties(_InfixExpressionKind);
			Fragments._InheritanceKind__InheritanceKind.initProperties(_InheritanceKind);
			Fragments._Initializer__Initializer.initProperties(_Initializer);
			Fragments._InstanceofExpression__InstanceofExpression.initProperties(_InstanceofExpression);
			Fragments._InterfaceDeclaration__InterfaceDeclaration.initProperties(_InterfaceDeclaration);
			Fragments._Javadoc__Javadoc.initProperties(_Javadoc);
			Fragments._LabeledStatement__LabeledStatement.initProperties(_LabeledStatement);
			Fragments._LineComment__LineComment.initProperties(_LineComment);
			Fragments._Manifest__Manifest.initProperties(_Manifest);
			Fragments._ManifestAttribute__ManifestAttribute.initProperties(_ManifestAttribute);
			Fragments._ManifestEntry__ManifestEntry.initProperties(_ManifestEntry);
			Fragments._MemberRef__MemberRef.initProperties(_MemberRef);
			Fragments._MethodDeclaration__MethodDeclaration.initProperties(_MethodDeclaration);
			Fragments._MethodInvocation__MethodInvocation.initProperties(_MethodInvocation);
			Fragments._MethodRef__MethodRef.initProperties(_MethodRef);
			Fragments._MethodRefParameter__MethodRefParameter.initProperties(_MethodRefParameter);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._Modifier__Modifier.initProperties(_Modifier);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._NamespaceAccess__NamespaceAccess.initProperties(_NamespaceAccess);
			Fragments._NullLiteral__NullLiteral.initProperties(_NullLiteral);
			Fragments._NumberLiteral__NumberLiteral.initProperties(_NumberLiteral);
			Fragments._Package__Package.initProperties(_Package);
			Fragments._PackageAccess__PackageAccess.initProperties(_PackageAccess);
			Fragments._ParameterizedType__ParameterizedType.initProperties(_ParameterizedType);
			Fragments._ParenthesizedExpression__ParenthesizedExpression.initProperties(_ParenthesizedExpression);
			Fragments._PostfixExpression__PostfixExpression.initProperties(_PostfixExpression);
			Fragments._PostfixExpressionKind__PostfixExpressionKind.initProperties(_PostfixExpressionKind);
			Fragments._PrefixExpression__PrefixExpression.initProperties(_PrefixExpression);
			Fragments._PrefixExpressionKind__PrefixExpressionKind.initProperties(_PrefixExpressionKind);
			Fragments._PrimitiveType__PrimitiveType.initProperties(_PrimitiveType);
			Fragments._PrimitiveTypeBoolean__PrimitiveTypeBoolean.initProperties(_PrimitiveTypeBoolean);
			Fragments._PrimitiveTypeByte__PrimitiveTypeByte.initProperties(_PrimitiveTypeByte);
			Fragments._PrimitiveTypeChar__PrimitiveTypeChar.initProperties(_PrimitiveTypeChar);
			Fragments._PrimitiveTypeDouble__PrimitiveTypeDouble.initProperties(_PrimitiveTypeDouble);
			Fragments._PrimitiveTypeFloat__PrimitiveTypeFloat.initProperties(_PrimitiveTypeFloat);
			Fragments._PrimitiveTypeInt__PrimitiveTypeInt.initProperties(_PrimitiveTypeInt);
			Fragments._PrimitiveTypeLong__PrimitiveTypeLong.initProperties(_PrimitiveTypeLong);
			Fragments._PrimitiveTypeShort__PrimitiveTypeShort.initProperties(_PrimitiveTypeShort);
			Fragments._PrimitiveTypeVoid__PrimitiveTypeVoid.initProperties(_PrimitiveTypeVoid);
			Fragments._QueryCollection__QueryCollection.initProperties(_QueryCollection);
			Fragments._ReturnStatement__ReturnStatement.initProperties(_ReturnStatement);
			Fragments._SingleVariableAccess__SingleVariableAccess.initProperties(_SingleVariableAccess);
			Fragments._SingleVariableDeclaration__SingleVariableDeclaration.initProperties(_SingleVariableDeclaration);
			Fragments._Statement__Statement.initProperties(_Statement);
			Fragments._StringLiteral__StringLiteral.initProperties(_StringLiteral);
			Fragments._SuperConstructorInvocation__SuperConstructorInvocation.initProperties(_SuperConstructorInvocation);
			Fragments._SuperFieldAccess__SuperFieldAccess.initProperties(_SuperFieldAccess);
			Fragments._SuperMethodInvocation__SuperMethodInvocation.initProperties(_SuperMethodInvocation);
			Fragments._SwitchCase__SwitchCase.initProperties(_SwitchCase);
			Fragments._SwitchStatement__SwitchStatement.initProperties(_SwitchStatement);
			Fragments._SynchronizedStatement__SynchronizedStatement.initProperties(_SynchronizedStatement);
			Fragments._TagElement__TagElement.initProperties(_TagElement);
			Fragments._TextElement__TextElement.initProperties(_TextElement);
			Fragments._ThisExpression__ThisExpression.initProperties(_ThisExpression);
			Fragments._ThrowStatement__ThrowStatement.initProperties(_ThrowStatement);
			Fragments._TryStatement__TryStatement.initProperties(_TryStatement);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._TypeAccess__TypeAccess.initProperties(_TypeAccess);
			Fragments._TypeDeclaration__TypeDeclaration.initProperties(_TypeDeclaration);
			Fragments._TypeDeclarationStatement__TypeDeclarationStatement.initProperties(_TypeDeclarationStatement);
			Fragments._TypeLiteral__TypeLiteral.initProperties(_TypeLiteral);
			Fragments._TypeParameter__TypeParameter.initProperties(_TypeParameter);
			Fragments._UnresolvedAnnotationDeclaration__UnresolvedAnnotationDeclaration.initProperties(_UnresolvedAnnotationDeclaration);
			Fragments._UnresolvedAnnotationTypeMemberDeclaration__UnresolvedAnnotationTypeMemberDeclaration.initProperties(_UnresolvedAnnotationTypeMemberDeclaration);
			Fragments._UnresolvedClassDeclaration__UnresolvedClassDeclaration.initProperties(_UnresolvedClassDeclaration);
			Fragments._UnresolvedEnumDeclaration__UnresolvedEnumDeclaration.initProperties(_UnresolvedEnumDeclaration);
			Fragments._UnresolvedInterfaceDeclaration__UnresolvedInterfaceDeclaration.initProperties(_UnresolvedInterfaceDeclaration);
			Fragments._UnresolvedItem__UnresolvedItem.initProperties(_UnresolvedItem);
			Fragments._UnresolvedItemAccess__UnresolvedItemAccess.initProperties(_UnresolvedItemAccess);
			Fragments._UnresolvedLabeledStatement__UnresolvedLabeledStatement.initProperties(_UnresolvedLabeledStatement);
			Fragments._UnresolvedMethodDeclaration__UnresolvedMethodDeclaration.initProperties(_UnresolvedMethodDeclaration);
			Fragments._UnresolvedSingleVariableDeclaration__UnresolvedSingleVariableDeclaration.initProperties(_UnresolvedSingleVariableDeclaration);
			Fragments._UnresolvedType__UnresolvedType.initProperties(_UnresolvedType);
			Fragments._UnresolvedTypeDeclaration__UnresolvedTypeDeclaration.initProperties(_UnresolvedTypeDeclaration);
			Fragments._UnresolvedVariableDeclarationFragment__UnresolvedVariableDeclarationFragment.initProperties(_UnresolvedVariableDeclarationFragment);
			Fragments._VariableDeclaration__VariableDeclaration.initProperties(_VariableDeclaration);
			Fragments._VariableDeclarationExpression__VariableDeclarationExpression.initProperties(_VariableDeclarationExpression);
			Fragments._VariableDeclarationFragment__VariableDeclarationFragment.initProperties(_VariableDeclarationFragment);
			Fragments._VariableDeclarationStatement__VariableDeclarationStatement.initProperties(_VariableDeclarationStatement);
			Fragments._VisibilityKind__VisibilityKind.initProperties(_VisibilityKind);
			Fragments._WhileStatement__WhileStatement.initProperties(_WhileStatement);
			Fragments._WildCardType__WildCardType.initProperties(_WildCardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("ASSIGN"), Types._AssignmentKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__PLUS_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("PLUS_ASSIGN"), Types._AssignmentKind, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__MINUS_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("MINUS_ASSIGN"), Types._AssignmentKind, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__TIMES_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("TIMES_ASSIGN"), Types._AssignmentKind, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__DIVIDE_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("DIVIDE_ASSIGN"), Types._AssignmentKind, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__BIT_AND_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("BIT_AND_ASSIGN"), Types._AssignmentKind, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__BIT_OR_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("BIT_OR_ASSIGN"), Types._AssignmentKind, 6);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__BIT_XOR_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("BIT_XOR_ASSIGN"), Types._AssignmentKind, 7);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__REMAINDER_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("REMAINDER_ASSIGN"), Types._AssignmentKind, 8);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__LEFT_SHIFT_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("LEFT_SHIFT_ASSIGN"), Types._AssignmentKind, 9);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__RIGHT_SHIFT_SIGNED_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("RIGHT_SHIFT_SIGNED_ASSIGN"), Types._AssignmentKind, 10);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AssignmentKind__RIGHT_SHIFT_UNSIGNED_ASSIGN = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.ASSIGNMENT_KIND.getEEnumLiteral("RIGHT_SHIFT_UNSIGNED_ASSIGN"), Types._AssignmentKind, 11);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AssignmentKind = {
			_AssignmentKind__ASSIGN,
			_AssignmentKind__PLUS_ASSIGN,
			_AssignmentKind__MINUS_ASSIGN,
			_AssignmentKind__TIMES_ASSIGN,
			_AssignmentKind__DIVIDE_ASSIGN,
			_AssignmentKind__BIT_AND_ASSIGN,
			_AssignmentKind__BIT_OR_ASSIGN,
			_AssignmentKind__BIT_XOR_ASSIGN,
			_AssignmentKind__REMAINDER_ASSIGN,
			_AssignmentKind__LEFT_SHIFT_ASSIGN,
			_AssignmentKind__RIGHT_SHIFT_SIGNED_ASSIGN,
			_AssignmentKind__RIGHT_SHIFT_UNSIGNED_ASSIGN
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__TIMES = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("TIMES"), Types._InfixExpressionKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__DIVIDE = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("DIVIDE"), Types._InfixExpressionKind, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__REMAINDER = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("REMAINDER"), Types._InfixExpressionKind, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__PLUS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("PLUS"), Types._InfixExpressionKind, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__MINUS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("MINUS"), Types._InfixExpressionKind, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__LEFT_SHIFT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("LEFT_SHIFT"), Types._InfixExpressionKind, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__RIGHT_SHIFT_SIGNED = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("RIGHT_SHIFT_SIGNED"), Types._InfixExpressionKind, 6);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__RIGHT_SHIFT_UNSIGNED = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("RIGHT_SHIFT_UNSIGNED"), Types._InfixExpressionKind, 7);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__LESS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("LESS"), Types._InfixExpressionKind, 8);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__GREATER = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("GREATER"), Types._InfixExpressionKind, 9);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__LESS_EQUALS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("LESS_EQUALS"), Types._InfixExpressionKind, 10);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__GREATER_EQUALS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("GREATER_EQUALS"), Types._InfixExpressionKind, 11);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__EQUALS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("EQUALS"), Types._InfixExpressionKind, 12);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__NOT_EQUALS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("NOT_EQUALS"), Types._InfixExpressionKind, 13);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__XOR = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("XOR"), Types._InfixExpressionKind, 14);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__AND = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("AND"), Types._InfixExpressionKind, 15);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__OR = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("OR"), Types._InfixExpressionKind, 16);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__CONDITIONAL_AND = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("CONDITIONAL_AND"), Types._InfixExpressionKind, 17);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InfixExpressionKind__CONDITIONAL_OR = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INFIX_EXPRESSION_KIND.getEEnumLiteral("CONDITIONAL_OR"), Types._InfixExpressionKind, 18);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InfixExpressionKind = {
			_InfixExpressionKind__TIMES,
			_InfixExpressionKind__DIVIDE,
			_InfixExpressionKind__REMAINDER,
			_InfixExpressionKind__PLUS,
			_InfixExpressionKind__MINUS,
			_InfixExpressionKind__LEFT_SHIFT,
			_InfixExpressionKind__RIGHT_SHIFT_SIGNED,
			_InfixExpressionKind__RIGHT_SHIFT_UNSIGNED,
			_InfixExpressionKind__LESS,
			_InfixExpressionKind__GREATER,
			_InfixExpressionKind__LESS_EQUALS,
			_InfixExpressionKind__GREATER_EQUALS,
			_InfixExpressionKind__EQUALS,
			_InfixExpressionKind__NOT_EQUALS,
			_InfixExpressionKind__XOR,
			_InfixExpressionKind__AND,
			_InfixExpressionKind__OR,
			_InfixExpressionKind__CONDITIONAL_AND,
			_InfixExpressionKind__CONDITIONAL_OR
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InheritanceKind__none = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INHERITANCE_KIND.getEEnumLiteral("none"), Types._InheritanceKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InheritanceKind__abstract = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INHERITANCE_KIND.getEEnumLiteral("abstract"), Types._InheritanceKind, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InheritanceKind__final = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.INHERITANCE_KIND.getEEnumLiteral("final"), Types._InheritanceKind, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InheritanceKind = {
			_InheritanceKind__none,
			_InheritanceKind__abstract,
			_InheritanceKind__final
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PostfixExpressionKind__INCREMENT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.POSTFIX_EXPRESSION_KIND.getEEnumLiteral("INCREMENT"), Types._PostfixExpressionKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PostfixExpressionKind__DECREMENT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.POSTFIX_EXPRESSION_KIND.getEEnumLiteral("DECREMENT"), Types._PostfixExpressionKind, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PostfixExpressionKind = {
			_PostfixExpressionKind__INCREMENT,
			_PostfixExpressionKind__DECREMENT
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__INCREMENT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("INCREMENT"), Types._PrefixExpressionKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__DECREMENT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("DECREMENT"), Types._PrefixExpressionKind, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__PLUS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("PLUS"), Types._PrefixExpressionKind, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__MINUS = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("MINUS"), Types._PrefixExpressionKind, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__COMPLEMENT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("COMPLEMENT"), Types._PrefixExpressionKind, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PrefixExpressionKind__NOT = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.PREFIX_EXPRESSION_KIND.getEEnumLiteral("NOT"), Types._PrefixExpressionKind, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PrefixExpressionKind = {
			_PrefixExpressionKind__INCREMENT,
			_PrefixExpressionKind__DECREMENT,
			_PrefixExpressionKind__PLUS,
			_PrefixExpressionKind__MINUS,
			_PrefixExpressionKind__COMPLEMENT,
			_PrefixExpressionKind__NOT
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VisibilityKind__none = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.VISIBILITY_KIND.getEEnumLiteral("none"), Types._VisibilityKind, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VisibilityKind__public = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.VISIBILITY_KIND.getEEnumLiteral("public"), Types._VisibilityKind, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VisibilityKind__private = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.VISIBILITY_KIND.getEEnumLiteral("private"), Types._VisibilityKind, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VisibilityKind__protected = new EcoreExecutorEnumerationLiteral(Java_Package.Literals.VISIBILITY_KIND.getEEnumLiteral("protected"), Types._VisibilityKind, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VisibilityKind = {
			_VisibilityKind__none,
			_VisibilityKind__public,
			_VisibilityKind__private,
			_VisibilityKind__protected
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AssignmentKind.initLiterals(_AssignmentKind);
			Types._InfixExpressionKind.initLiterals(_InfixExpressionKind);
			Types._InheritanceKind.initLiterals(_InheritanceKind);
			Types._PostfixExpressionKind.initLiterals(_PostfixExpressionKind);
			Types._PrefixExpressionKind.initLiterals(_PrefixExpressionKind);
			Types._VisibilityKind.initLiterals(_VisibilityKind);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Java_Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
