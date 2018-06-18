package FileOperate;

import java.io.*;
import java.util.*;

public class FileOperate {

    private static String parentPath = "/Users/firmiana/W1";
    private static String desPath = "/Users/firmiana/W2";
    private static String srcFile;
    private static String desFile;

    public static void main(String[] args){

        srcFile = "fuck";
        desFile = "you";

        /**
         * copy a file from a source file to a destiny file;
         * CopyFile CopyFile = new CopyFile(parentPath, srcFile, desPath, desFile);
         * boolean Copied = CopyFile.Copy();
         * if(Copied)
         *  System.out.println("Copied");
         * else
         *  System.out.println("Crashed");
        */

        /**
         * copy a directory to a new directory;
         * CopyDir copyDir = new CopyDir(parentPath, desPath);
         * boolean copied = copyDir.CopyDirectory();
         * if(copied)
         *  System.out.println("Copied directory");
         * else
         *  System.out.println("Crashed");
        */

    }
}

class CopyFile{
    private String srcFile;
    private String desFile;
    private String parentPath;
    private String desPath;

    CopyFile(String parentPath, String srcFile, String desPath, String desFile){
        this.parentPath = parentPath;
        this.srcFile = srcFile;
        this.desPath = desPath;
        this.desFile = desFile;
    }

    public boolean Copy(){
        boolean copied = false;

        File srcfile = new File(parentPath + '/' + srcFile);
        if(!srcfile.exists())
            return false;
        byte[] Content = new byte[(int)srcfile.length()];

        try{
            FileInputStream inputfile = new FileInputStream(parentPath + '/' + srcFile);
            inputfile.read(Content);
            copied = true;
        }catch (Exception e){
            e.printStackTrace();
            copied = false;
        }

        try{
            FileOutputStream outputFile = new FileOutputStream(desPath + '/' + desFile);
            outputFile.write(Content);
            copied = true;
        }catch(Exception e){
            e.printStackTrace();
            copied = false;
        }

        return copied;
    }
}

class CopyDir{
    private String srcDir;
    private String desDir;

    CopyDir(String srcDir, String desDir){
        this.srcDir = srcDir;
        this.desDir = desDir;
    }

    public boolean CopyDirectory(){
        boolean copied = false;

        File oldDir = new File(srcDir);
        if(!oldDir.isDirectory()){
            System.out.println("given path is not a directory!");
            return false;
        }

        String[] getFile = oldDir.list();
        int number = getFile.length;



        for (int i = 0 ; i < number; i++){

            CopyFile copy = new CopyFile(this.srcDir, getFile[i], this.desDir, getFile[i]);

            if(!(copied = copy.Copy()))
                return false;

        }

        return copied;
    }
}