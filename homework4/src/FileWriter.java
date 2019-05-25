/*------------------------------------------------*/
/* THis class implements interface MessageLogger  */
/* This class provides a method called            */
/*            logMsg(String msg)                  */
/* to write a message into a file called log.txt  */
/*------------------------------------------------*/



import java.util.*;

public class FileWriter implements MessageWriter {

  public void logMsg(String option, String lastNm, String firstNm, String code) {
    FileUtil futil = new FileUtil();
    if (option.equals("EncyAlgo1"))
       futil.writeToFile("EncyAlgo1.txt",lastNm + " " + firstNm + " " +code, true, true);
    else if (option.equals("EncyAlgo2"))
       futil.writeToFile("EncyAlgo2.txt",lastNm + " " + firstNm + " " +code, true, true);


    //futil.writeToFile("log.txt",lastNm + " " + firstNm + " " +code, true, true);
  }
}
