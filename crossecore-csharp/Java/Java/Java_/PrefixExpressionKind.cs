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
	    public class PrefixExpressionKind : EEnumerator
	    {
	    	
			public const int INCREMENT_VALUE = 1;
			public const int DECREMENT_VALUE = 2;
			public const int PLUS_VALUE = 3;
			public const int MINUS_VALUE = 4;
			public const int COMPLEMENT_VALUE = 5;
			public const int NOT_VALUE = 6;
			
			public static PrefixExpressionKind INCREMENT = new PrefixExpressionKind(1, "INCREMENT", "++");
			public static PrefixExpressionKind DECREMENT = new PrefixExpressionKind(2, "DECREMENT", "--");
			public static PrefixExpressionKind PLUS = new PrefixExpressionKind(3, "PLUS", "+");
			public static PrefixExpressionKind MINUS = new PrefixExpressionKind(4, "MINUS", "-");
			public static PrefixExpressionKind COMPLEMENT = new PrefixExpressionKind(5, "COMPLEMENT", "~");
			public static PrefixExpressionKind NOT = new PrefixExpressionKind(6, "NOT", "!");
	
			private static PrefixExpressionKind[] VALUES_ARRAY =
				new PrefixExpressionKind[] {
				INCREMENT, 
				DECREMENT, 
				PLUS, 
				MINUS, 
				COMPLEMENT, 
				NOT
			};
	
	        public static PrefixExpressionKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                PrefixExpressionKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static PrefixExpressionKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                PrefixExpressionKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static PrefixExpressionKind get(int value)
	        {
	            switch (value)
	            {
				case INCREMENT_VALUE: return INCREMENT;
				case DECREMENT_VALUE: return DECREMENT;
				case PLUS_VALUE: return PLUS;
				case MINUS_VALUE: return MINUS;
				case COMPLEMENT_VALUE: return COMPLEMENT;
				case NOT_VALUE: return NOT;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private PrefixExpressionKind(int value, string name, string literal)
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
	        
			public override string ToString()
			{
				return literal;
			}
	    }
}
