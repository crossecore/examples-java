import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ThisExpression} from "./ThisExpression";
import {AbstractTypeQualifiedExpressionImpl} from "./AbstractTypeQualifiedExpressionImpl";
		
			export class ThisExpressionBase
			extends AbstractTypeQualifiedExpressionImpl
			implements ThisExpression
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ThisExpressionBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.THISEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.THISEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.THISEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.THISEXPRESSION_QUALIFIER:
							return this.qualifier;
					}
					//return this.eGetFromAbstractTypeQualifiedExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
