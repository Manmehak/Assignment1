package com.company;

class Patient{
    private int _patientId;
    private String _firstName;
    private String _lastName;
    private String _address;
    private String _state;
    private int _postalCode;

    public int getPatientId(){
        return _patientId;
    }
    public void setPatientId(int id){
        this._patientId = id;
    }

    public int getPostalCode(){
        return _postalCode;
    }
    public void setPostalCode(int code){
        this._postalCode = code;
    }

    public Patient(String firstName , String lastName , String address , String state){
        this._firstName = firstName;
        this._lastName = lastName;
        this._address = address;
        this._state = state;
    }

    public void getPatientInfo(){
        System.out.printf("Id No. %d \n", _patientId);
        System.out.printf("Name : %s %s \n" , _firstName , _lastName );
        System.out.printf("Address : %s \n", _address);
        System.out.printf("State : %s \n", _state);
        System.out.printf("Postal Code : %d \n", _postalCode);

    }

}

public class PatientTest{

    public static void main(String[] args) {
        Patient obj1 = new Patient("Hello","World", "Gurdaspur", "Punjab");
        Patient obj2 = new Patient("Hello1","World1","Gurdaspur","Punjab");

        obj1.setPatientId(101);
        obj1.setPostalCode(143505);
        obj2.setPatientId(102);
        obj2.setPostalCode(143505);

        obj1.getPatientInfo();
        obj2.getPatientInfo();



    }
}
