import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";

export interface TypeLiteral
extends Expression

{
	
	type:TypeAccess;
	

}

