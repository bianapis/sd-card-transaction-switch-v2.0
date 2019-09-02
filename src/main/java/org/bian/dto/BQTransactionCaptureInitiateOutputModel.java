package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;
import org.bian.dto.BQTransactionCaptureInitiateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureInitiateOutputModel
 */
public class BQTransactionCaptureInitiateOutputModel   {
  private BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private String transactionCaptureInstanceReference = null;

  private String transactionCaptureInitiateActionReference = null;

  private Object transactionCaptureInitiateActionRecord = null;

  private String transactionCaptureInstanceStatus = null;

  private BQTransactionCaptureInitiateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Capture instance 
   * @return transactionCaptureInstanceReference
  **/

  public String getTransactionCaptureInstanceReference() {
    return transactionCaptureInstanceReference;
  }

  public void setTransactionCaptureInstanceReference(String transactionCaptureInstanceReference) {
    this.transactionCaptureInstanceReference = transactionCaptureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionCaptureInitiateActionReference
  **/

  public String getTransactionCaptureInitiateActionReference() {
    return transactionCaptureInitiateActionReference;
  }

  public void setTransactionCaptureInitiateActionReference(String transactionCaptureInitiateActionReference) {
    this.transactionCaptureInitiateActionReference = transactionCaptureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionCaptureInitiateActionRecord
  **/

  public Object getTransactionCaptureInitiateActionRecord() {
    return transactionCaptureInitiateActionRecord;
  }

  public void setTransactionCaptureInitiateActionRecord(Object transactionCaptureInitiateActionRecord) {
    this.transactionCaptureInitiateActionRecord = transactionCaptureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Capture instance (e.g. initialised, pending, active) 
   * @return transactionCaptureInstanceStatus
  **/

  public String getTransactionCaptureInstanceStatus() {
    return transactionCaptureInstanceStatus;
  }

  public void setTransactionCaptureInstanceStatus(String transactionCaptureInstanceStatus) {
    this.transactionCaptureInstanceStatus = transactionCaptureInstanceStatus;
  }


  /**
   * Get transactionCaptureInstanceRecord
   * @return transactionCaptureInstanceRecord
  **/

  public BQTransactionCaptureInitiateInputModelTransactionCaptureInstanceRecord getTransactionCaptureInstanceRecord() {
    return transactionCaptureInstanceRecord;
  }

  public void setTransactionCaptureInstanceRecord(BQTransactionCaptureInitiateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord) {
    this.transactionCaptureInstanceRecord = transactionCaptureInstanceRecord;
  }


}

