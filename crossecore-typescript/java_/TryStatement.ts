import {OrderedSet} from "ecore/OrderedSet";
import {Set} from "ecore/Set";
import {Statement} from "./Statement";
import {Block} from "./Block";
import {CatchClause} from "./CatchClause";

export interface TryStatement
extends Statement

{
	
	body:Block;
	finally:Block;
	catchClauses: OrderedSet<CatchClause>;
	

}

