package Game;

public class Player2 extends Player1 {
	
int health;
boolean armour;

public Player2(String name, String weapon, int health, boolean armour) {
	super(name, weapon, health);
	this.armour = armour;
	this.health=health;
}

@Override
public void damagebyGun1() {
	if(armour){
		this.health-=20;
		if(this.health<=0){ this.health=0;}
		System.out.println("Armour is on health reduced to 20 and the new health is"+this.health);
		if(this.health==0){
			System.out.println("Player is dead");
			
		}
	}
	if(!armour){
		this.health-=30;
		if(this.health<=0){
			this.health=0;
			}
		System.out.println("Armour is off health reduced to 30 and the new health is"+this.health);
		if(this.health==0){
			System.out.println("Player is dead");}}
	
}

@Override
public void damagebyGun2() {
	if(armour){
		this.health-=40;
		if(this.health<=0){ this.health=0;}
		System.out.println("Armour is on health reduced to 40 and the new health is"+this.health);
		if(this.health==0){
			System.out.println( getName()+" is dead");
			
		}
	}
	if(!armour){
		this.health-=50;
		if(this.health<=0){ this.health=0;}
		System.out.println("Armour is off health reduced to 50 and the new health is"+this.health);
		if(this.health==0){
			System.out.println( getName()+" is dead");}}  

}
}
