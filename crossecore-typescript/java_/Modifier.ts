import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {VisibilityKind} from "./VisibilityKind";
import {InheritanceKind} from "./InheritanceKind";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {VariableDeclarationExpression} from "./VariableDeclarationExpression";
import {ASTNode} from "./ASTNode";
import {VariableDeclarationStatement} from "./VariableDeclarationStatement";
import {BodyDeclaration} from "./BodyDeclaration";

export interface Modifier
extends ASTNode

{
	visibility:VisibilityKind;
	inheritance:InheritanceKind;
	static:boolean;
	transient:boolean;
	volatile:boolean;
	native:boolean;
	strictfp:boolean;
	synchronized:boolean;
	
	bodyDeclaration:BodyDeclaration;
	singleVariableDeclaration:SingleVariableDeclaration;
	variableDeclarationStatement:VariableDeclarationStatement;
	variableDeclarationExpression:VariableDeclarationExpression;
	

}

