import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Expression} from "./Expression";
import {SingleVariableAccess} from "./SingleVariableAccess";
import {NamedElement} from "./NamedElement";

export interface VariableDeclaration
extends NamedElement

{
	extraArrayDimensions:number;
	
	initializer:Expression;
	usageInVariableAccess: Set<SingleVariableAccess>;
	

}

