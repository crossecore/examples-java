import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Type} from "./Type";
import {NamespaceAccessImpl} from "./NamespaceAccessImpl";
import {TypeAccess} from "./TypeAccess";
import {NamespaceAccess} from "./NamespaceAccess";
		
			export class TypeAccessBase
			extends ExpressionImpl
			implements TypeAccess
			{
				private _type:Type = null;
				get type():Type{
				
					return this._type;
				}
				set type(value:Type) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, Java_PackageLiterals.TYPE_USAGESINTYPEACCESS, /*TypeAccess*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.TYPE_USAGESINTYPEACCESS, /*TypeAccess*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.TYPEACCESS_TYPE , value, value));
					}
				}
				private _qualifier:NamespaceAccess = null;
				get qualifier():NamespaceAccess{
				
					return this._qualifier;
				}
				set qualifier(value:NamespaceAccess) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEACCESS_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEACCESS_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.TYPEACCESS_QUALIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TypeAccessBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.TYPEACCESS_TYPE:
							if (this._type != null){
								msgs = this._type.eInverseRemove(this, Java_PackageLiterals.TYPEACCESS_TYPE, /*Type*/ null, msgs);
							}
							return this.basicSetType(otherEnd as Type, msgs);
					}
					//return this.eInverseAddFromExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromTypeAccess = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.TYPEACCESS_TYPE:
							return this.basicSetType(null, msgs);
					}
					//return this.eInverseRemoveFromExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromTypeAccess = this.eInverseRemove;
			
				public basicSetType(newobj:Type, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.TYPEACCESS_TYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetQualifier(newobj:NamespaceAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.TYPEACCESS_QUALIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.TYPEACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TYPEACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TYPEACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TYPEACCESS_TYPE:
							return this.type;
						case Java_PackageLiterals.TYPEACCESS_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TYPEACCESS_TYPE:
							this.type = <Type> newValue;
							return;
						case Java_PackageLiterals.TYPEACCESS_QUALIFIER:
							this.qualifier = <NamespaceAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === NamespaceAccessImpl) {
						switch (derivedFeatureID) {
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === NamespaceAccessImpl) {
						switch (baseFeatureID) {
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
