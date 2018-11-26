import {Set} from "ecore/Set";
import {AnnotationMemberValuePair} from "./AnnotationMemberValuePair";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";
import {BodyDeclaration} from "./BodyDeclaration";

export interface AnnotationTypeMemberDeclaration
extends BodyDeclaration

{
	
	default:Expression;
	type:TypeAccess;
	usages: Set<AnnotationMemberValuePair>;
	

}

