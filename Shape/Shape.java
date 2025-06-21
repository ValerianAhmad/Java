class Shape {
    private int jumlahSisi;
    private boolean regular;

    public Shape() {
        this.jumlahSisi = 3;
        this.regular = false;
    }

    public Shape(int jumlahSisi, boolean regular) {
        this.jumlahSisi = jumlahSisi;
        this.regular = regular;
    }

    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}
