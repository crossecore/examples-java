import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Comment} from "./Comment";
import {Type} from "./Type";
import {TypeAccess} from "./TypeAccess";
import {BodyDeclaration} from "./BodyDeclaration";
import {Package} from "./Package";

export interface AbstractTypeDeclaration
extends BodyDeclaration,
Type

{
	
	bodyDeclarations: OrderedSet<BodyDeclaration>;
	commentsBeforeBody: OrderedSet<Comment>;
	commentsAfterBody: OrderedSet<Comment>;
	package:Package;
	superInterfaces: OrderedSet<TypeAccess>;
	

}

