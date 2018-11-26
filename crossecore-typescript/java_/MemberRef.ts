import {Set} from "ecore/Set";
import {ASTNode} from "./ASTNode";
import {TypeAccess} from "./TypeAccess";
import {NamedElement} from "./NamedElement";

export interface MemberRef
extends ASTNode

{
	
	member:NamedElement;
	qualifier:TypeAccess;
	

}

