import java.util.ArrayList;

class DotCom{

	private ArrayList<String> locationCells;
	// private int numOfHits = 0;

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	} 

	public String checkYourself(String userInput) {
		
		String result = "miss";

		int index = locationCells.indexOf(userInput);

		if(index >= 0) {

			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result = "kill";
			} else{
				result = "hit";
			}
		}
		return result;
	}
}

class Start{
	public static void main(String[] args){

		int numOfGuess = 0;
		DotCom theDotCom = new DotCom();

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
