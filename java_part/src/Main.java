public class Main {

    static{
        System.loadLibrary("libC__Part");
    }
    public static void main(String[] args){
        Main main = new Main();
        int[][] Positions = main.GetPositions();
        System.out.println(Positions[0][0]);
        System.out.println(Positions[0][1]);
        System.out.println(Positions[1][0]);
        System.out.println(Positions[1][1]);
    }
    public native int[][] GetPositions();
}
