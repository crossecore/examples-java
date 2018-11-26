import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Expression} from "./Expression";
import {Statement} from "./Statement";

export interface SwitchCase
extends Statement

{
	default:boolean;
	
	expression:Expression;
	

}

