import {Set} from "ecore/Set";
import {InternalEObject} from "ecore/InternalEObject";
import {ManifestEntry} from "./ManifestEntry";
import {ManifestAttribute} from "./ManifestAttribute";

export interface Manifest
extends InternalEObject

{
	
	mainAttributes: Set<ManifestAttribute>;
	entryAttributes: Set<ManifestEntry>;
	

}

