package com.gaonq.entity;

import java.util.Date;

public class Employee {
    private Integer auid;

    private String eid;

    private String userid;

    private String usercode;

    private String username;

    private String calendarcode;

    private String deptcode;

    private String deptname;

    private String companycode;

    private String companyname;

    private String jobcode;

    private String jobname;

    private String ptjobcode;

    private String ptjobname;

    private String costcenter;

    private String costcenterdes;

    private String emptypefin;

    private String emptypehr;

    private String gradecode;

    private String gradelevel;

    private Date joindate;

    private Date probationdate;

    private String workcity;

    private String idtype;

    private String idnumber;

    private String gender;

    private Date birthday;

    private String email;

    private String accountname;

    private String contracttype;

    private String contracttypedescription;

    private String isdispatch;

    private String contractstartdate;

    private String contractenddate;

    private String isnoncompete;

    private Date noncompetedate;

    private String competecompany;

    private Integer status;

    private Date lastdate;

    private String mobile;

    private String servicecity;

    private Date positivedate;

    private String costdivision;

    private String costdivisiondes;

    private String fullattendaward;

    private String fullattendawarddes;

    private String employeegroup;

    private String employeegroupdes;

    private String pnabsence;

    private String pnabsencedesc;

    private String sequence;

    private String sequencedes;

    private String subsequence;

    private String subsequencedes;

    private Date createon;

    private Integer state;

    private Date modifyon;

    public Employee(Integer auid, String eid, String userid, String usercode, String username, String calendarcode, String deptcode, String deptname, String companycode, String companyname, String jobcode, String jobname, String ptjobcode, String ptjobname, String costcenter, String costcenterdes, String emptypefin, String emptypehr, String gradecode, String gradelevel, Date joindate, Date probationdate, String workcity, String idtype, String idnumber, String gender, Date birthday, String email, String accountname, String contracttype, String contracttypedescription, String isdispatch, String contractstartdate, String contractenddate, String isnoncompete, Date noncompetedate, String competecompany, Integer status, Date lastdate, String mobile, String servicecity, Date positivedate, String costdivision, String costdivisiondes, String fullattendaward, String fullattendawarddes, String employeegroup, String employeegroupdes, String pnabsence, String pnabsencedesc, String sequence, String sequencedes, String subsequence, String subsequencedes, Date createon, Integer state, Date modifyon) {
        this.auid = auid;
        this.eid = eid;
        this.userid = userid;
        this.usercode = usercode;
        this.username = username;
        this.calendarcode = calendarcode;
        this.deptcode = deptcode;
        this.deptname = deptname;
        this.companycode = companycode;
        this.companyname = companyname;
        this.jobcode = jobcode;
        this.jobname = jobname;
        this.ptjobcode = ptjobcode;
        this.ptjobname = ptjobname;
        this.costcenter = costcenter;
        this.costcenterdes = costcenterdes;
        this.emptypefin = emptypefin;
        this.emptypehr = emptypehr;
        this.gradecode = gradecode;
        this.gradelevel = gradelevel;
        this.joindate = joindate;
        this.probationdate = probationdate;
        this.workcity = workcity;
        this.idtype = idtype;
        this.idnumber = idnumber;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.accountname = accountname;
        this.contracttype = contracttype;
        this.contracttypedescription = contracttypedescription;
        this.isdispatch = isdispatch;
        this.contractstartdate = contractstartdate;
        this.contractenddate = contractenddate;
        this.isnoncompete = isnoncompete;
        this.noncompetedate = noncompetedate;
        this.competecompany = competecompany;
        this.status = status;
        this.lastdate = lastdate;
        this.mobile = mobile;
        this.servicecity = servicecity;
        this.positivedate = positivedate;
        this.costdivision = costdivision;
        this.costdivisiondes = costdivisiondes;
        this.fullattendaward = fullattendaward;
        this.fullattendawarddes = fullattendawarddes;
        this.employeegroup = employeegroup;
        this.employeegroupdes = employeegroupdes;
        this.pnabsence = pnabsence;
        this.pnabsencedesc = pnabsencedesc;
        this.sequence = sequence;
        this.sequencedes = sequencedes;
        this.subsequence = subsequence;
        this.subsequencedes = subsequencedes;
        this.createon = createon;
        this.state = state;
        this.modifyon = modifyon;
    }

    public Employee() {
        super();
    }

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCalendarcode() {
        return calendarcode;
    }

    public void setCalendarcode(String calendarcode) {
        this.calendarcode = calendarcode == null ? null : calendarcode.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getPtjobcode() {
        return ptjobcode;
    }

    public void setPtjobcode(String ptjobcode) {
        this.ptjobcode = ptjobcode == null ? null : ptjobcode.trim();
    }

    public String getPtjobname() {
        return ptjobname;
    }

    public void setPtjobname(String ptjobname) {
        this.ptjobname = ptjobname == null ? null : ptjobname.trim();
    }

    public String getCostcenter() {
        return costcenter;
    }

    public void setCostcenter(String costcenter) {
        this.costcenter = costcenter == null ? null : costcenter.trim();
    }

    public String getCostcenterdes() {
        return costcenterdes;
    }

    public void setCostcenterdes(String costcenterdes) {
        this.costcenterdes = costcenterdes == null ? null : costcenterdes.trim();
    }

    public String getEmptypefin() {
        return emptypefin;
    }

    public void setEmptypefin(String emptypefin) {
        this.emptypefin = emptypefin == null ? null : emptypefin.trim();
    }

    public String getEmptypehr() {
        return emptypehr;
    }

    public void setEmptypehr(String emptypehr) {
        this.emptypehr = emptypehr == null ? null : emptypehr.trim();
    }

    public String getGradecode() {
        return gradecode;
    }

    public void setGradecode(String gradecode) {
        this.gradecode = gradecode == null ? null : gradecode.trim();
    }

    public String getGradelevel() {
        return gradelevel;
    }

    public void setGradelevel(String gradelevel) {
        this.gradelevel = gradelevel == null ? null : gradelevel.trim();
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Date getProbationdate() {
        return probationdate;
    }

    public void setProbationdate(Date probationdate) {
        this.probationdate = probationdate;
    }

    public String getWorkcity() {
        return workcity;
    }

    public void setWorkcity(String workcity) {
        this.workcity = workcity == null ? null : workcity.trim();
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    public String getContracttypedescription() {
        return contracttypedescription;
    }

    public void setContracttypedescription(String contracttypedescription) {
        this.contracttypedescription = contracttypedescription == null ? null : contracttypedescription.trim();
    }

    public String getIsdispatch() {
        return isdispatch;
    }

    public void setIsdispatch(String isdispatch) {
        this.isdispatch = isdispatch == null ? null : isdispatch.trim();
    }

    public String getContractstartdate() {
        return contractstartdate;
    }

    public void setContractstartdate(String contractstartdate) {
        this.contractstartdate = contractstartdate == null ? null : contractstartdate.trim();
    }

    public String getContractenddate() {
        return contractenddate;
    }

    public void setContractenddate(String contractenddate) {
        this.contractenddate = contractenddate == null ? null : contractenddate.trim();
    }

    public String getIsnoncompete() {
        return isnoncompete;
    }

    public void setIsnoncompete(String isnoncompete) {
        this.isnoncompete = isnoncompete == null ? null : isnoncompete.trim();
    }

    public Date getNoncompetedate() {
        return noncompetedate;
    }

    public void setNoncompetedate(Date noncompetedate) {
        this.noncompetedate = noncompetedate;
    }

    public String getCompetecompany() {
        return competecompany;
    }

    public void setCompetecompany(String competecompany) {
        this.competecompany = competecompany == null ? null : competecompany.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getServicecity() {
        return servicecity;
    }

    public void setServicecity(String servicecity) {
        this.servicecity = servicecity == null ? null : servicecity.trim();
    }

    public Date getPositivedate() {
        return positivedate;
    }

    public void setPositivedate(Date positivedate) {
        this.positivedate = positivedate;
    }

    public String getCostdivision() {
        return costdivision;
    }

    public void setCostdivision(String costdivision) {
        this.costdivision = costdivision == null ? null : costdivision.trim();
    }

    public String getCostdivisiondes() {
        return costdivisiondes;
    }

    public void setCostdivisiondes(String costdivisiondes) {
        this.costdivisiondes = costdivisiondes == null ? null : costdivisiondes.trim();
    }

    public String getFullattendaward() {
        return fullattendaward;
    }

    public void setFullattendaward(String fullattendaward) {
        this.fullattendaward = fullattendaward == null ? null : fullattendaward.trim();
    }

    public String getFullattendawarddes() {
        return fullattendawarddes;
    }

    public void setFullattendawarddes(String fullattendawarddes) {
        this.fullattendawarddes = fullattendawarddes == null ? null : fullattendawarddes.trim();
    }

    public String getEmployeegroup() {
        return employeegroup;
    }

    public void setEmployeegroup(String employeegroup) {
        this.employeegroup = employeegroup == null ? null : employeegroup.trim();
    }

    public String getEmployeegroupdes() {
        return employeegroupdes;
    }

    public void setEmployeegroupdes(String employeegroupdes) {
        this.employeegroupdes = employeegroupdes == null ? null : employeegroupdes.trim();
    }

    public String getPnabsence() {
        return pnabsence;
    }

    public void setPnabsence(String pnabsence) {
        this.pnabsence = pnabsence == null ? null : pnabsence.trim();
    }

    public String getPnabsencedesc() {
        return pnabsencedesc;
    }

    public void setPnabsencedesc(String pnabsencedesc) {
        this.pnabsencedesc = pnabsencedesc == null ? null : pnabsencedesc.trim();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getSequencedes() {
        return sequencedes;
    }

    public void setSequencedes(String sequencedes) {
        this.sequencedes = sequencedes == null ? null : sequencedes.trim();
    }

    public String getSubsequence() {
        return subsequence;
    }

    public void setSubsequence(String subsequence) {
        this.subsequence = subsequence == null ? null : subsequence.trim();
    }

    public String getSubsequencedes() {
        return subsequencedes;
    }

    public void setSubsequencedes(String subsequencedes) {
        this.subsequencedes = subsequencedes == null ? null : subsequencedes.trim();
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getModifyon() {
        return modifyon;
    }

    public void setModifyon(Date modifyon) {
        this.modifyon = modifyon;
    }
}