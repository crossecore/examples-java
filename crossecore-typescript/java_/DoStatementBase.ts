import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {DoStatement} from "./DoStatement";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
		
			export class DoStatementBase
			extends StatementImpl
			implements DoStatement
			{
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.DOSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.DOSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.DOSTATEMENT_EXPRESSION , value, value));
					}
				}
				private _body:Statement = null;
				get body():Statement{
				
					return this._body;
				}
				set body(value:Statement) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.DOSTATEMENT_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.DOSTATEMENT_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.DOSTATEMENT_BODY , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return DoStatementBase.eStaticClass;
				}
			
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.DOSTATEMENT_EXPRESSION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetBody(newobj:Statement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.DOSTATEMENT_BODY, oldobj, newobj);
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
						case Java_PackageLiterals.DOSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.DOSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.DOSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.DOSTATEMENT_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.DOSTATEMENT_BODY:
							return this.body;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.DOSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.DOSTATEMENT_BODY:
							this.body = <Statement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
