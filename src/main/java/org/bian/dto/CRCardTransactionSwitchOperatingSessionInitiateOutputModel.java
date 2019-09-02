package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionInitiateOutputModel
 */
public class CRCardTransactionSwitchOperatingSessionInitiateOutputModel   {
  private String cardTransactionSwitchOperatingSessionInstanceReference = null;

  private String cardTransactionSwitchOperatingSessionInitiateActionReference = null;

  private Object cardTransactionSwitchOperatingSessionInitiateActionRecord = null;

  private String cardTransactionSwitchOperatingSessionInstanceStatus = null;

  private CRCardTransactionSwitchOperatingSessionInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardTransactionSwitchOperatingSessionInitiateActionReference
  **/

  public String getCardTransactionSwitchOperatingSessionInitiateActionReference() {
    return cardTransactionSwitchOperatingSessionInitiateActionReference;
  }

  public void setCardTransactionSwitchOperatingSessionInitiateActionReference(String cardTransactionSwitchOperatingSessionInitiateActionReference) {
    this.cardTransactionSwitchOperatingSessionInitiateActionReference = cardTransactionSwitchOperatingSessionInitiateActionReference;
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

