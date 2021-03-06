import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {PrefixExpressionKind} from "./PrefixExpressionKind";
import {PrefixExpression} from "./PrefixExpression";
		
			export class PrefixExpressionBase
			extends ExpressionImpl
			implements PrefixExpression
			{
				private _operator:PrefixExpressionKind = PrefixExpressionKind.INCREMENT;
				get operator():PrefixExpressionKind{
					return this._operator;
				}
				set operator(value:PrefixExpressionKind){
					this._operator = value; 
				}
				private _operand:Expression = null;
				get operand():Expression{
				
					return this._operand;
				}
				set operand(value:Expression) {
					if (value != this._operand) {
						let msgs:NotificationChain = null;
						if (this._operand != null){
							msgs = (this._operand).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PREFIXEXPRESSION_OPERAND, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PREFIXEXPRESSION_OPERAND, /*null*/ null, msgs);
						}
						msgs = this.basicSetOperand(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PREFIXEXPRESSION_OPERAND , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return PrefixExpressionBase.eStaticClass;
				}
			
			
				public basicSetOperand(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._operand;
					this._operand = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.PREFIXEXPRESSION_OPERAND, oldobj, newobj);
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
						case Java_PackageLiterals.PREFIXEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PREFIXEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PREFIXEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PREFIXEXPRESSION_OPERATOR:
							return this.operator;
						case Java_PackageLiterals.PREFIXEXPRESSION_OPERAND:
							return this.operand;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.PREFIXEXPRESSION_OPERATOR:
							this.operator = <PrefixExpressionKind> newValue;
							return;
						case Java_PackageLiterals.PREFIXEXPRESSION_OPERAND:
							this.operand = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
