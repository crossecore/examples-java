import {EClass} from "ecore/EClass";
import {Set} from "ecore/Set";
import {NotificationChain} from "ecore/NotificationChain";
import {ENotificationImpl} from "ecore/ENotificationImpl";
import {NotificationImpl} from "ecore/NotificationImpl";
import {AbstractCollection} from "ecore/AbstractCollection";
import {Bag} from "ecore/Bag";
import {InternalEObject} from "ecore/InternalEObject";
import {BasicEObjectImpl} from "ecore/BasicEObjectImpl";
import {Java_PackageLiterals} from "./Java_PackageLiterals";
import {Archive} from "./Archive";
import {ClassFile} from "./ClassFile";
import {NamedElementImpl} from "./NamedElementImpl";
import {Manifest} from "./Manifest";
		
			export class ArchiveBase
			extends NamedElementImpl
			implements Archive
			{
				private _originalFilePath:string = '';
				get originalFilePath():string{
					return this._originalFilePath;
				}
				set originalFilePath(value:string){
					this._originalFilePath = value; 
				}
				private _classFiles:Set<ClassFile> = null;
				
				get classFiles():Set<ClassFile>{
					if(this._classFiles===null){
						this._classFiles = new Set<ClassFile>(this, Java_PackageLiterals.ARCHIVE_CLASSFILES, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARCHIVE_CLASSFILES);
							
					}
					return this._classFiles;
					
				}
				
				
				private _manifest:Manifest = null;
				get manifest():Manifest{
				
					return this._manifest;
				}
				set manifest(value:Manifest) {
					if (value != this._manifest) {
						let msgs:NotificationChain = null;
						if (this._manifest != null){
							msgs = (this._manifest).eInverseRemove(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARCHIVE_MANIFEST, /*null*/ null , msgs);
						}
						if (value != null){
							msgs = value.eInverseAdd(this, BasicEObjectImpl.EOPPOSITE_FEATURE_BASE - Java_PackageLiterals.ARCHIVE_MANIFEST, /*null*/ null, msgs);
						}
						msgs = this.basicSetManifest(value, msgs);
						if (msgs != null) {
							msgs.dispatch();
						}
					}
					else if (this.eNotificationRequired()){
						this.eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageLiterals.ARCHIVE_MANIFEST , value, value));
					}
				}

			
				public static eStaticClass:EClass;
				
				protected eStaticClass():EClass{
					
					return ArchiveBase.eStaticClass;
				}
			
			
				public basicSetManifest(newobj:Manifest, msgs:NotificationChain):NotificationChain {
					let oldobj = this._manifest;
					this._manifest = newobj;
					if (this.eNotificationRequired()) {
						let notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageLiterals.ARCHIVE_MANIFEST, oldobj, newobj);
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
						case Java_PackageLiterals.ARCHIVE_COMMENTS:
							return this.comments;
						case Java_PackageLiterals.ARCHIVE_ORIGINALCOMPILATIONUNIT:
							return this.originalCompilationUnit;
						case Java_PackageLiterals.ARCHIVE_ORIGINALCLASSFILE:
							return this.originalClassFile;
						case Java_PackageLiterals.ARCHIVE_NAME:
							return this.name;
						case Java_PackageLiterals.ARCHIVE_PROXY:
							return this.proxy;
						case Java_PackageLiterals.ARCHIVE_USAGESINIMPORTS:
							return this.usagesInImports;
						case Java_PackageLiterals.ARCHIVE_ORIGINALFILEPATH:
							return this.originalFilePath;
						case Java_PackageLiterals.ARCHIVE_CLASSFILES:
							return this.classFiles;
						case Java_PackageLiterals.ARCHIVE_MANIFEST:
							return this.manifest;
					}
					//return this.eGetFromNamedElement(featureID, resolve, coreType);
					return super.eGet(featureID, resolve, coreType);
				}
				
				public eSet_number_any(featureID:number, newValue:any):void {
					switch (featureID) {
						case Java_PackageLiterals.ARCHIVE_ORIGINALFILEPATH:
							this.originalFilePath = <string> newValue;
							return;
						case Java_PackageLiterals.ARCHIVE_CLASSFILES:
							this.classFiles.clear();
							this.classFiles.addAll(newValue);
							return;
						case Java_PackageLiterals.ARCHIVE_MANIFEST:
							this.manifest = <Manifest> newValue;
							return;
					}
					super.eSet_number_any(featureID, newValue);
				}

				
			}
			
