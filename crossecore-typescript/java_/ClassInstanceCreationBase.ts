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
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {AbstractMethodInvocationImpl} from "./AbstractMethodInvocationImpl";
import {AnonymousClassDeclaration} from "./AnonymousClassDeclaration";
import {TypeAccess} from "./TypeAccess";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
		
			export class ClassInstanceCreationBase
			extends ExpressionImpl
			implements ClassInstanceCreation
			{
				private _method:AbstractMethodDeclaration = null;
				get method():AbstractMethodDeclaration{
				
					return this._method;
				}
				set method(value:AbstractMethodDeclaration) {
					if (value != this._method) {
						let msgs:NotificationChain = null;
						if (this._method != null){
							msgs = (this._method).eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES, /*AbstractMethodInvocation*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ABSTRACTMETHODDECLARATION_USAGES, /*AbstractMethodInvocation*/ null, msgs);
						}
						msgs = this.basicSetMethod(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD , value, value));
					}
				}
				private _arguments_:OrderedSet<Expression> = null;
				
				get arguments_():OrderedSet<Expression>{
					if(this._arguments_===null){
						this._arguments_ = new OrderedSet<Expression>(this, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS);
							
					}
					return this._arguments_;
					
				}
				
				
				private _typeArguments:OrderedSet<TypeAccess> = null;
				
				get typeArguments():OrderedSet<TypeAccess>{
					if(this._typeArguments===null){
						this._typeArguments = new OrderedSet<TypeAccess>(this, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS);
							
					}
					return this._typeArguments;
					
				}
				
				
				private _anonymousClassDeclaration:AnonymousClassDeclaration = null;
				get anonymousClassDeclaration():AnonymousClassDeclaration{
				
					return this._anonymousClassDeclaration;
				}
				set anonymousClassDeclaration(value:AnonymousClassDeclaration) {
					if (value != this._anonymousClassDeclaration) {
						let msgs:NotificationChain = null;
						if (this._anonymousClassDeclaration != null){
							msgs = (this._anonymousClassDeclaration).eInverseRemove(this, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, /*ClassInstanceCreation*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, /*ClassInstanceCreation*/ null, msgs);
						}
						msgs = this.basicSetAnonymousClassDeclaration(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION , value, value));
					}
				}
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION , value, value));
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
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSINSTANCECREATION_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CLASSINSTANCECREATION_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CLASSINSTANCECREATION_TYPE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ClassInstanceCreationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CLASSINSTANCECREATION_METHOD:
							if (this._method != null){
								msgs = this._method.eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD, /*AbstractMethodDeclaration*/ null, msgs);
							}
							return this.basicSetMethod(otherEnd as AbstractMethodDeclaration, msgs);
						case Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
							if (this._anonymousClassDeclaration != null){
								msgs = this._anonymousClassDeclaration.eInverseRemove(this, Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, /*AnonymousClassDeclaration*/ null, msgs);
							}
							return this.basicSetAnonymousClassDeclaration(otherEnd as AnonymousClassDeclaration, msgs);
					}
					//return this.eInverseAddFromExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromClassInstanceCreation = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CLASSINSTANCECREATION_METHOD:
							return this.basicSetMethod(null, msgs);
						case Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
							return this.basicSetAnonymousClassDeclaration(null, msgs);
					}
					//return this.eInverseRemoveFromExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromClassInstanceCreation = this.eInverseRemove;
			
				public basicSetMethod(newobj:AbstractMethodDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._method;
					this._method = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSINSTANCECREATION_TYPE, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetAnonymousClassDeclaration(newobj:AnonymousClassDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._anonymousClassDeclaration;
					this._anonymousClassDeclaration = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.CLASSINSTANCECREATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CLASSINSTANCECREATION_METHOD:
							return this.method;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ARGUMENTS:
							return this.arguments_;
						case Java_PackageLiterals.CLASSINSTANCECREATION_TYPEARGUMENTS:
							return this.typeArguments;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
							return this.anonymousClassDeclaration;
						case Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION:
							return this.expression;
						case Java_PackageLiterals.CLASSINSTANCECREATION_TYPE:
							return this.type;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CLASSINSTANCECREATION_METHOD:
							this.method = <AbstractMethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ARGUMENTS:
							this.arguments_.clear();
							this.arguments_.addAll(newValue);
							return;
						case Java_PackageLiterals.CLASSINSTANCECREATION_TYPEARGUMENTS:
							this.typeArguments.clear();
							this.typeArguments.addAll(newValue);
							return;
						case Java_PackageLiterals.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
							this.anonymousClassDeclaration = <AnonymousClassDeclaration> newValue;
							return;
						case Java_PackageLiterals.CLASSINSTANCECREATION_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
						case Java_PackageLiterals.CLASSINSTANCECREATION_TYPE:
							this.type = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.CLASSINSTANCECREATION_METHOD: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD;
							case Java_PackageLiterals.CLASSINSTANCECREATION_ARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS;
							case Java_PackageLiterals.CLASSINSTANCECREATION_TYPEARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD: return Java_PackageLiterals.CLASSINSTANCECREATION_METHOD;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS: return Java_PackageLiterals.CLASSINSTANCECREATION_ARGUMENTS;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageLiterals.CLASSINSTANCECREATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
