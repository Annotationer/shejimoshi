package com.sunp.learn.annotation;

import java.lang.annotation.ElementType;
import java.math.BigDecimal;
import java.util.Date;


/**
 * �����ͺ��������ļ��ӿ�
 * 
 * @author yuyang
 *
 */
public class ApplyFileItem {
	
	/**
	 * ������
	 */
	@CChar( value = 12, order = 100 )
	@CException( value = "R270")
	public String org;

	/**
	 * ������ָʾ
	 */
	@CChar( value = 1, order = 200 )
	@CException( value = "R019")
	public String bscSuppInd;
	
	/**
	 * ��Ʒ����
	 */
	@CChar( value = 6, order = 300 )
	@CException( value = "R271")
	public String productCd;

	/**
	 * ���ʿ���
	 */
	@CChar( value = 19, order = 400 )
	@CException( value = "R272")
	public String cardNo;

	/**
	 * ��Ӧ�������ʿ���
	 */
	@CChar( value = 19, order = 500 )
	@CException( value = "R273")
	public String primCardNo;

	/**
	 * ��Ӧ�����߼�����
	 */
	@CChar( value = 19, order = 600 )
	@CException( value = "R274")
	public String bscLogicalCardNo;

	/**
	 * ������Ϣ����
	 */
	@CChar( value = 1, order = 700 )
	@CException( value = "R020")
	public String appType;

	/**
	 * ��������
	 */
	@CChar( value = 20, autoTrim = true, order = 800 )
	@CException( value = "R275")
	public String appNo;

	/**
	 * ��Ӧ���������¼���
	 */
	@CChar( value = 20, autoTrim = true, order = 900 )
	@CException( value = "R276")
	public String primAppId;

	/**
	 * ����ƾ��ѡ��
	 */
	@CChar( value = 1, required = true, order = 1000 )
	@CException( value = "R021")
	public String posPinVerifyInd;

	/**
	 * ���տ���־
	 */
	@CChar( value = 1, order = 1100 )
	@CException( value = "R022")
	public String photoUseFlag;

	/**
	 * ����Ա�����
	 */
	@CChar( value = 20, autoTrim = true, order = 1200 )
	@CException( value = "R277")
	public String bankmemberNo;

	/**
	 * ���������ģ�
	 */
	@CChar( value = 80, autoTrim = true, order = 1300 )
	@CException( value = "R278")
	public String name;

	/**
	 * �Ա�
	 */
	@CChar( value = 1, order = 1400 )
	@CException( value = "R023")
	public String gender;

	/**
	 * ��������
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 1500 )
	@CException(value = "R087")
	public Date birthday;

	/**
	 * ����״��
	 */
	@CChar( value = 1, order = 1600 )
	@CException( value = "R024")
	public String maritalStatus;

	/**
	 * ����
	 */
	@CChar( value = 3, order = 1700 )
	@CException( value = "R279")
	public String nationality;

	/**
	 * ��ͥ�˿�
	 */
	@CChar( value = 2, zeroPadding = true, order = 1800 )
	@CException(value = "R088")
	public Integer nbrOfDependents;

	/**
	 * ֤������
	 */
	@CChar( value = 1, order = 1900 )
	@CException( value = "R025")
	public String idType;

	/**
	 * ֤������
	 */
	@CChar( value = 30, autoTrim = true, order = 2000 )
	@CException( value = "R280")
	public String idNo;

	/**
	 * �����̶�
	 */
	@CChar( value = 1, order = 2100 )
	@CException( value = "R026")
	public String qualification;

	/**
	 * ��סַ
	 */
	@CChar( value = 200, autoTrim = true, order = 2200 )
	@CException( value = "R281")
	public String homeAddress;

	/**
	 * ��סַ�ʱ�
	 */
	@CChar( value = 10, autoTrim = true, order = 2300 )
	@CException( value = "R282")
	public String homeZip;

	/**
	 * ��סַ��ס��ʼ����
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 2400 )
	@CException(value = "R089")
	public Date homeStandFrom;

	/**
	 * ��סַ�绰����
	 */
	@CChar( value = 15, autoTrim = true, order = 2500 )
	@CException( value = "R283")
	public String homePhone;

	/**
	 * �ƶ��绰����
	 */
	@CChar( value = 20, autoTrim = true, order = 2600 )
	@CException( value = "R284")
	public String mobileNo;

	/**
	 * ��������
	 */
	@CChar( value = 80, autoTrim = true, order = 2700 )
	@CException( value = "R285")
	public String email;

	/**
	 * סլ״��
	 */
	@CChar( value = 1, order = 2800 )
	@CException( value = "R027")
	public String houseOwnership;

	/**
	 * �Ƿ��а��Ҵ���
	 */
	@CChar( value = 1, order = 2900 )
	@CException( value = "R028")
	public boolean houseLoanFlag;

	/**
	 * ��λȫ��
	 */
	@CChar( value = 80, autoTrim = true, order = 3000 )
	@CException( value = "R286")
	public String companyName;

	/**
	 * ��λ��ַ
	 */
	@CChar( value = 200, autoTrim = true, order = 3100 )
	@CException( value = "R287")
	public String companyAddress;

	/**
	 * ��λ�ʱ�
	 */
	@CChar( value = 10, autoTrim = true, order = 3200 )
	@CException( value = "R288")
	public String companyZip;

	/**
	 * ��λ�绰����
	 */
	@CChar( value = 20, autoTrim = true, order = 3300 )
	@CException( value = "R289")
	public String companyPhone;

	/**
	 * ��λ����
	 */
	@CChar( value = 1, order = 3400 )
	@CException( value = "R029")
	public String companyCategory;

	/**
	 * ��ҵ���
	 */
	@CChar( value = 2, order = 3500 )
	@CException( value = "R030")
	public String industryCategory;

	/**
	 * ְҵ
	 */
	@CChar( value = 1, order = 3600 )
	@CException( value = "R031")
	public String occupation;

	/**
	 * ְ��
	 */
	@CChar( value = 1, order = 3700 )
	@CException( value = "R032")
	public String titleOfTechnical;

	/**
	 * ְ��
	 */
	@CChar( value = 1, order = 3800 )
	@CException( value = "R033")
	public String title;

	/**
	 * ����������
	 */
	@CChar( value = 12, precision = 2, zeroPadding = true, order = 3900 )
	@CException(value = "R090")
	public BigDecimal revenuePerYear;

	/**
	 * ��ͥ�˾�������
	 */
	@CChar( value = 12, precision = 2, zeroPadding = true, order = 4000 )
	@CException(value = "R091")
	public BigDecimal familyAverageRevenue;

	/**
	 * �Զ����ʽ
	 */
	@CChar( value = 1, order = 4100 )
	@CException( value = "R034")
	public String ddInd;

	/**
	 * Լ��������к�
	 */
	@CChar( value = 9, autoTrim = true, order = 4200 )
	@CException( value = "R290")
	public String ddBankBranch;

	/**
	 * Լ������ۿ��˺�
	 */
	@CChar( value = 40, autoTrim = true, order = 4300 )
	@CException( value = "R291")
	public String ddBankAcctNo;

	/**
	 * ��Ƭ���ͷ�ʽ
	 */
	@CChar( value = 1, order = 4400 )
	@CException( value = "R035")
	public String cardFetchMethod;

	/**
	 * Ԥ������
	 */
	@CChar( value = 40, autoTrim = true, order = 4500 )
	@CException( value = "R292")
	public String obligateQuestion;

	/**
	 * Ԥ����
	 */
	@CChar( value = 40, autoTrim = true, order = 4600 )
	@CException( value = "R293")
	public String obligateAnswer;

	/**
	 * ��ϵ�����������ģ�
	 */
	@CChar( value = 80, autoTrim = true, order = 4700 )
	@CException( value = "R294")
	public String contactName;

	/**
	 * ��ϵ���������˹�ϵ
	 */
	@CChar( value = 1, order = 4800 )
	@CException( value = "R036")
	public String contactRelationship;

	/**
	 * ��ϵ�����֤������
	 */
	@CChar( value = 1, order = 4900 )
	@CException( value = "R037")
	public String contactIdType;

	/**
	 * ��ϵ��֤������
	 */
	@CChar( value = 30, autoTrim = true, order = 5000 )
	@CException( value = "R295")
	public String contactIdNo;

	/**
	 * ��ϵ�˹�˾�绰����
	 */
	@CChar( value = 15, autoTrim = true, order = 5100 )
	@CException( value = "R296")
	public String contactCorpPhone;

	/**
	 * ���ö��
	 */
	@CChar( value = 13, zeroPadding = true, order = 5200 )
	@CException(value = "R092")
	public BigDecimal creditLimit;
	
	/**
	 * ���񿨶��
	 */
	@CChar( value = 13, zeroPadding = true, order = 5210 )
	@CException(value = "R093")
	public BigDecimal civilServiceLimit;
	
	/**
	 * С�������
	 */
	@CChar( value = 13, zeroPadding = true, order = 5220 )
	@CException(value = "R094")
	public BigDecimal microCreditLimit;
	
	/**
	 * ���񿨶��
	 */
	@CChar( value = 13, zeroPadding = true, order = 5225 )
	@CException(value = "R095")
	public BigDecimal businessLimit;
	
	/**
	 * ר���ȳ���
	 */
	@CChar( value = 13, zeroPadding = true, order = 5230 )
	@CException(value = "R096")
	public BigDecimal carLoan;
	
	/**
	 * ר���ȷ���
	 */
	@CChar( value = 13, zeroPadding = true, order = 5240 )
	@CException(value = "R097")
	public BigDecimal houseLoan;
	
	/**
	 * ר����װ�޴�
	 */
	@CChar( value = 13, zeroPadding = true, order = 5250 )
	@CException(value = "R098")
	public BigDecimal renovationLoan;
	
	/**
	 * ר�������δ�
	 */
	@CChar( value = 13, zeroPadding = true, order = 5260 )
	@CException(value = "R099")
	public BigDecimal travelLoan;
	
	/**
	 * ר���Ȼ����
	 */
	@CChar( value = 13, zeroPadding = true, order = 5270 )
	@CException(value = "R100")
	public BigDecimal weddingLoan;
	
	/**
	 * ר����������
	 */
	@CChar( value = 13, zeroPadding = true, order = 5280 )
	@CException(value = "R101")
	public BigDecimal durableLoan;
	
	/**
	 * �����޶�
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5300 )
	@CException(value="R102")
	public BigDecimal cardCycleLimit;

	/**
	 * ����ȡ���޶�
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5400 )
	@CException(value = "R103")
	public BigDecimal cardCycleCashLimit;

	/**
	 * �������ڽ����޶�
	 */
	@CChar( value = 13, zeroPadding = true, order = 5500 )
	@CException(value = "R104")
	public BigDecimal cardCycleNetLimit;

	/**
	 * ���ʽ����޶�
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5600 )
	@CException(value = "R105")
	public BigDecimal cardTxnLimit;

	/**
	 * ����ȡ�ֽ����޶�
	 */
	@CChar( value = 13, zeroPadding = true, order = 5700 )
	@CException(value = "R106")
	public BigDecimal cardTxnCashLimit;

	/**
	 * �������ʽ����޶�
	 */
	@CChar( value = 13, zeroPadding = true,  order = 5800 )
	@CException(value = "R107")
	public BigDecimal cardTxnNetLimit;

	/**
	 * �˵��������ͱ�־
	 */
	@CChar( value = 1, order = 5900 )
	@CException( value = "R038")
	public String stmtMediaType;

	/**
	 * �˵����ͱ�־
	 */
	@CChar( value = 1, order = 6000 )
	@CException( value = "R039")
	public String stmtMailAddrInd;
	
	/**
	 * �������
	 */
	@CChar( value = 10, autoTrim = true, order = 6100 )
	@CException( value = "R297")
	public String designCd;
	/**
	 * ��������Ա���
	 */
	@CChar( value = 80, autoTrim = true, order = 6200 )
	@CException( value = "R298")
	public String cobrandNo;
	/**
	 * ͹ӡ��-����ƴ��
	 */
	@CChar( value = 26, autoTrim = true, order = 6300 )
	@CException( value = "R299")
	public String embName;
	
	/**
	 * ��ͥ���Ҵ���
	 */
	@CChar( value = 3, order = 6400 )
	@CException( value = "R300")
	public String homeCountryCd;
	
	/**
	 * ��ͥʡ��
	 */
	@CChar( value = 40, autoTrim = true, order = 6500 )
	@CException( value = "R301")
	public String homeState;
	
	/**
	 * ��ͥ����
	 */
	@CChar( value = 40, autoTrim = true, order = 6600)
	@CException( value = "R302")
	public String homeCity;
	
	/**
	 * ��ͥ������
	 */
	@CChar( value = 40, autoTrim = true, order = 6700 )
	@CException( value = "R303")
	public String homeDistrict;
	
	/**
	 * ��˾���Ҵ���
	 */
	@CChar( value = 3, order = 6800 )
	@CException( value = "R304")
	public String companyCountryCd;
	
	/**
	 * ��˾ʡ��
	 */
	@CChar( value = 40, autoTrim = true, order = 6900 )
	@CException( value = "R305")
	public String companyState;
	
	/**
	 * ��˾����
	 */
	@CChar( value = 40, autoTrim = true, order = 7000 )
	@CException( value = "R306")
	public String companyCity;
	
	/**
	 * ��˾������
	 */
	@CChar( value = 40, autoTrim = true, order = 7100 )
	@CException( value = "R307")
	public String companyDistrict;
	
	/**
	 * ��ϵ������
	 */
	@CChar( value = 8, datePattern = "yyyyMMdd", order = 7200 )
	@CException(value="R108")
	public Date contactBirthday;
	
	/**
	 * ��ϵ�˹�˾ְ��
	 */
	@CChar( value = 1, order = 7300 )
	@CException( value = "R040")
	public String contactCorpPost;
	
	/**
	 * ��ϵ�˹�˾����
	 */
	@CChar( value = 20, autoTrim = true, order = 7400 )
	@CException( value = "R308")
	public String contactCorpFax;
	
	/**
	 * ��ϵ�˹�˾����
	 */
	@CChar( value = 80, autoTrim = true, order = 7500 )
	@CException( value = "R309")
	public String contactCorpName;
	
	/**
	 * ��ϵ���Ա�
	 */
	@CChar( value = 1, order = 7600 )
	@CException( value = "R041")
	public String contactGender;
	
	/**
	 * ��ϵ���ֻ�
	 */
	@CChar( value = 20, autoTrim = true, order = 7700 )
	@CException( value = "R310")
	public String contactMobileNo;
	
	/**
	 * Լ������ۿ��˻�����
	 */
	@CChar( value = 80, autoTrim = true, order = 7800 )
	@CException( value = "R311")
	public String ddBankAcctName;
	
	/**
	 * Լ��������������
	 */
	@CChar( value = 40, autoTrim = true, order = 7900 )
	@CException( value = "R312")
	public String ddBankName;
	
	/**
	 * ��������
	 */
	@CChar( value = 9, order = 8000 )
	@CException( value = "R313")
	public String owningBranch;
	
	/**
	 * �������ֿ��˹�ϵ
	 */
	@CChar( value = 1, autoTrim = true, order = 8100 )
	@CException( value = "R042")
	public String relationshipToBsc;
	
	/**
	 * ������
	 */
	@CChar( value = 15, autoTrim = true, order = 8200 )
	@CException( value = "R314")
	public String appPromotionCd;
	
	/**
	 * ������Դ
	 */
	@CChar( value = 20, autoTrim = true, order = 8300 )
	@CException( value = "R315")
	public String appSource;
	
	/**
	 * ����������
	 */
	@CChar( value = 40, autoTrim = true, order = 8400 )
	@CException( value = "R316")
	public String barcode;
	
	/**
	 * �Ƽ��˽��ʿ���
	 */
	@CChar( value = 19, autoTrim = true, order = 8500 )
	@CException( value = "R317")
	public String recomCardNo;
	
	/**
	 * �Ƽ�������
	 */
	@CChar( value = 80, autoTrim = true, order = 8600 )
	@CException( value = "R318")
	public String recomName;
	
	/**
	 * �ͻ�����
	 */
	@CChar( value = 80, autoTrim = true, order = 8700 )
	@CException( value = "R319")
	public String representName;
	
	/**
	 * �Ƿ�����ƹ��ʼ�
	 */
	@CChar( value = 1, required = true, order = 8800 )
	@CException( value = "R043")
	public String salesInd;
	}
