package flyweight;

import java.util.HashMap;
import java.util.Map;

import flyweight.notes.Do;
import flyweight.notes.Fa;
import flyweight.notes.La;
import flyweight.notes.Mi;
import flyweight.notes.Re;
import flyweight.notes.Si;
import flyweight.notes.Sol;

public class MusicalNotes {
	
	private static Map<String, Note> notes = new HashMap<>();
	
	// static constructor of the class, it is executed when the JVM loads that class. It runs only once.
	static {
		notes.put("do", new Do());
		notes.put("re", new Re());
		notes.put("mi", new Mi());
		notes.put("fa", new Fa());
		notes.put("sol", new Sol());
		notes.put("la", new La());
		notes.put("si", new Si());
	}

	// If I want to get a note, the method returns the same instance of that note, so there is no need to instantiate X objects of the same type.
	public Note getNote(String name) {
		return notes.get(name);
	}
	
}
