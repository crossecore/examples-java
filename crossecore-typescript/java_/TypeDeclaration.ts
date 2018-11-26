import {OrderedSet} from "ecore/OrderedSet";
import {TypeParameter} from "./TypeParameter";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface TypeDeclaration
extends AbstractTypeDeclaration

{
	
	typeParameters: OrderedSet<TypeParameter>;
	

}

