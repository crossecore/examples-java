import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {TypeAccess} from "./TypeAccess";
import {EnhancedForStatement} from "./EnhancedForStatement";
import {CatchClause} from "./CatchClause";
import {VariableDeclarationImpl} from "./VariableDeclarationImpl";
import {Modifier} from "./Modifier";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
import {Annotation} from "./Annotation";
		
			export class SingleVariableDeclarationBase
			extends VariableDeclarationImpl
			implements SingleVariableDeclaration
			{
				private _varargs:boolean = false;
				get varargs():boolean{
					return this._varargs;
				}
				set varargs(value:boolean){
					this._varargs = value; 
				}
				private _modifier:Modifier = null;
				get modifier():Modifier{
				
					return this._modifier;
				}
				set modifier(value:Modifier) {
					if (value != this._modifier) {
						let msgs:NotificationChain = null;
						if (this._modifier != null){
							msgs = (this._modifier).eInverseRemove(this, Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION, /*SingleVariableDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.MODIFIER_SINGLEVARIABLEDECLARATION, /*SingleVariableDeclaration*/ null, msgs);
						}
						msgs = this.basicSetModifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER , value, value));
					}
				}
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE , value, value));
					}
				}
				private _annotations:OrderedSet<Annotation> = null;
				
				get annotations():OrderedSet<Annotation>{
					if(this._annotations===null){
						this._annotations = new OrderedSet<Annotation>(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ANNOTATIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ANNOTATIONS);
							
					}
					return this._annotations;
					
				}
				
				
				get methodDeclaration():AbstractMethodDeclaration{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION) return null;
					return this.eInternalContainer() as AbstractMethodDeclaration;
				}
				set methodDeclaration(value:AbstractMethodDeclaration) {
					if (value != this.eInternalContainer() as AbstractMethodDeclaration) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as AbstractMethodDeclaration != null){
							msgs = (this.eInternalContainer() as AbstractMethodDeclaration).eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS, /*SingleVariableDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_PARAMETERS, /*SingleVariableDeclaration*/ null, msgs);
						}
						msgs = this.basicSetMethodDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION , value, value));
					}
				}
				get catchClause():CatchClause{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE) return null;
					return this.eInternalContainer() as CatchClause;
				}
				set catchClause(value:CatchClause) {
					if (value != this.eInternalContainer() as CatchClause) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as CatchClause != null){
							msgs = (this.eInternalContainer() as CatchClause).eInverseRemove(this, Java_PackageLiterals.CATCHCLAUSE_EXCEPTION, /*SingleVariableDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.CATCHCLAUSE_EXCEPTION, /*SingleVariableDeclaration*/ null, msgs);
						}
						msgs = this.basicSetCatchClause(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE , value, value));
					}
				}
				get enhancedForStatement():EnhancedForStatement{
				
					if (this.eContainerFeatureID() != Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT) return null;
					return this.eInternalContainer() as EnhancedForStatement;
				}
				set enhancedForStatement(value:EnhancedForStatement) {
					if (value != this.eInternalContainer() as EnhancedForStatement) {
						let msgs:NotificationChain = null;
						if (this.eInternalContainer() as EnhancedForStatement != null){
							msgs = (this.eInternalContainer() as EnhancedForStatement).eInverseRemove(this, Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER, /*SingleVariableDeclaration*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ENHANCEDFORSTATEMENT_PARAMETER, /*SingleVariableDeclaration*/ null, msgs);
						}
						msgs = this.basicSetEnhancedForStatement(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return SingleVariableDeclarationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetCatchClause(otherEnd as CatchClause, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetEnhancedForStatement(otherEnd as EnhancedForStatement, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER:
							if (this._modifier != null){
								msgs = this._modifier.eInverseRemove(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER, /*Modifier*/ null, msgs);
							}
							return this.basicSetModifier(otherEnd as Modifier, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
							if (this.eInternalContainer() != null) {
								msgs = this.eBasicRemoveFromContainer(msgs);
							}
							return this.basicSetMethodDeclaration(otherEnd as AbstractMethodDeclaration, msgs);
					}
					//return this.eInverseAddFromVariableDeclaration(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromSingleVariableDeclaration = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
							return this.basicSetCatchClause(null, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
							return this.basicSetEnhancedForStatement(null, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER:
							return this.basicSetModifier(null, msgs);
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
							return this.basicSetMethodDeclaration(null, msgs);
					}
					//return this.eInverseRemoveFromVariableDeclaration(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromSingleVariableDeclaration = this.eInverseRemove;
			
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetCatchClause(newobj:CatchClause, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, msgs);
						return msgs;
				}
				public basicSetEnhancedForStatement(newobj:EnhancedForStatement, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, msgs);
						return msgs;
				}
				public basicSetModifier(newobj:Modifier, msgs:NotificationChain):NotificationChain {
					let oldobj = this._modifier;
					this._modifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetMethodDeclaration(newobj:AbstractMethodDeclaration, msgs:NotificationChain):NotificationChain {
						msgs = this.eBasicSetContainer(newobj, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION, msgs);
						return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_VARARGS:
							return this.varargs;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE:
							return this.type;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
							return this.methodDeclaration;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
							return this.catchClause;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
							return this.enhancedForStatement;
					}
					//return this.eGetFromVariableDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_VARARGS:
							this.varargs = <boolean> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_MODIFIER:
							this.modifier = <Modifier> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_TYPE:
							this.type = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ANNOTATIONS:
							this.annotations.clear();
							this.annotations.addAll(newValue);
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
							this.methodDeclaration = <AbstractMethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
							this.catchClause = <CatchClause> newValue;
							return;
						case Java_PackageLiterals.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
							this.enhancedForStatement = <EnhancedForStatement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
