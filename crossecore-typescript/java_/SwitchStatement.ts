import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface SwitchStatement
extends Statement

{
	
	expression:Expression;
	statements: OrderedSet<Statement>;
	

}

