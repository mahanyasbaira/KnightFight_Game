public class MOB implements Attributes {
    protected String name;
    protected int maxHP;
    protected int armor;
    protected int hitModifier;
    protected DiceType damageDie;
    protected int damage; 


    public MOB(String name, int maxHP, int armor, int hitModifier, DiceType damageDie) {
        this.name = name;
        this.maxHP = maxHP;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
        this.damage = 0;
    }


    public void addDamage(int damage) { this.damage += damage; }
    public MOB copy() { return new MOB(name, maxHP, armor, hitModifier, damageDie); }
    public int getHP() { return maxHP - damage; }
    public String getName() { return name; }
    public void resetDamage() { damage = 0; }


    @Override public int getArmor() { return armor; }
    @Override public int getMaxHP() { return maxHP; }
    @Override public DiceType getDamageDie() { return damageDie; }
    @Override public int getHitModifier() { return hitModifier; }

    @Override
    public String toString() {
        return String.format("%s (HP: %d/%d, AC: %d, Hit: +%d, Dmg: %s)",
            name, getHP(), maxHP, armor, hitModifier, damageDie);
    }
}