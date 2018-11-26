import {Set} from "ecore/Set";
import {PackageAccess} from "./PackageAccess";
import {NamespaceAccess} from "./NamespaceAccess";
import {Package} from "./Package";

export interface PackageAccess
extends NamespaceAccess

{
	
	package:Package;
	qualifier:PackageAccess;
	

}

