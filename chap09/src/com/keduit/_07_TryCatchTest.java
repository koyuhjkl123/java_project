package com.keduit;

public class _07_TryCatchTest {

	public static void main(String[] args) {
		
		_08_Reso reso = new _08_Reso();
		
		try(reso){
			reso.show();
		}catch (Exception e) {
			System.out.println("예외처리부분");
		}
		
//		try{
//			reso.show();
//		}catch (Exception e) {
//			System.out.println("예외처리부분");
//		} finally {
//			try {
//				reso.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
