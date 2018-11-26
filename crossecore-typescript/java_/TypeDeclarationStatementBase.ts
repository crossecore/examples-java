import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeDeclarationStatement} from "./TypeDeclarationStatement";
import {StatementImpl} from "./StatementImpl";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
		
			export class TypeDeclarationStatementBase
			extends StatementImpl
			implements TypeDeclarationStatement
			{
				private _declaration:AbstractTypeDeclaration = null;
				get declaration():AbstractTypeDeclaration{
				
					return this._declaration;
				}
				set declaration(value:AbstractTypeDeclaration) {
					if (value != this._declaration) {
						let msgs:NotificationChain = null;
						if (this._declaration != null){
							msgs = (this._declaration).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION, /*null*/ null, msgs);
						}
						msgs = this.basicSetDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TypeDeclarationStatementBase.eStaticClass;
				}
			
			
				public basicSetDeclaration(newobj:AbstractTypeDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._declaration;
					this._declaration = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION, oldobj, newobj);
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
						case Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION:
							return this.declaration;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TYPEDECLARATIONSTATEMENT_DECLARATION:
							this.declaration = <AbstractTypeDeclaration> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
