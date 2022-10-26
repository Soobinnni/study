package corona;

public class Corona19Data {
	private int seq; //게시글 번호
	private String createDt; //등록일시분초
	private int deathCnt; // 사망자 수
	private int defCnt; //확징자 수
	private String gubun; //시도명(한글)
	private String gubunEn;//시도명(영어)
	private String gubunCn;//시도명(중국)
	private int incDec;//전일대비 증감수
	private int isolClearCent;//격리 해제 수
	private int localOccCnt;//지역발생 수
	private int overFlowCnt;//해외 유입 수
	private String qurRate;//10만 명 당 발생률
	private String stdDay;//기준 일시
	private String updateDt;//수정일시분초
	
	//생성자
	public Corona19Data() {
		super();
	}
	public Corona19Data(int seq, String createDt, int deathCnt, int defCnt, String gubun, String gubunEn,
			String gubunCn, int incDec, int isolClearCent, int localOccCnt, int overFlowCnt, String qurRate,
			String stdDay, String updateDt) {
		super();
		this.seq = seq;
		this.createDt = createDt;
		this.deathCnt = deathCnt;
		this.defCnt = defCnt;
		this.gubun = gubun;
		this.gubunEn = gubunEn;
		this.gubunCn = gubunCn;
		this.incDec = incDec;
		this.isolClearCent = isolClearCent;
		this.localOccCnt = localOccCnt;
		this.overFlowCnt = overFlowCnt;
		this.qurRate = qurRate;
		this.stdDay = stdDay;
		this.updateDt = updateDt;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCreateDt() {
		return createDt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public int getDeathCnt() {
		return deathCnt;
	}
	public void setDeathCnt(int deathCnt) {
		this.deathCnt = deathCnt;
	}
	public int getDefCnt() {
		return defCnt;
	}
	public void setDefCnt(int defCnt) {
		this.defCnt = defCnt;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getGubunEn() {
		return gubunEn;
	}
	public void setGubunEn(String gubunEn) {
		this.gubunEn = gubunEn;
	}
	public String getGubunCn() {
		return gubunCn;
	}
	public void setGubunCn(String gubunCn) {
		this.gubunCn = gubunCn;
	}
	public int getIncDec() {
		return incDec;
	}
	public void setIncDec(int incDec) {
		this.incDec = incDec;
	}
	public int getIsolClearCent() {
		return isolClearCent;
	}
	public void setIsolClearCent(int isolClearCent) {
		this.isolClearCent = isolClearCent;
	}
	public int getLocalOccCnt() {
		return localOccCnt;
	}
	public void setLocalOccCnt(int localOccCnt) {
		this.localOccCnt = localOccCnt;
	}
	public int getOverFlowCnt() {
		return overFlowCnt;
	}
	public void setOverFlowCnt(int overFlowCnt) {
		this.overFlowCnt = overFlowCnt;
	}
	public String getQurRate() {
		return qurRate;
	}
	public void setQurRate(String qurRate) {
		this.qurRate = qurRate;
	}
	public String getStdDay() {
		return stdDay;
	}
	public void setStdDay(String stdDay) {
		this.stdDay = stdDay;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	@Override
	public String toString() {
		return "Corona19Data [게시글 번호 : " + getSeq() + ", 등록일시분초 : " + getCreateDt() + ", 사망자 수 : "
				+ getDeathCnt() + ", 확진자 수 : " + getDefCnt() + ", 시도명(한글) : " + getGubun() + ", 시도명(영어) : "
				+ getGubunEn() + ", 시도명(중국어) : " + getGubunCn() + ", 전일대비 증감 수 : " + getIncDec()
				+ ", 격리 해제 수 : " + getIsolClearCent() + ", 지역발생 수 : " + getLocalOccCnt()
				+ ", 해외 유입 수 : " + getOverFlowCnt() + ", 10만 명 당 발생률 : " + getQurRate() + ", 기준 일시 : "
				+ getStdDay() + ", 수정 일시분초 : " + getUpdateDt() + "]";
	}
	
	
}
