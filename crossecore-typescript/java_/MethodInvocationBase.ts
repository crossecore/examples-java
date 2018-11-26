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
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {AbstractMethodInvocationImpl} from "./AbstractMethodInvocationImpl";
import {TypeAccess} from "./TypeAccess";
import {MethodInvocation} from "./MethodInvocation";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
		
			export class MethodInvocationBase
			extends ExpressionImpl
			implements MethodInvocation
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
				
				
				private _expression:Expression = null;
				get expression():Expression{
				
					return this._expression;
				}
				set expression(value:Expression) {
					if (value != this._expression) {
						let msgs:NotificationChain = null;
						if (this._expression != null){
							msgs = (this._expression).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODINVOCATION_EXPRESSION, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODINVOCATION_EXPRESSION, /*null*/ null, msgs);
						}
						msgs = this.basicSetExpression(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODINVOCATION_EXPRESSION , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return MethodInvocationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODINVOCATION_METHOD:
							if (this._method != null){
								msgs = this._method.eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD, /*AbstractMethodDeclaration*/ null, msgs);
							}
							return this.basicSetMethod(otherEnd as AbstractMethodDeclaration, msgs);
					}
					//return this.eInverseAddFromExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromMethodInvocation = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.METHODINVOCATION_METHOD:
							return this.basicSetMethod(null, msgs);
					}
					//return this.eInverseRemoveFromExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromMethodInvocation = this.eInverseRemove;
			
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
				public basicSetExpression(newobj:Expression, msgs:NotificationChain):NotificationChain {
					let oldobj = this._expression;
					this._expression = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODINVOCATION_EXPRESSION, oldobj, newobj);
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
						case Java_PackageLiterals.METHODINVOCATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.METHODINVOCATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.METHODINVOCATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.METHODINVOCATION_METHOD:
							return this.method;
						case Java_PackageLiterals.METHODINVOCATION_ARGUMENTS:
							return this.arguments_;
						case Java_PackageLiterals.METHODINVOCATION_TYPEARGUMENTS:
							return this.typeArguments;
						case Java_PackageLiterals.METHODINVOCATION_EXPRESSION:
							return this.expression;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.METHODINVOCATION_METHOD:
							this.method = <AbstractMethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.METHODINVOCATION_ARGUMENTS:
							this.arguments_.clear();
							this.arguments_.addAll(newValue);
							return;
						case Java_PackageLiterals.METHODINVOCATION_TYPEARGUMENTS:
							this.typeArguments.clear();
							this.typeArguments.addAll(newValue);
							return;
						case Java_PackageLiterals.METHODINVOCATION_EXPRESSION:
							this.expression = <Expression> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.METHODINVOCATION_METHOD: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD;
							case Java_PackageLiterals.METHODINVOCATION_ARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS;
							case Java_PackageLiterals.METHODINVOCATION_TYPEARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD: return Java_PackageLiterals.METHODINVOCATION_METHOD;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS: return Java_PackageLiterals.METHODINVOCATION_ARGUMENTS;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageLiterals.METHODINVOCATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
