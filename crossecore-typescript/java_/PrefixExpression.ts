import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Expression} from "./Expression";
import {PrefixExpressionKind} from "./PrefixExpressionKind";

export interface PrefixExpression
extends Expression

{
	operator:PrefixExpressionKind;
	
	operand:Expression;
	

}

