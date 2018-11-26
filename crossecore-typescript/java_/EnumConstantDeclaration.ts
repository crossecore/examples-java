import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {BodyDeclaration} from "./BodyDeclaration";
import {VariableDeclaration} from "./VariableDeclaration";

export interface EnumConstantDeclaration
extends BodyDeclaration,
VariableDeclaration

{
	
	anonymousClassDeclaration:AnonymousClassDeclaration;
	arguments_: OrderedSet<Expression>;
	

}

