import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {NumberLiteral} from "./NumberLiteral";
		
			export class NumberLiteralBase
			extends ExpressionImpl
			implements NumberLiteral
			{
				private _tokenValue:string = '';
				get tokenValue():string{
					return this._tokenValue;
				}
				set tokenValue(value:string){
					this._tokenValue = value; 
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return NumberLiteralBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.NUMBERLITERAL_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.NUMBERLITERAL_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.NUMBERLITERAL_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.NUMBERLITERAL_TOKENVALUE:
							return this.tokenValue;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.NUMBERLITERAL_TOKENVALUE:
							this.tokenValue = <string> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
