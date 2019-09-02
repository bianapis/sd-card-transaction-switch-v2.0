package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceAnalysis   {
  private String cardTransactionSwitchOperatingSessionInstanceAnalysisData = null;

  private String cardTransactionSwitchOperatingSessionInstanceAnalysisReportType = null;

  private Object cardTransactionSwitchOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysisData
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceAnalysisData() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysisData;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysisData(String cardTransactionSwitchOperatingSessionInstanceAnalysisData) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysisData = cardTransactionSwitchOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysisReportType
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceAnalysisReportType() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysisReportType;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysisReportType(String cardTransactionSwitchOperatingSessionInstanceAnalysisReportType) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysisReportType = cardTransactionSwitchOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysisReport
  **/

  public Object getCardTransactionSwitchOperatingSessionInstanceAnalysisReport() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysisReport;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysisReport(Object cardTransactionSwitchOperatingSessionInstanceAnalysisReport) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysisReport = cardTransactionSwitchOperatingSessionInstanceAnalysisReport;
  }


}

