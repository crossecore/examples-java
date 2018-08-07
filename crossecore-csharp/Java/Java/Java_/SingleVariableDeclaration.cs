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
	
	public interface SingleVariableDeclaration 
	: VariableDeclaration
	{
		Modifier modifier
		{
			get;
			set;
		}
		bool varargs
		{
			get;
		set;
		}
		TypeAccess type
		{
			get;
			set;
		}
		OrderedSet<Annotation> annotations
		{
			get;
		
		}
		AbstractMethodDeclaration methodDeclaration
		{
			get;
			set;
		}
		CatchClause catchClause
		{
			get;
			set;
		}
		EnhancedForStatement enhancedForStatement
		{
			get;
			set;
		}
	}
}
