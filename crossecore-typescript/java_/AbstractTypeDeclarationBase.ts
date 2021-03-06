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
import {Comment} from "./Comment";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {TypeAccess} from "./TypeAccess";
import {BodyDeclaration} from "./BodyDeclaration";
import {Package} from "./Package";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
import {TypeImpl} from "./TypeImpl";
		
			export class AbstractTypeDeclarationBase
			extends BodyDeclarationImpl
			implements AbstractTypeDeclaration
			{
				private _usagesInTypeAccess:Set<TypeAccess> = null;
				
				get usagesInTypeAccess():Set<TypeAccess>{
					if(this._usagesInTypeAccess===null){
						this._usagesInTypeAccess = new Set<TypeAccess>(this, Java_PackageLiterals.TYPE_USAGESINTYPEACCESS, Java_PackageLiterals.TYPEACCESS_TYPE);
							
					}
					return this._usagesInTypeAccess;
					
				}
				
				
				private _bodyDeclarations:OrderedSet<BodyDeclaration> = null;
				
				get bodyDeclarations():OrderedSet<BodyDeclaration>{
					if(this._bodyDeclarations===null){
						this._bodyDeclarations = new OrderedSet<BodyDeclaration>(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION);
							
					}
					return this._bodyDeclarations;
					
				}
				
				
				private _commentsBeforeBody:OrderedSet<Comment> = null;
				
				get commentsBeforeBody():OrderedSet<Comment>{
					if(this._commentsBeforeBody===null){
						this._commentsBeforeBody = new OrderedSet<Comment>(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY);
							
					}
					return this._commentsBeforeBody;
					
				}
				
				
				private _commentsAfterBody:OrderedSet<Comment> = null;
				
				get commentsAfterBody():OrderedSet<Comment>{
					if(this._commentsAfterBody===null){
						this._commentsAfterBody = new OrderedSet<Comment>(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY);
							
					}
					return this._commentsAfterBody;
					
				}
				
				
				get package():Package{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE) return null;
					return this.eInternalContainer() as Package;
				}
				set package(value:Package) {
					if (value != this.eInternalContainer() as Package) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as Package != null){
							msgs = (this.eInternalContainer() as Package).eInverseRemove(this, Java_PackageLiterals.PACKAGE_OWNEDELEMENTS, /*AbstractTypeDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.PACKAGE_OWNEDELEMENTS, /*AbstractTypeDeclaration*/ null, msgs);
						}
						msgs = this.basicSetPackage(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE , value, value));
					}
				}
				private _superInterfaces:OrderedSet<TypeAccess> = null;
				
				get superInterfaces():OrderedSet<TypeAccess>{
					if(this._superInterfaces===null){
						this._superInterfaces = new OrderedSet<TypeAccess>(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_SUPERINTERFACES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTTYPEDECLARATION_SUPERINTERFACES);
							
					}
					return this._superInterfaces;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AbstractTypeDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetPackage(otherEnd as Package, msgs);
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations.basicAdd(otherEnd as BodyDeclaration, msgs);
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess.basicAdd(otherEnd as TypeAccess, msgs);
					}
					//return this.eInverseAddFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAbstractTypeDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE:
							return this.basicSetPackage(null, msgs);
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations.basicRemove(otherEnd as BodyDeclaration, msgs);
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess.basicRemove(otherEnd as TypeAccess, msgs);
					}
					//return this.eInverseRemoveFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAbstractTypeDeclaration = this.eInverseRemove;
			
				public basicSetPackage(newobj:Package, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
					}
					//return this.eGetFromBodyDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
							this.usagesInTypeAccess.clear();
							this.usagesInTypeAccess.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
							this.bodyDeclarations.clear();
							this.bodyDeclarations.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
							this.commentsBeforeBody.clear();
							this.commentsBeforeBody.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
							this.commentsAfterBody.clear();
							this.commentsAfterBody.addAll(newValue);
							return;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_PACKAGE:
							this.package = <Package> newValue;
							return;
						case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
							this.superInterfaces.clear();
							this.superInterfaces.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === TypeImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS: return Java_PackageLiterals.TYPE_USAGESINTYPEACCESS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === TypeImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.TYPE_USAGESINTYPEACCESS: return Java_PackageLiterals.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
