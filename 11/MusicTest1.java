import javax.sound.midi.*;

public class MusicTest1 {
	public void play(){
		
		// An exception is an object of type Exception
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("we got a sequencer");
		// Exception can be instance of any subclass of Exception due to pulymorphism
		} catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
		}

	}

	public static void main(String[] args){
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}