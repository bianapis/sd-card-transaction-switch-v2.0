package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord
 */
public class CRCardTransactionSwitchOperatingSessionRetrieveInputModelCardTransactionSwitchOperatingSessionInstanceReportRecord   {
  private String cardTransactionSwitchOperatingSessionInstanceReportReference = null;

  private String cardTransactionSwitchOperatingSessionInstanceReportType = null;

  private String cardTransactionSwitchOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardTransactionSwitchOperatingSessionInstanceReportReference
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReportReference() {
    return cardTransactionSwitchOperatingSessionInstanceReportReference;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportReference(String cardTransactionSwitchOperatingSessionInstanceReportReference) {
    this.cardTransactionSwitchOperatingSessionInstanceReportReference = cardTransactionSwitchOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardTransactionSwitchOperatingSessionInstanceReportParameters
  **/

  public String getCardTransactionSwitchOperatingSessionInstanceReportParameters() {
    return cardTransactionSwitchOperatingSessionInstanceReportParameters;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceReportParameters(String cardTransactionSwitchOperatingSessionInstanceReportParameters) {
    this.cardTransactionSwitchOperatingSessionInstanceReportParameters = cardTransactionSwitchOperatingSessionInstanceReportParameters;
  }


}

