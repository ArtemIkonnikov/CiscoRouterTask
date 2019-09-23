package ru.ikonnikov;

public class Interface {

    //Since the task only needs to be read and written to the file,
    // I made all the fields as strings.
    private String index;
    private String description;
    private String type;
    private String mtu;
    private String speed;
    private String physAddress;
    private String adminStatus;
    private String operStatus;
    private String lastChange;
    private String inOctets;
    private String inUcastPkts;
    private String inDiscards;
    private String inErrors;
    private String inUnknownProtos;
    private String outOctets;
    private String outUcastPkts;
    private String outDiscards;
    private String outErrors;

    public Interface() {
    }

    public Interface(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMtu() {
        return mtu;
    }

    public void setMtu(String mtu) {
        this.mtu = mtu;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getPhysAddress() {
        return physAddress;
    }

    public void setPhysAddress(String physAddress) {
        this.physAddress = physAddress;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public String getLastChange() {
        return lastChange;
    }

    public void setLastChange(String lastChange) {
        this.lastChange = lastChange;
    }

    public String getInOctets() {
        return inOctets;
    }

    public void setInOctets(String inOctets) {
        this.inOctets = inOctets;
    }

    public String getInUcastPkts() {
        return inUcastPkts;
    }

    public void setInUcastPkts(String inUcastPkts) {
        this.inUcastPkts = inUcastPkts;
    }

    public String getInDiscards() {
        return inDiscards;
    }

    public void setInDiscards(String inDiscards) {
        this.inDiscards = inDiscards;
    }

    public String getInErrors() {
        return inErrors;
    }

    public void setInErrors(String inErrors) {
        this.inErrors = inErrors;
    }

    public String getInUnknownProtos() {
        return inUnknownProtos;
    }

    public void setInUnknownProtos(String inUnknownProtos) {
        this.inUnknownProtos = inUnknownProtos;
    }

    public String getOutOctets() {
        return outOctets;
    }

    public void setOutOctets(String outOctets) {
        this.outOctets = outOctets;
    }

    public String getOutUcastPkts() {
        return outUcastPkts;
    }

    public void setOutUcastPkts(String outUcastPkts) {
        this.outUcastPkts = outUcastPkts;
    }

    public String getOutDiscards() {
        return outDiscards;
    }

    public void setOutDiscards(String outDiscards) {
        this.outDiscards = outDiscards;
    }

    public String getOutErrors() {
        return outErrors;
    }

    public void setOutErrors(String outErrors) {
        this.outErrors = outErrors;
    }

    @Override
    public String toString() {
        return "Interface " + index + ": " +
                " Description='" + description + '\'' +
                ", Type='" + type + '\'' +
                ", MTU='" + mtu + '\'' +
                ", Speed='" + speed + '\'' +
                ", PhysAddress='" + physAddress + '\'' +
                ", AdminStatus='" + adminStatus + '\'' +
                ", OperStatus='" + operStatus + '\'' +
                ", LastChange='" + lastChange + '\'' +
                ", InOctets='" + inOctets + '\'' +
                ", InUcastPkts='" + inUcastPkts + '\'' +
                ", InDiscards='" + inDiscards + '\'' +
                ", InErrors='" + inErrors + '\'' +
                ", InUnknownProtos='" + inUnknownProtos + '\'' +
                ", OutOctets='" + outOctets + '\'' +
                ", OutUcastPkts='" + outUcastPkts + '\'' +
                ", OutDiscards='" + outDiscards + '\'' +
                ", OutErrors='" + outErrors + '\'' +
                '.';
    }
}
