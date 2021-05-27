import java.util.Scanner;

public class MobileSecurity {
    public static void main(String[] args) throws InterruptedException {

        TopicAnswers fingerprintObject = new TopicAnswers();
        TopicAnswers faceRecognitionObject = new TopicAnswers();
        TopicAnswers passcodeObject = new TopicAnswers();
        TopicAnswers GPSObject = new TopicAnswers();
        TopicAnswers CFAObject = new TopicAnswers();
        TopicAnswers wipeObject = new TopicAnswers();
        TopicAnswers backupObject = new TopicAnswers();
        TopicAnswers updateObject = new TopicAnswers();
        TopicAnswers MFAObject = new TopicAnswers();
        TopicAnswers encryptionObject = new TopicAnswers();

        //Intro
        System.out.println("" +
                "╔╦╗┌─┐┌┐ ┬┬  ┌─┐  ╔═╗┌─┐┌─┐┬ ┬┬─┐┬┌┬┐┬ ┬\n" +
                "║║║│ │├┴┐││  ├┤   ╚═╗├┤ │  │ │├┬┘│ │ └┬┘\n" +
                "╩ ╩└─┘└─┘┴┴─┘└─┘  ╚═╝└─┘└─┘└─┘┴└─┴ ┴  ┴ ");
        Thread.sleep(100);
        System.out.println("Let's learn about mobile security.");
        Thread.sleep(100);
        System.out.println("\n" +
                "This program will ask you questions.\n" +
                "Answer the question, then the program give your the answer to check your answer");
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready? (y/n)");
        String confirmation = input.nextLine();
        if (confirmation.equals("n")){
            System.out.println("Please restart the program once you're ready.");
            System.exit(0);
        }

        //QUIZ

        //Question 1
        Thread.sleep(100);
        System.out.println("Question 1: How is a fingerprint used in mobile security?");
        String Q1 = input.nextLine();
        System.out.println("So, you think the fingerprint is used by..." + Q1);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        fingerprintObject.fingerprints();

        //Question 2
        Thread.sleep(100);
        System.out.println("Question 2: How is facial recognition used in mobile security?");
        String Q2 = input.nextLine();
        System.out.println("So, you think the facial recognition is used by..." + Q2);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        faceRecognitionObject.faceRecognition();

        //Question 3
        Thread.sleep(100);
        System.out.println("Question 3: How is a passcode used in mobile security?");
        String Q3 = input.nextLine();
        System.out.println("So, you think the passcode is used by..." + Q3);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        passcodeObject.passcode();

        //Question 4
        Thread.sleep(100);
        System.out.println("Question 4: How is GPS used in mobile security?");
        String Q4 = input.nextLine();
        System.out.println("So, you think the GPS is used by..." + Q4);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        GPSObject.GPS();

        //Question 5
        Thread.sleep(100);
        System.out.println("Question 5: How is control from afar used in mobile security?");
        String Q5 = input.nextLine();
        System.out.println("So, you think the control from afar is used by..." + Q5);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        CFAObject.CFA();

        //Question 6
        Thread.sleep(100);
        System.out.println("Question 6: How is wiping everything used in mobile security?");
        String Q6 = input.nextLine();
        System.out.println("So, you think wiping everything is used by..." + Q6);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        wipeObject.wipe();

        //Question 7
        Thread.sleep(100);
        System.out.println("Question 7: How is remote backup used in mobile security?");
        String Q7 = input.nextLine();
        System.out.println("So, you think the remote backup is used by..." + Q7);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        backupObject.backup();

        //Question 8
        Thread.sleep(100);
        System.out.println("Question 8: How is patching updates used in mobile security?");
        String Q8 = input.nextLine();
        System.out.println("So, you think patching updates is used by..." + Q8);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        updateObject.updates();

        //Question 9
        Thread.sleep(100);
        System.out.println("Question 9: How is multi-factor authentication used in mobile security?");
        String Q9 = input.nextLine();
        System.out.println("So, you think the multi-factor authentication is used by..." + Q9);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        MFAObject.MFA();

        //Question 10
        Thread.sleep(100);
        System.out.println("Question 10: How is full-device encryption used in mobile security?");
        String Q10 = input.nextLine();
        System.out.println("So, you think full-device encryption is used by..." + Q10);
        Thread.sleep(100);
        System.out.println("Here is the answer:");
        encryptionObject.encryption();

        //end
        Thread.sleep(100);
        System.out.println("Thank you for using this program!");
    }
}
//This code was made by 7X-Z0 (github)