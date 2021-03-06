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
import {InstanceofExpression} from "./InstanceofExpression";
import {TypeAccess} from "./TypeAccess";
		
			export class InstanceofExpressionBase
			extends ExpressionImpl
			implements InstanceofExpression
			{
				private _rightOperand:TypeAccess = null;
				get rightOperand():TypeAccess{
				
					return this._rightOperand;
				}
				set rightOperand(value:TypeAccess) {
					if (value != this._rightOperand) {
						let msgs:NotificationChain = null;
						if (this._rightOperand != null){
							msgs = (this._rightOperand).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND, /*null*/ null, msgs);
						}
						msgs = this.basicSetRightOperand(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND , value, value));
					}
				}
				private _leftOperand:Expression = null;
				get leftOperand():Expression{
				
					return this._leftOperand;
				}
				set leftOperand(value:Expression) {
					if (value != this._leftOperand) {
						let msgs:NotificationChain = null;
						if (this._leftOperand != null){
							msgs = (this._leftOperand).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND, /*null*/ null, msgs);
						}
						msgs = this.basicSetLeftOperand(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return InstanceofExpressionBase.eStaticClass;
				}
			
			
				public basicSetLeftOperand(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._leftOperand;
					this._leftOperand = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetRightOperand(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._rightOperand;
					this._rightOperand = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND, oldobj, newobj);
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
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND:
							return this.rightOperand;
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND:
							return this.leftOperand;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_RIGHTOPERAND:
							this.rightOperand = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.INSTANCEOFEXPRESSION_LEFTOPERAND:
							this.leftOperand = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
