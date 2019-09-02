package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveInputModel
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveInputModel   {
  private Object cardTransactionSwitchOperatingSessionRetrieveActionTaskRecord = null;

  private String cardTransactionSwitchOperatingSessionRetrieveActionRequest = null;

  private CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord cardTransactionSwitchOperatingSessionInstanceReportRecord = null;

  private CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis cardTransactionSwitchOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardTransactionSwitchOperatingSessionRetrieveActionRequest
  **/

  public String getCardTransactionSwitchOperatingSessionRetrieveActionRequest() {
    return cardTransactionSwitchOperatingSessionRetrieveActionRequest;
  }

  public void setCardTransactionSwitchOperatingSessionRetrieveActionRequest(String cardTransactionSwitchOperatingSessionRetrieveActionRequest) {
    this.cardTransactionSwitchOperatingSessionRetrieveActionRequest = cardTransactionSwitchOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceReportRecord
   * @return cardTransactionSwitchOperatingSessionInstanceReportRecord
  **/

  public CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord getCardTransactionSwitchOperatingSessionInstanceReportRecord() {
    return cardTransactionSwitchOperatingSessionInstanceReportRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportRecord(CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord cardTransactionSwitchOperatingSessionInstanceReportRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceReportRecord = cardTransactionSwitchOperatingSessionInstanceReportRecord;
  }


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceAnalysis
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysis
  **/

  public CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis getCardTransactionSwitchOperatingSessionInstanceAnalysis() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysis;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysis(CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis cardTransactionSwitchOperatingSessionInstanceAnalysis) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysis = cardTransactionSwitchOperatingSessionInstanceAnalysis;
  }


}

