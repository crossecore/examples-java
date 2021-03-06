import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {WildCardType} from "./WildCardType";
import {TypeAccess} from "./TypeAccess";
import {TypeImpl} from "./TypeImpl";
		
			export class WildCardTypeBase
			extends TypeImpl
			implements WildCardType
			{
				private _upperBound:boolean = false;
				get upperBound():boolean{
					return this._upperBound;
				}
				set upperBound(value:boolean){
					this._upperBound = value; 
				}
				private _bound:TypeAccess = null;
				get bound():TypeAccess{
				
					return this._bound;
				}
				set bound(value:TypeAccess) {
					if (value != this._bound) {
						let msgs:NotificationChain = null;
						if (this._bound != null){
							msgs = (this._bound).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.WILDCARDTYPE_BOUND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.WILDCARDTYPE_BOUND, /*null*/ null, msgs);
						}
						msgs = this.basicSetBound(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.WILDCARDTYPE_BOUND , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return WildCardTypeBase.eStaticClass;
				}
			
			
				public basicSetBound(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._bound;
					this._bound = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.WILDCARDTYPE_BOUND, oldobj, newobj);
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
						case Java_PackageLiterals.WILDCARDTYPE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.WILDCARDTYPE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.WILDCARDTYPE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.WILDCARDTYPE_NAME:
							return this.name;
						case Java_PackageLiterals.WILDCARDTYPE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.WILDCARDTYPE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.WILDCARDTYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.WILDCARDTYPE_UPPERBOUND:
							return this.upperBound;
						case Java_PackageLiterals.WILDCARDTYPE_BOUND:
							return this.bound;
					}
					//return this.eGetFromType(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.WILDCARDTYPE_UPPERBOUND:
							this.upperBound = <boolean> newValue;
							return;
						case Java_PackageLiterals.WILDCARDTYPE_BOUND:
							this.bound = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
