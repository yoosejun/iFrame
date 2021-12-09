package com.cen.member.model;

import java.util.Date;

public class MemberVo {

   private String email  = "";
   private String name = "";
   private String password  = "";
   private Date birth  = null;
   private String phonenum  = "";
   private String address1  = "";
   private String address2  = "";
   private String address3  = "";
   private Date createDate = null;
   private Date modifyDate = null;
   private int adminCk;
   private int point;
   
   public MemberVo() {
      super();
      // TODO Auto-generated constructor stub
   }
      
   public MemberVo(String email, String name, String password, Date birth, String phonenum, String address1, 
         String address2, String address3, Date createDate, Date modifyDate, int adminCk, int point) {
      super();
      this.email = email;
      this.name = name;
      this.password = password;
      this.birth = birth;
      this.phonenum = phonenum;
      this.address1 = address1;
      this.address2 = address2;
      this.address3 = address3;
      this.createDate = createDate;
      this.modifyDate = modifyDate;
      this.adminCk = adminCk;
      this.point = point;
      }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Date getBirth() {
      return birth;
   }

   public void setBirth(Date birth) {
      this.birth = birth;
   }

   public String getPhonenum() {
      return phonenum;
   }

   public void setPhonenum(String phonenum) {
      this.phonenum = phonenum;
   }

   public String getAddress1() {
      return address1;
   }

   public void setAddress1(String address1) {
      this.address1 = address1;
   }

   public String getAddress2() {
      return address2;
   }

   public void setAddress2(String address2) {
      this.address2 = address2;
   }

   public String getAddress3() {
      return address3;
   }

   public void setAddress3(String address3) {
      this.address3 = address3;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public Date getModifyDate() {
      return modifyDate;
   }

   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }

   public int getAdminCk() {
      return adminCk;
   }

   public void setAdminCk(int adminCk) {
      this.adminCk = adminCk;
   }

   public int getPoint() {
      return point;
   }

   public void setPoint(int point) {
      this.point = point;
   }

   @Override
   public String toString() {
      return "MemberVo [email=" + email + ", name=" + name + ", password=" + password + ", birth=" + birth
            + ", phonenum=" + phonenum + ", address1=" + address1 + ", address2=" + address2 + ", address3="
            + address3 + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", adminCk=" + adminCk
            + ", point=" + point + "]";
   }

}