package com.esteban.wallpapers;
import android.app.*;import android.os.*;import android.graphics.Color;import android.graphics.drawable.GradientDrawable;import android.view.*;import android.widget.*;import java.util.*;
public class MainActivity extends Activity{
 LinearLayout box;
 int dp(float x){return (int)(x*getResources().getDisplayMetrics().density+.5f);}
 TextView t(String s,int z){TextView v=new TextView(this);v.setText(s);v.setTextColor(Color.WHITE);v.setTextSize(z);v.setGravity(17);v.setPadding(dp(8),dp(8),dp(8),dp(8));return v;}
 public void onCreate(Bundle b){super.onCreate(b); show();}
 void show(){box=new LinearLayout(this);box.setOrientation(LinearLayout.VERTICAL);box.setBackgroundColor(Color.rgb(11,11,13));
  TextView head=t("🔥 ESTEBAN WALLPAPERS",26);head.setTypeface(null,1);head.setBackgroundColor(Color.rgb(230,0,18));box.addView(head,new LinearLayout.LayoutParams(-1,dp(90)));
  TextView sub=t("Free • Fast • Your wallpapers",15);box.addView(sub,new LinearLayout.LayoutParams(-1,dp(55)));
  Button add=new Button(this);add.setText("➕ Add My Photos");box.addView(add,new LinearLayout.LayoutParams(-1,dp(60)));
  Button demo=new Button(this);demo.setText("✨ Demo Wallpapers");box.addView(demo,new LinearLayout.LayoutParams(-1,dp(60)));
  TextView info=t("Choose a photo from your tablet and use it as your wallpaper.",17);box.addView(info,new LinearLayout.LayoutParams(-1,dp(100)));
  add.setOnClickListener(v->{Intent i=new Intent(Intent.ACTION_OPEN_DOCUMENT);i.setType("image/*");i.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);i.addCategory(Intent.CATEGORY_OPENABLE);startActivityForResult(i,8);});
  demo.setOnClickListener(v->{Toast.makeText(this,"Demo wallpaper collection ready!",Toast.LENGTH_SHORT).show();});
  setContentView(box);}
 protected void onActivityResult(int r,int c,Intent d){super.onActivityResult(r,c,d);if(r==8&&c==RESULT_OK&&d!=null){Toast.makeText(this,"Photo selected! You can now use it as your wallpaper.",Toast.LENGTH_LONG).show();}}
}