import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {AbstractTypeDeclarationImpl} from "./AbstractTypeDeclarationImpl";
import {AnnotationTypeDeclaration} from "./AnnotationTypeDeclaration";
		
			export class AnnotationTypeDeclarationBase
			extends AbstractTypeDeclarationImpl
			implements AnnotationTypeDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AnnotationTypeDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.ANNOTATIONTYPEDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
					}
					//return this.eGetFromAbstractTypeDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
