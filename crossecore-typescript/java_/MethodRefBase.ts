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
import {MethodRef} from "./MethodRef";
import {MethodRefParameter} from "./MethodRefParameter";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class MethodRefBase
			extends ASTNodeImpl
			implements MethodRef
			{
				private _method:AbstractMethodDeclaration = null;
				get method():AbstractMethodDeclaration{
				
					return this._method;
				}
				set method(value:AbstractMethodDeclaration) {
					if (value != this._method) {
						let msgs:NotificationChain = null;
						if (this._method != null){
							msgs = (this._method).eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, /*MethodRef*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, /*MethodRef*/ null, msgs);
						}
						msgs = this.basicSetMethod(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODREF_METHOD , value, value));
					}
				}
				private _qualifier:TypeAccess = null;
				get qualifier():TypeAccess{
				
					return this._qualifier;
				}
				set qualifier(value:TypeAccess) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODREF_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODREF_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODREF_QUALIFIER , value, value));
					}
				}
				private _parameters:OrderedSet<MethodRefParameter> = null;
				
				get parameters():OrderedSet<MethodRefParameter>{
					if(this._parameters===null){
						this._parameters = new OrderedSet<MethodRefParameter>(this, Java_PackageLiterals.METHODREF_PARAMETERS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODREF_PARAMETERS);
							
					}
					return this._parameters;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return MethodRefBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODREF_METHOD:
							if (this._method != null){
								msgs = this._method.eInverseRemove(this, Java_PackageLiterals.METHODREF_METHOD, /*AbstractMethodDeclaration*/ null, msgs);
							}
							return this.basicSetMethod(otherEnd as AbstractMethodDeclaration, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromMethodRef = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODREF_METHOD:
							return this.basicSetMethod(null, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromMethodRef = this.eInverseRemove;
			
				public basicSetQualifier(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODREF_QUALIFIER, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetMethod(newobj:AbstractMethodDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._method;
					this._method = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODREF_METHOD, oldobj, newobj);
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
						case Java_PackageLiterals.METHODREF_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.METHODREF_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.METHODREF_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.METHODREF_METHOD:
							return this.method;
						case Java_PackageLiterals.METHODREF_QUALIFIER:
							return this.qualifier;
						case Java_PackageLiterals.METHODREF_PARAMETERS:
							return this.parameters;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.METHODREF_METHOD:
							this.method = <AbstractMethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.METHODREF_QUALIFIER:
							this.qualifier = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.METHODREF_PARAMETERS:
							this.parameters.clear();
							this.parameters.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
