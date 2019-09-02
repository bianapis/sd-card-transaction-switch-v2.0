package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionUpdateOutputModel
 */
public class CRCardTransactionSwitchOperatingSessionUpdateOutputModel   {
  private CRCardTransactionSwitchOperatingSessionUpdateInputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private String cardTransactionSwitchOperatingSessionUpdateActionTaskReference = null;

  private Object cardTransactionSwitchOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cardTransactionSwitchOperatingSessionUpdateActionTaskReference
  **/

  public String getCardTransactionSwitchOperatingSessionUpdateActionTaskReference() {
    return cardTransactionSwitchOperatingSessionUpdateActionTaskReference;
  }

  public void setCardTransactionSwitchOperatingSessionUpdateActionTaskReference(String cardTransactionSwitchOperatingSessionUpdateActionTaskReference) {
    this.cardTransactionSwitchOperatingSessionUpdateActionTaskReference = cardTransactionSwitchOperatingSessionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

