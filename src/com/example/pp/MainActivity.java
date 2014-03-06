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
	        // ���봰�������ļ�  
	        View view = inflater.inflate(R.layout.main2, null); 
	        
	        /**
	         * ����PopupWindow�е��������Ӧ
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
	        // ����PopupWindow����  
	        final PopupWindow pop = new PopupWindow(view, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, false);    
	        Button btn = (Button) findViewById(R.id.btn);  
	        // ��Ҫ����һ�´˲����������߿���ʧ  
	        pop.setBackgroundDrawable(new BitmapDrawable());  
	        //���õ��������ߴ�����ʧ  
	        pop.setOutsideTouchable(true);  
	        // ���ô˲�����ý��㣬�����޷����  
	        pop.setFocusable(true);  
	        btn.setOnClickListener(new OnClickListener() {  
	              
	            @Override  
	            public void onClick(View v) {  
	                if(pop.isShowing()) {  
	                    // ���ش��ڣ���������˵��������Сʱ������Ҫ�˷�ʽ����  
	                    pop.dismiss();  
	                } else {  
	                    // ��ʾ���ڵ�λ��;��������ǽ�  PopupWindow ��ʾ�ڰ�ť���·���
	                    pop.showAsDropDown(v);  
	                }  
	                  
	            }  
	        });  
	        
	       
	    }  
	}  


