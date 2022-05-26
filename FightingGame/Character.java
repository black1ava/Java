package FightingGame;

public abstract class Character {
  protected String name;
  protected int health;
  protected int damage;

  public Character(String name, int health, int damage){
    this.name = name;
    this.health = health;
    this.damage = damage;
  }

  public int getDamage(){
    return this.damage;
  }

  public boolean isAlive(){
    return this.health > 0;
  }

  public void getHit(Character opponent){
    int opponentDamage = opponent.getDamage();
    this.health = this.health - opponentDamage;
  }

  public boolean fighting(Character opponent){

    while(this.isAlive() && opponent.isAlive()){
      opponent.getHit(this);
      this.getHit(opponent);

      this.showInfo();
      opponent.showInfo();
    }

    return this.isAlive();
  }

  abstract public void showInfo();
  abstract public void winnerAlert();
}
