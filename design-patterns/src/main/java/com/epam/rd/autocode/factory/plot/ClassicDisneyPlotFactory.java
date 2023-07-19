package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyPlotFactory implements PlotFactory {
    private Character hero;
    private Character beloved;
    private Character villain;

    public ClassicDisneyPlotFactory(Character hero, Character beloved, Character villain){
        this.hero=hero;
        this.beloved=beloved;
        this.villain=villain;
    }

    @Override
    public Plot plot() {
        return new ClassicDisneyPlot(this.hero, this.beloved, this.villain);
    }
}
