package be.intecbrussel.local_nested_classes;

public class LocalClassExample {

    private String regularExpressions = "[^0-9]";

    public  void validateNumber(String phoneNumber1,
                                String phoneNumber2){

        int numberLength = 10;

        class PhoneNumber{

            private String formattedNumber;

            public PhoneNumber(String phoneNumber){
                String currentNumber =
                        phoneNumber.replaceAll(regularExpressions,"");
                formattedNumber = (currentNumber.length() == numberLength)
                        ?currentNumber
                        :null;
            }

            public String getFormattedNumber() {
                return formattedNumber;
            }

            public String validationMessage(){
                if (getFormattedNumber() == null){
                    return "This an invalid number";
                }else{
                    return "The phonenr is : " + getFormattedNumber();               }
            }
        }

        PhoneNumber phonenr1 = new PhoneNumber(phoneNumber1);
        PhoneNumber phoneNr2 = new PhoneNumber(phoneNumber2);
        System.out.println(phonenr1.validationMessage());
        System.out.println(phoneNr2.validationMessage());
    }
}
