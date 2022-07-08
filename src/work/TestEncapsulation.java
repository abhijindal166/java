package work;

public class TestEncapsulation {  
public static void main(String[] args) {  
  
    Account acc=new Account();  
    //setting values through setter methods  
    acc.setAcc_no(11111);  
    acc.setName("abhishek ");  
    acc.setEmail("abhijindal166@gmail.com");  
    acc.setAmount(4000);  
    //getting values through getter methods  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
