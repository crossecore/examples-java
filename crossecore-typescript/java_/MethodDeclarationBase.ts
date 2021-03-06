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
import {MethodDeclaration} from "./MethodDeclaration";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclarationImpl} from "./AbstractMethodDeclarationImpl";
		
			export class MethodDeclarationBase
			extends AbstractMethodDeclarationImpl
			implements MethodDeclaration
			{
				private _extraArrayDimensions:number = 0;
				get extraArrayDimensions():number{
					return this._extraArrayDimensions;
				}
				set extraArrayDimensions(value:number){
					this._extraArrayDimensions = value; 
				}
				private _returnType:TypeAccess = null;
				get returnType():TypeAccess{
				
					return this._returnType;
				}
				set returnType(value:TypeAccess) {
					if (value != this._returnType) {
						let msgs:NotificationChain = null;
						if (this._returnType != null){
							msgs = (this._returnType).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODDECLARATION_RETURNTYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODDECLARATION_RETURNTYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetReturnType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODDECLARATION_RETURNTYPE , value, value));
					}
				}
				private _redefinedMethodDeclaration:MethodDeclaration = null;
				get redefinedMethodDeclaration():MethodDeclaration{
				
					return this._redefinedMethodDeclaration;
				}
				set redefinedMethodDeclaration(value:MethodDeclaration) {
					if (value != this._redefinedMethodDeclaration) {
						let msgs:NotificationChain = null;
						if (this._redefinedMethodDeclaration != null){
							msgs = (this._redefinedMethodDeclaration).eInverseRemove(this, Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS, /*MethodDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS, /*MethodDeclaration*/ null, msgs);
						}
						msgs = this.basicSetRedefinedMethodDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION , value, value));
					}
				}
				private _redefinitions:Set<MethodDeclaration> = null;
				
				get redefinitions():Set<MethodDeclaration>{
					if(this._redefinitions===null){
						this._redefinitions = new Set<MethodDeclaration>(this, Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS, Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION);
							
					}
					return this._redefinitions;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return MethodDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS:
							return this.redefinitions.basicAdd(otherEnd as MethodDeclaration, msgs);
						case Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
							if (this._redefinedMethodDeclaration != null){
								msgs = this._redefinedMethodDeclaration.eInverseRemove(this, Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION, /*MethodDeclaration*/ null, msgs);
							}
							return this.basicSetRedefinedMethodDeclaration(otherEnd as MethodDeclaration, msgs);
					}
					//return this.eInverseAddFromAbstractMethodDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromMethodDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS:
							return this.redefinitions.basicRemove(otherEnd as MethodDeclaration, msgs);
						case Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
							return this.basicSetRedefinedMethodDeclaration(null, msgs);
					}
					//return this.eInverseRemoveFromAbstractMethodDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromMethodDeclaration = this.eInverseRemove;
			
				public basicSetReturnType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._returnType;
					this._returnType = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODDECLARATION_RETURNTYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetRedefinedMethodDeclaration(newobj:MethodDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._redefinedMethodDeclaration;
					this._redefinedMethodDeclaration = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION, oldobj, newobj);
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
						case Java_PackageLiterals.METHODDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.METHODDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.METHODDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.METHODDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.METHODDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.METHODDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.METHODDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.METHODDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.METHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.METHODDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.METHODDECLARATION_BODY:
							return this.body;
						case Java_PackageLiterals.METHODDECLARATION_PARAMETERS:
							return this.parameters;
						case Java_PackageLiterals.METHODDECLARATION_THROWNEXCEPTIONS:
							return this.thrownExceptions;
						case Java_PackageLiterals.METHODDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.METHODDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments;
						case Java_PackageLiterals.METHODDECLARATION_USAGES:
							return this.usages;
						case Java_PackageLiterals.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.METHODDECLARATION_RETURNTYPE:
							return this.returnType;
						case Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
							return this.redefinedMethodDeclaration;
						case Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS:
							return this.redefinitions;
					}
					//return this.eGetFromAbstractMethodDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
							this.extraArrayDimensions = <number> newValue;
							return;
						case Java_PackageLiterals.METHODDECLARATION_RETURNTYPE:
							this.returnType = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
							this.redefinedMethodDeclaration = <MethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.METHODDECLARATION_REDEFINITIONS:
							this.redefinitions.clear();
							this.redefinitions.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
