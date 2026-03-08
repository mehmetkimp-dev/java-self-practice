package week04;

public class NestedIf {
    public static void main(String[] args) {

        boolean isPrimeMember = true;
        double orderAmount = 45.50;



    }
}


/*
4) Create a new class NestedIf and add a main method
📦 Shipping Eligibility Based on Prime and Order Amount:
-Declare boolean isPrimeMember and double orderAmount variables;
-Declare String variable shipping
-Outer if checks if user is isPrimeMember
    -Inside that:
        - order is 35.0 or more -> shipping - "Free same day shipping"
        - otherwise -> shipping - "Free prime shipping"
-Else(not prime):
    -Inside that:
        - order is 35.0 or more -> shipping - "Free regular shipping"
        - otherwise -> shipping - "$5.99 shipping fee"

-print out orderAmount along with shipping info
 */