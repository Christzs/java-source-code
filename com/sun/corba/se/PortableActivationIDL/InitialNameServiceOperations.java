package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/InitialNameServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u212/12974/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, April 1, 2019 9:32:03 PM PDT
*/


/** Interface used to support binding references in the bootstrap name
    * service.
    */
public interface InitialNameServiceOperations 
{

  /** bind initial name
  	*/
  void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound;
} // interface InitialNameServiceOperations
