package accessmodifiers;

import accessmodifiers.package1.MyClass;
import accessmodifiers.package1.SamePackageClass;
import accessmodifiers.package2.SubClassDifferentPackage;

public class MyAccessModifiersClass
{
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.demonstrateAccess();

        SamePackageClass samePackageObject = new SamePackageClass();
        samePackageObject.accessMyClassMembers();

        SubClassDifferentPackage subclassObject = new SubClassDifferentPackage();
        subclassObject.accessInheritedMembers();

        // Accessing public members from a different package
        System.out.println("\nInside Main (different package):");
        System.out.println("publicVar from MyClass: " + myObject.publicVar);
        myObject.publicMethod();
    }
}
