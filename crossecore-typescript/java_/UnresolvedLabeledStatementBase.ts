import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {LabeledStatementImpl} from "./LabeledStatementImpl";
import {UnresolvedLabeledStatement} from "./UnresolvedLabeledStatement";
import {UnresolvedItemImpl} from "./UnresolvedItemImpl";
		
			export class UnresolvedLabeledStatementBase
			extends LabeledStatementImpl
			implements UnresolvedLabeledStatement
			{

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return UnresolvedLabeledStatementBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_NAME:
							return this.name;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_BODY:
							return this.body;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
							return this.usagesInBreakStatements;
						case Java_PackageLiterals.UNRESOLVEDLABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
							return this.usagesInContinueStatements;
					}
					//return this.eGetFromLabeledStatement(featureID, resolve, coreType);
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
			
