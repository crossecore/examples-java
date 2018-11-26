import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {CompilationUnit} from "./CompilationUnit";
import {Package} from "./Package";
import {NamedElement} from "./NamedElement";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface ClassFile
extends NamedElement

{
	originalFilePath:string;
	
	type:AbstractTypeDeclaration;
	attachedSource:CompilationUnit;
	package:Package;
	

}

