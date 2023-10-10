import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon implements PokemonGym {
    GrassPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }

    List <String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public List <String> getAttacks() {
        return attacks;
    }

    @Override
    public void enteredTheGym(PokemonTrainer player1) {
    }

    @Override
    public void printPokemon(List <Pokemon> pokemons) {
    }

    @Override
    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer) {
        return null;
    }

    @Override
    public void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon) {
    }

    @Override
    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner) {
        return null;
    }

    @Override
    public Pokemon choosePokemon(PokemonTrainer trainer) {
        return null;
    }

    @Override
    public int randomAttackByGymOwner() {
        return 0;
    }

    @Override
    public String chooseAttackPlayer(Pokemon p) {
        return null;
    }

    @Override
    public void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack) {
    }

    @Override
    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon) {
    }

    @Override
    public void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym) {
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
    }
}
