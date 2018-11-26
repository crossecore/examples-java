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
import {FieldAccess} from "./FieldAccess";
import {SingleVariableAccess} from "./SingleVariableAccess";
		
			export class FieldAccessBase
			extends ExpressionImpl
			implements FieldAccess
			{
				private _field:SingleVariableAccess = null;
				get field():SingleVariableAccess{
				
					return this._field;
				}
				set field(value:SingleVariableAccess) {
					if (value != this._field) {
						let msgs:NotificationChain = null;
						if (this._field != null){
							msgs = (this._field).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FIELDACCESS_FIELD, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FIELDACCESS_FIELD, /*null*/ null, msgs);
						}
						msgs = this.basicSetField(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.FIELDACCESS_FIELD , value, value));
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
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FIELDACCESS_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.FIELDACCESS_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.FIELDACCESS_EXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return FieldAccessBase.eStaticClass;
				}
			
			
				public basicSetField(newobj:SingleVariableAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._field;
					this._field = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.FIELDACCESS_FIELD, oldobj, newobj);
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
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.FIELDACCESS_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.FIELDACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.FIELDACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.FIELDACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.FIELDACCESS_FIELD:
							return this.field;
						case Java_PackageLiterals.FIELDACCESS_EXPRESSION:
							return this.expression;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.FIELDACCESS_FIELD:
							this.field = <SingleVariableAccess> newValue;
							return;
						case Java_PackageLiterals.FIELDACCESS_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
