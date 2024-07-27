package Game;

public class Main {

	public static void main(String[] args) {
//Player1 p1=new Player1("Robin","AK47 and Mp3",100);
//System.out.println(p1.getName());
//System.out.println(p1.getWeapon());
//System.out.println(p1.getHealth());
//p1.damagebyGun1();
//p1.damagebyGun2();
//p1.damagebyGun1();

Player2 p2=new Player2("Ram","Machine Gun",100,true); 

System.out.println(p2.getName());
System.out.println(p2.getWeapon());
System.out.println(p2.getHealth());
p2.damagebyGun1();
p2.damagebyGun2();
 
}

}
