package flyweight;

import java.util.Arrays;
import java.util.List;

public class FlyweightMain {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Begin Test Flyweight");

		MusicalNotes notes = new MusicalNotes();
		
		// Note = "fa" -> it will be the same object, using Flyweight will always return the same object, 
		// so there is no need to instantiate many objects at once.
		List<Note> music = Arrays.asList(
				notes.getNote("do"),
				notes.getNote("re"),
				notes.getNote("mi"),
				notes.getNote("fa"),
				notes.getNote("fa"),
				notes.getNote("fa"));

		System.out.println("Array music: " + music);// Fa@ ..... will point to the same instantiated object
		
		Piano piano = new Piano();
		
		piano.play(music);//unmute your computer to listen to the music
		
		System.out.println("--------------------------------------------- End Test Flyweight");
	}

}
