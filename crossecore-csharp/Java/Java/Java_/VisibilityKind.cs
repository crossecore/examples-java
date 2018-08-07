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
	    public class VisibilityKind : EEnumerator
	    {
	    	
			public const int NONE_VALUE = 1;
			public const int PUBLIC_VALUE = 2;
			public const int PRIVATE_VALUE = 3;
			public const int PROTECTED_VALUE = 4;
			
			public static VisibilityKind NONE;
			public static VisibilityKind PUBLIC;
			public static VisibilityKind PRIVATE;
			public static VisibilityKind PROTECTED;
	
			private static VisibilityKind[] VALUES_ARRAY =
				new VisibilityKind[] {
				NONE, 
				PUBLIC, 
				PRIVATE, 
				PROTECTED
			};
	
	        public static VisibilityKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                VisibilityKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static VisibilityKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                VisibilityKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static VisibilityKind get(int value)
	        {
	            switch (value)
	            {
				case NONE_VALUE: return NONE;
				case PUBLIC_VALUE: return PUBLIC;
				case PRIVATE_VALUE: return PRIVATE;
				case PROTECTED_VALUE: return PROTECTED;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private VisibilityKind(int value, string name, string literal)
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
