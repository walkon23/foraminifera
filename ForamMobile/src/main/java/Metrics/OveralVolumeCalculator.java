package Metrics;

import java.util.LinkedList;

import Helpers.Point;
import Model.Foraminifera;
import Model.Shell;

public class OveralVolumeCalculator extends MonteCarloVolumeCalculator {
    @Override
    public double CalculateMetric(Foraminifera foraminifera) {
        double volume  = super.CalculateMetric(foraminifera);
        foraminifera.getMetrics().setVolume(volume);
        return volume;
    }

    @Override
    protected boolean isInsideShells(Point point, LinkedList<Shell> shells) {

        for (Shell shell : shells){
            boolean isInsideSphere = shell.getOuterSphere().IsPointInside(point);
            if (isInsideSphere){
                return true;
            }
        }
        return false;
    }

    @Override
    public String GetName() {
        return "Overall volume";
    }
}
