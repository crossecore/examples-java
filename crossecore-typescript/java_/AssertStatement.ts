import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface AssertStatement
extends Statement

{
	
	message:Expression;
	expression:Expression;
	

}

