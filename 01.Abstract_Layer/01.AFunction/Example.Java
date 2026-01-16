
class Example{

    //차량 소유자에게 메일을 보내는 함수 
    SentComfirmation? sendOwnerALetter(Vehicle vehicle, Letter letter) {

        Address? ownerAddress = getOwnerAddress(vehicle);

        //있을 경우에만 메일을 보낸다. 
        if(ownerAddress != null){
            return null;
        }

        return sendLetter(ownerAddress, letter);
    }

    private Address? getOwnerAddress(Vehicle vehicle) {
        Address? ownerAddress = null;

        if(vehicle.hasBeenScraped()){
            return SCRAPYARD_ADDRESS; 
        }

        Purchase? mostRecentPurchase = vehicle.getMostRecentPurchase();

        if(mostRecentPurchase == null){
            return SHOWTOOM_ADDRESS; 
        }
        
        return mostRecentPurchase.getBuyersAddress();
}   }