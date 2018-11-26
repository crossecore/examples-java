import {Set} from "ecore/Set";
import {AnnotationTypeMemberDeclaration} from "./AnnotationTypeMemberDeclaration";
import {Expression} from "./Expression";
import {NamedElement} from "./NamedElement";

export interface AnnotationMemberValuePair
extends NamedElement

{
	
	member:AnnotationTypeMemberDeclaration;
	value:Expression;
	

}

