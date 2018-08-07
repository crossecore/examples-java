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
	    public class AssignmentKind : EEnumerator
	    {
	    	
			public const int ASSIGN_VALUE = 1;
			public const int PLUS_ASSIGN_VALUE = 2;
			public const int MINUS_ASSIGN_VALUE = 3;
			public const int TIMES_ASSIGN_VALUE = 4;
			public const int DIVIDE_ASSIGN_VALUE = 5;
			public const int BIT_AND_ASSIGN_VALUE = 6;
			public const int BIT_OR_ASSIGN_VALUE = 7;
			public const int BIT_XOR_ASSIGN_VALUE = 8;
			public const int REMAINDER_ASSIGN_VALUE = 9;
			public const int LEFT_SHIFT_ASSIGN_VALUE = 10;
			public const int RIGHT_SHIFT_SIGNED_ASSIGN_VALUE = 11;
			public const int RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE = 12;
			
			public static AssignmentKind ASSIGN;
			public static AssignmentKind PLUS_ASSIGN;
			public static AssignmentKind MINUS_ASSIGN;
			public static AssignmentKind TIMES_ASSIGN;
			public static AssignmentKind DIVIDE_ASSIGN;
			public static AssignmentKind BIT_AND_ASSIGN;
			public static AssignmentKind BIT_OR_ASSIGN;
			public static AssignmentKind BIT_XOR_ASSIGN;
			public static AssignmentKind REMAINDER_ASSIGN;
			public static AssignmentKind LEFT_SHIFT_ASSIGN;
			public static AssignmentKind RIGHT_SHIFT_SIGNED_ASSIGN;
			public static AssignmentKind RIGHT_SHIFT_UNSIGNED_ASSIGN;
	
			private static AssignmentKind[] VALUES_ARRAY =
				new AssignmentKind[] {
				ASSIGN, 
				PLUS_ASSIGN, 
				MINUS_ASSIGN, 
				TIMES_ASSIGN, 
				DIVIDE_ASSIGN, 
				BIT_AND_ASSIGN, 
				BIT_OR_ASSIGN, 
				BIT_XOR_ASSIGN, 
				REMAINDER_ASSIGN, 
				LEFT_SHIFT_ASSIGN, 
				RIGHT_SHIFT_SIGNED_ASSIGN, 
				RIGHT_SHIFT_UNSIGNED_ASSIGN
			};
	
	        public static AssignmentKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                AssignmentKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static AssignmentKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                AssignmentKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static AssignmentKind get(int value)
	        {
	            switch (value)
	            {
				case ASSIGN_VALUE: return ASSIGN;
				case PLUS_ASSIGN_VALUE: return PLUS_ASSIGN;
				case MINUS_ASSIGN_VALUE: return MINUS_ASSIGN;
				case TIMES_ASSIGN_VALUE: return TIMES_ASSIGN;
				case DIVIDE_ASSIGN_VALUE: return DIVIDE_ASSIGN;
				case BIT_AND_ASSIGN_VALUE: return BIT_AND_ASSIGN;
				case BIT_OR_ASSIGN_VALUE: return BIT_OR_ASSIGN;
				case BIT_XOR_ASSIGN_VALUE: return BIT_XOR_ASSIGN;
				case REMAINDER_ASSIGN_VALUE: return REMAINDER_ASSIGN;
				case LEFT_SHIFT_ASSIGN_VALUE: return LEFT_SHIFT_ASSIGN;
				case RIGHT_SHIFT_SIGNED_ASSIGN_VALUE: return RIGHT_SHIFT_SIGNED_ASSIGN;
				case RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE: return RIGHT_SHIFT_UNSIGNED_ASSIGN;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private AssignmentKind(int value, string name, string literal)
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
