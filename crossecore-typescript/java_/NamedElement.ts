import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {ASTNode} from "./ASTNode";
import {ImportDeclaration} from "./ImportDeclaration";

export interface NamedElement
extends ASTNode

{
	name:string;
	proxy:boolean;
	
	usagesInImports: Set<ImportDeclaration>;
	

}

