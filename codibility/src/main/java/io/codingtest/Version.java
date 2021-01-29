package io.codingtest;

public class Version implements Comparable<Version> {

    private String versionNo = "";

    public Version(){
        throw new IllegalArgumentException("You should create with version no.");
    }

    public Version(String versionNo){
        this.versionNo = versionNo;
    }

    public String getVersionNo(){
        return versionNo;
    }

    @Override
    public int compareTo(Version o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
