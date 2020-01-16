package com.tecthlab.playertest;

import com.techlab.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1= new Player(1,"Sachin " ,25);
		Player p2= new Player(2,"virat " , 30);
		Player p3= new Player(3,"Dhoni " , 75);
		
		p1.Display();
		p2.Display();
		p3.Display();
		p1.WhoIsElder(p2, p3);
	
		
	}

}
