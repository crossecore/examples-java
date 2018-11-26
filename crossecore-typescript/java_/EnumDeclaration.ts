import {OrderedSet} from "ecore/OrderedSet";
import {EnumConstantDeclaration} from "./EnumConstantDeclaration";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface EnumDeclaration
extends AbstractTypeDeclaration

{
	
	enumConstants: OrderedSet<EnumConstantDeclaration>;
	

}

