public class Cabinet {

    private int drawerCount;
    private String status;

    public Cabinet(int drawerCount, String status) {
        this.drawerCount = drawerCount;
        this.status = status;
    }

    public void openOrClose() {
        System.out.println("Drawer opened or closed");
    }

    public int getDrawerCount() {
        return drawerCount;
    }

    public String getStatus() {
        return status;
    }
}
