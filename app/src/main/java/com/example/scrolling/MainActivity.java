package com.example.scrolling;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mCommentButton;
    private EditText mEditText;
    private TextView mArticle_text;
    private String oldText;
    private String newText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.edit_comment);
        mCommentButton = (Button) findViewById(R.id.comment_button);
        mArticle_text = (TextView) findViewById(R.id.article);

        mCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setVisibility(v.VISIBLE);
//                oldText = mArticle_text.getText().toString();
//                mArticle_text.setText(oldText + "\n" + "\n" + "New comment: " + mEditText.getText().toString());
                addComment();
//                mEditText.setVisibility(v.INVISIBLE);
            }
        });


    }

    private void addComment() {
        oldText = mArticle_text.getText().toString();
        mArticle_text.setText(oldText + "\n" + "\n" + "New comment: " + mEditText.getText().toString());
    }
}