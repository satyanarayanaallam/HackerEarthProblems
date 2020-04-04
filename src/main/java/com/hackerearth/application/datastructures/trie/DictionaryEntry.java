package com.hackerearth.application.datastructures.trie;

import org.springframework.stereotype.Component;

@Component
public class DictionaryEntry {

	private String text;
	private int priority;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}
