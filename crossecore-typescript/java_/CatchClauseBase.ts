import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {SingleVariableDeclaration} from "./SingleVariableDeclaration";
import {StatementImpl} from "./StatementImpl";
import {Block} from "./Block";
import {CatchClause} from "./CatchClause";
		
			export class CatchClauseBase
			extends StatementImpl
			implements CatchClause
			{
				private _exception:SingleVariableDeclaration = null;
				get exception():SingleVariableDeclaration{
				
					return this._exception;
				}
				set exception(value:SingleVariableDeclaration) {
					if (value != this._exception) {
						let msgs:NotificationChain = null;
						if (this._exception != null){
							msgs = (this._exception).eInverseRemove(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, /*CatchClause*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, /*CatchClause*/ null, msgs);
						}
						msgs = this.basicSetException(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CATCHCLAUSE_EXCEPTION , value, value));
					}
				}
				private _body:Block = null;
				get body():Block{
				
					return this._body;
				}
				set body(value:Block) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CATCHCLAUSE_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.CATCHCLAUSE_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.CATCHCLAUSE_BODY , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return CatchClauseBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CATCHCLAUSE_EXCEPTION:
							if (this._exception != null){
								msgs = this._exception.eInverseRemove(this, Java_PackageLiterals.CATCHCLAUSE_EXCEPTION, /*SingleVariableDeclaration*/ null, msgs);
							}
							return this.basicSetException(otherEnd as SingleVariableDeclaration, msgs);
					}
					//return this.eInverseAddFromStatement(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromCatchClause = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.CATCHCLAUSE_EXCEPTION:
							return this.basicSetException(null, msgs);
					}
					//return this.eInverseRemoveFromStatement(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromCatchClause = this.eInverseRemove;
			
				public basicSetException(newobj:SingleVariableDeclaration, msgs:NotificationChain):NotificationChain {
					let oldobj = this._exception;
					this._exception = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CATCHCLAUSE_EXCEPTION, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetBody(newobj:Block, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.CATCHCLAUSE_BODY, oldobj, newobj);
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
						case Java_PackageLiterals.CATCHCLAUSE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.CATCHCLAUSE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.CATCHCLAUSE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.CATCHCLAUSE_EXCEPTION:
							return this.exception;
						case Java_PackageLiterals.CATCHCLAUSE_BODY:
							return this.body;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.CATCHCLAUSE_EXCEPTION:
							this.exception = <SingleVariableDeclaration> newValue;
							return;
						case Java_PackageLiterals.CATCHCLAUSE_BODY:
							this.body = <Block> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
