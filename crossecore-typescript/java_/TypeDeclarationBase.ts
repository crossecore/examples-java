import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeParameter} from "./TypeParameter";
import {AbstractTypeDeclarationImpl} from "./AbstractTypeDeclarationImpl";
import {TypeDeclaration} from "./TypeDeclaration";
		
			export class TypeDeclarationBase
			extends AbstractTypeDeclarationImpl
			implements TypeDeclaration
			{
				private _typeParameters:OrderedSet<TypeParameter> = null;
				
				get typeParameters():OrderedSet<TypeParameter>{
					if(this._typeParameters===null){
						this._typeParameters = new OrderedSet<TypeParameter>(this, Java_PackageLiterals.TYPEDECLARATION_TYPEPARAMETERS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TYPEDECLARATION_TYPEPARAMETERS);
							
					}
					return this._typeParameters;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TypeDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.TYPEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TYPEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TYPEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TYPEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.TYPEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.TYPEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.TYPEDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.TYPEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.TYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.TYPEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.TYPEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.TYPEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.TYPEDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.TYPEDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.TYPEDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.TYPEDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
						case Java_PackageLiterals.TYPEDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
					}
					//return this.eGetFromAbstractTypeDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TYPEDECLARATION_TYPEPARAMETERS:
							this.typeParameters.clear();
							this.typeParameters.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
