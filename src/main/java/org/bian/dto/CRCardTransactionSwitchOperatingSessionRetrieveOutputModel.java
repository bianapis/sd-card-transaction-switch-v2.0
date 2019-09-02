package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveOutputModel
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveOutputModel   {
  private CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private String cardTransactionSwitchOperatingSessionRetrieveActionTaskReference = null;

  private Object cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord = null;

  private String cardTransactionSwitchOperatingSessionRetrieveActionResponse = null;

  private CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord cardTransactionSwitchOperatingSessionInstanceReportRecord = null;

  private CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis cardTransactionSwitchOperatingSessionInstanceAnalysis = null;


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction Switch Operating Session instance retrieve service call 
   * @return cardTransactionSwitchOperatingSessionRetrieveActionTaskReference
  **/

  public String getCardTransactionSwitchOperatingSessionRetrieveActionTaskReference() {
    return cardTransactionSwitchOperatingSessionRetrieveActionTaskReference;
  }

  public void setCardTransactionSwitchOperatingSessionRetrieveActionTaskReference(String cardTransactionSwitchOperatingSessionRetrieveActionTaskReference) {
    this.cardTransactionSwitchOperatingSessionRetrieveActionTaskReference = cardTransactionSwitchOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getCardTransactionSwitchOperatingSessionRetrieveActionTaskRecord() {
    return cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord;
  }

  public void setCardTransactionSwitchOperatingSessionRetrieveActionTaskRecord(Object cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord) {
    this.cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord = cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardTransactionSwitchOperatingSessionRetrieveActionResponse
  **/

  public String getCardTransactionSwitchOperatingSessionRetrieveActionResponse() {
    return cardTransactionSwitchOperatingSessionRetrieveActionResponse;
  }

  public void setCardTransactionSwitchOperatingSessionRetrieveActionResponse(String cardTransactionSwitchOperatingSessionRetrieveActionResponse) {
    this.cardTransactionSwitchOperatingSessionRetrieveActionResponse = cardTransactionSwitchOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceReportRecord
   * @return cardTransactionSwitchOperatingSessionInstanceReportRecord
  **/

  public CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord getCardTransactionSwitchOperatingSessionInstanceReportRecord() {
    return cardTransactionSwitchOperatingSessionInstanceReportRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportRecord(CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord cardTransactionSwitchOperatingSessionInstanceReportRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceReportRecord = cardTransactionSwitchOperatingSessionInstanceReportRecord;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceAnalysis
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysis
  **/

  public CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis getCardTransactionSwitchOperatingSessionInstanceAnalysis() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysis;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysis(CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis cardTransactionSwitchOperatingSessionInstanceAnalysis) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysis = cardTransactionSwitchOperatingSessionInstanceAnalysis;
  }


}

