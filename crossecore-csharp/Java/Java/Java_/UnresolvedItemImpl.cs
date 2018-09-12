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
	public class UnresolvedItemImpl 
	: UnresolvedItemBase
	{
		
		public static oclstdlib.Set<UnresolvedItemImpl> allInstances_ = new oclstdlib.Set<UnresolvedItemImpl>();
		
	    public static oclstdlib.Set<UnresolvedItem> allInstances()
		{
	
			var result = new oclstdlib.Set<UnresolvedItem>();
		    result.AddRange(UnresolvedItemImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedMethodDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedLabeledStatementImpl.allInstances_);
			result.AddRange(UnresolvedSingleVariableDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedTypeImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedVariableDeclarationFragmentImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
