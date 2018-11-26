import {Bag} from "ecore/Bag";
import {ASTNode} from "./ASTNode";

export interface Comment
extends ASTNode

{
	content:string;
	enclosedByParent:boolean;
	prefixOfParent:boolean;
	
	

}

