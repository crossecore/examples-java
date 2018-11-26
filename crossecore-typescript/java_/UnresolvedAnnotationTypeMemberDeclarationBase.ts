import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {AnnotationTypeMemberDeclarationImpl} from "./AnnotationTypeMemberDeclarationImpl";
import {UnresolvedAnnotationTypeMemberDeclaration} from "./UnresolvedAnnotationTypeMemberDeclaration";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
		
			export class UnresolvedAnnotationTypeMemberDeclarationBase
			extends AnnotationTypeMemberDeclarationImpl
			implements UnresolvedAnnotationTypeMemberDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedAnnotationTypeMemberDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_DEFAULT:
							return this.default;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_TYPE:
							return this.type;
						case Java_PackageLiterals.UNRESOLVEDANNOTATIONTYPEMEMBERDECLARATION_USAGES:
							return this.usages;
					}
					//return this.eGetFromAnnotationTypeMemberDeclaration(featureID, resolve, coreType);
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
			
