package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/CannotProceedHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u212/12974/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, April 1, 2019 9:32:03 PM PDT
*/

abstract public class CannotProceedHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.NamingContextPackage.CannotProceed that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.NamingContextPackage.CannotProceed extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CosNaming.NamingContextHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "cxt",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CosNaming.NameComponentHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CosNaming.NameHelper.id (), "Name", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "rest_of_name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id (), "CannotProceed", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.NamingContextPackage.CannotProceed read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CosNaming.NamingContextPackage.CannotProceed value = new org.omg.CosNaming.NamingContextPackage.CannotProceed ();
    // read and discard the repository ID
    istream.read_string ();
    value.cxt = org.omg.CosNaming.NamingContextHelper.read (istream);
    value.rest_of_name = org.omg.CosNaming.NameHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.NamingContextPackage.CannotProceed value)
  {
    // write the repository ID
    ostream.write_string (id ());
    org.omg.CosNaming.NamingContextHelper.write (ostream, value.cxt);
    org.omg.CosNaming.NameHelper.write (ostream, value.rest_of_name);
  }

}
