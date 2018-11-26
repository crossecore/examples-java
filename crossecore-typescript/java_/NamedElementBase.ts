import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ImportDeclaration} from "./ImportDeclaration";
import {NamedElement} from "./NamedElement";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class NamedElementBase
			extends ASTNodeImpl
			implements NamedElement
			{
				private _name:string = '';
				get name():string{
					return this._name;
				}
				set name(value:string){
					this._name = value; 
				}
				private _proxy:boolean = false;
				get proxy():boolean{
					return this._proxy;
				}
				set proxy(value:boolean){
					this._proxy = value; 
				}
				private _usagesInImports:Set<ImportDeclaration> = null;
				
				get usagesInImports():Set<ImportDeclaration>{
					if(this._usagesInImports===null){
						this._usagesInImports = new Set<ImportDeclaration>(this, Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS, Java_PackageLiterals.IMPORTDECLARATION_IMPORTEDELEMENT);
							
					}
					return this._usagesInImports;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return NamedElementBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS:
							return this.usagesInImports.basicAdd(otherEnd as ImportDeclaration, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromNamedElement = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS:
							return this.usagesInImports.basicRemove(otherEnd as ImportDeclaration, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromNamedElement = this.eInverseRemove;
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.NAMEDELEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.NAMEDELEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.NAMEDELEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.NAMEDELEMENT_NAME:
							return this.name;
						case Java_PackageLiterals.NAMEDELEMENT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS:
							return this.usagesInImports;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.NAMEDELEMENT_NAME:
							this.name = <string> newValue;
							return;
						case Java_PackageLiterals.NAMEDELEMENT_PROXY:
							this.proxy = <boolean> newValue;
							return;
						case Java_PackageLiterals.NAMEDELEMENT_USAGESINIMPORTS:
							this.usagesInImports.clear();
							this.usagesInImports.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
