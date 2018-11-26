import {Set} from "ecore/Set";
import {Statement} from "./Statement";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {Block} from "./Block";

export interface CatchClause
extends Statement

{
	
	exception:SingleVariableDeclaration;
	body:Block;
	

}

