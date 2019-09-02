package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionRoutingInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;
import org.bian.dto.BQTransactionRoutingInitiateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingInitiateOutputModel
 */
public class BQTransactionRoutingInitiateOutputModel   {
  private BQTransactionRoutingInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private BQTransactionRoutingInitiateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private String transactionRoutingInstanceReference = null;

  private String transactionRoutingInitiateActionReference = null;

  private Object transactionRoutingInitiateActionRecord = null;

  private String transactionRoutingInstanceStatus = null;

  private Object transactionRoutingInstanceRecord = null;


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public BQTransactionRoutingInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(BQTransactionRoutingInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


  /**
   * Get transactionCaptureInstanceRecord
   * @return transactionCaptureInstanceRecord
  **/

  public BQTransactionRoutingInitiateInputModelTransactionCaptureInstanceRecord getTransactionCaptureInstanceRecord() {
    return transactionCaptureInstanceRecord;
  }

  public void setTransactionCaptureInstanceRecord(BQTransactionRoutingInitiateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord) {
    this.transactionCaptureInstanceRecord = transactionCaptureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Routing instance 
   * @return transactionRoutingInstanceReference
  **/

  public String getTransactionRoutingInstanceReference() {
    return transactionRoutingInstanceReference;
  }

  public void setTransactionRoutingInstanceReference(String transactionRoutingInstanceReference) {
    this.transactionRoutingInstanceReference = transactionRoutingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionRoutingInitiateActionReference
  **/

  public String getTransactionRoutingInitiateActionReference() {
    return transactionRoutingInitiateActionReference;
  }

  public void setTransactionRoutingInitiateActionReference(String transactionRoutingInitiateActionReference) {
    this.transactionRoutingInitiateActionReference = transactionRoutingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionRoutingInitiateActionRecord
  **/

  public Object getTransactionRoutingInitiateActionRecord() {
    return transactionRoutingInitiateActionRecord;
  }

  public void setTransactionRoutingInitiateActionRecord(Object transactionRoutingInitiateActionRecord) {
    this.transactionRoutingInitiateActionRecord = transactionRoutingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Routing instance (e.g. initialised, pending, active) 
   * @return transactionRoutingInstanceStatus
  **/

  public String getTransactionRoutingInstanceStatus() {
    return transactionRoutingInstanceStatus;
  }

  public void setTransactionRoutingInstanceStatus(String transactionRoutingInstanceStatus) {
    this.transactionRoutingInstanceStatus = transactionRoutingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The function that handles the onward routing and transmission of transactions, including tracking and retransmission for failed/timed-out transmissions 
   * @return transactionRoutingInstanceRecord
  **/

  public Object getTransactionRoutingInstanceRecord() {
    return transactionRoutingInstanceRecord;
  }

  public void setTransactionRoutingInstanceRecord(Object transactionRoutingInstanceRecord) {
    this.transactionRoutingInstanceRecord = transactionRoutingInstanceRecord;
  }


}

