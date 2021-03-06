import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {InterfaceDeclaration} from "./InterfaceDeclaration";
import {TypeDeclarationImpl} from "./TypeDeclarationImpl";
		
			export class InterfaceDeclarationBase
			extends TypeDeclarationImpl
			implements InterfaceDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return InterfaceDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.INTERFACEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.INTERFACEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.INTERFACEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.INTERFACEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.INTERFACEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.INTERFACEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.INTERFACEDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.INTERFACEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.INTERFACEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.INTERFACEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.INTERFACEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.INTERFACEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.INTERFACEDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.INTERFACEDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.INTERFACEDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.INTERFACEDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
						case Java_PackageLiterals.INTERFACEDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
					}
					//return this.eGetFromTypeDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
