public class VIP extends person{
    private privateJet Jet;

    public VIP(String firstName, String lastName, int age,privateJet Jet) {
        super(firstName, lastName, age);
        this.Jet = Jet;
    }
    
    public String toString(){
        return super.toString() + " owns "+ Jet.toString();
    }
}
