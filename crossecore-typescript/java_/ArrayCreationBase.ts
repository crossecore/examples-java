import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {ArrayCreation} from "./ArrayCreation";
import {TypeAccess} from "./TypeAccess";
import {ArrayInitializer} from "./ArrayInitializer";
		
			export class ArrayCreationBase
			extends ExpressionImpl
			implements ArrayCreation
			{
				private _dimensions:OrderedSet<Expression> = null;
				
				get dimensions():OrderedSet<Expression>{
					if(this._dimensions===null){
						this._dimensions = new OrderedSet<Expression>(this, Java_PackageLiterals.ARRAYCREATION_DIMENSIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYCREATION_DIMENSIONS);
							
					}
					return this._dimensions;
					
				}
				
				
				private _initializer:ArrayInitializer = null;
				get initializer():ArrayInitializer{
				
					return this._initializer;
				}
				set initializer(value:ArrayInitializer) {
					if (value != this._initializer) {
						let msgs:NotificationChain = null;
						if (this._initializer != null){
							msgs = (this._initializer).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYCREATION_INITIALIZER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYCREATION_INITIALIZER, /*null*/ null, msgs);
						}
						msgs = this.basicSetInitializer(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYCREATION_INITIALIZER , value, value));
					}
				}
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYCREATION_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYCREATION_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARRAYCREATION_TYPE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArrayCreationBase.eStaticClass;
				}
			
			
				public basicSetInitializer(newobj:ArrayInitializer, msgs:NotificationChain):NotificationChain {
					let oldobj = this._initializer;
					this._initializer = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYCREATION_INITIALIZER, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARRAYCREATION_TYPE, oldobj, newobj);
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
						case Java_PackageLiterals.ARRAYCREATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARRAYCREATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARRAYCREATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARRAYCREATION_DIMENSIONS:
							return this.dimensions;
						case Java_PackageLiterals.ARRAYCREATION_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.ARRAYCREATION_TYPE:
							return this.type;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARRAYCREATION_DIMENSIONS:
							this.dimensions.clear();
							this.dimensions.addAll(newValue);
							return;
						case Java_PackageLiterals.ARRAYCREATION_INITIALIZER:
							this.initializer = <ArrayInitializer> newValue;
							return;
						case Java_PackageLiterals.ARRAYCREATION_TYPE:
							this.type = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
