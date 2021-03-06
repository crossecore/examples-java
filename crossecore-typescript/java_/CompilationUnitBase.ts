import {OrderedSet} from "ecore/OrderedSet";
import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {CompilationUnit} from "./CompilationUnit";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Comment} from "./Comment";
import {ImportDeclaration} from "./ImportDeclaration";
import {NamedElementImpl} from "./NamedElementImpl";
import {Package} from "./Package";
import {AbstractTypeDeclaration} from "./AbstractTypeDeclaration";
		
			export class CompilationUnitBase
			extends NamedElementImpl
			implements CompilationUnit
			{
				private _originalFilePath:string = '';
				get originalFilePath():string{
					return this._originalFilePath;
				}
				set originalFilePath(value:string){
					this._originalFilePath = value; 
				}
				private _commentList:OrderedSet<Comment> = null;
				
				get commentList():OrderedSet<Comment>{
					if(this._commentList===null){
						this._commentList = new OrderedSet<Comment>(this, Java_PackageLiterals.COMPILATIONUNIT_COMMENTLIST, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.COMPILATIONUNIT_COMMENTLIST);
							
					}
					return this._commentList;
					
				}
				
				
				private _imports:OrderedSet<ImportDeclaration> = null;
				
				get imports():OrderedSet<ImportDeclaration>{
					if(this._imports===null){
						this._imports = new OrderedSet<ImportDeclaration>(this, Java_PackageLiterals.COMPILATIONUNIT_IMPORTS, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.COMPILATIONUNIT_IMPORTS);
							
					}
					return this._imports;
					
				}
				
				
				private _package:Package = null;
				get package():Package{
				
					return this._package;
				}
				set package(value:Package) {
					let oldvalue = this._package;
					this._package = value;
					if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.COMPILATIONUNIT_PACKAGE , oldvalue, value));
					}
				}
				private _types:OrderedSet<AbstractTypeDeclaration> = null;
				
				get types():OrderedSet<AbstractTypeDeclaration>{
					if(this._types===null){
						this._types = new OrderedSet<AbstractTypeDeclaration>(this, Java_PackageLiterals.COMPILATIONUNIT_TYPES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.COMPILATIONUNIT_TYPES);
							
					}
					return this._types;
					
				}
				
				

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return CompilationUnitBase.eStaticClass;
				}
			
			
				public basicSetPackage(newobj:Package, msgs:NotificationChain):NotificationChain {
					let oldobj = this._package;
					this._package = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.COMPILATIONUNIT_PACKAGE, oldobj, newobj);
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
						case Java_PackageLiterals.COMPILATIONUNIT_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.COMPILATIONUNIT_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.COMPILATIONUNIT_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.COMPILATIONUNIT_NAME:
							return this.name;
						case Java_PackageLiterals.COMPILATIONUNIT_PROXY:
							return this.proxy;
						case Java_PackageLiterals.COMPILATIONUNIT_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.COMPILATIONUNIT_ORIGINALFILEPATH:
							return this.originalFilePath;
						case Java_PackageLiterals.COMPILATIONUNIT_COMMENTLIST:
							return this.commentList;
						case Java_PackageLiterals.COMPILATIONUNIT_IMPORTS:
							return this.imports;
						case Java_PackageLiterals.COMPILATIONUNIT_PACKAGE:
							return this.package;
						case Java_PackageLiterals.COMPILATIONUNIT_TYPES:
							return this.types;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.COMPILATIONUNIT_ORIGINALFILEPATH:
							this.originalFilePath = <string> newValue;
							return;
						case Java_PackageLiterals.COMPILATIONUNIT_COMMENTLIST:
							this.commentList.clear();
							this.commentList.addAll(newValue);
							return;
						case Java_PackageLiterals.COMPILATIONUNIT_IMPORTS:
							this.imports.clear();
							this.imports.addAll(newValue);
							return;
						case Java_PackageLiterals.COMPILATIONUNIT_PACKAGE:
							this.package = <Package> newValue;
							return;
						case Java_PackageLiterals.COMPILATIONUNIT_TYPES:
							this.types.clear();
							this.types.addAll(newValue);
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
