import {Set} from "ecore/Set";
import {VariableDeclaration} from "./VariableDeclaration";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";

export interface VariableDeclarationFragment
extends VariableDeclaration

{
	
	variablesContainer:AbstractVariablesContainer;
	

}

