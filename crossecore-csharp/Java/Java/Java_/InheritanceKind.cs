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
	    public class InheritanceKind : EEnumerator
	    {
	    	
			public const int NONE_VALUE = 1;
			public const int ABSTRACT_VALUE = 2;
			public const int FINAL_VALUE = 3;
			
			public static InheritanceKind NONE;
			public static InheritanceKind ABSTRACT;
			public static InheritanceKind FINAL;
	
			private static InheritanceKind[] VALUES_ARRAY =
				new InheritanceKind[] {
				NONE, 
				ABSTRACT, 
				FINAL
			};
	
	        public static InheritanceKind get(string literal)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                InheritanceKind result = VALUES_ARRAY[i];
	                if (result.ToString() == literal)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static InheritanceKind getByName(string name)
	        {
	            for (int i = 0; i < VALUES_ARRAY.Length; ++i)
	            {
	                InheritanceKind result = VALUES_ARRAY[i];
	                if (result.getName()==name)
	                {
	                    return result;
	                }
	            }
	            return null;
	        }
	
	        public static InheritanceKind get(int value)
	        {
	            switch (value)
	            {
				case NONE_VALUE: return NONE;
				case ABSTRACT_VALUE: return ABSTRACT;
				case FINAL_VALUE: return FINAL;
	            }
	            return null;
	        }
	
	        private int value;
	        private string name;
		    private string literal;
	
	        private InheritanceKind(int value, string name, string literal)
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
