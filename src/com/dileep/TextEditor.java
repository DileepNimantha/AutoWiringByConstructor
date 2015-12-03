package com.dileep;

public class TextEditor {
	private SpellChecker spellchecker;
	private String name;

	public TextEditor(SpellChecker spellchecker, String name) {
		this.spellchecker = spellchecker;
		this.name = name;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void spellCheck() {
		spellchecker.checkSpelling();
	}
}
