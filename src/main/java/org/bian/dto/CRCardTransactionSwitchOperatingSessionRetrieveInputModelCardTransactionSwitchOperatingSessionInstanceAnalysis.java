package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceAnalysis   {
  private String cardTransactionSwitchOperatingSessionInstanceAnalysisReference = null;

  private String cardTransactionSwitchOperatingSessionInstanceAnalysisReportType = null;

  private String cardTransactionSwitchOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysisReference
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceAnalysisReference() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysisReference;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysisReference(String cardTransactionSwitchOperatingSessionInstanceAnalysisReference) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysisReference = cardTransactionSwitchOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardTransactionSwitchOperatingSessionInstanceAnalysisParameters
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceAnalysisParameters() {
    return cardTransactionSwitchOperatingSessionInstanceAnalysisParameters;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceAnalysisParameters(String cardTransactionSwitchOperatingSessionInstanceAnalysisParameters) {
    this.cardTransactionSwitchOperatingSessionInstanceAnalysisParameters = cardTransactionSwitchOperatingSessionInstanceAnalysisParameters;
  }


}

