/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"] 
 */
 
 
 String[] addBorder(String[] a) {

    String b[] = new String[a.length+2];
	String sub = "";
	
	for(int i=0; i<a.length; i++) {
		b[i+1] = "*"+a[i]+"*";
	}
	
	for(int i=0; i<a[0].length()+2; i++) {
		sub+= "*";
	}
	
    b[0] = sub;
	b[b.length-1] = sub;
	
	return b;
}

                     
                    
