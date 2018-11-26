import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface IfStatement
extends Statement

{
	
	expression:Expression;
	thenStatement:Statement;
	elseStatement:Statement;
	

}

