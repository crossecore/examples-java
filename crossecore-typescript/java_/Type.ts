import {Set} from "ecore/Set";
import {TypeAccess} from "./TypeAccess";
import {NamedElement} from "./NamedElement";

export interface Type
extends NamedElement

{
	
	usagesInTypeAccess: Set<TypeAccess>;
	

}

