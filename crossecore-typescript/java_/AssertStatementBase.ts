import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Expression} from "./Expression";
import {StatementImpl} from "./StatementImpl";
import {AssertStatement} from "./AssertStatement";
		
			export class AssertStatementBase
			extends StatementImpl
			implements AssertStatement
			{
				private _message:Expression = null;
				get message():Expression{
				
					return this._message;
				}
				set message(value:Expression) {
					if (value != this._message) {
						let msgs:NotificationChain = null;
						if (this._message != null){
							msgs = (this._message).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE, /*null*/ null, msgs);
						}
						msgs = this.basicSetMessage(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE , value, value));
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
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AssertStatementBase.eStaticClass;
				}
			
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetMessage(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._message;
					this._message = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE, oldobj, newobj);
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
						case Java_PackageLiterals.ASSERTSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ASSERTSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ASSERTSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE:
							return this.message;
						case Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION:
							return this.expression;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ASSERTSTATEMENT_MESSAGE:
							this.message = <Expression> newValue;
							return;
						case Java_PackageLiterals.ASSERTSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
