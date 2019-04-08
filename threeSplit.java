/*
You have a long strip of paper with integers written on it in a single line from left to right. You wish to cut the paper into exactly three pieces such that each piece contains at least one integer and the sum of the integers in each piece is the same. You cannot cut through a number, i.e. each initial number will unambiguously belong to one of the pieces after cutting. How many ways can you do it?

It is guaranteed that the sum of all elements in the array is divisible by 3.

Example

For a = [0, -1, 0, -1, 0, -1], the output should be
threeSplit(a) = 4.

Here are all possible ways:

[0, -1] [0, -1] [0, -1]
[0, -1] [0, -1, 0] [-1]
[0, -1, 0] [-1, 0] [-1]
[0, -1, 0] [-1] [0, -1]
*/

//There are two points. 
//1. How to split an array and sum all of their elements. It was really hard for me to think about. 
// Because they got changed. For examle, middle has 1 element, and sometimes it has 2,3 or more elemetns. 
// You can use nested loop. All you have to do is fixing value of number1. (don't make this value 0 again)
//네스티드 루프를 써서 이리저리 원소 갯수를 바꾸는 어레이 스플릿을 구할 수 있다. 어차피 처음 값은 0부터 계속 캐리를 해가는 거라서 처음의 값은 바꿀
//필요가 없고, 대신 두번째 값을 매번 0으로 초기화 해서 계산하면 된다. 첫번째 for에서 흘러온 값으로 j=i+1이 되기 때문에
//처음에 j는 1에서 하나의 원소를 가졌다가 1에서 2개의 원소를 가졌다가 막 그럼. 두번째 for에서 값을 초기화 안하고 누적하기 때문에 본인이 j번째에 몇개의 원소를
//가지고 목표값을 만드는지 다 나온다. 그다음에 for을 벗어나면 또 i+1 부터 시작해서 자동으로 값 갱신하고 아까 한 for 다시 돌리며 원소 갯수 바꿔가며 다 
//2. You don't have to think about number 3 set. If number1 and number2 have the same value, then number 3 has the same automatically.

int threeSplit(int[] a) {
    
    long sum =0;
    int result =0;
    long goal=0; 
    long sub1 =0, sub2=0, sub3=0;
    
    for(int i=0; i<a.length; i++){
        sum+=a[i];
    }
    
    goal = sum/3;
    
   
    for(int i=0; i<a.length-2; i++){
        sub1+=a[i];
        if(sub1==goal){
            sub2=0;
            for(int j=i+1; j<a.length-1; j++){
                sub2+=a[j];
                if(sub2==goal){
                    result++;
                }
            }
        }
    }
    
   
    
    return result;
    
}


	
