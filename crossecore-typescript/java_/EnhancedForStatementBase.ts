import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {StatementImpl} from "./StatementImpl";
import {EnhancedForStatement} from "./EnhancedForStatement";
		
			export class EnhancedForStatementBase
			extends StatementImpl
			implements EnhancedForStatement
			{
				private _body:Statement = null;
				get body():Statement{
				
					return this._body;
				}
				set body(value:Statement) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY , value, value));
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
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION , value, value));
					}
				}
				private _parameter:SingleVariableDeclaration = null;
				get parameter():SingleVariableDeclaration{
				
					return this._parameter;
				}
				set parameter(value:SingleVariableDeclaration) {
					if (value != this._parameter) {
						let msgs:NotificationChain = null;
						if (this._parameter != null){
							msgs = (this._parameter).eInverseRemove(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, /*EnhancedForStatement*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, /*EnhancedForStatement*/ null, msgs);
						}
						msgs = this.basicSetParameter(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return EnhancedForStatementBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER:
							if (this._parameter != null){
								msgs = this._parameter.eInverseRemove(this, Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER, /*SingleVariableDeclaration*/ null, msgs);
							}
							return this.basicSetParameter(otherEnd as SingleVariableDeclaration, msgs);
					}
					//return this.eInverseAddFromStatement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromEnhancedForStatement = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER:
							return this.basicSetParameter(null, msgs);
					}
					//return this.eInverseRemoveFromStatement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromEnhancedForStatement = this.eInverseRemove;
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION, oldobj, newobj);
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
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetParameter(newobj:SingleVariableDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._parameter;
					this._parameter = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER, oldobj, newobj);
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
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY:
							return this.body;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER:
							return this.parameter;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_BODY:
							this.body = <Statement> newValue;
							return;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER:
							this.parameter = <SingleVariableDeclaration> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
