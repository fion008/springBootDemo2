package com.springboot.entity;

import java.util.Date;

public class Lotterydata {
    private Integer id;

    private String qihao;

    private String shuju;

    private String lanqiu;

    private String p1;

    private String p2;

    private String p3;

    private String p4;

    private String p5;

    private String p6;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQihao() {
        return qihao;
    }

    public void setQihao(String qihao) {
        this.qihao = qihao == null ? null : qihao.trim();
    }

    public String getShuju() {
        return shuju;
    }

    public void setShuju(String shuju) {
        this.shuju = shuju == null ? null : shuju.trim();
    }

    public String getLanqiu() {
        return lanqiu;
    }

    public void setLanqiu(String lanqiu) {
        this.lanqiu = lanqiu == null ? null : lanqiu.trim();
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1 == null ? null : p1.trim();
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2 == null ? null : p2.trim();
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3 == null ? null : p3.trim();
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4 == null ? null : p4.trim();
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5 == null ? null : p5.trim();
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6 == null ? null : p6.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}