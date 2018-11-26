import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Expression} from "./Expression";
import {AssignmentKind} from "./AssignmentKind";

export interface Assignment
extends Expression

{
	operator:AssignmentKind;
	
	leftHandSide:Expression;
	rightHandSide:Expression;
	

}

