package accessmodifiers;
class A
{
    void show()
    {
        System.out.println("Relationship");
    }
}
public class ISARelationship extends A
{
    public static void main(String[] args)
    {
        ISARelationship isa = new ISARelationship();
        isa.show();
    }
}
