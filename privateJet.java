public class privateJet extends plane{
    private person owner;

    public privateJet(person owner,String model, int capacity, String airline){
        super(model, capacity, airline);
        this.owner = owner;
    }
    public String status(){
        return "PrivateJet for " + owner.toString();
    }
}
