package accessmodifiers;
final class ImmutableClass
{
    private final String name;
    public ImmutableClass(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
// class SubClass extends ImmutableClass { // This would cause a compilation error as ImmutableClass is final
//     // ...
// }
public class FinalClass
{
    public static void main(String[] args)
    {
        ImmutableClass ic = new ImmutableClass("Nagraj");
        System.out.println("Name :"+ic.getName());
    }
}
