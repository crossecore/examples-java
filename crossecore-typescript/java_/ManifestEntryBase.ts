import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ManifestEntry} from "./ManifestEntry";
import {ManifestAttribute} from "./ManifestAttribute";
		
			export class ManifestEntryBase
			extends BasicEObjectImpl
			implements ManifestEntry
			{
				private _name:string = '';
				get name():string{
					return this._name;
				}
				set name(value:string){
					this._name = value; 
				}
				private _attributes:Set<ManifestAttribute> = null;
				
				get attributes():Set<ManifestAttribute>{
					if(this._attributes===null){
						this._attributes = new Set<ManifestAttribute>(this, Java_PackageLiterals.MANIFESTENTRY_ATTRIBUTES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MANIFESTENTRY_ATTRIBUTES);
							
					}
					return this._attributes;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ManifestEntryBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.MANIFESTENTRY_NAME:
							return this.name;
						case Java_PackageLiterals.MANIFESTENTRY_ATTRIBUTES:
							return this.attributes;
					}
					//return this.eGetFromBasicEObjectImpl(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.MANIFESTENTRY_NAME:
							this.name = <string> newValue;
							return;
						case Java_PackageLiterals.MANIFESTENTRY_ATTRIBUTES:
							this.attributes.clear();
							this.attributes.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
