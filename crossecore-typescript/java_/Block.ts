import {OrderedSet} from "ecore/OrderedSet";
import {Statement} from "./Statement";

export interface Block
extends Statement

{
	
	statements: OrderedSet<Statement>;
	

}

