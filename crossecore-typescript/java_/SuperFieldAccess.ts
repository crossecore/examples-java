import {Set} from "ecore/Set";
import {AbstractTypeQualifiedExpression} from "./AbstractTypeQualifiedExpression";
import {SingleVariableAccess} from "./SingleVariableAccess";

export interface SuperFieldAccess
extends AbstractTypeQualifiedExpression

{
	
	field:SingleVariableAccess;
	

}

