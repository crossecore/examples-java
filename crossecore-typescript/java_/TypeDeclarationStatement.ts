import {Set} from "ecore/Set";
import {Statement} from "./Statement";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface TypeDeclarationStatement
extends Statement

{
	
	declaration:AbstractTypeDeclaration;
	

}

