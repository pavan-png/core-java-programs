 class Account01 {
    private Integer acc_No ;
    private  String acc_Holder_Name;
    private String acc_Type;
    Account01(Integer acc_No , String acc_Holder_Name , String acc_Type){
        this.acc_No = acc_No;
        this.acc_Holder_Name = acc_Holder_Name;
        this.acc_Type = acc_Type;
    }
    public Integer getAcc_No(){
        return acc_No;
    }
    public  String getAcc_Holder_Name(){
        return acc_Holder_Name;
    }
    public String getAcc_Type(){
        return acc_Type;
    }

}
