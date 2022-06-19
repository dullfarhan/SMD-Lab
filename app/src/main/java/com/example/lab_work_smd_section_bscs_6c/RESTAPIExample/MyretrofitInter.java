package com.example.lab_work_smd_section_bscs_6c.RESTAPIExample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface MyretrofitInter {
    @GET("posts")
    Call<List<MyRestApiModel>> getList();
    @GET("post/1/comments")
    Call<List<MyCommentsModel>> getComments(@Path("id") int id);
    @GET("comments")
    Call<List<MyCommentsModel>> getMyComments(@Query("postId")int id,
                                              @Query(("_sort"))String sort,
                                              @Query("_order")String orderby);
    @GET()
    Call<List<MyCommentsModel>> GetAgainstUrl(@Url String Url);
}
