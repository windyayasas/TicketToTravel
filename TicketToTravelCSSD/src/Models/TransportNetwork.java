package Models;

public class TransportNetwork {
    
    private int transportNetworkId;
    private String networkType;
    private int noOfSubnetworks;
    private int routeNo;
    private static int transportNetworkCount=0;

    public TransportNetwork() {
        
        this.transportNetworkId=0;
        this.networkType=null;
        this.routeNo=0;
        this.noOfSubnetworks=0;
    }
    

    public TransportNetwork(String networkType, int noOfSubnetworks, int routeNo) {
        
        this.transportNetworkId=++transportNetworkCount;
        this.networkType = networkType;
        this.noOfSubnetworks = noOfSubnetworks;
        this.routeNo = routeNo;
    }
    
    public int getTransportNetworkId() {
        return transportNetworkId;
    }

    public void setTransportNetworkId(int transportNetworkId) {
        this.transportNetworkId = transportNetworkId;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public int getNoOfSubnetworks() {
        return noOfSubnetworks;
    }

    public void setNoOfSubnetworks(int noOfSubnetworks) {
        this.noOfSubnetworks = noOfSubnetworks;
    }

    public int getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }
    
    
    
}
