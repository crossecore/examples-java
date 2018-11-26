import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {ASTNode} from "./ASTNode";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";

export interface AbstractMethodInvocation
extends ASTNode

{
	
	method:AbstractMethodDeclaration;
	arguments_: OrderedSet<Expression>;
	typeArguments: OrderedSet<TypeAccess>;
	

}

