public class Drawer {

    public int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public void printKolvoMonitors (int monitors) {
        System.out.println("Kolvo = " + monitors);
    }

    public static void staticDrawisMonitorsCounter(int monitors, int programmers) {
        int remain = monitors % programmers;
        System.out.println("print % " + remain);
    }
}
