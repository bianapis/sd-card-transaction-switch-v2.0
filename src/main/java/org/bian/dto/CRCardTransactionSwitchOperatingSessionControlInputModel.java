package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionControlInputModelCardTransactionSwitchOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionControlInputModel
 */
public class CRCardTransactionSwitchOperatingSessionControlInputModel   {
  private String cardTransactionSwitchServicingSessionReference = null;

  private String cardTransactionSwitchOperatingSessionInstanceReference = null;

  private Object cardTransactionSwitchOperatingSessionControlActionTaskRecord = null;

  private CRCardTransactionSwitchOperatingSessionControlInputModelCardTransactionSwitchOperatingSessionControlActionRequest cardTransactionSwitchOperatingSessionControlActionRequest = null;


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
   * Get cardTransactionSwitchOperatingSessionControlActionRequest
   * @return cardTransactionSwitchOperatingSessionControlActionRequest
  **/

  public CRCardTransactionSwitchOperatingSessionControlInputModelCardTransactionSwitchOperatingSessionControlActionRequest getCardTransactionSwitchOperatingSessionControlActionRequest() {
    return cardTransactionSwitchOperatingSessionControlActionRequest;
  }

  public void setCardTransactionSwitchOperatingSessionControlActionRequest(CRCardTransactionSwitchOperatingSessionControlInputModelCardTransactionSwitchOperatingSessionControlActionRequest cardTransactionSwitchOperatingSessionControlActionRequest) {
    this.cardTransactionSwitchOperatingSessionControlActionRequest = cardTransactionSwitchOperatingSessionControlActionRequest;
  }


}

