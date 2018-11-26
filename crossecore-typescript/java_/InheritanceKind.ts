    export class InheritanceKind
    {
    	
		public static readonly NONE_VALUE:number = 1;
		public static readonly ABSTRACT_VALUE:number = 2;
		public static readonly FINAL_VALUE:number = 3;
		
		public static NONE:InheritanceKind = new InheritanceKind(1, "none", "none");
		public static ABSTRACT:InheritanceKind = new InheritanceKind(2, "abstract", "abstract");
		public static FINAL:InheritanceKind = new InheritanceKind(3, "final", "final");

		private static VALUES_ARRAY:Array<InheritanceKind> = [
			InheritanceKind.NONE, 
			InheritanceKind.ABSTRACT, 
			InheritanceKind.FINAL
		];

        public static get_string(literal:string):InheritanceKind
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

        public static getByName(name:string):InheritanceKind
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

        public static get_number(value:number):InheritanceKind
        {
            switch (value)
            {
			case this.NONE_VALUE: return this.NONE;
			case this.ABSTRACT_VALUE: return this.ABSTRACT;
			case this.FINAL_VALUE: return this.FINAL;
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
