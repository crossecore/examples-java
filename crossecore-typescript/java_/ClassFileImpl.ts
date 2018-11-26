import {ClassFileBase} from "./ClassFileBase";
import {Set} from "ecore/Set";
import {ClassFile} from "./ClassFile";
/* import Ecore*/
export class ClassFileImpl
extends ClassFileBase
{
	public static allInstances_:Set<ClassFile> = new Set<ClassFile>();
	//implement your generated class here
}
