package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionExchangeInputModelCardTransactionSwitchOperatingSessionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionExchangeInputModel
 */
public class CRCardTransactionSwitchOperatingSessionExchangeInputModel   {
  private String cardTransactionSwitchServicingSessionReference = null;

  private String cardTransactionSwitchOperatingSessionInstanceReference = null;

  private Object cardTransactionSwitchOperatingSessionExchangeActionTaskRecord = null;

  private CRCardTransactionSwitchOperatingSessionExchangeInputModelCardTransactionSwitchOperatingSessionExchangeActionRequest cardTransactionSwitchOperatingSessionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardTransactionSwitchServicingSessionReference
  **/

  public String getCardTransactionSwitchServicingSessionReference() {
    return cardTransactionSwitchServicingSessionReference;
  }

  public void setCardTransactionSwitchServicingSessionReference(String cardTransactionSwitchServicingSessionReference) {
    this.cardTransactionSwitchServicingSessionReference = cardTransactionSwitchServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Transaction Switch Operating Session instance 
   * @return cardTransactionSwitchOperatingSessionInstanceReference
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReference() {
    return cardTransactionSwitchOperatingSessionInstanceReference;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReference(String cardTransactionSwitchOperatingSessionInstanceReference) {
    this.cardTransactionSwitchOperatingSessionInstanceReference = cardTransactionSwitchOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return cardTransactionSwitchOperatingSessionExchangeActionTaskRecord
  **/

  public Object getCardTransactionSwitchOperatingSessionExchangeActionTaskRecord() {
    return cardTransactionSwitchOperatingSessionExchangeActionTaskRecord;
  }

  public void setCardTransactionSwitchOperatingSessionExchangeActionTaskRecord(Object cardTransactionSwitchOperatingSessionExchangeActionTaskRecord) {
    this.cardTransactionSwitchOperatingSessionExchangeActionTaskRecord = cardTransactionSwitchOperatingSessionExchangeActionTaskRecord;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionExchangeActionRequest
   * @return cardTransactionSwitchOperatingSessionExchangeActionRequest
  **/

  public CRCardTransactionSwitchOperatingSessionExchangeInputModelCardTransactionSwitchOperatingSessionExchangeActionRequest getCardTransactionSwitchOperatingSessionExchangeActionRequest() {
    return cardTransactionSwitchOperatingSessionExchangeActionRequest;
  }

  public void setCardTransactionSwitchOperatingSessionExchangeActionRequest(CRCardTransactionSwitchOperatingSessionExchangeInputModelCardTransactionSwitchOperatingSessionExchangeActionRequest cardTransactionSwitchOperatingSessionExchangeActionRequest) {
    this.cardTransactionSwitchOperatingSessionExchangeActionRequest = cardTransactionSwitchOperatingSessionExchangeActionRequest;
  }


}

