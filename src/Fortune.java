public class Fortune implements Attributes {
    private String name;
    private int hpBonus;
    private int armor;
    private int hitModifier;
    private DiceType dtype;

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this(name, hpBonus, armor, hitModifier, null);
    }

    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType dtype) {
        this.name = name;
        this.hpBonus = hpBonus;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.dtype = dtype;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return hpBonus;
    }

    @Override
    public DiceType getDamageDie() {
        return dtype;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String damageAdj = (dtype != null) ? dtype.name() : "-";
        return String.format(
            "+======================+\n" +
            "|%-22s|\n" +
            "|HP Bonus: %+12d|\n" +
            "|AC Bonus: %+12d|\n" +
            "|Hit Bonus: %+11d|\n" +
            "|Damage Adj: %9s|\n" +
            "+======================+",
            name, hpBonus, armor, hitModifier, damageAdj
        );
    }
}