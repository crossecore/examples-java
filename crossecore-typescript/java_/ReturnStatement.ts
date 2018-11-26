import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface ReturnStatement
extends Statement

{
	
	expression:Expression;
	

}

