package com.cn.domain;

/**
 * @author 王志南
 *
 */
public class Language {
	private String name;
	private int language_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public Language(String name, int language_id) {
		super();
		this.name = name;
		this.language_id = language_id;
	}
	public Language() {
		super();
	}
	
}
