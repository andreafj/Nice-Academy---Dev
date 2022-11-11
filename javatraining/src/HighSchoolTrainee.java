public class HighSchoolTrainee {
    public static void  main(String[] args){

        int StudentAge = 24;
        String Midlename = "Andrea";
        double Prom= 8.6;
        String StudentName = "Noelia Andrea";
        String FirstName = "Noelia";
        String LastName = "Flores";
        char FirstInitial = StudentName.charAt(0);
        char LastInitial = LastName.charAt(0);
        boolean Attendance = true;

        System.out.println("My Age is " +StudentAge);
        System.out.println("My Prom is "+Prom);
        System.out.println("My Midlename is "+Midlename);
        //System.out.println("My Firsinitial is  "+FirstInitial);
        //System.out.println("My lastinitial is "+LastInitial);
        System.out.println("My Attendance is "+Attendance);
        //System.out.println("The student name is "+StudentName);
        System.out.println("The student First Name is "+FirstName);
        //System.out.println("The student Last Name is "+LastName);
        System.out.println("The student :"+StudentName+" "+LastName + "And their Initials are :"+FirstInitial + LastInitial);

    }
}
