import {Set} from "ecore/Set";
import {ClassDeclaration} from "./ClassDeclaration";
import {ClassDeclarationBase} from "./ClassDeclarationBase";
/* import Ecore*/
export class ClassDeclarationImpl
extends ClassDeclarationBase
{
	public static allInstances_:Set<ClassDeclaration> = new Set<ClassDeclaration>();
	//implement your generated class here
}
