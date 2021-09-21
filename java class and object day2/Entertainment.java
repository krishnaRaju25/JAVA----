public class Entertainment {
    private String enname;
    private int woofer;
    private boolean subwoofer;
    private int lcdsize;

    public Entertainment(String enname, int woofer, boolean subwoofer, int lcdsize) {
        this.enname = enname;
        this.woofer = woofer;
        this.subwoofer = subwoofer;
        this.lcdsize = lcdsize;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public int getWoofer() {
        return woofer;
    }

    public void setWoofer(int woofer) {
        this.woofer = woofer;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }

    public void setSubwoofer(boolean subwoofer) {
        this.subwoofer = subwoofer;
    }

    public int getLcdsize() {
        return lcdsize;
    }

    public void setLcdsize(int lcdsize) {
        this.lcdsize = lcdsize;
    }
}
