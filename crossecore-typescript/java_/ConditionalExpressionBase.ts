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
import {ConditionalExpression} from "./ConditionalExpression";
		
			export class ConditionalExpressionBase
			extends ExpressionImpl
			implements ConditionalExpression
			{
				private _elseExpression:Expression = null;
				get elseExpression():Expression{
				
					return this._elseExpression;
				}
				set elseExpression(value:Expression) {
					if (value != this._elseExpression) {
						let msgs:NotificationChain = null;
						if (this._elseExpression != null){
							msgs = (this._elseExpression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetElseExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION , value, value));
					}
				}
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION , value, value));
					}
				}
				private _thenExpression:Expression = null;
				get thenExpression():Expression{
				
					return this._thenExpression;
				}
				set thenExpression(value:Expression) {
					if (value != this._thenExpression) {
						let msgs:NotificationChain = null;
						if (this._thenExpression != null){
							msgs = (this._thenExpression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetThenExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ConditionalExpressionBase.eStaticClass;
				}
			
			
				public basicSetElseExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._elseExpression;
					this._elseExpression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetThenExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._thenExpression;
					this._thenExpression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.CONDITIONALEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION:
							return this.elseExpression;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION:
							return this.thenExpression;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CONDITIONALEXPRESSION_ELSEEXPRESSION:
							this.elseExpression = <Expression> newValue;
							return;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.CONDITIONALEXPRESSION_THENEXPRESSION:
							this.thenExpression = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
