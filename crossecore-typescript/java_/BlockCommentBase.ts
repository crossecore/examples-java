import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {BlockComment} from "./BlockComment";
import {CommentImpl} from "./CommentImpl";
		
			export class BlockCommentBase
			extends CommentImpl
			implements BlockComment
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return BlockCommentBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.BLOCKCOMMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.BLOCKCOMMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.BLOCKCOMMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.BLOCKCOMMENT_CONTENT:
							return this.content;
						case Java_PackageLiterals.BLOCKCOMMENT_ENCLOSEDBYPARENT:
							return this.enclosedByParent;
						case Java_PackageLiterals.BLOCKCOMMENT_PREFIXOFPARENT:
							return this.prefixOfParent;
					}
					//return this.eGetFromComment(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
