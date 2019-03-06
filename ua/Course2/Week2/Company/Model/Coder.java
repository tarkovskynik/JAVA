package ua.Course2.Week2.Company.Model;



public class Coder extends Worker { // is - a ( Iam worker)
        // Get methods and fields (public, protected)

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void code(){
        System.out.print("coder code");
        }

}
