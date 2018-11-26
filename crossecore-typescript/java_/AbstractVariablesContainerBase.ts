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
import {VariableDeclarationFragment} from "./VariableDeclarationFragment";
import {TypeAccess} from "./TypeAccess";
import {AbstractVariablesContainer} from "./AbstractVariablesContainer";
import {ASTNodeImpl} from "./ASTNodeImpl";
		
			export class AbstractVariablesContainerBase
			extends ASTNodeImpl
			implements AbstractVariablesContainer
			{
				private _type:TypeAccess = null;
				get type():TypeAccess{
				
					return this._type;
				}
				set type(value:TypeAccess) {
					if (value != this._type) {
						let msgs:NotificationChain = null;
						if (this._type != null){
							msgs = (this._type).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE, /*null*/ null, msgs);
						}
						msgs = this.basicSetType(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE , value, value));
					}
				}
				private _fragments:OrderedSet<VariableDeclarationFragment> = null;
				
				get fragments():OrderedSet<VariableDeclarationFragment>{
					if(this._fragments===null){
						this._fragments = new OrderedSet<VariableDeclarationFragment>(this, Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, Java_PackageLiterals.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER);
							
					}
					return this._fragments;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return AbstractVariablesContainerBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
							return this.fragments.basicAdd(otherEnd as VariableDeclarationFragment, msgs);
					}
					//return this.eInverseAddFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromAbstractVariablesContainer = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
							return this.fragments.basicRemove(otherEnd as VariableDeclarationFragment, msgs);
					}
					//return this.eInverseRemoveFromASTNode(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromAbstractVariablesContainer = this.eInverseRemove;
			
				public basicSetType(newobj:TypeAccess, msgs:NotificationChain):NotificationChain {
					let oldobj = this._type;
					this._type = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE, oldobj, newobj);
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
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE:
							return this.type;
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
							return this.fragments;
					}
					//return this.eGetFromASTNode(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE:
							this.type = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
							this.fragments.clear();
							this.fragments.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
