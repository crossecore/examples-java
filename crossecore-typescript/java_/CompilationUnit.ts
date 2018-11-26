import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Comment} from "./Comment";
import {ImportDeclaration} from "./ImportDeclaration";
import {Package} from "./Package";
import {NamedElement} from "./NamedElement";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface CompilationUnit
extends NamedElement

{
	originalFilePath:string;
	
	commentList: OrderedSet<Comment>;
	imports: OrderedSet<ImportDeclaration>;
	package:Package;
	types: OrderedSet<AbstractTypeDeclaration>;
	

}

