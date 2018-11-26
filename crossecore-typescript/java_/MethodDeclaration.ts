import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {MethodDeclaration} from "./MethodDeclaration";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";

export interface MethodDeclaration
extends AbstractMethodDeclaration

{
	extraArrayDimensions:number;
	
	returnType:TypeAccess;
	redefinedMethodDeclaration:MethodDeclaration;
	redefinitions: Set<MethodDeclaration>;
	

}

