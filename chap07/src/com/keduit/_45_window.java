package com.keduit;

public class _45_window {
	
	_43_Button button1 = new _43_Button();
	_43_Button button2 = new _43_Button();
	
	
	_44_OnClickListener listener = new _44_OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	 _45_window() {
		 button1.setOnClickListener(listener);
		 button2.setOnClickListener(
				 new _44_OnClickListener() {
					
					@Override
					public void onClick() {
						System.out.println("메시지를 보냅니다.");
					}
				});
	}
	

}
