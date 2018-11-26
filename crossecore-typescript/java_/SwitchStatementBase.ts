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
import {SwitchStatement} from "./SwitchStatement";
import {Expression} from "./Expression";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
		
			export class SwitchStatementBase
			extends StatementImpl
			implements SwitchStatement
			{
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION , value, value));
					}
				}
				private _statements:OrderedSet<Statement> = null;
				
				get statements():OrderedSet<Statement>{
					if(this._statements===null){
						this._statements = new OrderedSet<Statement>(this, Java_PackageLiterals.SWITCHSTATEMENT_STATEMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SWITCHSTATEMENT_STATEMENTS);
							
					}
					return this._statements;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return SwitchStatementBase.eStaticClass;
				}
			
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.SWITCHSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.SWITCHSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.SWITCHSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.SWITCHSTATEMENT_STATEMENTS:
							return this.statements;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.SWITCHSTATEMENT_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.SWITCHSTATEMENT_STATEMENTS:
							this.statements.clear();
							this.statements.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
