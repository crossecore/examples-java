import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Assignment} from "./Assignment";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {AssignmentKind} from "./AssignmentKind";
		
			export class AssignmentBase
			extends ExpressionImpl
			implements Assignment
			{
				private _operator:AssignmentKind = AssignmentKind.ASSIGN;
				get operator():AssignmentKind{
					return this._operator;
				}
				set operator(value:AssignmentKind){
					this._operator = value; 
				}
				private _leftHandSide:Expression = null;
				get leftHandSide():Expression{
				
					return this._leftHandSide;
				}
				set leftHandSide(value:Expression) {
					if (value != this._leftHandSide) {
						let msgs:NotificationChain = null;
						if (this._leftHandSide != null){
							msgs = (this._leftHandSide).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE, /*null*/ null, msgs);
						}
						msgs = this.basicSetLeftHandSide(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE , value, value));
					}
				}
				private _rightHandSide:Expression = null;
				get rightHandSide():Expression{
				
					return this._rightHandSide;
				}
				set rightHandSide(value:Expression) {
					if (value != this._rightHandSide) {
						let msgs:NotificationChain = null;
						if (this._rightHandSide != null){
							msgs = (this._rightHandSide).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE, /*null*/ null, msgs);
						}
						msgs = this.basicSetRightHandSide(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AssignmentBase.eStaticClass;
				}
			
			
				public basicSetRightHandSide(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._rightHandSide;
					this._rightHandSide = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetLeftHandSide(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._leftHandSide;
					this._leftHandSide = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE, oldobj, newobj);
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
						case Java_PackageLiterals.ASSIGNMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ASSIGNMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ASSIGNMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE:
							return this.leftHandSide;
						case Java_PackageLiterals.ASSIGNMENT_OPERATOR:
							return this.operator;
						case Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE:
							return this.rightHandSide;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ASSIGNMENT_OPERATOR:
							this.operator = <AssignmentKind> newValue;
							return;
						case Java_PackageLiterals.ASSIGNMENT_LEFTHANDSIDE:
							this.leftHandSide = <Expression> newValue;
							return;
						case Java_PackageLiterals.ASSIGNMENT_RIGHTHANDSIDE:
							this.rightHandSide = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
