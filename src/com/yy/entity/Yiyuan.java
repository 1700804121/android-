package com.yy.entity;

import java.io.Serializable;

/**
 * �γ���Ϣ��
 */
public class Yiyuan implements Serializable {

    private int yid;//ҽԺid
    private String name;//ҽԺ����
    private String jianjie;//ҽԺ���
    private String phone;//ҽԺ����
    private String dizhi;//ҽԺ����
    private String icon;//ҽԺ����

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Yiyuan() {
    }

    public Yiyuan(int yid, String name, String jianjie, String phone, String dizhi, String icon) {
        this.yid = yid;
        this.name = name;
        this.jianjie = jianjie;
        this.phone = phone;
        this.dizhi = dizhi;
        this.icon = icon;
    }
}
