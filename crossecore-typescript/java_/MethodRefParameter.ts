import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {ASTNode} from "./ASTNode";
import {TypeAccess} from "./TypeAccess";

export interface MethodRefParameter
extends ASTNode

{
	name:string;
	varargs:boolean;
	
	type:TypeAccess;
	

}

