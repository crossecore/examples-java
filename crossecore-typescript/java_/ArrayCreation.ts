import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";
import {ArrayInitializer} from "./ArrayInitializer";

export interface ArrayCreation
extends Expression

{
	
	dimensions: OrderedSet<Expression>;
	initializer:ArrayInitializer;
	type:TypeAccess;
	

}

