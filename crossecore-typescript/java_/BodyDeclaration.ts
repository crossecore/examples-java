import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {NamedElement} from "./NamedElement";
import {Modifier} from "./Modifier";
import {Annotation} from "./Annotation";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface BodyDeclaration
extends NamedElement

{
	
	abstractTypeDeclaration:AbstractTypeDeclaration;
	annotations: OrderedSet<Annotation>;
	anonymousClassDeclarationOwner:AnonymousClassDeclaration;
	modifier:Modifier;
	

}

