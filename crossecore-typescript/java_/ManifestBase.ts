import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ManifestEntry} from "./ManifestEntry";
import {ManifestAttribute} from "./ManifestAttribute";
import {Manifest} from "./Manifest";
		
			export class ManifestBase
			extends BasicEObjectImpl
			implements Manifest
			{
				private _mainAttributes:Set<ManifestAttribute> = null;
				
				get mainAttributes():Set<ManifestAttribute>{
					if(this._mainAttributes===null){
						this._mainAttributes = new Set<ManifestAttribute>(this, Java_PackageLiterals.MANIFEST_MAINATTRIBUTES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MANIFEST_MAINATTRIBUTES);
							
					}
					return this._mainAttributes;
					
				}
				
				
				private _entryAttributes:Set<ManifestEntry> = null;
				
				get entryAttributes():Set<ManifestEntry>{
					if(this._entryAttributes===null){
						this._entryAttributes = new Set<ManifestEntry>(this, Java_PackageLiterals.MANIFEST_ENTRYATTRIBUTES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.MANIFEST_ENTRYATTRIBUTES);
							
					}
					return this._entryAttributes;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ManifestBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.MANIFEST_MAINATTRIBUTES:
							return this.mainAttributes;
						case Java_PackageLiterals.MANIFEST_ENTRYATTRIBUTES:
							return this.entryAttributes;
					}
					//return this.eGetFromBasicEObjectImpl(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.MANIFEST_MAINATTRIBUTES:
							this.mainAttributes.clear();
							this.mainAttributes.addAll(newValue);
							return;
						case Java_PackageLiterals.MANIFEST_ENTRYATTRIBUTES:
							this.entryAttributes.clear();
							this.entryAttributes.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
