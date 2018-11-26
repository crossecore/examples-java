import {Set} from "ecore/Set";
import {BreakStatement} from "./BreakStatement";
import {Statement} from "./Statement";
import {NamedElement} from "./NamedElement";
import {ContinueStatement} from "./ContinueStatement";

export interface LabeledStatement
extends NamedElement,
Statement

{
	
	body:Statement;
	usagesInBreakStatements: Set<BreakStatement>;
	usagesInContinueStatements: Set<ContinueStatement>;
	

}

