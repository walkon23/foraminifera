package Helpers;

public class SettingsContainer {
    public static double translationFactor = 0.5; //przesunięcie po growth axis srodka kolejnej sfery wzgledem srodka poprzedniej
        //0 to centrum kolejnej sfery w apperture kolejnej
        //1 to stykające się sfery - v = newRadius
    public static double growthFactor = 1.1; //radius times this = new radius
    public static double thicknessGrowthFactor = 1.1; //thickness times this = new thickness
    public static double deviationAngle = Math.PI / 10;
    public static double rotationAngle = Math.PI / 10;


    //> 1.0
    public static double scaleX = 1.0;
    public static double scaleY = 1.0;
    public static double scaleZ = 1.0;
}
