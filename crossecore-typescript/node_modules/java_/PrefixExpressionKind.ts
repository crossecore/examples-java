    export class PrefixExpressionKind
    {
    	
		public static readonly INCREMENT_VALUE:number = 1;
		public static readonly DECREMENT_VALUE:number = 2;
		public static readonly PLUS_VALUE:number = 3;
		public static readonly MINUS_VALUE:number = 4;
		public static readonly COMPLEMENT_VALUE:number = 5;
		public static readonly NOT_VALUE:number = 6;
		
		public static INCREMENT:PrefixExpressionKind = new PrefixExpressionKind(1, "INCREMENT", "++");
		public static DECREMENT:PrefixExpressionKind = new PrefixExpressionKind(2, "DECREMENT", "--");
		public static PLUS:PrefixExpressionKind = new PrefixExpressionKind(3, "PLUS", "+");
		public static MINUS:PrefixExpressionKind = new PrefixExpressionKind(4, "MINUS", "-");
		public static COMPLEMENT:PrefixExpressionKind = new PrefixExpressionKind(5, "COMPLEMENT", "~");
		public static NOT:PrefixExpressionKind = new PrefixExpressionKind(6, "NOT", "!");

		private static VALUES_ARRAY:Array<PrefixExpressionKind> = [
			PrefixExpressionKind.INCREMENT, 
			PrefixExpressionKind.DECREMENT, 
			PrefixExpressionKind.PLUS, 
			PrefixExpressionKind.MINUS, 
			PrefixExpressionKind.COMPLEMENT, 
			PrefixExpressionKind.NOT
		];

        public static get_string(literal:string):PrefixExpressionKind
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

        public static getByName(name:string):PrefixExpressionKind
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

        public static get_number(value:number):PrefixExpressionKind
        {
            switch (value)
            {
			case this.INCREMENT_VALUE: return this.INCREMENT;
			case this.DECREMENT_VALUE: return this.DECREMENT;
			case this.PLUS_VALUE: return this.PLUS;
			case this.MINUS_VALUE: return this.MINUS;
			case this.COMPLEMENT_VALUE: return this.COMPLEMENT;
			case this.NOT_VALUE: return this.NOT;
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
