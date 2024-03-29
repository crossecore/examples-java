import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {ArrayLengthAccess} from "./ArrayLengthAccess";
		
			export class ArrayLengthAccessBase
			extends ExpressionImpl
			implements ArrayLengthAccess
			{
				private _array:Expression = null;
				get array():Expression{
				
					return this._array;
				}
				set array(value:Expression) {
					if (value != this._array) {
						let msgs:NotificationChain = null;
						if (this._array != null){
							msgs = (this._array).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY, /*null*/ null, msgs);
						}
						msgs = this.basicSetArray(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArrayLengthAccessBase.eStaticClass;
				}
			
			
				public basicSetArray(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._array;
					this._array = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY, oldobj, newobj);
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
						case Java_PackageLiterals.ARRAYLENGTHACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARRAYLENGTHACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARRAYLENGTHACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY:
							return this.array;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARRAYLENGTHACCESS_ARRAY:
							this.array = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
