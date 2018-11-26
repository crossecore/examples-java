import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ExpressionImpl} from "./ExpressionImpl";
import {CharacterLiteral} from "./CharacterLiteral";
		
			export class CharacterLiteralBase
			extends ExpressionImpl
			implements CharacterLiteral
			{
				private _escapedValue:string = '';
				get escapedValue():string{
					return this._escapedValue;
				}
				set escapedValue(value:string){
					this._escapedValue = value; 
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return CharacterLiteralBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.CHARACTERLITERAL_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CHARACTERLITERAL_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CHARACTERLITERAL_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CHARACTERLITERAL_ESCAPEDVALUE:
							return this.escapedValue;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CHARACTERLITERAL_ESCAPEDVALUE:
							this.escapedValue = <string> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
