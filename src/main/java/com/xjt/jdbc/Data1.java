package com.xjt.jdbc;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:36
 */
public class Data1 {

    private int size;
    private String fileName;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Data1{" +
                "size=" + size +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
