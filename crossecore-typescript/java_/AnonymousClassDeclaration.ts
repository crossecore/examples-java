import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {ClassInstanceCreation} from "./ClassInstanceCreation";
import {ASTNode} from "./ASTNode";
import {BodyDeclaration} from "./BodyDeclaration";

export interface AnonymousClassDeclaration
extends ASTNode

{
	
	bodyDeclarations: OrderedSet<BodyDeclaration>;
	classInstanceCreation:ClassInstanceCreation;
	

}

