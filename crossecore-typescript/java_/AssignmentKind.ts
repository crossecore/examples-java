    export class AssignmentKind
    {
    	
		public static readonly ASSIGN_VALUE:number = 1;
		public static readonly PLUS_ASSIGN_VALUE:number = 2;
		public static readonly MINUS_ASSIGN_VALUE:number = 3;
		public static readonly TIMES_ASSIGN_VALUE:number = 4;
		public static readonly DIVIDE_ASSIGN_VALUE:number = 5;
		public static readonly BIT_AND_ASSIGN_VALUE:number = 6;
		public static readonly BIT_OR_ASSIGN_VALUE:number = 7;
		public static readonly BIT_XOR_ASSIGN_VALUE:number = 8;
		public static readonly REMAINDER_ASSIGN_VALUE:number = 9;
		public static readonly LEFT_SHIFT_ASSIGN_VALUE:number = 10;
		public static readonly RIGHT_SHIFT_SIGNED_ASSIGN_VALUE:number = 11;
		public static readonly RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE:number = 12;
		
		public static ASSIGN:AssignmentKind = new AssignmentKind(1, "ASSIGN", "=");
		public static PLUS_ASSIGN:AssignmentKind = new AssignmentKind(2, "PLUS_ASSIGN", "+=");
		public static MINUS_ASSIGN:AssignmentKind = new AssignmentKind(3, "MINUS_ASSIGN", "-=");
		public static TIMES_ASSIGN:AssignmentKind = new AssignmentKind(4, "TIMES_ASSIGN", "*=");
		public static DIVIDE_ASSIGN:AssignmentKind = new AssignmentKind(5, "DIVIDE_ASSIGN", "/=");
		public static BIT_AND_ASSIGN:AssignmentKind = new AssignmentKind(6, "BIT_AND_ASSIGN", "&=");
		public static BIT_OR_ASSIGN:AssignmentKind = new AssignmentKind(7, "BIT_OR_ASSIGN", "|=");
		public static BIT_XOR_ASSIGN:AssignmentKind = new AssignmentKind(8, "BIT_XOR_ASSIGN", "^=");
		public static REMAINDER_ASSIGN:AssignmentKind = new AssignmentKind(9, "REMAINDER_ASSIGN", "%=");
		public static LEFT_SHIFT_ASSIGN:AssignmentKind = new AssignmentKind(10, "LEFT_SHIFT_ASSIGN", "<<=");
		public static RIGHT_SHIFT_SIGNED_ASSIGN:AssignmentKind = new AssignmentKind(11, "RIGHT_SHIFT_SIGNED_ASSIGN", ">>=");
		public static RIGHT_SHIFT_UNSIGNED_ASSIGN:AssignmentKind = new AssignmentKind(12, "RIGHT_SHIFT_UNSIGNED_ASSIGN", ">>>=");

		private static VALUES_ARRAY:Array<AssignmentKind> = [
			AssignmentKind.ASSIGN, 
			AssignmentKind.PLUS_ASSIGN, 
			AssignmentKind.MINUS_ASSIGN, 
			AssignmentKind.TIMES_ASSIGN, 
			AssignmentKind.DIVIDE_ASSIGN, 
			AssignmentKind.BIT_AND_ASSIGN, 
			AssignmentKind.BIT_OR_ASSIGN, 
			AssignmentKind.BIT_XOR_ASSIGN, 
			AssignmentKind.REMAINDER_ASSIGN, 
			AssignmentKind.LEFT_SHIFT_ASSIGN, 
			AssignmentKind.RIGHT_SHIFT_SIGNED_ASSIGN, 
			AssignmentKind.RIGHT_SHIFT_UNSIGNED_ASSIGN
		];

        public static get_string(literal:string):AssignmentKind
        {
            for (let i = 0; i < this.VALUES_ARRAY.length; i++)
            {
                let result = this.VALUES_ARRAY[i];
                if (result.toString() === literal)
                {
                    return result;
                }
            }
            return null;
        }

        public static getByName(name:string):AssignmentKind
        {
	        for (let i = 0; i < this.VALUES_ARRAY.length; i++)
	        {
	            let result = this.VALUES_ARRAY[i];
	            if (result.getName()==name)
	            {
	                return result;
	            }
	        }
	        return null;
        }

        public static get_number(value:number):AssignmentKind
        {
            switch (value)
            {
			case this.ASSIGN_VALUE: return this.ASSIGN;
			case this.PLUS_ASSIGN_VALUE: return this.PLUS_ASSIGN;
			case this.MINUS_ASSIGN_VALUE: return this.MINUS_ASSIGN;
			case this.TIMES_ASSIGN_VALUE: return this.TIMES_ASSIGN;
			case this.DIVIDE_ASSIGN_VALUE: return this.DIVIDE_ASSIGN;
			case this.BIT_AND_ASSIGN_VALUE: return this.BIT_AND_ASSIGN;
			case this.BIT_OR_ASSIGN_VALUE: return this.BIT_OR_ASSIGN;
			case this.BIT_XOR_ASSIGN_VALUE: return this.BIT_XOR_ASSIGN;
			case this.REMAINDER_ASSIGN_VALUE: return this.REMAINDER_ASSIGN;
			case this.LEFT_SHIFT_ASSIGN_VALUE: return this.LEFT_SHIFT_ASSIGN;
			case this.RIGHT_SHIFT_SIGNED_ASSIGN_VALUE: return this.RIGHT_SHIFT_SIGNED_ASSIGN;
			case this.RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE: return this.RIGHT_SHIFT_UNSIGNED_ASSIGN;
            }
            return null;
        }

	    private value:number;
	    private name:string;
	    private literal:string;

	    private constructor(value:number, name:string, literal:string)
	    {
	        this.value = value;
	        this.name = name;
	        this.literal = literal;
	    }
	
	    public getLiteral():string
	    {
	        return this.literal;
	    }
	
	    public getName():string
	    {
	        return this.name;
	    }
	
	    public getValue():number
	    {
	        return this.value;
	    }
	    
	    public toString():string
	    {
	        return this.literal;
	    }
    }
