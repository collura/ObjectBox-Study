package com.study.collura.objectboxstudy.mvp.main;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.study.collura.objectbox_study.R;
import com.study.collura.objectboxstudy.mvp.base.BaseView;
import com.study.collura.objectboxstudy.mvp.data.model.MyObjectBox;
import com.study.collura.objectboxstudy.mvp.data.model.User;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class AppMainActivity extends BaseView {

    private BoxStore objectBox;
    private Box userBox;
    private Button gravar;
    private EditText texto;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        gravar = findViewById ( R.id.bt_gravar );
        texto = findViewById ( R.id.ed_text );

        objectBox  = MyObjectBox.builder().androidContext(AppMainActivity.this).build();
        userBox = objectBox.boxFor( User.class );

        gravar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                User user = new User ( 0, texto.getText ().toString ());
                userBox.put (user);
                Toast.makeText (AppMainActivity.this, "Texto salvo !", Toast.LENGTH_SHORT).show ();
            }
        });

        List <User>users = userBox.getAll ();

        if( users.size () > 0 ) {
            for ( User user : users ) {
                Toast.makeText (this, "Id número: " + user.getId () + "\n" + "Nome:  " + user.getText (), Toast.LENGTH_SHORT).show ();

            }
            userBox.removeAll ();
        }
    }

    @Override
    protected void showToast (String msg) {

    }

    @Override
    protected void showSnackBar (String msg) {

    }

    @Override
    protected void dismissSnackBar () {

    }

    @Override
    protected void showProgressBar (String msg) {

    }

    @Override
    protected void dismissProgressBar () {

    }

    @Override
    protected void onDestroy () {
        super.onDestroy ();
        objectBox.close ();
    }
}
