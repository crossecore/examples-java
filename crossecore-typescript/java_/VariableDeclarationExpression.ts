import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";
import {Modifier} from "./Modifier";
import {Annotation} from "./Annotation";

export interface VariableDeclarationExpression
extends Expression,
AbstractVariablesContainer

{
	
	modifier:Modifier;
	annotations: OrderedSet<Annotation>;
	

}

