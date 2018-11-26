import {Set} from "ecore/Set";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {Expression} from "./Expression";

export interface MethodInvocation
extends Expression,
AbstractMethodInvocation

{
	
	expression:Expression;
	

}

