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
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {NamedElementImpl} from "./NamedElementImpl";
import {BodyDeclaration} from "./BodyDeclaration";
import {Modifier} from "./Modifier";
import {Annotation} from "./Annotation";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
		
			export class BodyDeclarationBase
			extends NamedElementImpl
			implements BodyDeclaration
			{
				get abstractTypeDeclaration():AbstractTypeDeclaration{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION) return null;
					return this.eInternalContainer() as AbstractTypeDeclaration;
				}
				set abstractTypeDeclaration(value:AbstractTypeDeclaration) {
					if (value != this.eInternalContainer() as AbstractTypeDeclaration) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as AbstractTypeDeclaration != null){
							msgs = (this.eInternalContainer() as AbstractTypeDeclaration).eInverseRemove(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, /*BodyDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, /*BodyDeclaration*/ null, msgs);
						}
						msgs = this.basicSetAbstractTypeDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION , value, value));
					}
				}
				private _annotations:OrderedSet<Annotation> = null;
				
				get annotations():OrderedSet<Annotation>{
					if(this._annotations===null){
						this._annotations = new OrderedSet<Annotation>(this, Java_PackageLiterals.BODYDECLARATION_ANNOTATIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.BODYDECLARATION_ANNOTATIONS);
							
					}
					return this._annotations;
					
				}
				
				
				get anonymousClassDeclarationOwner():AnonymousClassDeclaration{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER) return null;
					return this.eInternalContainer() as AnonymousClassDeclaration;
				}
				set anonymousClassDeclarationOwner(value:AnonymousClassDeclaration) {
					if (value != this.eInternalContainer() as AnonymousClassDeclaration) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as AnonymousClassDeclaration != null){
							msgs = (this.eInternalContainer() as AnonymousClassDeclaration).eInverseRemove(this, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, /*BodyDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, /*BodyDeclaration*/ null, msgs);
						}
						msgs = this.basicSetAnonymousClassDeclarationOwner(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER , value, value));
					}
				}
				private _modifier:Modifier = null;
				get modifier():Modifier{
				
					return this._modifier;
				}
				set modifier(value:Modifier) {
					if (value != this._modifier) {
						let msgs:NotificationChain = null;
						if (this._modifier != null){
							msgs = (this._modifier).eInverseRemove(this, Java_PackageLiterals.MODIFIER_BODYDECLARATION, /*BodyDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.MODIFIER_BODYDECLARATION, /*BodyDeclaration*/ null, msgs);
						}
						msgs = this.basicSetModifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.BODYDECLARATION_MODIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return BodyDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetAnonymousClassDeclarationOwner(otherEnd as AnonymousClassDeclaration, msgs);
						case Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetAbstractTypeDeclaration(otherEnd as AbstractTypeDeclaration, msgs);
						case Java_PackageLiterals.BODYDECLARATION_MODIFIER:
							if (this._modifier != null){
								msgs = this._modifier.eInverseRemove(this, Java_PackageLiterals.BODYDECLARATION_MODIFIER, /*Modifier*/ null, msgs);
							}
							return this.basicSetModifier(otherEnd as Modifier, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromBodyDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.basicSetAnonymousClassDeclarationOwner(null, msgs);
						case Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.basicSetAbstractTypeDeclaration(null, msgs);
						case Java_PackageLiterals.BODYDECLARATION_MODIFIER:
							return this.basicSetModifier(null, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromBodyDeclaration = this.eInverseRemove;
			
				public basicSetAnonymousClassDeclarationOwner(newobj:AnonymousClassDeclaration, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER, msgs);
						return msgs;
				}
				public basicSetAbstractTypeDeclaration(newobj:AbstractTypeDeclaration, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION, msgs);
						return msgs;
				}
				public basicSetModifier(newobj:Modifier, msgs:NotificationChain):NotificationChain {
					let oldobj = this._modifier;
					this._modifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.BODYDECLARATION_MODIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.BODYDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.BODYDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.BODYDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.BODYDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.BODYDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.BODYDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.BODYDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.BODYDECLARATION_MODIFIER:
							return this.modifier;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
							this.abstractTypeDeclaration = <AbstractTypeDeclaration> newValue;
							return;
						case Java_PackageLiterals.BODYDECLARATION_ANNOTATIONS:
							this.annotations.clear();
							this.annotations.addAll(newValue);
							return;
						case Java_PackageLiterals.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							this.anonymousClassDeclarationOwner = <AnonymousClassDeclaration> newValue;
							return;
						case Java_PackageLiterals.BODYDECLARATION_MODIFIER:
							this.modifier = <Modifier> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
