import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {TypeParameter} from "./TypeParameter";
import {MethodRef} from "./MethodRef";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {Block} from "./Block";
import {TypeAccess} from "./TypeAccess";
import {BodyDeclaration} from "./BodyDeclaration";

export interface AbstractMethodDeclaration
extends BodyDeclaration

{
	
	body:Block;
	parameters: OrderedSet<SingleVariableDeclaration>;
	thrownExceptions: OrderedSet<TypeAccess>;
	typeParameters: OrderedSet<TypeParameter>;
	usagesInDocComments: Set<MethodRef>;
	usages: Set<AbstractMethodInvocation>;
	

}

