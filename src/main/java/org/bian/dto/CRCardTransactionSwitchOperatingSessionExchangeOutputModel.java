package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionExchangeOutputModel
 */
public class CRCardTransactionSwitchOperatingSessionExchangeOutputModel   {
  private String cardTransactionSwitchOperatingSessionExchangeActionTaskReference = null;

  private Object cardTransactionSwitchOperatingSessionExchangeActionTaskRecord = null;

  private String cardTransactionSwitchOperatingSessionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction Switch Operating Session instance exchange service call 
   * @return cardTransactionSwitchOperatingSessionExchangeActionTaskReference
  **/

  public String getCardTransactionSwitchOperatingSessionExchangeActionTaskReference() {
    return cardTransactionSwitchOperatingSessionExchangeActionTaskReference;
  }

  public void setCardTransactionSwitchOperatingSessionExchangeActionTaskReference(String cardTransactionSwitchOperatingSessionExchangeActionTaskReference) {
    this.cardTransactionSwitchOperatingSessionExchangeActionTaskReference = cardTransactionSwitchOperatingSessionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return cardTransactionSwitchOperatingSessionExchangeActionResponse
  **/

  public String getCardTransactionSwitchOperatingSessionExchangeActionResponse() {
    return cardTransactionSwitchOperatingSessionExchangeActionResponse;
  }

  public void setCardTransactionSwitchOperatingSessionExchangeActionResponse(String cardTransactionSwitchOperatingSessionExchangeActionResponse) {
    this.cardTransactionSwitchOperatingSessionExchangeActionResponse = cardTransactionSwitchOperatingSessionExchangeActionResponse;
  }


}

