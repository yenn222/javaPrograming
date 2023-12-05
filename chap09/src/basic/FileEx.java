package basic;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File file = new File("/Users/Yenniii/Desktop/Major/2-2/JAVA/Yenniii");
		
		if (file.isFile()) {
			System.out.println("파일입니다");
		}else if(file.isDirectory()) {
			System.out.println("디렉토리입니다");
			
			File[] files = file.listFiles(); //file 목록 배열에 넣기
			for(int i = 0; i < files.length; i++) {
				File subFile = files[i];
				
				String fileName = subFile.getName();
				long filelength = subFile.length();
				
				System.out.println("파일명 - " + fileName + "  파일 크기 - " + filelength );
			}
			
		}

	}

}
