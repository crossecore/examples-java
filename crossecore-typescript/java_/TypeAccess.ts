import {Set} from "ecore/Set";
import {Type} from "./Type";
import {Expression} from "./Expression";
import {NamespaceAccess} from "./NamespaceAccess";

export interface TypeAccess
extends Expression,
NamespaceAccess

{
	
	type:Type;
	qualifier:NamespaceAccess;
	

}

