import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {VariableDeclaration} from "./VariableDeclaration";

export interface SingleVariableAccess
extends Expression

{
	
	variable:VariableDeclaration;
	qualifier:Expression;
	

}

