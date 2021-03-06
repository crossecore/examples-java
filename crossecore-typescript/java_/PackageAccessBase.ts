import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {PackageAccess} from "./PackageAccess";
import {NamespaceAccessImpl} from "./NamespaceAccessImpl";
import {Package} from "./Package";
		
			export class PackageAccessBase
			extends NamespaceAccessImpl
			implements PackageAccess
			{
				private _package:Package = null;
				get package():Package{
				
					return this._package;
				}
				set package(value:Package) {
					if (value != this._package) {
						let msgs:NotificationChain = null;
						if (this._package != null){
							msgs = (this._package).eInverseRemove(this, Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS, /*PackageAccess*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.PACKAGE_USAGESINPACKAGEACCESS, /*PackageAccess*/ null, msgs);
						}
						msgs = this.basicSetPackage(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PACKAGEACCESS_PACKAGE , value, value));
					}
				}
				private _qualifier:PackageAccess = null;
				get qualifier():PackageAccess{
				
					return this._qualifier;
				}
				set qualifier(value:PackageAccess) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PACKAGEACCESS_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PACKAGEACCESS_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PACKAGEACCESS_QUALIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return PackageAccessBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.PACKAGEACCESS_PACKAGE:
							if (this._package != null){
								msgs = this._package.eInverseRemove(this, Java_PackageLiterals.PACKAGEACCESS_PACKAGE, /*Package*/ null, msgs);
							}
							return this.basicSetPackage(otherEnd as Package, msgs);
					}
					//return this.eInverseAddFromNamespaceAccess(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromPackageAccess = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.PACKAGEACCESS_PACKAGE:
							return this.basicSetPackage(null, msgs);
					}
					//return this.eInverseRemoveFromNamespaceAccess(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromPackageAccess = this.eInverseRemove;
			
				public basicSetPackage(newobj:Package, msgs:NotificationChain):NotificationChain {
					let oldobj = this._package;
					this._package = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.PACKAGEACCESS_PACKAGE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetQualifier(newobj:PackageAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.PACKAGEACCESS_QUALIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.PACKAGEACCESS_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PACKAGEACCESS_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PACKAGEACCESS_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PACKAGEACCESS_PACKAGE:
							return this.package;
						case Java_PackageLiterals.PACKAGEACCESS_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromNamespaceAccess(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.PACKAGEACCESS_PACKAGE:
							this.package = <Package> newValue;
							return;
						case Java_PackageLiterals.PACKAGEACCESS_QUALIFIER:
							this.qualifier = <PackageAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
