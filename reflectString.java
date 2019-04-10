/*
Define an alphabet reflection as follows: a turns into z, b turns into y, c turns into x, ..., n turns into m, m turns into n, ..., z turns into a.

Define a string reflection as the result of applying the alphabet reflection to each of its characters.

Reflect the given string.

Example

For inputString = "name", the output should be
reflectString(inputString) = "mznv".
*/

String reflectString(String inputString) {

    char Array[] =  new char[inputString.length()];
    
    for(int i=0; i<inputString.length(); i++){
        char sub = inputString.charAt(i);
        int sub2 =0;
        if(sub<='m'){
            sub2 = (sub-'a')*2+1;
            sub2 = sub+(26-sub2);
            
        }else{
            sub2 = ('z'-sub)*2+1;
            sub2 = sub-(26-sub2);
        }
        sub = (char)sub2;
        Array[i] = sub;
    }
    
    return (String.valueOf(Array));
}
