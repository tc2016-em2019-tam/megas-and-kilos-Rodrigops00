package Rorro;

public class MBconv{

    private int kilobytes = 0;

    public MBconv(int kilobytes) throws Exception{
        if (kilobytes < 0) {
            throw new Exception("KB are two positive numbers");
        }
        this.kilobytes = kilobytes;
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception{
        if (kilobytes < 0){
            throw new Exception("KB are always positive");
        }
        this.kilobytes = kilobytes;
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        int kb = kilobytes / 1024;
        int remaining = kilobytes % 1024;

        if (remaining > 0) {
            System.out.println(kilobytes + "KB = " + kb + " MB and " + remaining + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kb + " MB");
        }

    }
}
