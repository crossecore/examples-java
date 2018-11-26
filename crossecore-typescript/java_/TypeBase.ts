import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Type} from "./Type";
import {TypeAccess} from "./TypeAccess";
import {NamedElementImpl} from "./NamedElementImpl";
		
			export class TypeBase
			extends NamedElementImpl
			implements Type
			{
				private _usagesInTypeAccess:Set<TypeAccess> = null;
				
				get usagesInTypeAccess():Set<TypeAccess>{
					if(this._usagesInTypeAccess===null){
						this._usagesInTypeAccess = new Set<TypeAccess>(this, Java_PackageLiterals.TYPE_USAGESINTYPEACCESS, Java_PackageLiterals.TYPEACCESS_TYPE);
							
					}
					return this._usagesInTypeAccess;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TypeBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.TYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess.basicAdd(otherEnd as TypeAccess, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromType = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.TYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess.basicRemove(otherEnd as TypeAccess, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromType = this.eInverseRemove;
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.TYPE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TYPE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TYPE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TYPE_NAME:
							return this.name;
						case Java_PackageLiterals.TYPE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.TYPE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.TYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TYPE_USAGESINTYPEACCESS:
							this.usagesInTypeAccess.clear();
							this.usagesInTypeAccess.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
