import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {Type} from "./Type";
import {TypeAccess} from "./TypeAccess";

export interface WildCardType
extends Type

{
	upperBound:boolean;
	
	bound:TypeAccess;
	

}

