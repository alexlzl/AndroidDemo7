package com.example.lzl.testfragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private   GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "MainActivity===onCreate");
         gestureDetector = new GestureDetector(this,new
                GestureListenerImpl());

    }

    public void testOnClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("确认退出吗?");
        builder.setTitle("提示");
        builder.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                MainActivity.this.finish();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();

    }


    public void dialogActivity(View view) {
        Intent intent = new Intent(this, DialogActivity.class);
        startActivity(intent);

    }


    public void testPopupWindow(View view) {
        showPopupWindow(view);
    }

    private void showPopupWindow(View view) {

        // 一个自定义的布局，作为显示的内容
        View contentView = LayoutInflater.from(this).inflate(
                R.layout.popup_window, null);


        final PopupWindow popupWindow = new PopupWindow(contentView,
                ViewGroup.LayoutParams.MATCH_PARENT, 200, true);

        popupWindow.setTouchable(true);


        popupWindow.setBackgroundDrawable(new ColorDrawable());

        // 设置好参数之后再show
        popupWindow.showAsDropDown(view);

    }

    public void testToast(View view) {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();
//        setVisible(false);
    }

    public void secondActivity(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("TAG", "MainActivity===onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("TAG", "MainActivity===onSaveInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TAG", "MainActivity===onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "MainActivity===onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "MainActivity===onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "MainActivity===onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "MainActivity===onStop");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("TAG", "MainActivity===finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "MainActivity===onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "MainActivity===onRestart");
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        Log.d("TAG", "MainActivity===dispatchGenericMotionEvent");
        return super.dispatchGenericMotionEvent(ev);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("TAG", "MainActivity===dispatchTouchEvent");
        gestureDetector.onTouchEvent(ev);
        return super.dispatchTouchEvent(ev);
//        return  false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG", "MainActivity===onTouchEvent");
        return super.onTouchEvent(event);
    }

    private class GestureListenerImpl implements GestureDetector.OnGestureListener {
        //触摸屏幕时均会调用该方法
        @Override
        public boolean onDown(MotionEvent e) {
//            System.out.println("---> 手势中的onDown方法");
            Log.d("TAG","---> 手势中的onDown方法");
            return false;
        }

        //手指在屏幕上拖动时会调用该方法
        @Override
        public boolean onFling(MotionEvent e1,MotionEvent e2, float velocityX,float velocityY) {
//            System.out.println("---> 手势中的onFling方法");
            Log.d("TAG","--->  手势中的onFling方法");
            return false;
        }

        //手指长按屏幕时均会调用该方法
        @Override
        public void onLongPress(MotionEvent e) {
//            System.out.println("---> 手势中的onLongPress方法");
            Log.d("TAG","--->  手势中的onLongPress方法");
        }

        //手指在屏幕上滚动时会调用该方法
        @Override
        public boolean onScroll(MotionEvent e1,MotionEvent e2, float distanceX,float distanceY) {
//            System.out.println("---> 手势中的onScroll方法");
            Log.d("TAG","--->  手势中的onScroll方法");
            return false;
        }

        //手指在屏幕上按下,且未移动和松开时调用该方法
        @Override
        public void onShowPress(MotionEvent e) {
//            System.out.println("---> 手势中的onShowPress方法");
            Log.d("TAG","--->  手势中的onShowPress方法");
        }


        //轻击屏幕时调用该方法
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
//            System.out.println("---> 手势中的onSingleTapUp方法");
            Log.d("TAG","--->  手势中的onSingleTapUp方法");
            return false;
        }
    }
}
