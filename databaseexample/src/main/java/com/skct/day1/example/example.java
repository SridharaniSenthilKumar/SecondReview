package com.skct.day1.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="cinema")
public class example
{
	@Id
	
private int noofcast;
private String actor;
private String actress;
private String mdirector;
private String song;
private String theme;
private String director;
private String mname;
private String playbacksinger;

public int getnoofcast() {
	return noofcast;
}
public void setnoofcast(int noofcast) {
	this.noofcast = noofcast;
}

public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public String getActress() {
	return actress;
}
public void setActress(String actress) {
	this.actress = actress;
}
public String getMdirector() {
	return mdirector;
}
public void setMdirector(String mdirector) {
	this.mdirector = mdirector;
}
public String getSong() {
	return song;
}
public void setSong(String song) {
	this.song = song;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getmname() {
	return mname;
}
public void setmname(String mname) {
	this.mname = mname;
}
public String getPlaybacksinger() {
	return playbacksinger;
}
public void setPlaybacksinger(String playbacksinger) {
	this.playbacksinger = playbacksinger;
}
}