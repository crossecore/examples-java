import {Set} from "ecore/Set";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface SuperConstructorInvocation
extends Statement,
AbstractMethodInvocation

{
	
	expression:Expression;
	

}

