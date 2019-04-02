/* Timed Reading is an educational tool used in many schools to improve and advance reading skills. A young elementary student has just finished his very first timed reading exercise. Unfortunately he's not a very good reader yet, so whenever he encountered a word longer than maxLength, he simply skipped it and read on.

Help the teacher figure out how many words the boy has read by calculating the number of words in the text he has read, no longer than maxLength.
Formally, a word is a substring consisting of English letters, such that characters to the left of the leftmost letter and to the right of the rightmost letter are not letters.

Example

For maxLength = 4 and
text = "The Fox asked the stork, 'How is the soup?'",
the output should be
timedReading(maxLength, text) = 7.

The boy has read the following words: "The", "Fox", "the", "How", "is", "the", "soup". 
*/


int timedReading(int maxLength, String text) {
    
    int count =0;
    String fixed = fix_string(text);
    String[] module = fixed.split(" ");
    
    
    
    for(int i=0; i<module.length; i++){
        if(module[i].equals("")) continue;
        
        if(module[i].length() <= maxLength){
            count++;
        }
    }
    
    
    return count;
    
}

String fix_string(String text){
    
    String sub = "";
    
    for(int i=0; i<text.length(); i++){
        char sub2 = text.charAt(i);
        
        if(sub2==' '){
            sub+=Character.toString(sub2);
        }else if(sub2>=65 && sub2<=90){
            sub+=Character.toString(sub2);
        }else if(sub2>=97 && sub2<=122){
            sub+=Character.toString(sub2);
        }
    }
 
    return sub;
    
}
