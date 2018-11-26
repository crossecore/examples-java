import {OrderedSet} from "ecore/OrderedSet";
import {Comment} from "./Comment";
import {TagElement} from "./TagElement";

export interface Javadoc
extends Comment

{
	
	tags: OrderedSet<TagElement>;
	

}

