public class ReportCard {

    //two static constants
    public static final String ANNUAL_REPORT_2017 = "Student Annual Report 2017";
    public static final String STUDENT_NAME = "Fred Perkins";

    //two instance variables, used by constructor
    private String subjectName;
    private int examResult;

    //custom constructor
    public ReportCard(String subject, int examResult) {
        this.subjectName = subject;
        this.examResult = examResult;
    }

    //main method, to run this java application
    public static void main(String[] args) {
        //five instances of class ReportCard created by constructor
        ReportCard newScore1 = new ReportCard("French", 88);
        ReportCard newScore2 = new ReportCard("Spanish", 90);
        ReportCard newScore3 = new ReportCard("Physics", 72);
        ReportCard newScore4 = new ReportCard("Mathematics", 57);
        ReportCard newScore5 = new ReportCard("History", 22);

        //test setResult() and setSubject() both work
        newScore2.setResult(98);
        newScore2.setSubject("Chinese");

        //string of report card details for printing
        String reportGrade = ANNUAL_REPORT_2017 + "\n" + "\n" + STUDENT_NAME + "\n" + "\n" + newScore1.toString() + "\n" + newScore2.toString() + "\n" + newScore3.toString() + "\n" + newScore4.toString() + "\n" + newScore5.toString();

        //print out report in java IDE only
        //  System.out.println(reportGrade);

    } // end of main method

	//Getter and Setter methods for academic subject names and their respective exam scores
    public String getSubject() {
        return subjectName;
    }

    public void setSubject(String subject) {
        this.subjectName = subject;
    }

    public int getResult() {
        return examResult;
    }

    public void setResult(int result) {
        this.examResult = result;
    }

    //for display subject results as a string, by subject
    public String toString() {
        return "Subject: " + getSubject() + "\nScore: " + getResult() + "\n";
    }
}//end of class