    export class PostfixExpressionKind
    {
    	
		public static readonly INCREMENT_VALUE:number = 1;
		public static readonly DECREMENT_VALUE:number = 2;
		
		public static INCREMENT:PostfixExpressionKind = new PostfixExpressionKind(1, "INCREMENT", "++");
		public static DECREMENT:PostfixExpressionKind = new PostfixExpressionKind(2, "DECREMENT", "--");

		private static VALUES_ARRAY:Array<PostfixExpressionKind> = [
			PostfixExpressionKind.INCREMENT, 
			PostfixExpressionKind.DECREMENT
		];

        public static get_string(literal:string):PostfixExpressionKind
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

        public static getByName(name:string):PostfixExpressionKind
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

        public static get_number(value:number):PostfixExpressionKind
        {
            switch (value)
            {
			case this.INCREMENT_VALUE: return this.INCREMENT;
			case this.DECREMENT_VALUE: return this.DECREMENT;
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
