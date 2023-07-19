package com.epam.rd.autocode.factory.plot;

public class MarvelPlot implements Plot {
    private Character[] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;

    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public String toString() {
        if (heroes.length > 1) {
            String braveHeroes = "brave " + heroes[0].name() + ", ";
            for (int i = 1; i < heroes.length; i++) {
                if (i < heroes.length - 1) {
                    braveHeroes += "brave " + heroes[i].name() + ", ";
                } else {
                    braveHeroes += "brave " + heroes[i].name();
                }
            }
            return epicCrisis.name() + " threatens the world. But " + braveHeroes + " on guard. So, no way that intrigues of " + villain.name() + " overcome the willpower of inflexible heroes";
        }
        return epicCrisis.name() + " threatens the world. But brave " + heroes[0].name() + " on guard. So, no way that intrigues of " + villain.name() + " overcome the willpower of inflexible heroes";

    }
}


