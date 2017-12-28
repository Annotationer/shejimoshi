package com.sunp.learn.annotation;

import java.lang.annotation.ElementType;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 卡管送核心申请文件接口
 * 
 * @author yuyang
 *
 */
public class ApplyFileItem {
	
	/**
	 * 机构号
	 */
	@CChar( value = 12, order = 100 )
	@CException( value = "R270")
	public String org;

	/**
	 * 主附卡指示
	 */
	@CChar( value = 1, order = 200 )
	@CException( value = "R019")
	public String bscSuppInd;
	
	/**
	 * 产品代码
	 */
	@CChar( value = 6, order = 300 )
	@CException( value = "R271")
	public String productCd;

	/**
	 * 介质卡号
	 */
	@CChar( value = 19, order = 400 )
	@CException( value = "R272")
	public String cardNo;

	/**
	 * 对应主卡介质卡号
	 */
	@CChar( value = 19, order = 500 )
	@CException( value = "R273")
	public String primCardNo;

	/**
	 * 对应主卡逻辑卡号
	 */
	@CChar( value = 19, order = 600 )
	@CException( value = "R274")
	public String bscLogicalCardNo;

	/**
	 * 申请信息类型
	 */
	@CChar( value = 1, order = 700 )
	@CException( value = "R020")
	public String appType;

	/**
	 * 申请件编号
	 */
	@CChar( value = 20, autoTrim = true, order = 800 )
	@CException( value = "R275")
	public String appNo;

	/**
	 * 对应主卡申请记录编号
	 */
	@CChar( value = 20, autoTrim = true, order = 900 )
	@CException( value = "R276")
	public String primAppId;

	/**
	 * 消费凭密选择
	 */
	@CChar( value = 1, required = true, order = 1000 )
	@CException( value = "R021")
	public String posPinVerifyInd;

	/**
	 * 彩照卡标志
	 */
	@CChar( value = 1, order = 1100 )
	@CException( value = "R022")
	public String photoUseFlag;

	/**
	 * 本行员工编号
	 */
	@CChar( value = 20, autoTrim = true, order = 1200 )
	@CException( value = "R277")
	public String bankmemberNo;

	/**
	 * 姓名（中文）
	 */
	@CChar( value = 80, autoTrim = true, order = 1300 )
	@CException( value = "R278")
	public String name;

	/**
	 * 性别
	 */
	@CChar( value = 1, order = 1400 )
	@CException( value = "R023")
	public String gender;

	/**
	 * 出生日期
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 1500 )
	@CException(value = "R087")
	public Date birthday;

	/**
	 * 婚姻状况
	 */
	@CChar( value = 1, order = 1600 )
	@CException( value = "R024")
	public String maritalStatus;

	/**
	 * 国籍
	 */
	@CChar( value = 3, order = 1700 )
	@CException( value = "R279")
	public String nationality;

	/**
	 * 家庭人口
	 */
	@CChar( value = 2, zeroPadding = true, order = 1800 )
	@CException(value = "R088")
	public Integer nbrOfDependents;

	/**
	 * 证件类型
	 */
	@CChar( value = 1, order = 1900 )
	@CException( value = "R025")
	public String idType;

	/**
	 * 证件号码
	 */
	@CChar( value = 30, autoTrim = true, order = 2000 )
	@CException( value = "R280")
	public String idNo;

	/**
	 * 教育程度
	 */
	@CChar( value = 1, order = 2100 )
	@CException( value = "R026")
	public String qualification;

	/**
	 * 现住址
	 */
	@CChar( value = 200, autoTrim = true, order = 2200 )
	@CException( value = "R281")
	public String homeAddress;

	/**
	 * 现住址邮编
	 */
	@CChar( value = 10, autoTrim = true, order = 2300 )
	@CException( value = "R282")
	public String homeZip;

	/**
	 * 现住址居住起始年月
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 2400 )
	@CException(value = "R089")
	public Date homeStandFrom;

	/**
	 * 现住址电话号码
	 */
	@CChar( value = 15, autoTrim = true, order = 2500 )
	@CException( value = "R283")
	public String homePhone;

	/**
	 * 移动电话号码
	 */
	@CChar( value = 20, autoTrim = true, order = 2600 )
	@CException( value = "R284")
	public String mobileNo;

	/**
	 * 电子信箱
	 */
	@CChar( value = 80, autoTrim = true, order = 2700 )
	@CException( value = "R285")
	public String email;

	/**
	 * 住宅状况
	 */
	@CChar( value = 1, order = 2800 )
	@CException( value = "R027")
	public String houseOwnership;

	/**
	 * 是否有按揭贷款
	 */
	@CChar( value = 1, order = 2900 )
	@CException( value = "R028")
	public boolean houseLoanFlag;

	/**
	 * 单位全称
	 */
	@CChar( value = 80, autoTrim = true, order = 3000 )
	@CException( value = "R286")
	public String companyName;

	/**
	 * 单位地址
	 */
	@CChar( value = 200, autoTrim = true, order = 3100 )
	@CException( value = "R287")
	public String companyAddress;

	/**
	 * 单位邮编
	 */
	@CChar( value = 10, autoTrim = true, order = 3200 )
	@CException( value = "R288")
	public String companyZip;

	/**
	 * 单位电话号码
	 */
	@CChar( value = 20, autoTrim = true, order = 3300 )
	@CException( value = "R289")
	public String companyPhone;

	/**
	 * 单位性质
	 */
	@CChar( value = 1, order = 3400 )
	@CException( value = "R029")
	public String companyCategory;

	/**
	 * 行业类别
	 */
	@CChar( value = 2, order = 3500 )
	@CException( value = "R030")
	public String industryCategory;

	/**
	 * 职业
	 */
	@CChar( value = 1, order = 3600 )
	@CException( value = "R031")
	public String occupation;

	/**
	 * 职称
	 */
	@CChar( value = 1, order = 3700 )
	@CException( value = "R032")
	public String titleOfTechnical;

	/**
	 * 职务
	 */
	@CChar( value = 1, order = 3800 )
	@CException( value = "R033")
	public String title;

	/**
	 * 个人年收入
	 */
	@CChar( value = 12, precision = 2, zeroPadding = true, order = 3900 )
	@CException(value = "R090")
	public BigDecimal revenuePerYear;

	/**
	 * 家庭人均年收入
	 */
	@CChar( value = 12, precision = 2, zeroPadding = true, order = 4000 )
	@CException(value = "R091")
	public BigDecimal familyAverageRevenue;

	/**
	 * 自动还款方式
	 */
	@CChar( value = 1, order = 4100 )
	@CException( value = "R034")
	public String ddInd;

	/**
	 * 约定还款开户行号
	 */
	@CChar( value = 9, autoTrim = true, order = 4200 )
	@CException( value = "R290")
	public String ddBankBranch;

	/**
	 * 约定还款扣款账号
	 */
	@CChar( value = 40, autoTrim = true, order = 4300 )
	@CException( value = "R291")
	public String ddBankAcctNo;

	/**
	 * 卡片寄送方式
	 */
	@CChar( value = 1, order = 4400 )
	@CException( value = "R035")
	public String cardFetchMethod;

	/**
	 * 预留问题
	 */
	@CChar( value = 40, autoTrim = true, order = 4500 )
	@CException( value = "R292")
	public String obligateQuestion;

	/**
	 * 预留答案
	 */
	@CChar( value = 40, autoTrim = true, order = 4600 )
	@CException( value = "R293")
	public String obligateAnswer;

	/**
	 * 联系人姓名（中文）
	 */
	@CChar( value = 80, autoTrim = true, order = 4700 )
	@CException( value = "R294")
	public String contactName;

	/**
	 * 联系人与申请人关系
	 */
	@CChar( value = 1, order = 4800 )
	@CException( value = "R036")
	public String contactRelationship;

	/**
	 * 联系人身份证件名称
	 */
	@CChar( value = 1, order = 4900 )
	@CException( value = "R037")
	public String contactIdType;

	/**
	 * 联系人证件号码
	 */
	@CChar( value = 30, autoTrim = true, order = 5000 )
	@CException( value = "R295")
	public String contactIdNo;

	/**
	 * 联系人公司电话号码
	 */
	@CChar( value = 15, autoTrim = true, order = 5100 )
	@CException( value = "R296")
	public String contactCorpPhone;

	/**
	 * 信用额度
	 */
	@CChar( value = 13, zeroPadding = true, order = 5200 )
	@CException(value = "R092")
	public BigDecimal creditLimit;
	
	/**
	 * 公务卡额度
	 */
	@CChar( value = 13, zeroPadding = true, order = 5210 )
	@CException(value = "R093")
	public BigDecimal civilServiceLimit;
	
	/**
	 * 小额贷款额度
	 */
	@CChar( value = 13, zeroPadding = true, order = 5220 )
	@CException(value = "R094")
	public BigDecimal microCreditLimit;
	
	/**
	 * 商务卡额度
	 */
	@CChar( value = 13, zeroPadding = true, order = 5225 )
	@CException(value = "R095")
	public BigDecimal businessLimit;
	
	/**
	 * 专项额度车贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5230 )
	@CException(value = "R096")
	public BigDecimal carLoan;
	
	/**
	 * 专项额度房贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5240 )
	@CException(value = "R097")
	public BigDecimal houseLoan;
	
	/**
	 * 专项额度装修贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5250 )
	@CException(value = "R098")
	public BigDecimal renovationLoan;
	
	/**
	 * 专项额度旅游贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5260 )
	@CException(value = "R099")
	public BigDecimal travelLoan;
	
	/**
	 * 专项额度婚庆贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5270 )
	@CException(value = "R100")
	public BigDecimal weddingLoan;
	
	/**
	 * 专项额度耐消贷
	 */
	@CChar( value = 13, zeroPadding = true, order = 5280 )
	@CException(value = "R101")
	public BigDecimal durableLoan;
	
	/**
	 * 周期限额
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5300 )
	@CException(value="R102")
	public BigDecimal cardCycleLimit;

	/**
	 * 周期取现限额
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5400 )
	@CException(value = "R103")
	public BigDecimal cardCycleCashLimit;

	/**
	 * 网银周期交易限额
	 */
	@CChar( value = 13, zeroPadding = true, order = 5500 )
	@CException(value = "R104")
	public BigDecimal cardCycleNetLimit;

	/**
	 * 单笔交易限额
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5600 )
	@CException(value = "R105")
	public BigDecimal cardTxnLimit;

	/**
	 * 单笔取现交易限额
	 */
	@CChar( value = 13, zeroPadding = true, order = 5700 )
	@CException(value = "R106")
	public BigDecimal cardTxnCashLimit;

	/**
	 * 网银单笔交易限额
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5800 )
	@CException(value = "R107")
	public BigDecimal cardTxnNetLimit;

	/**
	 * 账单介质类型标志
	 */
	@CChar( value = 1, order = 5900 )
	@CException( value = "R038")
	public String stmtMediaType;

	/**
	 * 账单寄送标志
	 */
	@CChar( value = 1, order = 6000 )
	@CException( value = "R039")
	public String stmtMailAddrInd;
	
	/**
	 * 版面代码
	 */
	@CChar( value = 10, autoTrim = true, order = 6100 )
	@CException( value = "R297")
	public String designCd;
	/**
	 * 联名卡会员编号
	 */
	@CChar( value = 80, autoTrim = true, order = 6200 )
	@CException( value = "R298")
	public String cobrandNo;
	/**
	 * 凸印名-姓名拼音
	 */
	@CChar( value = 26, autoTrim = true, order = 6300 )
	@CException( value = "R299")
	public String embName;
	
	/**
	 * 家庭国家代码
	 */
	@CChar( value = 3, order = 6400 )
	@CException( value = "R300")
	public String homeCountryCd;
	
	/**
	 * 家庭省份
	 */
	@CChar( value = 40, autoTrim = true, order = 6500 )
	@CException( value = "R301")
	public String homeState;
	
	/**
	 * 家庭城市
	 */
	@CChar( value = 40, autoTrim = true, order = 6600)
	@CException( value = "R302")
	public String homeCity;
	
	/**
	 * 家庭行政区
	 */
	@CChar( value = 40, autoTrim = true, order = 6700 )
	@CException( value = "R303")
	public String homeDistrict;
	
	/**
	 * 公司国家代码
	 */
	@CChar( value = 3, order = 6800 )
	@CException( value = "R304")
	public String companyCountryCd;
	
	/**
	 * 公司省份
	 */
	@CChar( value = 40, autoTrim = true, order = 6900 )
	@CException( value = "R305")
	public String companyState;
	
	/**
	 * 公司城市
	 */
	@CChar( value = 40, autoTrim = true, order = 7000 )
	@CException( value = "R306")
	public String companyCity;
	
	/**
	 * 公司行政区
	 */
	@CChar( value = 40, autoTrim = true, order = 7100 )
	@CException( value = "R307")
	public String companyDistrict;
	
	/**
	 * 联系人生日
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 7200 )
	@CException(value="R108")
	public Date contactBirthday;
	
	/**
	 * 联系人公司职务
	 */
	@CChar( value = 1, order = 7300 )
	@CException( value = "R040")
	public String contactCorpPost;
	
	/**
	 * 联系人公司传真
	 */
	@CChar( value = 20, autoTrim = true, order = 7400 )
	@CException( value = "R308")
	public String contactCorpFax;
	
	/**
	 * 联系人公司名称
	 */
	@CChar( value = 80, autoTrim = true, order = 7500 )
	@CException( value = "R309")
	public String contactCorpName;
	
	/**
	 * 联系人性别
	 */
	@CChar( value = 1, order = 7600 )
	@CException( value = "R041")
	public String contactGender;
	
	/**
	 * 联系人手机
	 */
	@CChar( value = 20, autoTrim = true, order = 7700 )
	@CException( value = "R310")
	public String contactMobileNo;
	
	/**
	 * 约定还款扣款账户姓名
	 */
	@CChar( value = 80, autoTrim = true, order = 7800 )
	@CException( value = "R311")
	public String ddBankAcctName;
	
	/**
	 * 约定还款银行名称
	 */
	@CChar( value = 40, autoTrim = true, order = 7900 )
	@CException( value = "R312")
	public String ddBankName;
	
	/**
	 * 发卡网点
	 */
	@CChar( value = 9, order = 8000 )
	@CException( value = "R313")
	public String owningBranch;
	
	/**
	 * 与主卡持卡人关系
	 */
	@CChar( value = 1, autoTrim = true, order = 8100 )
	@CException( value = "R042")
	public String relationshipToBsc;
	
	/**
	 * 促销码
	 */
	@CChar( value = 15, autoTrim = true, order = 8200 )
	@CException( value = "R314")
	public String appPromotionCd;
	
	/**
	 * 申请来源
	 */
	@CChar( value = 20, autoTrim = true, order = 8300 )
	@CException( value = "R315")
	public String appSource;
	
	/**
	 * 申请书条码
	 */
	@CChar( value = 40, autoTrim = true, order = 8400 )
	@CException( value = "R316")
	public String barcode;
	
	/**
	 * 推荐人介质卡号
	 */
	@CChar( value = 19, autoTrim = true, order = 8500 )
	@CException( value = "R317")
	public String recomCardNo;
	
	/**
	 * 推荐人姓名
	 */
	@CChar( value = 80, autoTrim = true, order = 8600 )
	@CException( value = "R318")
	public String recomName;
	
	/**
	 * 客户经理
	 */
	@CChar( value = 80, autoTrim = true, order = 8700 )
	@CException( value = "R319")
	public String representName;
	
	/**
	 * 是否接受推广邮件
	 */
	@CChar( value = 1, required = true, order = 8800 )
	@CException( value = "R043")
	public String salesInd;
	}
