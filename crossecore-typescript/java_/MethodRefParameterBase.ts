import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {MethodRefParameter} from "./MethodRefParameter";
import {TypeAccess} from "./TypeAccess";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class MethodRefParameterBase
			extends ASTNodeImpl
			implements MethodRefParameter
			{
				private _name:string = '';
				get name():string{
					return this._name;
				}
				set name(value:string){
					this._name = value; 
				}
				private _varargs:boolean = false;
				get varargs():boolean{
					return this._varargs;
				}
				set varargs(value:boolean){
					this._varargs = value; 
				}
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODREFPARAMETER_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.METHODREFPARAMETER_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.METHODREFPARAMETER_TYPE , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return MethodRefParameterBase.eStaticClass;
				}
			
			
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.METHODREFPARAMETER_TYPE, oldobj, newobj);
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
						case Java_PackageLiterals.METHODREFPARAMETER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.METHODREFPARAMETER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.METHODREFPARAMETER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.METHODREFPARAMETER_NAME:
							return this.name;
						case Java_PackageLiterals.METHODREFPARAMETER_VARARGS:
							return this.varargs;
						case Java_PackageLiterals.METHODREFPARAMETER_TYPE:
							return this.type;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.METHODREFPARAMETER_NAME:
							this.name = <string> newValue;
							return;
						case Java_PackageLiterals.METHODREFPARAMETER_VARARGS:
							this.varargs = <boolean> newValue;
							return;
						case Java_PackageLiterals.METHODREFPARAMETER_TYPE:
							this.type = <TypeAccess> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
