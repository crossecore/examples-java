import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {AnnotationMemberValuePair} from "./AnnotationMemberValuePair";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {AnnotationTypeMemberDeclaration} from "./AnnotationTypeMemberDeclaration";
import {Expression} from "./Expression";
import {TypeAccess} from "./TypeAccess";
		
			export class AnnotationTypeMemberDeclarationBase
			extends BodyDeclarationImpl
			implements AnnotationTypeMemberDeclaration
			{
				private _default:Expression = null;
				get default():Expression{
				
					return this._default;
				}
				set default(value:Expression) {
					if (value != this._default) {
						let msgs:NotificationChain = null;
						if (this._default != null){
							msgs = (this._default).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, /*null*/ null, msgs);
						}
						msgs = this.basicSetDefault(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT , value, value));
					}
				}
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE , value, value));
					}
				}
				private _usages:Set<AnnotationMemberValuePair> = null;
				
				get usages():Set<AnnotationMemberValuePair>{
					if(this._usages===null){
						this._usages = new Set<AnnotationMemberValuePair>(this, Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER);
							
					}
					return this._usages;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AnnotationTypeMemberDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
							return this.usages.basicAdd(otherEnd as AnnotationMemberValuePair, msgs);
					}
					//return this.eInverseAddFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAnnotationTypeMemberDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
							return this.usages.basicRemove(otherEnd as AnnotationMemberValuePair, msgs);
					}
					//return this.eInverseRemoveFromBodyDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAnnotationTypeMemberDeclaration = this.eInverseRemove;
			
				public basicSetDefault(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._default;
					this._default = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, oldobj, newobj);
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
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT:
							return this.default;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
							return this.type;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
							return this.usages;
					}
					//return this.eGetFromBodyDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT:
							this.default = <Expression> newValue;
							return;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
							this.type = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
							this.usages.clear();
							this.usages.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
