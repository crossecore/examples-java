import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Expression} from "./Expression";
import {NamedElementImpl} from "./NamedElementImpl";
import {VariableDeclaration} from "./VariableDeclaration";
import {SingleVariableAccess} from "./SingleVariableAccess";
		
			export class VariableDeclarationBase
			extends NamedElementImpl
			implements VariableDeclaration
			{
				private _extraArrayDimensions:number = 0;
				get extraArrayDimensions():number{
					return this._extraArrayDimensions;
				}
				set extraArrayDimensions(value:number){
					this._extraArrayDimensions = value; 
				}
				private _initializer:Expression = null;
				get initializer():Expression{
				
					return this._initializer;
				}
				set initializer(value:Expression) {
					if (value != this._initializer) {
						let msgs:NotificationChain = null;
						if (this._initializer != null){
							msgs = (this._initializer).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER, /*null*/ null, msgs);
						}
						msgs = this.basicSetInitializer(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER , value, value));
					}
				}
				private _usageInVariableAccess:Set<SingleVariableAccess> = null;
				
				get usageInVariableAccess():Set<SingleVariableAccess>{
					if(this._usageInVariableAccess===null){
						this._usageInVariableAccess = new Set<SingleVariableAccess>(this, Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, Java_PackageLiterals.SINGLEVARIABLEACCESS_VARIABLE);
							
					}
					return this._usageInVariableAccess;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return VariableDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess.basicAdd(otherEnd as SingleVariableAccess, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromVariableDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess.basicRemove(otherEnd as SingleVariableAccess, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromVariableDeclaration = this.eInverseRemove;
			
				public basicSetInitializer(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._initializer;
					this._initializer = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER, oldobj, newobj);
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
						case Java_PackageLiterals.VARIABLEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.VARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.VARIABLEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.VARIABLEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.VARIABLEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.VARIABLEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
							this.extraArrayDimensions = <number> newValue;
							return;
						case Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER:
							this.initializer = <Expression> newValue;
							return;
						case Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							this.usageInVariableAccess.clear();
							this.usageInVariableAccess.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
