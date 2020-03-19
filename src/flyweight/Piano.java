package flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano implements PlayMusic {
	
	public void play(List<Note> music) {
		Player player = new Player(); // For player -> Example String: "D D E F F"
		
		StringBuilder musicInNote = new StringBuilder();
		for (Note note : music) {
			musicInNote.append(note.simbol() + " ");
		}
		
		System.out.println("Music Notes: " + musicInNote.toString());
		
		player.play(musicInNote.toString());
	}

}
