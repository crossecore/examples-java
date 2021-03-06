import {OrderedSet} from "ecore/OrderedSet";
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
import {EnumConstantDeclaration} from "./EnumConstantDeclaration";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {Expression} from "./Expression";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {SingleVariableAccess} from "./SingleVariableAccess";
import {VariableDeclarationImpl} from "./VariableDeclarationImpl";
		
			export class EnumConstantDeclarationBase
			extends BodyDeclarationImpl
			implements EnumConstantDeclaration
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
				
				
				private _anonymousClassDeclaration:AnonymousClassDeclaration = null;
				get anonymousClassDeclaration():AnonymousClassDeclaration{
				
					return this._anonymousClassDeclaration;
				}
				set anonymousClassDeclaration(value:AnonymousClassDeclaration) {
					if (value != this._anonymousClassDeclaration) {
						let msgs:NotificationChain = null;
						if (this._anonymousClassDeclaration != null){
							msgs = (this._anonymousClassDeclaration).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, /*null*/ null, msgs);
						}
						msgs = this.basicSetAnonymousClassDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION , value, value));
					}
				}
				private _arguments_:OrderedSet<Expression> = null;
				
				get arguments_():OrderedSet<Expression>{
					if(this._arguments_===null){
						this._arguments_ = new OrderedSet<Expression>(this, Java_PackageLiterals.ENUMCONSTANTDECLARATION_ARGUMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENUMCONSTANTDECLARATION_ARGUMENTS);
							
					}
					return this._arguments_;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return EnumConstantDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess.basicAdd(otherEnd as SingleVariableAccess, msgs);
					}
					//return this.eInverseAddFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromEnumConstantDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess.basicRemove(otherEnd as SingleVariableAccess, msgs);
					}
					//return this.eInverseRemoveFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromEnumConstantDeclaration = this.eInverseRemove;
			
				public basicSetAnonymousClassDeclaration(newobj:AnonymousClassDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._anonymousClassDeclaration;
					this._anonymousClassDeclaration = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
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
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
							return this.anonymousClassDeclaration;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ARGUMENTS:
							return this.arguments_;
					}
					//return this.eGetFromBodyDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
							this.extraArrayDimensions = <number> newValue;
							return;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_INITIALIZER:
							this.initializer = <Expression> newValue;
							return;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
							this.usageInVariableAccess.clear();
							this.usageInVariableAccess.addAll(newValue);
							return;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
							this.anonymousClassDeclaration = <AnonymousClassDeclaration> newValue;
							return;
						case Java_PackageLiterals.ENUMCONSTANTDECLARATION_ARGUMENTS:
							this.arguments_.clear();
							this.arguments_.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === VariableDeclarationImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageLiterals.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS;
							case Java_PackageLiterals.ENUMCONSTANTDECLARATION_INITIALIZER: return Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER;
							case Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === VariableDeclarationImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageLiterals.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS;
							case Java_PackageLiterals.VARIABLEDECLARATION_INITIALIZER: return Java_PackageLiterals.ENUMCONSTANTDECLARATION_INITIALIZER;
							case Java_PackageLiterals.VARIABLEDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageLiterals.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
