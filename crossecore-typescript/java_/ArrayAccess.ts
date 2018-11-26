import {Set} from "ecore/Set";
import {Expression} from "./Expression";

export interface ArrayAccess
extends Expression

{
	
	array:Expression;
	index:Expression;
	

}

