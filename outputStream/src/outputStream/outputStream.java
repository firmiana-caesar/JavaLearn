package outputStream;

/**
 * 分解合并文件的基本操作
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class outputStream {

    static String srcFile = "/Users/firmiana/WW/bi_skip.npz";
    //static byte buffer = (byte)(100 * 1024);

    public static void main(String[] args){
        int buffer = 100 * 1024;
        spiltFile(srcFile, buffer);
        System.out.println("spilted");
        combineFile(srcFile, buffer);
        System.out.println("Combined");
    }

    static void combineFile(String srcFile, int buffer){
        File newFile = new File(srcFile + "new");

        File oldFile = new File(srcFile);
        int size = (int)oldFile.length();

        int number = 0;
        if (size % buffer == 0)
            number = size / buffer;
        else
            number = (size / buffer) + 1;

        byte[] Content = new byte[buffer * number];


        for (int i = 0; i < number; i++){
            File getOldFile = new File(srcFile + i);
            try {
                FileInputStream input = new FileInputStream(getOldFile);
                //input.read(Content, );
                //input.read(Content, buffer * i, buffer * (i + 1));
                input.read(Content, buffer * i, buffer);
                input.close();
            }catch(Exception e) {
                e.printStackTrace();
            }

            getOldFile.delete();
        }

        try{
            FileOutputStream output = new FileOutputStream(newFile);
            output.write(Content);
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    static void spiltFile(String srcFile, int buffer) {
        File file = new File(srcFile);
        //long size = file.length();
        if (file.length() == 0) return;

        byte[] fileContent = new byte[(int) file.length()];

        try {
            FileInputStream inputFile = new FileInputStream(file);
            inputFile.read(fileContent);
            inputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int howMuch;

        if (file.length() % buffer == 0)
            howMuch = (int) (fileContent.length / buffer);
        else
            howMuch = (int) (fileContent.length / buffer) + 1;

        for (int i = 0; i < howMuch; i++) {
            String newName = file.getName() + i;
            File newfile = new File(file.getParent(), newName);
            byte[] newContent;

            if (i != howMuch)
                newContent = Arrays.copyOfRange(fileContent, buffer * i, buffer * (i + 1));
            else
                newContent = Arrays.copyOfRange(fileContent, buffer * i, fileContent.length);


            try {
                FileOutputStream outputStream = new FileOutputStream(newfile);
                outputStream.write(newContent);
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



