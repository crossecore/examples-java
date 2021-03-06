import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {CompilationUnit} from "./CompilationUnit";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Comment} from "./Comment";
import {ClassFile} from "./ClassFile";
import {ASTNode} from "./ASTNode";
		
			export class ASTNodeBase
			extends BasicEObjectImpl
			implements ASTNode
			{
				private _comments:OrderedSet<Comment> = null;
				
				get comments():OrderedSet<Comment>{
					if(this._comments===null){
						this._comments = new OrderedSet<Comment>(this, Java_PackageLiterals.ASTNODE_COMMENTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ASTNODE_COMMENTS);
							
					}
					return this._comments;
					
				}
				
				
				private _originalCompilationUnit:CompilationUnit = null;
				get originalCompilationUnit():CompilationUnit{
				
					return this._originalCompilationUnit;
				}
				set originalCompilationUnit(value:CompilationUnit) {
					let oldvalue = this._originalCompilationUnit;
					this._originalCompilationUnit = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASTNODE_ORIGINALCOMPILATIONUNIT , oldvalue, value));
					}
				}
				private _originalClassFile:ClassFile = null;
				get originalClassFile():ClassFile{
				
					return this._originalClassFile;
				}
				set originalClassFile(value:ClassFile) {
					let oldvalue = this._originalClassFile;
					this._originalClassFile = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ASTNODE_ORIGINALCLASSFILE , oldvalue, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ASTNodeBase.eStaticClass;
				}
			
			
				public basicSetOriginalCompilationUnit(newobj:CompilationUnit, msgs:NotificationChain):NotificationChain {
					let oldobj = this._originalCompilationUnit;
					this._originalCompilationUnit = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASTNODE_ORIGINALCOMPILATIONUNIT, oldobj, newobj);
						if (msgs == null){
							msgs = notification;
						}
						else{
							msgs.add(notification);
						}
					}
					return msgs;
				}
				public basicSetOriginalClassFile(newobj:ClassFile, msgs:NotificationChain):NotificationChain {
					let oldobj = this._originalClassFile;
					this._originalClassFile = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ASTNODE_ORIGINALCLASSFILE, oldobj, newobj);
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
						case Java_PackageLiterals.ASTNODE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ASTNODE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ASTNODE_ORIGINALCLASSFILE:
							return this.originalClassFile;
					}
					//return this.eGetFromBasicEObjectImpl(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ASTNODE_COMMENTS:
							this.comments.clear();
							this.comments.addAll(newValue);
							return;
						case Java_PackageLiterals.ASTNODE_ORIGINALCOMPILATIONUNIT:
							this.originalCompilationUnit = <CompilationUnit> newValue;
							return;
						case Java_PackageLiterals.ASTNODE_ORIGINALCLASSFILE:
							this.originalClassFile = <ClassFile> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
