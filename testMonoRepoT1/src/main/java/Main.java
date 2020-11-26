public class Main {

    public static void main(String[] args){
        Test test = new Test("C100", "Marc");
        System.out.println("Hello " + test.getName());
        System.out.println("code of " + test.getName() + " is: " + test.getCode());
    }
}
