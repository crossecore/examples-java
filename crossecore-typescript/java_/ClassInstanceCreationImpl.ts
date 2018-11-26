import {Set} from "ecore/Set";
import {ClassInstanceCreationBase} from "./ClassInstanceCreationBase";
import {ClassInstanceCreation} from "./ClassInstanceCreation";
/* import Ecore*/
export class ClassInstanceCreationImpl
extends ClassInstanceCreationBase
{
	public static allInstances_:Set<ClassInstanceCreation> = new Set<ClassInstanceCreation>();
	//implement your generated class here
}
