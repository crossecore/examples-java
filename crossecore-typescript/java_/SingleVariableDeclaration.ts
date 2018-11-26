import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {TypeAccess} from "./TypeAccess";
import {VariableDeclaration} from "./VariableDeclaration";
import {EnhancedForStatement} from "./EnhancedForStatement";
import {CatchClause} from "./CatchClause";
import {Modifier} from "./Modifier";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
import {Annotation} from "./Annotation";

export interface SingleVariableDeclaration
extends VariableDeclaration

{
	varargs:boolean;
	
	modifier:Modifier;
	type:TypeAccess;
	annotations: OrderedSet<Annotation>;
	methodDeclaration:AbstractMethodDeclaration;
	catchClause:CatchClause;
	enhancedForStatement:EnhancedForStatement;
	

}

