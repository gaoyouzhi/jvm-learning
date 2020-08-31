package com.haochang.learn.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @description: 描述：公司
 * @author: youzhi.gao
 * @date: 2020-08-31 11:49
 */
public class Company implements Serializable {
    private Long organId;
    private String organName;
    private Long organType;
    private String symbol;
    private String contractNo;
    private Long hospitalLevel;
    private String infoSrc;
    private Date createDate;
    private Date infoUpdate;
    private Long priority;
    private String majorProduct;
    private String nameSymbol;
    private Date modifyDate;
    private Date delDate;
    private String industryBelong;
    private Long hmsEnabled;
    private Double capital;
    private Double turnover2Lastyear;
    private Long serviceLevel;
    private Long shareType;
    private String bedNum;
    private String buildingNum;
    private String nearbyHotel;
    private Long dailyMenzhen;
    private String fax;
    private String tel;
    private Long moneyLevel;
    private String email;
    private String web;
    private String mailAddress;
    private String zipcode;
    private String address;
    private String trafficInfo;
    private String expertDesc;
    private String intro;
    private String contactInfo;
    private String logo;
    private String leaderInfo;
    private String img1;
    private String memo;
    private String officeDesc;
    private Long employeeNum;
    private String dutyTime;
    private Long starLevel;
    private Long parentId;
    private String img2;
    private String img3;
    private String img4;
    private String insureDesc;
    private String cityid;
    private String contractFileurl;
    private String bookingMethod;
    private Long enabled;
    private String franchiseFee;
    private Double customerNum;
    private Date contractStart;
    private Date contractEnd;
    private String contractMemo;
    private Long isTmp;
    private String code;
    private String csHelo;
    private String part;
    private Long prepay;
    private Long jkcityOut;
    private Date lastConsumeTime;
    private String cardId;
    private String password;
    private String contactPerson;
    private String contactMobile;
    private Long payMethod;
    private Long sellerId;
    private String otherSeller;
    private Long dailiId;
    private String popPhone;
    private Long yearCharge;
    private Long yearFree;
    private Long contractType;
    private String contractPeople;
    private Double contractSum;
    private Long contractTimes;
    private String contractYueding;
    private String contractContent;
    private String contractNo1;
    private String contractSpan;
    private String payDate1;
    private String payDate2;
    private String payDate3;
    private String payDate4;
    private String payDate5;
    private String payDate6;
    private Long paySum1;
    private Long paySum2;
    private Long paySum3;
    private Long paySum4;
    private Long paySum5;
    private Long paySum6;
    private Long guahaoEnabled;
    private Long hmsOnly;
    private Long hmsNum;
    private Long hmsNumUsed;
    private Long organIndustry;
    private String hmsPass;
    private String smsMsg;
    private Long guahaoMaxtimes;
    private Long guahaoTimes;
    private Set hospitalServices = new HashSet(0);
    private Set doctorTimes = new HashSet(0);
    private Set menzhenGuahaoTimes = new HashSet(0);
    private Set clientMarketinfos = new HashSet(0);
    private Set hospitalDoctors = new HashSet(0);
    private Set hospitalOffices = new HashSet(0);
    private Set saleHistories = new HashSet(0);
    private Set devices = new HashSet(0);

    public Long getOrganId() {
        return this.organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }


    public String getOrganName() {
        return this.organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Long getOrganType() {
        return this.organType;
    }

    public void setOrganType(Long organType) {
        this.organType = organType;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getContractNo() {
        return this.contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getHospitalLevel() {
        return this.hospitalLevel;
    }

    public void setHospitalLevel(Long hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getInfoSrc() {
        return this.infoSrc;
    }

    public void setInfoSrc(String infoSrc) {
        this.infoSrc = infoSrc;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getInfoUpdate() {
        return this.infoUpdate;
    }

    public void setInfoUpdate(Date infoUpdate) {
        this.infoUpdate = infoUpdate;
    }

    public Long getPriority() {
        return this.priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public String getMajorProduct() {
        return this.majorProduct;
    }

    public void setMajorProduct(String majorProduct) {
        this.majorProduct = majorProduct;
    }

    public String getNameSymbol() {
        return this.nameSymbol;
    }

    public void setNameSymbol(String nameSymbol) {
        this.nameSymbol = nameSymbol;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getDelDate() {
        return this.delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public String getIndustryBelong() {
        return this.industryBelong;
    }

    public void setIndustryBelong(String industryBelong) {
        this.industryBelong = industryBelong;
    }

    public Long getHmsEnabled() {
        return this.hmsEnabled;
    }

    public void setHmsEnabled(Long hmsEnabled) {
        this.hmsEnabled = hmsEnabled;
    }

    public Double getCapital() {
        return this.capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getTurnover2Lastyear() {
        return this.turnover2Lastyear;
    }

    public void setTurnover2Lastyear(Double turnover2Lastyear) {
        this.turnover2Lastyear = turnover2Lastyear;
    }

    public Long getServiceLevel() {
        return this.serviceLevel;
    }

    public void setServiceLevel(Long serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Long getShareType() {
        return this.shareType;
    }

    public void setShareType(Long shareType) {
        this.shareType = shareType;
    }

    public String getBedNum() {
        return this.bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }

    public String getBuildingNum() {
        return this.buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getNearbyHotel() {
        return this.nearbyHotel;
    }

    public void setNearbyHotel(String nearbyHotel) {
        this.nearbyHotel = nearbyHotel;
    }

    public Long getDailyMenzhen() {
        return this.dailyMenzhen;
    }

    public void setDailyMenzhen(Long dailyMenzhen) {
        this.dailyMenzhen = dailyMenzhen;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getMoneyLevel() {
        return this.moneyLevel;
    }

    public void setMoneyLevel(Long moneyLevel) {
        this.moneyLevel = moneyLevel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrafficInfo() {
        return this.trafficInfo;
    }

    public void setTrafficInfo(String trafficInfo) {
        this.trafficInfo = trafficInfo;
    }

    public String getExpertDesc() {
        return this.expertDesc;
    }

    public void setExpertDesc(String expertDesc) {
        this.expertDesc = expertDesc;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLeaderInfo() {
        return this.leaderInfo;
    }

    public void setLeaderInfo(String leaderInfo) {
        this.leaderInfo = leaderInfo;
    }

    public String getImg1() {
        return this.img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOfficeDesc() {
        return this.officeDesc;
    }

    public void setOfficeDesc(String officeDesc) {
        this.officeDesc = officeDesc;
    }

    public Long getEmployeeNum() {
        return this.employeeNum;
    }

    public void setEmployeeNum(Long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getDutyTime() {
        return this.dutyTime;
    }

    public void setDutyTime(String dutyTime) {
        this.dutyTime = dutyTime;
    }

    public Long getStarLevel() {
        return this.starLevel;
    }

    public void setStarLevel(Long starLevel) {
        this.starLevel = starLevel;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getImg2() {
        return this.img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return this.img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return this.img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getInsureDesc() {
        return this.insureDesc;
    }

    public void setInsureDesc(String insureDesc) {
        this.insureDesc = insureDesc;
    }

    public String getContractFileurl() {
        return this.contractFileurl;
    }

    public void setContractFileurl(String contractFileurl) {
        this.contractFileurl = contractFileurl;
    }

    public String getBookingMethod() {
        return this.bookingMethod;
    }

    public void setBookingMethod(String bookingMethod) {
        this.bookingMethod = bookingMethod;
    }

    public Long getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    public String getFranchiseFee() {
        return this.franchiseFee;
    }

    public void setFranchiseFee(String franchiseFee) {
        this.franchiseFee = franchiseFee;
    }

    public Double getCustomerNum() {
        return this.customerNum;
    }

    public void setCustomerNum(Double customerNum) {
        this.customerNum = customerNum;
    }

    public Date getContractStart() {
        return this.contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return this.contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getContractMemo() {
        return this.contractMemo;
    }

    public void setContractMemo(String contractMemo) {
        this.contractMemo = contractMemo;
    }

    public Long getIsTmp() {
        return this.isTmp;
    }

    public void setIsTmp(Long isTmp) {
        this.isTmp = isTmp;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCsHelo() {
        return this.csHelo;
    }

    public void setCsHelo(String csHelo) {
        this.csHelo = csHelo;
    }

    public String getPart() {
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public Long getPrepay() {
        return this.prepay;
    }

    public void setPrepay(Long prepay) {
        this.prepay = prepay;
    }

    public Long getJkcityOut() {
        return this.jkcityOut;
    }

    public void setJkcityOut(Long jkcityOut) {
        this.jkcityOut = jkcityOut;
    }

    public Date getLastConsumeTime() {
        return this.lastConsumeTime;
    }

    public void setLastConsumeTime(Date lastConsumeTime) {
        this.lastConsumeTime = lastConsumeTime;
    }

    public String getCardId() {
        return this.cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactMobile() {
        return this.contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public Long getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(Long payMethod) {
        this.payMethod = payMethod;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getOtherSeller() {
        return this.otherSeller;
    }

    public void setOtherSeller(String otherSeller) {
        this.otherSeller = otherSeller;
    }

    public Long getDailiId() {
        return this.dailiId;
    }

    public void setDailiId(Long dailiId) {
        this.dailiId = dailiId;
    }

    public String getPopPhone() {
        return this.popPhone;
    }

    public void setPopPhone(String popPhone) {
        this.popPhone = popPhone;
    }

    public Long getYearCharge() {
        return this.yearCharge;
    }

    public void setYearCharge(Long yearCharge) {
        this.yearCharge = yearCharge;
    }

    public Long getYearFree() {
        return this.yearFree;
    }

    public void setYearFree(Long yearFree) {
        this.yearFree = yearFree;
    }

    public Long getContractType() {
        return this.contractType;
    }

    public void setContractType(Long contractType) {
        this.contractType = contractType;
    }

    public String getContractPeople() {
        return this.contractPeople;
    }

    public void setContractPeople(String contractPeople) {
        this.contractPeople = contractPeople;
    }

    public Double getContractSum() {
        return this.contractSum;
    }

    public void setContractSum(Double contractSum) {
        this.contractSum = contractSum;
    }

    public Long getContractTimes() {
        return this.contractTimes;
    }

    public void setContractTimes(Long contractTimes) {
        this.contractTimes = contractTimes;
    }

    public String getContractYueding() {
        return this.contractYueding;
    }

    public void setContractYueding(String contractYueding) {
        this.contractYueding = contractYueding;
    }

    public String getContractContent() {
        return this.contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }

    public String getContractNo1() {
        return this.contractNo1;
    }

    public void setContractNo1(String contractNo1) {
        this.contractNo1 = contractNo1;
    }

    public String getContractSpan() {
        return this.contractSpan;
    }

    public void setContractSpan(String contractSpan) {
        this.contractSpan = contractSpan;
    }

    public String getPayDate1() {
        return this.payDate1;
    }

    public void setPayDate1(String payDate1) {
        this.payDate1 = payDate1;
    }

    public String getPayDate2() {
        return this.payDate2;
    }

    public void setPayDate2(String payDate2) {
        this.payDate2 = payDate2;
    }

    public String getPayDate3() {
        return this.payDate3;
    }

    public void setPayDate3(String payDate3) {
        this.payDate3 = payDate3;
    }

    public String getPayDate4() {
        return this.payDate4;
    }

    public void setPayDate4(String payDate4) {
        this.payDate4 = payDate4;
    }

    public String getPayDate5() {
        return this.payDate5;
    }

    public void setPayDate5(String payDate5) {
        this.payDate5 = payDate5;
    }

    public String getPayDate6() {
        return this.payDate6;
    }

    public void setPayDate6(String payDate6) {
        this.payDate6 = payDate6;
    }

    public Long getPaySum1() {
        return this.paySum1;
    }

    public void setPaySum1(Long paySum1) {
        this.paySum1 = paySum1;
    }

    public Long getPaySum2() {
        return this.paySum2;
    }

    public void setPaySum2(Long paySum2) {
        this.paySum2 = paySum2;
    }

    public Long getPaySum3() {
        return this.paySum3;
    }

    public void setPaySum3(Long paySum3) {
        this.paySum3 = paySum3;
    }

    public Long getPaySum4() {
        return this.paySum4;
    }

    public void setPaySum4(Long paySum4) {
        this.paySum4 = paySum4;
    }

    public Long getPaySum5() {
        return this.paySum5;
    }

    public void setPaySum5(Long paySum5) {
        this.paySum5 = paySum5;
    }

    public Long getPaySum6() {
        return this.paySum6;
    }

    public void setPaySum6(Long paySum6) {
        this.paySum6 = paySum6;
    }

    public Long getGuahaoEnabled() {
        return this.guahaoEnabled;
    }

    public void setGuahaoEnabled(Long guahaoEnabled) {
        this.guahaoEnabled = guahaoEnabled;
    }

    public Long getHmsOnly() {
        return this.hmsOnly;
    }

    public void setHmsOnly(Long hmsOnly) {
        this.hmsOnly = hmsOnly;
    }

    public Long getHmsNum() {
        return this.hmsNum;
    }

    public void setHmsNum(Long hmsNum) {
        this.hmsNum = hmsNum;
    }

    public Long getHmsNumUsed() {
        return this.hmsNumUsed;
    }

    public void setHmsNumUsed(Long hmsNumUsed) {
        this.hmsNumUsed = hmsNumUsed;
    }

    public Long getOrganIndustry() {
        return this.organIndustry;
    }

    public void setOrganIndustry(Long organIndustry) {
        this.organIndustry = organIndustry;
    }

    public String getHmsPass() {
        return this.hmsPass;
    }

    public void setHmsPass(String hmsPass) {
        this.hmsPass = hmsPass;
    }

    public String getSmsMsg() {
        return this.smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg;
    }

    public Long getGuahaoMaxtimes() {
        return this.guahaoMaxtimes;
    }

    public void setGuahaoMaxtimes(Long guahaoMaxtimes) {
        this.guahaoMaxtimes = guahaoMaxtimes;
    }

    public Long getGuahaoTimes() {
        return this.guahaoTimes;
    }

    public void setGuahaoTimes(Long guahaoTimes) {
        this.guahaoTimes = guahaoTimes;
    }

    public Set getHospitalServices() {
        return this.hospitalServices;
    }

    public void setHospitalServices(Set hospitalServices) {
        this.hospitalServices = hospitalServices;
    }

    public Set getDoctorTimes() {
        return this.doctorTimes;
    }

    public void setDoctorTimes(Set doctorTimes) {
        this.doctorTimes = doctorTimes;
    }

    public Set getMenzhenGuahaoTimes() {
        return this.menzhenGuahaoTimes;
    }

    public void setMenzhenGuahaoTimes(Set menzhenGuahaoTimes) {
        this.menzhenGuahaoTimes = menzhenGuahaoTimes;
    }

    public Set getClientMarketinfos() {
        return this.clientMarketinfos;
    }

    public void setClientMarketinfos(Set clientMarketinfos) {
        this.clientMarketinfos = clientMarketinfos;
    }

    public Set getHospitalDoctors() {
        return this.hospitalDoctors;
    }

    public void setHospitalDoctors(Set hospitalDoctors) {
        this.hospitalDoctors = hospitalDoctors;
    }

    public Set getHospitalOffices() {
        return this.hospitalOffices;
    }

    public void setHospitalOffices(Set hospitalOffices) {
        this.hospitalOffices = hospitalOffices;
    }

    public Set getSaleHistories() {
        return this.saleHistories;
    }

    public void setSaleHistories(Set saleHistories) {
        this.saleHistories = saleHistories;
    }

    public Set getDevices() {
        return this.devices;
    }

    public void setDevices(Set devices) {
        this.devices = devices;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }


}
