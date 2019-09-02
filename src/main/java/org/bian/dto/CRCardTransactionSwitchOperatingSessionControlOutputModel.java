package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionControlOutputModel
 */
public class CRCardTransactionSwitchOperatingSessionControlOutputModel   {
  private String cardTransactionSwitchOperatingSessionControlActionTaskReference = null;

  private Object cardTransactionSwitchOperatingSessionControlActionTaskRecord = null;

  private String cardTransactionSwitchOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction Switch Operating Session instance control processing service call 
   * @return cardTransactionSwitchOperatingSessionControlActionTaskReference
  **/

  public String getCardTransactionSwitchOperatingSessionControlActionTaskReference() {
    return cardTransactionSwitchOperatingSessionControlActionTaskReference;
  }

  public void setCardTransactionSwitchOperatingSessionControlActionTaskReference(String cardTransactionSwitchOperatingSessionControlActionTaskReference) {
    this.cardTransactionSwitchOperatingSessionControlActionTaskReference = cardTransactionSwitchOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cardTransactionSwitchOperatingSessionControlActionTaskRecord
  **/

  public Object getCardTransactionSwitchOperatingSessionControlActionTaskRecord() {
    return cardTransactionSwitchOperatingSessionControlActionTaskRecord;
  }

  public void setCardTransactionSwitchOperatingSessionControlActionTaskRecord(Object cardTransactionSwitchOperatingSessionControlActionTaskRecord) {
    this.cardTransactionSwitchOperatingSessionControlActionTaskRecord = cardTransactionSwitchOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cardTransactionSwitchOperatingSessionControlActionResponse
  **/

  public String getCardTransactionSwitchOperatingSessionControlActionResponse() {
    return cardTransactionSwitchOperatingSessionControlActionResponse;
  }

  public void setCardTransactionSwitchOperatingSessionControlActionResponse(String cardTransactionSwitchOperatingSessionControlActionResponse) {
    this.cardTransactionSwitchOperatingSessionControlActionResponse = cardTransactionSwitchOperatingSessionControlActionResponse;
  }


}

