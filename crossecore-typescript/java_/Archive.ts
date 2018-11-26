import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {ClassFile} from "./ClassFile";
import {Manifest} from "./Manifest";
import {NamedElement} from "./NamedElement";

export interface Archive
extends NamedElement

{
	originalFilePath:string;
	
	classFiles: Set<ClassFile>;
	manifest:Manifest;
	

}

