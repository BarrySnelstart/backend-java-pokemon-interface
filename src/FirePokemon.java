import java.util.List;

public class FirePokemon extends Pokemon implements PokemonGym{
    String attacks;

    public String getAttacks() {
        return attacks;
    }

    public void setAttacks(String attacks) {
        this.attacks = attacks;
    }

    FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public void surf(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void fireLash(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void leafStorm(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void hydroPump(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void thunderPunch(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void electroBall(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void solarBeam(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void flameThrower(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void hydroCanon(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void pyroBall(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void thunder(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void rainDance(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void leechSeed(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void leaveBlade(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void inferno(Pokemon name, Pokemon enemy) {

    }

    @Override
    public void voltTackle(Pokemon name, Pokemon enemy) {

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
}
