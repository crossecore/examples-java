import {OrderedSet} from "ecore/OrderedSet";
import {Bag} from "ecore/Bag";
import {ASTNode} from "./ASTNode";

export interface TagElement
extends ASTNode

{
	tagName:string;
	
	fragments: OrderedSet<ASTNode>;
	

}

