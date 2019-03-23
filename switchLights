/*
N candles are placed in a row, some of them are initially lit. For each candle from the 1st to the Nth the following algorithm is applied: if the observed candle is lit then states of this candle and all candles before it are changed to the opposite. Which candles will remain lit after applying the algorithm to all candles in the order they are placed in the line?

Example

For a = [1, 1, 1, 1, 1], the output should be
switchLights(a) = [0, 1, 0, 1, 0]. */



int[] switchLights(int[] a) {
    
    int sub = -1;
    
    for(int i=0; i<a.length; i++){
        if(a[i]==1){
            for(int j=i; j>=0; j--){
                a[j]= a[j]+(sub);
                a[j] = Math.abs(a[j]);
            }
        }
    }
    
    return a;
}
