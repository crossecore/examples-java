import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TextElement} from "./TextElement";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class TextElementBase
			extends ASTNodeImpl
			implements TextElement
			{
				private _text:string = '';
				get text():string{
					return this._text;
				}
				set text(value:string){
					this._text = value; 
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TextElementBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.TEXTELEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TEXTELEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TEXTELEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TEXTELEMENT_TEXT:
							return this.text;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TEXTELEMENT_TEXT:
							this.text = <string> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
