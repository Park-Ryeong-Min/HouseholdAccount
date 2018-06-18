package com.ved.min.householdaccount.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.ved.min.householdaccount.Models.AccountItem;
import com.ved.min.householdaccount.R;

public class ItemInputFragment extends Fragment {

    /**
    * 아이템 입력 프레그먼트
    * */

    final String TAG = "ITEM_INPUT_FRAGMENT";

    // Components using in fragment
    private EditText edtTxtInputSumOfMoney;
    private EditText edtTxtInputShopName;
    private EditText edtTxtInputContent;
    private EditText edtTxtInputCategory;
    private Button btnInputItem;

    public ItemInputFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_item_input, container, false);

        initComponents(layout);
        return layout;
    }

    private void initComponents(View view){
        edtTxtInputSumOfMoney = (EditText)view.findViewById(R.id.fragment_item_input_edt_txt_sum_of_money);
        edtTxtInputShopName = (EditText)view.findViewById(R.id.fragment_item_input_edt_txt_shop_name);
        edtTxtInputContent = (EditText)view.findViewById(R.id.fragment_item_input_edt_txt_content);
        edtTxtInputCategory = (EditText)view.findViewById(R.id.fragment_item_input_edt_txt_category);

        btnInputItem = (Button)view.findViewById(R.id.fragment_item_input_write_button);
        btnInputItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEditTextEmpty(edtTxtInputSumOfMoney)){
                    Toast.makeText(getActivity(), "금액을 입력해 주십시오.", Toast.LENGTH_LONG).show();
                    return;
                }
                if(isEditTextEmpty(edtTxtInputShopName)){
                    Toast.makeText(getActivity(), "장소를 입력해 주십시오.", Toast.LENGTH_LONG).show();
                    return;
                }
                if(isEditTextEmpty(edtTxtInputContent)){
                    Toast.makeText(getActivity(), "내용을 입력해 주십시오.", Toast.LENGTH_LONG).show();
                    return;
                }
                if(isEditTextEmpty(edtTxtInputCategory)){
                    Toast.makeText(getActivity(), "분류를 입력해 주십시오.", Toast.LENGTH_LONG).show();
                    return;
                }

                long money = Long.parseLong(edtTxtInputSumOfMoney.getText().toString());
                String shop = edtTxtInputShopName.getText().toString();
                String content = edtTxtInputContent.getText().toString();
                String category = edtTxtInputCategory.getText().toString();

                AccountItem item = new AccountItem(money, shop, content, category);
                item.printLog(TAG);
            }

            private boolean isEditTextEmpty(EditText edttxt){
                if (edttxt.getText().toString().trim().length() > 0) {
                    return false;
                }else{
                    return true;
                }
            }
        });
    }
}
