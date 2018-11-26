import {Set} from "ecore/Set";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {Expression} from "./Expression";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {TypeAccess} from "./TypeAccess";

export interface ClassInstanceCreation
extends Expression,
AbstractMethodInvocation

{
	
	anonymousClassDeclaration:AnonymousClassDeclaration;
	expression:Expression;
	type:TypeAccess;
	

}

