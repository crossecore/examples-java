import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ASTNode} from "./ASTNode";
import {TagElement} from "./TagElement";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class TagElementBase
			extends ASTNodeImpl
			implements TagElement
			{
				private _tagName:string = '';
				get tagName():string{
					return this._tagName;
				}
				set tagName(value:string){
					this._tagName = value; 
				}
				private _fragments:OrderedSet<ASTNode> = null;
				
				get fragments():OrderedSet<ASTNode>{
					if(this._fragments===null){
						this._fragments = new OrderedSet<ASTNode>(this, Java_PackageLiterals.TAGELEMENT_FRAGMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TAGELEMENT_FRAGMENTS);
							
					}
					return this._fragments;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TagElementBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.TAGELEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TAGELEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TAGELEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TAGELEMENT_TAGNAME:
							return this.tagName;
						case Java_PackageLiterals.TAGELEMENT_FRAGMENTS:
							return this.fragments;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TAGELEMENT_TAGNAME:
							this.tagName = <string> newValue;
							return;
						case Java_PackageLiterals.TAGELEMENT_FRAGMENTS:
							this.fragments.clear();
							this.fragments.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
