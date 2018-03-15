package com.example.christylilyfang.library;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class login_activity extends AppCompatActivity {
    private Button button6;
    private Button button5;
    private EditText user1;
    private EditText PW;
    String accountNumber;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(login_activity.this, regist_activity.class);
                startActivity(it);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user1 = (EditText)findViewById(R.id.editText);
                PW = (EditText)findViewById(R.id.editText2);
                accountNumber = user1.getText().toString();
                password = PW.getText().toString();
                LoginRequest(accountNumber,password);
                //Intent it0 = new Intent(login_activity.this,MainActivity.class);
                //startActivity(it0);
            }
        });
    }
    public void LoginRequest(final String accountNumber, final String password) {
        String url = "http://119.29.58.195:8080/MyFirstWebApp/LoginServlet";    //注①
        String tag = "Login";    //注②

        //取得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

//防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

//创建StringRequest，定义字符串请求的请求方式为POST(省略第一个参数会默认为GET方式)
        final StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        try {
                            //System.out.println("aaaaaa");
                            //System.out.println(password);
                            //System.out.println(response);
                            //System.out.println("bbbbbbb");
                            JSONObject jsonObject = (JSONObject) new JSONObject(response).get("params");  //注③
                            String result = jsonObject.getString("Result");  //注④

                            if (result.equals("success")) {  //注⑤
                                Intent it0 = new Intent(login_activity.this, MainActivity.class);
                                startActivity(it0);
                                //做自己的登录成功操作，如页面跳转
                            } else {
                                Toast.makeText(login_activity.this,"用户名或密码错误", Toast.LENGTH_LONG).show();
                                //做自己的登录失败操作，如Toast提示
                            }
                        } catch (JSONException e) {
                            //做自己的请求异常操作，如Toast提示（“无网络连接”等）
                            //Intent it0 = new Intent(login_activity.this, MainActivity.class);
                            //startActivity(it0);
                            Toast.makeText(login_activity.this,"无网络连接", Toast.LENGTH_LONG).show();
                            Log.e("TAG", e.getMessage(), e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //做自己的响应错误操作，如Toast提示（“请稍后重试”等）
                //Intent it0 = new Intent(login_activity.this, MainActivity.class);
                //startActivity(it0);
                Toast.makeText(login_activity.this,"请重试", Toast.LENGTH_LONG).show();
                Log.e("TAG", error.getMessage(), error);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("AccountNumber", accountNumber);  //注⑥
                params.put("Password", password);
                return params;
            }
        };

        //设置Tag标签
        request.setTag(tag);

        //将请求添加到队列中
        requestQueue.add(request);


        //Intent it0 = new Intent(login_activity.this,MainActivity.class);
        //startActivity(it0);

    }

}