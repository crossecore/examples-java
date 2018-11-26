import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {InfixExpressionKind} from "./InfixExpressionKind";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {InfixExpression} from "./InfixExpression";
		
			export class InfixExpressionBase
			extends ExpressionImpl
			implements InfixExpression
			{
				private _operator:InfixExpressionKind = InfixExpressionKind.TIMES;
				get operator():InfixExpressionKind{
					return this._operator;
				}
				set operator(value:InfixExpressionKind){
					this._operator = value; 
				}
				private _rightOperand:Expression = null;
				get rightOperand():Expression{
				
					return this._rightOperand;
				}
				set rightOperand(value:Expression) {
					if (value != this._rightOperand) {
						let msgs:NotificationChain = null;
						if (this._rightOperand != null){
							msgs = (this._rightOperand).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND, /*null*/ null, msgs);
						}
						msgs = this.basicSetRightOperand(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND , value, value));
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
							msgs = (this._leftOperand).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND, /*null*/ null, msgs);
						}
						msgs = this.basicSetLeftOperand(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND , value, value));
					}
				}
				private _extendedOperands:OrderedSet<Expression> = null;
				
				get extendedOperands():OrderedSet<Expression>{
					if(this._extendedOperands===null){
						this._extendedOperands = new OrderedSet<Expression>(this, Java_PackageLiterals.INFIXEXPRESSION_EXTENDEDOPERANDS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INFIXEXPRESSION_EXTENDEDOPERANDS);
							
					}
					return this._extendedOperands;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return InfixExpressionBase.eStaticClass;
				}
			
			
				public basicSetRightOperand(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._rightOperand;
					this._rightOperand = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetLeftOperand(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._leftOperand;
					this._leftOperand = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND, oldobj, newobj);
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
						case Java_PackageLiterals.INFIXEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.INFIXEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.INFIXEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.INFIXEXPRESSION_OPERATOR:
							return this.operator;
						case Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND:
							return this.rightOperand;
						case Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND:
							return this.leftOperand;
						case Java_PackageLiterals.INFIXEXPRESSION_EXTENDEDOPERANDS:
							return this.extendedOperands;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.INFIXEXPRESSION_OPERATOR:
							this.operator = <InfixExpressionKind> newValue;
							return;
						case Java_PackageLiterals.INFIXEXPRESSION_RIGHTOPERAND:
							this.rightOperand = <Expression> newValue;
							return;
						case Java_PackageLiterals.INFIXEXPRESSION_LEFTOPERAND:
							this.leftOperand = <Expression> newValue;
							return;
						case Java_PackageLiterals.INFIXEXPRESSION_EXTENDEDOPERANDS:
							this.extendedOperands.clear();
							this.extendedOperands.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
