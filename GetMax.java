

public int getMaxNumberInArray(int[] numbersList) throws IllegalArgumentException {
	
	if( numbersList.length < 1 ){
		throw new IllegalArgumentException("numbersList is empty");
	}
	
    int maxNumber = numbersList[0];
    for (int i = 1; i < numbersList.length; i++) {
        maxNumber = getMaxNumber(maxNumber, numbersList[i]);
    }
    
    return maxNumber;
}

private int getMaxNumber(int number1, int number2) {
    if(number1 > number2){
		return number1;
	}
	else{
		return number2;
	}
    
}


public void printAnyThing(){
	System.out.print("xx");
}
