//package com.example.service;
//
//import java.util.concurrent.ExecutionException;
//
//import org.springframework.stereotype.Service;
//
//import com.example.demo.User;
//import com.google.api.core.ApiFuture;
//import com.google.cloud.firestore.Firestore;
//import com.google.cloud.firestore.WriteResult;
//import com.google.firebase.cloud.FirestoreClient;
//
//@Service
//public class FirebaseService {
//	public String saveUserDetails(User user) throws InterruptedException, ExecutionException
//	{
//		Firestore dbFirestore = FirestoreClient.getFirestore();
//		ApiFuture<WriteResult> collectionsApiFuture = (ApiFuture<WriteResult>) dbFirestore.collection("users").
//				document(user.getName());
//		return collectionsApiFuture.get().getUpdateTime().toString();
//	}
//
//}
