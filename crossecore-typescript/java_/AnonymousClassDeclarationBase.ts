import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {ClassInstanceCreation} from "./ClassInstanceCreation";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {BodyDeclaration} from "./BodyDeclaration";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class AnonymousClassDeclarationBase
			extends ASTNodeImpl
			implements AnonymousClassDeclaration
			{
				private _bodyDeclarations:OrderedSet<BodyDeclaration> = null;
				
				get bodyDeclarations():OrderedSet<BodyDeclaration>{
					if(this._bodyDeclarations===null){
						this._bodyDeclarations = new OrderedSet<BodyDeclaration>(this, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER);
							
					}
					return this._bodyDeclarations;
					
				}
				
				
				get classInstanceCreation():ClassInstanceCreation{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION) return null;
					return this.eInternalContainer() as ClassInstanceCreation;
				}
				set classInstanceCreation(value:ClassInstanceCreation) {
					if (value != this.eInternalContainer() as ClassInstanceCreation) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as ClassInstanceCreation != null){
							msgs = (this.eInternalContainer() as ClassInstanceCreation).eInverseRemove(this, Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, /*AnonymousClassDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, /*AnonymousClassDeclaration*/ null, msgs);
						}
						msgs = this.basicSetClassInstanceCreation(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AnonymousClassDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations.basicAdd(otherEnd as BodyDeclaration, msgs);
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetClassInstanceCreation(otherEnd as ClassInstanceCreation, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAnonymousClassDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations.basicRemove(otherEnd as BodyDeclaration, msgs);
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
							return this.basicSetClassInstanceCreation(null, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAnonymousClassDeclaration = this.eInverseRemove;
			
				public basicSetClassInstanceCreation(newobj:ClassInstanceCreation, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
							return this.classInstanceCreation;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
							this.bodyDeclarations.clear();
							this.bodyDeclarations.addAll(newValue);
							return;
						case Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
							this.classInstanceCreation = <ClassInstanceCreation> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
