/*
Consider two following representations of a non-negative integer:

A simple decimal integer, constructed of a non-empty sequence of digits from 0 to 9;
An integer with at least one digit in a base from 2 to 16 (inclusive), enclosed between # characters, and preceded by the base, which can only be a number between 2 and 16 in the first representation. For digits from 10 to 15 characters a, b, ..., f and A, B, ..., F are used.
Additionally, both representations may contain underscore (_) characters; they are used only as separators for improving legibility of numbers and can be ignored while processing a number.

Your task is to determine whether the given string is a valid integer representation.

Note: this is how integer numbers are represented in the programming language Ada.

Example

For line = "123_456_789", the output should be
adaNumber(line) = true;
For line = "16#123abc#", the output should be
adaNumber(line) = true;
For line = "10#123abc#", the output should be
adaNumber(line) = false;
For line = "10#10#123ABC#", the output should be
adaNumber(line) = false;
*/


boolean adaNumber(String line) {
    
    line = line.replaceAll("_", "");
    String sample[] = null;
    String second = null;
    int first =0;
    int count = line.length() - line.replaceAll("#","").length();

    
    if(line.length()==0) return false;
    if(!line.contains("#")) return normal_liegal(line, 10);
     
    sample = line.split("#");
    if(count!=2) return false;
    else if(sample.length!=2) return false;
    
    first = Integer.parseInt(sample[0]);
    second = sample[1];
    
    if(first<2 || first>16) return false;
    if(first>10 && first<=16) return hex_liegal(second, first);
    else return normal_liegal(second, first);

}




boolean hex_liegal(String second, int first){
    
    int judge = 16-first;
    System.out.println(judge);
    
    for(int i=0; i<second.length(); i++){
        char sub = second.charAt(i);
        if(sub>='a' && sub<=('f'-judge)) continue;
        else if(sub>='A' && sub<=('F'-judge)) continue;
        else if(sub>='0' && sub<='9') continue;
        else return false;
    }
    return true;
}


boolean normal_liegal(String second, int first){
    
    for(int i=0; i<second.length(); i++){
        int sub = second.charAt(i)-48;
        if(sub>=0 && sub<first) continue;
        else return false;
    }
    
    return true;
}
