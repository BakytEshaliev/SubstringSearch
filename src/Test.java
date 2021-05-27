public class Test {
    public static void main(String[] args) {
        String subString = "NEEDLE";
        String string = "FINDINANAYSTACKNEEDLEINA.";
        int dsResult = DirectSearch.search(subString, string);
        System.out.println(dsResult);
    }
}
