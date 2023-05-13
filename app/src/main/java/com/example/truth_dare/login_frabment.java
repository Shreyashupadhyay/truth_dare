package com.example.truth_dare;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class login_frabment extends Fragment {

    EditText email, pass;
    Button login;
    TextView forget;
    float v =  0;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_fragment,container,false);

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        login = root.findViewById(R.id.login);
        forget = root.findViewById(R.id.forget);



        email.setTranslationY(800);
        pass.setTranslationY(800);
        login.setTranslationY(800);
        forget.setTranslationY(800);


        email.setAlpha(v);
        pass.setAlpha(v);
        login.setAlpha(v);
        forget.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        forget.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_frabment.this.getActivity(), OptionActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }
}
