import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {UnresolvedItem} from "./UnresolvedItem";
import {ASTNode} from "./ASTNode";
import {NamespaceAccessImpl} from "./NamespaceAccessImpl";
import {UnresolvedItemAccess} from "./UnresolvedItemAccess";
		
			export class UnresolvedItemAccessBase
			extends ExpressionImpl
			implements UnresolvedItemAccess
			{
				private _element:UnresolvedItem = null;
				get element():UnresolvedItem{
				
					return this._element;
				}
				set element(value:UnresolvedItem) {
					let oldvalue = this._element;
					this._element = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.UNRESOLVEDITEMACCESS_ELEMENT , oldvalue, value));
					}
				}
				private _qualifier:ASTNode = null;
				get qualifier():ASTNode{
				
					return this._qualifier;
				}
				set qualifier(value:ASTNode) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedItemAccessBase.eStaticClass;
				}
			
			
				public basicSetQualifier(newobj:ASTNode, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetElement(newobj:UnresolvedItem, msgs:NotificationChain):NotificationChain {
					let oldobj = this._element;
					this._element = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.UNRESOLVEDITEMACCESS_ELEMENT, oldobj, newobj);
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
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_ELEMENT:
							return this.element;
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_ELEMENT:
							this.element = <UnresolvedItem> newValue;
							return;
						case Java_PackageLiterals.UNRESOLVEDITEMACCESS_QUALIFIER:
							this.qualifier = <ASTNode> newValue;
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
			
