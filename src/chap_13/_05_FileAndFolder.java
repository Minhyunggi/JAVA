package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        String folder = "C:\\Users\\Min\\Desktop\\JAVA project\\src\\chap_13"; // . 은 현재 경로 , 절대경로를 얻기위해선 폴더를 우클릭하고 경로/참조복사 누르고 절대경로 누르면됨 , src/chap_13 은 상대경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로" + filesAndFolders.getAbsolutePath());
        for (File file :
                filesAndFolders.listFiles()) {
            if (file.isFile()){
                System.out.println("(파일) " + file.getName());
            } else if(file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
