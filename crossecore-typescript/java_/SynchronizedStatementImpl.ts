import {Set} from "ecore/Set";
import {SynchronizedStatementBase} from "./SynchronizedStatementBase";
import {SynchronizedStatement} from "./SynchronizedStatement";
/* import Ecore*/
export class SynchronizedStatementImpl
extends SynchronizedStatementBase
{
	public static allInstances_:Set<SynchronizedStatement> = new Set<SynchronizedStatement>();
	//implement your generated class here
}
