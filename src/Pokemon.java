public abstract class Pokemon implements PokemonGym {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String type;

    public String getType() {
        return type;
    }

    Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}
