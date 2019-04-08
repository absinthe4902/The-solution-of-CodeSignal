/*Given a character, check if it represents an odd digit, an even digit or not a digit at all.

Example

For symbol = '5', the output should be
characterParity(symbol) = "odd";
For symbol = '8', the output should be
characterParity(symbol) = "even";
For symbol = 'q', the output should be
characterParity(symbol) = "not a digit".

*/


String characterParity(char symbol) {

  
    
    if('0'<=symbol && symbol <='9'){
        int sub = symbol-48;
        if(sub%2==0){
            return "even";
        }else return "odd";
    }
    return "not a digit";
}
