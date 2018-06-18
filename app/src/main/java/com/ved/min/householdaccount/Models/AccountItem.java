package com.ved.min.householdaccount.Models;

import android.util.Log;

public class AccountItem {

    /**
     * 어플리케이션에서 사용하는 Item Data Model
    * */

    private long sumOfMoney;
    private String shopName;
    private String content;
    private String category;

    public AccountItem(){
        // default constructor
    }

    public AccountItem(long money, String shopName, String content, String category){
        this.sumOfMoney = money;
        this.shopName = shopName;
        this.content = content;
        this.category = category;
    }

    public long getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(long sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void printLog(String TAG){
        String log = Long.toString(this.sumOfMoney) + " , " + this.shopName +  " , " + this.content + " , " + this.category;
        Log.d(TAG, "AccountItem : " + log);
    }
}
