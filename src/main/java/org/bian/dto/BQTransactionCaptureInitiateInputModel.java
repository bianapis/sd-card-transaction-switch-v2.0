package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;
import org.bian.dto.BQTransactionCaptureInitiateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureInitiateInputModel
 */
public class BQTransactionCaptureInitiateInputModel   {
  private BQTransactionCaptureInitiateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private String cardTransactionSwitchOperatingSessionInstanceReference = null;

  private Object transactionCaptureInitiateActionRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Card Transaction Switch Operating Session instance 
   * @return cardTransactionSwitchOperatingSessionInstanceReference
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReference() {
    return cardTransactionSwitchOperatingSessionInstanceReference;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReference(String cardTransactionSwitchOperatingSessionInstanceReference) {
    this.cardTransactionSwitchOperatingSessionInstanceReference = cardTransactionSwitchOperatingSessionInstanceReference;
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

