import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";

export interface CastExpression
extends Expression

{
	
	expression:Expression;
	type:TypeAccess;
	

}

