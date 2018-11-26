import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface ExpressionStatement
extends Statement

{
	
	expression:Expression;
	

}

