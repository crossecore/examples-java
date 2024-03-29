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
	
	public interface Package 
	: NamedElement
	{
		Set<AbstractTypeDeclaration> ownedElements
		{
			get;
		
		}
		Model model
		{
			get;
			set;
		}
		Set<Package> ownedPackages
		{
			get;
		
		}
		Package package
		{
			get;
			set;
		}
		Set<PackageAccess> usagesInPackageAccess
		{
			get;
		
		}
	}
}
