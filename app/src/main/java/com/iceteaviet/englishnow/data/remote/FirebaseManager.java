package com.iceteaviet.englishnow.data.remote;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.iceteaviet.englishnow.data.model.api.LoginRequest;
import com.iceteaviet.englishnow.data.model.api.RegisterRequest;

import io.reactivex.Single;

/**
 * Created by Genius Doan on 12/26/2017.
 */

public interface FirebaseManager {
    FirebaseAuth getFirebaseAuth();

    Single<AuthResult> doServerLoginFirebaseCall(LoginRequest.ServerLoginRequest request);

    Single<AuthResult> doServerRegisterFirebaseCall(RegisterRequest.ServerRegisterRequest request);
}