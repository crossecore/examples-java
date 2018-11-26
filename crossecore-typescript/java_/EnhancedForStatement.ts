import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";

export interface EnhancedForStatement
extends Statement

{
	
	body:Statement;
	expression:Expression;
	parameter:SingleVariableDeclaration;
	

}

