import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {EnumConstantDeclaration} from "./EnumConstantDeclaration";
import {AbstractTypeDeclarationImpl} from "./AbstractTypeDeclarationImpl";
import {EnumDeclaration} from "./EnumDeclaration";
		
			export class EnumDeclarationBase
			extends AbstractTypeDeclarationImpl
			implements EnumDeclaration
			{
				private _enumConstants:OrderedSet<EnumConstantDeclaration> = null;
				
				get enumConstants():OrderedSet<EnumConstantDeclaration>{
					if(this._enumConstants===null){
						this._enumConstants = new OrderedSet<EnumConstantDeclaration>(this, Java_PackageLiterals.ENUMDECLARATION_ENUMCONSTANTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ENUMDECLARATION_ENUMCONSTANTS);
							
					}
					return this._enumConstants;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return EnumDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ENUMDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ENUMDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ENUMDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ENUMDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ENUMDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ENUMDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ENUMDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ENUMDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ENUMDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.ENUMDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.ENUMDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.ENUMDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.ENUMDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.ENUMDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
						case Java_PackageLiterals.ENUMDECLARATION_ENUMCONSTANTS:
							return this.enumConstants;
					}
					//return this.eGetFromAbstractTypeDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ENUMDECLARATION_ENUMCONSTANTS:
							this.enumConstants.clear();
							this.enumConstants.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
