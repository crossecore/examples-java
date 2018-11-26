import {Set} from "ecore/Set";
import {PackageAccess} from "./PackageAccess";
import {Model} from "./Model";
import {Package} from "./Package";
import {NamedElement} from "./NamedElement";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";

export interface Package
extends NamedElement

{
	
	ownedElements: Set<AbstractTypeDeclaration>;
	model:Model;
	ownedPackages: Set<Package>;
	package:Package;
	usagesInPackageAccess: Set<PackageAccess>;
	

}

