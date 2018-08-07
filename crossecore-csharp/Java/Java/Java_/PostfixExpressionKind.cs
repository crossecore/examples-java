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
	    public class PostfixExpressionKind : EEnumerator
	    {
	    	
			public const int INCREMENT_VALUE = 1;
			public const int DECREMENT_VALUE = 2;
			
			public static PostfixExpressionKind INCREMENT;
			public static PostfixExpressionKind DECREMENT;
	
			private static PostfixExpressionKind[] VALUES_ARRAY =
				new PostfixExpressionKind[] {
				INCREMENT, 
				DECREMENT
			};
	
	        public static PostfixExpressionKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                PostfixExpressionKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static PostfixExpressionKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                PostfixExpressionKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static PostfixExpressionKind get(int value)
	        {
	            switch (value)
	            {
				case INCREMENT_VALUE: return INCREMENT;
				case DECREMENT_VALUE: return DECREMENT;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private PostfixExpressionKind(int value, string name, string literal)
	        {
	            this.value = value;
	            this.name = name;
	            this.literal = literal;
	        }
	
	        public string getLiteral()
	        {
	            return literal;
	        }
	
	        public string getName()
	        {
	            return name;
	        }
	
	        public int getValue()
	        {
	            return value;
	        }
	    }
}
