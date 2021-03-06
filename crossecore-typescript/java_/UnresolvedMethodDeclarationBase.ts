import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {UnresolvedMethodDeclaration} from "./UnresolvedMethodDeclaration";
import {MethodDeclarationImpl} from "./MethodDeclarationImpl";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
		
			export class UnresolvedMethodDeclarationBase
			extends MethodDeclarationImpl
			implements UnresolvedMethodDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedMethodDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_BODY:
							return this.body;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_PARAMETERS:
							return this.parameters;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_THROWNEXCEPTIONS:
							return this.thrownExceptions;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_TYPEPARAMETERS:
							return this.typeParameters;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_USAGESINDOCCOMMENTS:
							return this.usagesInDocComments;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_USAGES:
							return this.usages;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_RETURNTYPE:
							return this.returnType;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_REDEFINEDMETHODDECLARATION:
							return this.redefinedMethodDeclaration;
						case Java_PackageLiterals.UNRESOLVEDMETHODDECLARATION_REDEFINITIONS:
							return this.redefinitions;
					}
					//return this.eGetFromMethodDeclaration(featureID, resolve, coreType);
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
			
