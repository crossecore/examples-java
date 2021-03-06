import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {CompilationUnit} from "./CompilationUnit";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Type} from "./Type";
import {ClassFile} from "./ClassFile";
import {Archive} from "./Archive";
import {Model} from "./Model";
import {UnresolvedItem} from "./UnresolvedItem";
import {Package} from "./Package";
		
			export class ModelBase
			extends BasicEObjectImpl
			implements Model
			{
				private _name:string = '';
				get name():string{
					return this._name;
				}
				set name(value:string){
					this._name = value; 
				}
				private _ownedElements:Set<Package> = null;
				
				get ownedElements():Set<Package>{
					if(this._ownedElements===null){
						this._ownedElements = new Set<Package>(this, Java_PackageLiterals.MODEL_OWNEDELEMENTS, Java_PackageLiterals.PACKAGE_MODEL);
							
					}
					return this._ownedElements;
					
				}
				
				
				private _orphanTypes:Set<Type> = null;
				
				get orphanTypes():Set<Type>{
					if(this._orphanTypes===null){
						this._orphanTypes = new Set<Type>(this, Java_PackageLiterals.MODEL_ORPHANTYPES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MODEL_ORPHANTYPES);
							
					}
					return this._orphanTypes;
					
				}
				
				
				private _unresolvedItems:Set<UnresolvedItem> = null;
				
				get unresolvedItems():Set<UnresolvedItem>{
					if(this._unresolvedItems===null){
						this._unresolvedItems = new Set<UnresolvedItem>(this, Java_PackageLiterals.MODEL_UNRESOLVEDITEMS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MODEL_UNRESOLVEDITEMS);
							
					}
					return this._unresolvedItems;
					
				}
				
				
				private _compilationUnits:Set<CompilationUnit> = null;
				
				get compilationUnits():Set<CompilationUnit>{
					if(this._compilationUnits===null){
						this._compilationUnits = new Set<CompilationUnit>(this, Java_PackageLiterals.MODEL_COMPILATIONUNITS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MODEL_COMPILATIONUNITS);
							
					}
					return this._compilationUnits;
					
				}
				
				
				private _classFiles:Set<ClassFile> = null;
				
				get classFiles():Set<ClassFile>{
					if(this._classFiles===null){
						this._classFiles = new Set<ClassFile>(this, Java_PackageLiterals.MODEL_CLASSFILES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MODEL_CLASSFILES);
							
					}
					return this._classFiles;
					
				}
				
				
				private _archives:Set<Archive> = null;
				
				get archives():Set<Archive>{
					if(this._archives===null){
						this._archives = new Set<Archive>(this, Java_PackageLiterals.MODEL_ARCHIVES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MODEL_ARCHIVES);
							
					}
					return this._archives;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ModelBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.MODEL_OWNEDELEMENTS:
							return this.ownedElements.basicAdd(otherEnd as Package, msgs);
					}
					//return this.eInverseAddFromBasicEObjectImpl(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromModel = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.MODEL_OWNEDELEMENTS:
							return this.ownedElements.basicRemove(otherEnd as Package, msgs);
					}
					//return this.eInverseRemoveFromBasicEObjectImpl(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromModel = this.eInverseRemove;
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.MODEL_NAME:
							return this.name;
						case Java_PackageLiterals.MODEL_OWNEDELEMENTS:
							return this.ownedElements;
						case Java_PackageLiterals.MODEL_ORPHANTYPES:
							return this.orphanTypes;
						case Java_PackageLiterals.MODEL_UNRESOLVEDITEMS:
							return this.unresolvedItems;
						case Java_PackageLiterals.MODEL_COMPILATIONUNITS:
							return this.compilationUnits;
						case Java_PackageLiterals.MODEL_CLASSFILES:
							return this.classFiles;
						case Java_PackageLiterals.MODEL_ARCHIVES:
							return this.archives;
					}
					//return this.eGetFromBasicEObjectImpl(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.MODEL_NAME:
							this.name = <string> newValue;
							return;
						case Java_PackageLiterals.MODEL_OWNEDELEMENTS:
							this.ownedElements.clear();
							this.ownedElements.addAll(newValue);
							return;
						case Java_PackageLiterals.MODEL_ORPHANTYPES:
							this.orphanTypes.clear();
							this.orphanTypes.addAll(newValue);
							return;
						case Java_PackageLiterals.MODEL_UNRESOLVEDITEMS:
							this.unresolvedItems.clear();
							this.unresolvedItems.addAll(newValue);
							return;
						case Java_PackageLiterals.MODEL_COMPILATIONUNITS:
							this.compilationUnits.clear();
							this.compilationUnits.addAll(newValue);
							return;
						case Java_PackageLiterals.MODEL_CLASSFILES:
							this.classFiles.clear();
							this.classFiles.addAll(newValue);
							return;
						case Java_PackageLiterals.MODEL_ARCHIVES:
							this.archives.clear();
							this.archives.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
