package com.example.christylilyfang.library;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

public class regist_activity extends AppCompatActivity
{
    private Button button7;
    private EditText pass1;
    private  EditText pass2;
    private EditText userN;
    private String passwords1;
    private String passwords2 ;
    private String accountNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);

        button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent it1 = new Intent(regist_activity.this,login_activity.class);


                //button7.setOnClickListener(new View.OnClickListener() {
                //@Override
                //public void onClick(View v) {

                pass1 = (EditText)findViewById(R.id.editText4);
                pass2 = (EditText)findViewById(R.id.editText5);
                userN = (EditText)findViewById(R.id.editText3);
                passwords1 = pass1.getText().toString();
                passwords2 = pass2.getText().toString();
                accountNumber = userN.getText().toString();
                System.out.println(accountNumber);
                System.out.println(passwords1);
                System.out.println(passwords2);
                //System.out.println(response);
                //System.out.println("bbbbbbb");
                if(!passwords1.equals(passwords2)) {
                    Toast.makeText(regist_activity.this,"两次密码不同", Toast.LENGTH_LONG).show();
                }
                else {
                    RegistRequest(accountNumber, passwords1);
                }
            }
        });

    }

    public void RegistRequest(final String accountNumber, final String password) {
        String url = "http://119.29.58.195:8080/MyFirstWebApp/RegistServlet";
        String tag = "Regist";
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.cancelAll(tag);
        final StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //System.out.println("ccccc");
                        // System.out.println(password);
                        //System.out.println(response);
                        //System.out.println("dddd");
                        try {
                            //System.out.println("aaaaaa");
                            //System.out.println(password);
                            // System.out.println(response);
                            //System.out.println("bbbbbbb");
                            JSONObject jsonObject = (JSONObject) new JSONObject(response).get("params");
                            String result = jsonObject.getString("Result");

                            if (result.equals("success")) {
                                //做自己的注册成功操作，如页面跳转
                                Intent it1 = new Intent(regist_activity.this,login_activity.class);
                                startActivity(it1);
                            } else {
                                //做自己的注册失败操作，如Toast提示
                                Toast.makeText(regist_activity.this,"用户名已存在", Toast.LENGTH_LONG).show();
                            }
                        } catch (JSONException e) {
                            //做自己的请求异常操作，如Toast提示（“无网络连接”等）
                            Toast.makeText(regist_activity.this,"无网络连接", Toast.LENGTH_LONG).show();
                            Log.e("TAG", e.getMessage(), e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //做自己的响应错误操作，如Toast提示（“请稍后重试”等）
                Log.e("TAG", error.getMessage(), error);
                Toast.makeText(regist_activity.this,"请重试", Toast.LENGTH_LONG).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("AccountNumber", accountNumber);
                params.put("Password", password);
                return params;
            }
        };

        //设置Tag标签
        request.setTag(tag);

        //将请求添加到队列中
        requestQueue.add(request);
    }

}
