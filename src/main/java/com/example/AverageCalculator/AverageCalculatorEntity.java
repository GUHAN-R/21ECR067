package com.example.AverageCalculator;
import java.util.List;
import java.util.ArrayList;

public class AverageCalculatorEntity {
	
	private List<Integer>number;
	private List<Integer>windowPrevState;
	private List<Integer>windowCurState;
	private double avg;
	
	
	public AverageCalculatorEntity(List<Integer> number, List<Integer> windowPrevState, List<Integer> windowCurState,
			double avg) {
		super();
		this.number = number;
		this.windowPrevState = windowPrevState;
		this.windowCurState = windowCurState;
		this.avg = avg;
	}
	public List<Integer> getNumber() {
		return number;
	}
	public void setNumber(List<Integer> number) {
		this.number = number;
	}
	public List<Integer> getWindowPrevState() {
		return windowPrevState;
	}
	public void setWindowPrevState(List<Integer> windowPrevState) {
		this.windowPrevState = windowPrevState;
	}
	public List<Integer> getWindowCurState() {
		return windowCurState;
	}
	public void setWindowCurState(List<Integer> windowCurState) {
		this.windowCurState = windowCurState;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}
