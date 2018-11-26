import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Type} from "./Type";
import {TypeAccess} from "./TypeAccess";

export interface ParameterizedType
extends Type

{
	
	type:TypeAccess;
	typeArguments: OrderedSet<TypeAccess>;
	

}

