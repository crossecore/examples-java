import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {TypeAccess} from "./TypeAccess";
import {AbstractTypeQualifiedExpression} from "./AbstractTypeQualifiedExpression";
		
			export class AbstractTypeQualifiedExpressionBase
			extends ExpressionImpl
			implements AbstractTypeQualifiedExpression
			{
				private _qualifier:TypeAccess = null;
				get qualifier():TypeAccess{
				
					return this._qualifier;
				}
				set qualifier(value:TypeAccess) {
					if (value != this._qualifier) {
						let msgs:NotificationChain = null;
						if (this._qualifier != null){
							msgs = (this._qualifier).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER, /*null*/ null, msgs);
						}
						msgs = this.basicSetQualifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AbstractTypeQualifiedExpressionBase.eStaticClass;
				}
			
			
				public basicSetQualifier(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._qualifier;
					this._qualifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTTYPEQUALIFIEDEXPRESSION_QUALIFIER:
							this.qualifier = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
