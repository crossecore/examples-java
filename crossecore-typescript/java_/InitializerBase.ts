import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {BodyDeclarationImpl} from "./BodyDeclarationImpl";
import {Initializer} from "./Initializer";
import {Block} from "./Block";
		
			export class InitializerBase
			extends BodyDeclarationImpl
			implements Initializer
			{
				private _body:Block = null;
				get body():Block{
				
					return this._body;
				}
				set body(value:Block) {
					if (value != this._body) {
						let msgs:NotificationChain = null;
						if (this._body != null){
							msgs = (this._body).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INITIALIZER_BODY, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.INITIALIZER_BODY, /*null*/ null, msgs);
						}
						msgs = this.basicSetBody(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.INITIALIZER_BODY , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return InitializerBase.eStaticClass;
				}
			
			
				public basicSetBody(newobj:Block, msgs:NotificationChain):NotificationChain {
					let oldobj = this._body;
					this._body = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.INITIALIZER_BODY, oldobj, newobj);
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
						case Java_PackageLiterals.INITIALIZER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.INITIALIZER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.INITIALIZER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.INITIALIZER_NAME:
							return this.name;
						case Java_PackageLiterals.INITIALIZER_PROXY:
							return this.proxy;
						case Java_PackageLiterals.INITIALIZER_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.INITIALIZER_ABSTRACTTYPEDECLARATION:
							return this.abstractTypeDeclaration;
						case Java_PackageLiterals.INITIALIZER_ANNOTATIONS:
							return this.annotations;
						case Java_PackageLiterals.INITIALIZER_ANONYMOUSCLASSDECLARATIONOWNER:
							return this.anonymousClassDeclarationOwner;
						case Java_PackageLiterals.INITIALIZER_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.INITIALIZER_BODY:
							return this.body;
					}
					//return this.eGetFromBodyDeclaration(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.INITIALIZER_BODY:
							this.body = <Block> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
