import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ImportDeclaration} from "./ImportDeclaration";
import {NamedElement} from "./NamedElement";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class ImportDeclarationBase
			extends ASTNodeImpl
			implements ImportDeclaration
			{
				private _static:boolean = false;
				get static():boolean{
					return this._static;
				}
				set static(value:boolean){
					this._static = value; 
				}
				private _importedElement:NamedElement = null;
				get importedElement():NamedElement{
				
					return this._importedElement;
				}
				set importedElement(value:NamedElement) {
					if (value != this._importedElement) {
						let msgs:NotificationChain = null;
						if (this._importedElement != null){
							msgs = (this._importedElement).eInverseRemove(this, Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS, /*ImportDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS, /*ImportDeclaration*/ null, msgs);
						}
						msgs = this.basicSetImportedElement(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ImportDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT:
							if (this._importedElement != null){
								msgs = this._importedElement.eInverseRemove(this, Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT, /*NamedElement*/ null, msgs);
							}
							return this.basicSetImportedElement(otherEnd as NamedElement, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromImportDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT:
							return this.basicSetImportedElement(null, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromImportDeclaration = this.eInverseRemove;
			
				public basicSetImportedElement(newobj:NamedElement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._importedElement;
					this._importedElement = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT, oldobj, newobj);
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
						case Java_PackageLiterals.IMPORTDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.IMPORTDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.IMPORTDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.IMPORTDECLARATION_STATIC:
							return this.static;
						case Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT:
							return this.importedElement;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.IMPORTDECLARATION_STATIC:
							this.static = <boolean> newValue;
							return;
						case Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT:
							this.importedElement = <NamedElement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
