int[][] boxBlur(int[][] image) {
		
		int count =0;
		int number = 0;
		int number2 = 0;
		int a = image.length-2;
		int b = image[0].length-2;
		
		int a2[] = new int[a*b];
		int a1[][] = new int[a][b];
		
		
		
		while(count<=(a*b)-1) {
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
					a2[count]+= image[i+number][j+number2];
				
			}
		}
	
		
		count++;
		number2++;
		
		if(number2==b) {
			number++;
			number2=0;
			
			if(number==a) {
				break;
			}
		}
		
		}
		
		
	
		
	count =0;
	for(int i =0; i<a; i++) {
		for(int j =0; j<b; j++) {
			a1[i][j] = a2[count]/9;
			count++;
		}
	}
	
	
	
	return a1;
}
