package com.hackerearth.application.datastructures.disjoint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@org.springframework.stereotype.Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x",
    "y"
})
public class Component{
	
	@JsonProperty("x")
	private int x;
	
	@JsonProperty("y")
	private int y;
	
	public Component(int x,int y){
		this.x=x;
		this.y=y;
	}
	public Component(){
	
	}
	
	@JsonProperty("x")
	public int getX() {
		return x;
	}
	
	@JsonProperty("x")
	public void setX(int x) {
		this.x = x;
	}
	
	@JsonProperty("y")
	public int getY() {
		return y;
	}
	
	@JsonProperty("y")
	public void setY(int y) {
		this.y = y;
	}
	
}