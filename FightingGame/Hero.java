package FightingGame;

public class Hero extends Character{

  public Hero(String name, int health, int damage){
    super(name, health, damage);
  }

  public void showInfo(){
    System.out.println("Hero info: ");
    System.out.println();

    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
    System.out.println("Damage: " + this.damage);

    System.out.println();
  }

  public void winnerAlert(){
    System.out.println("Hero is the winner");
  }
}
