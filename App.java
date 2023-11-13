



public class App {
    
    public static void main(String[] args) {
    
    MemberPlatinum member = new MemberPlatinum();// polymorphism
    member.hitungJumlahBayar(23500000);
    member.getPoin();
    
    
    System.out.println("Diskon: "+member.hitungJumlahBayar(23500000) );
    System.out.println("totalBelanja:" + 23500000);
    }
}
