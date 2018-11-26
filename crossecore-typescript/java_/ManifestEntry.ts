import {Set} from "ecore/Set";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {ManifestAttribute} from "./ManifestAttribute";

export interface ManifestEntry
extends InternalEObject

{
	name:string;
	
	attributes: Set<ManifestAttribute>;
	

}

