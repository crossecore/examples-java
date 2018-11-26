import {OrderedSet} from "ecore/OrderedSet";
import {Expression} from "./Expression";

export interface ArrayInitializer
extends Expression

{
	
	expressions: OrderedSet<Expression>;
	

}

