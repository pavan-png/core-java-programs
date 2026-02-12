class Account01 {

    private Integer accNo;
    private String accHolderName;
    private String accType;

    Account01(Integer accNo, String accHolderName, String accType) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getAccType() {
        return accType;
    }
}
