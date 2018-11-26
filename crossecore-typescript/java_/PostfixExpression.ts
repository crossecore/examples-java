import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Expression} from "./Expression";
import {PostfixExpressionKind} from "./PostfixExpressionKind";

export interface PostfixExpression
extends Expression

{
	operator:PostfixExpressionKind;
	
	operand:Expression;
	

}

