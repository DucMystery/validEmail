public class Test {

    public static final String[] validEmail = new String[]{"a@gmail.com","ab1@yahoo.com","abc@hotmail.com"};
    public static final String []invalidEmail = new String[]{"@gmail.com","ab@gmail.","@#abc@gmail.com"};
    public static void main(String[] args) {
        PracticeRegex practiceRegex = new PracticeRegex();
        for (String email :validEmail){
            boolean isValid = practiceRegex.validate(email);
            System.out.println("Email is "+email+" is valid "+isValid);
        }

        for (String email1 : invalidEmail){
            boolean isValid = practiceRegex.validate(email1);
            System.out.println("Email is "+email1+" is valid "+isValid);
        }


    }
}
