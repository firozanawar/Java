package singletondemo;

public enum EnumSingleton {

    INSTANCE;

    private String s;
    public void setString(String str){
        s = str;
    }

    public String getS() {
        return s;
    }
}
