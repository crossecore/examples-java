import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Statement} from "./Statement";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";
import {Modifier} from "./Modifier";
import {Annotation} from "./Annotation";

export interface VariableDeclarationStatement
extends Statement,
AbstractVariablesContainer

{
	extraArrayDimensions:number;
	
	modifier:Modifier;
	annotations: OrderedSet<Annotation>;
	

}

