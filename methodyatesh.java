class Bank{  
int rateint(){
    return 0;
}  
}   
class SBI extends Bank{  
int rateint(){
    return 3;
    }  
}  
class ICICI extends Bank{  
int rateint(){
    return 7;
    }  
}  
class AXIS extends Bank{  
int rateint(){
    return 6;
    }  
}    
public class Methodoverriding{  
    public static void main(String args[]){  
        SBI s=new SBI();  
        ICICI i=new ICICI();  
        AXIS a=new AXIS();  
        System.out.println(s.rateint());  
        System.out.println(i.rateint());  
        System.out.println(a.rateint());  
    }  
}  