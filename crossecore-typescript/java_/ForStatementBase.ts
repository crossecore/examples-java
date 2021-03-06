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
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
import {ForStatement} from "./ForStatement";
		
			export class ForStatementBase
			extends StatementImpl
			implements ForStatement
			{
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.FORSTATEMENT_EXPRESSION , value, value));
					}
				}
				private _updaters:OrderedSet<Expression> = null;
				
				get updaters():OrderedSet<Expression>{
					if(this._updaters===null){
						this._updaters = new OrderedSet<Expression>(this, Java_PackageLiterals.FORSTATEMENT_UPDATERS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_UPDATERS);
							
					}
					return this._updaters;
					
				}
				
				
				private _initializers:OrderedSet<Expression> = null;
				
				get initializers():OrderedSet<Expression>{
					if(this._initializers===null){
						this._initializers = new OrderedSet<Expression>(this, Java_PackageLiterals.FORSTATEMENT_INITIALIZERS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_INITIALIZERS);
							
					}
					return this._initializers;
					
				}
				
				
				private _body:Statement = null;
				get body():Statement{
				
					return this._body;
				}
				set body(value:Statement) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FORSTATEMENT_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.FORSTATEMENT_BODY , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ForStatementBase.eStaticClass;
				}
			
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.FORSTATEMENT_EXPRESSION, oldobj, newobj);
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
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.FORSTATEMENT_BODY, oldobj, newobj);
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
						case Java_PackageLiterals.FORSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.FORSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.FORSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.FORSTATEMENT_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.FORSTATEMENT_UPDATERS:
							return this.updaters;
						case Java_PackageLiterals.FORSTATEMENT_INITIALIZERS:
							return this.initializers;
						case Java_PackageLiterals.FORSTATEMENT_BODY:
							return this.body;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.FORSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.FORSTATEMENT_UPDATERS:
							this.updaters.clear();
							this.updaters.addAll(newValue);
							return;
						case Java_PackageLiterals.FORSTATEMENT_INITIALIZERS:
							this.initializers.clear();
							this.initializers.addAll(newValue);
							return;
						case Java_PackageLiterals.FORSTATEMENT_BODY:
							this.body = <Statement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
