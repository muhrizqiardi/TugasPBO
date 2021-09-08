public class NPC {
  private String name;
  private float level;
  private float health;
  private int positionX;
  private int positionY;

  public NPC(String name, float level, float health, int positionX, int positionY) {
    this.name = name;
    this.level = level;
    this.health = health;
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public void info() {
    System.out.printf("Name           : %s\n", name);
    System.out.printf("Level          : %s\n", level);
    System.out.printf("Health         : %s\n", health);
    System.out.printf("Position       : %d, %d \n", positionX, positionY);
  }

  public void attack(float attackPoint) {
    this.health -= attackPoint;
  }

  public void givePotion(int n) {
    this.health += n;
  }

  public void move(int x, int y) {
    this.positionX += x;
    this.positionY += y;
  }

  public boolean isAlive() {
    return health != 0;
  }
}
