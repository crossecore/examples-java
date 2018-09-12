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
	public class ExpressionImpl 
	: ExpressionBase
	{
		
		public static oclstdlib.Set<ExpressionImpl> allInstances_ = new oclstdlib.Set<ExpressionImpl>();
		
	    public static oclstdlib.Set<Expression> allInstances()
		{
	
			var result = new oclstdlib.Set<Expression>();
		    result.AddRange(ExpressionImpl.allInstances_);
			result.AddRange(InstanceofExpressionImpl.allInstances_);
			result.AddRange(ArrayInitializerImpl.allInstances_);
			result.AddRange(SuperMethodInvocationImpl.allInstances_);
			result.AddRange(FieldAccessImpl.allInstances_);
			result.AddRange(SuperFieldAccessImpl.allInstances_);
			result.AddRange(MethodInvocationImpl.allInstances_);
			result.AddRange(NullLiteralImpl.allInstances_);
			result.AddRange(ConditionalExpressionImpl.allInstances_);
			result.AddRange(ClassInstanceCreationImpl.allInstances_);
			result.AddRange(AbstractTypeQualifiedExpressionImpl.allInstances_);
			result.AddRange(CastExpressionImpl.allInstances_);
			result.AddRange(PrefixExpressionImpl.allInstances_);
			result.AddRange(AnnotationImpl.allInstances_);
			result.AddRange(CharacterLiteralImpl.allInstances_);
			result.AddRange(InfixExpressionImpl.allInstances_);
			result.AddRange(NumberLiteralImpl.allInstances_);
			result.AddRange(SingleVariableAccessImpl.allInstances_);
			result.AddRange(ThisExpressionImpl.allInstances_);
			result.AddRange(StringLiteralImpl.allInstances_);
			result.AddRange(UnresolvedItemAccessImpl.allInstances_);
			result.AddRange(PostfixExpressionImpl.allInstances_);
			result.AddRange(TypeAccessImpl.allInstances_);
			result.AddRange(BooleanLiteralImpl.allInstances_);
			result.AddRange(TypeLiteralImpl.allInstances_);
			result.AddRange(ParenthesizedExpressionImpl.allInstances_);
			result.AddRange(ArrayAccessImpl.allInstances_);
			result.AddRange(ArrayCreationImpl.allInstances_);
			result.AddRange(AssignmentImpl.allInstances_);
			result.AddRange(VariableDeclarationExpressionImpl.allInstances_);
			result.AddRange(ArrayLengthAccessImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
