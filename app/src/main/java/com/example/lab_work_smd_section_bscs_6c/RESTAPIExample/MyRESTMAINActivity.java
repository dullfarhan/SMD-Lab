package com.example.lab_work_smd_section_bscs_6c.RESTAPIExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyRESTMAINActivity extends AppCompatActivity {
    MyretrofitInter apiInterface;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_restmainactivity);
        recyclerView = findViewById(R.id.myretrofitrecycleview);
        apiInterface = MyRetroFit.getMyRetrofit().create(MyretrofitInter.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
//        GetMyRetrofit();
        GitMyComments();
    }

    private void GitMyComments() {
//        Call<List<MyCommentsModel>> list = apiInterface.getComments(2);
        Call<List<MyCommentsModel>> list = apiInterface.GetAgainstUrl("https://jsonplaceholder.typicode.com/comments/1/");
        list.enqueue(new Callback<List<MyCommentsModel>>() {
            @Override
            public void onResponse(Call<List<MyCommentsModel>> call, Response<List<MyCommentsModel>> response) {
                if (response.isSuccessful()) {
                    Log.d("TAG",response.body().toString());
                    for (MyCommentsModel comments : response.body()) {
                        Log.d("TAG", "ID " + comments.getId()
                                + " PostID " + comments.getPostId()
                                + " User " + comments.getName()
                                + " Email " + comments.getEmail());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<MyCommentsModel>> call, Throwable t) {

            }
        });


    }

    private void GetMyRetrofit() {

        apiInterface.getList().enqueue(new Callback<List<MyRestApiModel>>() {
            @Override
            public void onResponse(Call<List<MyRestApiModel>> call, Response<List<MyRestApiModel>> response) {
                if (response.body().size() > 0) {
                    List<MyRestApiModel> list = response.body();
                    MyRestAdapter adapter = new MyRestAdapter(getApplicationContext(), list);
                    recyclerView.setAdapter(adapter);

                    Toast.makeText(MyRESTMAINActivity.this, "Data Retrived", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MyRESTMAINActivity.this, "List is Empty", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<MyRestApiModel>> call, Throwable t) {
                Toast.makeText(MyRESTMAINActivity.this, "Failure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}