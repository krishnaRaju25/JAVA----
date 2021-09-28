package com.torryharris.model;

public class Branch extends College{
    private String branchName;
    private int branchId;

    public Branch(String name, int id, String place, String branchName, int branchId) {
        super(name, id, place);
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
    public void displayBranch(){
        System.out.println("Branch Name :"+branchName);
        System.out.println("BranchId :"+branchId);
    }
}
