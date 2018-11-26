import {Set} from "ecore/Set";
import {Expression} from "./Expression";

export interface ConditionalExpression
extends Expression

{
	
	elseExpression:Expression;
	expression:Expression;
	thenExpression:Expression;
	

}

