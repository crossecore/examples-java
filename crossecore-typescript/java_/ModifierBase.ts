import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {VisibilityKind} from "./VisibilityKind";
import {InheritanceKind} from "./InheritanceKind";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {VariableDeclarationExpression} from "./VariableDeclarationExpression";
import {VariableDeclarationStatement} from "./VariableDeclarationStatement";
import {BodyDeclaration} from "./BodyDeclaration";
import {Modifier} from "./Modifier";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class ModifierBase
			extends ASTNodeImpl
			implements Modifier
			{
				private _visibility:VisibilityKind = VisibilityKind.NONE;
				get visibility():VisibilityKind{
					return this._visibility;
				}
				set visibility(value:VisibilityKind){
					this._visibility = value; 
				}
				private _inheritance:InheritanceKind = InheritanceKind.NONE;
				get inheritance():InheritanceKind{
					return this._inheritance;
				}
				set inheritance(value:InheritanceKind){
					this._inheritance = value; 
				}
				private _static:boolean = false;
				get static():boolean{
					return this._static;
				}
				set static(value:boolean){
					this._static = value; 
				}
				private _transient:boolean = false;
				get transient():boolean{
					return this._transient;
				}
				set transient(value:boolean){
					this._transient = value; 
				}
				private _volatile:boolean = false;
				get volatile():boolean{
					return this._volatile;
				}
				set volatile(value:boolean){
					this._volatile = value; 
				}
				private _native:boolean = false;
				get native():boolean{
					return this._native;
				}
				set native(value:boolean){
					this._native = value; 
				}
				private _strictfp:boolean = false;
				get strictfp():boolean{
					return this._strictfp;
				}
				set strictfp(value:boolean){
					this._strictfp = value; 
				}
				private _synchronized:boolean = false;
				get synchronized():boolean{
					return this._synchronized;
				}
				set synchronized(value:boolean){
					this._synchronized = value; 
				}
				get bodyDeclaration():BodyDeclaration{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.MODIFIER_BODYDECLARATION) return null;
					return this.eInternalContainer() as BodyDeclaration;
				}
				set bodyDeclaration(value:BodyDeclaration) {
					if (value != this.eInternalContainer() as BodyDeclaration) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as BodyDeclaration != null){
							msgs = (this.eInternalContainer() as BodyDeclaration).eInverseRemove(this, Java_PackageLiterals.BODYDECLARATION_MODIFIER, /*Modifier*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.BODYDECLARATION_MODIFIER, /*Modifier*/ null, msgs);
						}
						msgs = this.basicSetBodyDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.MODIFIER_BODYDECLARATION , value, value));
					}
				}
				get singleVariableDeclaration():SingleVariableDeclaration{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION) return null;
					return this.eInternalContainer() as SingleVariableDeclaration;
				}
				set singleVariableDeclaration(value:SingleVariableDeclaration) {
					if (value != this.eInternalContainer() as SingleVariableDeclaration) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as SingleVariableDeclaration != null){
							msgs = (this.eInternalContainer() as SingleVariableDeclaration).eInverseRemove(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER, /*Modifier*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER, /*Modifier*/ null, msgs);
						}
						msgs = this.basicSetSingleVariableDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION , value, value));
					}
				}
				get variableDeclarationStatement():VariableDeclarationStatement{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT) return null;
					return this.eInternalContainer() as VariableDeclarationStatement;
				}
				set variableDeclarationStatement(value:VariableDeclarationStatement) {
					if (value != this.eInternalContainer() as VariableDeclarationStatement) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as VariableDeclarationStatement != null){
							msgs = (this.eInternalContainer() as VariableDeclarationStatement).eInverseRemove(this, Java_PackageLiterals.VARIABLEDECLARATIONSTATEMENT_MODIFIER, /*Modifier*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.VARIABLEDECLARATIONSTATEMENT_MODIFIER, /*Modifier*/ null, msgs);
						}
						msgs = this.basicSetVariableDeclarationStatement(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT , value, value));
					}
				}
				get variableDeclarationExpression():VariableDeclarationExpression{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION) return null;
					return this.eInternalContainer() as VariableDeclarationExpression;
				}
				set variableDeclarationExpression(value:VariableDeclarationExpression) {
					if (value != this.eInternalContainer() as VariableDeclarationExpression) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as VariableDeclarationExpression != null){
							msgs = (this.eInternalContainer() as VariableDeclarationExpression).eInverseRemove(this, Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER, /*Modifier*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER, /*Modifier*/ null, msgs);
						}
						msgs = this.basicSetVariableDeclarationExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ModifierBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetSingleVariableDeclaration(otherEnd as SingleVariableDeclaration, msgs);
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetVariableDeclarationStatement(otherEnd as VariableDeclarationStatement, msgs);
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetVariableDeclarationExpression(otherEnd as VariableDeclarationExpression, msgs);
						case Java_PackageLiterals.MODIFIER_BODYDECLARATION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetBodyDeclaration(otherEnd as BodyDeclaration, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromModifier = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION:
							return this.basicSetSingleVariableDeclaration(null, msgs);
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
							return this.basicSetVariableDeclarationStatement(null, msgs);
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
							return this.basicSetVariableDeclarationExpression(null, msgs);
						case Java_PackageLiterals.MODIFIER_BODYDECLARATION:
							return this.basicSetBodyDeclaration(null, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromModifier = this.eInverseRemove;
			
				public basicSetSingleVariableDeclaration(newobj:SingleVariableDeclaration, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION, msgs);
						return msgs;
				}
				public basicSetVariableDeclarationStatement(newobj:VariableDeclarationStatement, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT, msgs);
						return msgs;
				}
				public basicSetVariableDeclarationExpression(newobj:VariableDeclarationExpression, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION, msgs);
						return msgs;
				}
				public basicSetBodyDeclaration(newobj:BodyDeclaration, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.MODIFIER_BODYDECLARATION, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.MODIFIER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.MODIFIER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.MODIFIER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.MODIFIER_VISIBILITY:
							return this.visibility;
						case Java_PackageLiterals.MODIFIER_INHERITANCE:
							return this.inheritance;
						case Java_PackageLiterals.MODIFIER_STATIC:
							return this.static;
						case Java_PackageLiterals.MODIFIER_TRANSIENT:
							return this.transient;
						case Java_PackageLiterals.MODIFIER_VOLATILE:
							return this.volatile;
						case Java_PackageLiterals.MODIFIER_NATIVE:
							return this.native;
						case Java_PackageLiterals.MODIFIER_STRICTFP:
							return this.strictfp;
						case Java_PackageLiterals.MODIFIER_SYNCHRONIZED:
							return this.synchronized;
						case Java_PackageLiterals.MODIFIER_BODYDECLARATION:
							return this.bodyDeclaration;
						case Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION:
							return this.singleVariableDeclaration;
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
							return this.variableDeclarationStatement;
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
							return this.variableDeclarationExpression;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.MODIFIER_VISIBILITY:
							this.visibility = <VisibilityKind> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_INHERITANCE:
							this.inheritance = <InheritanceKind> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_STATIC:
							this.static = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_TRANSIENT:
							this.transient = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_VOLATILE:
							this.volatile = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_NATIVE:
							this.native = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_STRICTFP:
							this.strictfp = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_SYNCHRONIZED:
							this.synchronized = <boolean> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_BODYDECLARATION:
							this.bodyDeclaration = <BodyDeclaration> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION:
							this.singleVariableDeclaration = <SingleVariableDeclaration> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
							this.variableDeclarationStatement = <VariableDeclarationStatement> newValue;
							return;
						case Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
							this.variableDeclarationExpression = <VariableDeclarationExpression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
