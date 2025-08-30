package accessmodifiers.package2;

import accessmodifiers.package1.MyClass;

public class SubClassDifferentPackage extends MyClass
{
    public void accessInheritedMembers()
    {
        System.out.println("\nInside SubclassInDifferentPackage (different package, subclass):");
        System.out.println("publicVar: " + publicVar);
        // System.out.println("privateVar: " + privateVar); // ERROR: private access
        System.out.println("protectedVar: " + protectedVar); // Accessible via inheritance
        // System.out.println("defaultVar: " + defaultVar); // ERROR: default access
        publicMethod();
        // privateMethod(); // ERROR: private access
        protectedMethod(); // Accessible via inheritance
        // defaultMethod(); // ERROR: default access
    }
}
