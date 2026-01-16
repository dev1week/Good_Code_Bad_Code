
class Example{

    //차량 소유자에게 메일을 보내는 함수 
    SentComfirmation? sendOwnerALetter(Vehicle vehicle, Letter letter) {

        //차량 소유자의 주소를 찾기 위한 로직 
        Address? ownerAddress = null;

        if(vehicle.hasBeenScraped()){
            ownersAddress = SCRAPYARD_ADDRESS; 
        }else{
            Purchase? mostRecentPurchase = vehicle.getMostRecentPurchase();

            if(mostRecentPurchase == null){
                ownersAddress = SHOWTOOM_ADDRESS; 
            }else{
                ownersAddress = mostRecentPurchase.getBuyersAddress();
            }
        }

        //있을 경우에만 메일을 보낸다. 
        if(ownerAddress != null){
            return null;
        }

        return sendLetter(ownerAddress, letter);
    }
}