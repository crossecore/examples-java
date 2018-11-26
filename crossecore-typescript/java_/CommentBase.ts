import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Comment} from "./Comment";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class CommentBase
			extends ASTNodeImpl
			implements Comment
			{
				private _content:string = '';
				get content():string{
					return this._content;
				}
				set content(value:string){
					this._content = value; 
				}
				private _enclosedByParent:boolean = false;
				get enclosedByParent():boolean{
					return this._enclosedByParent;
				}
				set enclosedByParent(value:boolean){
					this._enclosedByParent = value; 
				}
				private _prefixOfParent:boolean = false;
				get prefixOfParent():boolean{
					return this._prefixOfParent;
				}
				set prefixOfParent(value:boolean){
					this._prefixOfParent = value; 
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return CommentBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.COMMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.COMMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.COMMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.COMMENT_CONTENT:
							return this.content;
						case Java_PackageLiterals.COMMENT_ENCLOSEDBYPARENT:
							return this.enclosedByParent;
						case Java_PackageLiterals.COMMENT_PREFIXOFPARENT:
							return this.prefixOfParent;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.COMMENT_CONTENT:
							this.content = <string> newValue;
							return;
						case Java_PackageLiterals.COMMENT_ENCLOSEDBYPARENT:
							this.enclosedByParent = <boolean> newValue;
							return;
						case Java_PackageLiterals.COMMENT_PREFIXOFPARENT:
							this.prefixOfParent = <boolean> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
