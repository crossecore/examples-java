import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {ParameterizedType} from "./ParameterizedType";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {TypeAccess} from "./TypeAccess";
import {TypeImpl} from "./TypeImpl";
		
			export class ParameterizedTypeBase
			extends TypeImpl
			implements ParameterizedType
			{
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE , value, value));
					}
				}
				private _typeArguments:OrderedSet<TypeAccess> = null;
				
				get typeArguments():OrderedSet<TypeAccess>{
					if(this._typeArguments===null){
						this._typeArguments = new OrderedSet<TypeAccess>(this, Java_PackageLiterals.PARAMETERIZEDTYPE_TYPEARGUMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.PARAMETERIZEDTYPE_TYPEARGUMENTS);
							
					}
					return this._typeArguments;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ParameterizedTypeBase.eStaticClass;
				}
			
			
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE, oldobj, newobj);
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
						case Java_PackageLiterals.PARAMETERIZEDTYPE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_NAME:
							return this.name;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_USAGESINTYPEACCESS:
							return this.usagesInTypeAccess;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE:
							return this.type;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_TYPEARGUMENTS:
							return this.typeArguments;
					}
					//return this.eGetFromType(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.PARAMETERIZEDTYPE_TYPE:
							this.type = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.PARAMETERIZEDTYPE_TYPEARGUMENTS:
							this.typeArguments.clear();
							this.typeArguments.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
