import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {InternalEObject} from "ecore/InternalEObject";
import {CompilationUnit} from "./CompilationUnit";
import {Comment} from "./Comment";
import {ClassFile} from "./ClassFile";

export interface ASTNode
extends InternalEObject

{
	
	comments: OrderedSet<Comment>;
	originalCompilationUnit:CompilationUnit;
	originalClassFile:ClassFile;
	

}

