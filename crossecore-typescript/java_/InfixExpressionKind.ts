    export class InfixExpressionKind
    {
    	
		public static readonly TIMES_VALUE:number = 1;
		public static readonly DIVIDE_VALUE:number = 2;
		public static readonly REMAINDER_VALUE:number = 3;
		public static readonly PLUS_VALUE:number = 4;
		public static readonly MINUS_VALUE:number = 5;
		public static readonly LEFT_SHIFT_VALUE:number = 6;
		public static readonly RIGHT_SHIFT_SIGNED_VALUE:number = 7;
		public static readonly RIGHT_SHIFT_UNSIGNED_VALUE:number = 8;
		public static readonly LESS_VALUE:number = 9;
		public static readonly GREATER_VALUE:number = 10;
		public static readonly LESS_EQUALS_VALUE:number = 11;
		public static readonly GREATER_EQUALS_VALUE:number = 12;
		public static readonly EQUALS_VALUE:number = 13;
		public static readonly NOT_EQUALS_VALUE:number = 14;
		public static readonly XOR_VALUE:number = 15;
		public static readonly AND_VALUE:number = 16;
		public static readonly OR_VALUE:number = 17;
		public static readonly CONDITIONAL_AND_VALUE:number = 18;
		public static readonly CONDITIONAL_OR_VALUE:number = 19;
		
		public static TIMES:InfixExpressionKind = new InfixExpressionKind(1, "TIMES", "*");
		public static DIVIDE:InfixExpressionKind = new InfixExpressionKind(2, "DIVIDE", "/");
		public static REMAINDER:InfixExpressionKind = new InfixExpressionKind(3, "REMAINDER", "%");
		public static PLUS:InfixExpressionKind = new InfixExpressionKind(4, "PLUS", "+");
		public static MINUS:InfixExpressionKind = new InfixExpressionKind(5, "MINUS", "-");
		public static LEFT_SHIFT:InfixExpressionKind = new InfixExpressionKind(6, "LEFT_SHIFT", "<<");
		public static RIGHT_SHIFT_SIGNED:InfixExpressionKind = new InfixExpressionKind(7, "RIGHT_SHIFT_SIGNED", ">>");
		public static RIGHT_SHIFT_UNSIGNED:InfixExpressionKind = new InfixExpressionKind(8, "RIGHT_SHIFT_UNSIGNED", ">>>");
		public static LESS:InfixExpressionKind = new InfixExpressionKind(9, "LESS", "<");
		public static GREATER:InfixExpressionKind = new InfixExpressionKind(10, "GREATER", ">");
		public static LESS_EQUALS:InfixExpressionKind = new InfixExpressionKind(11, "LESS_EQUALS", "<=");
		public static GREATER_EQUALS:InfixExpressionKind = new InfixExpressionKind(12, "GREATER_EQUALS", ">=");
		public static EQUALS:InfixExpressionKind = new InfixExpressionKind(13, "EQUALS", "==");
		public static NOT_EQUALS:InfixExpressionKind = new InfixExpressionKind(14, "NOT_EQUALS", "!=");
		public static XOR:InfixExpressionKind = new InfixExpressionKind(15, "XOR", "^");
		public static AND:InfixExpressionKind = new InfixExpressionKind(16, "AND", "&");
		public static OR:InfixExpressionKind = new InfixExpressionKind(17, "OR", "|");
		public static CONDITIONAL_AND:InfixExpressionKind = new InfixExpressionKind(18, "CONDITIONAL_AND", "&&");
		public static CONDITIONAL_OR:InfixExpressionKind = new InfixExpressionKind(19, "CONDITIONAL_OR", "||");

		private static VALUES_ARRAY:Array<InfixExpressionKind> = [
			InfixExpressionKind.TIMES, 
			InfixExpressionKind.DIVIDE, 
			InfixExpressionKind.REMAINDER, 
			InfixExpressionKind.PLUS, 
			InfixExpressionKind.MINUS, 
			InfixExpressionKind.LEFT_SHIFT, 
			InfixExpressionKind.RIGHT_SHIFT_SIGNED, 
			InfixExpressionKind.RIGHT_SHIFT_UNSIGNED, 
			InfixExpressionKind.LESS, 
			InfixExpressionKind.GREATER, 
			InfixExpressionKind.LESS_EQUALS, 
			InfixExpressionKind.GREATER_EQUALS, 
			InfixExpressionKind.EQUALS, 
			InfixExpressionKind.NOT_EQUALS, 
			InfixExpressionKind.XOR, 
			InfixExpressionKind.AND, 
			InfixExpressionKind.OR, 
			InfixExpressionKind.CONDITIONAL_AND, 
			InfixExpressionKind.CONDITIONAL_OR
		];

        public static get_string(literal:string):InfixExpressionKind
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

        public static getByName(name:string):InfixExpressionKind
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

        public static get_number(value:number):InfixExpressionKind
        {
            switch (value)
            {
			case this.TIMES_VALUE: return this.TIMES;
			case this.DIVIDE_VALUE: return this.DIVIDE;
			case this.REMAINDER_VALUE: return this.REMAINDER;
			case this.PLUS_VALUE: return this.PLUS;
			case this.MINUS_VALUE: return this.MINUS;
			case this.LEFT_SHIFT_VALUE: return this.LEFT_SHIFT;
			case this.RIGHT_SHIFT_SIGNED_VALUE: return this.RIGHT_SHIFT_SIGNED;
			case this.RIGHT_SHIFT_UNSIGNED_VALUE: return this.RIGHT_SHIFT_UNSIGNED;
			case this.LESS_VALUE: return this.LESS;
			case this.GREATER_VALUE: return this.GREATER;
			case this.LESS_EQUALS_VALUE: return this.LESS_EQUALS;
			case this.GREATER_EQUALS_VALUE: return this.GREATER_EQUALS;
			case this.EQUALS_VALUE: return this.EQUALS;
			case this.NOT_EQUALS_VALUE: return this.NOT_EQUALS;
			case this.XOR_VALUE: return this.XOR;
			case this.AND_VALUE: return this.AND;
			case this.OR_VALUE: return this.OR;
			case this.CONDITIONAL_AND_VALUE: return this.CONDITIONAL_AND;
			case this.CONDITIONAL_OR_VALUE: return this.CONDITIONAL_OR;
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
