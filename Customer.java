package com.hexaware.MLP335.model;
import java.util.Objects;

public class Customer {
    private int cusid;
    private String cusname;
    private String cusemail;
    private String cusphone;
    private int cusdob;
    private String cusaddreess;

    public Customer(int cusid, String cusname, String cusemail, String cusphone, int cusdob, String cusaddreess) {
        this.cusid = cusid;
        this.cusname = cusname;
        this.cusemail = cusemail;
        this.cusphone = cusphone;
        this.cusdob = cusdob;
        this.cusaddreess = cusaddreess;
    }

    public Customer() {
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCusemail() {
        return cusemail;
    }

    public void setCusemail(String cusemail) {
        this.cusemail = cusemail;
    }

    public String getCusphone() {
        return cusphone;
    }

    public void setCusphone(String cusphone) {
        this.cusphone = cusphone;
    }

    public int getCusdob() {
        return cusdob;
    }

    public void setCusdob(int cusdob) {
        this.cusdob = cusdob;
    }

    public String getCusaddreess() {
        return cusaddreess;
    }

    public void setCusaddreess(String cusaddreess) {
        this.cusaddreess = cusaddreess;
    }
    
}


