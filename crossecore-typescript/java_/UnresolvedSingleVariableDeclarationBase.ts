import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {UnresolvedSingleVariableDeclaration} from "./UnresolvedSingleVariableDeclaration";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
import {SingleVariableDeclarationImpl} from "./SingleVariableDeclarationImpl";
		
			export class UnresolvedSingleVariableDeclarationBase
			extends SingleVariableDeclarationImpl
			implements UnresolvedSingleVariableDeclaration
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedSingleVariableDeclarationBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
							return this.extraArrayDimensions;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_INITIALIZER:
							return this.initializer;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS:
							return this.usageInVariableAccess;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_VARARGS:
							return this.varargs;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_TYPE:
							return this.type;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_METHODDECLARATION:
							return this.methodDeclaration;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_CATCHCLAUSE:
							return this.catchClause;
						case Java_PackageLiterals.UNRESOLVEDSINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
							return this.enhancedForStatement;
					}
					//return this.eGetFromSingleVariableDeclaration(featureID, resolve, coreType);
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
			
