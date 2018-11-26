import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {CommentImpl} from "./CommentImpl";
import {LineComment} from "./LineComment";
		
			export class LineCommentBase
			extends CommentImpl
			implements LineComment
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return LineCommentBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.LINECOMMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.LINECOMMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.LINECOMMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.LINECOMMENT_CONTENT:
							return this.content;
						case Java_PackageLiterals.LINECOMMENT_ENCLOSEDBYPARENT:
							return this.enclosedByParent;
						case Java_PackageLiterals.LINECOMMENT_PREFIXOFPARENT:
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
			
