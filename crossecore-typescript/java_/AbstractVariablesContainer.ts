import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {VariableDeclarationFragment} from "./VariableDeclarationFragment";
import {ASTNode} from "./ASTNode";
import {TypeAccess} from "./TypeAccess";

export interface AbstractVariablesContainer
extends ASTNode

{
	
	type:TypeAccess;
	fragments: OrderedSet<VariableDeclarationFragment>;
	

}

