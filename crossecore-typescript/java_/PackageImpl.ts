import {Set} from "ecore/Set";
import {PackageBase} from "./PackageBase";
import {Package} from "./Package";
/* import Ecore*/
export class PackageImpl
extends PackageBase
{
	public static allInstances_:Set<Package> = new Set<Package>();
	//implement your generated class here
}
