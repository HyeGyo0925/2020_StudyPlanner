package com.example.studyplanner;

import android.os.AsyncTask;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {


    final static  private String URL="http://gpry4618.dothome.co.kr/Login2.php";
    private Map<String,String>map;

    public LoginRequest(String userID, String userPassword, Response.Listener<String>listener){                    //서버 url 설정(php파일 연동)
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);


    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}

