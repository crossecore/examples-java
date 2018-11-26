import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Statement} from "./Statement";
import {StatementImpl} from "./StatementImpl";
import {Block} from "./Block";
		
			export class BlockBase
			extends StatementImpl
			implements Block
			{
				private _statements:OrderedSet<Statement> = null;
				
				get statements():OrderedSet<Statement>{
					if(this._statements===null){
						this._statements = new OrderedSet<Statement>(this, Java_PackageLiterals.BLOCK_STATEMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.BLOCK_STATEMENTS);
							
					}
					return this._statements;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return BlockBase.eStaticClass;
				}
			
			
			
				public eGet_number_boolean_boolean(featureID:number, resolve:boolean, coreType:boolean):any{
					switch (featureID) {
						case Java_PackageLiterals.BLOCK_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.BLOCK_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.BLOCK_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.BLOCK_STATEMENTS:
							return this.statements;
					}
					//return this.eGetFromStatement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.BLOCK_STATEMENTS:
							this.statements.clear();
							this.statements.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
