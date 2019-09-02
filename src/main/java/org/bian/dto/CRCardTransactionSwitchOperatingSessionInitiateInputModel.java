package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionInitiateInputModel
 */
public class CRCardTransactionSwitchOperatingSessionInitiateInputModel   {
  private String cardTransactionSwitchServicingSessionReference = null;

  private Object cardTransactionSwitchOperatingSessionInitiateActionRecord = null;

  private String cardTransactionSwitchOperatingSessionInstanceStatus = null;

  private CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardTransactionSwitchOperatingSessionInitiateActionRecord
  **/

  public Object getCardTransactionSwitchOperatingSessionInitiateActionRecord() {
    return cardTransactionSwitchOperatingSessionInitiateActionRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInitiateActionRecord(Object cardTransactionSwitchOperatingSessionInitiateActionRecord) {
    this.cardTransactionSwitchOperatingSessionInitiateActionRecord = cardTransactionSwitchOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Transaction Switch Operating Session instance (e.g. initialised, pending, active) 
   * @return cardTransactionSwitchOperatingSessionInstanceStatus
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceStatus() {
    return cardTransactionSwitchOperatingSessionInstanceStatus;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceStatus(String cardTransactionSwitchOperatingSessionInstanceStatus) {
    this.cardTransactionSwitchOperatingSessionInstanceStatus = cardTransactionSwitchOperatingSessionInstanceStatus;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


}

