import {Set} from "ecore/Set";
import {TypeAccess} from "./TypeAccess";
import {TypeDeclaration} from "./TypeDeclaration";

export interface ClassDeclaration
extends TypeDeclaration

{
	
	superClass:TypeAccess;
	

}

