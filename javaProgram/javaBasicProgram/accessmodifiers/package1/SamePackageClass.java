// File: com/example/package1/SamePackageClass.java
package accessmodifiers.package1;

public class SamePackageClass {
    public void accessMyClassMembers() {
        MyClass obj = new MyClass();
        System.out.println("\nInside SamePackageClass (same package):");
        System.out.println("publicVar: " + obj.publicVar);
        // System.out.println("privateVar: " + obj.privateVar); // ERROR: private access
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("defaultVar: " + obj.defaultVar);
        obj.publicMethod();
        // obj.privateMethod(); // ERROR: private access
        obj.protectedMethod();
        obj.defaultMethod();
    }
}
