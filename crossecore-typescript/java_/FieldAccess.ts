import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {SingleVariableAccess} from "./SingleVariableAccess";

export interface FieldAccess
extends Expression

{
	
	field:SingleVariableAccess;
	expression:Expression;
	

}

