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
import {VariableDeclaration} from "./VariableDeclaration";
import {SingleVariableAccess} from "./SingleVariableAccess";
		
			export class SingleVariableAccessBase
			extends ExpressionImpl
			implements SingleVariableAccess
			{
				private _variable:VariableDeclaration = null;
				get variable():VariableDeclaration{
				
					return this._variable;
				}
				set variable(value:VariableDeclaration) {
					if (value != this._variable) {
						let msgs:NotificationChain = null;
						if (this._variable != null){
							msgs = (this._variable).eInverseRemove(this, Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, /*SingleVariableAccess*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, /*SingleVariableAccess*/ null, msgs);
						}
						msgs = this.basicSetVariable(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE , value, value));
					}
				}
				private _qualifier:Expression = null;
				get qualifier():Expression{
				
					return this._qualifier;
				}
				set qualifier(value:Expression) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return SingleVariableAccessBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE:
							if (this._variable != null){
								msgs = this._variable.eInverseRemove(this, Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE, /*VariableDeclaration*/ null, msgs);
							}
							return this.basicSetVariable(otherEnd as VariableDeclaration, msgs);
					}
					//return this.eInverseAddFromExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromSingleVariableAccess = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE:
							return this.basicSetVariable(null, msgs);
					}
					//return this.eInverseRemoveFromExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromSingleVariableAccess = this.eInverseRemove;
			
				public basicSetVariable(newobj:VariableDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._variable;
					this._variable = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetQualifier(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE:
							return this.variable;
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE:
							this.variable = <VariableDeclaration> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEACCESS_QUALIFIER:
							this.qualifier = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
