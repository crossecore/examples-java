import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {LabeledStatement} from "./LabeledStatement";
import {StatementImpl} from "./StatementImpl";
import {ContinueStatement} from "./ContinueStatement";
		
			export class ContinueStatementBase
			extends StatementImpl
			implements ContinueStatement
			{
				private _label:LabeledStatement = null;
				get label():LabeledStatement{
				
					return this._label;
				}
				set label(value:LabeledStatement) {
					if (value != this._label) {
						let msgs:NotificationChain = null;
						if (this._label != null){
							msgs = (this._label).eInverseRemove(this, Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, /*ContinueStatement*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, /*ContinueStatement*/ null, msgs);
						}
						msgs = this.basicSetLabel(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CONTINUESTATEMENT_LABEL , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ContinueStatementBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CONTINUESTATEMENT_LABEL:
							if (this._label != null){
								msgs = this._label.eInverseRemove(this, Java_PackageLiterals.CONTINUESTATEMENT_LABEL, /*LabeledStatement*/ null, msgs);
							}
							return this.basicSetLabel(otherEnd as LabeledStatement, msgs);
					}
					//return this.eInverseAddFromStatement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromContinueStatement = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CONTINUESTATEMENT_LABEL:
							return this.basicSetLabel(null, msgs);
					}
					//return this.eInverseRemoveFromStatement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromContinueStatement = this.eInverseRemove;
			
				public basicSetLabel(newobj:LabeledStatement, msgs:NotificationChain):NotificationChain {
					let oldobj = this._label;
					this._label = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CONTINUESTATEMENT_LABEL, oldobj, newobj);
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
						case Java_PackageLiterals.CONTINUESTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CONTINUESTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CONTINUESTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CONTINUESTATEMENT_LABEL:
							return this.label;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CONTINUESTATEMENT_LABEL:
							this.label = <LabeledStatement> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
