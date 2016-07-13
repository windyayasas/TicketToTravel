package Models;

/**
 *
 * @author Chathuri Lakmini
 */
public class SmartCard {
    
    private int cardId;
    private String issuedDate;
    private String expiredDate;
    private static int cardCount=0;

    public SmartCard(String issuedDate, String expiredDate) {
        this.cardId=++cardCount;
        this.issuedDate = issuedDate;
        this.expiredDate = expiredDate;
    }

    public SmartCard() {
        this.cardId=0;
        this.issuedDate=null;
        this.expiredDate=null;
    }
    
    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    
    
}
