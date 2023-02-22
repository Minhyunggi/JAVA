package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) { // 폴더 존재 여부
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        }

        System.out.println("---------------");

        folderName = "A/B/C";
        folder = new File(folderName);
        folder.mkdirs();// mkdir 은 단일 폴더 만들때 , mkdirs 는 여러개의 상의폴더까지 만들때
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
