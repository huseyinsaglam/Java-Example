package com._01_stream;

public class EmployeeConvert {
    private String convertName;
    private int convertAge;
    private String convertExtra;

    public EmployeeConvert() {
    }

    public String getConvertName() {
        return convertName;
    }

    public void setConvertName(String convertName) {
        this.convertName = convertName;
    }

    public int getConvertAge() {
        return convertAge;
    }

    public void setConvertAge(int convertAge) {
        this.convertAge = convertAge;
    }

    public String getConvertExtra() {
        return convertExtra;
    }

    public void setConvertExtra(String convertExtra) {
        this.convertExtra = convertExtra;
    }

    @Override
    public String toString() {
        return "EmployeeConvert{" +
                "convertName='" + convertName + '\'' +
                ", convertAge=" + convertAge +
                ", convertExtra='" + convertExtra + '\'' +
                '}';
    }

    public EmployeeConvert(String convertName, int convertAge, String convertExtra) {
        this.convertName = convertName;
        this.convertAge = convertAge;
        this.convertExtra = convertExtra;
    }
}
