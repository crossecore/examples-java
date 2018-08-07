/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using oclstdlib;
using Ecore;
namespace Java_{
	
	public interface Modifier 
	: ASTNode
	{
		VisibilityKind visibility
		{
			get;
		set;
		}
		InheritanceKind inheritance
		{
			get;
		set;
		}
		bool static_
		{
			get;
		set;
		}
		bool transient
		{
			get;
		set;
		}
		bool volatile_
		{
			get;
		set;
		}
		bool native
		{
			get;
		set;
		}
		bool strictfp
		{
			get;
		set;
		}
		bool synchronized
		{
			get;
		set;
		}
		BodyDeclaration bodyDeclaration
		{
			get;
			set;
		}
		SingleVariableDeclaration singleVariableDeclaration
		{
			get;
			set;
		}
		VariableDeclarationStatement variableDeclarationStatement
		{
			get;
			set;
		}
		VariableDeclarationExpression variableDeclarationExpression
		{
			get;
			set;
		}
	}
}
