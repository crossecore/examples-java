import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {UnresolvedItem} from "./UnresolvedItem";
import {NamedElementImpl} from "./NamedElementImpl";
		
			export class UnresolvedItemBase
			extends NamedElementImpl
			implements UnresolvedItem
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedItemBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDITEM_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDITEM_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDITEM_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDITEM_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDITEM_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDITEM_USAGESINIMPORTS:
							return this.usagesInImports;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
