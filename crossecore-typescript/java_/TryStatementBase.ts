import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TryStatement} from "./TryStatement";
import {StatementImpl} from "./StatementImpl";
import {Block} from "./Block";
import {CatchClause} from "./CatchClause";
		
			export class TryStatementBase
			extends StatementImpl
			implements TryStatement
			{
				private _body:Block = null;
				get body():Block{
				
					return this._body;
				}
				set body(value:Block) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TRYSTATEMENT_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TRYSTATEMENT_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.TRYSTATEMENT_BODY , value, value));
					}
				}
				private _finally:Block = null;
				get finally():Block{
				
					return this._finally;
				}
				set finally(value:Block) {
					if (value != this._finally) {
						let msgs:NotificationChain = null;
						if (this._finally != null){
							msgs = (this._finally).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TRYSTATEMENT_FINALLY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TRYSTATEMENT_FINALLY, /*null*/ null, msgs);
						}
						msgs = this.basicSetFinally(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.TRYSTATEMENT_FINALLY , value, value));
					}
				}
				private _catchClauses:OrderedSet<CatchClause> = null;
				
				get catchClauses():OrderedSet<CatchClause>{
					if(this._catchClauses===null){
						this._catchClauses = new OrderedSet<CatchClause>(this, Java_PackageLiterals.TRYSTATEMENT_CATCHCLAUSES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.TRYSTATEMENT_CATCHCLAUSES);
							
					}
					return this._catchClauses;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return TryStatementBase.eStaticClass;
				}
			
			
				public basicSetBody(newobj:Block, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.TRYSTATEMENT_BODY, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetFinally(newobj:Block, msgs:NotificationChain):NotificationChain {
					let oldobj = this._finally;
					this._finally = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.TRYSTATEMENT_FINALLY, oldobj, newobj);
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
						case Java_PackageLiterals.TRYSTATEMENT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.TRYSTATEMENT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.TRYSTATEMENT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.TRYSTATEMENT_BODY:
							return this.body;
						case Java_PackageLiterals.TRYSTATEMENT_FINALLY:
							return this.finally;
						case Java_PackageLiterals.TRYSTATEMENT_CATCHCLAUSES:
							return this.catchClauses;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.TRYSTATEMENT_BODY:
							this.body = <Block> newValue;
							return;
						case Java_PackageLiterals.TRYSTATEMENT_FINALLY:
							this.finally = <Block> newValue;
							return;
						case Java_PackageLiterals.TRYSTATEMENT_CATCHCLAUSES:
							this.catchClauses.clear();
							this.catchClauses.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
