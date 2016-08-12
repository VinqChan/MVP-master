package com.app.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.mvp.R;
import com.app.mvp.bean.UserBean;
import com.app.mvp.presenter.UserPresenter;

public class MainActivity extends Activity implements  IUserView, View.OnClickListener{

    private EditText inputId, inputName, inputAddr;
    private Button saveBtn, loadBtn;
    private TextView infoTxt;

    private UserPresenter  presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }
    private void initData() {
        presenter = new UserPresenter(this);

        inputId = (EditText) findViewById(R.id.id_input);
        inputName = (EditText) findViewById(R.id.name_input);
        inputAddr = (EditText) findViewById(R.id.addr_input);
        saveBtn = (Button) findViewById(R.id.save_confirm);
        loadBtn = (Button) findViewById(R.id.get_confirm);
        infoTxt = (TextView) findViewById(R.id.show);

        saveBtn.setOnClickListener(this);
        loadBtn.setOnClickListener(this);
    }


    @Override
    public UserBean getUser() {
        UserBean info = new UserBean();
        info.setId(inputId.getText().toString());
        info.setName(inputName.getText().toString());
        info.setAdress(inputAddr.getText().toString());
        return info;
    }

    @Override
    public void setUser(UserBean info) {
        StringBuilder builder = new StringBuilder("");
        builder.append(info.getId());
        builder.append("\n");
        builder.append(info.getName());
        builder.append("\n");
        builder.append(info.getAdress());

        infoTxt.setText(builder.toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.save_confirm:
                presenter.setUser(getUser());
                break;
            case R.id.get_confirm:
                presenter.getUser();
                break;
        }
    }
}
