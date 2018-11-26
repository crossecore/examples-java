import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {AnnotationMemberValuePair} from "./AnnotationMemberValuePair";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";

export interface Annotation
extends Expression

{
	
	type:TypeAccess;
	values: OrderedSet<AnnotationMemberValuePair>;
	

}

