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
import {Expression} from "./Expression";
import {AbstractMethodInvocationImpl} from "./AbstractMethodInvocationImpl";
import {AbstractTypeQualifiedExpressionImpl} from "./AbstractTypeQualifiedExpressionImpl";
import {TypeAccess} from "./TypeAccess";
import {SuperMethodInvocation} from "./SuperMethodInvocation";
import {AbstractMethodDeclaration} from "./AbstractMethodDeclaration";
		
			export class SuperMethodInvocationBase
			extends AbstractTypeQualifiedExpressionImpl
			implements SuperMethodInvocation
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
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return SuperMethodInvocationBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD:
							if (this._method != null){
								msgs = this._method.eInverseRemove(this, Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD, /*AbstractMethodDeclaration*/ null, msgs);
							}
							return this.basicSetMethod(otherEnd as AbstractMethodDeclaration, msgs);
					}
					//return this.eInverseAddFromAbstractTypeQualifiedExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromSuperMethodInvocation = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD:
							return this.basicSetMethod(null, msgs);
					}
					//return this.eInverseRemoveFromAbstractTypeQualifiedExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromSuperMethodInvocation = this.eInverseRemove;
			
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
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.SUPERMETHODINVOCATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_QUALIFIER:
							return this.qualifier;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD:
							return this.method;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_ARGUMENTS:
							return this.arguments_;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_TYPEARGUMENTS:
							return this.typeArguments;
					}
					//return this.eGetFromAbstractTypeQualifiedExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD:
							this.method = <AbstractMethodDeclaration> newValue;
							return;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_ARGUMENTS:
							this.arguments_.clear();
							this.arguments_.addAll(newValue);
							return;
						case Java_PackageLiterals.SUPERMETHODINVOCATION_TYPEARGUMENTS:
							this.typeArguments.clear();
							this.typeArguments.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD;
							case Java_PackageLiterals.SUPERMETHODINVOCATION_ARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS;
							case Java_PackageLiterals.SUPERMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractMethodInvocationImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_METHOD: return Java_PackageLiterals.SUPERMETHODINVOCATION_METHOD;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_ARGUMENTS: return Java_PackageLiterals.SUPERMETHODINVOCATION_ARGUMENTS;
							case Java_PackageLiterals.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageLiterals.SUPERMETHODINVOCATION_TYPEARGUMENTS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
