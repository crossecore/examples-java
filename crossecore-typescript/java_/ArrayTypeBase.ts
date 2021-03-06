import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {ArrayType} from "./ArrayType";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeAccess} from "./TypeAccess";
import {TypeImpl} from "./TypeImpl";
		
			export class ArrayTypeBase
			extends TypeImpl
			implements ArrayType
			{
				private _dimensions:number = 0;
				get dimensions():number{
					return this._dimensions;
				}
				set dimensions(value:number){
					this._dimensions = value; 
				}
				private _elementType:TypeAccess = null;
				get elementType():TypeAccess{
				
					return this._elementType;
				}
				set elementType(value:TypeAccess) {
					if (value != this._elementType) {
						let msgs:NotificationChain = null;
						if (this._elementType != null){
							msgs = (this._elementType).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetElementType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArrayTypeBase.eStaticClass;
				}
			
			
				public basicSetElementType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._elementType;
					this._elementType = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ARRAYTYPE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARRAYTYPE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARRAYTYPE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARRAYTYPE_NAME:
							return this.name;
						case Java_PackageLiterals.ARRAYTYPE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ARRAYTYPE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ARRAYTYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.ARRAYTYPE_DIMENSIONS:
							return this.dimensions;
						case Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE:
							return this.elementType;
					}
					//return this.eGetFromType(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARRAYTYPE_DIMENSIONS:
							this.dimensions = <number> newValue;
							return;
						case Java_PackageLiterals.ARRAYTYPE_ELEMENTTYPE:
							this.elementType = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
