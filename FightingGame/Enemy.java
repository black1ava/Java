package FightingGame;

public class Enemy extends Character{
  public Enemy(String name, int health, int damage){
    super(name, health, damage);
  }
  
  public void showInfo(){
    System.out.println("Enemy info: ");
    System.out.println();

    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
    System.out.println("Damage: " + this.damage);

    System.out.println();
  }

  public void winnerAlert(){
    System.out.println("Enemy: "+ this.name + " is the winner");
  }
}
