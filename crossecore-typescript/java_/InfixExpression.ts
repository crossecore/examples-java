import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {InfixExpressionKind} from "./InfixExpressionKind";
import {Expression} from "./Expression";

export interface InfixExpression
extends Expression

{
	operator:InfixExpressionKind;
	
	rightOperand:Expression;
	leftOperand:Expression;
	extendedOperands: OrderedSet<Expression>;
	

}

