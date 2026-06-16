package OOP.ExceptionHandling.SchoolExample;

public class School {
    public void registration(Student s) {
        RuntimeException r = verify(s);
        if (r == null) {
            home(s);
        } else {
            throw r;
        }
    }

    public void home(Student s){
        System.out.println("\n\t\t==================================");
        System.out.println("\t\t  REGISTRATION SUCCESSFUL");
        System.out.println("\t\t==================================");
        System.out.println("\t\tId      : " + s.getId());
        System.out.println("\t\tName    : " + s.getName());
        System.out.println("\t\tAge     : " + s.getAge());
        System.out.println("\t\tEmail   : " + s.getEmail());
        System.out.println("\t\t==================================");
    }

    public RuntimeException verify(Student s){
        if(s.getName().length() < 3 || s.getName().length() > 15){
            return new InvalidNameException("Name Should Contain 3 to 15 character only.");
        }

        for(int i=0 ; i<s.getName().length() ; i++){
            char ch = s.getName().charAt(i);
            if(ch >= '0' && ch <='9'){
                return new InvalidNameException("Name Should Not Contain Digits.");
            }
            if(!((ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z'))){
                return new InvalidNameException("Name Should Not Contain any Special Character");
            }
        }

        if(s.getAge() < 5){
            return new InvalidAgeException("Age Should be Greater than 5.");
        }


        int count = 0;
        int pos = 0;
        for(int i=0 ; i<s.getEmail().length() ; i++){
            if(s.getEmail().charAt(i) == '@'){
                count++;
                pos = i;
            }
        }

        if(count != 1){
            return new InvalidEmailException("Email format is incorrect");
        }

        if(pos == 0 || pos == s.getEmail().length()-1){
            return new InvalidEmailException("Email format is incorrect");
        }

        String domainCheck = "";
        for(int i=pos+1 ; i<s.getEmail().length();i++){
            domainCheck += s.getEmail().charAt(i);
        }

        

        if(!(domainCheck.equals("gmail.com")
            || domainCheck.equals("hotmail.com")
            || domainCheck.equals("outlook.com")))
        {
            return new InvalidEmailException(
                    "Email must belong to gmail, hotmail or outlook");
        }



        if(s.getPassword().length() < 8 || s.getPassword().length() > 15){
            return new InvalidPasswordException("Password length between 8 and 15");
        }
        
        int uppsecase = 0;
        int lowercase = 0;
        int digit = 0;
        int specialCh = 0;

        for(int i=0 ; i<s.getPassword().length() ; i++){
            char ch = s.getPassword().charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                uppsecase++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lowercase++;
            }
            else if (ch >= '0' && ch <= '9'){
                digit++;
            }
            else{
                specialCh++;
            }
        }

        if(uppsecase == 0){
            return new InvalidPasswordException("Password must contain uppercase letter");
        }

        if(lowercase == 0){
            return new InvalidPasswordException("Password must contain LowerCase letter");
        }
        if(digit == 0){
            return new InvalidPasswordException("Password must contain Digits");
        }
        if(specialCh == 0){
            return new InvalidPasswordException("Password must contain Special Character");
        }
        return null;
    }
}
