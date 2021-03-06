import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {PackageAccess} from "./PackageAccess";
import {Model} from "./Model";
import {NamedElementImpl} from "./NamedElementImpl";
import {Package} from "./Package";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
		
			export class PackageBase
			extends NamedElementImpl
			implements Package
			{
				private _ownedElements:Set<AbstractTypeDeclaration> = null;
				
				get ownedElements():Set<AbstractTypeDeclaration>{
					if(this._ownedElements===null){
						this._ownedElements = new Set<AbstractTypeDeclaration>(this, Java_PackageLiterals.PACKAGE_OWNEDELEMENTS, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE);
							
					}
					return this._ownedElements;
					
				}
				
				
				get model():Model{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.PACKAGE_MODEL) return null;
					return this.eInternalContainer() as Model;
				}
				set model(value:Model) {
					if (value != this.eInternalContainer() as Model) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as Model != null){
							msgs = (this.eInternalContainer() as Model).eInverseRemove(this, Java_PackageLiterals.MODEL_OWNEDELEMENTS, /*Package*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.MODEL_OWNEDELEMENTS, /*Package*/ null, msgs);
						}
						msgs = this.basicSetModel(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PACKAGE_MODEL , value, value));
					}
				}
				private _ownedPackages:Set<Package> = null;
				
				get ownedPackages():Set<Package>{
					if(this._ownedPackages===null){
						this._ownedPackages = new Set<Package>(this, Java_PackageLiterals.PACKAGE_OWNEDPACKAGES, Java_PackageLiterals.PACKAGE_PACKAGE);
							
					}
					return this._ownedPackages;
					
				}
				
				
				get package():Package{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.PACKAGE_PACKAGE) return null;
					return this.eInternalContainer() as Package;
				}
				set package(value:Package) {
					if (value != this.eInternalContainer() as Package) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as Package != null){
							msgs = (this.eInternalContainer() as Package).eInverseRemove(this, Java_PackageLiterals.PACKAGE_OWNEDPACKAGES, /*Package*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.PACKAGE_OWNEDPACKAGES, /*Package*/ null, msgs);
						}
						msgs = this.basicSetPackage(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PACKAGE_PACKAGE , value, value));
					}
				}
				private _usagesInPackageAccess:Set<PackageAccess> = null;
				
				get usagesInPackageAccess():Set<PackageAccess>{
					if(this._usagesInPackageAccess===null){
						this._usagesInPackageAccess = new Set<PackageAccess>(this, Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS, Java_PackageLiterals.PACKAGEACCESS_PACKAGE);
							
					}
					return this._usagesInPackageAccess;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return PackageBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.PACKAGE_MODEL:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetModel(otherEnd as Model, msgs);
						case Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS:
							return this.usagesInPackageAccess.basicAdd(otherEnd as PackageAccess, msgs);
						case Java_PackageLiterals.PACKAGE_OWNEDPACKAGES:
							return this.ownedPackages.basicAdd(otherEnd as Package, msgs);
						case Java_PackageLiterals.PACKAGE_OWNEDELEMENTS:
							return this.ownedElements.basicAdd(otherEnd as AbstractTypeDeclaration, msgs);
						case Java_PackageLiterals.PACKAGE_PACKAGE:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetPackage(otherEnd as Package, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromPackage = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.PACKAGE_MODEL:
							return this.basicSetModel(null, msgs);
						case Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS:
							return this.usagesInPackageAccess.basicRemove(otherEnd as PackageAccess, msgs);
						case Java_PackageLiterals.PACKAGE_OWNEDPACKAGES:
							return this.ownedPackages.basicRemove(otherEnd as Package, msgs);
						case Java_PackageLiterals.PACKAGE_OWNEDELEMENTS:
							return this.ownedElements.basicRemove(otherEnd as AbstractTypeDeclaration, msgs);
						case Java_PackageLiterals.PACKAGE_PACKAGE:
							return this.basicSetPackage(null, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromPackage = this.eInverseRemove;
			
				public basicSetModel(newobj:Model, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.PACKAGE_MODEL, msgs);
						return msgs;
				}
				public basicSetPackage(newobj:Package, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.PACKAGE_PACKAGE, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.PACKAGE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PACKAGE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PACKAGE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PACKAGE_NAME:
							return this.name;
						case Java_PackageLiterals.PACKAGE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.PACKAGE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.PACKAGE_OWNEDELEMENTS:
							return this.ownedElements;
						case Java_PackageLiterals.PACKAGE_MODEL:
							return this.model;
						case Java_PackageLiterals.PACKAGE_OWNEDPACKAGES:
							return this.ownedPackages;
						case Java_PackageLiterals.PACKAGE_PACKAGE:
							return this.package;
						case Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS:
							return this.usagesInPackageAccess;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.PACKAGE_OWNEDELEMENTS:
							this.ownedElements.clear();
							this.ownedElements.addAll(newValue);
							return;
						case Java_PackageLiterals.PACKAGE_MODEL:
							this.model = <Model> newValue;
							return;
						case Java_PackageLiterals.PACKAGE_OWNEDPACKAGES:
							this.ownedPackages.clear();
							this.ownedPackages.addAll(newValue);
							return;
						case Java_PackageLiterals.PACKAGE_PACKAGE:
							this.package = <Package> newValue;
							return;
						case Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS:
							this.usagesInPackageAccess.clear();
							this.usagesInPackageAccess.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
