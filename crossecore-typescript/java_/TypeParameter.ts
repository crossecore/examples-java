import {OrderedSet} from "ecore/OrderedSet";
import {Type} from "./Type";
import {TypeAccess} from "./TypeAccess";

export interface TypeParameter
extends Type

{
	
	bounds: OrderedSet<TypeAccess>;
	

}

