class bankacount{
    private String accountholder;
    private String balance;

    public String getaccountholder(){
        return accountholder;

    }
    public void setaccountholder(String accountholder){
       this. accountholder=accountholder;


    }
    public String getbalance(){
        return balance;

    }
    public void setbalance(String blance){
       this. balance=blance;

    }
}
public class profesionalencpsltion {

    public static void main(String[]args){
        bankacount b=new bankacount();
        b.setaccountholder("Ahmed");
        b.setbalance("40000");
System.out.println(b.getaccountholder());
System.out.println(b.getbalance());
    }
}
