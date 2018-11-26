import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {CommentImpl} from "./CommentImpl";
import {Javadoc} from "./Javadoc";
import {TagElement} from "./TagElement";
		
			export class JavadocBase
			extends CommentImpl
			implements Javadoc
			{
				private _tags:OrderedSet<TagElement> = null;
				
				get tags():OrderedSet<TagElement>{
					if(this._tags===null){
						this._tags = new OrderedSet<TagElement>(this, Java_PackageLiterals.JAVADOC_TAGS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.JAVADOC_TAGS);
							
					}
					return this._tags;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return JavadocBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.JAVADOC_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.JAVADOC_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.JAVADOC_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.JAVADOC_CONTENT:
							return this.content;
						case Java_PackageLiterals.JAVADOC_ENCLOSEDBYPARENT:
							return this.enclosedByParent;
						case Java_PackageLiterals.JAVADOC_PREFIXOFPARENT:
							return this.prefixOfParent;
						case Java_PackageLiterals.JAVADOC_TAGS:
							return this.tags;
					}
					//return this.eGetFromComment(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.JAVADOC_TAGS:
							this.tags.clear();
							this.tags.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
