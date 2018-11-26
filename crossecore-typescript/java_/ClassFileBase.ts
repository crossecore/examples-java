import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {CompilationUnit} from "./CompilationUnit";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ClassFile} from "./ClassFile";
import {NamedElementImpl} from "./NamedElementImpl";
import {Package} from "./Package";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
		
			export class ClassFileBase
			extends NamedElementImpl
			implements ClassFile
			{
				private _originalFilePath:string = '';
				get originalFilePath():string{
					return this._originalFilePath;
				}
				set originalFilePath(value:string){
					this._originalFilePath = value; 
				}
				private _type:AbstractTypeDeclaration = null;
				get type():AbstractTypeDeclaration{
				
					return this._type;
				}
				set type(value:AbstractTypeDeclaration) {
					let oldvalue = this._type;
					this._type = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSFILE_TYPE , oldvalue, value));
					}
				}
				private _attachedSource:CompilationUnit = null;
				get attachedSource():CompilationUnit{
				
					return this._attachedSource;
				}
				set attachedSource(value:CompilationUnit) {
					let oldvalue = this._attachedSource;
					this._attachedSource = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSFILE_ATTACHEDSOURCE , oldvalue, value));
					}
				}
				private _package:Package = null;
				get package():Package{
				
					return this._package;
				}
				set package(value:Package) {
					let oldvalue = this._package;
					this._package = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSFILE_PACKAGE , oldvalue, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ClassFileBase.eStaticClass;
				}
			
			
				public basicSetPackage(newobj:Package, msgs:NotificationChain):NotificationChain {
					let oldobj = this._package;
					this._package = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSFILE_PACKAGE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetType(newobj:AbstractTypeDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSFILE_TYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetAttachedSource(newobj:CompilationUnit, msgs:NotificationChain):NotificationChain {
					let oldobj = this._attachedSource;
					this._attachedSource = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSFILE_ATTACHEDSOURCE, oldobj, newobj);
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
						case Java_PackageLiterals.CLASSFILE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CLASSFILE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CLASSFILE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CLASSFILE_NAME:
							return this.name;
						case Java_PackageLiterals.CLASSFILE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.CLASSFILE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.CLASSFILE_ORIGINALFILEPATH:
							return this.originalFilePath;
						case Java_PackageLiterals.CLASSFILE_TYPE:
							return this.type;
						case Java_PackageLiterals.CLASSFILE_ATTACHEDSOURCE:
							return this.attachedSource;
						case Java_PackageLiterals.CLASSFILE_PACKAGE:
							return this.package;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CLASSFILE_ORIGINALFILEPATH:
							this.originalFilePath = <string> newValue;
							return;
						case Java_PackageLiterals.CLASSFILE_TYPE:
							this.type = <AbstractTypeDeclaration> newValue;
							return;
						case Java_PackageLiterals.CLASSFILE_ATTACHEDSOURCE:
							this.attachedSource = <CompilationUnit> newValue;
							return;
						case Java_PackageLiterals.CLASSFILE_PACKAGE:
							this.package = <Package> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
