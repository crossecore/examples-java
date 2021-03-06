import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {IfStatement} from "./IfStatement";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
		
			export class IfStatementBase
			extends StatementImpl
			implements IfStatement
			{
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.IFSTATEMENT_EXPRESSION , value, value));
					}
				}
				private _thenStatement:Statement = null;
				get thenStatement():Statement{
				
					return this._thenStatement;
				}
				set thenStatement(value:Statement) {
					if (value != this._thenStatement) {
						let msgs:NotificationChain = null;
						if (this._thenStatement != null){
							msgs = (this._thenStatement).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT, /*null*/ null, msgs);
						}
						msgs = this.basicSetThenStatement(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT , value, value));
					}
				}
				private _elseStatement:Statement = null;
				get elseStatement():Statement{
				
					return this._elseStatement;
				}
				set elseStatement(value:Statement) {
					if (value != this._elseStatement) {
						let msgs:NotificationChain = null;
						if (this._elseStatement != null){
							msgs = (this._elseStatement).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT, /*null*/ null, msgs);
						}
						msgs = this.basicSetElseStatement(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return IfStatementBase.eStaticClass;
				}
			
			
				public basicSetElseStatement(newobj:Statement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._elseStatement;
					this._elseStatement = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetThenStatement(newobj:Statement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._thenStatement;
					this._thenStatement = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT, oldobj, newobj);
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
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.IFSTATEMENT_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.IFSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.IFSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.IFSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.IFSTATEMENT_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT:
							return this.thenStatement;
						case Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT:
							return this.elseStatement;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.IFSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.IFSTATEMENT_THENSTATEMENT:
							this.thenStatement = <Statement> newValue;
							return;
						case Java_PackageLiterals.IFSTATEMENT_ELSESTATEMENT:
							this.elseStatement = <Statement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
