import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {AbstractMethodInvocation} from "./AbstractMethodInvocation";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeParameter} from "./TypeParameter";
import {MethodRef} from "./MethodRef";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {Block} from "./Block";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
		
			export class AbstractMethodDeclarationBase
			extends BodyDeclarationImpl
			implements AbstractMethodDeclaration
			{
				private _body:Block = null;
				get body():Block{
				
					return this._body;
				}
				set body(value:Block) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY , value, value));
					}
				}
				private _parameters:OrderedSet<SingleVariableDeclaration> = null;
				
				get parameters():OrderedSet<SingleVariableDeclaration>{
					if(this._parameters===null){
						this._parameters = new OrderedSet<SingleVariableDeclaration>(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION);
							
					}
					return this._parameters;
					
				}
				
				
				private _thrownExceptions:OrderedSet<TypeAccess> = null;
				
				get thrownExceptions():OrderedSet<TypeAccess>{
					if(this._thrownExceptions===null){
						this._thrownExceptions = new OrderedSet<TypeAccess>(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS);
							
					}
					return this._thrownExceptions;
					
				}
				
				
				private _typeParameters:OrderedSet<TypeParameter> = null;
				
				get typeParameters():OrderedSet<TypeParameter>{
					if(this._typeParameters===null){
						this._typeParameters = new OrderedSet<TypeParameter>(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS);
							
					}
					return this._typeParameters;
					
				}
				
				
				private _usagesInDocComments:Set<MethodRef> = null;
				
				get usagesInDocComments():Set<MethodRef>{
					if(this._usagesInDocComments===null){
						this._usagesInDocComments = new Set<MethodRef>(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, Java_PackageLiterals.METHODREF_METHOD);
							
					}
					return this._usagesInDocComments;
					
				}
				
				
				private _usages:Set<AbstractMethodInvocation> = null;
				
				get usages():Set<AbstractMethodInvocation>{
					if(this._usages===null){
						this._usages = new Set<AbstractMethodInvocation>(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD);
							
					}
					return this._usages;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AbstractMethodDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS:
							return this.parameters.basicAdd(otherEnd as SingleVariableDeclaration, msgs);
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES:
							return this.usages.basicAdd(otherEnd as AbstractMethodInvocation, msgs);
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments.basicAdd(otherEnd as MethodRef, msgs);
					}
					//return this.eInverseAddFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAbstractMethodDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS:
							return this.parameters.basicRemove(otherEnd as SingleVariableDeclaration, msgs);
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES:
							return this.usages.basicRemove(otherEnd as AbstractMethodInvocation, msgs);
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments.basicRemove(otherEnd as MethodRef, msgs);
					}
					//return this.eInverseRemoveFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAbstractMethodDeclaration = this.eInverseRemove;
			
				public basicSetBody(newobj:Block, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY, oldobj, newobj);
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
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY:
							return this.body;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS:
							return this.parameters;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
							return this.thrownExceptions;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES:
							return this.usages;
					}
					//return this.eGetFromBodyDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_BODY:
							this.body = <Block> newValue;
							return;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS:
							this.parameters.clear();
							this.parameters.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
							this.thrownExceptions.clear();
							this.thrownExceptions.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
							this.typeParameters.clear();
							this.typeParameters.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
							this.usagesInDocComments.clear();
							this.usagesInDocComments.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES:
							this.usages.clear();
							this.usages.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
