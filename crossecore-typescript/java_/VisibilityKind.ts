    export class VisibilityKind
    {
    	
		public static readonly NONE_VALUE:number = 1;
		public static readonly PUBLIC_VALUE:number = 2;
		public static readonly PRIVATE_VALUE:number = 3;
		public static readonly PROTECTED_VALUE:number = 4;
		
		public static NONE:VisibilityKind = new VisibilityKind(1, "none", "none");
		public static PUBLIC:VisibilityKind = new VisibilityKind(2, "public", "public");
		public static PRIVATE:VisibilityKind = new VisibilityKind(3, "private", "private");
		public static PROTECTED:VisibilityKind = new VisibilityKind(4, "protected", "protected");

		private static VALUES_ARRAY:Array<VisibilityKind> = [
			VisibilityKind.NONE, 
			VisibilityKind.PUBLIC, 
			VisibilityKind.PRIVATE, 
			VisibilityKind.PROTECTED
		];

        public static get_string(literal:string):VisibilityKind
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

        public static getByName(name:string):VisibilityKind
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

        public static get_number(value:number):VisibilityKind
        {
            switch (value)
            {
			case this.NONE_VALUE: return this.NONE;
			case this.PUBLIC_VALUE: return this.PUBLIC;
			case this.PRIVATE_VALUE: return this.PRIVATE;
			case this.PROTECTED_VALUE: return this.PROTECTED;
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
