package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {

	public static void main(String[] args) throws IOException {
		
		//	입력 소스
		byte[] inSrc = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//	출력 타겟
		byte[] outSrc = null;
		
		System.out.println("입력 소스: " + Arrays.toString(inSrc));
		
		//	입력 스트림과 출력 스트림 열기
		
		
		InputStream input = new ByteArrayInputStream(inSrc);
		OutputStream output = new ByteArrayOutputStream();
		
		int data = 0;	//	입력 스트림으로부터 넘어올 데이터 저장 변수
		
		try {
		while((data=input.read()) != -1) {	//	-1이면 더이상 읽을 데이터 없음
			output.write(data);
			System.out.println("Read data: "+data);
		}
		
		outSrc = ((ByteArrayOutputStream)output).toByteArray();

		System.out.println("Input Source: " + Arrays.toString(inSrc));
		System.out.println("Output Source: " + Arrays.toString(outSrc));
		
		} catch (IOException e) {	//	IOException 처리
			e.printStackTrace();	
		} catch (Exception e) {		//	혹시 남아있을지 모를 예외 처리
			e.printStackTrace();
		} finally {
			try {
			output.close();
			input.close();
			} catch (Exception e) {
				
			}
			
		}
	}
	

}
