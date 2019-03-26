/*
Given a positive integer number and a certain length, we need to modify the given number to have a specified length. We are allowed to do that either by cutting out leading digits (if the number needs to be shortened) or by adding 0s in front of the original number.

Example

For number = 1234 and width = 2, the output should be
integerToStringOfFixedWidth(number, width) = "34";
For number = 1234 and width = 4, the output should be
integerToStringOfFixedWidth(number, width) = "1234";
*/



String integerToStringOfFixedWidth(int number, int width) {

    String sub = Integer.toString(number);
    
    if(sub.length() <width) {
        
        while(sub.length()!= width) {
            sub= "0"+ sub;
        }
    }else if(sub.length() > width) {
        
        while(sub.length()!= width){
            sub = sub.substring(1);
        }
    }
    
    return sub;
}


