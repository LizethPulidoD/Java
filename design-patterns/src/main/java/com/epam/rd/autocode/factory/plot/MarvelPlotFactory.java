package com.epam.rd.autocode.factory.plot;

public class MarvelPlotFactory implements PlotFactory {
    private Character [] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;

    public MarvelPlotFactory(Character [] hero, EpicCrisis epicCrisis, Character villain){
        this.heroes=hero;
        this.epicCrisis=epicCrisis;
        this.villain=villain;
    }

    @Override
    public Plot plot() {
        return new MarvelPlot(this.heroes, this.epicCrisis, this.villain);
    }
}
