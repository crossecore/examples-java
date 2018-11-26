import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {ASTNode} from "./ASTNode";
import {MethodRefParameter} from "./MethodRefParameter";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";

export interface MethodRef
extends ASTNode

{
	
	method:AbstractMethodDeclaration;
	qualifier:TypeAccess;
	parameters: OrderedSet<MethodRefParameter>;
	

}

