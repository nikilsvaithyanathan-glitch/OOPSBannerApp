public class Main {
    public static void main(String[] args) {

        String[] lines = {
            String.join(" "," ********  " , " ********  " , "********  " , " ******** "),
            String.join(" ","*        * " , "*        * " , "*       * " , "*        *"),
            String.join(" ","*        * " , "*        * " , "*       * " , "*         "),
            String.join(" ","*        * " , "*        * " , "********  " , " ******** "),
            String.join(" ","*        * " , "*        * " , "*         " , "         *"),
            String.join(" ","*        * " , "*        * " , "*         " , "*        *"),
            String.join(" "," ********  " , " ********  " , "*         " , " ******** ")
        };

        for (String i : lines) {
            System.out.println(i);
        }
    }
}