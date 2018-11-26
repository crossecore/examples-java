import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface WhileStatement
extends Statement

{
	
	expression:Expression;
	body:Statement;
	

}

