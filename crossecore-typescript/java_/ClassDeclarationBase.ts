import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ClassDeclaration} from "./ClassDeclaration";
import {TypeAccess} from "./TypeAccess";
import {TypeDeclarationImpl} from "./TypeDeclarationImpl";
		
			export class ClassDeclarationBase
			extends TypeDeclarationImpl
			implements ClassDeclaration
			{
				private _superClass:TypeAccess = null;
				get superClass():TypeAccess{
				
					return this._superClass;
				}
				set superClass(value:TypeAccess) {
					if (value != this._superClass) {
						let msgs:NotificationChain = null;
						if (this._superClass != null){
							msgs = (this._superClass).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS, /*null*/ null, msgs);
						}
						msgs = this.basicSetSuperClass(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ClassDeclarationBase.eStaticClass;
				}
			
			
				public basicSetSuperClass(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._superClass;
					this._superClass = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS, oldobj, newobj);
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
						case Java_PackageLiterals.CLASSDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CLASSDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CLASSDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CLASSDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.CLASSDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.CLASSDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.CLASSDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.CLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.CLASSDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.CLASSDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.CLASSDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.CLASSDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.CLASSDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.CLASSDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.CLASSDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
						case Java_PackageLiterals.CLASSDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS:
							return this.superClass;
					}
					//return this.eGetFromTypeDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CLASSDECLARATION_SUPERCLASS:
							this.superClass = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
