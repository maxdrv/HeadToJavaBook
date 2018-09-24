public class string1{
	public static void main(String[] args){
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamics"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriended", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leaveraged", "aligned",
								"targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architechture", "core competency", "stratagy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };
		
		int oneLength = wordListOne.length;	
		int twoLength = wordListTwo.length;	
		int threeLength = wordListThree.length;			

		int rand1 = (int)(Math.random()*oneLength);
		int rand2 = (int)(Math.random()*twoLength);
		int rand3 = (int)(Math.random()*threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.print("What we need is a " + phrase);
	}
}