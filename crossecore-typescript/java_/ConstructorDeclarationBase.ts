import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ConstructorDeclaration} from "./ConstructorDeclaration";
import {AbstractMethodDeclarationImpl} from "./AbstractMethodDeclarationImpl";
		
			export class ConstructorDeclarationBase
			extends AbstractMethodDeclarationImpl
			implements ConstructorDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ConstructorDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_BODY:
							return this.body;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_PARAMETERS:
							return this.parameters;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_THROWNEXCEPTIONS:
							return this.thrownExceptions;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments;
						case Java_PackageLiterals.CONSTRUCTORDECLARATION_USAGES:
							return this.usages;
					}
					//return this.eGetFromAbstractMethodDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
