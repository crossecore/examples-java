import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";

export interface AbstractTypeQualifiedExpression
extends Expression

{
	
	qualifier:TypeAccess;
	

}

