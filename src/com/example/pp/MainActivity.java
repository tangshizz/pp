package com.example.pp;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	    /** Called when the activity is first created. */  
	    @Override  
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_main);  
	        LayoutInflater inflater = LayoutInflater.from(this);  
	        // 引入窗口配置文件  
	        View view = inflater.inflate(R.layout.main2, null); 
	        
	        /**
	         * 监听PopupWindow中的组件的相应
	         */
	        Button btnView1 = (Button) view.findViewById(R.id.a);
	        btnView1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "aaaaaaaaaaaaaaa", 2000).show();
				}
			});
	        /////////////////////////
	        // 创建PopupWindow对象  
	        final PopupWindow pop = new PopupWindow(view, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, false);    
	        Button btn = (Button) findViewById(R.id.btn);  
	        // 需要设置一下此参数，点击外边可消失  
	        pop.setBackgroundDrawable(new BitmapDrawable());  
	        //设置点击窗口外边窗口消失  
	        pop.setOutsideTouchable(true);  
	        // 设置此参数获得焦点，否则无法点击  
	        pop.setFocusable(true);  
	        btn.setOnClickListener(new OnClickListener() {  
	              
	            @Override  
	            public void onClick(View v) {  
	                if(pop.isShowing()) {  
	                    // 隐藏窗口，如果设置了点击窗口外小时即不需要此方式隐藏  
	                    pop.dismiss();  
	                } else {  
	                    // 显示窗口的位置;这个方法是将  PopupWindow 显示在按钮的下方，
	                    pop.showAsDropDown(v);  
	                }  
	                  
	            }  
	        });  
	        
	       
	    }  
	}  


