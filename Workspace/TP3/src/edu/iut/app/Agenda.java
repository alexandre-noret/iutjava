package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class Agenda extends ExamEvent /* EX2: COLLECTION d'ExamEvent */ {
	protected ArrayList<ExamEvent> ListeExam;
	public Agenda() {		
	}
	public Agenda(ArrayList<ExamEvent> ListeExam){
	this.ListeExam=ListeExam;
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	private void add(ExamEvent examEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
