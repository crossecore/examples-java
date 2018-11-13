

import {XmiResource} from "ecore/XmiResource";

import {Java_FactoryImpl} from 'java_/Java_FactoryImpl';
import {Java_PackageImpl} from "java_/Java_PackageImpl";
import {FieldDeclarationImpl} from "java_/FieldDeclarationImpl";
import {FieldDeclarationBase} from "java_/FieldDeclarationBase";
import {DOMParser} from 'xmldom';


import * as fs from 'fs';
import * as path from 'path';



fs.readFile(path.join(__dirname, 'org.eclipse.gmt.modisco.java.kyanos.xmi'), 'utf8', (error, data) => {



    let resource = new XmiResource(Java_PackageImpl.eINSTANCE, Java_FactoryImpl.eINSTANCE, new DOMParser());

    let root = resource.load(data);
    console.log(root);
})

/*
describe("Grabats09", () => {
    it("should work", () => {

        /*
        let resource = new XmiResource();
        resource.load('org.ecipse.gmt.modisco.java.kyanos.xmi');

        TypeDeclarationImpl.allInstances().
        select(each => each.bodyDeclarations.
        exists(bd =>
            bd instanceof MethodDeclarationImpl
            && (!(bd.modifier===null))
            && bd.modifier.static
            && (!((<MethodDeclarationImpl>bd).returnType===null))
            && (!((<MethodDeclaration>bd).returnType.type===null))
            && (<MethodDeclaration>bd).returnType.type === each)
        ).asSequence();
        * /

        expect(true).toBe(true);
    });
});
*/

