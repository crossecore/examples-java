import {Set} from "ecore/Set";
import {LabeledStatement} from "./LabeledStatement";
import {Statement} from "./Statement";

export interface BreakStatement
extends Statement

{
	
	label:LabeledStatement;
	

}
