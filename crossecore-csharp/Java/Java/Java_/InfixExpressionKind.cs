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
	    public class InfixExpressionKind : EEnumerator
	    {
	    	
			public const int TIMES_VALUE = 1;
			public const int DIVIDE_VALUE = 2;
			public const int REMAINDER_VALUE = 3;
			public const int PLUS_VALUE = 4;
			public const int MINUS_VALUE = 5;
			public const int LEFT_SHIFT_VALUE = 6;
			public const int RIGHT_SHIFT_SIGNED_VALUE = 7;
			public const int RIGHT_SHIFT_UNSIGNED_VALUE = 8;
			public const int LESS_VALUE = 9;
			public const int GREATER_VALUE = 10;
			public const int LESS_EQUALS_VALUE = 11;
			public const int GREATER_EQUALS_VALUE = 12;
			public const int EQUALS_VALUE = 13;
			public const int NOT_EQUALS_VALUE = 14;
			public const int XOR_VALUE = 15;
			public const int AND_VALUE = 16;
			public const int OR_VALUE = 17;
			public const int CONDITIONAL_AND_VALUE = 18;
			public const int CONDITIONAL_OR_VALUE = 19;
			
			public static InfixExpressionKind TIMES;
			public static InfixExpressionKind DIVIDE;
			public static InfixExpressionKind REMAINDER;
			public static InfixExpressionKind PLUS;
			public static InfixExpressionKind MINUS;
			public static InfixExpressionKind LEFT_SHIFT;
			public static InfixExpressionKind RIGHT_SHIFT_SIGNED;
			public static InfixExpressionKind RIGHT_SHIFT_UNSIGNED;
			public static InfixExpressionKind LESS;
			public static InfixExpressionKind GREATER;
			public static InfixExpressionKind LESS_EQUALS;
			public static InfixExpressionKind GREATER_EQUALS;
			public static InfixExpressionKind EQUALS;
			public static InfixExpressionKind NOT_EQUALS;
			public static InfixExpressionKind XOR;
			public static InfixExpressionKind AND;
			public static InfixExpressionKind OR;
			public static InfixExpressionKind CONDITIONAL_AND;
			public static InfixExpressionKind CONDITIONAL_OR;
	
			private static InfixExpressionKind[] VALUES_ARRAY =
				new InfixExpressionKind[] {
				TIMES, 
				DIVIDE, 
				REMAINDER, 
				PLUS, 
				MINUS, 
				LEFT_SHIFT, 
				RIGHT_SHIFT_SIGNED, 
				RIGHT_SHIFT_UNSIGNED, 
				LESS, 
				GREATER, 
				LESS_EQUALS, 
				GREATER_EQUALS, 
				EQUALS, 
				NOT_EQUALS, 
				XOR, 
				AND, 
				OR, 
				CONDITIONAL_AND, 
				CONDITIONAL_OR
			};
	
	        public static InfixExpressionKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                InfixExpressionKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static InfixExpressionKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                InfixExpressionKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static InfixExpressionKind get(int value)
	        {
	            switch (value)
	            {
				case TIMES_VALUE: return TIMES;
				case DIVIDE_VALUE: return DIVIDE;
				case REMAINDER_VALUE: return REMAINDER;
				case PLUS_VALUE: return PLUS;
				case MINUS_VALUE: return MINUS;
				case LEFT_SHIFT_VALUE: return LEFT_SHIFT;
				case RIGHT_SHIFT_SIGNED_VALUE: return RIGHT_SHIFT_SIGNED;
				case RIGHT_SHIFT_UNSIGNED_VALUE: return RIGHT_SHIFT_UNSIGNED;
				case LESS_VALUE: return LESS;
				case GREATER_VALUE: return GREATER;
				case LESS_EQUALS_VALUE: return LESS_EQUALS;
				case GREATER_EQUALS_VALUE: return GREATER_EQUALS;
				case EQUALS_VALUE: return EQUALS;
				case NOT_EQUALS_VALUE: return NOT_EQUALS;
				case XOR_VALUE: return XOR;
				case AND_VALUE: return AND;
				case OR_VALUE: return OR;
				case CONDITIONAL_AND_VALUE: return CONDITIONAL_AND;
				case CONDITIONAL_OR_VALUE: return CONDITIONAL_OR;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private InfixExpressionKind(int value, string name, string literal)
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
