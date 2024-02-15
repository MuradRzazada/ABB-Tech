package org.abbtech.lesson4.Task4;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter
    public void setPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumberFormat(phoneNumber)) {
            System.out.println("Illegal format");
        } else{
            System.out.println("Valid phone number:" + phoneNumber);
        }
    }

    private boolean isValidPhoneNumberFormat(String phoneNumber) {
        String regex  ="^994(50|51|55|70).{7}$";
        return phoneNumber.matches(regex);
    }
}