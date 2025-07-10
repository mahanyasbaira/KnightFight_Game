public class Knight extends MOB {
    private Fortune activeFortune;
    protected int id;

    protected int xp;

    public Knight(int id, String name, int maxHP, int armor, 
                  int hitModifier, DiceType damageDie, int xp) {

        super(name, maxHP, armor, hitModifier, damageDie);
        this.id = id;
        this.xp = xp;
    }

    public void addXP(int xp) { this.xp += xp; }
    public Fortune getActiveFortune() { return activeFortune; }
    public Integer getId() { return id; }

    public int getXP() { return xp; }
    public void setActiveFortune(Fortune fortune) { activeFortune = fortune; }

    @Override public int getArmor() {
        return super.getArmor() + (activeFortune != null ? activeFortune.getArmor() : 0);
    }
    @Override public int getMaxHP() {
        return super.getMaxHP() + (activeFortune != null ? activeFortune.getMaxHP() : 0);
    }
    @Override public DiceType getDamageDie() {
        return (activeFortune != null && activeFortune.getDamageDie() != null) 

            ? activeFortune.getDamageDie() 
            : super.getDamageDie();
    }
    @Override public int getHitModifier() {
        return super.getHitModifier() + (activeFortune != null ? activeFortune.getHitModifier() : 0);
    }

    public String toCSV() {
        return String.format("%d,%s,%d,%d,%d,%s,%d",
            getId(),
            getName(),
            getMaxHP(),
            getArmor(),
            getHitModifier(),
            (getDamageDie() != null) ? getDamageDie().name() : "null",
            getXP());
    }

    @Override
    public String toString() {
        return String.format(
            "+============================+\n" +
            "| %-26s |\n" +
            "| id: %-22d |\n" +
            "|                            |\n" +
            "| Health: %-4d    XP: %-7d |\n" +
            "|  Power: %-4s    Armor: %-4d |\n" +
            "+============================+",
            name, id, getMaxHP(), xp, 
            getDamageDie() != null ? getDamageDie().name() : "-", 
            getArmor()
        );
    }
}
