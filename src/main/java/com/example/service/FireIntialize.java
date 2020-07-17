//package com.example.service;
//
//import java.io.FileInputStream;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.stereotype.Service;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//
//
//@Service
//public class FireIntialize {
//	@PostConstruct
//	public void intialize()
//	{
//		try {
//
//FileInputStream serviceAccount =
//  new FileInputStream("path/to/serviceAccountKey.json");
//
//FirebaseOptions options = new FirebaseOptions.Builder()
//  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//  .setDatabaseUrl("https://usercase-38447.firebaseio.com")
//  .build();
//
//FirebaseApp.initializeApp(options);
//
//	}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}
