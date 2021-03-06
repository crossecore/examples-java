import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {ArrayAccess} from "./ArrayAccess";
import {Expression} from "./Expression";
		
			export class ArrayAccessBase
			extends ExpressionImpl
			implements ArrayAccess
			{
				private _array:Expression = null;
				get array():Expression{
				
					return this._array;
				}
				set array(value:Expression) {
					if (value != this._array) {
						let msgs:NotificationChain = null;
						if (this._array != null){
							msgs = (this._array).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYACCESS_ARRAY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYACCESS_ARRAY, /*null*/ null, msgs);
						}
						msgs = this.basicSetArray(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYACCESS_ARRAY , value, value));
					}
				}
				private _index:Expression = null;
				get index():Expression{
				
					return this._index;
				}
				set index(value:Expression) {
					if (value != this._index) {
						let msgs:NotificationChain = null;
						if (this._index != null){
							msgs = (this._index).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYACCESS_INDEX, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYACCESS_INDEX, /*null*/ null, msgs);
						}
						msgs = this.basicSetIndex(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYACCESS_INDEX , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArrayAccessBase.eStaticClass;
				}
			
			
				public basicSetArray(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._array;
					this._array = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYACCESS_ARRAY, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetIndex(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._index;
					this._index = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYACCESS_INDEX, oldobj, newobj);
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
						case Java_PackageLiterals.ARRAYACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARRAYACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARRAYACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARRAYACCESS_ARRAY:
							return this.array;
						case Java_PackageLiterals.ARRAYACCESS_INDEX:
							return this.index;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARRAYACCESS_ARRAY:
							this.array = <Expression> newValue;
							return;
						case Java_PackageLiterals.ARRAYACCESS_INDEX:
							this.index = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
