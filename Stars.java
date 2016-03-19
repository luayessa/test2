public void printPyramidOfStars(int baseStarsCount)
	{
		int spaceCharacterCount=0;
		
		for(int currentStarsCount= baseStarsCount; currentStarsCount > 0; currentStarsCount -= 2 )
		{
			printRepeatedCharacter(' ', spaceCharacterCount );
			printRepeatedCharacter('*', currentStarsCount);
			printRepeatedCharacter('\n', 1);
			spaceCharacterCount ++;
		}
	}
	
	
	private void printRepeatedCharacter(char repeatedCharacter, int repeatitionCount) {
    	for (int i = 0; i < repeatitionCount; i++) {
        	System.out.print(repeatedCharacter);
    	}
	}