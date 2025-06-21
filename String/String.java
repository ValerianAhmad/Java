public class ContohString {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String vString = "abc";
        System.out.println(vString);

        String valeString = "ab" + "c";
        System.out.println(valeString);

        String kata1 = "Nama Saya ";
        String kata2 = "Valerian";
        String kalimat = kata1 + kata2;
        System.out.println(kalimat);

        String huruf = "abc";
        String heheString = new String(huruf);
        System.out.println(heheString);
    }
}
