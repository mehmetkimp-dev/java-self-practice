package stringTask;

import java.util.Scanner;

public class odeCydeo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file name");
        String filename=scanner.nextLine();



if (filename.isBlank()){
    System.out.println("inValid file");
    return;
}



        String lowerFilename=filename.toLowerCase();

boolean valid=
        (lowerFilename.endsWith(".txt")&&filename.length()>4)||
                (lowerFilename.endsWith(".pptx")&& filename.length()>5)||
                (lowerFilename.endsWith(".docx")&& filename.length()>5)||
                (lowerFilename.endsWith(".xlsx")&&filename.length()>5);



if (valid){
    System.out.println("Valid file");
}else {
    System.out.println("Invalid file");
}

    }
}
