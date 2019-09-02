package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceReportRecord   {
  private String cardTransactionSwitchOperatingSessionInstanceReportData = null;

  private String cardTransactionSwitchOperatingSessionInstanceReportType = null;

  private Object cardTransactionSwitchOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardTransactionSwitchOperatingSessionInstanceReportData
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReportData() {
    return cardTransactionSwitchOperatingSessionInstanceReportData;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportData(String cardTransactionSwitchOperatingSessionInstanceReportData) {
    this.cardTransactionSwitchOperatingSessionInstanceReportData = cardTransactionSwitchOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardTransactionSwitchOperatingSessionInstanceReportType
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReportType() {
    return cardTransactionSwitchOperatingSessionInstanceReportType;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportType(String cardTransactionSwitchOperatingSessionInstanceReportType) {
    this.cardTransactionSwitchOperatingSessionInstanceReportType = cardTransactionSwitchOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardTransactionSwitchOperatingSessionInstanceReport
  **/

  public Object getCardTransactionSwitchOperatingSessionInstanceReport() {
    return cardTransactionSwitchOperatingSessionInstanceReport;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReport(Object cardTransactionSwitchOperatingSessionInstanceReport) {
    this.cardTransactionSwitchOperatingSessionInstanceReport = cardTransactionSwitchOperatingSessionInstanceReport;
  }


}

