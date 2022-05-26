package FightingGame;

public class Main {
  public static void main(String[] args){
    Hero hero = new Hero("Tharath", 100, 50);
    hero.showInfo();

    Enemy enemy = new Enemy("Wolf", 500, 10);
    enemy.showInfo();

    if(hero.fighting(enemy)){
      hero.winnerAlert();
    }else{
      enemy.winnerAlert();
    }
  }
}
