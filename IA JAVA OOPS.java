class Plan {  
   String planName;    
 double dataLimitGB; 
 
    Plan(String planName, double dataLimitGB) {         this.planName = planName;         this.dataLimitGB = dataLimitGB; 
    } 
 
    void display() { 
        System.out.println("Plan Name  : " + planName); 
        System.out.println("Data Limit : " + dataLimitGB + " GB"); 
    } 
} 
 
class PostpaidPlan extends Plan { 
    String billingCycle; 
 
    PostpaidPlan(String planName, double dataLimitGB, 
                 String billingCycle) { 
        super(planName, dataLimitGB);         this.billingCycle = billingCycle; 
    } 
 
    @Override     void display() { 
        System.out.println("Plan Name     : " + planName); 
        System.out.println("Data Limit    : " + dataLimitGB + " GB"); 
        System.out.println("Billing Cycle : " + billingCycle); 
    } 
} 
 
public class TelecomPlan {     public static void main(String[] args) { 
 
        PostpaidPlan p1 =             new PostpaidPlan("Premium 599", 2.5, "Monthly"); 
 
        System.out.println("--- Postpaid Plan Details ---");         p1.display(); 
    } 
} 
