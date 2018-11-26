import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface ForStatement
extends Statement

{
	
	expression:Expression;
	updaters: OrderedSet<Expression>;
	initializers: OrderedSet<Expression>;
	body:Statement;
	

}

