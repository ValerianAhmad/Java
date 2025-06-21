public class Main {
    public static void main(String[] args) throws Exception {
        Shape shape1 = new Shape();

        Shape shape2 = new Shape(5, false);
        
        System.out.println("Shape 1");
        System.out.println("Jumlah sisi: " + shape1.getJumlahSisi());
        System.out.println("Apakah regular? " + shape1.isRegular());

        shape2.setJumlahSisi(6);
        shape2.setRegular(true);
    
        System.out.println("\nShape 2: ");
        System.out.println("Jumlah sisi: " + shape2.getJumlahSisi());
        System.out.println("Apakah regular? " + shape2.isRegular());
    }
}
