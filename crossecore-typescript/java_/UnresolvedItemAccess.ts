import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {UnresolvedItem} from "./UnresolvedItem";
import {ASTNode} from "./ASTNode";
import {NamespaceAccess} from "./NamespaceAccess";

export interface UnresolvedItemAccess
extends Expression,
NamespaceAccess

{
	
	element:UnresolvedItem;
	qualifier:ASTNode;
	

}

