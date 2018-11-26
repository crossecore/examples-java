import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {BreakStatement} from "./BreakStatement";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {LabeledStatement} from "./LabeledStatement";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
import {NamedElementImpl} from "./NamedElementImpl";
import {ContinueStatement} from "./ContinueStatement";
		
			export class LabeledStatementBase
			extends NamedElementImpl
			implements LabeledStatement
			{
				private _body:Statement = null;
				get body():Statement{
				
					return this._body;
				}
				set body(value:Statement) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.LABELEDSTATEMENT_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.LABELEDSTATEMENT_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.LABELEDSTATEMENT_BODY , value, value));
					}
				}
				private _usagesInBreakStatements:Set<BreakStatement> = null;
				
				get usagesInBreakStatements():Set<BreakStatement>{
					if(this._usagesInBreakStatements===null){
						this._usagesInBreakStatements = new Set<BreakStatement>(this, Java_PackageLiterals.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS, Java_PackageLiterals.BREAKSTATEMENT_LABEL);
							
					}
					return this._usagesInBreakStatements;
					
				}
				
				
				private _usagesInContinueStatements:Set<ContinueStatement> = null;
				
				get usagesInContinueStatements():Set<ContinueStatement>{
					if(this._usagesInContinueStatements===null){
						this._usagesInContinueStatements = new Set<ContinueStatement>(this, Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, Java_PackageLiterals.CONTINUESTATEMENT_LABEL);
							
					}
					return this._usagesInContinueStatements;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return LabeledStatementBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
							return this.usagesInBreakStatements.basicAdd(otherEnd as BreakStatement, msgs);
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
							return this.usagesInContinueStatements.basicAdd(otherEnd as ContinueStatement, msgs);
					}
					//return this.eInverseAddFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromLabeledStatement = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
							return this.usagesInBreakStatements.basicRemove(otherEnd as BreakStatement, msgs);
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
							return this.usagesInContinueStatements.basicRemove(otherEnd as ContinueStatement, msgs);
					}
					//return this.eInverseRemoveFromNamedElement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromLabeledStatement = this.eInverseRemove;
			
				public basicSetBody(newobj:Statement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.LABELEDSTATEMENT_BODY, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.LABELEDSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.LABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.LABELEDSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.LABELEDSTATEMENT_NAME:
							return this.name;
						case Java_PackageLiterals.LABELEDSTATEMENT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.LABELEDSTATEMENT_BODY:
							return this.body;
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
							return this.usagesInBreakStatements;
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
							return this.usagesInContinueStatements;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.LABELEDSTATEMENT_BODY:
							this.body = <Statement> newValue;
							return;
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
							this.usagesInBreakStatements.clear();
							this.usagesInBreakStatements.addAll(newValue);
							return;
						case Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
							this.usagesInContinueStatements.clear();
							this.usagesInContinueStatements.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === StatementImpl) {
						switch (derivedFeatureID) {
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === StatementImpl) {
						switch (baseFeatureID) {
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			
