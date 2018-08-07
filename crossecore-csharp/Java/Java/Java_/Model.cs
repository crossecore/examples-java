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
	
	public interface Model 
	: EObject
	{
		string name
		{
			get;
		set;
		}
		Set<Package> ownedElements
		{
			get;
		
		}
		Set<Type> orphanTypes
		{
			get;
		
		}
		Set<UnresolvedItem> unresolvedItems
		{
			get;
		
		}
		Set<CompilationUnit> compilationUnits
		{
			get;
		
		}
		Set<ClassFile> classFiles
		{
			get;
		
		}
		Set<Archive> archives
		{
			get;
		
		}
	}
}
