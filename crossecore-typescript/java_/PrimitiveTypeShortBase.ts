import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {PrimitiveTypeImpl} from "./PrimitiveTypeImpl";
import {PrimitiveTypeShort} from "./PrimitiveTypeShort";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
		
			export class PrimitiveTypeShortBase
			extends PrimitiveTypeImpl
			implements PrimitiveTypeShort
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return PrimitiveTypeShortBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.PRIMITIVETYPESHORT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_NAME:
							return this.name;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.PRIMITIVETYPESHORT_USAGESINTYPEACCESS:
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
			
