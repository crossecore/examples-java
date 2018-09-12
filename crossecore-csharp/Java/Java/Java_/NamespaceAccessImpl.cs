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
	public class NamespaceAccessImpl 
	: NamespaceAccessBase
	{
		
		public static oclstdlib.Set<NamespaceAccessImpl> allInstances_ = new oclstdlib.Set<NamespaceAccessImpl>();
		
	    public static oclstdlib.Set<NamespaceAccess> allInstances()
		{
	
			var result = new oclstdlib.Set<NamespaceAccess>();
		    result.AddRange(NamespaceAccessImpl.allInstances_);
			result.AddRange(TypeAccessImpl.allInstances_);
			result.AddRange(PackageAccessImpl.allInstances_);
			result.AddRange(UnresolvedItemAccessImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
