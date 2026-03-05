abstract class Character{
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health < 0) health = 0;
    }

    public int getHealth(){
        return health;
    }

    public abstract int attack();
}