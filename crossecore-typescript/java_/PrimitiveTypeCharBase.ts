import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {PrimitiveTypeImpl} from "./PrimitiveTypeImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {PrimitiveTypeChar} from "./PrimitiveTypeChar";
		
			export class PrimitiveTypeCharBase
			extends PrimitiveTypeImpl
			implements PrimitiveTypeChar
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return PrimitiveTypeCharBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.PRIMITIVETYPECHAR_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_NAME:
							return this.name;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_PROXY:
							return this.proxy;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.PRIMITIVETYPECHAR_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
					}
					//return this.eGetFromPrimitiveType(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
