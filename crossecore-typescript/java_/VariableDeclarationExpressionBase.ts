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
import {AbstractVariablesContainerImpl} from "./AbstractVariablesContainerImpl";
import {ExpressionImpl} from "./ExpressionImpl";
import {VariableDeclarationFragment} from "./VariableDeclarationFragment";
import {VariableDeclarationExpression} from "./VariableDeclarationExpression";
import {TypeAccess} from "./TypeAccess";
import {Modifier} from "./Modifier";
import {Annotation} from "./Annotation";
		
			export class VariableDeclarationExpressionBase
			extends ExpressionImpl
			implements VariableDeclarationExpression
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
				
				
				private _modifier:Modifier = null;
				get modifier():Modifier{
				
					return this._modifier;
				}
				set modifier(value:Modifier) {
					if (value != this._modifier) {
						let msgs:NotificationChain = null;
						if (this._modifier != null){
							msgs = (this._modifier).eInverseRemove(this, Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION, /*VariableDeclarationExpression*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, Java_PackageLiterals.MODIFIER_VARIABLEDECLARATIONEXPRESSION, /*VariableDeclarationExpression*/ null, msgs);
						}
						msgs = this.basicSetModifier(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER , value, value));
					}
				}
				private _annotations:OrderedSet<Annotation> = null;
				
				get annotations():OrderedSet<Annotation>{
					if(this._annotations===null){
						this._annotations = new OrderedSet<Annotation>(this, Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS);
							
					}
					return this._annotations;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return VariableDeclarationExpressionBase.eStaticClass;
				}
			
				public eInverseAdd(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain): NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
							return this.fragments.basicAdd(otherEnd as VariableDeclarationFragment, msgs);
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
							if (this._modifier != null){
								msgs = this._modifier.eInverseRemove(this, Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER, /*Modifier*/ null, msgs);
							}
							return this.basicSetModifier(otherEnd as Modifier, msgs);
					}
					//return this.eInverseAddFromExpression(otherEnd, featureID, msgs);
					return super.eInverseAdd(otherEnd, featureID, msgs);
				}
				//public eInverseAddFromVariableDeclarationExpression = this.eInverseAdd;
				
				public eInverseRemove(otherEnd:InternalEObject, featureID:number, msgs:NotificationChain):NotificationChain{
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
							return this.fragments.basicRemove(otherEnd as VariableDeclarationFragment, msgs);
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
							return this.basicSetModifier(null, msgs);
					}
					//return this.eInverseRemoveFromExpression(otherEnd, featureID, msgs);
					return super.eInverseRemove(otherEnd, featureID, msgs);
				}
				
				//public eInverseRemoveFromVariableDeclarationExpression = this.eInverseRemove;
			
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
				public basicSetModifier(newobj:Modifier, msgs:NotificationChain):NotificationChain {
					let oldobj = this._modifier;
					this._modifier = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER, oldobj, newobj);
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
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_TYPE:
							return this.type;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
							return this.fragments;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
							return this.modifier;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS:
							return this.annotations;
					}
					//return this.eGetFromExpression(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_TYPE:
							this.type = <TypeAccess> newValue;
							return;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
							this.fragments.clear();
							this.fragments.addAll(newValue);
							return;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
							this.modifier = <Modifier> newValue;
							return;
						case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS:
							this.annotations.clear();
							this.annotations.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				public eBaseStructuralFeatureID(derivedFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractVariablesContainerImpl) {
						switch (derivedFeatureID) {
							case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_TYPE: return Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE;
							case Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS: return Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS;
							default: return -1;
						}
					}
					return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
				}
				
							
				public eDerivedStructuralFeatureID_number_Function(baseFeatureID:number, baseClass:Function):number {
					if (baseClass === AbstractVariablesContainerImpl) {
						switch (baseFeatureID) {
							case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_TYPE: return Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_TYPE;
							case Java_PackageLiterals.ABSTRACTVARIABLESCONTAINER_FRAGMENTS: return Java_PackageLiterals.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS;
							default: return -1;
						}
					}
					return super.eDerivedStructuralFeatureID_number_Function(baseFeatureID, baseClass);
				}
				
			}
			