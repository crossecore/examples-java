import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeParameter} from "./TypeParameter";
import {TypeAccess} from "./TypeAccess";
import {TypeImpl} from "./TypeImpl";
		
			export class TypeParameterBase
			extends TypeImpl
			implements TypeParameter
			{
				private _bounds:OrderedSet<TypeAccess> = null;
				
				get bounds():OrderedSet<TypeAccess>{
					if(this._bounds===null){
						this._bounds = new OrderedSet<TypeAccess>(this, Java_PackageLiterals.TYPEPARAMETER_BOUNDS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEPARAMETER_BOUNDS);
							
					}
					return this._bounds;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TypeParameterBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.TYPEPARAMETER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TYPEPARAMETER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TYPEPARAMETER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TYPEPARAMETER_NAME:
							return this.name;
						case Java_PackageLiterals.TYPEPARAMETER_PROXY:
							return this.proxy;
						case Java_PackageLiterals.TYPEPARAMETER_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.TYPEPARAMETER_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.TYPEPARAMETER_BOUNDS:
							return this.bounds;
					}
					//return this.eGetFromType(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TYPEPARAMETER_BOUNDS:
							this.bounds.clear();
							this.bounds.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
