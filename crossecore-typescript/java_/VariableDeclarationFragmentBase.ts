import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {VariableDeclarationFragment} from "./VariableDeclarationFragment";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";
import {VariableDeclarationImpl} from "./VariableDeclarationImpl";
		
			export class VariableDeclarationFragmentBase
			extends VariableDeclarationImpl
			implements VariableDeclarationFragment
			{
				get variablesContainer():AbstractVariablesContainer{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER) return null;
					return this.eInternalContainer() as AbstractVariablesContainer;
				}
				set variablesContainer(value:AbstractVariablesContainer) {
					if (value != this.eInternalContainer() as AbstractVariablesContainer) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as AbstractVariablesContainer != null){
							msgs = (this.eInternalContainer() as AbstractVariablesContainer).eInverseRemove(this, Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, /*VariableDeclarationFragment*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, /*VariableDeclarationFragment*/ null, msgs);
						}
						msgs = this.basicSetVariablesContainer(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return VariableDeclarationFragmentBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetVariablesContainer(otherEnd as AbstractVariablesContainer, msgs);
					}
					//return this.eInverseAddFromVariableDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromVariableDeclarationFragment = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
							return this.basicSetVariablesContainer(null, msgs);
					}
					//return this.eInverseRemoveFromVariableDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromVariableDeclarationFragment = this.eInverseRemove;
			
				public basicSetVariablesContainer(newobj:AbstractVariablesContainer, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_NAME:
							return this.name;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess;
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
							return this.variablesContainer;
					}
					//return this.eGetFromVariableDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
							this.variablesContainer = <AbstractVariablesContainer> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
