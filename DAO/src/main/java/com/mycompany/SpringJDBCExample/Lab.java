/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.SpringJDBCExample;

/**
 *
 * @author w208999498
 */
public class Lab 
{
    private String obsv_num;
    private String med_rec_num;
    private String full_nm;
    private String obsv_nm;
    private String obsv_desc;
    private String obsv_val_qty;
    private String ref_low_qty;
    private String ref_high_qty;
    private String uom_nm;
    private String obsv_type_nm;
    private String obsv_rec_dtm;
    private String obsv_rslt_post_dtm;
    private String obsv_val_intpr_desc;

    public String getObsv_num() {
        return obsv_num;
    }

    public void setObsv_num(String obsv_num) {
        this.obsv_num = obsv_num;
    }

    public String getMed_rec_num() {
        return med_rec_num;
    }

    public void setMed_rec_num(String med_rec_num) {
        this.med_rec_num = med_rec_num;
    }

    public String getFull_name() {
        return full_nm;
    }

    public void setFull_name(String full_name) {
        this.full_nm = full_name;
    }

    public String getObsv_nm() {
        return obsv_nm;
    }

    public void setObsv_nm(String obsv_nm) {
        this.obsv_nm = obsv_nm;
    }

    public String getObsv_desc() {
        return obsv_desc;
    }

    public void setObsv_desc(String obsv_desc) {
        this.obsv_desc = obsv_desc;
    }

    public String getObsv_val_qty() {
        return obsv_val_qty;
    }

    public void setObsv_val_qty(String obsv_val_qty) {
        this.obsv_val_qty = obsv_val_qty;
    }

    public String getRef_low_qty() {
        return ref_low_qty;
    }

    public void setRef_low_qty(String ref_low_qty) {
        this.ref_low_qty = ref_low_qty;
    }

    public String getRef_high_qty() {
        return ref_high_qty;
    }

    public void setRef_high_qty(String ref_high_qty) {
        this.ref_high_qty = ref_high_qty;
    }

    public String getUom_nm() {
        return uom_nm;
    }

    public void setUom_nm(String uom_nm) {
        this.uom_nm = uom_nm;
    }

    public String getObsv_type_nm() {
        return obsv_type_nm;
    }

    public void setObsv_type_nm(String obsv_type_nm) {
        this.obsv_type_nm = obsv_type_nm;
    }

    public String getObsv_rec_dtm() {
        return obsv_rec_dtm;
    }

    public void setObsv_rec_dtm(String obsv_rec_dtm) {
        this.obsv_rec_dtm = obsv_rec_dtm;
    }

    public String getObsv_rslt_post_dtm() {
        return obsv_rslt_post_dtm;
    }

    public void setObsv_rslt_post_dtm(String obsv_rslt_post_dtm) {
        this.obsv_rslt_post_dtm = obsv_rslt_post_dtm;
    }

    public String getObsv_val_intpr_desc() {
        return obsv_val_intpr_desc;
    }

    public void setObsv_val_intpr_desc(String obsv_val_intpr_desc) {
        this.obsv_val_intpr_desc = obsv_val_intpr_desc;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "obsv_num='" + obsv_num + '\'' +
                ", med_rec_num='" + med_rec_num + '\'' +
                ", full_name='" + full_nm + '\'' +
                ", obsv_nm='" + obsv_nm + '\'' +
                ", obsv_desc='" + obsv_desc + '\'' +
                ", obsv_val_qty='" + obsv_val_qty + '\'' +
                ", ref_low_qty='" + ref_low_qty + '\'' +
                ", ref_high_qty='" + ref_high_qty + '\'' +
                ", uom_nm='" + uom_nm + '\'' +
                ", obsv_type_nm='" + obsv_type_nm + '\'' +
                ", obsv_rec_dtm='" + obsv_rec_dtm + '\'' +
                ", obsv_rslt_post_dtm='" + obsv_rslt_post_dtm + '\'' +
                ", obsv_val_intpr_desc='" + obsv_val_intpr_desc + '\'' +
                '}';
    }
}
