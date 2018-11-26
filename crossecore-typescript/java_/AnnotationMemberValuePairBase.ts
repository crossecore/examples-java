import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {AnnotationMemberValuePair} from "./AnnotationMemberValuePair";
import {AnnotationTypeMemberDeclaration} from "./AnnotationTypeMemberDeclaration";
import {Expression} from "./Expression";
import {NamedElementImpl} from "./NamedElementImpl";
		
			export class AnnotationMemberValuePairBase
			extends NamedElementImpl
			implements AnnotationMemberValuePair
			{
				private _member:AnnotationTypeMemberDeclaration = null;
				get member():AnnotationTypeMemberDeclaration{
				
					return this._member;
				}
				set member(value:AnnotationTypeMemberDeclaration) {
					if (value != this._member) {
						let msgs:NotificationChain = null;
						if (this._member != null){
							msgs = (this._member).eInverseRemove(this, Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, /*AnnotationMemberValuePair*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, /*AnnotationMemberValuePair*/ null, msgs);
						}
						msgs = this.basicSetMember(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER , value, value));
					}
				}
				private _value:Expression = null;
				get value():Expression{
				
					return this._value;
				}
				set value(value:Expression) {
					if (value != this._value) {
						let msgs:NotificationChain = null;
						if (this._value != null){
							msgs = (this._value).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE, /*null*/ null, msgs);
						}
						msgs = this.basicSetValue(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AnnotationMemberValuePairBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
							if (this._member != null){
								msgs = this._member.eInverseRemove(this, Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER, /*AnnotationTypeMemberDeclaration*/ null, msgs);
							}
							return this.basicSetMember(otherEnd as AnnotationTypeMemberDeclaration, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAnnotationMemberValuePair = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
							return this.basicSetMember(null, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAnnotationMemberValuePair = this.eInverseRemove;
			
				public basicSetMember(newobj:AnnotationTypeMemberDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._member;
					this._member = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetValue(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._value;
					this._value = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE, oldobj, newobj);
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
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_NAME:
							return this.name;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
							return this.member;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE:
							return this.value;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
							this.member = <AnnotationTypeMemberDeclaration> newValue;
							return;
						case Java_PackageLiterals.ANNOTATIONMEMBERVALUEPAIR_VALUE:
							this.value = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
