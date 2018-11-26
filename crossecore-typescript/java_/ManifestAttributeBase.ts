import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ManifestAttribute} from "./ManifestAttribute";
		
			export class ManifestAttributeBase
			extends BasicEObjectImpl
			implements ManifestAttribute
			{
				private _key:string = '';
				get key():string{
					return this._key;
				}
				set key(value:string){
					this._key = value; 
				}
				private _value:string = '';
				get value():string{
					return this._value;
				}
				set value(value:string){
					this._value = value; 
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ManifestAttributeBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.MANIFESTATTRIBUTE_KEY:
							return this.key;
						case Java_PackageLiterals.MANIFESTATTRIBUTE_VALUE:
							return this.value;
					}
					//return this.eGetFromBasicEObjectImpl(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.MANIFESTATTRIBUTE_KEY:
							this.key = <string> newValue;
							return;
						case Java_PackageLiterals.MANIFESTATTRIBUTE_VALUE:
							this.value = <string> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
