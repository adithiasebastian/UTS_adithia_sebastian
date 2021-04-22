package com.adithia.adithiasebastian.service;

import com.adithia.adithiasebastian.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
