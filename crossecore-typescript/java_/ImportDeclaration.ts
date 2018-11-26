import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {ASTNode} from "./ASTNode";
import {NamedElement} from "./NamedElement";

export interface ImportDeclaration
extends ASTNode

{
	static:boolean;
	
	importedElement:NamedElement;
	

}

