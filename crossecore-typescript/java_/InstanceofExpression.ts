import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";

export interface InstanceofExpression
extends Expression

{
	
	rightOperand:TypeAccess;
	leftOperand:Expression;
	

}

