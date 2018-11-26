import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {CompilationUnit} from "./CompilationUnit";
import {Type} from "./Type";
import {ClassFile} from "./ClassFile";
import {Archive} from "./Archive";
import {UnresolvedItem} from "./UnresolvedItem";
import {Package} from "./Package";

export interface Model
extends InternalEObject

{
	name:string;
	
	ownedElements: Set<Package>;
	orphanTypes: Set<Type>;
	unresolvedItems: Set<UnresolvedItem>;
	compilationUnits: Set<CompilationUnit>;
	classFiles: Set<ClassFile>;
	archives: Set<Archive>;
	

}

