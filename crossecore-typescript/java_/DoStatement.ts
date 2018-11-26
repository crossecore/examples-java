import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface DoStatement
extends Statement

{
	
	expression:Expression;
	body:Statement;
	

}

