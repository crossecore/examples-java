import {Set} from "ecore/Set";
import {Comment} from "./Comment";
import {CommentBase} from "./CommentBase";
/* import Ecore*/
export class CommentImpl
extends CommentBase
{
	public static allInstances_:Set<Comment> = new Set<Comment>();
	//implement your generated class here
}
