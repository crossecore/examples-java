import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {ClassDeclarationImpl} from "./ClassDeclarationImpl";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
import {UnresolvedClassDeclaration} from "./UnresolvedClassDeclaration";
		
			export class UnresolvedClassDeclarationBase
			extends ClassDeclarationImpl
			implements UnresolvedClassDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedClassDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_BODYDECLARATIONS:
							return this.bodyDeclarations;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_COMMENTSBEFOREBODY:
							return this.commentsBeforeBody;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_COMMENTSAFTERBODY:
							return this.commentsAfterBody;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_PACKAGE:
							return this.package;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_SUPERINTERFACES:
							return this.superInterfaces;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.UNRESOLVEDCLASSDECLARATION_SUPERCLASS:
							return this.superClass;
					}
					//return this.eGetFromClassDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === UnresolvedItemImpl) {
						switch (derivedFeatureID) {
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === UnresolvedItemImpl) {
						switch (baseFeatureID) {
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
