package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u212/12974/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, April 1, 2019 9:32:03 PM PDT
*/


/**
    * DynValue objects support the manipulation of IDL non-boxed value types.
    * The DynValue interface can represent both null and non-null value types.
    * For a DynValue representing a non-null value type, the DynValue's components comprise
    * the public and private members of the value type, including those inherited from concrete base value types,
    * in the order of definition. A DynValue representing a null value type has no components
    * and a current position of -1.
    * <P>Warning: Indiscriminantly changing the contents of private value type members can cause the value type
    * implementation to break by violating internal constraints. Access to private members is provided to support
    * such activities as ORB bridging and debugging and should not be used to arbitrarily violate
    * the encapsulation of the value type. 
    */
public interface DynValue extends DynValueOperations, org.omg.DynamicAny.DynValueCommon, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynValue
