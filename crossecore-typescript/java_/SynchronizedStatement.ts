import {Set} from "ecore/Set";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {Block} from "./Block";

export interface SynchronizedStatement
extends Statement

{
	
	body:Block;
	expression:Expression;
	

}

