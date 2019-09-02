package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionUpdateInputModel
 */
public class CRCardTransactionSwitchOperatingSessionUpdateInputModel   {
  private String cardTransactionSwitchServicingSessionReference = null;

  private String cardTransactionSwitchOperatingSessionInstanceReference = null;

  private CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private Object cardTransactionSwitchOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardTransactionSwitchOperatingSessionUpdateActionTaskRecord
  **/

  public Object getCardTransactionSwitchOperatingSessionUpdateActionTaskRecord() {
    return cardTransactionSwitchOperatingSessionUpdateActionTaskRecord;
  }

  public void setCardTransactionSwitchOperatingSessionUpdateActionTaskRecord(Object cardTransactionSwitchOperatingSessionUpdateActionTaskRecord) {
    this.cardTransactionSwitchOperatingSessionUpdateActionTaskRecord = cardTransactionSwitchOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

