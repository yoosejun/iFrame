package com.cen.member.model;

import java.util.Date;

public class MemberVo {

   private int mno = 0;
   private String mname = "";
   private String memail  = "";
   private String mpassword  = "";
   private Date mbirth  = null;
   private String mphonenum  = "";
   private String maddress  = "";
   private Date mcre_date = null;
   private Date mmod_date = null;
   
   
   public MemberVo() {
      super();
      // TODO Auto-generated constructor stub
   }
   
   public MemberVo(int mno, String mname, String memail, String mpassword, Date mbirth, String mphonenum,
         String maddress, Date mcre_date, Date mmod_date) {
      super();
      this.mno = mno;
      this.mname = mname;
      this.memail = memail;
      this.mpassword = mpassword;
      this.mbirth = mbirth;
      this.mphonenum = mphonenum;
      this.maddress = maddress;
      this.mcre_date = mcre_date;
      this.mmod_date = mmod_date;
   }
   public int getMno() {
      return mno;
   }
   public void setMno(int mno) {
      this.mno = mno;
   }
   public String getMname() {
      return mname;
   }
   public void setMname(String mname) {
      this.mname = mname;
   }
   public String getMemail() {
      return memail;
   }
   public void setMemail(String memail) {
      this.memail = memail;
   }
   public String getMpassword() {
      return mpassword;
   }
   public void setMpassword(String mpassword) {
      this.mpassword = mpassword;
   }
   public Date getMbirth() {
      return mbirth;
   }
   public void setMbirth(Date mbirth) {
      this.mbirth = mbirth;
   }
   public String getMphonenum() {
      return mphonenum;
   }
   public void setMphonenum(String mphonenum) {
      this.mphonenum = mphonenum;
   }
   public String getMaddress() {
      return maddress;
   }
   public void setMaddress(String maddress) {
      this.maddress = maddress;
   }
   public Date getMcre_date() {
      return mcre_date;
   }
   public void setMcre_date(Date mcre_date) {
      this.mcre_date = mcre_date;
   }
   public Date getMmod_date() {
      return mmod_date;
   }
   public void setMmod_date(Date mmod_date) {
      this.mmod_date = mmod_date;
   }
   @Override
   public String toString() {
      return "MemberVo [mno=" + mno + ", mname=" + mname + ", memail=" + memail + ", mpassword=" + mpassword
            + ", mbirth=" + mbirth + ", mphonenum=" + mphonenum + ", maddress=" + maddress + ", mcre_date="
            + mcre_date + ", mmod_date=" + mmod_date + "]";
   }
}