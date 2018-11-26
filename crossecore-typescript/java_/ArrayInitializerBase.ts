import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {Expression} from "./Expression";
import {ArrayInitializer} from "./ArrayInitializer";
		
			export class ArrayInitializerBase
			extends ExpressionImpl
			implements ArrayInitializer
			{
				private _expressions:OrderedSet<Expression> = null;
				
				get expressions():OrderedSet<Expression>{
					if(this._expressions===null){
						this._expressions = new OrderedSet<Expression>(this, Java_PackageLiterals.ARRAYINITIALIZER_EXPRESSIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARRAYINITIALIZER_EXPRESSIONS);
							
					}
					return this._expressions;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArrayInitializerBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ARRAYINITIALIZER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARRAYINITIALIZER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARRAYINITIALIZER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARRAYINITIALIZER_EXPRESSIONS:
							return this.expressions;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARRAYINITIALIZER_EXPRESSIONS:
							this.expressions.clear();
							this.expressions.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
