package Main;

import Model.Armory;
import Model.Player;
import Model.Ranking;
import Model.Weapon;

public class Main {
	
	private static Ranking ranking;
	private static Armory armory;
	
	public Main(){
		
	}
	
	public static void main(String[] args) {
		
		ranking = new Ranking();
		armory =  new Armory();
		
		Player p1 = new Player("Santiago1", "0001", "Xbox", 0);
		Player p2 = new Player("Santiago2", "0002", "PSP4", 1);
		Player p3 = new Player("Santiago3", "0003", "Windos", 34);
		Player p4 = new Player("Santiago4", "0004", "Xbox", 100);
		Player p5 = new Player("Santiago5", "0005", "MacOs", 3);
		Player p6 = new Player("Santiago6", "0006", "Android", 56);
		
		ranking.insertStak(p1);
		ranking.insertStak(p2);
		ranking.insertStak(p3);
		ranking.insertStak(p4);
		ranking.insertStak(p5);
		ranking.insertStak(p6);
		
		
		Weapon w1 = new Weapon("100","AK-47");
		Weapon w2 = new Weapon("150","Minigun");
		Weapon w3 = new Weapon("250","Pistola");
		Weapon w4 = new Weapon("240","Rifle");
		Weapon w5 = new Weapon("230","Escopeta");
		Weapon w6 = new Weapon("480","Hacha");
		
		
		for(int i =0;i<ranking.longitude();i++) {
			if(ranking.getTop()!=null) {
				System.out.println(ranking.getTop().getName());
			}
			ranking.getTop().setNext(ranking.getTop().getNext());
			ranking.setTop(ranking.getTop().getNext());
		}
		
		System.out.println("--------//----------");
		
		armory.enQueue(w6);
		armory.enQueue(w2);
		armory.enQueue(w3);
		armory.enQueue(w4);
		armory.enQueue(w5);
		armory.enQueue(w1);
		
		for(int i =0;i<armory.longitude();i++) {
			if(armory.getFirst()!=null){
				System.out.println(armory.getFirst().getName());
				armory.setFirts(armory.getFirst().getNext());
			}
		}
	}

}
