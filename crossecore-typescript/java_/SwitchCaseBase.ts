import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {SwitchCase} from "./SwitchCase";
import {Expression} from "./Expression";
import {StatementImpl} from "./StatementImpl";
		
			export class SwitchCaseBase
			extends StatementImpl
			implements SwitchCase
			{
				private _default:boolean = false;
				get default():boolean{
					return this._default;
				}
				set default(value:boolean){
					this._default = value; 
				}
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SWITCHCASE_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SWITCHCASE_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SWITCHCASE_EXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return SwitchCaseBase.eStaticClass;
				}
			
			
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SWITCHCASE_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.SWITCHCASE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.SWITCHCASE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.SWITCHCASE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.SWITCHCASE_DEFAULT:
							return this.default;
						case Java_PackageLiterals.SWITCHCASE_EXPRESSION:
							return this.expression;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.SWITCHCASE_DEFAULT:
							this.default = <boolean> newValue;
							return;
						case Java_PackageLiterals.SWITCHCASE_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
