class SimpleDotCom{

	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs){
		locationCells = locs;
	} 

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}

class Start{
	public static void main(String[] args){

		int numOfGuess = 0;
		SimpleDotCom theDotCom = new SimpleDotCom();

		GameHelper helper = new GameHelper();

		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};

		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive = true){
			String guess = helper.GetUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuess++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuess + " guesses");
			}
		}

	}
}
