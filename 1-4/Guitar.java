class ElectricGuitar{
	String brand;
	int numOfPickUps;
	boolean RockStarUsesIt;

	String getBrand(){
		return brand;
	}

	void setBrand(String aBrand){
		brand = aBrand;
	}

	int getNumOfPickUps(){
		return numOfPickUps;
	}

	void setNumOfPickUps(int aNumOfPickUps){
		numOfPickUps = aNumOfPickUps;
	}

	boolean getRockStarUsesIt(){
		return RockStarUsesIt;
	}

	void setRockStarUsesIt(boolean yesOrNot){
		RockStarUsesIt = yesOrNot;
	}
}